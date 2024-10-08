package net.santoeva.santosupdate.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.santoeva.santosupdate.SantosUpdate;
import net.santoeva.santosupdate.item.custom.SlagItem;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SantosUpdate.MOD_ID);


    //Custom Items

    //Silver Items
    public static final DeferredItem<Item> SILVER_RAW = ITEMS.registerSimpleItem("silver_raw");
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.registerItem("silver_ingot",
            Item::new, new Item.Properties());

    //Slag Items
    public static final DeferredItem<Item> SMOLDERING_SLAG = ITEMS.registerItem("smoldering_slag",
            properties -> new SlagItem(properties, 4800), new Item.Properties());




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
