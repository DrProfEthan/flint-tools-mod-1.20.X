package name.drprfethan.flinttools.item;

import name.drprfethan.flinttools.FlintTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FLINT_AXE = registerItem("flint_axe", new Item(new FabricItemSettings()));

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(FLINT_AXE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FlintTools.MOD_ID, name), item);
    }


    public static void registerModItems() {
        FlintTools.LOGGER.info("Registering Items for " + FlintTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
