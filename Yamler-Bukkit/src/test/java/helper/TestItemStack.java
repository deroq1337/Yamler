package helper;

import com.google.common.collect.Multimap;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemRarity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.components.FoodComponent;
import org.bukkit.inventory.meta.components.JukeboxPlayableComponent;
import org.bukkit.inventory.meta.components.ToolComponent;
import org.bukkit.inventory.meta.tags.CustomItemTagContainer;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * An implementation of the default Bukkit {@link ItemStack} to provide
 * a similar ability to write/read the {@link ItemMeta} without CraftBukkit running.
 *
 * @author bibo38
 * @see ItemStack
 */
public class TestItemStack extends ItemStack {
    ItemMeta meta = null;

    /**
     * The common used constructor
     *
     * @param type The type of the ItemStack
     * @see ItemStack#ItemStack(Material)
     */
    public TestItemStack(Material type) {
        super(type);
    }

    @Override
    public ItemMeta getItemMeta() {
        if(meta == null)
            meta = new ItemMeta() {
                @Override
                public PersistentDataContainer getPersistentDataContainer() {
                    return null;
                }

                @Override
                public boolean hasDisplayName() {
                    return false;
                }

                @Override
                public String getDisplayName() {
                    return null;
                }

                @Override
                public void setDisplayName(String s) {
                }

                @Override
                public boolean hasItemName() {
                    return false;
                }

                @Override
                public String getItemName() {
                    return "";
                }

                @Override
                public void setItemName(String s) {

                }

                @Override
                public boolean hasLocalizedName() {
                    return false;
                }

                @Override
                public String getLocalizedName() {
                    return "";
                }

                @Override
                public void setLocalizedName(String s) {

                }

                @Override
                public boolean hasLore() {
                    return false;
                }

                @Override
                public List<String> getLore() {
                    return null;
                }

                @Override
                public void setLore(List<String> list) {
                }

                @Override
                public boolean hasCustomModelData() {
                    return false;
                }

                @Override
                public int getCustomModelData() {
                    return 0;
                }

                @Override
                public void setCustomModelData(Integer integer) {

                }

                @Override
                public boolean hasEnchants() {
                    return false;
                }

                @Override
                public boolean hasEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public int getEnchantLevel(Enchantment enchantment) {
                    return 0;
                }

                @Override
                public Map<Enchantment, Integer> getEnchants() {
                    return null;
                }

                @Override
                public boolean addEnchant(Enchantment enchantment, int i, boolean b) {
                    return false;
                }

                @Override
                public boolean removeEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public void removeEnchantments() {

                }

                @Override
                public boolean hasConflictingEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public void addItemFlags(ItemFlag... itemFlags) {

                }

                @Override
                public void removeItemFlags(ItemFlag... itemFlags) {

                }

                @Override
                public Set<ItemFlag> getItemFlags() {
                    return Set.of();
                }

                @Override
                public boolean hasItemFlag(ItemFlag itemFlag) {
                    return false;
                }

                @Override
                public boolean isHideTooltip() {
                    return false;
                }

                @Override
                public void setHideTooltip(boolean b) {

                }

                @Override
                public boolean isUnbreakable() {
                    return false;
                }

                @Override
                public void setUnbreakable(boolean b) {

                }

                @Override
                public boolean hasEnchantmentGlintOverride() {
                    return false;
                }

                @Override
                public Boolean getEnchantmentGlintOverride() {
                    return null;
                }

                @Override
                public void setEnchantmentGlintOverride(Boolean aBoolean) {

                }

                @Override
                public boolean isFireResistant() {
                    return false;
                }

                @Override
                public void setFireResistant(boolean b) {

                }

                @Override
                public boolean hasMaxStackSize() {
                    return false;
                }

                @Override
                public int getMaxStackSize() {
                    return 0;
                }

                @Override
                public void setMaxStackSize(Integer integer) {

                }

                @Override
                public boolean hasRarity() {
                    return false;
                }

                @Override
                public ItemRarity getRarity() {
                    return null;
                }

                @Override
                public void setRarity(ItemRarity itemRarity) {

                }

                @Override
                public boolean hasFood() {
                    return false;
                }

                @Override
                public FoodComponent getFood() {
                    return null;
                }

                @Override
                public void setFood(FoodComponent foodComponent) {

                }

                @Override
                public boolean hasTool() {
                    return false;
                }

                @Override
                public ToolComponent getTool() {
                    return null;
                }

                @Override
                public void setTool(ToolComponent toolComponent) {

                }

                @Override
                public boolean hasJukeboxPlayable() {
                    return false;
                }

                @Override
                public JukeboxPlayableComponent getJukeboxPlayable() {
                    return null;
                }

                @Override
                public void setJukeboxPlayable(JukeboxPlayableComponent jukeboxPlayableComponent) {

                }

                @Override
                public boolean hasAttributeModifiers() {
                    return false;
                }

                @Override
                public Multimap<Attribute, AttributeModifier> getAttributeModifiers() {
                    return null;
                }

                @Override
                public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot) {
                    return null;
                }

                @Override
                public Collection<AttributeModifier> getAttributeModifiers(Attribute attribute) {
                    return List.of();
                }

                @Override
                public boolean addAttributeModifier(Attribute attribute, AttributeModifier attributeModifier) {
                    return false;
                }

                @Override
                public void setAttributeModifiers(Multimap<Attribute, AttributeModifier> multimap) {

                }

                @Override
                public boolean removeAttributeModifier(Attribute attribute) {
                    return false;
                }

                @Override
                public boolean removeAttributeModifier(EquipmentSlot equipmentSlot) {
                    return false;
                }

                @Override
                public boolean removeAttributeModifier(Attribute attribute, AttributeModifier attributeModifier) {
                    return false;
                }

                @Override
                public String getAsString() {
                    return "";
                }

                @Override
                public String getAsComponentString() {
                    return "";
                }

                @Override
                public CustomItemTagContainer getCustomTagContainer() {
                    return null;
                }

                @Override
                public void setVersion(int i) {

                }

                @Override
                public ItemMeta clone() {
                    return null;
                }

                @Override
                public Map<String, Object> serialize() {
                    return null;
                }
            };
        return meta;
    }

    @Override
    public boolean hasItemMeta() {
        return meta != null;
    }

    @Override
    public boolean setItemMeta(ItemMeta itemMeta) {
        meta = itemMeta;
        return true;
    }
}
