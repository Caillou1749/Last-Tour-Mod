package net.caillou1749.lasttour.item;

import net.caillou1749.lasttour.LastTourMod;
import net.caillou1749.lasttour.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LastTourMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LAST_TOUR_TAB = CREATIVE_MODE_TABS.register("last_tour_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GRAY_ANCIENT_CONCRETE.get()))
                    .title(Component.translatable("creativetab.last_tour_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.GRAY_ANCIENT_CONCRETE.get());
                        pOutput.accept(ModBlocks.TUYAUX.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
