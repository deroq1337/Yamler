package net.cubespace.Yamler.Converter;

import net.cubespace.Yamler.Config.ConfigSection;
import net.cubespace.Yamler.Config.Converter.Converter;
import net.cubespace.Yamler.Config.InternalConverter;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author geNAZt (fabian.fassbender42@googlemail.com)
 */
public class ItemStack implements Converter {
    private InternalConverter converter;

    public ItemStack(InternalConverter converter) {
        this.converter = converter;
    }

    @Override
    public Object toConfig(Class<?> type, Object obj, ParameterizedType genericType) throws Exception {
        org.bukkit.inventory.ItemStack itemStack = (org.bukkit.inventory.ItemStack) obj;

        Map<String, Object> saveMap = new HashMap<>();
        saveMap.put("type", itemStack.getType());
        saveMap.put("amount", itemStack.getAmount());

        Converter listConverter = converter.getConverter(List.class);

        Map<String, Object> meta = null;
        if(itemStack.hasItemMeta()) {
            meta = new HashMap<>();
            meta.put("name", itemStack.getItemMeta().hasDisplayName() ? itemStack.getItemMeta().getDisplayName() : null);
            meta.put("lore", itemStack.getItemMeta().hasLore() ? listConverter.toConfig(List.class, itemStack.getItemMeta().getLore(), null) : null);
        }

        saveMap.put("meta", meta);

        return saveMap;
    }

    @Override
    public Object fromConfig(Class type, Object section, ParameterizedType genericType) throws Exception {
        Map itemstackMap;
        Map metaMap = null;

        if(section instanceof Map) {
            itemstackMap = (Map) section;
            metaMap = (Map) itemstackMap.get("meta");
        } else {
            itemstackMap = ((ConfigSection) section).getRawMap();
            if(itemstackMap.get("meta") != null)
                metaMap = ((ConfigSection) itemstackMap.get("meta")).getRawMap();
        }

        Material itemType = (Material) itemstackMap.get("type");
        org.bukkit.inventory.ItemStack itemStack = (org.bukkit.inventory.ItemStack)
                type.getConstructor(Material.class).newInstance(itemType);
        itemStack.setAmount((int) itemstackMap.get("amount"));

        if(metaMap != null) {
            ItemMeta itemMeta = itemStack.getItemMeta();

            if(metaMap.get("name") != null) {
                itemMeta.setDisplayName((String) metaMap.get("name"));
            }

            if(metaMap.get("lore") != null) {
                Converter listConverter = converter.getConverter(List.class);
                itemMeta.setLore((List<String>) listConverter.fromConfig(List.class, metaMap.get("lore"), null));
            }

            itemStack.setItemMeta(itemMeta);
        }

        return itemStack;
    }

    @Override
    public boolean supports(Class<?> type) {
        return org.bukkit.inventory.ItemStack.class.isAssignableFrom(type);
    }

}
