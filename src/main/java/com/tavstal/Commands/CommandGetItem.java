package com.tavstal.Commands;

import com.tavstal.Helpers.LoggerHelper;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.inventory.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class CommandGetItem implements CommandExecutor {
    
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        try
        {
            Player player = (Player)sender;
            if (player != null) {
                sender.sendMessage("Here you go, a nice diamond sword.");
                ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD, 1);
                player.getInventory().addItem(itemStack);
            }
            else
            {
                sender.sendMessage("Unfortunately you are not a player.");
            }
        }
        catch (Exception ex) {
            sender.sendMessage("Unknown error happened, sorry.");
            LoggerHelper.LogWarning(ex.toString());
        }
        
        return true;
    }
}
