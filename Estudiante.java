
import java.time.LocalDate;

public class Estudiante extends Persona {

    private String matricula;
    private double promedio;
    private LocalDate fechaingreso;

    public Estudiante(String nombre, String direccion, LocalDate fechanacimiento, String matricula, double promedio, LocalDate fechaingreso) {
        super(nombre, fechanacimiento, direccion);
        this.matricula = matricula;
        this.promedio = promedio;
        this.fechaingreso = fechaingreso;
    }

    //metodos
    public void inscribirmateria(String materia) {
        System.out.println("el estudiante " + getnombre() + " inscribio la materia de " + materia);
    }

    public double calcularbeca() {
        if (this.promedio >= 9.0) {
            return 3000;

        } else if (this.promedio >= 8) {
            return 2000;

        } else {
            return 1000;
        }
    }

    //getters y setters
    public String getmatricula() {
        return matricula;

    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    //promedio
    public double getpromedio() {
        return promedio;

    }

    public void setpromedio(double promedio) {
        this.promedio = promedio;
    }

    //fecha de ingreso
    public LocalDate getfechaingreso() {
        return fechaingreso;
    }

    public void setfechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
}
