package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.LeapRegister;
import me.woodsmc.enchantments.enchants.MoltenRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class MoltenListener implements Listener {




    @EventHandler
    public void onMove(PlayerMoveEvent event){


        Player p = event.getPlayer();
        if(p.getInventory().getChestplate() == null){ }else if(p.getInventory().getChestplate().getEnchantments().containsKey(Enchantment.getByKey(MoltenRegister.MOLTEN.getKey()))){
            p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 60, 0, false, false, false));
        }else { }
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player p = (Player) event.getDamager();
            Entity victim = (Entity) event.getEntity();
            if(p.getInventory().getChestplate() == null) { }else if(p.getInventory().getChestplate().getEnchantments().containsKey(Enchantment.getByKey(MoltenRegister.MOLTEN.getKey()))){
                Random rand = new Random();
                int number = rand.nextInt(100) + 1;
                if(number >= 80)
                {
                    victim.setFireTicks(140);
                }
            }else { }
        }else { }

    }
}
