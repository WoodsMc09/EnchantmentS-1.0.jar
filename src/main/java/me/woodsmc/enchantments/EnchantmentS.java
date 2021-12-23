package me.woodsmc.enchantments;

import me.woodsmc.enchantments.anvil.*;
import me.woodsmc.enchantments.commands.MainCommand;
import me.woodsmc.enchantments.commands.enchantmentTabCompleter;
import me.woodsmc.enchantments.enchants.*;
import me.woodsmc.enchantments.listeners.*;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantmentS extends JavaPlugin {
    

    private static EnchantmentS plugin;
    private static EnchantmentS server;
    private Economy econ;
    @Override
    public void onEnable() {
        plugin = this;
        if (!setupEconomy() ) {
            Bukkit.getLogger().severe(String.format("[%s] - Shop Disabled due to Vault not installed", getDescription().getName()));

        }
        getServer().getConsoleSender().sendMessage("§5EnchantmentS §8>> §aPlugin Has Enabled! §d(1.0)");
        PluginManager pluginManager = getServer().getPluginManager();
        FeatheredRegister.register();
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new FeatheredListener(), this);
        getCommand("enchantments").setExecutor(new MainCommand());
        getServer().getPluginManager().registerEvents(new TelekinesisListener(), this);
        this.getCommand("enchantments").setTabCompleter(new enchantmentTabCompleter());
        NetherSlayerRegister.register();
        TelekinesisRegister.register();
        SnipeRegister.register();
        SnipeIIRegister.register();
        LifestealRegister.register();
        RegenslashRegister.register();
        VenomousRegister.register();
        UppercutRegister.register();
        SnipeIIIRegister.register();
        VenomousIIRegister.register();
        CriticalsRegister.register();
        EscapeRegister.register();
        CriticalsIIRegister.register();
        RegenslashIIRegister.register();
        VoidlessRegister.register();
        AssistRegister.register();
        AssistIIRegister.register();
        AutosmeltRegister.register();
        StealthRegister.register();
        WitheredRegister.register();
        WitheredIIRegister.register();
        WitheredIIIRegister.register();
        WitheredIVRegister.register();
        ReviveRegister.register();
        MovementRegister.register();
        SaturatedRegister.register();
        SaturatedIIRegister.register();
        SaturatedIIIRegister.register();
        SaturatedIVRegister.register();
        SaturatedVRegister.register();
        RushingRegister.register();
        RushingIIRegister.register();
        LeapRegister.register();
        MoltenRegister.register();
        SightRegister.register();
        FatalBlowRegister.register();
        HealthBoostRegister.register();
        HealthBoostIIIRegister.register();
        HealthBoostIIIRegister.register();
        BossSlayerRegister.register();
        HydrationRegister.register();
        HydrationIIRegister.register();
        DolphinRegister.register();
        MomentumRegister.register();
        ElectricTipRegister.register();
        LavaWalkRegister.register();
        MinersGraceRegister.register();
        MinersLuckRegister.register();
        MinersLuckIIRegister.register();
        ExperiencedRegister.register();
        ExperiencedIIRegister.register();
        FangedRegister.register();
        CropRegister.register();
        FloatRegister.register();
        pluginManager.registerEvents(new FloatAnvil(), this);
        pluginManager.registerEvents(new FloatListener(), this);
        pluginManager.registerEvents(new CropListener(), this);
        pluginManager.registerEvents(new CropAnvil(), this);
        pluginManager.registerEvents(new FangedListener(), this);
        pluginManager.registerEvents(new FangedAnvil(), this);
        pluginManager.registerEvents(new ExperiencedListener(), this);
        pluginManager.registerEvents(new ExperiencedIIListener(), this);
        pluginManager.registerEvents(new ExperiencedAnvil(), this);
        pluginManager.registerEvents(new ExperiencedIIAnvil(), this);
        pluginManager.registerEvents(new MinersLuckAnvil(), this);
        pluginManager.registerEvents(new MinersLuckIIAnvil(), this);
        pluginManager.registerEvents(new MinersLuckListener(), this);
        pluginManager.registerEvents(new MinersLuckIIListener(), this);
        pluginManager.registerEvents(new MinersGraceAnvil(), this);
        pluginManager.registerEvents(new MinersGraceListener(), this);
        pluginManager.registerEvents(new LavaWalkAnvil(), this);
        pluginManager.registerEvents(new LavaWalkListener(), this);
        pluginManager.registerEvents(new ElectricTipAnvil(), this);
        pluginManager.registerEvents(new ElectricTipListener(), this);
        pluginManager.registerEvents(new MomentumAnvil(), this);
        pluginManager.registerEvents(new MomentumListener(), this);
        pluginManager.registerEvents(new DolphinListener(), this);
        pluginManager.registerEvents(new DolphinAnvil(), this);
        pluginManager.registerEvents(new HydrationListener(), this);
        pluginManager.registerEvents(new HydrationIIListener(), this);
        pluginManager.registerEvents(new HydrationAnvil(), this);
        pluginManager.registerEvents(new HydrationIIAnvil(), this);
        pluginManager.registerEvents(new BossSlayerAnvil(), this);
        pluginManager.registerEvents(new BossSlayerListener(), this);
        pluginManager.registerEvents(new ShopGuiClickListener(), this);
        pluginManager.registerEvents(new HealthBoostAnvil(), this);
        pluginManager.registerEvents(new HealthBoostIIAnvil(), this);
        pluginManager.registerEvents(new HealthBoostIIIAnvil(), this);
        pluginManager.registerEvents(new FatalBlowAnvil(), this);
        pluginManager.registerEvents(new FatalBlowListener(), this);
        pluginManager.registerEvents(new SightAnvil(), this);
        getServer().getPluginManager().registerEvents(new SightListener(), this);
        getServer().getPluginManager().registerEvents(new MoltenAnvil(), this);
        getServer().getPluginManager().registerEvents(new MoltenListener(), this);
        getServer().getPluginManager().registerEvents(new LeapAnvil(), this);
        getServer().getPluginManager().registerEvents(new LeapListener(), this);
        getServer().getPluginManager().registerEvents(new RushingIIListener(), this);
        getServer().getPluginManager().registerEvents(new RushingIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new RushingAnvil(), this);
        getServer().getPluginManager().registerEvents(new RushingListener(), this);
        getServer().getPluginManager().registerEvents(new CriticalsAnvil(), this);
        getServer().getPluginManager().registerEvents(new EscapeAnvil(), this);
        getServer().getPluginManager().registerEvents(new FeatheredAnvil(), this);
        getServer().getPluginManager().registerEvents(new LifestealAnvil(), this);
        getServer().getPluginManager().registerEvents(new MovementAnvil(), this);
        getServer().getPluginManager().registerEvents(new NetherslayerAnvil(), this);
        getServer().getPluginManager().registerEvents(new RegenslashAnvil(), this);
        getServer().getPluginManager().registerEvents(new RegenslashIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new ReviveAnvil(), this);
        getServer().getPluginManager().registerEvents(new SaturatedAnvil(), this);
        getServer().getPluginManager().registerEvents(new SaturatedIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new SaturatedIIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new SaturatedIVAnvil(), this);
        getServer().getPluginManager().registerEvents(new SaturatedVAnvil(), this);
        getServer().getPluginManager().registerEvents(new SnipeAnvil(), this);
        getServer().getPluginManager().registerEvents(new SnipeIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new SnipeIIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new StealthAnvil(), this);
        getServer().getPluginManager().registerEvents(new TelekinesisAnvil(), this);
        getServer().getPluginManager().registerEvents(new UppercutAnvil(), this);
        getServer().getPluginManager().registerEvents(new VenomousAnvil(), this);
        getServer().getPluginManager().registerEvents(new VenomousIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new VoidlessAnvil(), this);
        getServer().getPluginManager().registerEvents(new WitheredAnvil(), this);
        getServer().getPluginManager().registerEvents(new WitheredIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new WitheredIIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new WitheredIVAnvil(), this);
        getServer().getPluginManager().registerEvents(new CriticalsAnvil(), this);
        getServer().getPluginManager().registerEvents(new AutoSmeltAnvil(), this);
        getServer().getPluginManager().registerEvents(new AssistAnvil(), this);
        getServer().getPluginManager().registerEvents(new AssistIIAnvil(), this);
        getServer().getPluginManager().registerEvents(new SaturatedListener(), this);
        getServer().getPluginManager().registerEvents(new SaturatedIIListener(), this);
        getServer().getPluginManager().registerEvents(new SaturatedIIIListener(), this);
        getServer().getPluginManager().registerEvents(new SaturatedIVListener(), this);
        getServer().getPluginManager().registerEvents(new SaturatedVListener(), this);
        getServer().getPluginManager().registerEvents(new MovementListener(), this);
        getServer().getPluginManager().registerEvents(new WitheredListener(), this);
        getServer().getPluginManager().registerEvents(new WitheredIIListener(), this);
        getServer().getPluginManager().registerEvents(new WitheredIIIListener(), this);
        getServer().getPluginManager().registerEvents(new WitheredIVListener(), this);
        getServer().getPluginManager().registerEvents(new StealthListener(), this);
        getServer().getPluginManager().registerEvents(new SnipeListener(), this);
        getServer().getPluginManager().registerEvents(new NetherSlayerListener(), this);
        getServer().getPluginManager().registerEvents(new SnipeIIListener(), this);
        getServer().getPluginManager().registerEvents(new LifestealListener(), this);
        getServer().getPluginManager().registerEvents(new RegenslashListener(), this);
        getServer().getPluginManager().registerEvents(new VenomousListener(), this);
        getServer().getPluginManager().registerEvents(new UppercutListener(), this);
        getServer().getPluginManager().registerEvents(new SnipeIIIListener(), this);
        getServer().getPluginManager().registerEvents(new VenomousIIListener(), this);
        getServer().getPluginManager().registerEvents(new CriticalsListener(), this);
        getServer().getPluginManager().registerEvents(new EscapeListener(), this);
        getServer().getPluginManager().registerEvents(new CriticalsIIListener(), this);
        getServer().getPluginManager().registerEvents(new RegenslashIIListener(), this);
        getServer().getPluginManager().registerEvents(new VoidlessListener(), this);
        getServer().getPluginManager().registerEvents(new AssistListener(), this);
        getServer().getPluginManager().registerEvents(new AssistIIListener(), this);
        getServer().getPluginManager().registerEvents(new AutosmeltListener(), this);
        getServer().getPluginManager().registerEvents(new GuiClickListener(), this);
        getServer().getPluginManager().registerEvents(new ReviveListener(), this);
    }
    public static EnchantmentS getPlugin() {
        return plugin;
    }
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }


    public Economy getEconomy() {
        return econ;
    }
}

