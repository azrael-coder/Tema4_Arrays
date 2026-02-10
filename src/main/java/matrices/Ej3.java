package matrices;

public class Ej3 {
    /**
     * Rellena una matriz de valore booleanos segun un numero aleatorio entre 0 y 1
     * @param imagen imagen
     * @return una matriz de valores booleanos
     */
    public static boolean[][] rellenar(boolean[][] imagen) {

        double valor;
        for (int i = 0; i < imagen.length; i++) {
            for (int j = 0; j < imagen[i].length; j++){
                valor = Math.random();

                if (valor < 0.5){
                    imagen[i][j] = false;
                }else{
                    imagen[i][j] = true;
                }
            }
        }
        return imagen;
    }

    /**
     *
     * @param imagen imagen
     * @return la imagen de valores booleanos a caracteres
     */
    public static String imagenTexto(boolean[][] imagen) {
        String resultado = "";
        if (imagen != null) {
            for (int i = 0; i < imagen.length; i++) {
                for (int j = 0; j < imagen[i].length; j++) {

                    if (imagen[i][j])
                        resultado += " ";

                    else resultado += "X";
                }
                resultado += "\n";
            }
        }
        return resultado;
    }

    /**
     * Cuenta cuantos valores tiene en comun ambas matrices en todas sus posiciones
     * @param img img1
     * @param img2 img2
     * @return los "pixeles" en comun de ambas imagenes
     */
    public static int pixelesComun(boolean[][] img, boolean[][] img2) {
        int resultado = 0;
        if (img != null && img2 != null && img.length == img2.length ) { //Validar Filas

            for (int i = 0; i < img.length; i++) {
                boolean columIguales = false;
                if (img[i].length == img2[i].length){
                    columIguales = true;
                }

                if (columIguales) {
                    for (i = 0; i < img.length; i++) {

                        for (int j = 0; j < img[i].length; j++) {
                            if (img[i][j] == img2[i][j]) {
                                resultado++;
                            }
                        }
                    }
                }
            }
        }
        return resultado;
    }


    public static boolean[][] interseccion(boolean[][] imagen, boolean[][] imagen2) {
        boolean[][] resultado = new boolean[imagen.length][imagen[0].length];
        if (imagen != null && imagen2 != null && imagen.length == imagen2.length) {

            for (int i = 0; i < imagen.length; i++ ) {

                for (int j = 0; j < imagen[i].length; j++) {

                    if (imagen[i][j] | imagen2[i][j])
                        resultado[i][j] = true;

                    else
                        resultado[i][j] = false;
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        boolean[][] imagen = new boolean[10][15];
        boolean[][] imagen2 = new boolean[10][15];
        rellenar(imagen);
        rellenar(imagen2);
        //System.out.println(Arrays.deepToString(rellenar(imagen)));

        //System.out.println(imagenTexto(rellenar(imagen)));

        System.out.println(pixelesComun(imagen, imagen2));
    }

}
