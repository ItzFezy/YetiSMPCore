package modding.yetismpcore.commands;

import modding.yetismpcore.Main;
import org.bukkit.ChatColor;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class nick implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, @NotNull String[] args) {
    if (sender instanceof Player p) {
        if (args.length == 0 || args.length == 2) {
            p.sendMessage(ChatColor.RED+"This is not a appropriate amount of arguments.");
        }
        if (args.length == 1){
            String a = args[0];
                p.setCustomName(a);
                p.setDisplayName(a);
                p.setPlayerListName(a);

                p.sendMessage("You're name has been set to " + a + ".");
        }
    }
    if (sender instanceof ConsoleCommandSender){
        System.out.println("This is not a appropriate sender.");
    }
    if (sender instanceof CommandBlock){
        System.out.println("This is not a appropriate sender.");
    }




        return true;
    }
}
