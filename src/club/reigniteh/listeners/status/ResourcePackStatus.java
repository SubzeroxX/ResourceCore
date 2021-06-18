package club.reigniteh.listeners.status;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

import club.reigniteh.listeners.Main;
import club.reigniteh.listeners.utils.Utils;

public class ResourcePackStatus implements Listener {

	private Main plugin;
	
	public ResourcePackStatus(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
    public void resource(PlayerResourcePackStatusEvent event){
        if(event.getStatus() == PlayerResourcePackStatusEvent.Status.DECLINED){
            Player p = event.getPlayer();
            if(plugin.getConfig().getBoolean("kick_if_declined") == true) {
            p.kickPlayer(Utils.chat(plugin.getConfig().getString("kick_msg")));
            }
        }
    }
	
}
