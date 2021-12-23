package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.FatalBlowRegister;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;

public class FatalBlowListener implements Listener {

    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);
    boolean fire = plugin.getConfig().getBoolean("setFire");
    boolean blocks = plugin.getConfig().getBoolean("breakBlocks");

    @EventHandler
        public void onDie(PlayerDeathEvent event){
        Player p = event.getEntity();
        Location location = p.getLocation();
        World world = p.getWorld();
        if(p.getInventory().getLeggings() == null) { }else if(p.getInventory().getLeggings().getEnchantments().containsKey(Enchantment.getByKey(FatalBlowRegister.FATALBLOW.getKey()))){
            world.createExplosion(location, 2, fire, blocks);
            world.strikeLightning(location);
        }else { }
    }
}
