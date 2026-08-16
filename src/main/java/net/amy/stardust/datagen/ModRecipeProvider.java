package net.amy.stardust.datagen;

import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.RecipeProvider.getHasName;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {

                List<ItemLike> STARDUST_SMELTABLES = List.of(ModBlocks.STARDUST_ORE);

                oreSmelting(STARDUST_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.UNREFINED_STARDUST, 0.5f, 300, "stardust");
                oreBlasting(STARDUST_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.UNREFINED_STARDUST, 0.5f, 150, "stardust");
                stonecutterResultFromBase(RecipeCategory.MISC, ModItems.STARDUST, ModItems.UNREFINED_STARDUST);
                stonecutterResultFromBase(RecipeCategory.MISC, ModItems.CRYSTALLISED_STARDUST, ModItems.STARDUST);
                simpleCookingRecipe("campfire_cooking", CampfireCookingRecipe::new, 600, ModItems.UNREFINED_STARDUST, ModItems.STARDUST, 0.35F);




                shaped(RecipeCategory.MISC, ModBlocks.CRYSTALLISED_STARDUST_BLOCK)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModItems.CRYSTALLISED_STARDUST)
                        .unlockedBy(getHasName(ModItems.CRYSTALLISED_STARDUST), has(ModItems.CRYSTALLISED_STARDUST))
                        .group("stardust_block")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.GOLD_RING)
                        .pattern("GGG")
                        .pattern("G G")
                        .pattern("GGG")
                        .define('G', Items.GOLD_INGOT)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("rings")
                        .save(output);
                

                shaped(RecipeCategory.MISC, ModItems.STARDUST_RING)
                        .pattern("GGG")
                        .pattern("GNG")
                        .pattern("GGG")
                        .define('G', ModItems.CRYSTALLISED_STARDUST)
                        .define('N', ModItems.NETHERITE_RING)
                        .unlockedBy(getHasName(ModItems.CRYSTALLISED_STARDUST), has(ModItems.CRYSTALLISED_STARDUST))
                        .group("rings")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.NETHERITE_RING)
                        .pattern("GGG")
                        .pattern("GRG")
                        .pattern("GGG")
                        .define('G', Items.NETHERITE_SCRAP)
                        .define('R', ModItems.GOLD_RING)
                        .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                        .group("rings")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.OMEGA_HEART)
                        .pattern("RCT")
                        .pattern("PGE")
                        .pattern("ASQ")
                        .define('R', ModItems.RUBY_HEART)
                        .define('C', ModItems.CITRINE_HEART)
                        .define('T', ModItems.TOPAZ_HEART)
                        .define('P', ModItems.SPINEL_HEART)
                        .define('G', Items.GOLDEN_DANDELION)
                        .define('E', ModItems.EMERALD_HEART)
                        .define('A', ModItems.AMETHYST_HEART)
                        .define('S', ModItems.SAPPHIRE_HEART)
                        .define('Q', ModItems.AQUAMARINE_HEART)
                        .unlockedBy(getHasName(Items.GOLDEN_DANDELION), has(Items.GOLDEN_DANDELION))
                        .group("souls")
                        .save(output);

                ringRecipe(this, ModItems.RUBY, ModItems.GOLD_RING, ModItems.RUBY_GOLD_RING, output);
                ringRecipe(this, ModItems.SAPPHIRE, ModItems.GOLD_RING, ModItems.SAPPHIRE_GOLD_RING, output);
                ringRecipe(this, ModItems.TOPAZ, ModItems.GOLD_RING, ModItems.TOPAZ_GOLD_RING, output);
                ringRecipe(this, ModItems.AQUAMARINE, ModItems.GOLD_RING, ModItems.AQUAMARINE_GOLD_RING, output);
                ringRecipe(this, ModItems.AMETHYST, ModItems.GOLD_RING, ModItems.AMETHYST_GOLD_RING, output);
                ringRecipe(this, Items.EMERALD, ModItems.GOLD_RING, ModItems.EMERALD_GOLD_RING, output);
                ringRecipe(this, ModItems.CITRINE, ModItems.GOLD_RING, ModItems.CITRINE_GOLD_RING, output);
                ringRecipe(this, ModItems.SPINEL, ModItems.GOLD_RING, ModItems.SPINEL_GOLD_RING, output);
                ringRecipe(this, Items.DIAMOND, ModItems.GOLD_RING, ModItems.DIAMOND_GOLD_RING, output);

                ringRecipe(this, ModItems.RUBY, ModItems.NETHERITE_RING, ModItems.RUBY_NETHERITE_RING, output);
                ringRecipe(this, ModItems.SAPPHIRE, ModItems.NETHERITE_RING, ModItems.SAPPHIRE_NETHERITE_RING, output);
                ringRecipe(this, ModItems.TOPAZ, ModItems.NETHERITE_RING, ModItems.TOPAZ_NETHERITE_RING, output);
                ringRecipe(this, ModItems.AQUAMARINE, ModItems.NETHERITE_RING, ModItems.AQUAMARINE_NETHERITE_RING, output);
                ringRecipe(this, ModItems.AMETHYST, ModItems.NETHERITE_RING, ModItems.AMETHYST_NETHERITE_RING, output);
                ringRecipe(this, Items.EMERALD, ModItems.NETHERITE_RING, ModItems.EMERALD_NETHERITE_RING, output);
                ringRecipe(this, ModItems.CITRINE, ModItems.NETHERITE_RING, ModItems.CITRINE_NETHERITE_RING, output);
                ringRecipe(this, ModItems.SPINEL, ModItems.NETHERITE_RING, ModItems.SPINEL_NETHERITE_RING, output);
                ringRecipe(this, Items.DIAMOND, ModItems.NETHERITE_RING, ModItems.DIAMOND_NETHERITE_RING, output);

                ringRecipe(this, ModItems.RUBY, ModItems.STARDUST_RING, ModItems.RUBY_STARDUST_RING, output);
                ringRecipe(this, ModItems.SAPPHIRE, ModItems.STARDUST_RING, ModItems.SAPPHIRE_STARDUST_RING, output);
                ringRecipe(this, ModItems.TOPAZ, ModItems.STARDUST_RING, ModItems.TOPAZ_STARDUST_RING, output);
                ringRecipe(this, ModItems.AQUAMARINE, ModItems.STARDUST_RING, ModItems.AQUAMARINE_STARDUST_RING, output);
                ringRecipe(this, ModItems.AMETHYST, ModItems.STARDUST_RING, ModItems.AMETHYST_STARDUST_RING, output);
                ringRecipe(this, Items.EMERALD, ModItems.STARDUST_RING, ModItems.EMERALD_STARDUST_RING, output);
                ringRecipe(this, ModItems.CITRINE, ModItems.STARDUST_RING, ModItems.CITRINE_STARDUST_RING, output);
                ringRecipe(this, ModItems.SPINEL, ModItems.STARDUST_RING, ModItems.SPINEL_STARDUST_RING, output);
                ringRecipe(this, Items.DIAMOND, ModItems.STARDUST_RING, ModItems.DIAMOND_STARDUST_RING, output);
                
                
                lanternRecipe(this, ModItems.RUBY, ModBlocks.RUBY_LANTERN, output);
                lanternRecipe(this, ModItems.SAPPHIRE, ModBlocks.SAPPHIRE_LANTERN, output);
                lanternRecipe(this, ModItems.TOPAZ, ModBlocks.TOPAZ_LANTERN, output);
                lanternRecipe(this, ModItems.AQUAMARINE, ModBlocks.AQUAMARINE_LANTERN, output);
                lanternRecipe(this, ModItems.AMETHYST, ModBlocks.AMETHYST_LANTERN, output);
                lanternRecipe(this, Items.EMERALD, ModBlocks.EMERALD_LANTERN, output);
                lanternRecipe(this, ModItems.CITRINE, ModBlocks.CITRINE_LANTERN, output);
                lanternRecipe(this, ModItems.SPINEL, ModBlocks.SPINEL_LANTERN, output);

                torchRecipe(this, ModItems.RUBY, ModItems.RUBY_TORCH, output);
                torchRecipe(this, ModItems.SAPPHIRE, ModItems.SAPPHIRE_TORCH, output);
                torchRecipe(this, ModItems.TOPAZ, ModItems.TOPAZ_TORCH, output);
                torchRecipe(this, ModItems.AQUAMARINE, ModItems.AQUAMARINE_TORCH, output);
                torchRecipe(this, ModItems.AMETHYST, ModItems.AMETHYST_TORCH, output);
                torchRecipe(this, Items.EMERALD, ModItems.EMERALD_TORCH, output);
                torchRecipe(this, ModItems.CITRINE, ModItems.CITRINE_TORCH, output);
                torchRecipe(this, ModItems.SPINEL, ModItems.SPINEL_TORCH, output);
                
                
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK, ModItems.RUBY, getHasName(ModItems.RUBY));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK, ModItems.SAPPHIRE, getHasName(ModItems.SAPPHIRE));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK, ModItems.TOPAZ, getHasName(ModItems.TOPAZ));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CITRINE_BLOCK, ModItems.CITRINE, getHasName(ModItems.CITRINE));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPINEL_BLOCK, ModItems.SPINEL, getHasName(ModItems.SPINEL));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUAMARINE_BLOCK, ModItems.AQUAMARINE, getHasName(ModItems.AQUAMARINE));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_GEM_BLOCK, ModItems.AMETHYST, getHasName(ModItems.AMETHYST));

                soulRecipe(this, ModItems.RUBY, ModItems.RUBY_HEART, output);
                soulRecipe(this, ModItems.SAPPHIRE, ModItems.SAPPHIRE_HEART, output);
                soulRecipe(this, ModItems.TOPAZ, ModItems.TOPAZ_HEART, output);
                soulRecipe(this, ModItems.AQUAMARINE, ModItems.AQUAMARINE_HEART, output);
                soulRecipe(this, ModItems.AMETHYST, ModItems.AMETHYST_HEART, output);
                soulRecipe(this, Items.EMERALD, ModItems.EMERALD_HEART, output);
                soulRecipe(this, ModItems.CITRINE, ModItems.CITRINE_HEART, output);
                soulRecipe(this, ModItems.SPINEL, ModItems.SPINEL_HEART, output);

            }
            
            
        };
    }

    private void soulRecipe(RecipeProvider provider, Item input, Item outputItem, RecipeOutput output) {
        provider.shaped(RecipeCategory.MISC, outputItem)
                .pattern("RCR")
                .pattern("CNC")
                .pattern("RCR")
                .define('C', ModItems.CRYSTALLISED_STARDUST)
                .define('R', input)
                .define('N', Items.NETHER_STAR)
                .unlockedBy(getHasName(input), provider.has(input))
                .group("souls")
                .save(output);
    }

    private void torchRecipe(RecipeProvider provider, Item input, Item outputItem, RecipeOutput output) {
        provider.shaped(RecipeCategory.MISC, outputItem)
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" C ")
                .define('A', input)
                .define('C', Items.STICK)
                .define('S', Items.COAL)
                .unlockedBy(getHasName(input), provider.has(input))
                .save(output);
    }

    private void lanternRecipe(RecipeProvider provider, Item input, Block outputBlock, RecipeOutput output) {
        provider.shapeless(RecipeCategory.MISC, outputBlock)
                .requires(ModBlocks.EMPTY_LANTERN)
                .requires(input)
                .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), provider.has(ModBlocks.EMPTY_LANTERN))
                .group("gem_lanterns")
                .save(output);
    }

    private void ringRecipe(RecipeProvider provider, Item input, Item ring, Item outputItem, RecipeOutput output) {
        provider.shapeless(RecipeCategory.MISC, outputItem)
                .requires(ring)
                .requires(input)
                .unlockedBy(getHasName(ring), provider.has(ring))
                .group("rings")
                .save(output);
    }

    @Override
    public String getName() {
        return "stardust.recipes";
    }
}
