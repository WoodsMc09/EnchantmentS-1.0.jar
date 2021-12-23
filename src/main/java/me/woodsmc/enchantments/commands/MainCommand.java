package me.woodsmc.enchantments.commands;


import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.*;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainCommand implements CommandExecutor {

    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);
        double autosmeltShop = plugin.getConfig().getDouble("Autosmelt_Price");
        double bossslayerShop = plugin.getConfig().getDouble("Bossslayer_Price");
        double escapeShop = plugin.getConfig().getDouble("Escape_Price");
        double fatalblowShop = plugin.getConfig().getDouble("FatalBlow_Price");
        double featheredShop = plugin.getConfig().getDouble("Feathered_Price");
        double leapShop = plugin.getConfig().getDouble("Leap_Price");
        double lifestealShop = plugin.getConfig().getDouble("Lifesteal_Price");
        double moltenShop = plugin.getConfig().getDouble("Molten_Price");
        double momentumShop = plugin.getConfig().getDouble("Momentum_Price");
        double curseMovementShop = plugin.getConfig().getDouble("Curse_Movement_Price");
        double blazeslayerShop = plugin.getConfig().getDouble("Blazeslayer_Price");
        double curseSightShop = plugin.getConfig().getDouble("Curse_Sight_Price");
        double stealthShop = plugin.getConfig().getDouble("Stealth_Price");
        double telekinesisShop = plugin.getConfig().getDouble("Telekinesis_Price");
        double uppercutShop = plugin.getConfig().getDouble("Uppercut_Price");
        double voidlessShop = plugin.getConfig().getDouble("Voidless_Price");
        double dolphinShop = plugin.getConfig().getDouble("Dolphin_Price");
        double electrictipShop = plugin.getConfig().getDouble("ElectricTip_Price");
        double lavawalkShop = plugin.getConfig().getDouble("LavaWalk_Price");
        double minersgraceShop = plugin.getConfig().getDouble("MinersGrace_Price");
        double fangedShop = plugin.getConfig().getDouble("Fanged_Price");
        double cropShop = plugin.getConfig().getDouble("Crop_Price");
        double floatShop = plugin.getConfig().getDouble("Float_Price");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            ItemStack item = p.getInventory().getItemInMainHand();
            ItemMeta meta = item.getItemMeta();
            String addtitle = plugin.getConfig().getString("addguititle");
            String title = plugin.getConfig().getString("listguititle");
            String prefix = plugin.getConfig().getString("prefix");
            String shopguititle = plugin.getConfig().getString("shopguititle");
            if(args.length == 0){
                if(p.hasPermission("enchantments.use")) {

                    TextComponent lvlenchant = new TextComponent("§5/enchantments <enchantment> <lvl>  - §dadd lvl to certain enchants");  TextComponent list = new TextComponent("§5/enchantments list - §dopens a gui list of enchantments & curses");
                    TextComponent reload = new TextComponent("§5/enchantments reload - §dreloads config"); TextComponent add = new TextComponent("§5/enchantments add - §dopens enchantment add gui");
                    TextComponent curse = new TextComponent("§5/enchantments curse <curse> §dcurse item in hand"); TextComponent getbook = new TextComponent("§5/enchantments getbook <enchantment/curse> §dget a book of an enchantment");
                    TextComponent main = new TextComponent("5/enchantments - §dthis command"); TextComponent enchanthand = new TextComponent("§5/enchantments <enchantment> - §denchant item in hand");
                    main.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments"));
                    main.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    enchanthand.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments <enchantment>"));
                    enchanthand.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    lvlenchant.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments <enchantment> <lvl>"));
                    lvlenchant.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    list.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments list"));
                    list.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    reload.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments reload"));
                    reload.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    add.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments add"));
                    add.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    curse.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments curse <curse>"));
                    curse.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    getbook.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/enchantments getbook <enchantment/curse>"));
                    getbook.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§5Click Here To Select Command").create()));
                    p.sendMessage("§5§lEnchantment§d§lS §8§l:");
                    p.spigot().sendMessage(main);
                    p.spigot().sendMessage(enchanthand);
                    p.spigot().sendMessage(lvlenchant);
                    p.spigot().sendMessage(list);
                    p.spigot().sendMessage(reload);
                    p.spigot().sendMessage(add);
                    p.spigot().sendMessage(curse);
                    p.spigot().sendMessage(getbook);
                }else{
                    p.sendMessage("§cYou do not have permission to execute this command!");
                }
            }else if(args.length == 1){
                if(args[0].equalsIgnoreCase("criticals")){
                    if(p.hasPermission("enchantments.criticals")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§eCriticals I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(CriticalsRegister.CRITICALS, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("escape")){
                    if(p.hasPermission("enchantments.escape")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§dEscape I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(EscapeRegister.ESCAPE, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("feathered")){
                    if(p.hasPermission("enchantments.feathered")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bFeathered I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FeatheredRegister.FEATHERED, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("lifesteal")){
                    if(p.hasPermission("enchantments.lifesteal")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§7Lifesteal I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(LifestealRegister.LIFESTEAL, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("blazeslayer")){
                    if(p.hasPermission("enchantments.blazeslayer")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§cBlazeslayer I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(NetherSlayerRegister.NETHERSLAYER, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("regenslash")){
                    if(p.hasPermission("enchantments.regenslash")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aRegenslash I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(RegenslashRegister.REGENSLASH, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("snipe")){
                    if(p.hasPermission("enchantments.snipe")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§3Snipe I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(SnipeRegister.SNIPE, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("telekinesis")){
                    if(p.hasPermission("enchantments.telekinesis")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§eTelekinesis I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(TelekinesisRegister.TELEKINESIS, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("uppercut")){
                    if(p.hasPermission("enchantments.uppercut")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§cUppercut I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(UppercutRegister.UPPERCUT, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("venomous")){
                    if(p.hasPermission("enchantments.venomous")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bVenomous I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(VenomousRegister.VENOMOUS, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("list")){
                    if(p.hasPermission("enchantments.list")) {
                        ArrayList<String> lore = new ArrayList<>();
                        Inventory guilist = Bukkit.createInventory(p, 45, ChatColor.translateAlternateColorCodes('&', title));
                        ItemStack assist = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack autosmelt = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack criticals = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack escape = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack feathered = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack lifesteal = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack netherslayer = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack regenslash = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack snipe = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack stealth = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack telekinesis = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack uppercut = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack venomous = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack voidless = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack withered = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack revive = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack movement = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack saturated = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack rushing = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack leap = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack molten = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack sight = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack fatalblow = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack healthboost = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack bossslayer = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack hydration = new ItemStack(Material.ENCHANTED_BOOK );
                        ItemStack dolphin = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack momentum = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack electrictip = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack lavawalk = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack minersgrace = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack minersluck = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack experienced = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack fanged = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack crop = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack floatItem = new ItemStack(Material.ENCHANTED_BOOK);

                        ItemMeta assistMeta = assist.getItemMeta();
                        assistMeta.setDisplayName("§4§lAssist");
                        assistMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        lore.add("§7(Click)");
                        assistMeta.setLore(lore);
                        assistMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        assist.setItemMeta(assistMeta);

                        ItemMeta autosmeltMeta = autosmelt.getItemMeta();
                        autosmeltMeta.setDisplayName("§d§lAutoSmelt");
                        autosmeltMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        autosmeltMeta.setLore(lore);
                        autosmeltMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        autosmelt.setItemMeta(autosmeltMeta);

                        ItemMeta criticalsMeta = criticals.getItemMeta();
                        criticalsMeta.setDisplayName("§e§lCriticals");
                        criticalsMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        criticalsMeta.setLore(lore);
                        criticalsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        criticals.setItemMeta(criticalsMeta);

                        ItemMeta escapeMeta = escape.getItemMeta();
                        escapeMeta.setDisplayName("§b§lEscape");
                        escapeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        escapeMeta.setLore(lore);
                        escapeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        escape.setItemMeta(escapeMeta);

                        ItemMeta featheredMeta = feathered.getItemMeta();
                        featheredMeta.setDisplayName("§d§lFeathered");
                        featheredMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        featheredMeta.setLore(lore);
                        featheredMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        feathered.setItemMeta(featheredMeta);

                        ItemMeta lifestealMeta = lifesteal.getItemMeta();
                        lifestealMeta.setDisplayName("§c§lLifesteal");
                        lifestealMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        lifestealMeta.setLore(lore);
                        lifestealMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        lifesteal.setItemMeta(lifestealMeta);

                        ItemMeta netherslayerMeta = netherslayer.getItemMeta();
                        netherslayerMeta.setDisplayName("§a§lBlazeslayer");
                        netherslayerMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        netherslayerMeta.setLore(lore);
                        netherslayerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        netherslayer.setItemMeta(netherslayerMeta);

                        ItemMeta regenslashMeta = regenslash.getItemMeta();
                        regenslashMeta.setDisplayName("§d§lRegenslash");
                        regenslashMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        regenslashMeta.setLore(lore);
                        regenslashMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        regenslash.setItemMeta(regenslashMeta);

                        ItemMeta snipeMeta = snipe.getItemMeta();
                        snipeMeta.setDisplayName("§5§lSnipe");
                        snipeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        snipeMeta.setLore(lore);
                        snipeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        snipe.setItemMeta(snipeMeta);

                        ItemMeta stealthMeta = stealth.getItemMeta();
                        stealthMeta.setDisplayName("§1§lStealth");
                        stealthMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        stealthMeta.setLore(lore);
                        stealthMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        stealth.setItemMeta(stealthMeta);

                        ItemMeta telekinesisMeta = telekinesis.getItemMeta();
                        telekinesisMeta.setDisplayName("§b§lTelekinesis");
                        telekinesisMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        telekinesisMeta.setLore(lore);
                        telekinesisMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        telekinesis.setItemMeta(telekinesisMeta);

                        ItemMeta uppercutMeta = uppercut.getItemMeta();
                        uppercutMeta.setDisplayName("§3§lUppercut");
                        uppercutMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        uppercutMeta.setLore(lore);
                        uppercutMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        uppercut.setItemMeta(uppercutMeta);

                        ItemMeta venomousMeta = venomous.getItemMeta();
                        venomousMeta.setDisplayName("§5§lVenomous");
                        venomousMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        venomousMeta.setLore(lore);
                        venomousMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        venomous.setItemMeta(venomousMeta);

                        ItemMeta voidlessMeta = voidless.getItemMeta();
                        voidlessMeta.setDisplayName("§e§lVoidless");
                        venomousMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        voidlessMeta.setLore(lore);
                        voidlessMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        voidless.setItemMeta(voidlessMeta);

                        ItemMeta witheredMeta = withered.getItemMeta();
                        witheredMeta.setDisplayName("§5§lWithered");
                        witheredMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        witheredMeta.setLore(lore);
                        witheredMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        withered.setItemMeta(witheredMeta);

                        ItemMeta reviveMeta = withered.getItemMeta();
                        reviveMeta.setDisplayName("§d§lRevive");
                        reviveMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        reviveMeta.setLore(lore);
                        reviveMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        revive.setItemMeta(reviveMeta);

                        ItemMeta movementMeta = movement.getItemMeta();
                        movementMeta.setDisplayName("§c§lCurse of Movement");
                        movementMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        movementMeta.setLore(lore);
                        movementMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        movement.setItemMeta(movementMeta);

                        ItemMeta saturatedMeta = saturated.getItemMeta();
                        saturatedMeta.setDisplayName("§e§lSaturated");
                        saturatedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        saturatedMeta.setLore(lore);
                        saturatedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        saturated.setItemMeta(saturatedMeta);

                        ItemMeta rushingMeta = rushing.getItemMeta();
                        rushingMeta.setDisplayName("§3§lRushing");
                        rushingMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        rushingMeta.setLore(lore);
                        rushingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        rushing.setItemMeta(rushingMeta);

                        ItemMeta leapMeta = leap.getItemMeta();
                        leapMeta.setDisplayName("§a§lLeap");
                        leapMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        leapMeta.setLore(lore);
                        leapMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        leap.setItemMeta(leapMeta);

                        ItemMeta moltenMeta = molten.getItemMeta();
                        moltenMeta.setDisplayName("§6§lMolten");
                        moltenMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        moltenMeta.setLore(lore);
                        moltenMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        molten.setItemMeta(moltenMeta);

                        ItemMeta sightMeta = sight.getItemMeta();
                        sightMeta.setDisplayName("§c§lCurse of Sight");
                        sightMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        sightMeta.setLore(lore);
                        sightMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        sight.setItemMeta(sightMeta);

                        ItemMeta fatalblowMeta = fatalblow.getItemMeta();
                        fatalblowMeta.setDisplayName("§9§lFatal Blow");
                        fatalblowMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        fatalblowMeta.setLore(lore);
                        fatalblowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        fatalblow.setItemMeta(fatalblowMeta);

                        ItemMeta healthboostMeta = healthboost.getItemMeta();
                        healthboostMeta.setDisplayName("§d§lHealth Boost");
                        healthboostMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        healthboostMeta.setLore(lore);
                        healthboostMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        healthboost.setItemMeta(healthboostMeta);

                        ItemMeta bossslayerMeta = healthboost.getItemMeta();
                        bossslayerMeta.setDisplayName("§a§lBossSlayer");
                        bossslayerMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        bossslayerMeta.setLore(lore);
                        bossslayerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        bossslayer.setItemMeta(bossslayerMeta);

                        ItemMeta hydrationMeta = hydration.getItemMeta();
                        hydrationMeta.setDisplayName("§3§lHydration");
                        hydrationMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        hydrationMeta.setLore(lore);
                        hydrationMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        hydration.setItemMeta(hydrationMeta);

                        ItemMeta dolphinMeta = dolphin.getItemMeta();
                        dolphinMeta.setDisplayName("§b§lDolphin");
                        dolphinMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        dolphinMeta.setLore(lore);
                        dolphinMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        dolphin.setItemMeta(dolphinMeta);

                        ItemMeta momentumMeta = momentum.getItemMeta();
                        momentumMeta.setDisplayName("§1§lMomentum");
                        momentumMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        momentumMeta.setLore(lore);
                        momentumMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        momentum.setItemMeta(momentumMeta);

                        ItemMeta electrictipMeta = electrictip.getItemMeta();
                        electrictipMeta.setDisplayName("§b§lElectricTip");
                        electrictipMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        electrictipMeta.setLore(lore);
                        electrictipMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        electrictip.setItemMeta(electrictipMeta);

                        ItemMeta lavawalkMeta = lavawalk.getItemMeta();
                        lavawalkMeta.setDisplayName("§6§lLavaWalk");
                        lavawalkMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        lavawalkMeta.setLore(lore);
                        lavawalkMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        lavawalk.setItemMeta(lavawalkMeta);

                        ItemMeta minersgraceMeta = minersgrace.getItemMeta();
                        minersgraceMeta.setDisplayName("§a§lMinersGrace");
                        minersgraceMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        minersgraceMeta.setLore(lore);
                        minersgraceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        minersgrace.setItemMeta(minersgraceMeta);

                        ItemMeta minersluckMeta = minersluck.getItemMeta();
                        minersluckMeta.setDisplayName("§6§lMinersLuck");
                        minersluckMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        minersluckMeta.setLore(lore);
                        minersluckMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        minersluck.setItemMeta(minersluckMeta);

                        ItemMeta experiencedMeta = experienced.getItemMeta();
                        experiencedMeta.setDisplayName("§e§lExperienced");
                        experiencedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        experiencedMeta.setLore(lore);
                        experiencedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        experienced.setItemMeta(experiencedMeta);

                        ItemMeta fangedMeta = fanged.getItemMeta();
                        fangedMeta.setDisplayName("§4§lFanged");
                        fangedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        fangedMeta.setLore(lore);
                        fangedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        fanged.setItemMeta(fangedMeta);

                        ItemMeta cropMeta = crop.getItemMeta();
                        cropMeta.setDisplayName("§a§lCrop");
                        cropMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        cropMeta.setLore(lore);
                        cropMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        crop.setItemMeta(cropMeta);

                        ItemMeta floatItemMeta = floatItem.getItemMeta();
                        floatItemMeta.setDisplayName("§b§lFloat");
                        floatItemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        floatItemMeta.setLore(lore);
                        floatItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        floatItem.setItemMeta(floatItemMeta);


                        ItemStack[] list_items = {assist, criticals, lifesteal, uppercut, venomous, regenslash, withered, netherslayer, autosmelt, escape,
                                feathered, snipe, stealth, telekinesis, voidless, revive, movement, saturated, rushing, leap, molten, sight, fatalblow, healthboost,
                        bossslayer, hydration, dolphin, momentum, electrictip, lavawalk, minersgrace, minersluck, experienced, fanged, crop, floatItem};
                        guilist.setContents(list_items);
                        p.openInventory(guilist);
                    }
                }else if(args[0].equalsIgnoreCase("add")){
                    if(p.hasPermission("enchantments.add")) {
                        ArrayList<String> lore = new ArrayList<>();
                        Inventory guiadd = Bukkit.createInventory(p, 36, ChatColor.translateAlternateColorCodes('&', addtitle));
                        ItemStack assist = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack autosmelt = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack criticals = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack escape = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack feathered = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack lifesteal = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack netherslayer = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack regenslash = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack snipe = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack stealth = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack telekinesis = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack uppercut = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack venomous = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack voidless = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack withered = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack revive = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack movement = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack saturated = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack rushing = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack leap = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack molten = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack sight = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack fatalblow = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack healthboost = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack bossslayer = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack hydration = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack dolphin = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack momentum = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack electrictip = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack lavawalk = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack minersgrace = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack minersluck = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack experienced = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack fanged = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack crop = new ItemStack(Material.ENCHANTED_BOOK);
                        ItemStack floatItem = new ItemStack(Material.ENCHANTED_BOOK);

                        ItemMeta assistMeta = assist.getItemMeta();
                        assistMeta.setDisplayName("§4§lAssist");
                        assistMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        lore.add("§7(Click)");
                        assistMeta.setLore(lore);
                        assistMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        assist.setItemMeta(assistMeta);

                        ItemMeta autosmeltMeta = autosmelt.getItemMeta();
                        autosmeltMeta.setDisplayName("§d§lAutoSmelt");
                        autosmeltMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        autosmeltMeta.setLore(lore);
                        autosmeltMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        autosmelt.setItemMeta(autosmeltMeta);

                        ItemMeta criticalsMeta = criticals.getItemMeta();
                        criticalsMeta.setDisplayName("§e§lCriticals");
                        criticalsMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        criticalsMeta.setLore(lore);
                        criticalsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        criticals.setItemMeta(criticalsMeta);

                        ItemMeta escapeMeta = escape.getItemMeta();
                        escapeMeta.setDisplayName("§b§lEscape");
                        escapeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        escapeMeta.setLore(lore);
                        escapeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        escape.setItemMeta(escapeMeta);

                        ItemMeta featheredMeta = feathered.getItemMeta();
                        featheredMeta.setDisplayName("§d§lFeathered");
                        featheredMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        featheredMeta.setLore(lore);
                        featheredMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        feathered.setItemMeta(featheredMeta);

                        ItemMeta lifestealMeta = lifesteal.getItemMeta();
                        lifestealMeta.setDisplayName("§c§lLifesteal");
                        lifestealMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        lifestealMeta.setLore(lore);
                        lifestealMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        lifesteal.setItemMeta(lifestealMeta);

                        ItemMeta netherslayerMeta = netherslayer.getItemMeta();
                        netherslayerMeta.setDisplayName("§a§lBlazeslayer");
                        netherslayerMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        netherslayerMeta.setLore(lore);
                        netherslayerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        netherslayer.setItemMeta(netherslayerMeta);

                        ItemMeta regenslashMeta = regenslash.getItemMeta();
                        regenslashMeta.setDisplayName("§d§lRegenslash");
                        regenslashMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        regenslashMeta.setLore(lore);
                        regenslashMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        regenslash.setItemMeta(regenslashMeta);

                        ItemMeta snipeMeta = snipe.getItemMeta();
                        snipeMeta.setDisplayName("§5§lSnipe");
                        snipeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        snipeMeta.setLore(lore);
                        snipeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        snipe.setItemMeta(snipeMeta);

                        ItemMeta stealthMeta = stealth.getItemMeta();
                        stealthMeta.setDisplayName("§1§lStealth");
                        stealthMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        stealthMeta.setLore(lore);
                        stealthMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        stealth.setItemMeta(stealthMeta);

                        ItemMeta telekinesisMeta = telekinesis.getItemMeta();
                        telekinesisMeta.setDisplayName("§b§lTelekinesis");
                        telekinesisMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        telekinesisMeta.setLore(lore);
                        telekinesisMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        telekinesis.setItemMeta(telekinesisMeta);

                        ItemMeta uppercutMeta = uppercut.getItemMeta();
                        uppercutMeta.setDisplayName("§3§lUppercut");
                        uppercutMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        uppercutMeta.setLore(lore);
                        uppercutMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        uppercut.setItemMeta(uppercutMeta);

                        ItemMeta venomousMeta = venomous.getItemMeta();
                        venomousMeta.setDisplayName("§5§lVenomous");
                        venomousMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        venomousMeta.setLore(lore);
                        venomousMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        venomous.setItemMeta(venomousMeta);

                        ItemMeta voidlessMeta = voidless.getItemMeta();
                        voidlessMeta.setDisplayName("§e§lVoidless");
                        voidlessMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        voidlessMeta.setLore(lore);
                        voidlessMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        voidless.setItemMeta(voidlessMeta);

                        ItemMeta witheredMeta = withered.getItemMeta();
                        witheredMeta.setDisplayName("§5§lWithered");
                        witheredMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        witheredMeta.setLore(lore);
                        witheredMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        withered.setItemMeta(witheredMeta);

                        ItemMeta reviveMeta = withered.getItemMeta();
                        reviveMeta.setDisplayName("§d§lRevive");
                        reviveMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        reviveMeta.setLore(lore);
                        reviveMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        revive.setItemMeta(reviveMeta);

                        ItemMeta movementMeta = movement.getItemMeta();
                        movementMeta.setDisplayName("§c§lCurse of Movement");
                        movementMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        movementMeta.setLore(lore);
                        movementMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        movement.setItemMeta(movementMeta);

                        ItemMeta saturatedMeta = saturated.getItemMeta();
                        saturatedMeta.setDisplayName("§e§lSaturated");
                        saturatedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        saturatedMeta.setLore(lore);
                        saturatedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        saturated.setItemMeta(saturatedMeta);

                        ItemMeta rushingMeta = rushing.getItemMeta();
                        rushingMeta.setDisplayName("§3§lRushing");
                        rushingMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        rushingMeta.setLore(lore);
                        rushingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        rushing.setItemMeta(rushingMeta);

                        ItemMeta leapMeta = leap.getItemMeta();
                        leapMeta.setDisplayName("§a§lLeap");
                        leapMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        leapMeta.setLore(lore);
                        leapMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        leap.setItemMeta(leapMeta);

                        ItemMeta moltenMeta = molten.getItemMeta();
                        moltenMeta.setDisplayName("§6§lMolten");
                        moltenMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        moltenMeta.setLore(lore);
                        moltenMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        molten.setItemMeta(moltenMeta);

                        ItemMeta sightMeta = sight.getItemMeta();
                        sightMeta.setDisplayName("§c§lCurse of Sight");
                        sightMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        sightMeta.setLore(lore);
                        sightMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        sight.setItemMeta(sightMeta);

                        ItemMeta fatalblowMeta = fatalblow.getItemMeta();
                        fatalblowMeta.setDisplayName("§9§lFatal Blow");
                        fatalblowMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        fatalblowMeta.setLore(lore);
                        fatalblowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        fatalblow.setItemMeta(fatalblowMeta);

                        ItemMeta healthboostMeta = healthboost.getItemMeta();
                        healthboostMeta.setDisplayName("§d§lHealth Boost");
                        healthboostMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        healthboostMeta.setLore(lore);
                        healthboostMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        healthboost.setItemMeta(healthboostMeta);

                        ItemMeta bossslayerMeta = healthboost.getItemMeta();
                        bossslayerMeta.setDisplayName("§a§lBossSlayer");
                        bossslayerMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        bossslayerMeta.setLore(lore);
                        bossslayerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        bossslayer.setItemMeta(bossslayerMeta);

                        ItemMeta hydrationMeta = hydration.getItemMeta();
                        hydrationMeta.setDisplayName("§3§lHydration");
                        hydrationMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        hydrationMeta.setLore(lore);
                        hydrationMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        hydration.setItemMeta(hydrationMeta);

                        ItemMeta dolphinMeta = dolphin.getItemMeta();
                        dolphinMeta.setDisplayName("§b§lDolphin");
                        dolphinMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        dolphinMeta.setLore(lore);
                        dolphinMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        dolphin.setItemMeta(dolphinMeta);

                        ItemMeta momentumMeta = momentum.getItemMeta();
                        momentumMeta.setDisplayName("§1§lMomentum");
                        momentumMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        momentumMeta.setLore(lore);
                        momentumMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        momentum.setItemMeta(momentumMeta);

                        ItemMeta electrictipMeta = electrictip.getItemMeta();
                        electrictipMeta.setDisplayName("§b§lElectricTip");
                        electrictipMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        electrictipMeta.setLore(lore);
                        electrictipMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        electrictip.setItemMeta(electrictipMeta);

                        ItemMeta lavawalkMeta = lavawalk.getItemMeta();
                        lavawalkMeta.setDisplayName("§6§lLavaWalk");
                        lavawalkMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        lavawalkMeta.setLore(lore);
                        lavawalkMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        lavawalk.setItemMeta(lavawalkMeta);

                        ItemMeta minersgraceMeta = minersgrace.getItemMeta();
                        minersgraceMeta.setDisplayName("§a§lMinersGrace");
                        minersgraceMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        minersgraceMeta.setLore(lore);
                        minersgraceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        minersgrace.setItemMeta(minersgraceMeta);

                        ItemMeta minersluckMeta = minersluck.getItemMeta();
                        minersluckMeta.setDisplayName("§6§lMinersLuck");
                        minersluckMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        minersluckMeta.setLore(lore);
                        minersluckMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        minersluck.setItemMeta(minersluckMeta);

                        ItemMeta experiencedMeta = experienced.getItemMeta();
                        experiencedMeta.setDisplayName("§e§lExperienced");
                        experiencedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        experiencedMeta.setLore(lore);
                        experiencedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        experienced.setItemMeta(experiencedMeta);

                        ItemMeta fangedMeta = fanged.getItemMeta();
                        fangedMeta.setDisplayName("§4§lFanged");
                        fangedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        fangedMeta.setLore(lore);
                        fangedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        fanged.setItemMeta(fangedMeta);

                        ItemMeta cropMeta = crop.getItemMeta();
                        cropMeta.setDisplayName("§a§lCrop");
                        cropMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        cropMeta.setLore(lore);
                        cropMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        crop.setItemMeta(cropMeta);

                        ItemMeta floatItemMeta = floatItem.getItemMeta();
                        floatItemMeta.setDisplayName("§b§lFloat");
                        floatItemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                        floatItemMeta.setLore(lore);
                        floatItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        floatItem.setItemMeta(floatItemMeta);

                        ItemStack[] list_items = {assist, criticals, lifesteal, uppercut, venomous, regenslash, withered, netherslayer, autosmelt, escape,
                                feathered, snipe, stealth, telekinesis, voidless, revive, movement, saturated, rushing, leap, molten, sight, fatalblow, healthboost,
                        bossslayer, hydration, dolphin, momentum, electrictip, lavawalk, minersgrace, minersluck, experienced, fanged, crop, floatItem};
                        guiadd.setContents(list_items);
                        p.openInventory(guiadd);
                    }
                }else if(args[0].equalsIgnoreCase("shop")){
                    if(plugin.getServer().getPluginManager().getPlugin("Vault") == null){
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cCannot open shop, server does not have &5Vault &cinstalled!"));
                    }else {
                        if (p.hasPermission("enchantments.shop")) {
                            Inventory guishop = Bukkit.createInventory(p, 54, ChatColor.translateAlternateColorCodes('&', shopguititle));
                            ItemStack assist = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack autosmelt = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack criticals = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack escape = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack feathered = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack lifesteal = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack netherslayer = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack regenslash = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack snipe = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack stealth = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack telekinesis = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack uppercut = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack venomous = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack voidless = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack withered = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack revive = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack movement = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack saturated = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack rushing = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack leap = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack molten = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack sight = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack fatalblow = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack healthboost = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack bossslayer = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack hydration = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack dolphin = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack momentum = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack electrictip = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack lavawalk = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack minersgrace = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack minersluck = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack experienced = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack fanged = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack crop = new ItemStack(Material.ENCHANTED_BOOK);
                            ItemStack floatItem = new ItemStack(Material.ENCHANTED_BOOK);

                            ItemMeta assistMeta = assist.getItemMeta();
                            ArrayList<String> lore = new ArrayList<>();
                            assistMeta.setDisplayName("§4§lAssist");
                            assistMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            lore.add("§7(Click)");
                            assistMeta.setLore(lore);
                            assistMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            assist.setItemMeta(assistMeta);

                            ItemMeta autosmeltMeta = autosmelt.getItemMeta();
                            ArrayList<String> autosmeltLore = new ArrayList<>();
                            autosmeltLore.add("§2Buy: §a$" + autosmeltShop);
                            autosmeltMeta.setDisplayName("§d§lAutoSmelt");
                            autosmeltMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            autosmeltMeta.setLore(autosmeltLore);
                            autosmeltMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            autosmelt.setItemMeta(autosmeltMeta);

                            ItemMeta criticalsMeta = criticals.getItemMeta();
                            ArrayList<String> criticalsLore = new ArrayList<>();
                            criticalsLore.add("§7(Click)");
                            criticalsMeta.setDisplayName("§e§lCriticals");
                            criticalsMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            criticalsMeta.setLore(criticalsLore);
                            criticalsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            criticals.setItemMeta(criticalsMeta);

                            ItemMeta escapeMeta = escape.getItemMeta();
                            ArrayList<String> escapeLore = new ArrayList<>();
                            escapeLore.add("§2Buy: §a$" + escapeShop);
                            escapeMeta.setDisplayName("§b§lEscape");
                            escapeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            escapeMeta.setLore(escapeLore);
                            escapeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            escape.setItemMeta(escapeMeta);

                            ItemMeta featheredMeta = feathered.getItemMeta();
                            ArrayList<String> featheredLore = new ArrayList<>();
                            featheredLore.add("§2Buy: §a$" + featheredShop);
                            ;
                            featheredMeta.setDisplayName("§d§lFeathered");
                            featheredMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            featheredMeta.setLore(featheredLore);
                            featheredMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            feathered.setItemMeta(featheredMeta);

                            ItemMeta lifestealMeta = lifesteal.getItemMeta();
                            ArrayList<String> lifestealLore = new ArrayList<>();
                            lifestealLore.add("§2Buy: §a$" + lifestealShop);
                            lifestealMeta.setDisplayName("§c§lLifesteal");
                            lifestealMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            lifestealMeta.setLore(lifestealLore);
                            lifestealMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            lifesteal.setItemMeta(lifestealMeta);

                            ItemMeta netherslayerMeta = netherslayer.getItemMeta();
                            ArrayList<String> blazeslayerLore = new ArrayList<>();
                            blazeslayerLore.add("§2Buy: §a$" + blazeslayerShop);
                            netherslayerMeta.setDisplayName("§a§lBlazeslayer");
                            netherslayerMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            netherslayerMeta.setLore(blazeslayerLore);
                            netherslayerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            netherslayer.setItemMeta(netherslayerMeta);

                            ItemMeta regenslashMeta = regenslash.getItemMeta();
                            regenslashMeta.setDisplayName("§d§lRegenslash");
                            regenslashMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            regenslashMeta.setLore(lore);
                            regenslashMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            regenslash.setItemMeta(regenslashMeta);

                            ItemMeta snipeMeta = snipe.getItemMeta();
                            snipeMeta.setDisplayName("§5§lSnipe");
                            snipeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            snipeMeta.setLore(lore);
                            snipeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            snipe.setItemMeta(snipeMeta);

                            ItemMeta stealthMeta = stealth.getItemMeta();
                            ArrayList<String> stealthLore = new ArrayList<>();
                            stealthLore.add("§2Buy: §a$" + stealthShop);
                            stealthMeta.setDisplayName("§1§lStealth");
                            stealthMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            stealthMeta.setLore(stealthLore);
                            stealthMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            stealth.setItemMeta(stealthMeta);

                            ItemMeta telekinesisMeta = telekinesis.getItemMeta();
                            ArrayList<String> telekinesisLore = new ArrayList<>();
                            telekinesisLore.add("§2Buy §a$" + telekinesisShop);
                            telekinesisMeta.setDisplayName("§b§lTelekinesis");
                            telekinesisMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            telekinesisMeta.setLore(telekinesisLore);
                            telekinesisMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            telekinesis.setItemMeta(telekinesisMeta);

                            ItemMeta uppercutMeta = uppercut.getItemMeta();
                            ArrayList<String> uppercutLore = new ArrayList<>();
                            uppercutLore.add("§2Buy: §a$" + uppercutShop);
                            uppercutMeta.setDisplayName("§3§lUppercut");
                            uppercutMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            uppercutMeta.setLore(uppercutLore);
                            uppercutMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            uppercut.setItemMeta(uppercutMeta);

                            ItemMeta venomousMeta = venomous.getItemMeta();
                            venomousMeta.setDisplayName("§5§lVenomous");
                            venomousMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            venomousMeta.setLore(lore);
                            venomousMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            venomous.setItemMeta(venomousMeta);

                            ItemMeta voidlessMeta = voidless.getItemMeta();
                            ArrayList<String> voidlessLore = new ArrayList<>();
                            voidlessLore.add("§2Buy: §a$" + voidlessShop);
                            voidlessMeta.setDisplayName("§e§lVoidless");
                            voidlessMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            voidlessMeta.setLore(voidlessLore);
                            voidlessMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            voidless.setItemMeta(voidlessMeta);

                            ItemMeta witheredMeta = withered.getItemMeta();
                            witheredMeta.setDisplayName("§5§lWithered");
                            witheredMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            witheredMeta.setLore(lore);
                            witheredMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            withered.setItemMeta(witheredMeta);

                            ItemMeta reviveMeta = withered.getItemMeta();
                            reviveMeta.setDisplayName("§d§lRevive");
                            reviveMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            reviveMeta.setLore(lore);
                            reviveMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            revive.setItemMeta(reviveMeta);

                            ItemMeta movementMeta = movement.getItemMeta();
                            ArrayList<String> movementLore = new ArrayList<>();
                            movementLore.add("§2Buy: §a$" + curseMovementShop);
                            movementMeta.setDisplayName("§c§lCurse of Movement");
                            movementMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            movementMeta.setLore(movementLore);
                            movementMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            movement.setItemMeta(movementMeta);

                            ItemMeta saturatedMeta = saturated.getItemMeta();
                            saturatedMeta.setDisplayName("§e§lSaturated");
                            saturatedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            saturatedMeta.setLore(lore);
                            saturatedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            saturated.setItemMeta(saturatedMeta);

                            ItemMeta rushingMeta = rushing.getItemMeta();
                            rushingMeta.setDisplayName("§3§lRushing");
                            rushingMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            rushingMeta.setLore(lore);
                            rushingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            rushing.setItemMeta(rushingMeta);

                            ItemMeta leapMeta = leap.getItemMeta();
                            ArrayList<String> leapLore = new ArrayList<>();
                            leapLore.add("§2Buy: §a$" + leapShop);
                            leapMeta.setDisplayName("§a§lLeap");
                            leapMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            leapMeta.setLore(leapLore);
                            leapMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            leap.setItemMeta(leapMeta);

                            ItemMeta moltenMeta = molten.getItemMeta();
                            ArrayList<String> moltenLore = new ArrayList<>();
                            moltenLore.add("§2Buy: §a$" + moltenShop);
                            moltenMeta.setDisplayName("§6§lMolten");
                            moltenMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            moltenMeta.setLore(moltenLore);
                            moltenMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            molten.setItemMeta(moltenMeta);

                            ItemMeta sightMeta = sight.getItemMeta();
                            ArrayList<String> sightLore = new ArrayList<>();
                            sightLore.add("§2Buy: §a$" + curseSightShop);
                            sightMeta.setDisplayName("§c§lCurse of Sight");
                            sightMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            sightMeta.setLore(sightLore);
                            sightMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            sight.setItemMeta(sightMeta);

                            ItemMeta fatalblowMeta = fatalblow.getItemMeta();
                            ArrayList<String> fatalblowLore = new ArrayList<>();
                            fatalblowLore.add("§2Buy: §a$" + fatalblowShop);
                            fatalblowMeta.setDisplayName("§9§lFatal Blow");
                            fatalblowMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            fatalblowMeta.setLore(fatalblowLore);
                            fatalblowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            fatalblow.setItemMeta(fatalblowMeta);

                            ItemMeta healthboostMeta = healthboost.getItemMeta();
                            healthboostMeta.setDisplayName("§d§lHealth Boost");
                            healthboostMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            healthboostMeta.setLore(lore);
                            healthboostMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            healthboost.setItemMeta(healthboostMeta);

                            ItemMeta bossslayerMeta = bossslayer.getItemMeta();
                            ArrayList<String> bossslayerLore = new ArrayList<>();
                            bossslayerLore.add("§2Buy: §a$" + bossslayerShop);
                            bossslayerMeta.setDisplayName("§a§lBossSlayer");
                            bossslayerMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            bossslayerMeta.setLore(bossslayerLore);
                            bossslayerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            bossslayer.setItemMeta(bossslayerMeta);

                            ItemMeta hydrationMeta = hydration.getItemMeta();
                            hydrationMeta.setDisplayName("§3§lHydration");
                            hydrationMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            hydrationMeta.setLore(lore);
                            hydrationMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            hydration.setItemMeta(hydrationMeta);

                            ItemMeta dolphinMeta = dolphin.getItemMeta();
                            ArrayList<String> dolphinLore = new ArrayList<>();
                            dolphinLore.add("§2Buy: §a$" + dolphinShop);
                            dolphinMeta.setDisplayName("§b§lDolphin");
                            dolphinMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            dolphinMeta.setLore(dolphinLore);
                            dolphinMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            dolphin.setItemMeta(dolphinMeta);

                            ItemMeta momentumMeta = momentum.getItemMeta();
                            ArrayList<String> momentumLore = new ArrayList<>();
                            momentumLore.add("§2Buy: §a$" + momentumShop);
                            momentumMeta.setDisplayName("§1§lMomentum");
                            momentumMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            momentumMeta.setLore(momentumLore);
                            momentumMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            momentum.setItemMeta(momentumMeta);

                            ItemMeta electrictipMeta = electrictip.getItemMeta();
                            ArrayList<String> electrictipLore = new ArrayList<>();
                            electrictipLore.add("§2Buy: §a$" + electrictipShop);
                            electrictipMeta.setDisplayName("§b§lElectricTip");
                            electrictipMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            electrictipMeta.setLore(electrictipLore);
                            electrictipMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            electrictip.setItemMeta(electrictipMeta);

                            ItemMeta lavawalkMeta = lavawalk.getItemMeta();
                            ArrayList<String> lavawalkLore = new ArrayList<>();
                            lavawalkLore.add("§2Buy: §a$" + lavawalkShop);
                            lavawalkMeta.setDisplayName("§b§lElectricTip");
                            lavawalkMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            lavawalkMeta.setLore(lavawalkLore);
                            lavawalkMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            lavawalk.setItemMeta(lavawalkMeta);

                            ItemMeta minersgraceMeta = minersgrace.getItemMeta();
                            ArrayList<String> minersgraceLore = new ArrayList<>();
                            minersgraceLore.add("§2Buy: §a$" + minersgraceShop);
                            minersgraceMeta.setDisplayName("§a§lMinersGrace");
                            minersgraceMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            minersgraceMeta.setLore(lavawalkLore);
                            minersgraceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            minersgrace.setItemMeta(minersgraceMeta);

                            ItemMeta minersluckMeta = minersluck.getItemMeta();
                            minersluckMeta.setDisplayName("§6§lMinersLuck");
                            minersluckMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            minersluckMeta.setLore(lore);
                            minersluckMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            minersluck.setItemMeta(minersluckMeta);

                            ItemMeta experiencedMeta = experienced.getItemMeta();
                            experiencedMeta.setDisplayName("§e§lExperienced");
                            experiencedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            experiencedMeta.setLore(lore);
                            experiencedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            experienced.setItemMeta(experiencedMeta);

                            ItemMeta fangedMeta = fanged.getItemMeta();
                            ArrayList<String> fangedLore = new ArrayList<>();
                            fangedLore.add("§2Buy: §a$" + fangedShop);
                            fangedMeta.setDisplayName("§4§lFanged");
                            fangedMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            fangedMeta.setLore(fangedLore);
                            fangedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            fanged.setItemMeta(fangedMeta);

                            ItemMeta cropMeta = crop.getItemMeta();
                            ArrayList<String> cropLore = new ArrayList<>();
                            cropLore.add("§2Buy: §a$" + cropShop);
                            cropMeta.setDisplayName("§a§lCrop");
                            cropMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            cropMeta.setLore(cropLore);
                            cropMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            crop.setItemMeta(cropMeta);

                            ItemMeta floatMeta = floatItem.getItemMeta();
                            ArrayList<String> floatLore = new ArrayList<>();
                            floatLore.add("§2Buy: §a$" + floatShop);
                            floatMeta.setDisplayName("§b§lFloat");
                            floatMeta.addEnchant(Enchantment.DURABILITY, 1, false);
                            floatMeta.setLore(cropLore);
                            floatMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                            floatItem.setItemMeta(floatMeta);

                            ItemStack[] list_items = {assist, criticals, lifesteal, uppercut, venomous, regenslash, withered, netherslayer, autosmelt, escape,
                                    feathered, snipe, stealth, telekinesis, voidless, revive, movement, saturated, rushing, leap, molten, sight, fatalblow, healthboost,
                                    bossslayer, hydration, dolphin, momentum, electrictip, lavawalk, minersgrace, minersluck, experienced, fanged, crop, floatItem};
                            guishop.setContents(list_items);
                            p.openInventory(guishop);
                        } else {
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou do not have permission to execute this command!"));
                        }
                    }
                }else if(args[0].equalsIgnoreCase("reload")){
                    plugin.reloadConfig();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aReloading...");
                    Bukkit.getScheduler().runTaskLater(plugin, () -> {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aConfig has been reloaded!");
                        p.sendMessage("§cIf changes were made in EnchantmentS shop prices please restart server");
                    }, 30);
                }else if(args[0].equalsIgnoreCase("voidless")){
                    if(p.hasPermission("enchantments.voidless")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§1Voidless I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(VoidlessRegister.VOIDLESS, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("assist")){
                    if(p.hasPermission("enchantments.assist")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§4Assist I");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(AssistRegister.ASSIST, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("autosmelt")){
                    if(p.hasPermission("enchantments.autosmelt")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bAutosmelt I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(AutosmeltRegister.AUTOSMELT, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("stealth")){
                    if(p.hasPermission("enchantments.stealth")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§2Stealth I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(StealthRegister.STEALTH, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("withered")){
                    if(p.hasPermission("enchantments.withered")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§5Withered I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredRegister.WITHERED, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("revive")){
                    if(p.hasPermission("enchantments.revive")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§dRevive I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(ReviveRegister.REVIVE, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("saturated")){
                    if(p.hasPermission("enchantments.saturated")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§eSaturated I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedRegister.SATURATED, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("rushing")){
                    if(p.hasPermission("enchantments.rushing")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§3Rushing I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(RushingRegister.RUSHING, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("getbook")){
                    if(p.hasPermission("enchantments.getbook")){
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §cUsage: /getbook <enchantment>");

                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("leap")){
                    if(p.hasPermission("enchantments.leap")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aLeap I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(LeapRegister.LEAP, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("molten")){
                    if(p.hasPermission("enchantments.molten")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§6Molten I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MoltenRegister.MOLTEN, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("fatalblow")){
                    if(p.hasPermission("enchantments.fatalblow")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§9Fatal Blow I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FatalBlowRegister.FATALBLOW, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("healthboost")){
                    if(p.hasPermission("enchantments.healthboost")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§dHealth Boost I");
                        meta.setLore(lore);
                        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 12, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
                        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
                        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                        item.setItemMeta(meta);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(HealthBoostRegister.HEALTHBOOST, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("bossslayer")){
                    if(p.hasPermission("enchantments.bossslayer")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aBossSlayer I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(BossSlayerRegister.BOSSSLAYER, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("hydration")){
                    if(p.hasPermission("enchantments.hydration")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§3Hydration I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(HydrationRegister.HYDRATION, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("dolphin")){
                    if(p.hasPermission("enchantments.dolphin")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bDolphin I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(DolphinRegister.DOLPHIN, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("momentum")){
                    if(p.hasPermission("enchantments.momentum")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§1Momentum I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MomentumRegister.MOMENTUM, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("electrictip")){
                    if(p.hasPermission("enchantments.electrictip")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bElectricTip I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(ElectricTipRegister.ELECTRICTIP, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("lavawalk")){
                    if(p.hasPermission("enchantments.lavawalk")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§6LavaWalk I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(LavaWalkRegister.LAVAWALK, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("minersgrace")){
                    if(p.hasPermission("enchantments.minersgrace")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aMinersGrace I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MinersGraceRegister.MINERSGRACE, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("minersluck")){
                    if(p.hasPermission("enchantments.minersluck")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§6MinersLuck I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(MinersLuckRegister.MINERSLUCK, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("experienced")){
                    if(p.hasPermission("enchantments.experienced")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§eExperienced I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(ExperiencedRegister.EXPERIENCED, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("fanged")){
                    if(p.hasPermission("enchantments.fanged")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§4Fanged I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FangedRegister.FANGED, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("crop")){
                    if(p.hasPermission("enchantments.crop")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§aCrop I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(CropRegister.CROP, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else if(args[0].equalsIgnoreCase("float")){
                    if(p.hasPermission("enchantments.float")){
                        List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                        lore.add("§bFloat I");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().getItemInMainHand().addUnsafeEnchantment(FloatRegister.FLOAT, 1);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0]);
                    }else{
                        p.sendMessage("§cYou do not have permission to execute this command!");
                    }
                }else{
                    p.sendMessage("§cCannot find enchantment:" + args[0]);
                    plugin.getServer().getConsoleSender().sendMessage("§c[Plugin EnchantmentS] Error ><. EnchantmentS.args.0.equals.null " + args[0]);
                    plugin.getServer().getConsoleSender().sendMessage("");
                    plugin.getServer().getConsoleSender().sendMessage("§cTHIS IS NOT A BUG! DO NOT REPORT TO SPIGOT! PLAYER:" + p.getName() + " §cHAS EXECUTED 'NULL' ENCHANTMENT!");

                }







            }else if(args.length == 2){
                if(args[0].equalsIgnoreCase("snipe")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.snipe")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§3Snipe II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(SnipeIIRegister.SNIPEII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("snipe")){
                    if (args[1].equalsIgnoreCase("3")) {
                        if(p.hasPermission("enchantments.snipe")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§3Snipe III");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(SnipeIIIRegister.SNIPEIII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("venomous")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.venomous")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§bVenomous II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(VenomousIIRegister.VENOMOUSII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("experienced")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.experienced")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§eExperienced II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(ExperiencedIIRegister.EXPERIENCEDII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("criticals")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.criticals")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§eCriticals II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(CriticalsIIRegister.CRITICALSII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("regenslash")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.regenslash")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§aRegenslash II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(RegenslashIIRegister.REGENSLASHII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("assist")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.assist")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§9Assist II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(AssistIIRegister.ASSISTII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("withered")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.withered")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§5Withered II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredIIRegister.WITHEREDII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("withered")){
                    if (args[1].equalsIgnoreCase("3")) {
                        if(p.hasPermission("enchantments.withered")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§5Withered III");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredIIIRegister.WITHEREDIII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("withered")){
                    if (args[1].equalsIgnoreCase("4")) {
                        if(p.hasPermission("enchantments.withered")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§5Withered IV");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(WitheredIVRegister.WITHEREDIV, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("curse")){
                    if (args[1].equalsIgnoreCase("movement")) {
                        if(p.hasPermission("enchantments.curse.movement")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§cCurse of Movement");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(MovementRegister.MOVEMENT, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded curse: " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("saturated")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.saturated")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§eSaturated II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedIIRegister.SATURATEDII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("saturated")){
                    if (args[1].equalsIgnoreCase("3")) {
                        if(p.hasPermission("enchantments.saturated")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§eSaturated III");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedIIIRegister.SATURATEDIII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("saturated")){
                    if (args[1].equalsIgnoreCase("4")) {
                        if(p.hasPermission("enchantments.saturated")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§eSaturated IV");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedIVRegister.SATURATEDIV, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("saturated")){
                    if (args[1].equalsIgnoreCase("5")) {
                        if(p.hasPermission("enchantments.saturated")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§eSaturated V");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(SaturatedVRegister.SATURATEDV, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("rushing")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.rushing")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§3Rushing II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(RushingIIRegister.RUSHINGII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("assist")) {
                        if(p.hasPermission("enchantments.getbook.assist")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§4Assist I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(AssistRegister.ASSIST, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("autosmelt")) {
                        if(p.hasPermission("enchantments.getbook.autosmelt")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§bAutosmelt I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(AutosmeltRegister.AUTOSMELT, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("criticals")) {
                        if(p.hasPermission("enchantments.getbook.criticals")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§eCriticals I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(CriticalsRegister.CRITICALS, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("escape")) {
                        if(p.hasPermission("enchantments.getbook.escape")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§dEscape I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(EscapeRegister.ESCAPE, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("feathered")) {
                        if(p.hasPermission("enchantments.getbook.feathered")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§bFeathered I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(FeatheredRegister.FEATHERED, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("lifesteal")) {
                        if(p.hasPermission("enchantments.getbook.lifesteal")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§7Lifesteal I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(LifestealRegister.LIFESTEAL, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("movement")) {
                        if(p.hasPermission("enchantments.getbook.movement")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§cCurse of Movement");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(MovementRegister.MOVEMENT, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("blazeslayer")) {
                        if(p.hasPermission("enchantments.getbook.blazeslayer")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§cBlazeslayer I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(NetherSlayerRegister.NETHERSLAYER, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("regenslash")) {
                        if(p.hasPermission("enchantments.getbook.regenslash")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§aRegenslash I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(RegenslashRegister.REGENSLASH, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("revive")) {
                        if(p.hasPermission("enchantments.getbook.revive")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§dRevive I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(ReviveRegister.REVIVE, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("rushing")) {
                        if(p.hasPermission("enchantments.getbook.rushing")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§3Rushing");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(RushingRegister.RUSHING, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("saturated")) {
                        if(p.hasPermission("enchantments.getbook.saturated")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§eSaturated I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(CriticalsRegister.CRITICALS, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("snipe")) {
                        if(p.hasPermission("enchantments.getbook.snipe")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§3Snipe I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(SnipeRegister.SNIPE, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("stealth")) {
                        if(p.hasPermission("enchantments.getbook.stealth")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§2Stealth");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(StealthRegister.STEALTH, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("telekinesis")) {
                        if(p.hasPermission("enchantments.getbook.telekinesis")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§eTelekinesis I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(TelekinesisRegister.TELEKINESIS, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("uppercut")) {
                        if(p.hasPermission("enchantments.getbook.uppercut")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§cUppercut I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(UppercutRegister.UPPERCUT, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("venomous")) {
                        if(p.hasPermission("enchantments.getbook.venomous")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§bVenomous I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(VenomousRegister.VENOMOUS, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("voidless")) {
                        if(p.hasPermission("enchantments.getbook.voidless")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§1Voidless I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(VoidlessRegister.VOIDLESS, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("withered")) {
                        if(p.hasPermission("enchantments.getbook.withered")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§5Withered I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(WitheredRegister.WITHERED, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("leap")) {
                        if(p.hasPermission("enchantments.getbook.leap")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§aLeap I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(LeapRegister.LEAP, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("molten")) {
                        if(p.hasPermission("enchantments.getbook.molten")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§6Molten I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(MoltenRegister.MOLTEN, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("curse")){
                    if (args[1].equalsIgnoreCase("sight")) {
                        if(p.hasPermission("enchantments.curse.sight")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§cCurse of Sight");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(SightRegister.SIGHT, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded curse: " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("sight")) {
                        if(p.hasPermission("enchantments.getbook.sight")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§cCurse of Sight");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(SightRegister.SIGHT, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded curse: " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("fatalblow")) {
                        if(p.hasPermission("enchantments.getbook.fatalblow")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§9Fatal Blow I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(FatalBlowRegister.FATALBLOW, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("healthboost")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.healthboost")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§dHealth Boost II");
                            AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 16, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
                            meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
                            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                            item.setItemMeta(meta);
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(HealthBoostIIRegister.HEALTHBOOSTII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("healthboost")){
                    if (args[1].equalsIgnoreCase("3")) {
                        if(p.hasPermission("enchantments.healthboost")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§dHealth Boost III");
                            AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 18, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
                            meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
                            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                            item.setItemMeta(meta);
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(HealthBoostIIIRegister.HEALTHBOOSTIII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("healthboost")) {
                        if(p.hasPermission("enchantments.getbook.healthboost")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§dHealth Boost I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(HealthBoostRegister.HEALTHBOOST, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("bossslayer")) {
                        if(p.hasPermission("enchantments.getbook.bossslayer")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§aBossSlayer I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(BossSlayerRegister.BOSSSLAYER, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("hydration")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.hydration")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§3Hydration II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(HydrationIIRegister.HYDRATIONII, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("hydration")) {
                        if(p.hasPermission("enchantments.getbook.hydration")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§3Hydration I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(HydrationRegister.HYDRATION, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("dolphin")) {
                        if(p.hasPermission("enchantments.getbook.dolphin")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§bDolphin I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(HydrationRegister.HYDRATION, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("momentum")) {
                        if(p.hasPermission("enchantments.getbook.momentum")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§1Momentum I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(HydrationRegister.HYDRATION, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("electrictip")) {
                        if(p.hasPermission("enchantments.getbook.electrictip")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§bElectricTip I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(ElectricTipRegister.ELECTRICTIP, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("lavawalk")) {
                        if(p.hasPermission("enchantments.getbook.lavawalk")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§6LavaWalk I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(LavaWalkRegister.LAVAWALK, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("minersgrace")) {
                        if(p.hasPermission("enchantments.getbook.minersgrace")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§aMinersGrace I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(MinersGraceRegister.MINERSGRACE, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("minersluck")){
                    if (args[1].equalsIgnoreCase("2")) {
                        if(p.hasPermission("enchantments.minersluck")){
                            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
                            lore.add("§6MinersLuck II");
                            meta.setLore(lore);
                            item.setItemMeta(meta);
                            p.getInventory().getItemInMainHand().addUnsafeEnchantment(MinersLuckIIRegister.MINERSLUCK, 1);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("minersluck")) {
                        if(p.hasPermission("enchantments.getbook.minersluck")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§6MinersLuck I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(MinersLuckRegister.MINERSLUCK, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("experienced")) {
                        if(p.hasPermission("enchantments.getbook.experienced")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§eExperienced I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(ExperiencedRegister.EXPERIENCED, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("fanged")) {
                        if(p.hasPermission("enchantments.getbook.fanged")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§4Fanged I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(FangedRegister.FANGED, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("crop")) {
                        if(p.hasPermission("enchantments.getbook.crop")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§aCrop I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(CropRegister.CROP, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("float")) {
                        if(p.hasPermission("enchantments.getbook.float")){
                            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                            ItemMeta bookMeta = book.getItemMeta();
                            List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                            bookMeta.setDisplayName("§eEnchanted Book");
                            lore.add("§bFloat I");
                            bookMeta.setLore(lore);
                            book.setItemMeta(bookMeta);
                            book.addUnsafeEnchantment(FloatRegister.FLOAT, 1);
                            p.getInventory().addItem(book);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                        }else{
                            p.sendMessage("§cYou do not have permission to execute this command!");
                        }
                    }
                }else { }






            }else if(args.length == 3){
                if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("assist")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.assist")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§9Assist II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(AssistIIRegister.ASSISTII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("regenslash")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.regenslash")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§aRegenslash II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(RegenslashIIRegister.REGENSLASHII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("rushing")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.rushing")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§3Rushing II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(RushingIIRegister.RUSHINGII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("saturated")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.saturated")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§eSaturated II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(SaturatedIIRegister.SATURATEDII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("saturated")) {
                        if(args[2].equalsIgnoreCase("3")) {
                            if (p.hasPermission("enchantments.getbook.saturated")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§eSaturated III");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(SaturatedIIIRegister.SATURATEDIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("saturated")) {
                        if(args[2].equalsIgnoreCase("4")) {
                            if (p.hasPermission("enchantments.getbook.saturated")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§eSaturated IV");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(SaturatedIVRegister.SATURATEDIV, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("saturated")) {
                        if(args[2].equalsIgnoreCase("5")) {
                            if (p.hasPermission("enchantments.getbook.saturated")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§eSaturated V");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(SaturatedVRegister.SATURATEDV, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("snipe")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.snipe")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§3Snipe II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(SnipeIIRegister.SNIPEII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("snipe")) {
                        if(args[2].equalsIgnoreCase("3")) {
                            if (p.hasPermission("enchantments.getbook.snipe")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§3Snipe III");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(SnipeIIIRegister.SNIPEIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("venomous")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.venomous")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§bVenomous II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(VenomousIIRegister.VENOMOUSII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("withered")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.withered")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§5Withered II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(WitheredIIRegister.WITHEREDII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("withered")) {
                        if(args[2].equalsIgnoreCase("3")) {
                            if (p.hasPermission("enchantments.getbook.withered")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§5Withered III");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(WitheredIIIRegister.WITHEREDIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("withered")) {
                        if(args[2].equalsIgnoreCase("4")) {
                            if (p.hasPermission("enchantments.getbook.withered")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§5Withered IV");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(WitheredIVRegister.WITHEREDIV, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("healthboost")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.healthboost")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§dHealth Boost II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(HealthBoostIIRegister.HEALTHBOOSTII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("healthboost")) {
                        if(args[2].equalsIgnoreCase("3")) {
                            if (p.hasPermission("enchantments.getbook.healthboost")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§dHealth Boost III");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(HealthBoostIIIRegister.HEALTHBOOSTIII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("hydration")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.hydration")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§3Hydration II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(HydrationIIRegister.HYDRATIONII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("minersluck")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.minersluck")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§6MinersLuck II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(MinersLuckIIRegister.MINERSLUCK, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }if(args[0].equalsIgnoreCase("getbook")){
                    if (args[1].equalsIgnoreCase("experienced")) {
                        if(args[2].equalsIgnoreCase("2")) {
                            if (p.hasPermission("enchantments.getbook.experienced")) {
                                ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
                                ItemMeta bookMeta = book.getItemMeta();
                                List<String> lore = bookMeta.hasLore() ? bookMeta.getLore() : new ArrayList<>();
                                bookMeta.setDisplayName("§eEnchanted Book");
                                lore.add("§eExperienced II");
                                bookMeta.setLore(lore);
                                book.setItemMeta(bookMeta);
                                book.addUnsafeEnchantment(ExperiencedIIRegister.EXPERIENCEDII, 1);
                                p.getInventory().addItem(book);
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix) + " §aAdded enchantment: " + args[0] + " " + args[1]);
                            } else {
                                p.sendMessage("§cYou do not have permission to execute this command!");
                            }
                        }
                    }
                }else {}
            }






        }else {
            sender.sendMessage("§cOnly players may execute this command!");
        }
        return true;
    }
}
