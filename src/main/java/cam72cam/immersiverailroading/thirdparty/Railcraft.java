package cam72cam.immersiverailroading.thirdparty;

import cam72cam.immersiverailroading.util.IRFuzzy;
import cam72cam.mod.item.ItemStack;
import mods.railcraft.common.blocks.aesthetics.cube.BlockCube;
import mods.railcraft.common.blocks.aesthetics.cube.EnumCube;
import mods.railcraft.common.items.RailcraftItem;

public class Railcraft {
    public static void init() {
        IRFuzzy.IR_TIE
                .add(new ItemStack(new net.minecraft.item.ItemStack(RailcraftBlocks.GENERIC.item(),
                        1, EnumGeneric.BLOCK_CREOSOTE.ordinal())));
        IRFuzzy.IR_TIE
                .add(new ItemStack(new net.minecraft.item.ItemStack(RailcraftItems.TIE.item(), 1)));
    }
}
