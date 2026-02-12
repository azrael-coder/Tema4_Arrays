package ejercicios_vectores;

import java.util.Arrays;

public class Ej20 {
    public static void main(String[] args) {
        int[] Tmogollon = {8,9,9,2,8,5,10,12,5,5,8,9};
        int[] Tdistintos = new int [Tmogollon.length];

        Tdistintos =organizarArray(Tmogollon, Tdistintos);

        System.out.println(Arrays.toString(Tdistintos));


    }


    public static int[] organizarArray(int[] array, int[] arrayFinal){
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            boolean aparecido = false;

            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    aparecido = true;
                }
            }
            if (!aparecido){
                arrayFinal[indice] = array[i];
                indice++;
            }
        }


        int aux;
        for (int i = 0; i < arrayFinal.length; i++) {
            for (int j = 0; j < arrayFinal.length -1 -i ; j++) {

                if (arrayFinal[j] > arrayFinal[j + 1]) {
                    aux = arrayFinal[j];
                    arrayFinal[j] = arrayFinal[j + 1];
                    arrayFinal[j + 1] = aux;
                }
            }

            int aux2;
            for (int x = 0; x < arrayFinal.length; x++) {
                for (int j = 0; j < arrayFinal.length -1 -x; j++) {
                    if (arrayFinal[j] == 0 ){
                        aux2 = arrayFinal[j];
                        arrayFinal[j] = arrayFinal[j+1];
                        arrayFinal[j+1] = aux2;
                    }
                }
            }
        }
        return arrayFinal;
    }

}
