
public class Departamento {

    private String nombre;
    private String codigo;
    private String ubicacion;
    //arreglo de profesores 
    private PDI[] profesores;
    private int contadorprofesores;

    public Departamento(String nombre, String codigo, String ubicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.profesores = new PDI[20];
        this.contadorprofesores = 0;
    }

    //metodos 
    public void asignarprofesor(PDI profesor) {
        if (contadorprofesores < profesores.length) {
            profesores[contadorprofesores] = profesor;
            contadorprofesores++;
            System.out.println("profesor " + profesor.getnombre() + "asignado al departamento de " + this.nombre);

        } else {
            System.out.println("no se puede asignar al profesor ");
        }

    }

    public void listapersonal() {
        System.out.println("personal del departamento " + nombre);
        if (contadorprofesores == 0) {
            System.out.println("no hay profesores asignados ");
        } else {
            for (int i = 0; i < contadorprofesores; i++) {
                System.out.println("- " + profesores[i].toString());
            }
        }
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public PDI[] getProfesores() {
        return profesores;
    }

    public void setProfesores(PDI[] profesores) {
        this.profesores = profesores;
    }

    public int getContadorprofesores() {
        return contadorprofesores;
    }

    public void setContadorprofesores(int contadorprofesores) {
        this.contadorprofesores = contadorprofesores;
    }

}
