package projectzulu.common.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import projectzulu.common.mobs.entity.EntityCrocodile;

public class ModelCrocodile extends ModelBase
{
	//fields
	ModelRenderer MOUTHBOTROT;
	ModelRenderer MOUTHTOPROT;
	ModelRenderer BODY1ROT;
	private ModelRenderer	EYEBALLLEFROT;
	private ModelRenderer	EYEBALLRIGROT;
	private ModelRenderer	BODY2ROT;
	private ModelRenderer	LEG2TOPROT;
	private ModelRenderer	LEG2BOTROT;
	private ModelRenderer	LEG1TOPROT;
	private ModelRenderer	LEG1BOTROT;
	private ModelRenderer	BODY3ROT;
	private ModelRenderer	BODY4ROT;
	private ModelRenderer	BODY5ROT;
	private ModelRenderer	BODY6ROT;
	private ModelRenderer	TAIL1ROT;
	private ModelRenderer	TAIL2ROT;
	private ModelRenderer	TAIL3ROT;
	private ModelRenderer	TAILROT4;
	private ModelRenderer	TAILROT5;
	private ModelRenderer	TAILROT6;
	private ModelRenderer	TAILROT7;
	private ModelRenderer	TAILROT8;
	private ModelRenderer	TAILROT9;
	private ModelRenderer	LEG4TOPROT;
	private ModelRenderer	LEG4BOTROT;
	private ModelRenderer	LEG3TOPROT;
	private ModelRenderer	LEG3BOTROT;

	public ModelCrocodile()
	{
		textureWidth = 128;
		textureHeight = 64;
		setTextureOffset("MOUTHBOTROT.headbot1", 98, 0);
		setTextureOffset("MOUTHBOTROT.headbot4", 109, 18);
		setTextureOffset("MOUTHBOTROT.headbot2", 107, 10);
		setTextureOffset("MOUTHBOTROT.headbot3", 115, 18);
		setTextureOffset("MOUTHBOTROT.teethbot6", 24, 0);
		setTextureOffset("MOUTHBOTROT.teethbot7", 24, 0);
		setTextureOffset("MOUTHBOTROT.teethbot10", 24, 0);
		setTextureOffset("MOUTHBOTROT.teethbot8", 24, 0);
		setTextureOffset("MOUTHBOTROT.teethbot1", 24, 0);
		setTextureOffset("MOUTHBOTROT.teethbot2", 24, 0);
		setTextureOffset("MOUTHBOTROT.teethbot3", 24, 0);
		setTextureOffset("MOUTHBOTROT.teethbot5", 24, 0);
		setTextureOffset("MOUTHTOPROT.headtop1", 98, 23);
		setTextureOffset("MOUTHTOPROT.headtop2", 107, 34);
		setTextureOffset("MOUTHTOPROT.headtop3", 113, 42);
		setTextureOffset("MOUTHTOPROT.headtopdecor9", 94, 23);
		setTextureOffset("MOUTHTOPROT.headtop4", 105, 42);
		setTextureOffset("MOUTHTOPROT.teethtop2", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop6", 24, 0);
		setTextureOffset("MOUTHTOPROT.teethtop3", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop4", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop5", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop1", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop1", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop2", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop3", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop4", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop5", 24, 2);
		setTextureOffset("MOUTHTOPROT.teethtop6", 24, 0);
		setTextureOffset("EYEBALLLEFROT.headtopdecor1", 98, 19);
		setTextureOffset("EYEBALLLEFROT.headtopdecor2", 98, 21);
		setTextureOffset("EYEBALLLEFROT.headtopdecor4", 98, 21);
		setTextureOffset("EYEBALLLEFROT.headtopdecor3", 98, 21);
		setTextureOffset("EYEBALLRIGROT.headtopdecor5", 98, 19);
		setTextureOffset("EYEBALLRIGROT.headtopdecor6", 98, 21);
		setTextureOffset("EYEBALLRIGROT.headtopdecor7", 98, 21);
		setTextureOffset("EYEBALLRIGROT.headtopdecor8", 98, 21);
		setTextureOffset("BODY1ROT.Body1", 62, 0);
		setTextureOffset("BODY1ROT.bodydeclef1", 0, 0);
		setTextureOffset("BODY1ROT.bodydecinlef1", 0, 0);
		setTextureOffset("BODY1ROT.bodydecinrig1", 0, 0);
		setTextureOffset("BODY1ROT.bodydecrig1", 0, 0);
		setTextureOffset("BODY1ROT.Shape1", 0, 0);
		setTextureOffset("BODY1ROT.bodydeclef2", 0, 0);
		setTextureOffset("BODY1ROT.bodydecinlef2", 0, 0);
		setTextureOffset("BODY1ROT.bodydecrig2", 0, 0);
		setTextureOffset("BODY1ROT.bodydecinrig2", 0, 0);
		setTextureOffset("BODY2ROT.Body2", 62, 0);
		setTextureOffset("BODY2ROT.bodydeclef3", 0, 0);
		setTextureOffset("BODY2ROT.bodydecinlef3", 0, 0);
		setTextureOffset("BODY2ROT.bodydecrig3", 0, 0);
		setTextureOffset("BODY2ROT.bodydecinrig3", 0, 0);
		setTextureOffset("BODY2ROT.bodydeclef4", 0, 0);
		setTextureOffset("BODY2ROT.bodydecinlef4", 0, 0);
		setTextureOffset("BODY2ROT.bodydecinrig4", 0, 0);
		setTextureOffset("BODY2ROT.bodydecrig4", 0, 0);
		setTextureOffset("LEG2TOPROT.leg2top", 20, 12);
		setTextureOffset("LEG2TOPROT.leg2deco", 16, 8);
		setTextureOffset("LEG2BOTROT.leg2bot", 16, 20);
		setTextureOffset("LEG1TOPROT.leg1top", 0, 12);
		setTextureOffset("LEG1TOPROT.leg1deco", 0, 8);
		setTextureOffset("LEG1BOTROT.leg1bot", 0, 20);
		setTextureOffset("BODY3ROT.Body3", 62, 0);
		setTextureOffset("BODY3ROT.bodydeclef5", 0, 0);
		setTextureOffset("BODY3ROT.bodydecrig5", 0, 0);
		setTextureOffset("BODY3ROT.bodydecinrig5", 0, 0);
		setTextureOffset("BODY3ROT.bodydecinlef5", 0, 0);
		setTextureOffset("BODY3ROT.bodydeclef6", 0, 0);
		setTextureOffset("BODY3ROT.bodydecrig6", 0, 0);
		setTextureOffset("BODY3ROT.bodydecinrig6", 0, 0);
		setTextureOffset("BODY3ROT.bodydecinlef6", 0, 0);
		setTextureOffset("BODY4ROT.Body4", 62, 0);
		setTextureOffset("BODY4ROT.bodydecinrig7", 0, 0);
		setTextureOffset("BODY4ROT.bodydecinlef7", 0, 0);
		setTextureOffset("BODY4ROT.bodydecrig7", 0, 0);
		setTextureOffset("BODY4ROT.bodydeclef7", 0, 0);
		setTextureOffset("BODY4ROT.bodydecinrig8", 0, 0);
		setTextureOffset("BODY4ROT.bodydecinlef8", 0, 0);
		setTextureOffset("BODY4ROT.bodydeclef8", 0, 0);
		setTextureOffset("BODY4ROT.bodydecrig8", 0, 0);
		setTextureOffset("BODY5ROT.Body5", 62, 0);
		setTextureOffset("BODY5ROT.bodydecinrig9", 0, 0);
		setTextureOffset("BODY5ROT.bodydecinlef9", 0, 0);
		setTextureOffset("BODY5ROT.bodydecrig9", 0, 0);
		setTextureOffset("BODY5ROT.bodydeclef9", 0, 0);
		setTextureOffset("BODY5ROT.bodydecinrig10", 0, 0);
		setTextureOffset("BODY5ROT.bodydecinlef10", 0, 0);
		setTextureOffset("BODY5ROT.bodydeclef10", 0, 0);
		setTextureOffset("BODY5ROT.bodydecrig10", 0, 0);
		setTextureOffset("BODY6ROT.Body6", 62, 0);
		setTextureOffset("BODY6ROT.bodydecinrig9", 0, 0);
		setTextureOffset("BODY6ROT.bodydecinlef9", 0, 0);
		setTextureOffset("BODY6ROT.bodydecrig9", 0, 0);
		setTextureOffset("BODY6ROT.bodydeclef9", 0, 0);
		setTextureOffset("BODY6ROT.bodydecinrig10", 0, 0);
		setTextureOffset("BODY6ROT.bodydecinlef10", 0, 0);
		setTextureOffset("BODY6ROT.bodydeclef10", 0, 0);
		setTextureOffset("BODY6ROT.bodydecrig10", 0, 0);
		setTextureOffset("TAIL1ROT.tail1", 62, 12);
		setTextureOffset("TAIL1ROT.bodydecinlef11", 0, 0);
		setTextureOffset("TAIL1ROT.bodydecinrig11", 0, 0);
		setTextureOffset("TAIL1ROT.bodydeclef11", 0, 0);
		setTextureOffset("TAIL1ROT.bodydecrig11", 0, 0);
		setTextureOffset("TAIL2ROT.tail2", 62, 22);
		setTextureOffset("TAIL2ROT.bodydeclef12", 0, 0);
		setTextureOffset("TAIL2ROT.bodydecrig12", 0, 0);
		setTextureOffset("TAIL2ROT.bodydecinrig12", 0, 0);
		setTextureOffset("TAIL2ROT.bodydecinlef12", 0, 0);
		setTextureOffset("TAIL3ROT.tail3", 62, 31);
		setTextureOffset("TAIL3ROT.bodydecrig13", 0, 0);
		setTextureOffset("TAIL3ROT.bodydecinrig13", 0, 0);
		setTextureOffset("TAIL3ROT.bodydecinlef13", 0, 0);
		setTextureOffset("TAIL3ROT.bodydeclef13", 0, 0);
		setTextureOffset("TAILROT4.tail4", 62, 40);
		setTextureOffset("TAILROT4.bodydecrig14", 0, 0);
		setTextureOffset("TAILROT4.bodydecinlef14", 0, 0);
		setTextureOffset("TAILROT4.bodydeclef14", 0, 0);
		setTextureOffset("TAILROT5.tail5", 62, 48);
		setTextureOffset("TAILROT5.bodydeclef15", 0, 0);
		setTextureOffset("TAILROT5.bodydecrig16", 0, 0);
		setTextureOffset("TAILROT5.bodydecrig15", 0, 0);
		setTextureOffset("TAILROT5.bodydeclef16", 0, 0);
		setTextureOffset("TAILROT6.tail6", 84, 49);
		setTextureOffset("TAILROT6.bodydeclef17", 0, 0);
		setTextureOffset("TAILROT6.bodydecrig17", 0, 0);
		setTextureOffset("TAILROT6.bodydecrig18", 0, 0);
		setTextureOffset("TAILROT6.bodydeclef18", 0, 0);
		setTextureOffset("TAILROT7.tail7", 90, 44);
		setTextureOffset("TAILROT7.bodydecrig19", 0, 0);
		setTextureOffset("TAILROT7.bodydeclef19", 0, 0);
		setTextureOffset("TAILROT8.tail8", 94, 40);
		setTextureOffset("TAILROT8.bodydecrig20", 0, 0);
		setTextureOffset("TAILROT8.bodydeclef20", 0, 0);
		setTextureOffset("TAILROT9.tail9", 98, 37);
		setTextureOffset("LEG4TOPROT.leg4top", 20, 12);
		setTextureOffset("LEG4TOPROT.leg4deco", 16, 8);
		setTextureOffset("LEG4BOTROT.leg4bot", 16, 20);
		setTextureOffset("LEG3TOPROT.leg3top", 0, 12);
		setTextureOffset("LEG3TOPROT.leg3deco", 0, 8);
		setTextureOffset("LEG3BOTROT.leg3bot", 0, 20);

		MOUTHBOTROT = new ModelRenderer(this, "MOUTHBOTROT");
		MOUTHBOTROT.setRotationPoint(0F, 18F, -7F);
		setRotation(MOUTHBOTROT, 0F, 0F, 0F);
		MOUTHBOTROT.mirror = true;
		MOUTHBOTROT.addBox("headbot1", -4F, 0F, -7F, 8, 3, 7);
		MOUTHBOTROT.addBox("headbot4", -1F, 0F, -16F, 2, 1, 1);
		MOUTHBOTROT.addBox("headbot2", -3F, 0F, -12F, 6, 3, 5);
		MOUTHBOTROT.addBox("headbot3", -2F, 0F, -15F, 4, 2, 3);
		MOUTHBOTROT.addBox("teethbot6", 3F, -1F, -5F, 1, 1, 1);
		MOUTHBOTROT.addBox("teethbot7", 2F, -1F, -8F, 1, 1, 1);
		MOUTHBOTROT.addBox("teethbot10", 1F, -1F, -14F, 1, 1, 1);
		MOUTHBOTROT.addBox("teethbot8", 2F, -1F, -10F, 1, 1, 1);
		MOUTHBOTROT.addBox("teethbot1", -4F, -1F, -5F, 1, 1, 1);
		MOUTHBOTROT.addBox("teethbot2", -3F, -1F, -8F, 1, 1, 1);
		MOUTHBOTROT.addBox("teethbot3", -3F, -1F, -10F, 1, 1, 1);
		MOUTHBOTROT.addBox("teethbot5", -2F, -1F, -14F, 1, 1, 1);
		MOUTHTOPROT = new ModelRenderer(this, "MOUTHTOPROT");
		MOUTHTOPROT.setRotationPoint(0F, 18F, -7F);
		setRotation(MOUTHTOPROT, 0F, 0F, 0F);
		MOUTHTOPROT.mirror = true;
		MOUTHTOPROT.addBox("headtop1", -4.5F, -4F, -7F, 9, 4, 7);
		MOUTHTOPROT.addBox("headtop2", -3.5F, -3F, -12F, 7, 3, 5);
		MOUTHTOPROT.addBox("headtop3", -2.5F, -2F, -15F, 5, 2, 3);
		MOUTHTOPROT.addBox("headtopdecor9", -1.5F, -5F, -3.5F, 3, 1, 2);
		MOUTHTOPROT.addBox("headtop4", -1.5F, -1F, -16F, 3, 1, 1);
		MOUTHTOPROT.addBox("teethtop2", -4.5F, 0F, -4F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop6", -2.5F, 0F, -14F, 1, 1, 1);
		MOUTHTOPROT.addBox("teethtop3", -4.5F, 0F, -6F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop4", -3.5F, 0F, -9F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop5", -3.5F, 0F, -11F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop1", -4.5F, 0F, -2F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop1", 3.5F, 0F, -2F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop2", 3.5F, 0F, -4F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop3", 3.5F, 0F, -6F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop4", 2.5F, 0F, -9F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop5", 2.5F, 0F, -11F, 1, 2, 1);
		MOUTHTOPROT.addBox("teethtop6", 1.5F, 0F, -14F, 1, 1, 1);
		EYEBALLLEFROT = new ModelRenderer(this, "EYEBALLLEFROT");
		EYEBALLLEFROT.setRotationPoint(-2.5F, -4.5F, -2.5F);
		setRotation(EYEBALLLEFROT, 0F, 0F, 0F);
		EYEBALLLEFROT.mirror = true;
		EYEBALLLEFROT.addBox("headtopdecor1", -1.5F, -0.5F, -0.5F, 2, 1, 1);
		EYEBALLLEFROT.addBox("headtopdecor2", -1F, -0.5F, 0.5F, 2, 1, 1);
		EYEBALLLEFROT.addBox("headtopdecor4", -1F, -1.5F, -0.5F, 2, 1, 1);
		EYEBALLLEFROT.addBox("headtopdecor3", -1F, -0.5F, -1.5F, 2, 1, 1);
		MOUTHTOPROT.addChild(EYEBALLLEFROT);
		EYEBALLRIGROT = new ModelRenderer(this, "EYEBALLRIGROT");
		EYEBALLRIGROT.setRotationPoint(2.5F, -4.5F, -2.5F);
		setRotation(EYEBALLRIGROT, 0F, 0F, 0F);
		EYEBALLRIGROT.mirror = true;
		EYEBALLRIGROT.addBox("headtopdecor5", -0.5F, -0.5F, -0.5F, 2, 1, 1);
		EYEBALLRIGROT.addBox("headtopdecor6", -1F, -0.5F, -1.5F, 2, 1, 1);
		EYEBALLRIGROT.addBox("headtopdecor7", -1F, -0.5F, 0.5F, 2, 1, 1);
		EYEBALLRIGROT.addBox("headtopdecor8", -1F, -1.5F, -0.5F, 2, 1, 1);
		MOUTHTOPROT.addChild(EYEBALLRIGROT);
		BODY1ROT = new ModelRenderer(this, "BODY1ROT");
		BODY1ROT.setRotationPoint(0F, 17F, -7F);
		setRotation(BODY1ROT, 0F, 0F, 0F);
		BODY1ROT.mirror = true;
		BODY1ROT.addBox("Body1", -7F, -4F, 0F, 14, 8, 4);
		BODY1ROT.addBox("bodydeclef1", -5.5F, -5F, 1F, 1, 1, 1);
		BODY1ROT.addBox("bodydecinlef1", -2F, -5F, 0.5F, 1, 1, 1);
		BODY1ROT.addBox("bodydecinrig1", 1F, -5F, 0.5F, 1, 1, 1);
		BODY1ROT.addBox("bodydecrig1", 4.5F, -5F, 1F, 1, 1, 1);
		BODY1ROT.addBox("Shape1", 0F, 0F, 0F, 1, 1, 1);
		BODY1ROT.addBox("bodydeclef2", -5.5F, -5F, 3F, 1, 1, 1);
		BODY1ROT.addBox("bodydecinlef2", -2F, -5F, 2.5F, 1, 1, 1);
		BODY1ROT.addBox("bodydecrig2", 4.5F, -5F, 3F, 1, 1, 1);
		BODY1ROT.addBox("bodydecinrig2", 1F, -5F, 2.5F, 1, 1, 1);
		BODY2ROT = new ModelRenderer(this, "BODY2ROT");
		BODY2ROT.setRotationPoint(0F, 0F, 4F);
		setRotation(BODY2ROT, 0F, 0F, 0F);
		BODY2ROT.mirror = true;
		BODY2ROT.addBox("Body2", -7F, -4F, 0F, 14, 8, 4);
		BODY2ROT.addBox("bodydeclef3", -5.5F, -5F, 1F, 1, 1, 1);
		BODY2ROT.addBox("bodydecinlef3", -2F, -5F, 0.5F, 1, 1, 1);
		BODY2ROT.addBox("bodydecrig3", 4.5F, -5F, 1F, 1, 1, 1);
		BODY2ROT.addBox("bodydecinrig3", 1F, -5F, 0.5F, 1, 1, 1);
		BODY2ROT.addBox("bodydeclef4", -5.5F, -5F, 3F, 1, 1, 1);
		BODY2ROT.addBox("bodydecinlef4", -2F, -5F, 2.5F, 1, 1, 1);
		BODY2ROT.addBox("bodydecinrig4", 1F, -5F, 2.5F, 1, 1, 1);
		BODY2ROT.addBox("bodydecrig4", 4.5F, -5F, 3F, 1, 1, 1);
		LEG2TOPROT = new ModelRenderer(this, "LEG2TOPROT");
		LEG2TOPROT.setRotationPoint(7F, 1F, 2F);
		setRotation(LEG2TOPROT, 0F, 0F, 0F);
		LEG2TOPROT.mirror = true;
		LEG2TOPROT.addBox("leg2top", 0F, -2F, -2F, 6, 4, 4);
		LEG2TOPROT.addBox("leg2deco", 0F, -3F, -1.5F, 5, 1, 3);
		LEG2BOTROT = new ModelRenderer(this, "LEG2BOTROT");
		LEG2BOTROT.setRotationPoint(4F, 2F, 0F);
		setRotation(LEG2BOTROT, 0F, 0F, 0F);
		LEG2BOTROT.mirror = true;
		LEG2BOTROT.addBox("leg2bot", -2F, 0F, -2F, 4, 4, 4);
		LEG2TOPROT.addChild(LEG2BOTROT);
		BODY2ROT.addChild(LEG2TOPROT);
		LEG1TOPROT = new ModelRenderer(this, "LEG1TOPROT");
		LEG1TOPROT.setRotationPoint(-8F, 1F, 2F);
		setRotation(LEG1TOPROT, 0F, 0F, 0F);
		LEG1TOPROT.mirror = true;
		LEG1TOPROT.addBox("leg1top", -5F, -2F, -2F, 6, 4, 4);
		LEG1TOPROT.addBox("leg1deco", -4F, -3F, -1.5F, 5, 1, 3);
		LEG1BOTROT = new ModelRenderer(this, "LEG1BOTROT");
		LEG1BOTROT.setRotationPoint(-3F, 2F, 0F);
		setRotation(LEG1BOTROT, 0F, 0F, 0F);
		LEG1BOTROT.mirror = true;
		LEG1BOTROT.addBox("leg1bot", -2F, 0F, -2F, 4, 4, 4);
		LEG1TOPROT.addChild(LEG1BOTROT);
		BODY2ROT.addChild(LEG1TOPROT);
		BODY3ROT = new ModelRenderer(this, "BODY3ROT");
		BODY3ROT.setRotationPoint(0F, 0F, 4F);
		setRotation(BODY3ROT, 0F, 0F, 0F);
		BODY3ROT.mirror = true;
		BODY3ROT.addBox("Body3", -7F, -4F, 0F, 14, 8, 4);
		BODY3ROT.addBox("bodydeclef5", -5.5F, -5F, 1F, 1, 1, 1);
		BODY3ROT.addBox("bodydecrig5", 4.5F, -5F, 1F, 1, 1, 1);
		BODY3ROT.addBox("bodydecinrig5", 1F, -5F, 0.5F, 1, 1, 1);
		BODY3ROT.addBox("bodydecinlef5", -2F, -5F, 0.5F, 1, 1, 1);
		BODY3ROT.addBox("bodydeclef6", -5.5F, -5F, 3F, 1, 1, 1);
		BODY3ROT.addBox("bodydecrig6", 4.5F, -5F, 3F, 1, 1, 1);
		BODY3ROT.addBox("bodydecinrig6", 1F, -5F, 2.5F, 1, 1, 1);
		BODY3ROT.addBox("bodydecinlef6", -2F, -5F, 2.5F, 1, 1, 1);
		BODY4ROT = new ModelRenderer(this, "BODY4ROT");
		BODY4ROT.setRotationPoint(0F, 0F, 4F);
		setRotation(BODY4ROT, 0F, 0F, 0F);
		BODY4ROT.mirror = true;
		BODY4ROT.addBox("Body4", -7F, -4F, 0F, 14, 8, 4);
		BODY4ROT.addBox("bodydecinrig7", 1F, -5F, 0.5F, 1, 1, 1);
		BODY4ROT.addBox("bodydecinlef7", -2F, -5F, 0.5F, 1, 1, 1);
		BODY4ROT.addBox("bodydecrig7", 4.5F, -5F, 1F, 1, 1, 1);
		BODY4ROT.addBox("bodydeclef7", -5.5F, -5F, 1F, 1, 1, 1);
		BODY4ROT.addBox("bodydecinrig8", 1F, -5F, 2.5F, 1, 1, 1);
		BODY4ROT.addBox("bodydecinlef8", -2F, -5F, 2.5F, 1, 1, 1);
		BODY4ROT.addBox("bodydeclef8", -5.5F, -5F, 3F, 1, 1, 1);
		BODY4ROT.addBox("bodydecrig8", 4.5F, -5F, 3F, 1, 1, 1);
		BODY5ROT = new ModelRenderer(this, "BODY5ROT");
		BODY5ROT.setRotationPoint(0F, 0F, 4F);
		setRotation(BODY5ROT, 0F, 0F, 0F);
		BODY5ROT.mirror = true;
		BODY5ROT.addBox("Body5", -7F, -4F, 0F, 14, 8, 4);
		BODY5ROT.addBox("bodydecinrig9", 1F, -5F, 0.5F, 1, 1, 1);
		BODY5ROT.addBox("bodydecinlef9", -2F, -5F, 0.5F, 1, 1, 1);
		BODY5ROT.addBox("bodydecrig9", 4.5F, -5F, 1F, 1, 1, 1);
		BODY5ROT.addBox("bodydeclef9", -5.5F, -5F, 1F, 1, 1, 1);
		BODY5ROT.addBox("bodydecinrig10", 1F, -5F, 2.5F, 1, 1, 1);
		BODY5ROT.addBox("bodydecinlef10", -2F, -5F, 2.5F, 1, 1, 1);
		BODY5ROT.addBox("bodydeclef10", -5.5F, -5F, 3F, 1, 1, 1);
		BODY5ROT.addBox("bodydecrig10", 4.5F, -5F, 3F, 1, 1, 1);
		BODY6ROT = new ModelRenderer(this, "BODY6ROT");
		BODY6ROT.setRotationPoint(0F, 0F, 4F);
		setRotation(BODY6ROT, 0F, 0F, 0F);
		BODY6ROT.mirror = true;
		BODY6ROT.addBox("Body6", -7F, -4F, 0F, 14, 8, 4);
		BODY6ROT.addBox("bodydecinrig9", 1F, -5F, 0.5F, 1, 1, 1);
		BODY6ROT.addBox("bodydecinlef9", -2F, -5F, 0.5F, 1, 1, 1);
		BODY6ROT.addBox("bodydecrig9", 4.5F, -5F, 1F, 1, 1, 1);
		BODY6ROT.addBox("bodydeclef9", -5.5F, -5F, 1F, 1, 1, 1);
		BODY6ROT.addBox("bodydecinrig10", 1F, -5F, 2.5F, 1, 1, 1);
		BODY6ROT.addBox("bodydecinlef10", -2F, -5F, 2.5F, 1, 1, 1);
		BODY6ROT.addBox("bodydeclef10", -5.5F, -5F, 3F, 1, 1, 1);
		BODY6ROT.addBox("bodydecrig10", 4.5F, -5F, 3F, 1, 1, 1);
		TAIL1ROT = new ModelRenderer(this, "TAIL1ROT");
		TAIL1ROT.setRotationPoint(0F, 0F, 4F);
		setRotation(TAIL1ROT, 0F, 0F, 0F);
		TAIL1ROT.mirror = true;
		TAIL1ROT.addBox("tail1", -6F, -3.5F, 0F, 12, 7, 3);
		TAIL1ROT.addBox("bodydecinlef11", -2F, -4.5F, 0.5F, 1, 1, 1);
		TAIL1ROT.addBox("bodydecinrig11", 1F, -4.5F, 0.5F, 1, 1, 1);
		TAIL1ROT.addBox("bodydeclef11", -5F, -4.5F, 1F, 1, 1, 1);
		TAIL1ROT.addBox("bodydecrig11", 4F, -4.5F, 1F, 1, 1, 1);
		TAIL2ROT = new ModelRenderer(this, "TAIL2ROT");
		TAIL2ROT.setRotationPoint(0F, 0F, 3F);
		setRotation(TAIL2ROT, 0F, 0F, 0F);
		TAIL2ROT.mirror = true;
		TAIL2ROT.addBox("tail2", -5.5F, -2.5F, 0F, 11, 6, 3);
		TAIL2ROT.addBox("bodydeclef12", -4.5F, -3.5F, 1F, 1, 1, 1);
		TAIL2ROT.addBox("bodydecrig12", 3.5F, -3.5F, 1F, 1, 1, 1);
		TAIL2ROT.addBox("bodydecinrig12", 1F, -3.5F, 0.5F, 1, 1, 1);
		TAIL2ROT.addBox("bodydecinlef12", -2F, -3.5F, 0.5F, 1, 1, 1);
		TAIL3ROT = new ModelRenderer(this, "TAIL3ROT");
		TAIL3ROT.setRotationPoint(0F, 0F, 3F);
		setRotation(TAIL3ROT, 0F, 0F, 0F);
		TAIL3ROT.mirror = true;
		TAIL3ROT.addBox("tail3", -4.5F, -1.5F, 0F, 9, 5, 4);
		TAIL3ROT.addBox("bodydecrig13", 2.5F, -2.5F, 1.5F, 1, 1, 1);
		TAIL3ROT.addBox("bodydecinrig13", 0.5F, -2.5F, 0.5F, 1, 1, 1);
		TAIL3ROT.addBox("bodydecinlef13", -1.5F, -2.5F, 0.5F, 1, 1, 1);
		TAIL3ROT.addBox("bodydeclef13", -4F, -2.5F, 1.5F, 1, 1, 1);
		TAILROT4 = new ModelRenderer(this, "TAILROT4");
		TAILROT4.setRotationPoint(0F, 1.5F, 4F);
		setRotation(TAILROT4, 0F, 0F, 0F);
		TAILROT4.mirror = true;
		TAILROT4.addBox("tail4", -4F, -2F, 0F, 8, 4, 4);
		TAILROT4.addBox("bodydecrig14", 2F, -3F, 1.5F, 1, 1, 1);
		TAILROT4.addBox("bodydecinlef14", -0.5F, -3F, 0.5F, 1, 1, 1);
		TAILROT4.addBox("bodydeclef14", -3F, -3F, 1.5F, 1, 1, 1);
		TAILROT5 = new ModelRenderer(this, "TAILROT5");
		TAILROT5.setRotationPoint(0F, 0.5F, 4F);
		setRotation(TAILROT5, 0F, 0F, 0F);
		TAILROT5.mirror = true;
		TAILROT5.addBox("tail5", -3F, -1.5F, 0F, 6, 3, 5);
		TAILROT5.addBox("bodydeclef15", -2F, -2.5F, 1.5F, 1, 1, 1);
		TAILROT5.addBox("bodydecrig16", 1F, -2.5F, 3.5F, 1, 1, 1);
		TAILROT5.addBox("bodydecrig15", 1F, -2.5F, 1.5F, 1, 1, 1);
		TAILROT5.addBox("bodydeclef16", -2F, -2.5F, 3.5F, 1, 1, 1);
		TAILROT6 = new ModelRenderer(this, "TAILROT6");
		TAILROT6.setRotationPoint(0F, 0.5F, 5F);
		setRotation(TAILROT6, 0F, 0F, 0F);
		TAILROT6.mirror = true;
		TAILROT6.addBox("tail6", -2.5F, -1F, 0F, 5, 2, 5);
		TAILROT6.addBox("bodydeclef17", -1.5F, -2F, 1F, 1, 1, 1);
		TAILROT6.addBox("bodydecrig17", 0.5F, -2F, 1F, 1, 1, 1);
		TAILROT6.addBox("bodydecrig18", 0.5F, -2F, 3F, 1, 1, 1);
		TAILROT6.addBox("bodydeclef18", -1.5F, -2F, 3F, 1, 1, 1);
		TAILROT7 = new ModelRenderer(this, "TAILROT7");
		TAILROT7.setRotationPoint(0F, 0F, 5F);
		setRotation(TAILROT7, 0F, 0F, 0F);
		TAILROT7.mirror = true;
		TAILROT7.addBox("tail7", -2F, -1F, 0F, 4, 2, 3);
		TAILROT7.addBox("bodydecrig19", 0.5F, -2F, 1F, 1, 1, 1);
		TAILROT7.addBox("bodydeclef19", -1.5F, -2F, 1F, 1, 1, 1);
		TAILROT8 = new ModelRenderer(this, "TAILROT8");
		TAILROT8.setRotationPoint(0F, 0F, 3F);
		setRotation(TAILROT8, 0F, 0F, 0F);
		TAILROT8.mirror = true;
		TAILROT8.addBox("tail8", -1.5F, -1F, 0F, 3, 2, 2);
		TAILROT8.addBox("bodydecrig20", 0.5F, -2F, 0.5F, 1, 1, 1);
		TAILROT8.addBox("bodydeclef20", -1.5F, -2F, 0.5F, 1, 1, 1);
		TAILROT9 = new ModelRenderer(this, "TAILROT9");
		TAILROT9.setRotationPoint(0F, 0F, 2F);
		setRotation(TAILROT9, 0F, 0F, 0F);
		TAILROT9.mirror = true;
		TAILROT9.addBox("tail9", -1F, -1F, 0F, 2, 2, 1);
		TAILROT8.addChild(TAILROT9);
		TAILROT7.addChild(TAILROT8);
		TAILROT6.addChild(TAILROT7);
		TAILROT5.addChild(TAILROT6);
		TAILROT4.addChild(TAILROT5);
		TAIL3ROT.addChild(TAILROT4);
		TAIL2ROT.addChild(TAIL3ROT);
		TAIL1ROT.addChild(TAIL2ROT);
		BODY6ROT.addChild(TAIL1ROT);
		LEG4TOPROT = new ModelRenderer(this, "LEG4TOPROT");
		LEG4TOPROT.setRotationPoint(7F, 1F, 0F);
		setRotation(LEG4TOPROT, 0F, 0F, 0F);
		LEG4TOPROT.mirror = true;
		LEG4TOPROT.addBox("leg4top", 0F, -2F, -2F, 6, 4, 4);
		LEG4TOPROT.addBox("leg4deco", 0F, -3F, -1.5F, 5, 1, 3);
		LEG4BOTROT = new ModelRenderer(this, "LEG4BOTROT");
		LEG4BOTROT.setRotationPoint(4F, 2F, 0F);
		setRotation(LEG4BOTROT, 0F, 0F, 0F);
		LEG4BOTROT.mirror = true;
		LEG4BOTROT.addBox("leg4bot", -2F, 0F, -2F, 4, 4, 4);
		LEG4TOPROT.addChild(LEG4BOTROT);
		BODY6ROT.addChild(LEG4TOPROT);
		LEG3TOPROT = new ModelRenderer(this, "LEG3TOPROT");
		LEG3TOPROT.setRotationPoint(-8F, 1F, 0F);
		setRotation(LEG3TOPROT, 0F, 0F, 0F);
		LEG3TOPROT.mirror = true;
		LEG3TOPROT.addBox("leg3top", -5F, -2F, -2F, 6, 4, 4);
		LEG3TOPROT.addBox("leg3deco", -4F, -3F, -1.5F, 5, 1, 3);
		LEG3BOTROT = new ModelRenderer(this, "LEG3BOTROT");
		LEG3BOTROT.setRotationPoint(-3F, 2F, 0F);
		setRotation(LEG3BOTROT, 0F, 0F, 0F);
		LEG3BOTROT.mirror = true;
		LEG3BOTROT.addBox("leg3bot", -2F, 0F, -2F, 4, 4, 4);
		LEG3TOPROT.addChild(LEG3BOTROT);
		BODY6ROT.addChild(LEG3TOPROT);
		BODY5ROT.addChild(BODY6ROT);
		BODY4ROT.addChild(BODY5ROT);
		BODY3ROT.addChild(BODY4ROT);
		BODY2ROT.addChild(BODY3ROT);
		BODY1ROT.addChild(BODY2ROT);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		float field_78145_g = 6.0F;
		float field_78151_h = 3.4F;

		if (this.isChild){
			float var8 = 2.0F;
			GL11.glPushMatrix();
			GL11.glScalef(1.7F / var8, 1.7F / var8, 1.7F / var8);
			GL11.glTranslatef(0.0f, field_78145_g * f5, field_78151_h * f5);
			MOUTHBOTROT.render(f5);
			MOUTHTOPROT.render(f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
			GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
			BODY1ROT.render(f5);
			GL11.glPopMatrix();
		}else{
			MOUTHBOTROT.render(f5);
			MOUTHTOPROT.render(f5);
			BODY1ROT.render(f5);

		}

	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5,par7Entity);
		MOUTHTOPROT.rotateAngleX = -Math.abs( MathHelper.cos(f*0.6662F) * f1) + Math.min(Math.max(f4, -15), +15) * (float)(Math.PI/180f);
		MOUTHTOPROT.rotateAngleY = Math.min(Math.max(f3, -45), +45) * (float)(Math.PI/180f);

		MOUTHBOTROT.rotateAngleX = Math.min(Math.max(f4, -15), +15) * (float)(Math.PI/180f);
		MOUTHBOTROT.rotateAngleY = Math.min(Math.max(f3, -45), +45) * (float)(Math.PI/180f);
	}



	@Override
	public void setLivingAnimations(EntityLiving par1EntityLiving, float par2, float par3, float par4) {
		EntityCrocodile var5 = (EntityCrocodile)par1EntityLiving;

		LEG2TOPROT.rotateAngleX = (float)( MathHelper.cos(par2*0.6662F*2f			   	 ) * 1.8F * par3 );
		LEG4TOPROT.rotateAngleX = (float)( MathHelper.cos(par2*0.6662F*2f			   	 ) * 1.8F * par3 );
		LEG1TOPROT.rotateAngleX = (float)( MathHelper.cos(par2*0.6662F*2f + (float)Math.PI) * 1.8F * par3 );
		LEG3TOPROT.rotateAngleX = (float)( MathHelper.cos(par2*0.6662F*2f + (float)Math.PI) * 1.8F * par3 );

		BODY1ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 0/4*(float)Math.PI) * 0.1F * par3 );
		BODY2ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 1/4*(float)Math.PI) * 0.1F * par3 );
		BODY3ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 2/4*(float)Math.PI) * 0.1F * par3 );
		BODY4ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 3/4*(float)Math.PI) * 0.1F * par3 );
		BODY5ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 4/4*(float)Math.PI) * 0.1F * par3 );
		BODY6ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 5/4*(float)Math.PI) * 0.1F * par3 );

		TAIL1ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 6/4*(float)Math.PI) * 0.1F * par3 );
		TAIL2ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 7/4*(float)Math.PI) * 0.1F * par3 );
		TAIL3ROT.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 8/4*(float)Math.PI) * 0.1F * par3 );
		TAILROT4.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 9/4*(float)Math.PI) * 0.1F * par3 );
		TAILROT5.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 10/4*(float)Math.PI) * 0.1F * par3 );
		TAILROT6.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 11/4*(float)Math.PI) * 0.1F * par3 );
		TAILROT7.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 12/4*(float)Math.PI) * 0.1F * par3 );
		TAILROT8.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 13/4*(float)Math.PI) * 0.1F * par3 );
		TAILROT9.rotateAngleY = (float)( MathHelper.cos(par2*0.6662F*2f	+ 14/4*(float)Math.PI) * 0.1F * par3 );
		super.setLivingAnimations(par1EntityLiving, par2, par3, par4);
	}

	private double zeroIfNegative(double value){
		if(value < 0){
			return 0f;
		}else{
			return value;
		}
	}

	private float mapValueofSet1ToSet2(float value, float set1min, float set1max, float set2min, float set2max){
		return (value - set1min)*( (set2max - set2min) / (set1max - set1min) ) + set2min;
	}

	private float mapValueWithClamp(float value, float set1min, float set1max, float set2min, float set2max){
		float value2 = (value - set1min)*( (set2max - set2min) / (set1max - set1min) ) + set2min;
		value2 = MathHelper.clamp_float(value2, set2min, set2max);
		return value2;
	}

	private float func_78172_a(float par1, float par2)
	{
		return (Math.abs(par1 % par2 - par2 * 0.5F) - par2 * 0.25F) / (par2 * 0.25F);
	}
}
