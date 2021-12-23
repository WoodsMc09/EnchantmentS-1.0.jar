package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.SnipeIIIRegister;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public class SnipeIIIListener implements Listener {

    static EnchantmentS plugin;


    @EventHandler
    public void onEntityShoot(EntityShootBowEvent event){
        if(event.getBow().getItemMeta().hasEnchant(SnipeIIIRegister.SNIPEIII)){
            Projectile projectile = (Projectile) event.getProjectile();
            projectile.setVelocity( projectile.getVelocity().multiply(5));


        }
    }



        }




