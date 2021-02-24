package me.Xchicko.lava.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.WorldEvent;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("unused")
public class Blockinfectr implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public static void BlockInfect(PlayerInteractEvent e) {
		Player player = (Player)e.getPlayer();
		Block block = (Block) e.getClickedBlock();
		Location loc = block.getLocation();
		Double loc1 = loc.getX();
		Double loc2 = loc.getZ();
		String loc3 = String.valueOf(loc1 + " " + loc2);
		Bukkit.broadcastMessage(loc3);		
		ItemStack blockchanger = new ItemStack(Material.DIAMOND_AXE);
		if (player.getItemInHand().equals(blockchanger)) {
			if(!(e.getMaterial().isAir())) {
				e.getClickedBlock().setType(Material.LAVA);
			
			}
			
			
		}
		
	}

		
	

}
