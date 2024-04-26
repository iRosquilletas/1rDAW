package boing.objs;

import java.util.ArrayList;

public class Triangulo extends Objeto {
    public Triangulo(Posicion pos, int dirx, int diry) {
        super(pos, dirx, diry);
    }


    public ArrayList<Posicion> forma() {

        ArrayList<Posicion> forma = new ArrayList<Posicion>();
        forma.add(new Posicion(0, 4));
        forma.add(new Posicion(1, 4));
        forma.add(new Posicion(2, 4));
        forma.add(new Posicion(3, 4));
        forma.add(new Posicion(4, 4));
        forma.add(new Posicion(1, 3));
        forma.add(new Posicion(2, 3));
        forma.add(new Posicion(3, 3));
        forma.add(new Posicion(2, 2));
        return forma;

    }

}
