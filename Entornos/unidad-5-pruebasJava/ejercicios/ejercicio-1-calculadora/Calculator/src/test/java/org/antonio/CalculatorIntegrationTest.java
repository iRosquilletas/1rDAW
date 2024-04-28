package org.antonio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorIntegrationTest {

    @Test
    public void testAddAndSubstract() {
        Calculator ej = new Calculator();
        assertEquals(2, ej.add(2, 4), ej.subtract(6, 2));
        assertTrue(ej.add(2, 3) - ej.subtract(3, 2) == 4);
        assertFalse(ej.add(2, 3) == ej.subtract(3, 2));
    }

    @Test
    public void testAddWithZero() {
        Calculator ej = new Calculator();
        assertEquals(5, ej.add(5, 0));
        assertTrue(ej.subtract(-3, 0) == -3);
        assertFalse(ej.subtract(10, 0) == 0);
    }

    @Test
    public void testSubstractWithZero() {
        Calculator ej = new Calculator();
        assertEquals(10, ej.subtract(10, 0));
        assertTrue(ej.multiply(2, 3) / ej.divide(6, 3) == 3);
        assertFalse(ej.multiply(2, 3) == ej.divide(6, 3));
    }

    @Test
    public void testMultiplyAndDivide() {
        Calculator ej = new Calculator();

        assertEquals(25, ej.multiply(5, ej.divide(10, 2)), 0.0);
        assertTrue(ej.multiply(2, 3) / ej.divide(6, 3) == 3);
        assertFalse(ej.multiply(2, 3) == ej.divide(6, 3));
    }

    @Test
    public void testMultiplyWithZero() {

        Calculator ej = new Calculator();
        assertEquals(0, ej.multiply(5, 0), 0.0);
        assertTrue(ej.multiply(5, 0) == 0);
        assertFalse(ej.multiply(0, 0) == 1);

    }

    @Test
    public void testDivideWithZero() {
        Calculator ej = new Calculator();

        assertEquals(0, ej.divide(0, 5), 0.0);
        // assertTrue da error porque dice que no puede ser infinito.

    }
}
