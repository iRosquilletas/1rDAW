public class ejercicio3 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double diametro = 15.5;
        double altura = 42.4;

        double area = (((2 * pi * (diametro/2)) * altura));
        double volumen = ((pi * (diametro/2)) * (pi * (diametro/2)));
        System.out.println("Area = " + area + "\nVolumen = " + volumen);
    }
}
