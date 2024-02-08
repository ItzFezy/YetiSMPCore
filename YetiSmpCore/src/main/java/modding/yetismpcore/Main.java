package modding.yetismpcore;

import modding.yetismpcore.commands.nick;
import modding.yetismpcore.commands.nickreset;
import modding.yetismpcore.misc.Titles;
import modding.yetismpcore.misc.tab;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        PluginManager p = getServer().getPluginManager();
        getCommand("nick").setExecutor(new nick());
        getCommand("nickreset").setExecutor(new nickreset());
        p.registerEvents(new Titles(this), this);
        p.registerEvents(new tab(this), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
