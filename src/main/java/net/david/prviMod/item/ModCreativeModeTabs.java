package net.david.prviMod.item;

import net.david.prviMod.PrviMod;
import net.david.prviMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrviMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.prvimod.alexandrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("alexandrite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get()))
                    .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.prvimod.alexandrite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_TOOLS_TAB = CREATIVE_MODE_TABS.register("alexandrite_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHISEL.get()))
                    .withTabsBefore(ALEXANDRITE_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.prvimod.alexandrite_foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHISEL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_FUELS_TAB = CREATIVE_MODE_TABS.register("alexandrite_fuels_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AURORA_ASHES.get()))
                    .withTabsBefore(ALEXANDRITE_TOOLS_TAB.getId())
                    .title(Component.translatable("creativetab.prvimod.alexandrite_foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AURORA_ASHES.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_FOODS_TAB = CREATIVE_MODE_TABS.register("alexandrite_foods_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KOHLRABI.get()))
                    .withTabsBefore(ALEXANDRITE_FUELS_TAB.getId())
                    .title(Component.translatable("creativetab.prvimod.alexandrite_foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KOHLRABI.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
