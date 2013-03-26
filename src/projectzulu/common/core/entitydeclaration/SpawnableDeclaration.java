package projectzulu.common.core.entitydeclaration;

import java.util.ArrayList;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import projectzulu.common.api.CustomMobData;
import projectzulu.common.core.ConfigHelper;
import projectzulu.common.core.ProjectZuluLog;
import cpw.mods.fml.common.registry.EntityRegistry;

public abstract class SpawnableDeclaration extends EggableDeclaration{

	protected int spawnRate;
	protected int secondarySpawnRate;
	protected int minInChunk;
	protected int maxInChunk;
	protected EnumCreatureType spawnType;

	protected ArrayList<String> defaultBiomesToSpawn = new ArrayList<String>();	
	ArrayList<BiomeGenBase> biomesToSpawn = new ArrayList();
	
	protected SpawnableDeclaration(String mobName, Class mobClass, EnumCreatureType creatureType) {
		super(mobName, mobClass, creatureType);
		spawnType = creatureType;
	}
	
	protected void setSpawnProperties(int spawnRate, int secondarySpawnRate, int minInChunk, int maxInChunk){
		this.spawnRate = spawnRate;
		this.secondarySpawnRate = secondarySpawnRate;
		this.minInChunk = minInChunk;
		this.maxInChunk = maxInChunk;
	}
	
	@Override
	public void loadCreaturesFromConfig(Configuration config) {
		super.loadCreaturesFromConfig(config);
		spawnRate = config.get("MOB CONTROLS."+mobName, mobName.toLowerCase()+" SpawnRate", spawnRate).getInt(spawnRate);
		secondarySpawnRate = config.get("MOB CONTROLS."+mobName, mobName.toLowerCase()+" SecondarySpawnRate",secondarySpawnRate).getInt(secondarySpawnRate);
		minInChunk = config.get("MOB CONTROLS."+mobName, mobName.toLowerCase()+" minInChunk", minInChunk).getInt(minInChunk);
		maxInChunk = config.get("MOB CONTROLS."+mobName, mobName.toLowerCase()+" maxInChunk", maxInChunk).getInt(maxInChunk);
		spawnType = ConfigHelper.configGetCreatureType(config, "MOB CONTROLS."+mobName, "Spawn List Type", spawnType);
	}
	
	@Override
	public void loadBiomesFromConfig(Configuration config) {
		for (int i = 0; i < BiomeGenBase.biomeList.length; i++) {
			if(BiomeGenBase.biomeList[i] == null){
				continue;
			}
			if(config.get("Mob Spawn Biome Controls."+mobName, mobName.toLowerCase()+" in "+BiomeGenBase.biomeList[i].biomeName, defaultBiomesToSpawn.contains(BiomeGenBase.biomeList[i].biomeName)).getBoolean(false)){
				biomesToSpawn.add(BiomeGenBase.biomeList[i]);
			}
		}
	}
	
	/* Create loadCustomMobData() method which calls outputData to List. loadCustom contains calls that are the same for all creatures */
	@Override
	public void outputDataToList(Configuration config, CustomMobData customMobData){
	    super.outputDataToList(config, customMobData);
	    customMobData.secondarySpawnRate = secondarySpawnRate;
	    customMobData.spawnType = spawnType;
	}
	
	@Override
	public void addSpawn() {
		if(spawnType == null){
			return;
		}
		
		for (int i = 0; i < biomesToSpawn.size(); i++){
			EntityRegistry.addSpawn(mobClass, spawnRate, minInChunk, maxInChunk, spawnType, biomesToSpawn.get(i));
			if(reportSpawningInLog){
				ProjectZuluLog.info("Registering %s to biome %s at rates of %s,%s,%s",
						mobClass.getSimpleName(), biomesToSpawn.get(i).biomeName, spawnRate, minInChunk, maxInChunk);
			}
		}
	}
}