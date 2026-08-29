package net.amy.gems.recipe;

import net.amy.gems.Gems;
import net.amy.gems.recipe.custom.GemFacetingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

import static net.amy.gems.Gems.MOD_ID;

public class ModRecipes {
    public static final RecipeSerializer<GemFacetingRecipe> GEM_FACETING_RECIPE_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER,
            Identifier.fromNamespaceAndPath(MOD_ID, "gem_faceting"),
            new RecipeSerializer<>(GemFacetingRecipe.CODEC, GemFacetingRecipe.STREAM_CODEC)
    );

    public static final RecipeType<GemFacetingRecipe> GEM_FACETING_RECIPE_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "gem_faceting"),
            new RecipeType<GemFacetingRecipe>() {
                @Override
                public String toString() {
                    return "gem_faceting";
                }
            }
    );

    public static void registerModRecipes() {
        Gems.LOGGER.info("Registering recipes for " + MOD_ID);
    }
}
