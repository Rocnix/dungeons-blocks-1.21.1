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
