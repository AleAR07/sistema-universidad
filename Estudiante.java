
import java.time.LocalDate;

public class Estudiante extends Persona implements Comparable<Estudiante> {

    private String matricula;
    private double promedio;
    private LocalDate fechaingreso;
    private Cuentaahorro cuenta;

    public Estudiante(String nombre, LocalDate fechanacimiento, String direccion, String matricula, double promedio, LocalDate fechaingreso, Cuentaahorro cuenta) {
        super(nombre, fechanacimiento, direccion);
        this.matricula = matricula;
        this.promedio = promedio;
        this.fechaingreso = fechaingreso;
        this.cuenta = null;
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

    public Cuentaahorro getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentaahorro cuenta) {
        this.cuenta = cuenta;
    }
    @Override
   public int compareTo(Estudiante otro) {
       return this.matricula.compareTo(otro.matricula);
   }
   @Override
   public boolean equals(Object obj){
     if (obj == null){
     return false;
     }
     if (!(obj instanceof Estudiante)){
     return false;
     }
     Estudiante otro = (Estudiante) obj;
     return this.matricula.equals(otro.matricula);
    }

    @Override
    public String toString() {
        return super.toString() + " | Matrícula: " + matricula + " | Promedio: " + promedio + " | Fecha de Ingreso: " + fechaingreso + " | Beca: $" + calcularbeca() + " | Cuenta: " + (cuenta != null ? cuenta.obtenerNumero() : "Ninguna");
    }
}
