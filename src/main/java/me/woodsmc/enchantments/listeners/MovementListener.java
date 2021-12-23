package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.MovementRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MovementListener implements Listener {


    @EventHandler
        public void onWalk(PlayerMoveEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getBoots() == null){
        }else if(p.getInventory().getBoots().getEnchantments().containsKey(Enchantment.getByKey(MovementRegister.MOVEMENT.getKey()))){
           p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1, 0, false, false, false));
        }else{ }
    }
}
