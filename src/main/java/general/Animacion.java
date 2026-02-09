package general;

public class Animacion {
    public static void animacion() throws InterruptedException {
        char [] ruedita = {'|', '/', '-', '\\' };

        for (int i = 0; i < 25; i++){
            System.out.print("\rCerrando " + ruedita[i % ruedita.length]);
            Thread.sleep(250);
        }
        System.out.println("\rFinalizado  \n");
    }
}
