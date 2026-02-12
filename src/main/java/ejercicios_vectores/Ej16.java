package ejercicios_vectores;
import java.util.Arrays;
public class Ej16 {
    public static void main(String[] args) {
        int[] numeros = {9, 3, 12, 3, 3, 8, 10, 4, 6, 5};

        System.out.println(valoresPares(numeros));
    }

    /**
     * Define dos tablas de 10 enteros Tabla1 y Tabla2, rellenar la primera tabla con 10 valores,
     * copiar en Tabla2 los elementos de tabla1 que sean pares y mostrar los elementos almacenados en
     * tabla2. Por ejemplo si se han copiado 5 elementos sólo se deben mostrar esos 5
     * @param array array
     */
    public static String valoresPares(int[] array) {
        int[] pares = new int[array.length];
        String resultado = "";
        int contador = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    pares[contador] = array[i];
                    contador++;
                }
            }

            System.out.println("Numeros pares introducidos: " + contador);
            for (int i = 0; i < contador; i++) {
                resultado += ", " + pares[i];
            }
            return resultado;
    }
}
