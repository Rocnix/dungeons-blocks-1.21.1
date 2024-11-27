package beasts.dungeonsblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import beasts.dungeonsblocks.DungeonsBlocks;

public class ModItems {

//    public static final Item ITEM_NAME = registerItem("item_name", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DungeonsBlocks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DungeonsBlocks.LOGGER.info("Registering Mod Items for " + DungeonsBlocks.MOD_ID);
    }

}
