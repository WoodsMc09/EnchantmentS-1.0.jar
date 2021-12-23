package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.HydrationRegister;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class HydrationListener implements Listener {


    @EventHandler
    public void onCLick(PlayerItemConsumeEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getHelmet() == null){ }else if(p.getInventory().getHelmet().getEnchantments().containsKey(Enchantment.getByKey(HydrationRegister.HYDRATION.getKey()))){
            ItemStack item = event.getItem();
            ItemStack bottle = new ItemStack(Material.POTION, 1);
            ItemMeta meta = bottle.getItemMeta();
            PotionMeta pmeta = (PotionMeta) meta;
            PotionData pdata = new PotionData(PotionType.WATER);
            pmeta.setBasePotionData(pdata);
            bottle.setItemMeta(pmeta);
           if(item.equals(bottle)){
               p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 140, 0, false, false, false));
               p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 140, 0, false, false, false));
           }else { }
        }else { }
    }

}
