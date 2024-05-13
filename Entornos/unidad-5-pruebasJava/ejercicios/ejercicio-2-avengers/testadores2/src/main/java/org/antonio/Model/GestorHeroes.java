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
    public String actualizaDescripcion(Heroe juan){

        for (Heroe heroes : this.heroes){
            if (heroes.getNombre().equals(juan.getNombre())) {
                heroes.setDescripcion(juan.getDescripcion());
                return heroes.getDescripcion();
            }
        }
        return "";
    }

    public  List<Heroe> getHeroes(){

        return heroes;

    }

    public void eliminarHeroe(String nombre) throws HeroeNoEncontradoException {
        boolean encontrado = false;
        
        for (Heroe heroe : this.heroes) {
            if (heroe.getNombre().equals(nombre)) {
                this.heroes.remove(heroe);
                encontrado = true;
                return;
            }
        }
        
        if (!encontrado) {
            throw new HeroeNoEncontradoException(nombre);
        }
    }

    public Heroe buscarHeroePorSuperpoder(String superpoder) {

        for (Heroe heroe : this.heroes) {
            if (heroe.getSuperpoderes().equals(superpoder)) {
                this.heroes.remove(heroe);
                return heroe;
            }
        }
        
        return null;

    }

    public String listarHeroes(){

        List<String> nombres = new ArrayList<String>();

        for (Heroe heroe : this.heroes){

            nombres.add(heroe.getNombre());

        }
        return String.join(", ", nombres);

    }

    public Heroe actualizarHeroe(Heroe heroeActualizado){
        for (Heroe heroes : this.heroes){
            if (heroes.getNombre().equals(heroeActualizado.getNombre())) {
                heroes.setDescripcion(heroeActualizado.getDescripcion());
                heroes.setBiografia(heroeActualizado.getBiografia());
                heroes.setSuperpoderes(heroeActualizado.getSuperpoderes());
                return heroes;
            }
        }
        return null ;
    }
    public List<Heroe> listaHeroesPorSuperpoder(String superpoder){

        List<Heroe> HeroesSuperPoder = new ArrayList<Heroe>();

        for(Heroe heroe : this.heroes){

            if (heroe.getSuperpoderes().toLowerCase().contains(superpoder.toLowerCase())){
                HeroesSuperPoder.add(heroe);
            }
        }

        return HeroesSuperPoder;

    }
}
