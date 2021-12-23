package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.SightRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class SightListener implements Listener {



    @EventHandler
        public void onMove(PlayerMoveEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getHelmet() == null){ }else if(p.getInventory().getHelmet().getEnchantments().containsKey(Enchantment.getByKey(SightRegister.SIGHT.getKey()))){
            Random rand = new Random();
            int number = rand.nextInt(100) + 1;
            if(number >= 99)
            {
                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 1, true, false, false));
            }
        }else { }
    }
    }
