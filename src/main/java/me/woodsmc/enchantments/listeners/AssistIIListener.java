package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.AssistIIRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AssistIIListener implements Listener {

    @EventHandler
    public void onEntityDamageEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player p = (Player) event.getDamager();
            if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(AssistIIRegister.ASSISTII.getKey()))){
                if(p.getHealth() <= 5){
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 260, 0, true, false, true));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 260, 2, true, false, true));
                }else{

                }
            }else{

            }
        }
    }
}
