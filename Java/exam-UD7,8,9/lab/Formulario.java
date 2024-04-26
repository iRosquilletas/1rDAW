package lab;

public class Formulario {

    protected String id;
    protected String cliente;

    public Formulario(String id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public String getCliente() {

        return cliente;
    }

    public void imprimirDatos() {
        System.out.println("ID:" + id);
        System.out.println("Cliente: " + cliente);

    }

}
