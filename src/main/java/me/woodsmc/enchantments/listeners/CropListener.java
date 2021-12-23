package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.CropRegister;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class CropListener implements Listener {

        private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);

        int boneMealCount = plugin.getConfig().getInt("boneMealCount");

    @EventHandler
    public void onClick(BlockBreakEvent event){
        Player p = event.getPlayer();
        Block block = event.getBlock();
        ItemStack boneMeal = new ItemStack(Material.BONE_MEAL, boneMealCount);
        if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(CropRegister.CROP.getKey()))) {
            Location location = block.getLocation();
            if (block.getBlockData() instanceof Ageable) {
                Ageable age = (Ageable) block.getBlockData();
                if(age.getAge() == age.getMaximumAge()) {
                    p.getWorld().dropItem(location, boneMeal);
                }else{

                }
            }
        }else {

        }
    }
}
