package beasts.dungeonsblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import beasts.dungeonsblocks.DungeonsBlocks;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    // helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DungeonsBlocks.MOD_ID, name), item);
    }

    // method to call class
    public static void registerModItems() {
        DungeonsBlocks.LOGGER.info("Registering Mod Items for " + DungeonsBlocks.MOD_ID);

        // add to creative item tab
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//           entries.add(PINK_GARNET);
//           entries.add(RAW_PINK_GARNET);
//        });
    }

}
