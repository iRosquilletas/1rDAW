package org.antonio;

public class Barco {
    private String nombre;
    private int capacidad;

    /**
     * Constructor de la clase Barco.
     * 
     * @param nombre    Nombre del barco.
     * @param capacidad Capacidad máxima de tripulantes del barco.
     */
    public Barco(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    /**
     * Método para obtener el nombre del barco.
     * 
     * @return Nombre del barco.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la capacidad actual de tripulantes en el barco.
     * 
     * @return Capacidad actual de tripulantes.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Método para intentar agregar un tripulante al barco.
     * 
     * @return true si se pudo agregar un tripulante, false si la capacidad está
     *         llena.
     */
    public boolean agregarTripulante() {
        if (capacidad < 10) {
            capacidad++;
            return true;
        }
        return false;
    }
}