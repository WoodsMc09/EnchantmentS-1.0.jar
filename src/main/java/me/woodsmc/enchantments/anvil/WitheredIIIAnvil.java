package me.woodsmc.enchantments.anvil;

import me.woodsmc.enchantments.enchants.WitheredIIIRegister;
import me.woodsmc.enchantments.enchants.WitheredRegister;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WitheredIIIAnvil implements Listener {



    @EventHandler
    public void onAnvil(PrepareAnvilEvent event){
        AnvilInventory anvilInventory = event.getInventory();
        ItemStack[] itemsInAnvil = anvilInventory.getContents();
        ItemStack slot1 = itemsInAnvil[0];
        ItemStack slot2 = itemsInAnvil[1];
        if(slot2 == null) { }else if(slot1 == null) {} else {
            Map slot1Enchantments = slot1.getEnchantments();
            Map slot2Enchantments = slot2.getEnchantments();
            if (slot1 == null) {
            } else {
                ItemStack result = new ItemStack(slot1.getType());
                if (slot2 == null) {
                } else if (slot2.getEnchantments().containsKey(Enchantment.getByKey(WitheredIIIRegister.WITHEREDIII.getKey()))) {
                    ItemMeta resultMeta = result.getItemMeta();
                    ItemMeta slot1Meta = slot1.getItemMeta();
                    ItemMeta slot2Meta = slot2.getItemMeta();
                    List<String> lore = slot1Meta.hasLore() ? slot1Meta.getLore() : new ArrayList<>();
                    List<String> lore1 = slot2Meta.hasLore() ? slot2Meta.getLore() : new ArrayList<>();
                    lore.addAll(lore1);
                    resultMeta.setLore(lore);
                    result.setItemMeta(resultMeta);
                    result.addUnsafeEnchantment(WitheredIIIRegister.WITHEREDIII, 1);
                    result.addUnsafeEnchantments(slot1Enchantments);
                    result.addUnsafeEnchantments(slot2Enchantments);
                    event.setResult(result);
                } else {
                }
            }
        }
    }
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) {
        } else {
            if (event.getClickedInventory().getType() == InventoryType.ANVIL) {
                if (event.getClickedInventory() == null) return;
                AnvilInventory anvilInventory = (AnvilInventory) event.getInventory();
                ItemStack[] itemsInAnvil = anvilInventory.getContents();
                ItemStack slot1 = itemsInAnvil[0];
                ItemStack slot2 = itemsInAnvil[1];
                Player p = (Player) event.getWhoClicked();
                Location location = p.getLocation();
                if(slot2 == null) { }else if(slot1 == null) {} else {
                    Map slot1Enchantments = slot1.getEnchantments();
                    Map slot2Enchantments = slot2.getEnchantments();
                    if (slot1 == null) {
                    } else {
                        ItemStack result = new ItemStack(slot1.getType());
                        if (event.getSlotType() == InventoryType.SlotType.RESULT) {
                            if (slot2 == null) {
                            } else if (slot2.getEnchantments().containsKey(Enchantment.getByKey(WitheredIIIRegister.WITHEREDIII.getKey()))) {
                                ItemMeta resultMeta = result.getItemMeta();
                                ItemMeta slot1Meta = slot1.getItemMeta();
                                ItemMeta slot2Meta = slot2.getItemMeta();
                                List<String> lore = slot1Meta.hasLore() ? slot1Meta.getLore() : new ArrayList<>();
                                List<String> lore1 = slot2Meta.hasLore() ? slot2Meta.getLore() : new ArrayList<>();
                                if (lore1 == null) return;
                                lore.addAll(lore1);
                                resultMeta.setLore(lore);
                                result.setItemMeta(resultMeta);
                                result.addUnsafeEnchantment(WitheredIIIRegister.WITHEREDIII, 1);
                                result.addUnsafeEnchantments(slot1Enchantments);
                                result.addUnsafeEnchantments(slot2Enchantments);
                                anvilInventory.remove(slot1);
                                anvilInventory.remove(slot2);
                                p.playSound(location, Sound.BLOCK_ANVIL_USE, 0.3F, 1);
                                event.setCursor(result);
                            } else {
                            }
                        }
                    }
                }
            } else {
            }
        }
    }
}
