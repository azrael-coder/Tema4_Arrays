package ejercicios_vectores;

import java.util.Scanner;

/**
 * Clase que gestiona la identificación de números divisibles por 3.
 * * @author israel
 */
public class Ej19 {

    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        divisibles3();
    }

    /**
     * Solicita hasta 11 números al usuario (o hasta introducir un 0)
     * y muestra cuántos de ellos son divisibles por 3, excluyendo el cero.
     */
    public static void divisibles3(){
        Scanner sc = new Scanner(System.in);
        String resultado = "";          // Acumula los números divisibles para mostrarlos al final
        int[] array = new int[11];      // Almacenamiento limitado a 11 posiciones
        int contador = 0;               // Rastrea cuántos números se han introducido realmente
        int contarDivisibles = 0;       // Contador de números que cumplen la condición
        boolean continuar = false;      // Bandera de control para detener la entrada de datos

        System.out.println("Introducir números y terminar con el valor 0: ");

        // Primer bucle: Captura de datos
        for (int i = 0; i < array.length && !continuar; i++ ) {
            System.out.print("Introduce un numero: ");
            array[i] = sc.nextInt();
            contador++; // Incrementamos el total de números leídos

            // Si el usuario introduce 0, activamos la bandera para salir del bucle
            if (array[i] == 0){
                continuar = true;
            }
        }

        // Segundo bucle: Procesamiento de los datos guardados
        for (int i = 0; i < contador; i++ ) {
            // Un número es divisible por 3 si el resto de la división (%) es 0
            // Se excluye el 0 de la lista de resultados por lógica del ejercicio
            if (array[i] % 3 == 0 && array[i] != 0){
                resultado += array[i] + " ";
                contarDivisibles++;
            }
        }

        // Salida de resultados por consola
        System.out.println("Numeros introducidos: " + contador);
        System.out.println("Numeros divisibles entre 3: " + contarDivisibles);
        System.out.println("Valores: " + "\n" + resultado);
    }
}