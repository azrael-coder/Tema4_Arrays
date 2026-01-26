package ejercicios_vectores;
/**
 * Leer 10 números, almacenarlos en una tabla y mostrarlos en orden inverso
 */
public class Ej2 {
    public static void main(String[] args) {
        int [] vector = {10,9,8,7,6,5,4,3,2,1};

        String reves = invertirArray(vector);
        System.out.println(reves);

    }


    /**
     *
     * @param vector a dar la vuelta
     * @return el vector invertido y en tipo String para imprimir
     */
    public static String invertirArray(int [] vector) {
        int [] vectorInvertido = new int [10];
        int indiceAuxiliar = 0;
        String resultado = "";

        if (vector != null) {

            for (int i = vector.length-1; i >= 0; i--) { //Bucle para invertir el vector
                vectorInvertido[indiceAuxiliar] = vector[i];
                indiceAuxiliar++;
            }

            for (int i = 0; i < vectorInvertido.length; i++) { // Bucle para pasarle valores al resultado
                resultado += vectorInvertido[i] + " ";
            }
        }
        return resultado;
    }
}
