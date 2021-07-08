package ru.main.test.Events;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.block.data.type.Bed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import javax.swing.text.html.parser.Entity;

public class Eventsher implements Listener {
    @EventHandler
    public boolean DeathParticle(EntityDeathEvent deth){
        Location lock = deth.getEntity().getEyeLocation();
        World mir = deth.getEntity().getWorld();
        mir.spawnParticle(Particle.ENCHANTMENT_TABLE,lock,  75);
        return true;
    }

}
