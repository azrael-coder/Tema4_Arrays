package matrices;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        llenarTabla(matriz);

        //int suma = sumaTotal(matriz);
        //double media = calcularMedia(matriz);
        //tring buscarNum = buscarNum(4, matriz);
        //int[][] invert=transponer(matriz);
        //int[] columnaExtraida = extrearColumna(4,matriz);
        //int[] filaExtraida = extraerFila(1, matriz);
        //int[][] copia = duplicarMatriz(matriz);
        int[][] subMatriz = crearSubtabla(matriz,1,1,3,3);
        System.out.println(Arrays.deepToString(subMatriz));
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
     * EJ2: Calcula y devuelve la suma de todos los elementos de la tabla
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

    /**
     * EJ10: Recibe el índice de una columna y devuelve un arreglo
     * unidimensional con los elementos de esa columna. Si la columna no existe,
     * muestra un mensaje de error
     */
    public static int [] extrearColumna(int columna, int[][] matriz){
        int[] col = new int[matriz.length];
        if (columna > 0 && columna < matriz[0].length && matriz != null) {

            for (int i = 0; i < matriz.length; i++) {
                col[i]= matriz[i][columna];
            }
        }else{
            System.out.println("ERROR: Columna no encontrada");
        }
        return col;
    }

    /**
     * EJ11:Recibe el índice de una fila y devuelve un arreglo unidimensional
     * con los elementos de esa fila. Si la fila no existe, muestra un mensaje de error
     * @param fila
     * @param matriz
     * @return fil
     */
    public static int[] extraerFila(int fila, int[][] matriz){
        int[] fil = new int[matriz[0].length];

        if (fila > 0 && fila < matriz.length && matriz != null) {
            for (int j = 0; j < matriz[0].length; j++ ) {
                fil[j] = matriz[fila][j];
            }
        }else{
            System.out.println("ERROR: Fila no encontrada");
        }
        return fil;
    }

    /**
     * Crea y devuelve una nueva tabla que es una copia exacta de la
     * tabla original
     * @param matriz
     * @return
     */
    public static int[][] duplicarMatriz(int[][] matriz){
        int[][] copia = new int[matriz.length][matriz[0].length];
            if (matriz != null) {
                for (int i= 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++){
                        copia[i][j] = matriz[i][j];
                    }
                }
            }
        return copia;
    }



    /**
     * EJ13: Recibe las posiciones de inicio de fila y columna y el tamaño de la
     * subtabla que se desea extraer. Devuelve una nueva tabla con los elementos de la
     * subtabla indicada.
     * @param matriz
     * @param filInicio
     * @param colInicio
     * @param filas
     * @param columnas
     * @return submatriz
     */
    public static int[][] crearSubtabla(int[][] matriz, int filInicio, int colInicio, int filas, int columnas){
        int[][] submatriz = new int[filas][columnas];
        int subIndiceFil = 0;
        int subIndiceCol = 0;
        for (int i = filInicio; i < filas; i++){
            for (int j = colInicio; j < columnas; j++){
                submatriz[subIndiceFil][subIndiceCol] = matriz[i][j];
                subIndiceCol++;
            }
            subIndiceFil++;
        }
        return submatriz;
    }
}
