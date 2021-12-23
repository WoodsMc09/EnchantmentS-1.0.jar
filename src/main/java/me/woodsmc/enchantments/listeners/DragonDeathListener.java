package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.DragonDeathRegister;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DragonDeathListener implements Listener {


    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player p = event.getEntity();
        World world = p.getWorld();
        Location location = p.getLocation();
        if(p.getInventory().getLeggings().getEnchantments().containsKey(Enchantment.getByKey(DragonDeathRegister.DRAGONDEATH.getKey()))){


        }else{

        }
    }
}
