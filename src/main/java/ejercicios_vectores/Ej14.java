package ejercicios_vectores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej14 {

    /**
     * Rellenar una tabla 5 enteros y mostrar los valores de la tabla mediante asteriscos
     * Introduzca 5 valores:
     * 4 1 7 2 1
     * Valores de la tabla:
     * 4:****
     * 1:*
     * 7:*******
     * 2:**
     * 1:*
     * @param vector vector
     */
    public static void tablaAstericos(int[] vector){

        System.out.println("Valores de la tabla");
        for (int i = 0; i < vector.length; i++) {
            int contador = 0;

            System.out.print(vector[i] + ":");
                while (contador < vector[i]) {
                    System.out.print("*");
                    contador++;
                }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        int tamanio = sc.nextInt();

        int[] array = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Introduce el valor del vector: ");
            array[i] = sc.nextInt();
        }

        tablaAstericos(array);

    }
}
