package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.VenomousIIRegister;
import me.woodsmc.enchantments.enchants.VoidlessRegister;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class VoidlessListener implements Listener {

    @EventHandler
       public void onPlayerMove(PlayerMoveEvent event){
        Player p = event.getPlayer();
        Location location = p.getLocation();
        if(p.getInventory().getChestplate() == null) {

        }else if(p.getInventory().getChestplate().getType() == Material.ELYTRA){
            if(p.getInventory().getChestplate().getEnchantments().containsKey(Enchantment.getByKey(VoidlessRegister.VOIDLESS.getKey()))){
                if(location.getY() <= -5){
                    p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 15, false, false, false));
                }else { }
            }else { }
        }else { }
    }
}
