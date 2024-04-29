package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator ej = new Calculator();

        assertEquals(5, ej.add(2, 3));
        assertTrue(ej.add(-1, 1) == 0);
        assertFalse(ej.add(2, 3) == 6);

    }

    @Test
    public void testSubstract() {
        Calculator ej = new Calculator();

        assertEquals(1, ej.subtract(3, 2));
        assertTrue(ej.subtract(5, 5) == 0);
        assertFalse(ej.subtract(10, 3) == 9);
    }

    @Test
    public void testMultiply() {
        Calculator ej = new Calculator();

        assertEquals(6, ej.multiply(2, 3), 0.0);
        assertTrue(ej.multiply(5, 0) == 0);
        assertFalse(ej.multiply(2, 3) == 10);

    }

    @Test
    public void testDivide() {
        Calculator ej = new Calculator();

        assertEquals(2.5f, ej.divide(5, 2), 0.001);
        assertTrue(ej.divide(10, 5) == 2);
        assertFalse(ej.divide(8, 2) == 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator ej = new Calculator();
        assertEquals(0, ej.divide(2, 0), 0.0);
    }

}
