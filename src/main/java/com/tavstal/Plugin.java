package com.tavstal;

import org.bukkit.plugin.java.JavaPlugin;
import com.tavstal.Helpers.*;

import xyz.xenondevs.particle.ParticleEffect;

import com.tavstal.Commands.*;
import org.bukkit.command.*;;

public class Plugin extends JavaPlugin
{

  public void onEnable()
  {
    this.getCommand("template").setExecutor(new CommandTemplate());
    this.getCommand("getitem").setExecutor(new CommandGetItem());
    LoggerHelper.LogInfo("The plugin has been successfully loaded.");
  }

  public void onDisable()
  {
    LoggerHelper.LogInfo("The plugin has been successfully unloaded.");
  }
}
