package com.tavstal.Commands;

import org.bukkit.command.*;
import org.bukkit.command.CommandExecutor;

public class CommandTemplate implements CommandExecutor {
    
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        sender.sendMessage("Hey! I have noticed you have just called me, I'm still under construction. Sorry.");
        return true;
    }
}
