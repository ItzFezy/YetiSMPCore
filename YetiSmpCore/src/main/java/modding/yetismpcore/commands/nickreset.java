package modding.yetismpcore.commands;

import modding.yetismpcore.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class nickreset implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, @NotNull String[] args) {
        if (sender instanceof Player p) {
            String name = p.getName();
            p.setPlayerListName(name);
            p.setCustomName(name);
            p.setDisplayName(name);
        }
        return true;
    }
}
