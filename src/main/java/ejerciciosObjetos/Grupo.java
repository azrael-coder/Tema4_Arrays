package ejerciciosObjetos;

public class Grupo {
    private static final int MAX_ALUMNO = 30;
    private Alumno[] grupo;
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
        if (alumno != null && validarDni(alumno) && numAlumnos < MAX_ALUMNO) {
            grupo[numAlumnos] = alumno;
            numAlumnos++;
            exito = true;
        }
        return exito;
    }

    public boolean darBaja(Alumno alumno, String dni) {
        boolean exito = false;
        if (alumno != null && !validarDni(alumno) && numAlumnos > 0 && dni != null) {
            for (int i = 0; i <  numAlumnos; i++){
                if (grupo[i].getDni().equalsIgnoreCase(dni)){
                    for (int j = i; j < numAlumnos; j++){
                        grupo[j] = grupo[j+1];
                    }
                    numAlumnos--;
                    exito = true;
                }
            }
        }
        return exito;
    }

    public double mediaAlumnos() {
        double media ;
        int suma = 0;
        for (int i = 0; i < numAlumnos; i++) {
            suma += grupo[i].getNota();
        }
        media = suma/ numAlumnos;
        return media;
    }

    public String mostrarAlumnos(){
        String alumnos = "";
            for(int i = 0; i < numAlumnos; i++){
                alumnos += grupo[i].toString() + "\n";
            }
        return alumnos;
    }



}
