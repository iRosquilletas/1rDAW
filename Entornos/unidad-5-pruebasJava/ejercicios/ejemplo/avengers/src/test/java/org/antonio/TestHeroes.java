package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;

public class TestHeroes {

    Heroe ironman = null;
    Heroe spiderman= null;
    Heroe capitanAmerica= null;

    GestorHeroes gh = new GestorHeroes();
    @Before
    public void setUp(){

        ironman= new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo", "es un superheroe de metal");
        spiderman=  new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria", "es un superheroe que tiene teladearaña");
        capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial", "Es un Heroe que desataca por su escudo");
        
        gh.agregarHeroe(ironman);
        gh.agregarHeroe(spiderman);
        gh.agregarHeroe(capitanAmerica);
    
    }

    @Test
    public void testGettersHeroe(){

        assertEquals("Iron Man", ironman.getNombre());
        assertEquals("Traje de alta tecnología", ironman.getSuperpoderes());
        assertEquals("Millonario y filántropo", ironman.getBiografia());

        assertNotEquals("Ant Man", spiderman.getNombre());
        assertNotEquals("Superfuerza, agilidad", capitanAmerica.getSuperpoderes());
        assertNotEquals("Soldado de la Segunda Guerra Mundial", ironman.getBiografia());
    }

    @Test
    public void testSettersHeroe() {

        Heroe catwoman = new Heroe(null, null, null, null);

        catwoman.setNombre("Catwoman");
        catwoman.setSuperpoderes("uwu");
        catwoman.setBiografia("uwu");

        assertEquals("Catwoman", catwoman.getNombre() );
        assertEquals("uwu", catwoman.getSuperpoderes());
        assertEquals("uwu", catwoman.getBiografia());
    }

 

    @Test
    public void testBuscarHeroe() throws HeroeNoEncontradoException{ 

        assertEquals(ironman, gh.buscarHeroe("Iron Man"));
        assertEquals(capitanAmerica, gh.buscarHeroe("Capitán América"));
        assertNotEquals(spiderman, gh.buscarHeroe("Iron Man"));

        // en este no he usado el buscarHeroe porque si pongo uno que no está salta la excepción 
        assertNotEquals(spiderman, "Paco");


    }

    @Test(expected = HeroeNoEncontradoException.class)
    public void testExceptionBuscarHeroe() throws HeroeNoEncontradoException{
        
        gh.buscarHeroe("Juan");

    }

    @Test
    public void TestactualizaDescripcion(){

        Heroe actualizacionCapiatnAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial", "Hola Hola");
        
        assertEquals(actualizacionCapiatnAmerica.getDescripcion(), gh.actualizaDescripcion(actualizacionCapiatnAmerica));
        assertNotEquals("", gh.actualizaDescripcion(actualizacionCapiatnAmerica));
        assertNotEquals(actualizacionCapiatnAmerica.getNombre(), gh.actualizaDescripcion(actualizacionCapiatnAmerica));
    
    }

    
}


