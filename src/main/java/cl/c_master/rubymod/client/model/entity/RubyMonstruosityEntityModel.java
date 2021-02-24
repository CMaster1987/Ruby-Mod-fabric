// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

package cl.c_master.rubymod.client.model.entity;

import cl.c_master.rubymod.entity.RubyMonstruosityEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class RubyMonstruosityEntityModel extends EntityModel<RubyMonstruosityEntity> {
private final ModelPart head;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart jaw;
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
public RubyMonstruosityEntityModel() {
		textureWidth = 128;
		textureHeight = 128;
		head = new ModelPart(this);
		head.setPivot(0.0F, -13.0F, -7.0F);
		head.setTextureOffset(0, 0).addCuboid(-5.0F, -6.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(70, 0).addCuboid(-7.0F, -9.0F, -7.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelPart(this);
		cube_r1.setPivot(3.0F, -6.0F, -3.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.setTextureOffset(30, 0).addCuboid(-6.0F, -10.0F, 0.0F, 12.0F, 10.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelPart(this);
		cube_r2.setPivot(3.0F, -6.0F, -3.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.setTextureOffset(30, 0).addCuboid(-6.0F, -10.0F, 0.0F, 12.0F, 10.0F, 0.0F, 0.0F, false);

		jaw = new ModelPart(this);
		jaw.setPivot(0.0F, -2.0F, 0.0F);
		head.addChild(jaw);
		jaw.setTextureOffset(40, 0).addCuboid(-5.0F, -4.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		body = new ModelPart(this);
		body.setPivot(0.0F, 6.0F, 0.0F);
		body.setTextureOffset(0, 20).addCuboid(-12.0F, -22.0F, -7.0F, 24.0F, 16.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(0, 50).addCuboid(-9.0F, -6.0F, -4.0F, 18.0F, 6.0F, 8.0F, 0.0F, false);

		left_arm = new ModelPart(this);
		left_arm.setPivot(12.0F, -12.0F, 0.0F);
		left_arm.setTextureOffset(0, 64).addCuboid(0.0F, -7.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		left_arm.setTextureOffset(48, 56).addCuboid(4.0F, 9.0F, -4.0F, 8.0F, 16.0F, 8.0F, 0.0F, false);
		left_arm.setTextureOffset(52, 84).addCuboid(2.0F, 25.0F, -6.0F, 12.0F, 10.0F, 12.0F, 0.0F, false);
		left_arm.setTextureOffset(62, 20).addCuboid(0.5F, -21.0F, -4.0F, 10.0F, 14.0F, 0.0F, 0.0F, false);
		left_arm.setTextureOffset(62, 10).addCuboid(5.5F, -21.0F, -9.0F, 0.0F, 14.0F, 10.0F, 0.0F, true);

		right_arm = new ModelPart(this);
		right_arm.setPivot(-12.0F, -12.0F, 0.0F);
		right_arm.setTextureOffset(0, 96).addCuboid(-16.0F, -7.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		right_arm.setTextureOffset(88, 72).addCuboid(-12.0F, 9.0F, -4.0F, 8.0F, 16.0F, 8.0F, 0.0F, false);
		right_arm.setTextureOffset(64, 106).addCuboid(-14.0F, 25.0F, -6.0F, 12.0F, 10.0F, 12.0F, 0.0F, false);

		left_leg = new ModelPart(this);
		left_leg.setPivot(6.0F, 6.0F, 0.0F);
		left_leg.setTextureOffset(88, 0).addCuboid(-5.0F, 0.0F, -5.0F, 10.0F, 18.0F, 10.0F, 0.0F, false);

		right_leg = new ModelPart(this);
		right_leg.setPivot(-6.0F, 6.0F, 0.0F);
		right_leg.setTextureOffset(76, 28).addCuboid(-5.0F, 0.0F, -5.0F, 10.0F, 18.0F, 10.0F, 0.0F, false);
}
@Override
public void setAngles(RubyMonstruosityEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
{
		this.setRotationAngle(left_leg, MathHelper.cos(2.0F / limbSwing), 0, 0);
		this.setRotationAngle(right_leg, MathHelper.sin(2.0F / limbSwing), 0, 0);
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}