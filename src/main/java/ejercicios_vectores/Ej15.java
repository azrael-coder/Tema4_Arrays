package ejercicios_vectores;

public class Ej15 {
    public static void main(String[] args) {
        int[] array = {1, 1, 20, 1, 2, 20, 3, 3, 3,4,4,4,33,3};

        histograma(array);
    }


    public static void histograma(int[] array){
        if (array != null) {
            int contador = 0;
            int referencia = 0;
            for(int i = 0; i < array.length; i++){

                for(int j = 0; j < array.length; j++){

                    if (array[i] == array[j]){
                        contador++;
                    }
                }
                System.out.println(array[i]);
                while (referencia < contador) {
                    System.out.print("*");
                    referencia++;
                }
                System.out.println();
            }

        }
    }
}
