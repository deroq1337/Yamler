package converter.config;

import com.google.common.collect.Multimap;
import helper.TestItemStack;
import net.cubespace.Yamler.Config.YamlConfig;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemRarity;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.components.FoodComponent;
import org.bukkit.inventory.meta.components.JukeboxPlayableComponent;
import org.bukkit.inventory.meta.components.ToolComponent;
import org.bukkit.inventory.meta.tags.CustomItemTagContainer;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.*;

/**
 * The test configuration to check for a correct working ItemStack.
 *
 * @author bibo38
 * @see converter.ItemStackConverterTest
 */
public class ItemStackTestConfig extends YamlConfig {

    public TestItemStack cookie = new TestItemStack(Material.COOKIE);
    public TestItemStack specialWool = new TestItemStack(Material.WHITE_WOOL);

    /**
     * The default constructor is used to add the {@link net.cubespace.Yamler.Converter.ItemStack} converter
     * and add a special ItemMeta class to the {@link this#specialWool} variable to test the converter.
     *
     * @throws Exception When the converter cannot be added
     */
    public ItemStackTestConfig() throws Exception {
        addConverter(net.cubespace.Yamler.Converter.ItemStack.class);

        specialWool.setItemMeta(new ItemMeta() {
            @Override
            public PersistentDataContainer getPersistentDataContainer() {
                return null;
            }

            @Override
            public boolean hasDisplayName() {
                return true;
            }

            @Override
            public String getDisplayName() {
                return "Test Wool";
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
                return true;
            }

            @Override
            public List<String> getLore() {
                return Arrays.asList("This is Wool", "Good Wool");
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
                return true;
            }

            @Override
            public boolean hasEnchant(Enchantment enchantment) {
                return Enchantment.FORTUNE.equals(enchantment);
            }

            @Override
            public int getEnchantLevel(Enchantment enchantment) {
                return hasEnchant(enchantment) ? 1 : 0;
            }

            @Override
            public Map<Enchantment, Integer> getEnchants() {
                HashMap<Enchantment, Integer> enchantments = new HashMap<>();
                enchantments.put(Enchantment.FORTUNE, 1);
                return enchantments;
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
        });
    }
}
