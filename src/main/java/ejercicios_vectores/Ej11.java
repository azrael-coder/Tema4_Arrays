package ejercicios_vectores;

import java.util.Arrays;

public class Ej11 {
    public static void main(String[] args) {
        String[] elementos = {"a","b","c","d","e","f","g","h","9",null};

        String[] vector = insertar(elementos);
        System.out.println(Arrays.toString(vector));
    }

    public static String[] insertar (String[] array){
        String insertado = "XD";
            for (int i = array.length - 1; i < array.length; i++) {
                array[i] = insertado;
            }
        return array;
    }
}
