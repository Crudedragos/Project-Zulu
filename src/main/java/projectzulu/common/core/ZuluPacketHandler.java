package projectzulu.common.core;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import projectzulu.common.blocks.tombstone.TileEntityTombstone;
import projectzulu.common.mobs.entity.EntityGenericTameable;
import projectzulu.common.temperature.TemperatureTicker;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ZuluPacketHandler implements IPacketHandler {

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {

        if (packet.channel.equals(DefaultProps.defaultChannel)) {
            DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.data));
            try {
                PacketIDs packetID = PacketIDs.getPacketIDbyIndex(data.readInt());
                PacketManager packetManager = packetID.createPacketManager();
                if (packetManager != null) {
                    if (!packetManager
                            .processPacket(new DataInputStream(new ByteArrayInputStream(packet.data)), player)) {
                        ProjectZuluLog.warning("Failed to Process Packet %s", packetManager.getClass().getSimpleName());
                    }
                } else {
                    /* Legacy Packets */
                    switch (packetID) {
                    /* PacketID: Unknown Packet, send a Warning */
                    case unknown: {
                        ProjectZuluLog.warning("Unknown packet being Sent through Channel_Zulu", packet.getClass()
                                .getSimpleName());
                    }
                        break;
                    /* PacketID: Temperature Packet */
                    case temperature: {
                        EntityPlayer sender = (EntityPlayer) player;
                        TemperatureTicker.updateTemperatureFromPacket(data, sender);
                        break;
                    }

                    /* PacketID: Update Tile Entity Text [C->S] */
                    case tileEntityText: {
                        World worldObj = ((EntityPlayer) player).worldObj;
                        /* Unpack Some Data */
                        int tileLocationX = data.readInt();
                        int tileLocationY = data.readInt();
                        int tileLocationZ = data.readInt();

                        /* Look For TileEntity, then Give it Text */
                        if (worldObj.getBlockTileEntity(tileLocationX, tileLocationY, tileLocationZ) instanceof TileEntityTombstone) {
                            TileEntityTombstone tile = (TileEntityTombstone) worldObj.getBlockTileEntity(tileLocationX,
                                    tileLocationY, tileLocationZ);
                            int linesOfText = data.readInt();
                            for (int i = 0; i < linesOfText; i++) {
                                tile.signText[i] = data.readUTF();
                            }
                            worldObj.markBlockForUpdate(tileLocationX, tileLocationY, tileLocationZ);
                        }
                        break;
                    }
                    /* Packet: Sync Entity Name to Server from GUI */
                    case entityNameSync: {
                        World worldObj = ((EntityPlayer) player).worldObj;
                        int entityToBeNamedID = data.readInt();
                        String entityName = data.readUTF();
                        Entity entity = worldObj.getEntityByID(entityToBeNamedID);
                        if (entity instanceof EntityGenericTameable) {
                            ((EntityGenericTameable) entity).setUsername(entityName);
                        }
                    }
                        break;
                    /* Packet: Perform EntityGenericTameable Taming Effect */
                    case tameParticleEffect: {
                        World worldObj = ((EntityPlayer) player).worldObj;
                        int entityToBeNamedID = data.readInt();
                        Boolean tameingSuccess = data.readBoolean();
                        Entity entity = worldObj.getEntityByID(entityToBeNamedID);
                        if (entity instanceof EntityGenericTameable) {
                            ((EntityGenericTameable) entity).playTameEffect(tameingSuccess);
                        }
                    }
                        break;
                    default:
                        break;
                    }

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }

}