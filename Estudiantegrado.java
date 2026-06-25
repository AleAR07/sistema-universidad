
import java.time.LocalDate;

public class Estudiantegrado extends Estudiante {

    private String titulacion;
    private int creditos;
    private boolean serviciosocial;

    public Estudiantegrado(String nombre, LocalDate fechanacimiento, String direccion, String matricula, double promedio, LocalDate fechaingreso, Cuentaahorro cuenta, String titulacion, int creditos, boolean serviciosocial) {
        super(nombre, fechanacimiento, direccion, matricula, promedio, fechaingreso, cuenta);
        this.titulacion = titulacion;
        this.creditos = creditos;
        this.serviciosocial = serviciosocial;
    }

    public void realizarproyecto() {
        System.out.println("el estudiante " + getnombre() + " esta desarrollando su proyecto de titulacion en la modalidad " + titulacion);
    }

    public void solicitartitulacion() {
        if ((creditos >= 300) && (serviciosocial)) {
            System.out.println("felicidades " + getnombre() + " ahora puedes iniciar tu tramite de titulacion ");

        } else {
            System.out.println("no es posible iniciar el proceso de titulacion debido a :");
            System.out.println(" SERVICIO SOCIAL " + (serviciosocial ? "completado " : "Falta cumplir"));
            System.out.println("CREDITOS " + creditos + "/300 " + (creditos >= 300 ? "(bien)" : "FALTAN CREDITOS)"));

        }
    }

    //getters y setters
    public String gettitulacion() {
        return titulacion;
    }

    public void settitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    //creditos
    public int getcreditos() {
        return creditos;

    }

    public void setcreditos(int creditos) {
        this.creditos = creditos;
    }

    //servicio social
    public boolean getserviciosocial() {
        return serviciosocial;

    }

    public void setserciciosocial(boolean serviciosocial) {
        this.serviciosocial = serviciosocial;
    }
}
