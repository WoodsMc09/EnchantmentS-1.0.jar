package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.UppercutRegister;
import org.bukkit.Location;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class UppercutListener implements Listener {

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player damager = (Player) event.getDamager();
            if (damager.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(UppercutRegister.UPPERCUT.getKey()))) {
                        if(event.getEntity().getType() == EntityType.PLAYER){ }else {
                            Mob victim = (Mob) event.getEntity();
                            victim.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 5, 15, true, false, false));
                        }

            }else {

            }
        }
    }
}

