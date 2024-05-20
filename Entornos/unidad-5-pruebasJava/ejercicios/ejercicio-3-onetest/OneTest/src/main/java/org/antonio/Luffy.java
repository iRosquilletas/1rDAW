package org.antonio;

public class Luffy implements Personaje {
    private String nombre;
    private int poder;

    /**
     * 
     * @param nombre
     * @param poder
     * 
     */

    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return
     */
    public int getPoder() {
        return poder;
    }

    @Override
    public void recibirDanio(int cantidadDanio) {
        this.poder -= cantidadDanio;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }

}