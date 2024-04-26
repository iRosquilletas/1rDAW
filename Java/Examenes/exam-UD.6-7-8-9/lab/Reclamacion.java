package lab;

public class Reclamacion extends Formulario {
    private String textoReclamacion;
    private boolean abierta;

    public Reclamacion(String id, String cliente, String textoReclamacion) {
        super(id, cliente);
        this.textoReclamacion = textoReclamacion;
        this.abierta = true;
    }

    public void cerrarReclamacion() {
        this.abierta = false;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + cliente);
        System.out.println("Texto de la reclamación: " + textoReclamacion);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }
}