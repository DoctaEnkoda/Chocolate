package io.alerium.chocolate.velocity.commands;

import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandSource;
import io.alerium.chocolate.velocity.ChocolateVelocityPlugin;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServerIDCommand implements Command {
    
    private final ChocolateVelocityPlugin plugin;
    
    @Override
    public void execute(CommandSource source, String[] strings) {
        source.sendMessage(plugin.getConfig().getMessage("server_id", "proxy", plugin.getRedisManager().getProxyName()));
    }
    
}