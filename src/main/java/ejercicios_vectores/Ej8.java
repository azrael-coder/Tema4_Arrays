package ejercicios_vectores;

import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {
        int[] array = {7,4,1,7,5,4,8,7,9,4,10,7,0};

        int[] ultimo5 = ultimos5(array);
        System.out.println(Arrays.toString(ultimo5));
    }

    /**
     * Almacenar en una tabla de 5 elementos los últimos 5 números leídos de una secuencia
     * indeterminada de números, donde el número cero marca el fin de la secuencia
     * Ej,- 31, 4, 5, 60, 4, 4, 6, 4, 54, 6, 3, 34, 24, 2, 14 ,7 ,18, 0 → Deberá mostrar 24, 2, 14,7,18
     * @param array
     * @return
     */
    public static int[] ultimos5(int[] array) {
        int[] array5 = new int[5];
            for (int i = 0; array5.length > i; i++) {
                array5[i] = array[array.length - 6 + i];
            }
        return array5;
    }
}
