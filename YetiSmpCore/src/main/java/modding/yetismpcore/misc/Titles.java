package modding.yetismpcore.misc;

import modding.yetismpcore.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Titles implements Listener {
    private final Main plugin;

    public Titles(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        FileConfiguration config=plugin.getConfig();
        String SubTitle=config.getString("Join-Sub-Title-Message");
        SubTitle=SubTitle.replace("&","§");
        SubTitle=SubTitle.replace("{player}", event.getPlayer().getDisplayName());
        String Title=config.getString("Join-Title-Message");
        Title=Title.replace("&","§");
        Title=Title.replace("{player}", event.getPlayer().getDisplayName());
        event.getPlayer().sendTitle(Title, SubTitle);
    }
}
