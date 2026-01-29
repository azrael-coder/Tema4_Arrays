package ejercicios_vectores;
/**
 * Realizar una función que reciba como parámetros un número y una tabla de enteros , y que
 * deberá devolver cuantas veces aparece el número en la tabla. Utilizar este método para
 * ampliar el ejercicio 4 para que me indique cuantos números aparecen como mínimo dos
 * veces en la tabla de 100 elementos
 */
public class Ej6 {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,2,3};

        int cantidad = aparicionesNum(vector);
        System.out.println(cantidad);
    }

    public static int contarApariciones(int num, int[] vector){
        int contador = 0;

        for(int i=0; i<vector.length; i++){
            if(vector[i] == num){
                contador++;
            }
        }
        return contador;
    }

    public static int aparicionesNum(int[] vector){
        int numRepetidos = 0;
        int numActual;
        int apariciones;

            for(int i=0; i<vector.length; i++){ //CORREGIR !!!!
                numActual = vector[i];

                if (contarApariciones(vector[i], vector) == 0) {
                    apariciones = contarApariciones(vector[i], vector);
                }
                if (contarApariciones(vector[i], vector) >= 2) {
                    numRepetidos++;
                }
            }

        return numRepetidos;
    }
}
