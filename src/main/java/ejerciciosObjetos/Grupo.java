package ejerciciosObjetos;

public class Grupo {
    private Alumno[] grupo = new Alumno[MAX_ALUMNO];
    private static final int MAX_ALUMNO = 30;
    private int numAlumnos;
    private String nombre;

    public Grupo(String nombre) {
        this.nombre = nombre;
        numAlumnos = 0;
        grupo = new Alumno[MAX_ALUMNO];
    }

    public String mostrarAlumnos(){
        String alumnos = "";
            for(int i = 0; i < numAlumnos; i++){
                alumnos = grupo[i].toString();
            }

        return alumnos;
    }



}
