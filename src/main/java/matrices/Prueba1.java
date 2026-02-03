package matrices;
import java.util.Arrays;
public class Prueba1 {
    public static void main(String[] args) {
        int matriz [][] = {{1,2,3,4,5},
                           {6,7,8,9,10}
        };
        int suma = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
        }
        System.out.println(suma);
    }
}
