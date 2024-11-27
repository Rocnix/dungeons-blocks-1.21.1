package beasts.dungeonsblocks.item;

import beasts.dungeonsblocks.DungeonsBlocks;
import beasts.dungeonsblocks.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SQUID_COAST_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DungeonsBlocks.MOD_ID, "squid_coast_items"),
            FabricItemGroup.builder()
//                  .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.dungeons_blocks.squid_coast_items"))
                    .entries((displayContext, entries) -> {
//                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModBlocks.PRISMARINE_SCALES_BLOCK);
                    }).build());



    public static void registerItemGroups(){
        DungeonsBlocks.LOGGER.info("Registering item groups for " + DungeonsBlocks.MOD_ID);
    }
}
