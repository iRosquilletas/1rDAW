package lib;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 2;
        this.denominador = 6;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int a_numerador) {
        this.numerador = a_numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("Error");
        }

    }

    public void invertir() {
        int xd = numerador;
        numerador = denominador;
        denominador = xd;
    }

    private int simplificar(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplificar() {
        int mcd = simplificar(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    public void multiplicar(Fraccion otra) {
        numerador *= otra.getNumerador();
        denominador *= otra.getDenominador();
        simplificar();
    }

    public void dividir(Fraccion otra) {
        if (otra.getNumerador() != 0) {
            numerador *= otra.getDenominador();
            denominador *= otra.getNumerador();
            simplificar();

        }

    }
}
