
public class Doctor {

    private String especialidad;
    private String universidad;
    private int anioobtencion;

    public Doctor(String especialidad, String universiad, int anioobtencion) {
        this.especialidad = especialidad;
        this.universidad = universiad;
        this.anioobtencion = anioobtencion;

    }

    //metodos propios 
    public boolean validartitulo() {
        System.out.println("titulo de doctorado en " + especialidad + " obtenido en la universiad " + universidad);
        return true;
    }

    public void registrartitulo() {
        System.out.println("el titulo fue obtenido en el año " + anioobtencion);
    }

    @Override

    public String toString() {
        return "Doctor{" + "especialidad='" + especialidad + '\'' + ", universidad='" + universidad + '\'' + ", anioobtencion=" + anioobtencion + '}';
    }

    //getter y setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getAnioobtencion() {
        return anioobtencion;
    }

    public void setAnioobtencion(int anioobtencion) {
        this.anioobtencion = anioobtencion;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Doctor)){
            return false;
        }
        Doctor other = (Doctor) obj;
        return especialidad.equals(other.especialidad) && universidad.equals(other.universidad) && anioobtencion == other.anioobtencion;
    }

}
