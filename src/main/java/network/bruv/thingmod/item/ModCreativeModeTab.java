package network.bruv.thingmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THINGMOD_TAB = new CreativeModeTab("thingmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TESTITEM.get());
        }
    };
}
