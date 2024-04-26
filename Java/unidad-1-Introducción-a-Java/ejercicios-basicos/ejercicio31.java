public class ejercicio31 {
    public static void main(String[] args) {

    int a = 8;
    int b = 3;
    int c = -5;

    int uno = a + b + c;
    System.out.println(uno);

    int dos = 2 * b + 3 * (a - c);
    System.out.println(dos);

    double tres = (double) a / b;
    System.out.println(tres);

    int cuatro = a % b;
    System.out.println(cuatro);

    double cinco = (double) a / c;
    System.out.println(cinco);

    int seis = a % c;
    System.out.println(seis);

    double siete = (double) (a * b) / c;
    System.out.println(siete);

    double ocho = a * ((double) b / c);
    System.out.println(ocho);

    int nueve = (a * c) % b;
    System.out.println(nueve);

    double diez = (a - 3 * b) % (c + 2 * a) / (double) (a - c);
    System.out.println(diez);

    int once = a - b - c * 2;
    System.out.println(once);

    }
}
