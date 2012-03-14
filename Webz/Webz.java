/*    */ package Webz;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
/*    */ import org.bukkit.event.Event.Type;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.plugin.PluginDescriptionFile;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class Webz extends JavaPlugin
/*    */ {
/* 18 */   private final WebzEntityListener entityListener = new WebzEntityListener(this);
/*    */
/*    */   public void onDisable()
/*    */   {
/* 22 */     System.out.println("Webz is no longer active :(");
/*    */   }
/*    */ 
/*    */   public void onEnable()
/*    */   {
/* 27 */     PluginManager pm = getServer().getPluginManager();
/* 28 */     pm.registerEvent(Event.Type.ENTITY_DEATH, this.entityListener, Event.Priority.Normal, this);
/*    */ 
/* 30 */     PluginDescriptionFile pdfFile = getDescription();
/* 31 */     System.out.println(pdfFile.getName() + " version " + pdfFile.getVersion() + " is now enabled!");
/*    */   }
/*    */ 
/*    */   public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
/*    */   {
/* 49 */     String[] split = args;
/* 50 */     String commandName = command.getName().toLowerCase();
/* 51 */     if ((sender instanceof Player)) {
/* 52 */       Player player = (Player)sender;
/* 53 */       if ((commandName.equals("cookie")) && 
/* 54 */         (split.length == 0)) {
/* 55 */         player.getInventory().addItem(new ItemStack[] { new ItemStack(Material.COOKIE, 1) });
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 63 */     return true;
/*    */   }
/*    */ }

/* Location:           /Users/Will/Downloads/Webz.jar
 * Qualified Name:     Webz.Webz
 * JD-Core Version:    0.6.0
 */