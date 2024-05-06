package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestHeroes {


    Heroe ironman = null



    @Test
    public void testSettersHeroe(){
        Heroe catWoman = null;
        catWoman.setNombre("Cat Woman");
        catWoman.setSuperpoderes("Trepar y arañar");
        catWoman.setBiografia("Es la amiga de batman");

        assertEquals("Cat Woman", catWoman.getNombre());
        assertEquals("Trepar y arañar", catWoman.getSuperpoderes());
        assertEquals("Es la amiga de Batman", catWoman.getBiografia());

        assertNotEquals("Capitan América", catWoman.getNombre());
    }
}

