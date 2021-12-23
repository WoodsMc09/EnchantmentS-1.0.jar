package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.SnipeRegister;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;


public class SnipeListener implements Listener {

    @EventHandler
    public void onEntityShoot(EntityShootBowEvent event){
        if(event.getBow().getItemMeta().hasEnchant(SnipeRegister.SNIPE)){
            Projectile projectile = (Projectile) event.getProjectile();
            projectile.setVelocity( projectile.getVelocity().multiply(2));

        }
    }
}
