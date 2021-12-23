package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.ReviveRegister;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Map;

public class ReviveListener implements Listener {

    Map<String, Long> cooldowns = new HashMap<String, Long>();
    @EventHandler
        public void onEntityDamagebyEntity(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof  Player) {
            Player p = (Player) event.getEntity();
            if (p.getInventory().getChestplate() == null) {
            } else if (p.getInventory().getChestplate().getEnchantments().containsKey(Enchantment.getByKey(ReviveRegister.REVIVE.getKey()))) {
                if (p.getHealth() <= 3) {
                    if (cooldowns.containsKey(p.getName())) {
                        if (cooldowns.get(p.getName()) > System.currentTimeMillis()) {
                        }
                    } else {
                        p.setHealth(p.getHealth() + 12);
                        cooldowns.put(p.getName(), System.currentTimeMillis() + (8 * 1000));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 4, false, false, false));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1, false, false, false));
                    }

                }
            }
        }else{ }
    }

}
