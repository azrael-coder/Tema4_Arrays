package ejercicios_vectores;

public class Ej6 {
    public static void main(String[] args) {
        int[] vector = Ej4.almecenarNum(10,1,50);


    }

    public static int contarApariciones(int num, int[] vector){
        int contador = 0;

        for(int i=0; i<vector.length; i++){
            if(vector[i] == num){
                contador++;
            }
        }

        return contador;
    }
}
