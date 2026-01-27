package ejercicios_vectores;
/**
 * Leer 20 número, y calcular el porcentaje de valores que supera el valor de la media
 */
public class Ej5 {
    public static void main(String[] args) {
        //int [] vector =
    }



    public static String calcularPorcentaje(){
        int[] vector = Ej4.almecenarNum(20,1,20);
        double media = 0;
        int suma = 0;
        int contador = 0; //Representa la cantidad de numeros que superan la media

        for(int valor : vector){
            suma += valor;
        }
        media = suma / vector.length;

        for (int valor : vector){
            if (valor > media){
                contador++;
            }
        }

        int porcentaje = (contador / 20) * 100;

        return "El porcentaje que supera la media es: "+porcentaje;
    }
}
