package net.amy.stardust.block.entity;

import net.amy.stardust.Stardust;
import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.block.custom.GemFaceterBlock;
import net.amy.stardust.block.entity.custom.GemFaceterBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModBlockEntities {
    public static final BlockEntityType<GemFaceterBlockEntity> GEM_FACETER_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "gem_faceter_be"),
                    FabricBlockEntityTypeBuilder.create(GemFaceterBlockEntity::new, ModBlocks.GEM_FACETER).build());

    public static void registerBlockEntities() {
        Stardust.LOGGER.info("Registering ModBlockEntities for " + MOD_ID);
    }
}
