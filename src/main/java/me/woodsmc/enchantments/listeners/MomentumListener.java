package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.MomentumRegister;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class MomentumListener implements Listener {



    @EventHandler
    public void onGlide(PlayerMoveEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getChestplate() == null) { }else if(p.getInventory().getChestplate().getType() == Material.ELYTRA){
            if(p.getInventory().getChestplate().getEnchantments().containsKey(Enchantment.getByKey(MomentumRegister.MOMENTUM.getKey()))){
                if(p.isGliding()){
                    Random rand = new Random();
                    int number = rand.nextInt(100) + 1;
                    if(number >= 99)
                    {
                        p.setVelocity(p.getVelocity().multiply(1.5F));
                    }
                }else { }
            }else { }
        }else { }
    }
}
