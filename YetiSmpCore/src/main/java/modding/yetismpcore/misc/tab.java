package modding.yetismpcore.misc;

import modding.yetismpcore.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.File;
import java.net.http.WebSocket;

public class tab implements Listener {
    private Main plugin;

    public tab(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        FileConfiguration config = plugin.getConfig();
        String footer = config.getString("Footer");
        String header = config.getString("Header");
        footer=footer.replace("{player}", event.getPlayer().getDisplayName());
        header=header.replace("{player}", event.getPlayer().getDisplayName());
        footer=footer.replace("{version}", plugin.getServer().getMinecraftVersion());
        footer = footer.replace("&", "§");
        header = header.replace("&", "§");
        event.getPlayer().setPlayerListFooter(footer);
        event.getPlayer().setPlayerListHeader(header);
    }
}
