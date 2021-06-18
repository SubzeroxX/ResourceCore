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
		console.sendMessage("[ResourceCore] Bet�lt�s...");
		new JoinListener(this);
		console.sendMessage("[ResourceCore] JoinListener sikeresen bet�ltve!");
		new ResourcePackStatus(this);
		console.sendMessage("[ResourceCore] ResourcePackStatus sikeresen bet�ltve!");
		console.sendMessage("[ResourceCore] A plugin sikeresen bet�ltve!");

		}
	
	@Override
	public void onDisable() {
		
		ConsoleCommandSender console = getServer().getConsoleSender();
		console.sendMessage("[ResourceCore] A plugin le�ll...");


}}
