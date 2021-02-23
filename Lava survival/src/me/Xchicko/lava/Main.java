package me.Xchicko.lava;

import org.bukkit.plugin.java.JavaPlugin;

import me.Xchicko.lava.events.Blockinfectr;



public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Blockinfectr(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
	
