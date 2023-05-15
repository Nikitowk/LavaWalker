package kiernan.lavawalker.Events;

import kiernan.lavawalker.LavaWalker;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Events implements Listener {
    LavaWalker plugin;

    public Events(LavaWalker plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void onStep(PlayerMoveEvent event){
        Player player = event.getPlayer();
        Block block = player.getWorld().getBlockAt(player.getLocation().add(0,-1,0));
        if(block.getType() == Material.LAVA){
            block.setType(Material.COBBLESTONE);
        }
    }
}
