package net.amy.stardust.datagen;

import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

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
                simpleCookingRecipe("campfire_cooking", CampfireCookingRecipe::new, 600, ModItems.UNREFINED_STARDUST, ModItems.STARDUST, 0.35F);

                shaped(RecipeCategory.MISC, ModBlocks.CRYSTALLISED_STARDUST_BLOCK)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModItems.CRYSTALLISED_STARDUST)
                        .unlockedBy(getHasName(ModItems.CRYSTALLISED_STARDUST), has(ModItems.CRYSTALLISED_STARDUST))
                        .group("stardust")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.GOLD_RING)
                        .pattern("GGG")
                        .pattern("G G")
                        .pattern("GGG")
                        .define('G', Items.GOLD_INGOT)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("rings")
                        .save(output);
                
                shapeless(RecipeCategory.MISC, ModItems.RUBY_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.EMERALD_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(Items.EMERALD)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.AMETHYST_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(ModItems.AMETHYST)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.TOPAZ_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.CITRINE_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(ModItems.CITRINE)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.DIAMOND_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(Items.DIAMOND)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SPINEL_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(ModItems.SPINEL)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.STARDUST_RING)
                        .pattern("GGG")
                        .pattern("G G")
                        .pattern("GGG")
                        .define('G', ModItems.STARDUST)
                        .unlockedBy(getHasName(ModItems.STARDUST), has(ModItems.STARDUST))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RUBY_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.EMERALD_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(Items.EMERALD)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.AMETHYST_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(ModItems.AMETHYST)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.TOPAZ_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.CITRINE_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(ModItems.CITRINE)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.DIAMOND_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(Items.DIAMOND)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SPINEL_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(ModItems.SPINEL)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
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

                shapeless(RecipeCategory.MISC, ModItems.RUBY_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.EMERALD_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(Items.EMERALD)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.AMETHYST_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(ModItems.AMETHYST)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.TOPAZ_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.CITRINE_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(ModItems.CITRINE)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.DIAMOND_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(Items.DIAMOND)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SPINEL_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(ModItems.SPINEL)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);
                
                

                shapeless(RecipeCategory.MISC, ModItems.AQUAMARINE_GOLD_RING)
                        .requires(ModItems.GOLD_RING)
                        .requires(ModItems.AQUAMARINE)
                        .unlockedBy(getHasName(ModItems.GOLD_RING), has(ModItems.GOLD_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.AQUAMARINE_STARDUST_RING)
                        .requires(ModItems.STARDUST_RING)
                        .requires(ModItems.AQUAMARINE)
                        .unlockedBy(getHasName(ModItems.STARDUST_RING), has(ModItems.STARDUST_RING))
                        .group("rings")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.AQUAMARINE_NETHERITE_RING)
                        .requires(ModItems.NETHERITE_RING)
                        .requires(ModItems.AQUAMARINE)
                        .unlockedBy(getHasName(ModItems.NETHERITE_RING), has(ModItems.NETHERITE_RING))
                        .group("rings")
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.EMPTY_LANTERN)
                        .pattern("III")
                        .pattern("IGI")
                        .pattern("III")
                        .define('I', Items.IRON_NUGGET)
                        .define('G', Blocks.TINTED_GLASS)
                        .unlockedBy(getHasName(Blocks.TINTED_GLASS), has(Blocks.TINTED_GLASS))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.RUBY_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.RUBY)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.SAPPHIRE_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.SAPPHIRE)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.EMERALD_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(Items.EMERALD)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.AMETHYST_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.AMETHYST)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.TOPAZ_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.TOPAZ)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.CITRINE_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.CITRINE)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.SPINEL_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.SPINEL)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.STARDUST_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.STARDUST)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.AQUAMARINE_LANTERN)
                        .requires(ModBlocks.EMPTY_LANTERN)
                        .requires(ModItems.AQUAMARINE)
                        .unlockedBy(getHasName(ModBlocks.EMPTY_LANTERN), has(ModBlocks.EMPTY_LANTERN))
                        .group("gem_lanterns")
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.AMETHYST_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', ModItems.AMETHYST)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(ModItems.AMETHYST), has(ModItems.AMETHYST))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.RUBY_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', ModItems.RUBY)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', ModItems.SAPPHIRE)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(ModItems.SAPPHIRE))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.EMERALD_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', Items.EMERALD)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.TOPAZ_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', ModItems.TOPAZ)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(ModItems.TOPAZ), has(ModItems.TOPAZ))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.CITRINE_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', ModItems.CITRINE)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(ModItems.CITRINE), has(ModItems.CITRINE))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.SPINEL_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', ModItems.SPINEL)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(ModItems.SPINEL), has(ModItems.SPINEL))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.AQUAMARINE_TORCH)
                        .pattern(" A ")
                        .pattern(" S ")
                        .pattern(" C ")
                        .define('A', ModItems.AQUAMARINE)
                        .define('C', Items.STICK)
                        .define('S', Items.COAL)
                        .unlockedBy(getHasName(ModItems.AQUAMARINE), has(ModItems.AQUAMARINE))
                        .save(output);
                
                

                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK, ModItems.RUBY, getHasName(ModItems.RUBY));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK, ModItems.SAPPHIRE, getHasName(ModItems.SAPPHIRE));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK, ModItems.TOPAZ, getHasName(ModItems.TOPAZ));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CITRINE_BLOCK, ModItems.CITRINE, getHasName(ModItems.CITRINE));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPINEL_BLOCK, ModItems.SPINEL, getHasName(ModItems.SPINEL));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUAMARINE_BLOCK, ModItems.AQUAMARINE, getHasName(ModItems.AQUAMARINE));
                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_GEM_BLOCK, ModItems.AMETHYST, getHasName(ModItems.AMETHYST));
                
            }
            
            
        };
    }

    @Override
    public String getName() {
        return "stardust.recipes";
    }
}
