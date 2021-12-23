package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.SaturatedVRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class SaturatedVListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getHelmet() == null){ }else if(p.getInventory().getHelmet().getEnchantments().containsKey(Enchantment.getByKey(SaturatedVRegister.SATURATEDV.getKey()))){
            Random rand = new Random();
            int number = rand.nextInt(100) + 1;
            if(number >= 84){
                p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 3, 2, false, false, false));
            }else {}
        }else {}
    }
}
