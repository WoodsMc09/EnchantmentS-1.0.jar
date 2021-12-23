package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.AssistRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AssistListener implements Listener {

    @EventHandler
        public void onEntityDamageEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player p = (Player) event.getDamager();
            if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(AssistRegister.ASSIST.getKey()))){
                if(p.getHealth() <= 6){
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 180, 0, true, false, true));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 180, 1, true, false, true));
                }else{

                }
            }else{

            }
        }
    }
}
