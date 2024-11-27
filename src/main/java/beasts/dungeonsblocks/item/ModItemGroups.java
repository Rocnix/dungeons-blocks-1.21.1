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
                        entries.add(ModBlocks.PRISMARINE_SCALES_BLOCK);
                        entries.add(ModBlocks.BLEACHED_STONE_BRICKS);
                        entries.add(ModBlocks.PRISMARINE_BOOKSHELF);
                        entries.add(ModBlocks.PRISMARINE_KEYSTONE);
                        entries.add(ModBlocks.PRISMARINE_PILLAR);
                        entries.add(ModBlocks.SEALEAF);
                        entries.add(ModBlocks.SEALEAF_VINE);
                        entries.add(ModBlocks.SMALL_GRANITE_BRICKS);
                        entries.add(ModBlocks.SMALL_PRISMARINE_BRICKS);
                        entries.add(ModBlocks.TALL_CORAL);
                        entries.add(ModBlocks.TALL_SEALEAF);
                        entries.add(ModBlocks.CHISELED_BLEACHED_STONE_BRICKS);
                        entries.add(ModBlocks.CARVED_PRISMARINE_BRICKS);
                        entries.add(ModBlocks.CHISELED_GRANITE_BRICKS);
                        entries.add(ModBlocks.DARK_PRISMARINE_FLOOR);
                        entries.add(ModBlocks.GRANITE_BRICKS);
                        entries.add(ModBlocks.MOSSY_CHISELED_BLEACHED_STONE_BRICKS);
                    }).build());



    public static void registerItemGroups(){
        DungeonsBlocks.LOGGER.info("Registering item groups for " + DungeonsBlocks.MOD_ID);
    }
}
