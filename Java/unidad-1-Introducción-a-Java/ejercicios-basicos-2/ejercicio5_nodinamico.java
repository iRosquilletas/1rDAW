public class ejercicio5_nodinamico {
    public static void main(String[] args) {
        String nombre = "Samuel Borrás Pinto";
        String subNombre = nombre.substring(0,6);
        String subApellido = nombre.substring(7, 13);
        String subApellido2 = nombre.substring(14, 19);
        System.out.println("Mi nombre es: " + subNombre);
        System.out.println("Mi primer apellido es: " + subApellido);
        System.out.println("Mi segundo apellido es: " + subApellido2);
    }
}
