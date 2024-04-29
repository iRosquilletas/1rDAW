package Teoria;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class EDLinkedHashSet {
 public static void main (String[] args){
 //Creamos HashSet para almacenar meses del año
 LinkedHashSet<String> diasSemana = new LinkedHashSet<String>();
 //Añadimos elementos al LinkedHashSet
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
 //Iteramos la estructura con Iterator
 System.out.println("Iteramos con Iterator");
 Iterator<String> itlhs = diasSemana.iterator();
 while (itlhs.hasNext()){
 System.out.println(itlhs.next());
 }
 //Iteramos la estructura con foreach o for mejorado
 System.out.println("Iteramos con foreach");
 for (String dia : diasSemana) {
 System.out.println(dia);
 }
 }
}
