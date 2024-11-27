package beasts.dungeonsblocks.datagen;

import beasts.dungeonsblocks.block.ModBlocks;
import beasts.dungeonsblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

// testing a comment while working on things. how does this work out?
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // simple cubes
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLEACHED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARVED_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_BLEACHED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_PRISMARINE_FLOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_CHISELED_BLEACHED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_SCALES_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMALL_GRANITE_BRICKS);

        // complex cubes
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_KEYSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMALL_PRISMARINE_BRICKS);

        // plants
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SEALEAF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SEALEAF_VINE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TALL_CORAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TALL_SEALEAF);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        itemModelGenerator.register(ModItems.ITEM_NAME, Models.GENERATED);
    }
}
