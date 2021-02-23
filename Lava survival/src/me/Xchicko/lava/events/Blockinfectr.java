package me.Xchicko.lava.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Blockinfectr implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public static void BlockInfect(PlayerInteractEvent e) {
		Player player = (Player)e.getPlayer();
		ItemStack blockchanger = new ItemStack(Material.DIAMOND_AXE);
		if (player.getItemInHand().equals(blockchanger)) {
			if(!(e.getMaterial().isAir())) {
				e.getClickedBlock().setType(Material.GOLD_BLOCK);
			}
			
		}
		
	}
	

}
