
import java.time.LocalDate;
import java.time.Period;

public class Trabajador extends Persona {

    private LocalDate fechaingreso;
    private double salario;
    private String puesto;
    private Cuentacorriente cuenta;

    public Trabajador(String nombre, String direccion, LocalDate fechanacimiento, LocalDate fechaingreso, double salario, String puesto, Cuentacorriente cuenta) {
        super(nombre, fechanacimiento, direccion);
        this.salario = salario;
        this.puesto = puesto;
        this.fechaingreso = fechaingreso;
        this.cuenta=null;

    }

    //metodos 
    public int calcularAntiguedad() {
        return Period.between(this.fechaingreso, LocalDate.now()).getYears();

    }

    public void solicitarVacaciones() {
        System.out.println("el trabajador " + getnombre() + " solicita vacaciones en el puesto " + puesto);

    }

    //getters y setters
    //fecha de ingreso
    public LocalDate getfechaingreso() {
        return fechaingreso;
    }

    public void setfechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    //salario
    public double getsalario() {
        return salario;

    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    //puesto
    public String getpuesto() {
        return puesto;

    }

    public void setpuesto(String puesto) {
        this.puesto = puesto;
    }

    public Cuentacorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentacorriente cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return super.toString() + " | Puesto: " + puesto + " | Antigüedad: " + calcularAntiguedad() + " años | Cuenta: " + (cuenta != null ? cuenta.obtenerNumero() : "Ninguna");
    }
}
