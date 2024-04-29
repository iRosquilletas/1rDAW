public class Resultado {
    private double precioTotal;
    private int unidades;
    private double precioM3;

    public Resultado(double precioTotal, int unidades, double precioM3) {
        this.precioTotal = precioTotal;
        this.unidades = unidades;
        this.precioM3 = precioM3;

    }

    public double getprecioPorM3() {
        return precioM3;

    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getPrecioM3() {
        return precioM3;
    }
}
