/*    */ package Webz;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.bukkit.entity.Spider;
/*    */ import org.bukkit.event.entity.EntityDeathEvent;
/*    */ import org.bukkit.event.entity.EntityListener;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class WebzEntityListener extends EntityListener
/*    */ {
/*    */   public static Webz plugin;
/*    */ 
/*    */   public WebzEntityListener(Webz instance)
/*    */   {
/* 21 */     plugin = instance;
/*    */   }
/*    */ 
/*    */   public void onEntityDeath(EntityDeathEvent event) {
/* 25 */     if ((event.getEntity() instanceof Spider))
/*    */     {
/* 27 */       List drops = event.getDrops();
/*    */ 
/* 29 */       for (int i = 0; i < drops.size(); i++) {
/* 30 */         ItemStack drop = (ItemStack)drops.get(i);
/* 31 */         if (drop.getTypeId() == 287)
/* 32 */           drop.setTypeId(30);
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           /Users/Will/Downloads/Webz.jar
 * Qualified Name:     Webz.WebzEntityListener
 * JD-Core Version:    0.6.0
 */