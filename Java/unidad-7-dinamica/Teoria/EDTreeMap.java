package Teoria;

import java.util.TreeMap;
import java.util.NavigableMap;

public class EDTreeMap {
    public static void main(String[] args) {
        // Creamos TreeMap
        TreeMap<Integer, String> diasSemana = new TreeMap<Integer, String>();
        NavigableMap<Integer, String> diasSemanaSDesc = new TreeMap<Integer, String>();
        String dia;
        int index;
        // Añadimos elementos a TreeMap
        diasSemana.put(1, "Lunes");
        diasSemana.put(2, "Martes");
        diasSemana.put(3, "Miércoles");
        diasSemana.put(4, "Jueves");
        diasSemana.put(5, "Viernes");
        diasSemana.put(6, "Sabado");
        diasSemana.put(7, "Domingo");
        // Mostramos el tamaño de los TreeMap
        System.out.printf("El TreeMap contiene %d elementos\n", diasSemana.size());
        System.out.println(diasSemana);
        // Mostramos la primera clave y la última del TreeMap
        System.out.printf("La clave mínima es %d\n", diasSemana.firstKey());
        System.out.printf("La clave máxima es %d\n", diasSemana.lastKey());
        // Continúa en la siguiente hoja

        // Mostramos subMapa de TreeMap
        System.out.println("El submapa entre 3 y 5 es " + diasSemana.subMap(3, true, 5, true));
        // ordenamos el TreeMap de forma descendente
        System.out.println("antes de ordenar " + diasSemana);
        System.out.println("después de ordenar " + diasSemana.descendingMap());
        // Comprobamos existen o no elementos
        index = 7;
        if (diasSemana.containsKey(index)) {
            System.out.printf("El índice %d existe y tiene el valor %s\n", index,
                    diasSemana.get(index));
        }
        // Buscamos un elemento
        dia = "Jueves";
        if (diasSemana.containsValue(dia)) {
            for (Integer ds : diasSemana.keySet()) {
                if (diasSemana.get(ds) == dia) {
                    System.out.printf("El %s es el valor de la clave %d \n", dia, ds);
                }
            }
        }
        // Continúa en la siguiente hoja
        // Reemplazamos un elemento (Java 8)
        dia = "Juernes";
        index = 4; // corresponde al Jueves
        System.out.printf("El %s con clave %d se va a reemplazar por %s\n",
                diasSemana.get(index), index, dia);
        diasSemana.replace(index, diasSemana.get(index), dia);
        System.out.printf("El día %d ahora es %s\n", index, diasSemana.get(index));
        // Eliminamos un elemento del TreeMap
        index = 4;
        System.out.printf("El %s con clave %d se elimina\n", diasSemana.get(index), index);
        diasSemana.remove(index);
        // Tratamos de recorrerla
        System.out.println("Mostramos los elementos de dias de la semana: ");
        for (Integer ds : diasSemana.keySet()) {
            System.out.printf("La clave %d contiene el día %s\n", ds, diasSemana.get(ds));
        }
    }
}
