package Webz;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

 public class Webz extends JavaPlugin
 {
   private final WebzEntityListener entityListener = new WebzEntityListener(this);

   public void onDisable()
   {
     System.out.println("Webz is no longer active :(");
   }

   public void onEnable()
   {
     PluginManager pm = getServer().getPluginManager();
     pm.registerEvents(this.entityListener, this);

     PluginDescriptionFile pdfFile = getDescription();
     System.out.println(pdfFile.getName() + " version " + pdfFile.getVersion() + " is now enabled!");
   }

   public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
   {
     String commandName = command.getName().toLowerCase();
     if ((sender instanceof Player)) {
       Player player = (Player)sender;
       if ((commandName.equals("cookie")) &&
         (args.length == 0)) {
         player.getInventory().addItem(new ItemStack[] { new ItemStack(Material.COOKIE, 1) });
       }

     }

     return true;
   }
 }