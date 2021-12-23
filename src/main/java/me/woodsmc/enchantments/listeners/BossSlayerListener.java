package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.BossSlayerRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;

public class BossSlayerListener implements Listener {

    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);
    int enderdragon = plugin.getConfig().getInt("enderdragonDamage");
    int wither = plugin.getConfig().getInt("witherDamage");
    int elderguardian = plugin.getConfig().getInt("elderguardianDamage");

    @EventHandler
        public void onEntityDamageEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player p = (Player) event.getDamager();
            if(p.getInventory().getItemInMainHand() == null) return;
            if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(BossSlayerRegister.BOSSSLAYER.getKey()))){
                Mob mob = (Mob) event.getEntity();
                if(mob.getType() == EntityType.ENDER_DRAGON){
                    mob.damage(enderdragon);
                }else if(mob.getType() == EntityType.WITHER){
                    mob.damage(wither);
                }else if(mob.getType() == EntityType.ELDER_GUARDIAN){
                    mob.damage(elderguardian);
                }else { }
            }else { }
        }
    }
}
