package net.amy.stardust.datagen;

import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

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
            }
            
            
        };
    }

    @Override
    public String getName() {
        return "stardust.recipes";
    }
}
