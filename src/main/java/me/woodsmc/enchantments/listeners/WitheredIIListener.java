package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.WitheredIIRegister;
import me.woodsmc.enchantments.enchants.WitheredRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class WitheredIIListener implements Listener {

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player p = (Player) event.getDamager();
            if(event.getEntity().getType() != EntityType.PLAYER){ }else {
                Player victim = (Player) event.getEntity();
                if (p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(WitheredIIRegister.WITHEREDII.getKey()))) {
                    victim.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 240, 0, true, false, false));
                } else {

                }
            }
        }else{

        }
    }
}
