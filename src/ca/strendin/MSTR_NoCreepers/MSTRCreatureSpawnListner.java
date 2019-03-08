package ca.strendin.MSTR_NoCreepers;

import org.bukkit.entity.CreatureType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MSTRCreatureSpawnListner implements Listener {
    public static MSTR_NoCreepers plugin;

    public MSTRCreatureSpawnListner(MSTR_NoCreepers thisplugin) {
        plugin = thisplugin;
    }
    
    @EventHandler        
    public void onCreatureSpawnEvent(CreatureSpawnEvent event) {
        if (event.getCreatureType() == CreatureType.CREEPER) {         
            event.setCancelled(true);
            event.getEntity().getWorld().spawnCreature(event.getEntity().getLocation(), CreatureType.ZOMBIE);            
        }
    }
}
