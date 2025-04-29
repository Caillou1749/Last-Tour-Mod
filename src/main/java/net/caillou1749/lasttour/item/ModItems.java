package net.caillou1749.lasttour.item;

import net.caillou1749.lasttour.LastTourMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LastTourMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
