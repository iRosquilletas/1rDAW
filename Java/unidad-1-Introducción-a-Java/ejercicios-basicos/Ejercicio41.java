public class Ejercicio41 {
    public static void main(String[] args){
        int i = 8;
        int j = 5;
        float x = 0.005f;
        float y = -0.01f;
        char c = 'c';
        char d = 'd';

        boolean uno = i <= j;
        boolean dos = c > d;
        boolean tres = x >= 0;
        boolean cuatro = x < y - 1;
        boolean cinco = j != 6;
        boolean seis = c == 99;
        boolean siete = y - 1 < 1;
        boolean ocho = 2 * (x + y) == 0;
        boolean nueve = x + y >= 0;

        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        System.out.println(cuatro);
        System.out.println(cinco);
        System.out.println(seis);
        System.out.println(siete);
        System.out.println(ocho);
        System.out.println(nueve);
    }
}
