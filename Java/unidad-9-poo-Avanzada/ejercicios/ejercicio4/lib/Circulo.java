package libfour;
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    public double area() {
        return Math.PI * radio * radio;
    }

 }
