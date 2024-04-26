public class ejercicio2 {
    public static void main(String[] args) {
        float a = 8.0f;
        int b = 3;
        char c = '5';

        int resint;
        double resdouble;

        resint = (int) (a - b + (int) c);
        resdouble = a - b + (int) c;
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = 2 * b + 3 * (int) (a - (int) c);
        resdouble = 2 * b + 3 * (a - (int) c);
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) (a/b);
        resdouble = a / b;
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) (a % b);
        resdouble = a % b;
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) (a / (int) c - 2);
        resdouble = a / (int) c - 2;
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) (a * b / (int) c);
        resdouble = a * b / (int) c;
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) (a * ((int) c % b));
        resdouble = a * ((int) c % b);
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) ((3 * a - 2 * b) % (2 * a - (int) c));
        resdouble = (3 * a - 2 * b) % (2 * a - (int) c);
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) ((a - 3 * b) % ((int) c + 2 * a) / (a - (int) c));
        resdouble = ((a - 3 * b) % ((int) c + 2 * a)) / (a - (int) c);
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);

        resint = (int) (a - b - (int) c * 2);
        resdouble = a - b + (int) c * 2;
        System.out.println("Resint: " + resint + "  Resdouble: " + resdouble);


    }
}
