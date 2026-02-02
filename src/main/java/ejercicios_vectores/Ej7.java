package ejercicios_vectores;

import java.util.Arrays;

/**
 * Realizar una función que reciba como parámetros una tabla de N elementos, y me devuelva
 * cuál es el número que más veces se repite (la moda). Ampliar el ejercicio para obtener los
 * dos números que más veces se repiten, en este caso la función devuelve un array de dos
 * posiciones: 1º moda y 2º moda.
 */
public class Ej7 {
    public static void main(String[] args) {
        int[] array = {1,2,2,2,1,3,5,2,7,9,2,2,4,2,1};

        int[] resultado = hallarModa(array);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] hallarModa(int[] vector){
        int[]modas = new int[2];
        int moda = 0;
        int moda2 = 0;
        int maximo = 0;
        boolean aparecido = false;
        boolean modaSegunda = false;

        if (vector != null){
            for (int i = 0; i < vector.length; i++) {

                for (int j = 0; j < i; j++) {
                    if (vector[i] == vector[j]) {
                        aparecido = true;
                    }
                    if (vector[i] == moda){
                        modaSegunda = true;
                    }
                }

                if (!aparecido) {
                    int cantidad = Ej6.contarApariciones(vector[i], vector);

                    if (cantidad >= maximo) {
                        maximo = cantidad;
                        moda = vector[i];
                    }
                }

                if(!modaSegunda){
                    int cantidad = Ej6.contarApariciones(vector[i], vector);

                    if (cantidad >= maximo) {
                        maximo = cantidad;
                        moda2 = vector[i];
                    }
                }
            }
            modas[0] = moda;
            modas[1] = moda2;
        }
        return modas;
    }




}
