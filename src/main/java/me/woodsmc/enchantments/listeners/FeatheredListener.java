package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.FeatheredRegister;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FeatheredListener implements Listener {

    @EventHandler
    public void onPlayerSneak(PlayerToggleSneakEvent event) {
        Player p = event.getPlayer();
        if (p.getInventory().getBoots() == null){

        }else if(p.getInventory().getBoots().getItemMeta().hasEnchant(FeatheredRegister.FEATHERED)){
            if (!p.isSneaking()){
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 99999, 1, true, false, false));

            }else{
                p.removePotionEffect(PotionEffectType.SLOW_FALLING);
            }
        }
    }
}
