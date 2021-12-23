package me.woodsmc.enchantments.listeners;


import me.woodsmc.enchantments.enchants.AutosmeltRegister;
import me.woodsmc.enchantments.enchants.TelekinesisRegister;
import org.bukkit.GameMode;
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

import java.util.Collection;

public class AutosmeltListener implements Listener {


    @EventHandler
        public void onPlayerBreak(BlockBreakEvent event){
        Player p = event.getPlayer();
        Block block = event.getBlock();
        Location location = block.getLocation();
        World world = p.getWorld();
        ItemStack iron = new ItemStack(Material.IRON_INGOT);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT);
        if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(AutosmeltRegister.AUTOSMELT.getKey()))){
            if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(TelekinesisRegister.TELEKINESIS.getKey()))){
                event.setDropItems(false);
                if(p.getGameMode() == GameMode.CREATIVE)
                    return;
                if(p.getGameMode() == GameMode.SPECTATOR)
                    return;
                if(block.getType() == Material.IRON_ORE){
                    p.getInventory().addItem(iron);
                }else if(block.getType() == Material.GOLD_ORE){
                    p.getInventory().addItem(gold);
                }else if(block.getType() == Material.DEEPSLATE_GOLD_ORE){
                   p.getInventory().addItem(gold);
                }else if(block.getType() == Material.DEEPSLATE_IRON_ORE){
                    p.getInventory().addItem(iron);
                }
        }else if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(AutosmeltRegister.AUTOSMELT.getKey()))){
                event.setDropItems(false);
                if(p.getGameMode() == GameMode.CREATIVE)
                    return;
                if(p.getGameMode() == GameMode.SPECTATOR)
                    return;
                    if(block.getType() == Material.IRON_ORE){
                        world.dropItem(location, iron);
                    }else if(block.getType() == Material.GOLD_ORE){
                        world.dropItem(location, gold);
                    }else if(block.getType() == Material.DEEPSLATE_GOLD_ORE){
                        world.dropItem(location, gold);
                    }else if(block.getType() == Material.DEEPSLATE_IRON_ORE){
                        world.dropItem(location, iron);
                    }
            }
        }
    }
}
