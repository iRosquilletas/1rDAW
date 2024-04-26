package Teoria;
import java.util.HashSet;
public class EDHashSet {
 public static void main (String[] args){
 //Creamos HashSet para almacenar días de la semana
 HashSet<String> diasSemana = new HashSet<String>();
 String dia;
 //Añadimos elementos al HashSet
 diasSemana.add("Lunes");
 diasSemana.add("Martes");
 diasSemana.add("Miércoles");
 diasSemana.add("Jueves");
 diasSemana.add("Viernes");
 diasSemana.add("Sabado");
 diasSemana.add("Domingo");
 //Imprimimos el contenido de la colección si no es vacia
 if (!diasSemana.isEmpty()){
 System.out.println(diasSemana);
 }
//Continúa en la siguiente hoja
 //Añadimos un día inventado
 diasSemana.add("Juernes");
 //Comprobamos si existe el elemento
 dia="Juernes";
 if (diasSemana.contains(dia)){
 System.out.println("El día "+dia+" está en la colección "+diasSemana);
 } else {
 System.out.println("El día "+dia+" no está en la colección "+diasSemana);
 }
 //Eliminamos el elemento inventado
 if (diasSemana.remove(dia)){
 System.out.println("Tras eliminar el día "+dia+" la colección es "+diasSemana);
}
 //Vaciamos la colección
 diasSemana.clear();
 System.out.println("Tras ejecutar clear la colección es "+diasSemana);
 }

}
