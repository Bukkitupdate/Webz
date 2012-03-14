 package Webz;
 
 import java.util.List;
 import org.bukkit.entity.Spider;
 import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
 import org.bukkit.inventory.ItemStack;
 
 public class WebzEntityListener implements Listener
 {
   public static Webz plugin;
 
   public WebzEntityListener(Webz instance)
   {
     plugin = instance;
   }
 
   public void onEntityDeath(EntityDeathEvent event) {
     if ((event.getEntity() instanceof Spider))
     {
       List drops = event.getDrops();
 
       for (int i = 0; i < drops.size(); i++) {
         ItemStack drop = (ItemStack)drops.get(i);
         if (drop.getTypeId() == 287)
           drop.setTypeId(30);
       }
     }
   }
 }