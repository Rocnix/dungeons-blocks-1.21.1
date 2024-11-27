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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_SCALES_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLEACHED_STONE_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        itemModelGenerator.register(ModItems.ITEM_NAME, Models.GENERATED);
    }
}
