package org.antonio;

public class Luffy implements Personaje {
    private String nombre;
    private int poder;

    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPoder() {
        return poder;
    }

    @Override
    public void recibirDanio(int cantidadDanio) {
        poder -= cantidadDanio;
    }

    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}
