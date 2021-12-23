package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.MinersGraceRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;

public class MinersGraceListener implements Listener {


    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getItemInMainHand() == null){ }else if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(MinersGraceRegister.MINERSGRACE.getKey()))){
            if(p.hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
                p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
            }else {

            }
        }else{

        }
    }
}
