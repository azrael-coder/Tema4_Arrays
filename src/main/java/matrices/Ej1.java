package matrices;
import java.util.Random;
import java.util.Arrays;
public class Ej1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][4];

        llenarTabla(matriz);
    }

    /**
     *EJ1: Llena cada posición de la tabla con un número aleatorio entre 1 y
     * 100.
     */
    public static void llenarTabla(int[][] tabla){
        Random r = new Random();

        for (int fil = 0; fil < tabla.length; fil++){
            for (int col = 0; col < tabla[fil].length; col ++){
                tabla[fil][col] = r.nextInt(1,100)+1;
            }
        }
        String resultado = Arrays.deepToString(tabla);
        System.out.println(resultado);
    }

}
