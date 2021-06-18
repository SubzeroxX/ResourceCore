package club.reigniteh.listeners;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import club.reigniteh.listeners.join.JoinListener;
import club.reigniteh.listeners.status.ResourcePackStatus;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		ConsoleCommandSender console = getServer().getConsoleSender();
		saveDefaultConfig();
		console.sendMessage("[ResourceCore] Betöltés...");
		new JoinListener(this);
		console.sendMessage("[ResourceCore] JoinListener sikeresen betöltve!");
		new ResourcePackStatus(this);
		console.sendMessage("[ResourceCore] ResourcePackStatus sikeresen betöltve!");
		console.sendMessage("[ResourceCore] A plugin sikeresen betöltve!");

		}
	
	@Override
	public void onDisable() {
		
		ConsoleCommandSender console = getServer().getConsoleSender();
		console.sendMessage("[ResourceCore] A plugin leáll...");


}}
