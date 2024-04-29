package libsix;

public class Estudiante extends Persona {
    private int IDestudiante;

    public Estudiante() {
        super("", "", "", null);
        this.IDestudiante = 0;
    }

    public Estudiante(int IDestudiante) {
        super("", "", "", null);
        this.IDestudiante = IDestudiante;
    }

    public Estudiante(String nombre, String apellidos, String NIF, Direccion direccion, int IDestudiante) {
        super(nombre, apellidos, NIF, direccion);
        this.IDestudiante = IDestudiante;
    }

    public int getIDestudiante() {
        return IDestudiante;
    }

    public void setIDestudiante(int IDestudiante) {
        this.IDestudiante = IDestudiante;
    }

    public String toString() {
        return "Estudiante{" +
                "IDestudiante=" + IDestudiante +
                "} " + super.toString();
    }
}
