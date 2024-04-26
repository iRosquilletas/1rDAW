import boing.*;
import boing.objs.*;
import java.util.ArrayList;

public class LanzaBoing {

    public static void main(String[] args) {

        ArrayList<Objeto> objs = new ArrayList<Objeto>();

        Campo camp = new Campo(100, 40); // Agrandar el campo a 100x40

        objs.add(new Cuadrado(new Posicion(5, 5), 1, 1));
        objs.add(new Cuadrado(new Posicion(20, 20), 1, -1));
        objs.add(new Cuadrado(new Posicion(30, 20), 1, -1));
        objs.add(new Cuadrado(new Posicion(40, 25), -1, 1));
        objs.add(new Cuadrado(new Posicion(35, 10), -1, -1));
        objs.add(new Rectangulo(new Posicion(40, 15), 1, 1));
        objs.add(new Rectangulo(new Posicion(5, 10), 1, -1));
        Triangulo triangulo = new Triangulo(new Posicion(60, 20), 1, 1);
        objs.add(triangulo);

        Boing.boing(camp, objs);

        System.out.println("Colisiones Triangulo: " + triangulo.getColisiones());
    }
    
}
