package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.DolphinRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DolphinListener implements Listener {


    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getBoots() == null) { }else if(p.getInventory().getBoots().getEnchantments().containsKey(Enchantment.getByKey(DolphinRegister.DOLPHIN.getKey()))){
            if(p.isSwimming()){
                p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 5, 5, false, false, false));
            }else { }
        }else { }
    }
}
