package ejercicios_vectores;

import java.util.Arrays;

/**
 *EJ7: Realizar una función que reciba como parámetros una tabla de N elementos, y me devuelva
 * cuál es el número que más veces se repite (la moda). Ampliar el ejercicio para obtener los
 * dos números que más veces se repiten, en este caso la función devuelve un array de dos
 * posiciones: 1º moda y 2º moda.
 */
public class Ej7 {
    public static void main(String[] args) {
        int[] array = {7,4,1,7,5,4,8,7,9,4,10,7};

        int[] resultado = hallarModas(array);
        System.out.println(Arrays.toString(resultado));
    }


    /**
     * @param vector EL ARRAY DONDE SE VA A BUSCAR LA MDA
     * @return UN ARRAY CON LA PRIMERA Y SEGUNDA MODA
     */
    public static int[] hallarModas(int[] vector){ //!!!!HECHOOOO
        int[] modas = new int[2];
        int moda1 = 0;
        int maximo = 0;
        int maximo2 = 0;
        int moda2 = 0;

        if (vector != null){
            for (int i = 0; i < vector.length; i++) { //BUCLE GENERAL PARA RECORRER EL VECTOR
                int cantidad = Ej6.contarApariciones(vector[i], vector);

                if (cantidad >= maximo) { //HALLAR PRIMERA MODA
                        maximo = cantidad;
                    moda1 = vector[i];
                }

                if (vector[i] != moda1) { //HALLAR SEGUNDA MODA
                    cantidad = Ej6.contarApariciones(vector[i], vector);

                    if (cantidad >= maximo2) {
                        maximo2 = cantidad;
                        moda2 = vector[i];
                    }
                }
                modas[0] = moda1;
                modas[1] = moda2;
            }
        }
        return modas;
    }
}
