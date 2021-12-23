package me.woodsmc.enchantments.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class enchantmentTabCompleter implements TabCompleter {

    List<String> arguments = new ArrayList<>();
    List<String> argumentss = new ArrayList<>();
    List<String> argumentsss = new ArrayList<>();

    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args){
        if(args.length == 1){
            arguments.add("list"); arguments.add("add"); arguments.add("reload"); arguments.add("curse"); arguments.add("assist"); arguments.add("autosmelt");
            arguments.add("criticals"); arguments.add("escape"); arguments.add("feathered"); arguments.add("lifesteal"); arguments.add("blazeslayer");
            arguments.add("regenslash"); arguments.add("revive"); arguments.add("saturated"); arguments.add("snipe"); arguments.add("stealth"); arguments.add("telekinesis");
            arguments.add("uppercut"); arguments.add("venomous"); arguments.add("voidless"); arguments.add("withered"); arguments.add("rushing"); arguments.add("getbook");
            arguments.add("leap"); arguments.add("molten"); arguments.add("fatalblow"); arguments.add("healthboost"); arguments.add("bossslayer"); arguments.add("hydration");
            arguments.add("dolphin"); arguments.add("momentum"); arguments.add("shop"); arguments.add("electrictip"); arguments.add("lavawalk"); arguments.add("minersgrace");
            arguments.add("minersluck"); arguments.add("experienced"); arguments.add("crop"); arguments.add("fanged"); arguments.add("float");

        }else if(args.length == 2){
            if(args[0].equalsIgnoreCase("curse")) {
                argumentss.add("movement"); argumentss.add("sight");
                return argumentss;
            }else { argumentss.remove("movement"); argumentss.remove("sight"); }
            if(args[0].equalsIgnoreCase("getbook")){
                argumentsss.add("assist"); argumentsss.add("autosmelt"); argumentsss.add("criticals"); argumentsss.add("escape"); argumentsss.add("feathered"); argumentsss.add("lifesteal");
                argumentsss.add("blazeslayer"); argumentsss.add("regenslash"); argumentsss.add("revive"); argumentsss.add("saturated"); argumentsss.add("saturated"); argumentsss.add("snipe");
                argumentsss.add("stealth"); argumentsss.add("telekinesis"); argumentsss.add("uppercut"); argumentsss.add("venomous"); argumentsss.add("voidless"); argumentsss.add("withered");
                argumentsss.add("withered"); argumentsss.add("rushing"); argumentsss.add("fatalblow"); argumentsss.add("movement"); argumentsss.add("sight"); argumentsss.add("healthboost");
                argumentsss.add("hydration"); argumentsss.add("dolphin"); argumentsss.add("momentum"); argumentsss.add("lavawalk"); argumentsss.add("electrictip"); argumentsss.add("minersgrace");
                argumentsss.add("minersluck"); argumentsss.add("experienced"); argumentsss.add("crop"); argumentsss.add("fanged"); argumentsss.add("float");
                return argumentsss;
            }else { argumentsss.remove("assist"); argumentsss.remove("autosmelt"); argumentsss.remove("criticals"); argumentsss.remove("escape"); argumentsss.remove("feathered");
                argumentsss.remove("lifesteal"); argumentsss.remove("blazeslayer"); argumentsss.remove("regenslash"); argumentsss.remove("revive");
                argumentsss.remove("saturated"); argumentsss.remove("saturated"); argumentsss.remove("snipe"); argumentsss.remove("stealth"); argumentsss.remove("telekinesis");
                argumentsss.remove("uppercut"); argumentsss.remove("venomous"); argumentsss.remove("voidless"); argumentsss.remove("withered"); argumentsss.remove("withered");
                argumentsss.remove("rushing"); argumentsss.remove("fatalblow"); argumentsss.remove("movement"); argumentsss.remove("sight"); } argumentsss.remove("healthboost");
                argumentsss.remove("hydration"); argumentsss.remove("dolphin"); argumentsss.remove("momentum");
                argumentsss.remove("lavawalk"); argumentsss.remove("electrictip"); argumentsss.remove("minersgrace"); argumentsss.remove("minersluck");
                argumentsss.remove("experienced"); argumentsss.remove("crop"); argumentsss.remove("fanged"); argumentsss.remove("float");
        }else { }

        List<String> result = new ArrayList<String>();
        if(args.length == 1){
            for(String a : arguments){
                if(a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);
            }
            return result;
        }
        if(args.length == 2){
            for(String a : argumentss){
                if(a.toLowerCase().startsWith(args[1].toLowerCase()))
                    result.add(a);
            }
            return result;
        }
        if(args.length == 2){
            for(String a : argumentsss){
                if(a.toLowerCase().startsWith(args[1].toLowerCase()))
                    result.add(a);
            }
            return result;
        }

        return null;
    }
}
