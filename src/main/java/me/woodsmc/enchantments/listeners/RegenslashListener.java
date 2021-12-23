package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.LifestealRegister;
import me.woodsmc.enchantments.enchants.RegenslashRegister;
import me.woodsmc.enchantments.enchants.TelekinesisEnchantment;
import me.woodsmc.enchantments.enchants.VenomousRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class RegenslashListener implements Listener {

    @EventHandler
        public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if (event.getDamager() instanceof Player) {
            Player damager = (Player) event.getDamager();
            if(damager.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(RegenslashRegister.REGENSLASH.getKey()))){
            if(event.getEntityType() == EntityType.PLAYER) {
                Player killed = (Player) event.getEntity();
                if (killed.isDead() || killed.getHealth() <= 0) {
                    damager.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 0, true, false, false));
                }
            }
            }else{

            }
        }
    }
}
