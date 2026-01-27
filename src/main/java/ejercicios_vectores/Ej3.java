package ejercicios_vectores;
/**
 * Leer 10 números , almacenarlos en una tabla y mostrar primero las posiciones pares y
 * después la impares.
 */
public class Ej3 {
    public static void main(String[] args) {

        int[] array = Ej1.crearVector(6);
        mostrarPosicion(array);
    }


    public static void mostrarPosicion(int[] vector) {
        if (vector != null) {
            System.out.println("PARES: ");
            for (int valor : vector) {
                if (valor % 2 == 0) {
                    System.out.print(valor + " ");
                }
            }
            System.out.println();

            System.out.println("IMPARES: ");
            for (int valor : vector) {
                if (valor % 2 != 0) {
                    System.out.print(valor + " ");
                }
            }
        }
    }
}
