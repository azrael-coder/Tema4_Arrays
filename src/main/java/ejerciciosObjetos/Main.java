package ejerciciosObjetos;
import general.Animacion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int opcion;
        Grupo g1 = new Grupo("1º DAM");
        Alumno a1 = new Alumno("040567M", "fulano", 7.5);
        Alumno a5 = new Alumno("012345M", "linus", 9);
        Alumno a2 = new Alumno("080923K", "pepe", 8.5);
        Alumno a3 = new Alumno("071216L", "leo", 6.5);
        Alumno a4 = new Alumno("071216L", "jodido", 5.5);
        do {

            System.out.println("(1)Dar de alta un alumno" +
                    "\n(2)Dar de baja un alumno" + "\n" + "(3)Mostrar Alumnos"+ "\n"+
                    "(4)Calcular nota media de grupo"+ "\n"+"(5)Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:{
                    if(g1.darAlta(a5) && g1.darAlta(a1)){
                        System.out.println("Alta exitosa" +"\n"+"------------");
                    }
                    else{
                        System.out.println("Alta fallida" +"\n"+"------------");
                    }
                    break;
                }

                case 2: {
                    if(g1.darBaja(a1,"040567M")){
                        System.out.println("Baja exitosa" +"\n"+"------------");
                    }else{
                        System.out.println("Baja fallida" +"\n"+"------------");
                    }
                    break;
                }

                case 3: {
                    System.out.println(g1.mostrarAlumnos());
                    Thread.sleep(3000);
                    break;
                }

                case 4:{
                    System.out.println("Nota media del grupo: "+ g1.mediaAlumnos()+"\n"+" ------------");
                    break;
                }
                case 5: {
                    Animacion.animacion();
                    break;
                }
                default:{
                    System.out.println("Opcion invalida"+"\n"+" ------------");
                }
            }
        } while(opcion != 5);
    }


}
