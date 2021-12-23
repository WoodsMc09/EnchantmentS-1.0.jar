package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.FangedRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.EvokerFangs;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class FangedListener implements Listener {



    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof Player){
            Player p = (Player) event.getEntity();
            Entity entity = event.getDamager();
            for (ItemStack i : p.getInventory().getArmorContents()){
                if(i == null){ }else if(i.getEnchantments().containsKey(Enchantment.getByKey(FangedRegister.FANGED.getKey()))){
                    if(p.getHealth() <= 10){
                        EvokerFangs fangs = (EvokerFangs) entity.getWorld().spawnEntity(entity.getLocation(), EntityType.EVOKER_FANGS);
                        fangs.setOwner(p);
                    }

                }else{

                }
            }
        }


    }
}
