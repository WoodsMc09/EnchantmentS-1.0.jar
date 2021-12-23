package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.VenomousRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class VenomousListener implements Listener {

    @EventHandler
        public void onEntityDamageEntity(EntityDamageByEntityEvent event){
        if (event.getDamager() instanceof Player) {
            Player damager = (Player) event.getDamager();
            if (damager.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(VenomousRegister.VENOMOUS.getKey()))) {
                if (event.getEntity().getType() != EntityType.PLAYER) {
                } else {
                    Player victim = (Player) event.getEntity();
                    victim.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 0, true, false, false));
                }
                }else{

                }

        }
    }
}
