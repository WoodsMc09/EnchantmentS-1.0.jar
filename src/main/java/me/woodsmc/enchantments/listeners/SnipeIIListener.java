package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.SnipeIIRegister;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public class SnipeIIListener implements Listener {

    @EventHandler
    public void onEntityShoot(EntityShootBowEvent event){
        if(event.getBow().getItemMeta().hasEnchant(SnipeIIRegister.SNIPEII)){
            Projectile projectile = (Projectile) event.getProjectile();
            projectile.setVelocity( projectile.getVelocity().multiply(3));

        }
    }
}
