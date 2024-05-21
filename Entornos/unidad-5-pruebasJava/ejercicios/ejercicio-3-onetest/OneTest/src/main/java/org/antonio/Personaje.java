package org.antonio;

public interface Personaje {
    String getNombre();

    int getPoder();

    void recibirDanio(int cantidadDanio);

    void atacar(Personaje enemigo);
}
