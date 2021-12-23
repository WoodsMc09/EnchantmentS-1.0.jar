package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.FloatRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FloatListener implements Listener {


    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Arrow){
            if(event.getEntity() instanceof Player){
                Arrow arrow = (Arrow) event.getDamager();
                if(arrow.getShooter() instanceof Player){
                    Player damager = (Player) arrow.getShooter();
                    Player victim = (Player) event.getEntity();
                    if(damager.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(FloatRegister.FLOAT.getKey()))){
                        victim.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 80, 1, false, false, false));


                    }else{

                    }

                }

            }

        }

    }
}
