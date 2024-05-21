package org.antonio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBatalla {
    @Test
    public void testAtaqueLuffy() {
        Luffy luffy = new Luffy("Monkey D. Luffy", 100);
        Zoro zoro = new Zoro("Roronoa Zoro", 80);
        luffy.atacar(zoro);
        assertEquals(-20, zoro.getPoder());
    }

    @Test
    public void testAtaqueZoro() {
        Luffy luffy = new Luffy("Monkey D. Luffy", 100);
        Zoro zoro = new Zoro("Roronoa Zoro", 80);
        zoro.atacar(luffy);
        assertEquals(20, luffy.getPoder());
    }
}
