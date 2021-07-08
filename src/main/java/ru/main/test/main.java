package ru.main.test;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import ru.main.test.Events.Eventsher;
import ru.main.test.cmd.CMDS;

public final class main extends JavaPlugin {
    private static JavaPlugin plugin;

    public main() {
        plugin = this;
    }

    public static Plugin getInstance() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin.getLogger().info("hipe");//
        String str = "Hipe";//Выражение через символы
        plugin.getCommand("newpaper").setExecutor(new CMDS());//регестрация команды и её создание
        plugin.getServer().getPluginManager().registerEvents(new Eventsher(),this);


    }

    @Override
    public void onDisable() {
        plugin.getLogger().warning("plugin off");
    }

    public static void setPlugin(JavaPlugin plugin) {
        plugin.saveConfig();
    }
}