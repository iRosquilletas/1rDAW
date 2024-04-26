package lab;

public class Devolucion extends Formulario {
    private String producto;
    private double precio;

    public Devolucion(String id, String cliente, String producto, double precio) {
        super(id, cliente);
        this.producto = producto;
        this.precio = precio;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
    }
}
