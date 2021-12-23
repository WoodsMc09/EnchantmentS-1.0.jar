package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.RushingIIRegister;
import me.woodsmc.enchantments.enchants.RushingRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RushingIIListener implements Listener {



    @EventHandler
    public void onWalk(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        if(p.getInventory().getBoots() == null){ }else if(p.getInventory().getBoots().getEnchantments().containsKey(Enchantment.getByKey(RushingIIRegister.RUSHINGII.getKey()))){
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1, 1, false, false, false));
        }else { }
    }
}
