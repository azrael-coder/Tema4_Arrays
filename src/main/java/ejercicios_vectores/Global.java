package ejercicios_vectores;
import java.util.Random;
public class Global {
    public static int[] generarNum(int tamanio, int inicio, int fin){
        Random rand = new Random();
        int[] numeros = new int[tamanio];

        if (tamanio > 0 && inicio > 0 && fin > 0) {

            for (int i = 0; i < tamanio; i++) {
                numeros[i] = rand.nextInt(inicio, fin) + 1;
            }
        }
        return numeros;
    }
}
