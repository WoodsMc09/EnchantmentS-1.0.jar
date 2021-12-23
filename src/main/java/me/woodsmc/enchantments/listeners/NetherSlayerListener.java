package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.NetherSlayerRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class NetherSlayerListener implements Listener {

    @EventHandler
        public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player damager = (Player) event.getDamager();
            if (damager.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(NetherSlayerRegister.NETHERSLAYER.getKey()))){
                if (event.getEntityType() == EntityType.BLAZE){
                    Mob victim = (Mob) event.getEntity();
                    victim.damage(7);

                }
            }else{

            }

        }
    }
}
