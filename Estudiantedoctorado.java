
import java.time.LocalDate;

public class Estudiantedoctorado extends Estudiante {

    private String programa;
    private String tematesis;
    private String directortesis;

    public Estudiantedoctorado(String nombre, LocalDate fechanacimiento, String direccion, String matricula, double promedio, LocalDate fechaingreso, String programa, String tematesis, String directortesis) {
        super(nombre, direccion, fechanacimiento, matricula, promedio, fechaingreso);
        this.programa = programa;
        this.tematesis = tematesis;
        this.directortesis = directortesis;
    }

    //metodos
    public void realizartesis() {
        System.out.println("el estudiante " + getnombre() + "continua trabajando en su investigacion  " + tematesis + " bajo la direccion " + directortesis);

    }

    public void publicararticulo() {
        System.out.println("Articulo publicado, el estudiante del programa " + programa + " ha publicado un articulo de su tesis " + tematesis);

    }

    //getters y setters
    public String getprograma() {
        return programa;
    }

    public void setprograma(String programa) {
        this.programa = programa;

    }

    public String gettematesis() {
        return tematesis;
    }

    public void settematesis(String tematesis) {
        this.tematesis = tematesis;
    }

    public String getdirectortesis() {
        return directortesis;
    }

    public void setdirectortesis(String directortesis) {
        this.directortesis = directortesis;
    }

}
