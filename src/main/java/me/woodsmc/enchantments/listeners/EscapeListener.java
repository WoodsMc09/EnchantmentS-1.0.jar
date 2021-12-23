package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.EscapeRegister;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class EscapeListener implements Listener {

    @EventHandler
        public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof Player){
            Player p = (Player) event.getEntity();
            if(p.getInventory().getChestplate() == null){

            }else if(p.getInventory().getChestplate().getItemMeta().hasEnchant(EscapeRegister.ESCAPE)){
                Random rand = new Random();
                int number = rand.nextInt(100) + 1;
                if(number >= 40)
                {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 160, 1, true, false, false));
                }
            }else{

            }
        }
    }
}
