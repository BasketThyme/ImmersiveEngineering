package blusunrize.immersiveengineering.common.util.compat;

import net.minecraftforge.fml.common.event.FMLInterModComms;

public class ChiselHelper extends IECompatModule
{
	@Override
	public void preInit()
	{
	}

	@Override
	public void init()
	{
		FMLInterModComms.sendMessage("chisel", "variation:add", "treated_wood|ImmersiveEngineering:treatedWood|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "treated_wood|ImmersiveEngineering:treatedWood|1");
		FMLInterModComms.sendMessage("chisel", "variation:add", "treated_wood|ImmersiveEngineering:treatedWood|2");
		FMLInterModComms.sendMessage("chisel", "variation:add", "steel_scaffold|ImmersiveEngineering:metalDecoration1|1");
		FMLInterModComms.sendMessage("chisel", "variation:add", "steel_scaffold|ImmersiveEngineering:metalDecoration1|2");
		FMLInterModComms.sendMessage("chisel", "variation:add", "steel_scaffold|ImmersiveEngineering:metalDecoration1|3");
		FMLInterModComms.sendMessage("chisel", "variation:add", "aluminum_scaffold|ImmersiveEngineering:metalDecoration1|5");
		FMLInterModComms.sendMessage("chisel", "variation:add", "aluminum_scaffold|ImmersiveEngineering:metalDecoration1|6");
		FMLInterModComms.sendMessage("chisel", "variation:add", "aluminum_scaffold|ImmersiveEngineering:metalDecoration1|7");
	}

	@Override
	public void postInit()
	{
	}
}