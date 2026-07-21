
public class Departamento {

    private String nombre;
    private String codigo;
    private String ubicacion;
    //arreglo de profesores 
    private ArrayList<PDI> profesores;
    private int contadorprofesores;

    public Departamento(String nombre, String codigo, String ubicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.profesores=new ArrayList<>();
        this.contadorprofesores = 0;
    }

    //metodos 
    public void asignarprofesor(PDI profesor) {
       profesores.agregarElemento(profesor);
        System.out.println("nuevo profesor "+profesor.getnombre()+"agregado a "+nombre);
    }

    public void listapersonal() {
        System.out.println("personal del departamento " + nombre);
        for(int i=0;i<this.profesores.numElementos();i++){
            System.out.println(this.profesores.consultar(i).toString());
        }
    }

    //implementacion de busqueda de profesores de forma recursiva 
    public int buscarproferecursivo(PDI profesor, int indice) {
        if (indice >= contadorprofesores) {
            return -1;
            //no hubo 
        }
        if (this.profesores.consultar(indice).equals(profesor)) {
            return indice;
        }
        return buscarproferecursivo(profesor, indice + 1);
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", codigo=" + codigo + ", ubicacion=" + ubicacion + '}';
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

   public ArrayList<PDI> getprofesores(){
    return profesores;
   }
   public void setprofesores(ArrayList<PDI> profesores){
    this.profesores= profesores;
   }

    public int getContadorprofesores() {
        return contadorprofesores;
    }

    public void setContadorprofesores(int contadorprofesores) {
        this.contadorprofesores = contadorprofesores;
    }

}
