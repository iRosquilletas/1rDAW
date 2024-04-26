import libreria.libreria2;

public class capicua {
    public static void main(String[] args) {
        rango(1000, 9999);
    }

    public static void rango(int inicio, int fin) {
        int contadorCapicuas = 0;
        for (int i = inicio; i <= fin; i++) {
            if (libreria2.esCapicua(i)) {
                System.out.println(i);
                contadorCapicuas++;
            }
        }
        System.out.println("Los números capicua son entre" + inicio + " y " + fin + ": " + contadorCapicuas);
    }
}