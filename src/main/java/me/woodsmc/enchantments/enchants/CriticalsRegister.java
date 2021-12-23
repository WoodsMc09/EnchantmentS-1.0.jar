package me.woodsmc.enchantments.enchants;

import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CriticalsRegister {

        public static final Enchantment CRITICALS = new CriticalsEnchantment("criticals", "Criticals", 1);

        public static void register() {
            boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CRITICALS);

            if(!registered)
                registerEnchantment(CRITICALS);

        }
        public static void registerEnchantment(Enchantment enchantment){
            boolean registered = true;
            try {
                Field f = Enchantment.class.getDeclaredField("acceptingNew");
                f.setAccessible(true);
                f.set(null, true);
                Enchantment.registerEnchantment(enchantment);
            }catch (Exception e) {
                registered = false;
                e.printStackTrace();
            }
            if (registered) {

            }
        }
}
