package ejercicios_vectores;

public class Ej15 {
    public static void main(String[] args) {
        int[] array = {1, 1, 20, 1, 2, 20, 3, 3, 3,4,4,4,33,5,3};

        histograma(array);
    }

    /**
     * 15. Escribir un programa que lea números enteros entre 1 y 100 de la entrada estándar y genere un
     * histograma con las frecuencias de cada número. Al introducir 0 se finaliza la entrada de datos. Para
     * representar las barras del histograma utilizar secuencias del carácter ‘*’ si un número no se ha
     * introducido no tiene que aparecer en el histograma.
     * Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 3,4,4,4,33,3,5,0 generaría la siguiente salida:
     * 1: ***
     * 2: *
     * 3: ****
     * 4: ***
     * 20:**
     * 33:*
     * @param array array
     */
    public static void histograma(int[] array){
        // Verificamos que el array no sea nulo para evitar errores de ejecución
        if (array != null) {
            int contador = 0;
            int referencia = 0;
            boolean aparecido = false;

            // Bucle principal: recorre cada elemento del array
            for(int i = 0; i < array.length; i++){

                // Comprobamos si el número actual ya ha sido procesado anteriormente
                // Esto evita que imprimamos varias líneas para el mismo número
                for (int x = 0; x < i ; x++){
                    if (array[i] == array[x]){
                        aparecido = true; // El número ya salió antes en el array
                    }
                }
                // Si es la primera vez que encontramos este número en el recorrido...
                if (!aparecido){
                    // Segundo bucle: contamos cuántas veces aparece el número en todo el array
                    for(int j = 0; j < array.length; j++){

                        if (array[i] == array[j]){
                            contador++;
                        }
                    }
                    // Imprimimos el número seguido de su representación en asteriscos
                    System.out.print(array[i]+":");
                    while (referencia < contador) {
                        System.out.print("*");
                        referencia++;
                    }
                    System.out.println();
                }

                // Reiniciamos las variables de control para la siguiente iteración del bucle principal
                aparecido = false;
                contador = 0;
                referencia = 0;
            }
        }
    }
}
