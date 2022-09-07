package network.bruv.thingmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import network.bruv.thingmod.ThingMod;
import network.bruv.thingmod.item.custom.FancyItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThingMod.MOD_ID);

    //Test Item, use as a base for new items
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THINGMOD_TAB)));
    //Test Item 2
    public static final RegistryObject<Item> TESTITEM2 = ITEMS.register("testitem2",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THINGMOD_TAB)));
    //Fancy Item
    public static final RegistryObject<Item> FANCYITEM = ITEMS.register("fancyitem",
            () -> new FancyItem(new Item.Properties().tab(ModCreativeModeTab.THINGMOD_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
