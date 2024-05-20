package org.antonio;

public class Zoro {
    private String nombre;
    private int poder;

    /**
     * 
     * @param nombre
     * @param poder
     */
    public Zoro(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return
     */
    public int getPoder() {
        return poder;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}
