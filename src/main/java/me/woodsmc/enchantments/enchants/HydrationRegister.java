package me.woodsmc.enchantments.enchants;

import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HydrationRegister {


    public static final Enchantment HYDRATION = new HydrationEnchantment("hydration", "Hydration", 1);

    public static void register() {
    boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(HYDRATION);

        if(!registered)
            registerEnchantment(HYDRATION);

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
