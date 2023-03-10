package me.greefox.greefox.me.Greefox;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class Gold extends JavaPlugin {
    public static void init(){
        createGoldKatana();
        createLightGoldKatana();
    }
    public static ItemStack goldKatana;
    private static void createGoldKatana(){
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fGold Katana");
        im.setCustomModelData(8);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -2.7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackDamage", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        goldKatana = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("katana_gold"), item);
        sr.shape("  X", " Y ", "Z  ");
        sr.setIngredient('X', Material.GOLD_INGOT);
        sr.setIngredient('Y', Material.GOLD_BLOCK);
        sr.setIngredient('Z', Material.STICK);
        /*ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("katana_gold2"), item);
        sr2.shape("X  ", " Y ", "  Z");
        sr2.setIngredient('X', Material.GOLD_INGOT);
        sr2.setIngredient('Y', Material.GOLD_BLOCK);
        sr2.setIngredient('Z', Material.STICK);*/
        Bukkit.getServer().addRecipe(sr);
        //Bukkit.getServer().addRecipe(sr2);
    }
    public static ItemStack lightGoldKatana;
    private static void createLightGoldKatana(){
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fLight Gold Katana");
        im.setCustomModelData(9);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(),
                "generic.attackSpeed", -2.4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),
                "generic.attackDamage", 5.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        item.setItemMeta(im);
        lightGoldKatana = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("gold_katana_light"), item);
        sr.shape("  X", " X ", "Z  ");
        sr.setIngredient('X', Material.GOLD_INGOT);
        sr.setIngredient('Z', Material.STICK);
        /*ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("katana_gold_light2"), item);
        sr2.shape("X  ", " X ", "  Z");
        sr2.setIngredient('X', Material.GOLD_INGOT);
        sr2.setIngredient('Z', Material.STICK);*/
        Bukkit.getServer().addRecipe(sr);
        //Bukkit.getServer().addRecipe(sr2);
    }
}
