package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;

public class TestHeroes {

    Heroe ironman = null;
    Heroe spiderman = null;
    Heroe capitanAmerica = null;

    GestorHeroes gh = new GestorHeroes();

    @Before
    public void setUp() {

        ironman = new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo",
                "es un superheroe de metal");
        spiderman = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria",
                "es un superheroe que tiene teladearaña");
        capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia",
                "Soldado de la Segunda Guerra Mundial", "Es un Heroe que desataca por su escudo");

        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);

    }

    @Test
    public void testGettersHeroes() {

        assertEquals("Iron Man", ironman.getNombre());
        assertNotEquals("Iron Ma", ironman.getNombre());
    }

}
