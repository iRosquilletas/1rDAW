package lib;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int a_capacidadMaxima) {
        this.capacidadMaxima = a_capacidadMaxima;
        this.cantidadActual = a_capacidadMaxima;
    }

    public Cafetera(int a_capacidadMaxima, int a_cantidadActual) {
        this.capacidadMaxima = a_capacidadMaxima;
        this.cantidadActual = Math.min(a_capacidadMaxima, a_cantidadActual);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int a_capacidadMaxima) {
        this.capacidadMaxima = a_capacidadMaxima;
    }

    public void setCantidadActual(int a_cantidadActual) {
        this.cantidadActual = a_cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se ha servido una taza de " + cantidad + " ml");
        } else {
            System.out.println("No hay café para llenar lo que falta, te pongo lo que queda");
            vaciarCafetera();
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera se vació");
    }

    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
            System.out.println("Añado" + cantidad + " ml de café a la cafetera");
        }
    }

}
