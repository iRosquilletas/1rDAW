package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

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

    @Test(expected =  HeroeNoEncontradoException.class)
    public void TestEliminarHeroe() throws HeroeNoEncontradoException{
        gh.eliminarHeroe("Iron Man");
    
        gh.buscarHeroe("Iron Man");
    }

    @Test
    public void TestAgregarVariosHeroes() throws HeroeNoEncontradoException{

        Heroe eros = new Heroe("Eros", "guapo", "un crack", "un crack");
        Heroe Antonio = new Heroe("Antonio Calabuig", "Sabe cosas", "Sabe muchas cosas", "Sabe demasiadas cosas");

        gh.agregarHeroe(eros);
        gh.agregarHeroe(Antonio);

        assertEquals(eros, gh.buscarHeroe("Eros"));
        assertEquals(Antonio, gh.buscarHeroe("Antonio Calabuig"));

        assertNotEquals(Antonio,gh.buscarHeroe("Eros"));
        assertNotEquals(eros, gh.buscarHeroe("Antonio Calabuig"));

    }

    @Test
    public void TestbuscarHeroePorSuperpoder(){

        assertEquals(ironman, gh.buscarHeroePorSuperpoder("Traje de alta tecnología"));
        assertEquals(capitanAmerica, gh.buscarHeroePorSuperpoder("Superfuerza, agilidad, resistencia"));
        assertEquals(null, gh.buscarHeroePorSuperpoder("juan"));
        
        assertNotEquals(spiderman, gh.buscarHeroePorSuperpoder("Traje de alta tecnología"));
        assertNotEquals(null, gh.buscarHeroePorSuperpoder("Sentido arácnido, trepador"));
    }
    @Test
    public void testListarHeroes(){

        String listaHeroes = "Iron Man, Spider-Man, Capitán América";
        String listaHeroesNE = "Spider-Man, Capitán América";

        assertEquals(listaHeroes, gh.listarHeroes());
        assertNotEquals(listaHeroesNE, gh.listarHeroes());
        assertTrue(listaHeroes.length() == gh.listarHeroes().length());
        assertTrue(listaHeroesNE.length() < gh.listarHeroes().length());
    }

    @Test
    public void testactualizarHeroe() throws HeroeNoEncontradoException{
        GestorHeroes gh = new GestorHeroes();
        Heroe NuevoHeroe = new Heroe("Nuevo Heroe", "SuperpoderSinActualizar", "BiografiaSinActualizar", "DescripcionSinActualizar");
        Heroe NuevoHeroeActualizado = new Heroe("Nuevo Heroe", "SuperpoderActualizado", "BiografiaActualizada", "DescripcionActualizada");
        gh.agregarHeroe(NuevoHeroe);


        assertEquals(NuevoHeroe, gh.buscarHeroe("Nuevo Heroe"));
        gh.actualizarHeroe(NuevoHeroeActualizado);
        assertEquals("SuperpoderActualizado", gh.buscarHeroe("Nuevo Heroe").getSuperpoderes());
        assertEquals("DescripcionActualizada", gh.buscarHeroe("Nuevo Heroe").getDescripcion());
        assertNotEquals("SuperpoderSinActualizar", gh.buscarHeroe("Nuevo Heroe").getSuperpoderes());
        assertNotEquals("BiografiaSinActualizar", gh.buscarHeroe("Nuevo Heroe").getBiografia());


    }

    @Test
   
    public void TestlistaHeroesPorSuperpoder() {
        Heroe uwu = new Heroe("uwu", "negeo", "no", "no");
        Heroe blackPanther = new Heroe("black Panther", "trepa y araña", "e un makina", "paco");
        GestorHeroes gh2 = new GestorHeroes();
        gh2.agregarHeroe(uwu);
        gh2.agregarHeroe(blackPanther);
    
        List<Heroe> heroesEsperados = new ArrayList<>();
        heroesEsperados.add(blackPanther);
    
        assertEquals(heroesEsperados, gh2.listaHeroesPorSuperpoder("trepa y araña"));
    }

    
}


