package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.ElectricTipRegister;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class ElectricTipListener implements Listener {

        private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Arrow){
            if(event.getEntity() instanceof Player) {
                Arrow arrow = (Arrow) event.getDamager();
                if(arrow.getShooter() instanceof Player) {
                    Player damager = (Player) arrow.getShooter();
                    Player victim = (Player) event.getEntity();
                    World world = arrow.getWorld();
                    Location location = victim.getLocation();
                    if (damager.getInventory().getItemInMainHand().getType() == Material.BOW || damager.getInventory().getItemInMainHand().getType() == Material.CROSSBOW) {
                        if (damager.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(ElectricTipRegister.ELECTRICTIP.getKey()))) {
                            Random rand = new Random();
                            int number = rand.nextInt(100) + 1;
                            if (number >= 90) {
                                world.strikeLightning(location);
                                world.spawnParticle(Particle.ELECTRIC_SPARK, victim.getLocation().add(0, -1, 0), (int) 0.5F);
                            }
                        } else {
                        }
                    } else {
                    }
                }else{
                    return;
                }
            }else  { }
        }else { }
    }

}
