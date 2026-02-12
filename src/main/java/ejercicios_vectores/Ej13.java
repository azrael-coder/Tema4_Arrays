package ejercicios_vectores;

import java.util.Arrays;

public class Ej13 {
    public static void main(String[] args) {
        int[] v1 = {35, 70, 105, 70};
        int[] v2 = new int[0];

        //System.out.println(Arrays.toString( llenarTablaUni(v1,v2)));
        System.out.println(Arrays.toString(llenarTabla(v1, v2)));
    }

    /**
     * a)
     * Se supone que no existen números repetidos en array1
     * @param array1
     * @param array2
     * @return
     */
    public static int[] llenarTablaUni(int[] array1, int[] array2) {
        array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 35 == 0) {
                array2[i] = array1[i];
            }
        }
        return array2;
    }



    public static int[] llenarTabla(int[] array1, int[] array2) {
        array2 = new int[array1.length];

            for (int i = 0; i < array1.length; i++) {
                boolean aparecido = false;

                for (int j = 0; j < i && !aparecido; j++) { //BUCLE PARA VALIDAR Q NO HALLA REPETIDOS
                    if (array1[i] == array1[j]) {
                        aparecido = true;
                    }
                }
                if (!aparecido) { //IMPORTANTE ESTA CONDICION DEBE IR FUERA DEL BUCLE QUE VALIDA LOS REPETIDOS
                    if (array1[i] % 35 == 0) {
                        array2[i] = array1[i];
                    }
                }
            }
        return array2;
    }
}
