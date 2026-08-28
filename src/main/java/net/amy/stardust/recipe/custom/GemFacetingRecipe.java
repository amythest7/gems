package net.amy.stardust.recipe.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.amy.stardust.recipe.ModRecipes;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public record GemFacetingRecipe(ItemStackTemplate result, Ingredient roughItem) implements Recipe<GemFacetingRecipeInput> {


    @Override
    public boolean matches(GemFacetingRecipeInput input, Level level) {
        if(level.isClientSide()) {
            return false;
        }
        return roughItem.test(input.getItem(0));
    }

    @Override
    public ItemStack assemble(GemFacetingRecipeInput input) {
        return result.create();
    }

    public static final MapCodec<GemFacetingRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    ItemStackTemplate.CODEC.fieldOf("result").forGetter(GemFacetingRecipe::result),
                    Ingredient.CODEC.fieldOf("ingredient").forGetter(GemFacetingRecipe::roughItem)
            ).apply(instance, GemFacetingRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, GemFacetingRecipe> STREAM_CODEC = StreamCodec.composite(
            ItemStackTemplate.STREAM_CODEC,
            GemFacetingRecipe::result,

            Ingredient.CONTENTS_STREAM_CODEC,
            GemFacetingRecipe::roughItem,

            GemFacetingRecipe::new
    );

    @Override
    public boolean showNotification() {
        return true;
    }

    @Override
    public String group() {
        return "gem_faceting";
    }

    @Override
    public RecipeSerializer<? extends Recipe<GemFacetingRecipeInput>> getSerializer() {
        return ModRecipes.GEM_FACETING_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<GemFacetingRecipeInput>> getType() {
        return ModRecipes.GEM_FACETING_RECIPE_TYPE;
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.NOT_PLACEABLE;
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return RecipeBookCategories.STONECUTTER;
    }


}
