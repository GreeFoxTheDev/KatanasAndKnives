package me.greefox.greefox.me.Greefox;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class Items extends JavaPlugin {
    public static void init(){
        createIronKatana();
        createLightIronKatana();
    }
    public static ItemStack ironKatana;
    private static void createIronKatana(){
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fIron Katana");
        im.setCustomModelData(8);
        im.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -2.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, damage);
        item.setItemMeta(im);
        ironKatana = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_katana"), item);
        sr.shape("   X", " Y ", "Z  ");
        sr.setIngredient('X', Material.IRON_INGOT);
        sr.setIngredient('Y', Material.IRON_BLOCK);
        sr.setIngredient('Z', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
    public static ItemStack lightIronKatana;
    private static void createLightIronKatana(){
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fLight Iron Katana");
        im.setCustomModelData(9);
        im.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
        item.setItemMeta(im);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", 6.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, damage);
        ironKatana = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_katana_light"), item);
        sr.shape("   X", " Y ", "Z  ");
        sr.setIngredient('X', Material.IRON_INGOT);
        sr.setIngredient('Y', Material.IRON_INGOT);
        sr.setIngredient('Z', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
