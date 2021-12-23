package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.CriticalsRegister;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;

public class CriticalsIIListener implements Listener {

    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);
    int lvl2 = plugin.getConfig().getInt("levelTwo");

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player p = (Player) event.getDamager();
            if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(CriticalsRegister.CRITICALS.getKey()))){
                Player victim = (Player) event.getEntity();
                if(p.hasGravity()){
                    victim.damage(lvl2);
                }
            }else{

            }

        }
    }
}
