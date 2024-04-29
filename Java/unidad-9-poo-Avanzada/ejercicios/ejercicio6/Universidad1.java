import java.util.ArrayList;
import java.util.List;
import libsix.*;

public class Universidad1 {
    public static void main(String[] args) {
        Direccion dire1 = new Direccion("Calle Principal", "Ciudad A", "12345", "País A");
        Direccion dire2 = new Direccion("Calle Secundaria", "Ciudad B", "54321", "País B");

        Estudiante estu1 = new Estudiante("Felipe", "Borrás", "34564339A", dire1, 1001);
        Estudiante estu2 = new Estudiante("Maria", "Pinto", "82655321B", dire2, 1002);

        Profesor profe1 = new Profesor("Profesor1", "Apellidos1", "11111Z", dire1, "Despacho1");
        Profesor profe2 = new Profesor("Profesor2", "Apellidos2", "22222Z", dire2, "Despacho2");

        List<Persona> personas = new ArrayList<>();
        personas.add(estu1);
        personas.add(estu2);
        personas.add(profe1);
        personas.add(profe2);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
