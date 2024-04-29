package libsix;

public class Profesor extends Persona {
    private String ndespacho;

    public Profesor() {
        super("", "", "", null);
        this.ndespacho = "";
    }

    public Profesor(String ndespacho) {
        super("", "", "", null);
        this.ndespacho = ndespacho;
    }

    public Profesor(String nombre, String apellidos, String NIF, Direccion direccion, String ndespacho) {
        super(nombre, apellidos, NIF, direccion);
        this.ndespacho = ndespacho;
    }

    public String getNdespacho() {
        return ndespacho;
    }

    public void setNdespacho(String ndespacho) {
        this.ndespacho = ndespacho;
    }

    public String toString() {
        return "Profesor{" +
                "ndespacho='" + ndespacho + '\'' +
                "} " + super.toString();
    }
}
