package ejercicios_vectores;

public class Ej12 {
    public static void main(String[] args) {
        int[] v1 = {4,3,2,1,5};
        int[] v2 = {5,4,2,3,1};

        //System.out.println(iguales(v1,v2));
        System.out.println(incluido(v1,v2));

    }

    /**
     * a)
     * Devuelve verdadero, si ambas tablas tienen el mismo tamaño y todos los
     * elementos de v1 tienen el mismo valor y posición en la tabla v2
     * @param v1
     * @param v2
     * @return
     */
    public static boolean iguales(int[] v1, int[] v2) {
        boolean igual = true;
        boolean encontrado = true;

        if (v1.length == v2.length) {
            for (int i = 0; i < v1.length && encontrado; i++) {
                if (v1[i] != v2[i]) {
                    igual = false;
                    encontrado = false;
                }
            }
        }
        return igual;
    }

    /**
     * b) y c)
     * Devuelve verdadero, si todos los elementos de v1, aparecen en v2, aunque estén en otras posiciones
     * Devuelve verdadero, si todos los elementos de v1 están en v2 y todos los
     * de v2 están en v1
     * @param v1
     * @param v2
     * @return
     */
    public static boolean incluido(int[] v1, int[] v2) {
        boolean resultado = true;
        for (int i = 0; i < v1.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < v2.length && !encontrado; j++){
                if (v1[i] == v2[j]) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                resultado = false;
            }
        }
        return resultado;
    }
}
