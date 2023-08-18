package name.drprfethan.flinttools.item;

import name.drprfethan.flinttools.FlintTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FLINT_AXE = registerItem("flint_axe",
            new AxeItem(ModToolMaterials.FLINT, 6, -3.2f,
            new FabricItemSettings()));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new HoeItem(ModToolMaterials.FLINT, 0, -3.0f,
                    new FabricItemSettings()));
    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new PickaxeItem(ModToolMaterials.FLINT, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterials.FLINT, 2, -3.0f,
                    new FabricItemSettings()));
    public static final Item FLINT_SWORD = registerItem("flint_sword",
            new SwordItem(ModToolMaterials.FLINT, 3, -2.4f,
                    new FabricItemSettings()));

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(FLINT_AXE);
        entries.add(FLINT_HOE);
        entries.add(FLINT_PICKAXE);
        entries.add(FLINT_SHOVEL);
        entries.add(FLINT_SWORD);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FlintTools.MOD_ID, name), item);
    }


    public static void registerModItems() {
        FlintTools.LOGGER.info("Registering Items for " + FlintTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
