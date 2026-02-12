package matrices;

public class Ej1 {
    public static void main(String[] args) {
        int[][] ventas =   {{ 9,0,3,4,6,7,0,4,1,3, 10,0 },
                            { 9,2,3,4,6,1,0,4,1,3,100,0 },
                            { 1,0,3,4,6,7,0,4,1,3, 6,7 },
                            { 1,0,3,4,6,0,0,0,0,0, 6,0 },
                            { 1,0,3,4,6,7,0,4,1,3, 6,0 }};

        //productosVendidos(ventas);
        ventasMensules(ventas);
    }

    /**
     * Cual es producto que más se vende y cual menos a lo largo de todo el año
     * Imprime el mas y menos vendido
     * @param matriz matriz
     */
    public static void productosVendidos(int[][] matriz){
        String[] productos ={"Jamón","Morcilla","Chorizo","Salchichón","Paté"};
        int maxVendido = 0;
        int suma = 0;
        int sumaMinima = 0;
        int productoMax = 0;
        int productoMin = 0;
        for(int x = 0; x < matriz[0].length; x++){
            sumaMinima += matriz[0][x];
        }

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
                if (suma > maxVendido){
                    maxVendido = suma;
                    productoMax = i;
                }
                if (suma < sumaMinima) {
                    sumaMinima = suma;
                    productoMin = i;
                }
                suma = 0;
        }
        System.out.println("Producto mas vendido: "+productos[productoMax]);
        System.out.println("Producto menos vendido: "+productos[productoMin]);
    }

    public static void ventasMensules(int[][] matriz){
        int maxVendido = 0;
        int suma = 0;
        int sumaMinima = 0;
        int mesMax = 0;
        int mesMin = 0;

        for(int i = 0; i < matriz.length; i++){
            sumaMinima += matriz[i][0];
        }

        for(int fil = 0; fil < matriz[0].length; fil++){
            for(int col = 0; col < matriz.length; col++){
                suma += matriz[col][fil];
            }
            if (suma > maxVendido){
                maxVendido = suma;
                mesMax = fil +1;
            }
            if (suma < sumaMinima){
                sumaMinima = suma;
                mesMin = fil + 1;
            }
            suma = 0;
        }
        System.out.println("Mes con ventas maximas: "+mesMax );
        System.out.println("Menos con ventas minimas: "+mesMin );
    }

}
