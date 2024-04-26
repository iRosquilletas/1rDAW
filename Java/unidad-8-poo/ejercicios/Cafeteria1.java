import lib.Cafetera;

public class Cafeteria1 {
    public static void main(String[] args) {
        Cafetera miCafetera = new Cafetera();

        System.out.println("Capacidad máxima:" + miCafetera.getCapacidadMaxima() + " ml");
        System.out.println("Cantidad actual de café:  " + miCafetera.getCantidadActual() + " ml");

        miCafetera.llenarCafetera();
        System.out.println("llenar -> Cantidad actual de cafe: " + miCafetera.getCantidadActual() + " ml");

        miCafetera.servirTaza(200);
        System.out.println(
                " servir -> Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual() + " ml");

        miCafetera.agregarCafe(500);
        System.out.println(
                " agregar -> Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual() + " ml");

        miCafetera.vaciarCafetera();
        System.out
                .println("vaciar -> Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual() + " ml");

    }
}
