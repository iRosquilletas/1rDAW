package org.antonio;

public class Fruta {
    private String nombre;
    private boolean esDeliciosa;

    /**
     * 
     * @param nombre
     * @param esDeliciosa
     */
    public Fruta(String nombre, boolean esDeliciosa) {
        this.nombre = nombre;
        this.esDeliciosa = esDeliciosa;
    }

    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return
     * @return
     */
    public boolean esDeliciosa() {
        return esDeliciosa;
    }

    /**
     * @return
     * @return
     */
    public boolean puedoComer() {
        return esDeliciosa && !nombre.equals("Fruta del Diablo");
    }
}
