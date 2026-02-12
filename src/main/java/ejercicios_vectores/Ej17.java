package ejercicios_vectores;

public class Ej17 {
    public static void main(String[] args) {
        char[] desorden = {'a','s','d','j','k','a','a','s','s','d','d','a','k','k','k','d','j','j','a','s'};

        System.out.println(ordenChar(desorden));
    }

    /**
     * Rellenar una tabla con 20 caracteres, ordenar la tabla y mostrar el resultado
     * @param array array
     * @return orden
     */
    public static char[] ordenChar(char[] array) {
        char aux;
            for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length - 1 - i; j++) {

                        if (array[j] > array[j + 1]) {
                            aux = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = aux;

                        }
                    }

            }
        return array;
    }
}
