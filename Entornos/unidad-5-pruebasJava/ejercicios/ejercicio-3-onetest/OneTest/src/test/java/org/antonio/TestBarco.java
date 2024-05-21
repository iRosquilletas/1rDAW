package org.antonio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBarco {
    @Test
    public void testAgregarTripulante() {
        Barco barco = new Barco("Thousand Sunny", 5);
        assertTrue(barco.agregarTripulante());
        assertEquals(6, barco.getCapacidad());
    }

    @Test
    public void testAgregarTripulanteMaximo() {
        Barco barco = new Barco("Going Merry", 10);
        assertFalse(barco.agregarTripulante());
        assertEquals(10, barco.getCapacidad());
    }
}
