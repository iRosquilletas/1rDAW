public class ejercicio5_dinamico {
    public static void main(String[] args) {
        String nombre = "Samuel Borrás Pinto";
        String[] partes = nombre.split(" ");
        String parte1 = partes[0];
        String parte2 = partes[1];
        String parte3 = partes[2];
        System.out.println("Mi nombre es: " + parte1);
        System.out.println("Mi primer apellido es: " + parte2);
        System.out.println("Mi segundo apellido es: " + parte3);
    }
}
