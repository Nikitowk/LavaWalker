package kiernan.lavawalker;

import kiernan.lavawalker.Events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class LavaWalker extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(this), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Plugin Enabled.]");
    }



    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Plugin Disabled.]");
    }
}
