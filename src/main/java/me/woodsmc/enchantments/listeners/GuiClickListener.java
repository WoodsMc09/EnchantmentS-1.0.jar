package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.*;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GuiClickListener implements Listener {

    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);
    String confirmtitle = plugin.getConfig().getString("confirmguititle");
    String confirm = ChatColor.translateAlternateColorCodes('&', confirmtitle);
    String prefixs = plugin.getConfig().getString("prefix");
    String prefix = ChatColor.translateAlternateColorCodes('&', prefixs);

    @EventHandler
    public void clickEvent(InventoryClickEvent event) {
        Player p = (Player) event.getWhoClicked();
        Location location = p.getLocation();
        if (event.getClickedInventory() == null) {
        } else if (event.getClickedInventory().getSize() == 0) {
        } else if (event.getCurrentItem() == null) return;
        if (event.getClickedInventory() == null) {
        } else {
            if (event.getClickedInventory().getSize() == 45) {
                if (event.getCurrentItem().getItemMeta().getDisplayName() == null)
                    return;
                if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lAssist")) {
                    p.closeInventory();
                    p.sendMessage("§5§lAssist - §dMaxLvl: 2, Item: Sword, Info: Assists player when on low health, Permission: enchantments.assist");
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lAutoSmelt")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lAutoSmelt - §dMaxLvl: 1, Item: Tools, Info: Autosmelts broken ores, Permission: enchantments.autosmelt");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lCriticals")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lCriticals - §dMaxLvl: 2, Item: Sword, Info: Does more critical attack damage, Permission: enchantments.criticals");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lEscape")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lEscape - §dMaxLvl: 1, Item: Chestplate, Info: Chance to get speed whem being attacked, Permission: enchantments.escape");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lFeathered")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lFeathered - §dMaxLvl: 1, Item: Boots, Info: Shifting makes you slow fall, Permission: enchantments.feathered");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lLifesteal")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lLifesteal - §dMaxLvl: 1, Item: Sword, Info: Steals victims health, Permission: enchantments.lifesteal");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lBlazeslayer")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lBlazeslayer - §dMaxLvl: 1, Item: Sword, Info: Does more damage to blaze, Permission: enchantments.blazeslayer");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lRegenslash")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lRegenslash - §dMaxLvl: 2, Item: Sword, Info: Gives regen when you get a kill, Permission: enchantments.regenslash");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lSnipe")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lSnipe - §dMaxLvl: 3, Item: Bow, Info: Shoot fast arrows, Permission: enchantments.snipe");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§1§lStealth")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lStealth - §dMaxLvl: 1, Item: Leggings, Info: launch away stealthily, Usage: Right-Click-Block + Shifting, Permission: enchantments.stealth");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lTelekinesis")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lTelekinesis - §dMaxLvl: 1, Item: Tools, Info: Broken blocks go straight to inventory, Permission: enchantments.telekinesis");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lUppercut")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lUppercut - §dMaxLvl: 1, Item: Sword, Info: Uppercuts enemys, Permission: enchantments.uppercut");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lVenomous")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lVenomous - §dMaxLvl: 2, Item: Sword, Info: Poisons enemys, Permission: enchantments.venomous");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lVoidless")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lVoidless - §dMaxLvl: 1, Item: Elytra, Info: Saves you from void, Permission: enchantments.voidless");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lWithered")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lWithered - §dMaxLvl: 4, Item: Sword, Info: Withers enemys, Permission: enchantments.withered");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lNext Page")) {
                    //open next page
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lRevive")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lRevive - §dMaxLvl: 1, Item: Chestplate, Info: Prevents attack death (has a 8 second cooldown), Permission: enchantments.revive");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lCurse of Movement")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lMovement Curse - §dMaxLvl: 1, Item: Boots, Info: Curses movement speed, Permission: enchantments.curse.movement");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSaturated")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lSaturated - §dMaxLvl: 5, Item: Helmet, Info: Chance to saturate when walking, Permission: enchantments.saturated");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lRushing")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lRushing - §dMaxLvl: 1, Item: Boots, Info: Gives infinite speed, Permission: enchantments.rushing");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lLeap")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lLeap - §dMaxLvl: 1, Item: Boots, Info: Gives infinite jump boost, Permission: enchantments.leap");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lMolten")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lMolten - §dMaxLvl: 1, Item: Chestplate, Info: Gives infinite fire resistance & chance to apply fire to enemy, Permission: enchantments.molten");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lCurse of Sight")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lSight Curse - §dMaxLvl: 1, Item: Helmet, Info: Randomly applys blindness, Permission: enchantments.curse.sight");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9§lFatal Blow")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lFatal Blow - §dMaxLvl: 1, Item: Leggings, Info: Explodes on death, Permission: enchantments.fatalblow");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lHealth Boost")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lHealth Boost - §dMaxLvl: 3, Item: Chestplate, Info: Gives more hearts, Permission: enchantments.healthboost");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lBossSlayer")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lBossSlayer - §dMaxLvl: 1, Item: Sword, Info: Does more damage to bosses, Permission: enchantments.bossslayer");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lHydration")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lHydration - §dMaxLvl: 2, Item: Helmet, Info: Gives potion effects when you drink a bottle of water, Permission: enchantments.hydration");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lDolphin")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lDolphin - §dMaxLvl: 1, Item: Boots, Info: Gives dolphins grace when swimming, Permission: enchantments.dolphin");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§1§lMomentum")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lMomentum - §dMaxLvl: 1, Item: Elytra, Info: Randomly gives elytra speed when flying, Permission: enchantments.momentum");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lElectricTip")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lElectricTip - §dMaxLvl: 1, Item: Bow, Info: Chance to strike (player) victim with lightning, Permission: enchantments.electrictip");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lLavaWalk")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lLavaWalk - §dMaxLvl: 1, Item: Boots, Info: Walk on lava, Permission: enchantments.lavawalk");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lMinersGrace")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lMinersGrace - §dMaxLvl: 1, Item: Pickaxe, Info: Removes miners fatigue, Permission: enchantments.minersgrace");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lMinersLuck")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lMinersLuck - §dMaxLvl: 2, Item: Pickaxe, Info: Chance to drop valuables from deepslate and stone, Permission: enchantments.minersluck");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lExperienced")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lExperienced - §dMaxLvl: 2, Item: Pickaxe, Info: Gives exp from iron and gold ore, Permission: enchantments.experienced");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lFanged")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lFanged - §dMaxLvl: 1, Item: Armor, Info: Summons evoker fangs to damager when half health, Permission: enchantments.fanged");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lCrop")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lCrop - §dMaxLvl: 1, Item: Hoe, Info: Gives 3 bone meal when you break a fully grown crop, Permission: enchantments.crop");
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lFloat")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.sendMessage("§5§lFloat - §dMaxLvl: 1, Item: Bow, Info: Makes hit player float Permission: enchantments.float");
                } else {
                }
                event.setCancelled(true);
            } else if (event.getClickedInventory().getSize() == 36) {
                if (event.getCurrentItem() == null)
                    return;
                if (event.getCurrentItem().getItemMeta().getDisplayName() == null)
                    return;
                if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lAssist")) {
                    if (p.hasPermission("enchantments.assist")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory assistgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§4§lAssist Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§4§lAssist Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        assistgui.setItem(3, lvl1);
                        assistgui.setItem(5, lvl2);
                        p.openInventory(assistgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lAutoSmelt")) {
                    if (p.hasPermission("enchantments.autosmelt")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(AutosmeltRegister.AUTOSMELT, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bAutosmelt I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: autosmelt");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lCriticals")) {
                    if (p.hasPermission("enchantments.criticals")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory criticalsgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§e§lCriticals Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§e§lCriticals Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        criticalsgui.setItem(3, lvl1);
                        criticalsgui.setItem(5, lvl2);
                        p.openInventory(criticalsgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lEscape")) {
                    if (p.hasPermission("enchantments.escape")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(EscapeRegister.ESCAPE, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§eEscape I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: escape");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lFeathered")) {
                    if (p.hasPermission("enchantments.feathered")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FeatheredRegister.FEATHERED, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§dFeathered I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: feathered");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lLifesteal")) {
                    if (p.hasPermission("enchantments.lifesteal")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(LifestealRegister.LIFESTEAL, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§cLifesteal I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: lifesteal");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lBlazeslayer")) {
                    if (p.hasPermission("enchantments.blazeslayer")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(NetherSlayerRegister.NETHERSLAYER, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aBlazeslayer I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: blazeslayer");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lRegenslash")) {
                    if (p.hasPermission("enchantments.regenslash")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory regenslashgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§d§lRegenslash Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§d§lRegenslash Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        regenslashgui.setItem(3, lvl1);
                        regenslashgui.setItem(5, lvl2);
                        p.openInventory(regenslashgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lSnipe")) {
                    if (p.hasPermission("enchantments.snipe")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory snipegui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§5§lSnipe Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§5§lSnipe Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        lvl3Meta.setDisplayName("§5§lSnipe Level 3");
                        lvl3.setItemMeta(lvl3Meta);
                        snipegui.setItem(3, lvl1);
                        snipegui.setItem(4, lvl2);
                        snipegui.setItem(5, lvl3);
                        p.openInventory(snipegui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§1§lStealth")) {
                    if (p.hasPermission("enchantments.stealth")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(StealthRegister.STEALTH, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§1Stealth I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: stealth");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lTelekinesis")) {
                    if (p.hasPermission("enchantments.telekinesis")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(TelekinesisRegister.TELEKINESIS, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bTelekinesis");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: telekinesis");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lUppercut")) {
                    if (p.hasPermission("enchantments.uppercut")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(UppercutRegister.UPPERCUT, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§3Uppercut I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: uppercut");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lVenomous")) {
                    if (p.hasPermission("enchantments.venomous")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory venomousgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§5§lVenomous Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§5§lVenomous Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        venomousgui.setItem(3, lvl1);
                        venomousgui.setItem(5, lvl2);
                        p.openInventory(venomousgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lVoidless")) {
                    if (p.hasPermission("enchantments.voidless")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(VoidlessRegister.VOIDLESS, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§eVoidless I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: voidless");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lWithered")) {
                    if (p.hasPermission("enchantments.withered")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory witheredgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemStack lvl4 = new ItemStack(Material.ENCHANTED_BOOK, 4);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        ItemMeta lvl4Meta = lvl4.getItemMeta();
                        lvl1Meta.setDisplayName("§5§lWithered Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        lvl2Meta.setDisplayName("§5§lWithered Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        lvl3Meta.setDisplayName("§5§lWithered Level 3");
                        lvl3.setItemMeta(lvl3Meta);
                        lvl4Meta.setDisplayName("§5§lWithered Level 4");
                        lvl4.setItemMeta(lvl4Meta);
                        witheredgui.setItem(2, lvl1);
                        witheredgui.setItem(3, lvl2);
                        witheredgui.setItem(5, lvl3);
                        witheredgui.setItem(6, lvl4);
                        p.openInventory(witheredgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lNext Page")) {
                    //open next page
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lRevive")) {
                    if (p.hasPermission("enchantments.revive")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(ReviveRegister.REVIVE, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§dRevive I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: revive");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lCurse of Movement")) {
                    if (p.hasPermission("enchantments.curse.movement")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MovementRegister.MOVEMENT, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§cCurse of Movement");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded curse: movement");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSaturated")) {
                    if (p.hasPermission("enchantments.saturated")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory saturatedgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemStack lvl4 = new ItemStack(Material.ENCHANTED_BOOK, 4);
                        ItemStack lvl5 = new ItemStack(Material.ENCHANTED_BOOK, 5);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§e§lSaturated Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§e§lSaturated Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        lvl3Meta.setDisplayName("§e§lSaturated Level 3");
                        lvl3.setItemMeta(lvl3Meta);
                        ItemMeta lvl4Meta = lvl4.getItemMeta();
                        lvl4Meta.setDisplayName("§e§lSaturated Level 4");
                        lvl4.setItemMeta(lvl4Meta);
                        ItemMeta lvl5Meta = lvl5.getItemMeta();
                        lvl5Meta.setDisplayName("§e§lSaturated Level 5");
                        lvl5.setItemMeta(lvl5Meta);
                        saturatedgui.setItem(2, lvl1);
                        saturatedgui.setItem(3, lvl2);
                        saturatedgui.setItem(4, lvl3);
                        saturatedgui.setItem(5, lvl4);
                        saturatedgui.setItem(6, lvl5);
                        p.openInventory(saturatedgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lRushing")) {
                    if (p.hasPermission("enchantments.rushing")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory rushinggui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§3§lRushing Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§3§lRushing Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        rushinggui.setItem(3, lvl1);
                        rushinggui.setItem(5, lvl2);
                        p.openInventory(rushinggui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lLeap")) {
                    if (p.hasPermission("enchantments.leap")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(LeapRegister.LEAP, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aLeap");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: leap");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lMolten")) {
                    if (p.hasPermission("enchantments.molten")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MoltenRegister.MOLTEN, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§6Molten I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: molten");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lCurse of Sight")) {
                    if (p.hasPermission("enchantments.curse.sight")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(SightRegister.SIGHT, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§cCurse of Sight");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded curse: sight");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9§lFatal Blow")) {
                    if (p.hasPermission("enchantments.fatalblow")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FatalBlowRegister.FATALBLOW, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§9Fatal Blow");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded curse: fatalblow");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lHealth Boost")) {
                    if (p.hasPermission("enchantments.healthboost")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory healthboostgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§d§lHealth Boost Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§d§lHealth Boost Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        lvl3Meta.setDisplayName("§d§lHealth Boost Level 3");
                        lvl3.setItemMeta(lvl3Meta);
                        healthboostgui.setItem(3, lvl1);
                        healthboostgui.setItem(4, lvl2);
                        healthboostgui.setItem(5, lvl3);
                        p.openInventory(healthboostgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lBossSlayer")) {
                    if (p.hasPermission("enchantments.bossslayer")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(BossSlayerRegister.BOSSSLAYER, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aBossSlayer I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: bossslayer");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lHydration")) {
                    if (p.hasPermission("enchantments.hydration")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory hydrationgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§3§lHydration Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§3§lHydration Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        hydrationgui.setItem(3, lvl1);
                        hydrationgui.setItem(5, lvl2);
                        p.openInventory(hydrationgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lDolphin")) {
                    if (p.hasPermission("enchantments.dolphin")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(DolphinRegister.DOLPHIN, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bDolphin I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: dolphin");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§1§lMomentum")) {
                    if (p.hasPermission("enchantments.dolphin")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MomentumRegister.MOMENTUM, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§1Momentum I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: momentum");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lElectricTip")) {
                    if (p.hasPermission("enchantments.electrictip")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(ElectricTipRegister.ELECTRICTIP, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bElectricTip I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: electrictip");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lLavaWalk")) {
                    if (p.hasPermission("enchantments.lavawalk")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(LavaWalkRegister.LAVAWALK, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§6LavaWalk I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: lavawalk");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lMinersGrace")) {
                    if (p.hasPermission("enchantments.minersgrace")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MinersGraceRegister.MINERSGRACE, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aMinersGrace I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: minersgrace");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lMinersLuck")) {
                    if (p.hasPermission("enchantments.minersluck")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory minersluckgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§6§lMinersLuck Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§6§lMinersLuck Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        minersluckgui.setItem(3, lvl1);
                        minersluckgui.setItem(5, lvl2);
                        p.openInventory(minersluckgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lExperienced")) {
                    if (p.hasPermission("enchantments.experienced")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory experiencedgui = Bukkit.createInventory(p, 9, confirm);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        lvl1Meta.setDisplayName("§e§lExperienced Level 1");
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        lvl2Meta.setDisplayName("§e§lExperienced Level 2");
                        lvl2.setItemMeta(lvl2Meta);
                        experiencedgui.setItem(3, lvl1);
                        experiencedgui.setItem(5, lvl2);
                        p.openInventory(experiencedgui);
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lFanged")) {
                    if (p.hasPermission("enchantments.fanged")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FangedRegister.FANGED, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§4Fanged I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: fanged");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lCrop")) {
                    if (p.hasPermission("enchantments.crop")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(CropRegister.CROP, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aCrop I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: crop");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lFloat")) {
                    if (p.hasPermission("enchantments.float")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        p.closeInventory();
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FloatRegister.FLOAT, 1);
                        ItemStack item = p.getInventory().getItemInMainHand();
                        ItemMeta meta = item.getItemMeta();
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bFloat I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.sendMessage(prefix + " §aAdded enchantment: float");
                        if (item.getItemMeta() == null) return;
                    } else {
                        p.sendMessage("§cYou do not have permssion to execute this command!");
                        p.closeInventory();
                    }
                }else { }

                event.setCancelled(true);



            } else if (event.getClickedInventory().getSize() == 9) {
                if (event.getCurrentItem() == null)
                    return;
                if (event.getCurrentItem().getItemMeta().getDisplayName() == null)
                    return;
                if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lAssist Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(AssistRegister.ASSIST, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: assist");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§4Assist I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lAssist Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(AssistIIRegister.ASSISTII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: assist 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§4Assist II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lCriticals Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(CriticalsRegister.CRITICALS, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: criticals");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eCriticals I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lCriticals Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(CriticalsIIRegister.CRITICALSII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: criticals 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eCriticals II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lRegenslash Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(RegenslashRegister.REGENSLASH, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: regenslash");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§dRegenslash I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lRegenslash Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(RegenslashIIRegister.REGENSLASHII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: regenslash 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§dRegenslash II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lSnipe Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SnipeRegister.SNIPE, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: snipe");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Snipe I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lSnipe Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SnipeIIRegister.SNIPEII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: snipe 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Snipe II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lSnipe Level 3")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SnipeIIIRegister.SNIPEIII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: snipe 3");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Snipe III");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lVenomous Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(VenomousRegister.VENOMOUS, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: venomous");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Venomous I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lVenomous Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(VenomousIIRegister.VENOMOUSII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: venomous 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Venomous II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lWithered Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredRegister.WITHERED, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: withered");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Withered I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lWithered Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredIIRegister.WITHEREDII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: withered 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Withered II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lWithered Level 3")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredIIIRegister.WITHEREDIII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: withered 3");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Withered III");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5§lWithered Level 4")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredIVRegister.WITHEREDIV, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: withered 4");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§5Withered IV");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSaturated Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedRegister.SATURATED, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: saturated");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eSaturated I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSaturated Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedIIRegister.SATURATEDII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: saturated 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eSaturated II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSaturated Level 3")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedIIIRegister.SATURATEDIII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: saturated 3");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eSaturated III");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSaturated Level 4")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedIVRegister.SATURATEDIV, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: saturated 4");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eSaturated IV");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSaturated Level 5")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedVRegister.SATURATEDV, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: saturated 5");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eSaturated V");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lRushing Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(RushingRegister.RUSHING, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: rushing");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§3Rushing I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lRushing Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(RushingIIRegister.RUSHINGII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: rushing 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§3Rushing II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lHealth Boost Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(HealthBoostRegister.HEALTHBOOST, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: healthboost");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 12, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
                    meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
                    meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§dHealth Boost I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lHealth Boost Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(HealthBoostIIRegister.HEALTHBOOSTII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: healthboost 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 16, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
                    meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
                    meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§dHealth Boost II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lHealth Boost Level 3")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(HealthBoostIIIRegister.HEALTHBOOSTIII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: healthboost 3");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 18, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
                    meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
                    meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§dHealth Boost III");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lHydration Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(HydrationRegister.HYDRATION, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: hydration");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§3Hydration I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3§lHydration Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(HydrationIIRegister.HYDRATIONII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: hydration 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§3Hydration II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lMinersLuck Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(MinersLuckRegister.MINERSLUCK, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: minersluck");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§6MinersLuck I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lMinersLuck Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(MinersLuckIIRegister.MINERSLUCK, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: minersluck 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§6MinersLuck II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lExperienced Level 1")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(ExperiencedRegister.EXPERIENCED, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: experienced");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eExperienced I");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lExperienced Level 2")) {
                    p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                    p.closeInventory();
                    p.getInventory().getItemInMainHand().addUnsafeEnchantment(ExperiencedIIRegister.EXPERIENCEDII, 1);
                    p.sendMessage(prefix + " §aAdded enchantment: experienced 2");
                    ItemStack item = p.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                    lore.add("§eExperienced II");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    if (item.getItemMeta() == null) return;
                } else {
                }
                event.setCancelled(true);
            }

        }
    }
}

