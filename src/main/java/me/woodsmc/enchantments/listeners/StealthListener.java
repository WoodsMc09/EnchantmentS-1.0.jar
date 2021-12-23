package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.StealthRegister;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;


public class StealthListener implements Listener {
    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);


    @EventHandler
        public void onPlayerClick(PlayerInteractEvent event){
        Player p = (Player) event.getPlayer();
        World world = p.getWorld();
        Location location = p.getLocation();
        if(p.getInventory().getLeggings() == null){

        }else if(p.getInventory().getLeggings().getEnchantments().containsKey(Enchantment.getByKey(StealthRegister.STEALTH.getKey()))){
            if(p.isSneaking()){
                int x = p.getLocation().getBlockX();
                int y = p.getLocation().getBlockY();
                int z = p.getLocation().getBlockZ();
                p.setVelocity(new Vector(x, x, z));
                p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 90, 1, false, false, false));
                if(p.hasGravity()) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 260, 0, false, false, false));
                }else { }



            }else{

            }
        }else{

        }
    }
}
