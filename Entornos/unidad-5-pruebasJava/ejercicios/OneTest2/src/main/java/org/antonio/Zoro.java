package org.antonio;

public class Zoro {
    private String nombre;
    private int poder;

    /**
     * Constructor de la clase Zoro.
     * 
     * @param nombre Nombre de Zoro.
     * @param poder  Poder de ataque de Zoro.
     */
    public Zoro(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    /**
     * Método para obtener el nombre de Zoro.
     * 
     * @return Nombre de Zoro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el poder de ataque de Zoro.
     * 
     * @return Poder de ataque de Zoro.
     */
    public int getPoder() {
        return poder;
    }

    /**
     * Método para que Zoro ataque a otro personaje.
     * 
     * @param enemigo Personaje al que se ataca.
     */
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}