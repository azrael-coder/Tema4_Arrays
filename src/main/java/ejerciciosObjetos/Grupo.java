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


    private boolean validarDni (Alumno alumno) {
        boolean valido = true;
            if (alumno != null) {

                for (int i = 0; i < numAlumnos && valido; i++) {
                    if (alumno.getDni().equalsIgnoreCase(grupo[i].getDni())) {
                        valido = false;
                    }
                }
            }
        return valido;
    }

    public boolean darAlta(Alumno alumno) {
        boolean exito = false;

        return exito;
    }

    public String mostrarAlumnos(){
        String alumnos = "";
            for(int i = 0; i < numAlumnos; i++){
                alumnos = grupo[i].toString() + "\n";
            }
        return alumnos;
    }



}
