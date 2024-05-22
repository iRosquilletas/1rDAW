package org.antonio;

public class Fruta {
    private String nombre;
    private boolean esDeliciosa;

    /**
     * Constructor de la clase Fruta.
     * 
     * @param nombre      Nombre de la fruta.
     * @param esDeliciosa Indicador de si la fruta es deliciosa.
     */
    public Fruta(String nombre, boolean esDeliciosa) {
        this.nombre = nombre;
        this.esDeliciosa = esDeliciosa;
    }

    /**
     * Método para obtener el nombre de la fruta.
     * 
     * @return Nombre de la fruta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para verificar si la fruta es deliciosa.
     * 
     * @return true si la fruta es deliciosa, false si no lo es.
     */
    public boolean esDeliciosa() {
        return esDeliciosa;
    }

    /**
     * Método para verificar si se puede comer la fruta.
     * 
     * @return true si la fruta es deliciosa y no es la "Fruta del Diablo", false en
     *         otro caso.
     */
    public boolean puedoComer() {
        return esDeliciosa && !nombre.equals("Fruta del Diablo");
    }
}