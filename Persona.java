
import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private LocalDate fechanacimiento;
    private String direccion;

    //constructor 
    public Persona(String nombre, LocalDate fechanacimiento, String direccion) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
    }

    //direccion nueva 
    public void actualizarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    //metodos
    public int obtenerEdad() {
        LocalDate fechaActual = LocalDate.now();
        if (this.fechanacimiento == null) {
            return 0;
        }
        return Period.between(this.fechanacimiento, fechaActual).getYears();
    }

    public boolean esAdultomayor() {
        return obtenerEdad() >= 60;
    }

    //getters y setters 
    //nombre
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    //fecha de nacimiento
    public LocalDate getfechanacimiento() {
        return fechanacimiento;
    }

    public void setfechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    //direccion
    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    /////////////////////////////////////////////////
    //escribir los datos de la persona
    @Override
    public String toString() {
        return "persona " + nombre + " edad " + obtenerEdad();
    }

}
