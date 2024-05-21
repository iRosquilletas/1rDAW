package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestFruta {
    @Test
    public void testPuedoComerFrutaDeliciosa() {
        Fruta manzana = new Fruta("Manzana", true);
        assertTrue(manzana.puedoComer());
    }

    @Test
    public void testPuedoComerFrutaDelDiablo() {
        Fruta frutaDelDiablo = new Fruta("Fruta del Diablo", true);
        assertFalse(frutaDelDiablo.puedoComer());
    }

    @Test
    public void testPuedoComerFrutaNoDeliciosa() {
        Fruta durian = new Fruta("Durian", false);
        assertFalse(durian.puedoComer());
    }
}
