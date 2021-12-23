package me.woodsmc.enchantments.listeners;

import me.woodsmc.enchantments.enchants.ExperiencedRegister;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class ExperiencedListener implements Listener {

    @EventHandler
    public void onMine(BlockBreakEvent event){
        Player p = event.getPlayer();
        Block block = event.getBlock();
        World world = p.getWorld();
        if(p.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(ExperiencedRegister.EXPERIENCED.getKey()))){
            if(block.getType() == Material.IRON_ORE || block.getType() == Material.DEEPSLATE_IRON_ORE || block.getType() ==
                    Material.GOLD_ORE || block.getType() == Material.DEEPSLATE_GOLD_ORE){

                ExperienceOrb expOrb = (ExperienceOrb) world.spawnEntity(block.getLocation(), EntityType.EXPERIENCE_ORB);
                expOrb.setExperience(8);

            }else{

            }


        }else{

        }

    }
}
