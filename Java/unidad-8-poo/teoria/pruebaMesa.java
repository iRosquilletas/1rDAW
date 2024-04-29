package ejemplo;
import lib.Mesa;
public class pruebaMesa {
    public static void main (String[] args) {

        Mesa miMesa = new Mesa();

        System.out.println(miMesa.getColor());

        miMesa.setColor("Amarillo");
        System.out.println("Nuevo color: " + miMesa.getColor());

        System.out.println("Area: " + miMesa.area());

        System.out.println("------");



        Mesa otraMesa = new Mesa("Azul", 3, 50, 60, "Acero");
        System.out.println(otraMesa.getColor());
        System.out.println(otraMesa.area());
        System.out.println(otraMesa.area());
        System.out.println(otraMesa.);
    }
}
