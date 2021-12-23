package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.*;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class ShopGuiClickListener implements Listener {

    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);

    double assistShop = plugin.getConfig().getDouble("Assist_Price");
    double assistIIShop = plugin.getConfig().getDouble("AssistII_Price");
    double autosmeltShop = plugin.getConfig().getDouble("Autosmelt_Price");
    double bossslayerShop = plugin.getConfig().getDouble("Bossslayer_Price");
    double criticalsShop = plugin.getConfig().getDouble("Criticals_Price");
    double criticalsIIShop = plugin.getConfig().getDouble("CriticalsII_Price");
    double escapeShop = plugin.getConfig().getDouble("Escape_Price");
    double fatalblowShop = plugin.getConfig().getDouble("FatalBlow_Price");
    double featheredShop = plugin.getConfig().getDouble("Feathered_Price");
    double healthboostShop = plugin.getConfig().getDouble("Healthboost_Price");
    double healthboostIIShop = plugin.getConfig().getDouble("HealthboostII_Price");
    double healthboostIIIShop = plugin.getConfig().getDouble("HealthboostIII_Price");
    double hydrationShop = plugin.getConfig().getDouble("Hydration_Price");
    double hydrationIIShop = plugin.getConfig().getDouble("HydrationII_Price");
    double leapShop = plugin.getConfig().getDouble("Leap_Price");
    double lifestealShop = plugin.getConfig().getDouble("Lifesteal_Price");
    double moltenShop = plugin.getConfig().getDouble("Molten_Price");
    double momentumShop = plugin.getConfig().getDouble("Momentum_Price");
    double curseMovementShop = plugin.getConfig().getDouble("Curse_Movement_Price");
    double blazeslayerShop = plugin.getConfig().getDouble("Blazeslayer_Price");
    double regenslashShop = plugin.getConfig().getDouble("Regenslash_Price");
    double regenslashIIShop = plugin.getConfig().getDouble("RegenslashII_Price");
    double reviveShop = plugin.getConfig().getDouble("Revive_Price");
    double rushingShop = plugin.getConfig().getDouble("Rushing_Price");
    double rushingIIShop = plugin.getConfig().getDouble("RushingII_Price");
    double saturatedShop = plugin.getConfig().getDouble("Saturated_Price");
    double saturatedIIShop = plugin.getConfig().getDouble("SaturatedII_Price");
    double saturatedIIIShop = plugin.getConfig().getDouble("SaturatedIII_Price");
    double saturatedIVShop = plugin.getConfig().getDouble("SaturatedIV_Price");
    double saturatedVShop = plugin.getConfig().getDouble("SaturatedV_Price");
    double curseSightShop = plugin.getConfig().getDouble("Curse_Sight_Price");
    double snipeShop = plugin.getConfig().getDouble("Snipe_Price");
    double snipeIIShop = plugin.getConfig().getDouble("SnipeII_Price");
    double snipeIIIShop = plugin.getConfig().getDouble("SnipeIII_Price");
    double stealthShop = plugin.getConfig().getDouble("Stealth_Price");
    double telekinesisShop = plugin.getConfig().getDouble("Telekinesis_Price");
    double uppercutShop = plugin.getConfig().getDouble("Uppercut_Price");
    double venomousShop = plugin.getConfig().getDouble("Venomous_Price");
    double venomousIIShop = plugin.getConfig().getDouble("VenomousII_Price");
    double voidlessShop = plugin.getConfig().getDouble("Voidless_Price");
    double witheredShop = plugin.getConfig().getDouble("Withered_Price");
    double witheredIIShop = plugin.getConfig().getDouble("WitheredII_Price");
    double witheredIIIShop = plugin.getConfig().getDouble("WitheredIII_Price");
    double witheredIVShop = plugin.getConfig().getDouble("WitheredIV_Price");
    double dolphinShop = plugin.getConfig().getDouble("Dolphin_Price");
    double electrictipShop = plugin.getConfig().getDouble("ElectricTip_Price");
    double lavawalkShop = plugin.getConfig().getDouble("LavaWalk_Price");
    double minersgraceShop = plugin.getConfig().getDouble("MinersGrace_Price");
    double minersluckShop = plugin.getConfig().getDouble("MinersLuck_Price");
    double minersluckIIShop = plugin.getConfig().getDouble("MinersLuckII_Price");
    double experiencedShop = plugin.getConfig().getDouble("Experienced_Price");
    double experiencedIIShop = plugin.getConfig().getDouble("ExperiencedII_Price");
    double fangedShop = plugin.getConfig().getDouble("Fanged_Price");
    double cropShop = plugin.getConfig().getDouble("Crop_Price");
    double floatShop = plugin.getConfig().getDouble("Float_Price");

    String confirm = plugin.getConfig().getString("confirmguititle");
    String confirmtitle = ChatColor.translateAlternateColorCodes('&', confirm);
    String prefix = plugin.getConfig().getString("prefix");

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player p = (Player) event.getWhoClicked();
        Location location = p.getLocation();
        if (event.getCurrentItem() == null) {
        } else {
            if (event.getCurrentItem().getItemMeta() == null) {
            } else {
                String item = event.getCurrentItem().getItemMeta().getDisplayName();
                if (event.getClickedInventory().getSize() == 54) {
                    if (item.equalsIgnoreCase("§4§lAssist")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory assistgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + assistShop);
                        lvl1Meta.setDisplayName("§4§lAssist Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + assistIIShop);
                        lvl2Meta.setDisplayName("§4§lAssist Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        assistgui.setItem(3, lvl1);
                        assistgui.setItem(5, lvl2);
                        p.openInventory(assistgui);

                    } else if (item.equalsIgnoreCase("§d§lAutoSmelt")) {
                        if (p.hasPermission("enchantments.shop.autosmelt")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= autosmeltShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§bAutosmelt I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(AutosmeltRegister.AUTOSMELT, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: autosmelt");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, autosmeltShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + autosmeltShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§a§lBossSlayer")) {
                        if (p.hasPermission("enchantments.shop.bossslayer")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= bossslayerShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§aBossSlayer I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(BossSlayerRegister.BOSSSLAYER, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: bossslayer");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, bossslayerShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + bossslayerShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lCriticals")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory criticalsgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + criticalsShop);
                        lvl1Meta.setDisplayName("§e§lCriticals Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + criticalsIIShop);
                        lvl2Meta.setDisplayName("§e§lCriticals Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        criticalsgui.setItem(3, lvl1);
                        criticalsgui.setItem(5, lvl2);
                        p.openInventory(criticalsgui);

                    } else if (item.equalsIgnoreCase("§b§lDolphin")) {
                        if (p.hasPermission("enchantments.shop.dolphin")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= dolphinShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§bDolphin I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(DolphinRegister.DOLPHIN, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: dolphin");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, 100);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + dolphinShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§b§lEscape")) {
                        if (p.hasPermission("enchantments.shop.escape")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= escapeShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§dEscape I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(EscapeRegister.ESCAPE, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: escape");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, escapeShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + escapeShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§9§lFatal Blow")) {
                        if (p.hasPermission("enchantments.shop.fatalblow")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= fatalblowShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§9Fatal Blow I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(FatalBlowRegister.FATALBLOW, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: fatalblow");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, fatalblowShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + fatalblowShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§d§lFeathered")) {
                        if (p.hasPermission("enchantments.shop.feathered")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= featheredShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§bFeathered I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(FeatheredRegister.FEATHERED, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: feathered");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, featheredShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + featheredShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lHydration")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory hydrationgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + hydrationShop);
                        lvl1Meta.setDisplayName("§3§lHydration Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + hydrationIIShop);
                        lvl2Meta.setDisplayName("§3§lHydration Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        hydrationgui.setItem(3, lvl1);
                        hydrationgui.setItem(5, lvl2);
                        p.openInventory(hydrationgui);

                    } else if (item.equalsIgnoreCase("§a§lLeap")) {
                        if (p.hasPermission("enchantments.shop.leap")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= leapShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§aLeap I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(LeapRegister.LEAP, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased " + event.getCurrentItem().getItemMeta().getDisplayName());
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, leapShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + leapShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§c§lLifesteal")) {
                        if (p.hasPermission("enchantments.shop.lifesteal")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= lifestealShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§7Lifesteal I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(LifestealRegister.LIFESTEAL, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: lifesteal");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, lifestealShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + lifestealShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§6§lMolten")) {
                        if (p.hasPermission("enchantments.shop.molten")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= moltenShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§6Molten I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(MoltenRegister.MOLTEN, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: molten");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, moltenShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + moltenShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§1§lMomentum")) {
                        if (p.hasPermission("enchantments.shop.momentum")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= momentumShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§1Momentum I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(MomentumRegister.MOMENTUM, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: momentum");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, momentumShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + momentumShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§c§lCurse of Movement")) {
                        if (p.hasPermission("enchantments.shop.curse.movement")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= curseMovementShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§cCurse of Movement");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(MovementRegister.MOVEMENT, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: curse of movement");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, curseMovementShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + curseMovementShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§a§lBlazeslayer")) {
                        if (p.hasPermission("enchantments.shop.blazeslayer")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= blazeslayerShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§aBlazeslayer I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(NetherSlayerRegister.NETHERSLAYER, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: blazeslayer");

                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, blazeslayerShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + blazeslayerShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§d§lRegenslash")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory regenslashgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + regenslashShop);
                        lvl1Meta.setDisplayName("§d§lRegenslash Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + regenslashIIShop);
                        lvl2Meta.setDisplayName("§d§lRegenslash Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        regenslashgui.setItem(3, lvl1);
                        regenslashgui.setItem(5, lvl2);
                        p.openInventory(regenslashgui);

                    } else if (item.equalsIgnoreCase("§d§lRevive")) {
                        if (p.hasPermission("enchantments.shop.revive")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= reviveShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§dRevive I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(ReviveRegister.REVIVE, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: revive");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, reviveShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + reviveShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lRushing")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory rushinggui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + rushingShop);
                        lvl1Meta.setDisplayName("§3§lRushing Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + rushingIIShop);
                        lvl2Meta.setDisplayName("§3§lRushing Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        rushinggui.setItem(3, lvl1);
                        rushinggui.setItem(5, lvl2);
                        p.openInventory(rushinggui);

                    } else if (item.equalsIgnoreCase("§e§lSaturated")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory saturatedgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemStack lvl4 = new ItemStack(Material.ENCHANTED_BOOK, 4);
                        ItemStack lvl5 = new ItemStack(Material.ENCHANTED_BOOK, 5);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + saturatedShop);
                        lvl1Meta.setDisplayName("§e§lSaturated Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);

                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + saturatedIIShop);
                        lvl2Meta.setDisplayName("§e§lSaturated Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);

                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        List<String> lore3 = lvl3Meta.hasLore() ? lvl3Meta.getLore() : new ArrayList<>();
                        lore3.add("§2Buy: §a" + saturatedIIIShop);
                        lvl3Meta.setDisplayName("§e§lSaturated Level 3 Enchantment");
                        lvl3Meta.setLore(lore3);
                        lvl3.setItemMeta(lvl3Meta);

                        ItemMeta lvl4Meta = lvl4.getItemMeta();
                        List<String> lore4 = lvl4Meta.hasLore() ? lvl4Meta.getLore() : new ArrayList<>();
                        lore4.add("§2Buy: §a" + saturatedIVShop);
                        lvl4Meta.setDisplayName("§e§lSaturated Level 4 Enchantment");
                        lvl4Meta.setLore(lore4);
                        lvl2.setItemMeta(lvl4Meta);

                        ItemMeta lvl5Meta = lvl5.getItemMeta();
                        List<String> lore5 = lvl5Meta.hasLore() ? lvl5Meta.getLore() : new ArrayList<>();
                        lore5.add("§2Buy: §a" + saturatedVShop);
                        lvl5Meta.setDisplayName("§e§lSaturated Level 4 Enchantment");
                        lvl5Meta.setLore(lore5);
                        lvl5.setItemMeta(lvl5Meta);


                        saturatedgui.setItem(2, lvl1);
                        saturatedgui.setItem(3, lvl2);
                        saturatedgui.setItem(4, lvl3);
                        saturatedgui.setItem(5, lvl4);
                        saturatedgui.setItem(6, lvl5);
                        p.openInventory(saturatedgui);

                    } else if (item.equalsIgnoreCase("§c§lCurse of Sight")) {
                        if (p.hasPermission("enchantments.shop.curse.sight")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= curseSightShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§cCurse of Sight");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SightRegister.SIGHT, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: curse of sight");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, curseSightShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + curseSightShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§5§lSnipe")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory snipegui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + snipeShop);
                        lvl1Meta.setDisplayName("§5§lSnipe Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + snipeIIShop);
                        lvl2Meta.setDisplayName("§5§lSnipe Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        List<String> lore3 = lvl3Meta.hasLore() ? lvl3Meta.getLore() : new ArrayList<>();
                        lore3.add("§2Buy: §a" + snipeIIIShop);
                        lvl3Meta.setDisplayName("§5§lSnipe Level 3 Enchantment");
                        lvl3Meta.setLore(lore3);
                        lvl3.setItemMeta(lvl3Meta);
                        snipegui.setItem(3, lvl1);
                        snipegui.setItem(4, lvl2);
                        snipegui.setItem(5, lvl3);
                        p.openInventory(snipegui);

                    } else if (item.equalsIgnoreCase("§1§lStealth")) {
                        if (p.hasPermission("enchantments.shop.stealth")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= stealthShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§1Stealth I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(StealthRegister.STEALTH, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: stealth");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, stealthShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + stealthShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§b§lTelekinesis")) {
                        if (p.hasPermission("enchantments.shop.telekinesis")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= telekinesisShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§bTelekinesis I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(TelekinesisRegister.TELEKINESIS, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: telekinesis");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, telekinesisShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + telekinesisShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lUppercut")) {
                        if (p.hasPermission("enchantments.shop.uppercut")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= uppercutShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§3Uppercut I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(UppercutRegister.UPPERCUT, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: uppercut");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, uppercutShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + uppercutShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lRushing")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory rushinggui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + rushingShop);
                        lvl1Meta.setDisplayName("§3§lRushing Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + rushingIIShop);
                        lvl2Meta.setDisplayName("§3§lRushing Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        rushinggui.setItem(3, lvl1);
                        rushinggui.setItem(5, lvl2);
                        p.openInventory(rushinggui);

                    } else if (item.equalsIgnoreCase("§5§lVenomous")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory venomousgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + venomousShop);
                        lvl1Meta.setDisplayName("§5§lVenomous Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + venomousIIShop);
                        lvl2Meta.setDisplayName("§5§lVenomous Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        venomousgui.setItem(3, lvl1);
                        venomousgui.setItem(5, lvl2);
                        p.openInventory(venomousgui);

                    } else if (item.equalsIgnoreCase("§e§lVoidless")) {
                        if (p.hasPermission("enchantments.shop.voidless")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= voidlessShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eVoidless I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(VoidlessRegister.VOIDLESS, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: voidless");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, voidlessShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + voidlessShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§5§lWithered")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory witheredgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemStack lvl4 = new ItemStack(Material.ENCHANTED_BOOK, 4);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + witheredShop);
                        lvl1Meta.setDisplayName("§5§lWithered Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + witheredIIShop);
                        lvl2Meta.setDisplayName("§5§lWithered Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        List<String> lore3 = lvl3Meta.hasLore() ? lvl3Meta.getLore() : new ArrayList<>();
                        lore3.add("§2Buy: §a" + witheredIIIShop);
                        lvl3Meta.setDisplayName("§5§lWithered Level 3 Enchantment");
                        lvl3Meta.setLore(lore3);
                        lvl3.setItemMeta(lvl3Meta);
                        ItemMeta lvl4Meta = lvl4.getItemMeta();
                        List<String> lore4 = lvl4Meta.hasLore() ? lvl4Meta.getLore() : new ArrayList<>();
                        lore4.add("§2Buy: §a" + witheredIVShop);
                        lvl4Meta.setDisplayName("§5§lWithered Level 4 Enchantment");
                        lvl4Meta.setLore(lore4);
                        lvl4.setItemMeta(lvl4Meta);
                        witheredgui.setItem(2, lvl1);
                        witheredgui.setItem(3, lvl2);
                        witheredgui.setItem(5, lvl3);
                        witheredgui.setItem(6, lvl4);
                        p.openInventory(witheredgui);

                    }else if (item.equalsIgnoreCase("§b§lElectricTip")) {
                        if (p.hasPermission("enchantments.shop.electrictip")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= electrictipShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§bElectricTip I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(ElectricTipRegister.ELECTRICTIP, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: electrictip");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, electrictipShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + electrictipShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§6§lLavaWalk")) {
                        if (p.hasPermission("enchantments.shop.lavawalk")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= lavawalkShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§6LavaWalk I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(LavaWalkRegister.LAVAWALK, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: lavawalk");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, lavawalkShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + lavawalkShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§d§lHealth Boost")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory healthboostgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemStack lvl3 = new ItemStack(Material.ENCHANTED_BOOK, 3);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + healthboostShop);
                        lvl1Meta.setDisplayName("§d§lHealthBoost Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + healthboostIIShop);
                        lvl2Meta.setDisplayName("§d§lHealthBoost Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        ItemMeta lvl3Meta = lvl3.getItemMeta();
                        List<String> lore3 = lvl3Meta.hasLore() ? lvl3Meta.getLore() : new ArrayList<>();
                        lore3.add("§2Buy: §a" + healthboostIIIShop);
                        lvl3Meta.setDisplayName("§d§lHealthBoost Level 3 Enchantment");
                        lvl3Meta.setLore(lore3);
                        lvl3.setItemMeta(lvl3Meta);
                        healthboostgui.setItem(3, lvl1);
                        healthboostgui.setItem(4, lvl2);
                        healthboostgui.setItem(5, lvl3);
                        p.openInventory(healthboostgui);

                    }else if (item.equalsIgnoreCase("§a§lMinersGrace")) {
                        if (p.hasPermission("enchantments.shop.minersgrace")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= minersgraceShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§aMinersGrace I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(MinersGraceRegister.MINERSGRACE, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: lavawalk");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, minersgraceShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + minersgraceShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§6§lMinersLuck")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory minersluckgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + minersluckShop);
                        lvl1Meta.setDisplayName("§6§lMinersLuck Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + minersluckIIShop);
                        lvl2Meta.setDisplayName("§6§lMinersLuck Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        minersluckgui.setItem(3, lvl1);
                        minersluckgui.setItem(5, lvl2);
                        p.openInventory(minersluckgui);

                    }else if (item.equalsIgnoreCase("§e§lExperienced")) {
                        p.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 0.9F, 0);
                        Inventory experiencedgui = Bukkit.createInventory(p, 9, confirmtitle);
                        ItemStack lvl1 = new ItemStack(Material.ENCHANTED_BOOK, 1);
                        ItemStack lvl2 = new ItemStack(Material.ENCHANTED_BOOK, 2);
                        ItemMeta lvl1Meta = lvl1.getItemMeta();
                        List<String> lore1 = lvl1Meta.hasLore() ? lvl1Meta.getLore() : new ArrayList<>();
                        lore1.add("§2Buy: §a" + experiencedShop);
                        lvl1Meta.setDisplayName("§e§lExperienced Level 1 Enchantment");
                        lvl1Meta.setLore(lore1);
                        lvl1.setItemMeta(lvl1Meta);
                        ItemMeta lvl2Meta = lvl2.getItemMeta();
                        List<String> lore2 = lvl2Meta.hasLore() ? lvl2Meta.getLore() : new ArrayList<>();
                        lore2.add("§2Buy: §a" + experiencedIIShop);
                        lvl2Meta.setDisplayName("§e§lExperienced Level 2 Enchantment");
                        lvl2Meta.setLore(lore2);
                        lvl2.setItemMeta(lvl2Meta);
                        experiencedgui.setItem(3, lvl1);
                        experiencedgui.setItem(5, lvl2);
                        p.openInventory(experiencedgui);

                    }else if (item.equalsIgnoreCase("§4§lFanged")) {
                        if (p.hasPermission("enchantments.shop.fanged")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= fangedShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§4Fanged I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(FangedRegister.FANGED, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: fanged");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, fangedShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + fangedShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§a§lCrop")) {
                        if (p.hasPermission("enchantments.shop.crop")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= cropShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§aCrop I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(CropRegister.CROP, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: crop");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, cropShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + cropShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§b§lFloat")) {
                        if (p.hasPermission("enchantments.shop.float")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= floatShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§bFloat I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(FloatRegister.FLOAT, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: float");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, floatShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + floatShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }




                    event.setCancelled(true);
                } else if (event.getClickedInventory().getSize() == 9) {
                    if (item.equalsIgnoreCase("§4§lAssist Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.assist")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= assistShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§4Assist I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(AssistRegister.ASSIST, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: assist");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, assistShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + assistShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§4§lAssist Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.assist")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= assistIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§4Assist II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(AssistIIRegister.ASSISTII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: assist 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, assistIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + assistIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lCriticals Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.criticals")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= criticalsShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eCriticals I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(CriticalsRegister.CRITICALS, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: criticals");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, criticalsShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + criticalsShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lCriticals Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.criticals")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= criticalsIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eCriticals II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(CriticalsIIRegister.CRITICALSII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: criticals 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, criticalsIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + criticalsIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lHydration Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.hydration")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= hydrationShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§3Hydration I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(HydrationRegister.HYDRATION, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: hydration");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, hydrationShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + hydrationShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lHydration Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.hydration")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= hydrationIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§3Hydration II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(HydrationIIRegister.HYDRATIONII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: hydration 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, hydrationIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + hydrationIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§d§lRegenslash Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.regenslash")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= regenslashShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§dRegenslash I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(RegenslashRegister.REGENSLASH, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: regenslash");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, regenslashShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + regenslashShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§d§lRegenslash Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.regenslash")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= regenslashIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§dRegenslash II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(RegenslashIIRegister.REGENSLASHII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: regenslash 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, regenslashIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + regenslashIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lRushing Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.rushing")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= rushingShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§3Rushing I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(RushingRegister.RUSHING, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: rushing");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, rushingShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + rushingShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§3§lRushing Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.rushing")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= rushingIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§3Rushing II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(RushingIIRegister.RUSHINGII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: rushing 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, rushingIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + rushingIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lSaturated Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.saturated")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= saturatedShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eSaturated I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SaturatedRegister.SATURATED, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: saturated");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, saturatedShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + saturatedShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lSaturated Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.saturated")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= saturatedIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eSaturated II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SaturatedIIRegister.SATURATEDII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: saturated 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, saturatedIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + saturatedIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lSaturated Level 3 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.saturated")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= saturatedIIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eSaturated III");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SaturatedIIIRegister.SATURATEDIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: saturated 3");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, saturatedIIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + saturatedIIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lSaturated Level 4 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.saturated")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= saturatedIVShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eSaturated IV");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SaturatedIVRegister.SATURATEDIV, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: saturated 4");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, saturatedIVShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + saturatedIVShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    } else if (item.equalsIgnoreCase("§e§lSaturated Level 5 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.saturated")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= saturatedVShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eSaturated V");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SaturatedVRegister.SATURATEDV, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: saturated 5");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, saturatedVShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + saturatedVShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }  else if (item.equalsIgnoreCase("§5§lSnipe Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.snipe")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= snipeShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Snipe I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SnipeRegister.SNIPE, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: snipe");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, snipeShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + snipeShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lSnipe Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.snipe")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= snipeIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Snipe II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SnipeIIRegister.SNIPEII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: snipe 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, snipeIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + snipeIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lSnipe Level 3 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.snipe")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= snipeIIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Snipe III");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(SnipeIIIRegister.SNIPEIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: snipe 3");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, snipeIIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + snipeIIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lVenomous Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.venomous")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= venomousShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Venomous I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(VenomousRegister.VENOMOUS, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: venomous");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, venomousShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + venomousShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lVenomous Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.venomous")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= venomousIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Venomous II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(VenomousIIRegister.VENOMOUSII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: venomous 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, venomousIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + venomousIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lWithered Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.withered")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= witheredShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Withered I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(WitheredRegister.WITHERED, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: withered");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, witheredShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + witheredShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lWithered Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.withered")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= witheredIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Withered II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(WitheredIIRegister.WITHEREDII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: withered 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, witheredIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + witheredIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lWithered Level 3 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.withered")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= witheredIIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Withered III");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(WitheredIIIRegister.WITHEREDIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: withered 3");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, witheredIIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + witheredIIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§5§lWithered Level 4 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.withered")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= witheredIVShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§5Withered IV");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(WitheredIVRegister.WITHEREDIV, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: withered 4");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, witheredIVShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + witheredIVShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§d§lHealthBoost Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.healthboost")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= healthboostShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§dHealth Boost I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(HealthBoostRegister.HEALTHBOOST, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: healthboost");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, healthboostShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + healthboostShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§d§lHealthBoost Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.healthboost")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= healthboostIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§dHealth Boost II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(HealthBoostIIRegister.HEALTHBOOSTII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: healthboost 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, healthboostIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + healthboostIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§d§lHealthBoost Level 3 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.healthboost")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= healthboostIIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§dHealth Boost III");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(HealthBoostIIIRegister.HEALTHBOOSTIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: healthboost 3");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, healthboostIIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + healthboostIIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§6§lMinersLuck Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.minersluck")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= minersluckShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§6MinersLuck I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(MinersLuckRegister.MINERSLUCK, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: minersluck");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, minersluckShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + minersluckShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§6§lMinersLuck Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.minersluck")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= minersluckIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§6MinersLuck II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(MinersLuckIIRegister.MINERSLUCK, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: minersluck 2");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, minersluckIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + minersluckIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§e§lExperienced Level 1 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.experienced")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= experiencedShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eExperienced I");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(ExperiencedRegister.EXPERIENCED, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: experienced");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, experiencedShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + experiencedShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }else if (item.equalsIgnoreCase("§e§lExperienced Level 2 Enchantment")) {
                        if (p.hasPermission("enchantments.shop.experienced")) {
                            if (EnchantmentS.getPlugin().getEconomy().getBalance(p) >= experiencedIIShop) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta meta = book.getItemMeta();
                                List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                                lore.add("§eExperienced II");
                                meta.setLore(lore);
                                book.setItemMeta(meta);
                                p.closeInventory();
                                book.addUnsafeEnchantment(ExperiencedIIRegister.EXPERIENCEDII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aSuccessfully purchased: experienced");
                                EnchantmentS.getPlugin().getEconomy().withdrawPlayer(p, experiencedIIShop);
                            } else {
                                p.closeInventory();
                                p.sendMessage("§cYou do not have enough money to purchase this enchantment. You need: §4$" + experiencedIIShop + ", §cYou have: §4" + EnchantmentS.getPlugin().getEconomy().getBalance(p));
                            }
                        } else {
                            p.closeInventory();
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }


                }
            }
        }
    }
}


