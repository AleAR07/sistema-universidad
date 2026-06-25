
import java.time.LocalDate;

public class Pas extends Trabajador {

    private String area;
    private int nivel;
    private String turno;

    public Pas(String nombre, String direccion, LocalDate fechanacimiento, LocalDate fechaingreso, double salario, String puesto, Cuentacorriente cuenta, String area, int nivel, String turno){
        super(nombre, direccion, fechanacimiento, fechaingreso, salario, puesto, cuenta);
        this.area = area;
        this.nivel = nivel;
        this.turno = turno;
    }
    //metodos
    public void administrarrecursos() {
        System.out.println("El PAS " + getnombre() + "esta administrando los recursos del area " + area);
    }

    public void generarreporte() {
        System.out.println("generando reporte de personal en el turno " + turno + " nivel de acceso " + nivel);

    }

    //getters y setters
    //area
    public String getarea() {
        return area;
    }

    public void setarea(String area) {
        this.area = area;
    }

    //nivel
    public int getnivel() {
        return nivel;
    }

    public void setnivel(int nivel) {
        this.nivel = nivel;
    }

    //turno
    public String getturno() {
        return turno;

    }

    public void setturno(String turno) {
        this.turno = turno;
    }

}
