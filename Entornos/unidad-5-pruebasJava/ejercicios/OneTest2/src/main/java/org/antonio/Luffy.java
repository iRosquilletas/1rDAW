package org.antonio;

public class Luffy {
    private String nombre;
    private int poder;

    /**
     * Constructor de la clase Luffy.
     * 
     * @param nombre Nombre de Luffy.
     * @param poder  Poder de ataque de Luffy.
     */
    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    /**
     * Método para obtener el nombre de Luffy.
     * 
     * @return Nombre de Luffy.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el poder de ataque de Luffy.
     * 
     * @return Poder de ataque de Luffy.
     */
    public int getPoder() {
        return poder;
    }

    /**
     * Método para que Luffy ataque a otro personaje.
     * 
     * @param enemigo Personaje al que se ataca.
     */
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}