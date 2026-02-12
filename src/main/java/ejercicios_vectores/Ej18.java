package ejercicios_vectores;

public class Ej18 {
    public static void main(String[] args) {
        char[] desorden = {'a','s','d','j','k','a','a','s','s','d','d','a','k','k','k','d','j','j','a','s'};

        char[] noRepetidos = sacarRepetidos(desorden);
        System.out.println(noRepetidos);
        System.out.println(noRepetidos.length);
    }

    /**
     *  Hacer el mismo ejercicio pero almacenado en la tabla sólo las letras no repetidas, ordenado la
     * tabla y mostrando el resultado. Antes de introducir una letra en la tabla debemos mirar sin no ha
     * sido previamente almacenada. Sólo tenemos que ordenar y mostrar la parte de la tabla que se ha
     * rellenado. Diseñar el algoritmo de tal forma la tabla ordenado tenga el tamaño exacto del número de
     * letras no repetidas
     * Ejemplo:
     * Introducir 20 caracteres:
     * asdjkaassddakkkdjjas
     * Tabla ordenada:
     * adjks
     * @param array array
     * @return unicos
     */
    public static char[] sacarRepetidos(char[] array){
        char[] unicos = new char[array.length];
        boolean aparecido = false;
        int contador = 0;
            for (int i = 0; i < array.length; i++){
                aparecido = false;

                // Sacar elementos únicos
                for (int j = 0; j < i && !aparecido; j++){
                    if (array[i] == array[j]){
                        aparecido = true;
                    }
                }
                if(!aparecido){
                    unicos[contador] = array[i];
                    contador ++;
                }
            }

        // Crear array del tamaño exacto con solo los elementos únicos
        char[] unicosSinNulos = new char[contador];
            for (int i = 0; i < contador; i++){
                unicosSinNulos[i] = unicos[i];
            }

            // Ordenar el array sin nulos
        return Ej17.ordenChar(unicosSinNulos);
    }
}
