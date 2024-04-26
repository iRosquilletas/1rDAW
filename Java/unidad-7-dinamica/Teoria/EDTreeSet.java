package Teoria;
import java.util.TreeSet;
import java.util.Iterator;
public class EDTreeSet {
 public static void main (String[] args){
 //Creamos TreeSet para almacenar meses del año
 TreeSet<String> diasSemana = new TreeSet<String>();
 TreeSet<Integer> numeros = new TreeSet<Integer>();
 //Añadimos elementos al TreeSet
 diasSemana.add("Lunes");
 diasSemana.add("Martes");
 diasSemana.add("Miércoles");
 diasSemana.add("Jueves");
 diasSemana.add("Viernes");
 diasSemana.add("Sabado");
 diasSemana.add("Domingo");
 for (int i=10; i>=1;i--){
 numeros.add(i);
 }
//Continúa en la siguiente hoja
 //Iteramos con Iterator
 System.out.println("Iteramos con Iterator");
 Iterator<String> itts = diasSemana.iterator();
 while (itts.hasNext()){
 System.out.println(itts.next());
 }
 Iterator<Integer> itt1s = numeros.iterator();
 while (itt1s.hasNext()){
 System.out.println(itt1s.next());
 }
 //Iteramos con foreach
 System.out.println("Iteramos con foreach");
 for (String dia : diasSemana) {
 System.out.println(dia);
 }
 for (Integer numero : numeros) {
 System.out.println(numero);
 }
 }
}