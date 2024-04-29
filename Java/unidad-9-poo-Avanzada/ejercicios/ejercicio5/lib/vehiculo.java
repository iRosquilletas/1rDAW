package libfive;

public class vehiculo {
    static int vehiculosCreados = 0;
    static int kilometrosTotales = 0;
    int kilometrosRecorridos;

    public vehiculo() {
        vehiculosCreados++;
        this.kilometrosRecorridos = 0;
    }

    public void andar(int distancia) {

        this.kilometrosRecorridos += distancia;

        kilometrosTotales += distancia;
    }

    public int getKilometrosRecorridos() {

        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static int getVehiculosTotales() {
        return vehiculosCreados;
    }
}
