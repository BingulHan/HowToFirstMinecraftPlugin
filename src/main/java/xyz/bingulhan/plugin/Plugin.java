package xyz.bingulhan.plugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {


    //Eklenti sunucuda başlatılırken çalışacak kod bloğu
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"Eklenti Aktif edildi"); //Sunucu konsoluna mesaj göndermek için kullanabilirsiniz.

    }


    //Eklenti devre dışı bırakılırken çalıştırılacak kod bloğu
    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"Eklenti Deaktif edildi"); //Sunucu konsoluna mesaj göndermek için kullanabilirsiniz.



    }
}
