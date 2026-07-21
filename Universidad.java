
public class Universidad {

    private String nombre;
    private String ciudad;
    private int fundacion;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Departamento> departamentos;

   

    private int contadorestudiantes;
    private int contadortrabajadores;
    private int contadordepartamentos;

    public Universidad(String nombre, String ciudad, int fundacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;

       this.estudiantes=new ArrayList<>();
       this.trabajadores=new ArrayList<>();
       this.departamentos=new ArrayList<>();
        this.contadorestudiantes = 0;
        this.contadortrabajadores = 0;
        this.contadordepartamentos = 0;
    }

    //metodos
    public void registrarestudiante(Estudiante estudiante) {
        this.estudiantes.agregarElemento(estudiante);
        System.out.println("estudiante agregado "+estudiante.getnombre());
    }

    public void contrarartrabajadores(Trabajador trabajador) {
        this.trabajadores.agregarElemento(trabajador);
        System.out.println("trabajador agregado "+trabajador.getnombre());
    }

    //busqueda de estudiantes recursivos 
    public int buscarestudianteRecursivo(Estudiante estudiante, int indice) {
        if (indice >= contadorestudiantes) {
            return -1;
        }
        if ((this.estudiantes.consultar(indice).equals(estudiante))) {
            return indice;
        }
        return buscarestudianteRecursivo(estudiante, indice + 1);
    }

    //busqueda de trabajadores recursivos
    public int buscartrabRecursivo(Trabajador trabajador, int indice) {
        if (indice >= contadortrabajadores) {
            return -1;
        }
        if (this.trabajadores.consultar(indice).equals(trabajador)) {
            return indice;
        }
        return buscartrabRecursivo(trabajador, indice + 1);
    }

    //busqueda de departamentos recursivos
    public int buscardepRecursivo(Departamento departamento, int indice) {
        if (indice >= contadordepartamentos) {
            return -1;
        }
        if (this.departamentos.consultar(indice).equals(departamento)) {
            return indice;
        }
        return buscardepRecursivo(departamento, indice + 1);
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", fundacion=" + fundacion + '}';
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

   public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }
    public int getContadorestudiantes() {
        return contadorestudiantes;
    }

    public void setContadorestudiantes(int contadorestudiantes) {
        this.contadorestudiantes = contadorestudiantes;
    }

    public int getContadortrabajadores() {
        return contadortrabajadores;
    }

    public void setContadortrabajadores(int contadortrabajadores) {
        this.contadortrabajadores = contadortrabajadores;
    }

    public int getContadordepartamentos() {
        return contadordepartamentos;
    }

    public void setContadordepartamentos(int contadordepartamentos) {
        this.contadordepartamentos = contadordepartamentos;
    }

}
