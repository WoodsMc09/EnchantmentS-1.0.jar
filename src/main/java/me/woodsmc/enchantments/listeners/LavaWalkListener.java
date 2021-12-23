package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.EnchantmentS;
import me.woodsmc.enchantments.enchants.LavaWalkRegister;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class LavaWalkListener implements Listener {

    private Plugin plugin = EnchantmentS.getPlugin(EnchantmentS.class);

    @EventHandler
    public void onWalk(PlayerMoveEvent event){
        Player p = event.getPlayer();
        if(p.getInventory().getBoots() == null){ }else if(p.getInventory().getBoots().getEnchantments().containsKey(Enchantment.getByKey(LavaWalkRegister.LAVAWALK.getKey()))) {
            Location bloc = p.getLocation().add(0, -1, 0);
            if (p.getLocation().add(0, -1, 0).getBlock().getType() == Material.LAVA) {
                Block block = bloc.getBlock();
                ItemStack boots = p.getInventory().getBoots();
                block.setType(Material.BLACKSTONE);
                Bukkit.getScheduler().runTaskLater(plugin, () -> {
                    block.setType(Material.LAVA);
                }, 60);
            } else {
            }
        }else {

        }
    }
}
