package ejercicios_vectores;
import java.util.Arrays;

public class Ej10 {
    public static void main(String[] args) {
        int[] tabla = {1,2,3,4,5,6,2,3,9,4};

        int[] unicos = unicos(tabla);
        System.out.println(Arrays.toString(unicos));
    }

    /**
     * Leer 10 números y almacenar en una tabla sólo los valores distintos, es decir si un número
     * es introducido varias veces sólo se almacena en la tabla una sola vez. El programa terminará
     * cuando la tabla esté completa
     * @param array parametro
     * @return un array de numeros unicos
     */
    public static int[] unicos(int[] array) {
        int[] numUnicos = new int[array.length];
        boolean unico = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i && !unico; j++) {
                if (array[i] == array[j]) {
                    unico = true;
                }
            }
            if (!unico){
                numUnicos[i] = array[i];
            }
            unico = false;
        }
        return numUnicos;
    }
}
