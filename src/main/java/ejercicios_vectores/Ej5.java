package ejercicios_vectores;
/**
 * Leer 20 número, y calcular el porcentaje de valores que supera el valor de la media
 */
public class Ej5 {
    public static void main(String[] args) {
        String vector = calcularPorcentaje();
        System.out.println(vector);
    }


    /**
     * Metodo que llama a almacenarNum > crea un array con numeros aleatorios en el rango segun parametros
     * @return El porcentaje de numeros que supera la media
     */
    public static String calcularPorcentaje(){
        int[] vector = Ej4.almacenarNum(20,1,20);
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

        double porcentaje = ((double) contador / vector.length) * 100;

        return "El porcentaje que supera la media es: "+porcentaje;
    }
}
