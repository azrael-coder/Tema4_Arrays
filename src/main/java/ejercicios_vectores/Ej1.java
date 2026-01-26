package ejercicios_vectores;
import java.util.Scanner;
/**
 * Leer 10 números, almacenarlos en una tabla y mostrar su suma.
 */
public class Ej1 {
   public static void main(String[] args) {
       int [] vector = crearVector(10);
       double suma = calcularSuma(vector);

       System.out.println(suma);


   }

    /**
     * @param vector
     * @return devuelve la suma de los numeros del array
     */
   public static double calcularSuma(int [] vector){
       int suma = 0;
       if (vector != null) {

           for (int valor : vector) { // Aquí sumo los números
               suma += valor;
           }
       }
       return suma;
   }

    /**
     * Metodo que crea un array
     * @param tamanio Tamaño q tendra el vector
     * @return devuelve el vector creado
     */
   public static int [] crearVector(int tamanio){
       Scanner sc = new Scanner(System.in);
       int vector [] = null;

       if (tamanio > 0) {
           vector = new int[tamanio];
           int contador = 1;

           for (int i = 0; i < vector.length; i++) { //Pido los números y van al array

               System.out.println("Ingresa números: " + " numero: " + contador);
               int num = sc.nextInt();
               contador++;
               vector[i] = num;
           }
       }
       return vector;
   }
}
