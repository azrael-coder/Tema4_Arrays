package ejercicios_vectores;

public class Ej9 {
    public static void main(String[] args) {
        int[] tabla = {1,2,3,4,6,7,9,10};

        boolean ordenado = ordenada(tabla);
        System.out.println(ordenado);
    }

    /**
     * Leer 10 números, almacenarlos en una tabla e indicar si la tabla está ordenada
     * @param array
     * @return
     */
    public static boolean ordenada(int[] array){
        boolean ordenado = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[i]){
                        ordenado = false;
                    }
                }
            }
            return ordenado;
    }

}
