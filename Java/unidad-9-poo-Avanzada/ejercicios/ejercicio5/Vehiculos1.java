import libfive.bicicleta;
import libfive.coche;
import libfive.vehiculo;
import java.util.Scanner;

public class Vehiculos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bicicleta bicicleta = new bicicleta();
        coche coche = new coche();

        int opcion;
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda en bicicleta");
            System.out.println("2. Anda en coche");
            System.out.println("3. Ver kilometraje de la bicicleta");
            System.out.println("4. Ver kilometraje del coche");
            System.out.println("5. Ver kilometraje total");
            System.out.println("6. Ver vehículos totales");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Cuanta distancia harás en bicicleta: ");
                    int distanciaBici = sc.nextInt();
                    bicicleta.andar(distanciaBici);
                    System.out.println("Has hecho" + distanciaBici + " km en bicicleta.");
                    break;
                case 2:
                    System.out.print("Cuanta distancia harás en coche: ");
                    int distanciaCoche = sc.nextInt();
                    coche.andar(distanciaCoche);
                    System.out.println("Hiciste " + distanciaCoche + " kilómetros en coche.");
                    break;
                case 3:
                    System.out.println("Kilometros en bicicleta: " + bicicleta.getKilometrosRecorridos() + " km");
                    break;
                case 4:
                    System.out.println("Kilometros del coche: " + coche.getKilometrosRecorridos() + " km");
                    break;
                case 5:
                    System.out.println("Kilometraje total: " + vehiculo.getKilometrosTotales() + " km");
                    break;
                case 6:
                    System.out.println("Vehículos totales: " + vehiculo.getVehiculosTotales());
                    break;
                case 7:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Error");
            }
            System.out.println();
        } while (opcion != 7);

        sc.close();
    }
}
