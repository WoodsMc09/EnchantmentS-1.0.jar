package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.LeapRegister;
import me.woodsmc.enchantments.enchants.RushingRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LeapListener implements Listener {



    @EventHandler
        public void onMove(PlayerMoveEvent event){
            Player p = event.getPlayer();
            if(p.getInventory().getBoots() == null){ }else if(p.getInventory().getBoots().getEnchantments().containsKey(Enchantment.getByKey(LeapRegister.LEAP.getKey()))){
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1, 0, false, false, false));
            }else { }
    }
}
