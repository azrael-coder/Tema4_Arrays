package ejercicios_vectores;

import java.util.Arrays;

public class Ej13 {
    public static void main(String[] args) {
        int[] v1 = {5, 7,35,105,140,75};
        int[] v2 = new int[0];

        System.out.println(Arrays.toString( llenarTabla(v1,v2)));
        //System.out.println(Arrays.toString(v1));
    }

    public static int[] llenarTabla(int[] array1, int[] array2) {
        int contador = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 5 == 0 && array1[i] % 7 == 0) {
                contador++;
            }
        }
        array2 = new int[contador];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 35 == 0) {
                array2[i] = array1[i];
            }
        }
        return array2;
    }



}
