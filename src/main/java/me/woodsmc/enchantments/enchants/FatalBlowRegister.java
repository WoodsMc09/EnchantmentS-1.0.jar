package me.woodsmc.enchantments.enchants;

import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FatalBlowRegister {



    public static final Enchantment FATALBLOW = new FatalBlowEnchantment("fatalblow", "FatalBlow", 1);

    public static void register() {
    boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(FATALBLOW);

        if(!registered)
            registerEnchantment(FATALBLOW);

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
