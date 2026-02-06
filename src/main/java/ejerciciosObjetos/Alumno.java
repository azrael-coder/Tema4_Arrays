package ejerciciosObjetos;

public class Alumno {
    private String dni;
    private String nombre;
    private double nota;


    public Alumno(String dni, String nombre, double nota){
        this.dni = dni;
        this.nombre = nombre;
        if (nota >= 0) {
            this.nota = nota;
        }
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
