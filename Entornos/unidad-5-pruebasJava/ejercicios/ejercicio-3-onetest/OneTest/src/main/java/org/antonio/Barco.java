package org.antonio;

public class Barco {
    private String nombre;
    private int capacidad;

    /**
     * 
     * @param nombre
     * @param capacidad
     */
    public Barco(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
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
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * 
     * @return
     */
    public boolean agregarTripulante() {
        if (capacidad < 10) {
            capacidad++;
            return true;
        }
        return false;
    }
}
