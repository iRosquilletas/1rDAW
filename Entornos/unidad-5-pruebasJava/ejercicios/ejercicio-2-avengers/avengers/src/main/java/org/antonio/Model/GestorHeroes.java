package org.antonio.Model;

import org.antonio.Exception.HeroeNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class GestorHeroes {
    private List<Heroe> heroes;

    public GestorHeroes() {
        this.heroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe) {
        this.heroes.add(heroe);
    }

    public Heroe buscarHeroe(String nombre) throws HeroeNoEncontradoException {
        for (Heroe heroe : this.heroes) {
            if (heroe.getNombre().equals(nombre)) {
                return heroe;
            }
        }
        throw new HeroeNoEncontradoException(nombre);
    }

    public String actualizaDescripcion(Heroe juan) {

        for (Heroe heroes : this.heroes) {
            if (heroes.getNombre().equals(juan.getNombre())) {
                heroes.setDescripcion(juan.getDescripcion());
                return heroes.getDescripcion();
            }
        }
        return "";
    }

    public List<Heroe> getHeroes() {

        return heroes;

    }

    public void eliminarHeroe(String nombre) {

        for (Heroe heroes : this.heroes) {
            if (heroes.getNombre().equals(nombre)) {

            }
        }
    }
}
