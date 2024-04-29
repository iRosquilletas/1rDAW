package libreria;

public class fnadaw {
    public static char[][] codificador(char[][] imagen) {
        int dimension = imagen.length;
        char[][] codificacion = new char[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            int contador = 0;
            char caracter = imagen[i][0]; 
            for (int j = 0; j < dimension; j++) {
                if (imagen[i][j] == caracter) {
                    contador++;
                } else {
                    codificacion[i][j  - 1] = (char) (contador + '0');
                    contador = 1;
                    caracter = imagen[i][j];
                }
        }
            codificacion[i][dimension -1] = (char) (contador + '0');
        }
         return codificacion;
    }
}