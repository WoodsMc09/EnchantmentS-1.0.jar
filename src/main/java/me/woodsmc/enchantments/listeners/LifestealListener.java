package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.LifestealEnchantment;
import me.woodsmc.enchantments.enchants.LifestealRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LifestealListener implements Listener {


    @EventHandler
        public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if (event.getDamager() instanceof Player) {
            Player damager = (Player) event.getDamager();
            if (damager.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(LifestealRegister.LIFESTEAL.getKey()))){
                    if(event.getEntityType() == EntityType.PLAYER){
                        Mob victim = (Mob) event.getEntity();
                        victim.damage(2);
                        damager.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 0, true, false, false));
                    }

            }else{

            }

        }
    }
}
