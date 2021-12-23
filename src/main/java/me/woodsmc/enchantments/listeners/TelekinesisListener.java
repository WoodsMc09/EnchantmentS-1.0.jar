package me.woodsmc.enchantments.listeners;


import me.woodsmc.enchantments.enchants.AutosmeltEnchantment;
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

public class TelekinesisListener implements Listener {

    @EventHandler
    public void onPlayerBreak(BlockBreakEvent event) {
        Player p = event.getPlayer();
        Block block = event.getBlock();
        if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(TelekinesisRegister.TELEKINESIS.getKey()))){
            if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(AutosmeltRegister.AUTOSMELT.getKey()))){

                if(block.getType() == Material.IRON_ORE){
                    return;
                }
                if(block.getType() == Material.GOLD_ORE){
                    return;
                }
                if(block.getType() == Material.DEEPSLATE_GOLD_ORE){
                    return;
                }
                if(block.getType() == Material.DEEPSLATE_IRON_ORE){
                    return;
                }
                event.setDropItems(false);
                if (p.getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
                    return;

                Collection<ItemStack> drops = block.getDrops(p.getInventory().getItemInMainHand());
                if (drops.isEmpty())
                    return;
                p.getInventory().addItem(drops.iterator().next());

                return;
            }else { }
        }else { }
        if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(TelekinesisRegister.TELEKINESIS.getKey()))) {
            event.setDropItems(false);
            if (p.getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
                return;

            Collection<ItemStack> drops = block.getDrops(p.getInventory().getItemInMainHand());
            if (drops.isEmpty())
                return;
            p.getInventory().addItem(drops.iterator().next());
        } else {

        }




            }
        }


