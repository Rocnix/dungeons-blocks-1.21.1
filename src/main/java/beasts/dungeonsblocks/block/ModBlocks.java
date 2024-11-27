package beasts.dungeonsblocks.block;

import beasts.dungeonsblocks.DungeonsBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

// ooo look at me, im learning how to comment <3


    public static final Block PRISMARINE_SCALES_BLOCK = registerBlock("prismarine_scales",
        new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE) // defaults to stone
        ));
    public static final Block BLEACHED_STONE_BRICKS = registerBlock("bleached_stone_bricks",
        new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE) // defaults to stone
        ));
    public static final Block CHISELED_BLEACHED_STONE_BRICKS = registerBlock("chiseled_bleached_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE) // defaults to stone
            ));
    public static final Block CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE) // defaults to stone
            ));
    public static final Block CARVED_PRISMARINE_BRICKS = registerBlock("carved_prismarine_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE) // defaults to stone
            ));
    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE) // defaults to stone
            ));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE) // defaults to stone
            ));
    public static final Block MOSSY_CHISELED_BLEACHED_STONE_BRICKS = registerBlock("mossy_chiseled_bleached_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE) // defaults to stone
            ));
    public static final Block DARK_PRISMARINE_FLOOR = registerBlock("dark_prismarine_floor",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE) // defaults to stone
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DungeonsBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DungeonsBlocks.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        DungeonsBlocks.LOGGER.info("Registering Mod Blocks for " + DungeonsBlocks.MOD_ID);
    }

}
