
import java.time.LocalDate;

public class PDI extends Trabajador {

    private String categoria;
    private String especialidad;
    private int horasDocencia;

    public PDI(String nombre, String direccion, LocalDate fechanacimiento, LocalDate fechaingreso, double salario, String puesto, Cuentacorriente cuenta, String categoria, String especialidad, int horasDocencia) {
        super(nombre, direccion, fechanacimiento, fechaingreso, salario, puesto, cuenta);
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.horasDocencia = horasDocencia;
    }

    //metodos
    public void investigar(String tema) {
        System.out.println("el profesor " + getnombre() + " investiga el tema " + tema);
    }

    public void imparticlase() {
        System.out.println("el profesor " + getnombre() + " tiene asignadas " + horasDocencia + " horas asignadas");
    }

    //getters y setters
    //categoria 
    public String getcategotia() {
        return categoria;

    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;

    }

    //especialidad
    public String getespecialidad() {
        return especialidad;
    }

    public void setespecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //horas de docencia
    public int gethorasDocencia() {
        return horasDocencia;

    }

    public void sethorasDocencia(int horasDocencia) {
        this.horasDocencia = horasDocencia;
    }
}
