package estudio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gestionaruser {
    private static final String FICHERO_USUARIOS = "usuarios.txt";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de gestión de usuarios.");
        
        while (true) {
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    registrarNuevoUsuario();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
    
    private static void registrarNuevoUsuario() {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_USUARIOS, true))) {
            System.out.println("Registro de nuevo usuario");
            System.out.print("Ingrese el nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Ingrese la contraseña: ");
            String contrasena = scanner.nextLine();
            
            writer.write(nombreUsuario + ":" + contrasena);
            writer.newLine();
            
            System.out.println("Usuario registrado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al registrar el usuario.");
            e.printStackTrace();
        }
    }
    
    private static void iniciarSesion() {
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader reader = new BufferedReader(new FileReader(FICHERO_USUARIOS))) {
            Map<String, String> usuarios = new HashMap<>();
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                usuarios.put(parts[0], parts[1]);
            }
            
            System.out.print("Ingrese su nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();
            
            if (usuarios.containsKey(nombreUsuario)) {
                String contrasenaGuardada = usuarios.get(nombreUsuario);
                if (contrasenaGuardada.equals(contrasena)) {
                    System.out.println("Inicio de sesión exitoso.");
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("El usuario no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al iniciar sesión.");
            e.printStackTrace();
        }
    }
}


