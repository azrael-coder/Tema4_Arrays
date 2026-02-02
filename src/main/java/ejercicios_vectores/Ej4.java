package ejercicios_vectores;
/**
 * Almacenar en una tabla de 100 elementos números aleatorios entre 1 y 500. mostrar el
 * máximo, el mínimo y la media. Realizar otra versión donde no puedan almacenarse
 * números repetidos.
 */
import java.util.Random;
import java.util.Arrays;
public class Ej4 {
    public static void main(String[] args) {
        int[] vector = almacenarNum(10,1,100);
        System.out.println(Arrays.toString(vector));

        //maXyMin(vector);

       // double media = calcularMedia(vector);
        //System.out.println("Media: " + media);
    }

    /**
     * BUCLE PARA CREAR NUMS ENTEROS ALEATORIOS segun los parametros
     * @return Devuelve un vector con todos los valores del array y sin numeros repetidos
     * @param inicio
     * @param fin
     * @param tamanioVector
     */
    public static int [] almacenarNum(int tamanioVector,int inicio, int fin){
        Random random = new Random();
        int vectorRand[] = new int[0];
        if (tamanioVector > 0 && inicio > 0  && fin > 0) {
            vectorRand = new int[tamanioVector];

            for (int i = 0; i < tamanioVector; i++) {
                int valor;
                boolean repetido;

                do {
                    valor = random.nextInt(inicio, fin) + 1;
                    repetido = false;

                    for (int j = 0; j < i; j++) {
                        if (vectorRand[j] == valor) {
                            repetido = true;
                        }
                    }
                } while (repetido);
                vectorRand[i] = valor;
            }

        }
        return vectorRand;
    }

    /**
     * @param vector
     * Imprime una cadena con los valores maximos y minimos del array
     */
    public static void maXyMin(int[] vector){
        int max = vector[0];
        int min = vector[0];

        if (vector != null) {
            for (int valor : vector) {
                if (valor > max) {
                    max = valor;
                }

                if (valor < min) {
                    min = valor;
                }
            }
        }
        System.out.println("Max: " + max+ "\n" + "Min: " + min);
    }

    public static double calcularMedia(int [] vector){
        double media = 0;
        int suma = 0;

        if (vector != null) {
            for (int valor : vector) {
                suma += valor;
            }

            media = suma / vector.length;
        }
        return media;
    }
}
