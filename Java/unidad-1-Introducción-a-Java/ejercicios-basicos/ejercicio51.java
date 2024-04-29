public class ejercicio51 {
    public static void main(String[] args) {
        int i = 8;
        int j = 5;
        float x = 0.005f;
        float y = -0.01f;
        char c = 'c';
        char d = 'd';

        boolean uno = !(c == 99);
        boolean dos = !(x > 0);
        boolean tres = c > d || c > 0;
        boolean cuatro = i <= j && i >= c;
        boolean cinco = i > 0 && j < 5;
        boolean seis = i > 0 || j < 5;
        boolean siete = x > y && i > 0 || j < 5;

        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        System.out.println(cuatro);
        System.out.println(cinco);
        System.out.println(seis);
        System.out.println(siete);
    }
}
