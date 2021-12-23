package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.MinersLuckIIRegister;
import me.woodsmc.enchantments.enchants.MinersLuckRegister;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class MinersLuckIIListener implements Listener {


    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Player p = event.getPlayer();
        Block block = event.getBlock();
        World world = p.getWorld();
        Location bLocation = block.getLocation();
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        ItemStack iron = new ItemStack(Material.IRON_INGOT);
        if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(MinersLuckIIRegister.MINERSLUCK.getKey()))){
            if(block.getType() == Material.STONE){
                Random rand = new Random();
                int number= rand.nextInt(100) + 1;
                if(number >= 85){
                    world.dropItem(bLocation, iron);
                }
            }else if(block.getType() == Material.DEEPSLATE){
                Random rand = new Random();
                int number= rand.nextInt(100) + 1;
                if(number >= 88){
                    world.dropItem(bLocation, diamond);
                }
            }else{ }
        }else{

        }
    }
}
