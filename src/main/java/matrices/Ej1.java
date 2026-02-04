package matrices;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][4];

        llenarTabla(matriz);

        //int suma = sumaTotal(matriz);
        //double media = calcularMedia(matriz);
        //tring buscarNum = buscarNum(4, matriz);
        int[][] invert=transponer(matriz);

        System.out.println(Arrays.deepToString(invert));
    }

    /**
     *EJ1: Llena cada posición de la tabla con un número aleatorio entre 1 y 100
     */
    public static void llenarTabla(int[][] matriz){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero inicial: ");
        int numInicial = sc.nextInt();

        System.out.println("Ingrese el numero final: ");
        int numFinal = sc.nextInt();


        if (matriz != null) {
            for (int fil = 0; fil < matriz.length; fil++) {
                for (int col = 0; col < matriz[fil].length; col++) {
                    matriz[fil][col] = r.nextInt(numInicial, numFinal) + 1;
                }
            }
        }
        String resultado = Arrays.deepToString(matriz);
        System.out.println(resultado);
    }

    /**
     * EJ2:     Calcula y devuelve la suma de todos los elementos de la tabla
     * @param matriz
     * @return suma
     */
    public static int sumaTotal(int[][] matriz){
        int suma = 0;

        if (matriz != null) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    suma += matriz[i][j];
                }
            }
        }

        return suma;
    }

    /**
     * EJ 3: Calcula y devuelve la media de todos los elementos de la tabla
     * @param matriz de enteros
     * @return media
     */
    public static double calcularMedia(int[][] matriz){
        double media = 0;
        int suma = 0;
        int totalElementos = 0;
        if (matriz != null) {
            for (int i = 0; i < matriz .length; i++) {
                for (int j = 0; j < matriz[i].length; j++){

                    suma +=matriz[i][j];
                    totalElementos++;
                }
            }
            media = suma/totalElementos;
        }
        return media;
    }

    /**
     * EJ5: Recibe un número entero como parámetro y busca dicho número
     * en la tabla. Si lo encuentra, devuelve un String con la fila y columna donde se
     * encuentra. Si no lo encuentra, muestra un mensaje indicando que el número no
     * está en la tabla. Si hay más de una ocurrencia, DEVUELVE DONDE ESTA CADA UNA
     * @param num
     * @param matriz
     * @return
     */
    public static String buscarNum (int num, int[][] matriz){
        String resultado = "";
        int posIndice1 = 0;
        int posIndice2 = 0;
        boolean encontrado = false;
        if(matriz != null){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++){
                    if (matriz[i][j] == num){
                        posIndice1 = i;
                        posIndice2 = j;
                        resultado += "Posicion de: " + num + " --> " + posIndice1 + " , "+ posIndice2+"\n";
                        encontrado = true;
                    }
                }
            }
            if (!encontrado){
                resultado = "El numero " + num +" no esta en la tabla";
            }
        }

        return resultado;
    }

    /**
     * EJ9: Intercambia las filas y columnas de la tabla (transposición). Si la
     * tabla no es cuadrada (el número de filas no es igual al número de columnas), el
     * tamaño de la tabla resultante será invertido: el número de filas se convertirá en el
     * número de columnas y viceversa
     * @param matriz
     * @return invert
     */
    public static int [][] transponer(int [][] matriz){ //REVISAR
        int[][] invert = new int[matriz[0].length][matriz.length];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    invert[j][i] = matriz[i][j];
                }
            }

        return invert;
    }
}
