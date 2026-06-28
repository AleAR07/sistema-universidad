
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("===========Sistema iniciado=========");
        //instanciar universidad

        Universidad miuniversidad = new Universidad("universidad autonoma", "ciudad de mexico", 1994);
        //estudiantes 
        Estudiante estudiante1 = new Estudiante("Juan Perez", LocalDate.of(2000, 5, 15), "Calle Falsa 123", "A001", 8.5, LocalDate.of(2018, 9, 1), null);
        //crea departamentos 

        Departamento departamentocomputacion = new Departamento("computacion", "num189", "edificio AT");
        // CUENTAS BANCARIAS NUEVAS 
        Cuentacorriente cuentaPas = new Cuentacorriente(5000, "1233666", 0.01);
        Cuentacorriente cuentaPDI = new Cuentacorriente(12000, "22334455", 0.01);
        Cuentaahorro cuentaGrado = new Cuentaahorro(10000, "9898839839", 2000, 0, 5.0);
        Cuentaahorro cuentaDoctorado = new Cuentaahorro(12000, "44889966", 1500, 0, 4.5);

        //trabajador PAS CON CUENTA CORRIENTE
        Pas trabajadorPas = new Pas("Carlos Gomez", "AV. CENTRAL 123", LocalDate.of(2010, 4, 12), LocalDate.of(2020, 3, 8), 16000, "Administrador en sistemas", cuentaPas, "escolares", 2, "matutino");
        PDI profesorpdoPdi = new PDI("ARMANDO LOPEZ", "SANTA MARTA", LocalDate.of(2003, 3, 1), LocalDate.of(2015, 5, 9), 5000, "profesor titular", cuentaPDI, "Titular c", "computacion", 12);

        //instancia doctores 
        Doctor doc1 = new Doctor("inteligencia artificial", "UAM ", 2022);
        Doctor doc2 = new Doctor("Systemas distribuidos", "UNAM", 2018);
        //METODOS DE DOCTOR 
        System.out.println("pruebas de doctor ");
        if (doc1.validartitulo()) {
            doc1.registrartitulo();
        }
        System.out.println(doc1.toString());
        System.out.println(doc2.toString());
        System.out.println();
        //contratar trabajadores

        System.out.println("registrando personal de universidad");
        miuniversidad.contrarartrabajadores(trabajadorPas);
        miuniversidad.contrarartrabajadores(profesorpdoPdi);
        System.out.println();
        //asignar y listar profesor

        System.out.println("gestion de departamentos ");
        departamentocomputacion.asignarprofesor(profesorpdoPdi);
        departamentocomputacion.listapersonal();
        System.out.println();
        //metodos propios de trabajadores 

        System.out.println("metodos de los trabajadores ");
        profesorpdoPdi.investigar("algoritmos genericos");
        profesorpdoPdi.imparticlase();
        trabajadorPas.administrarrecursos();
        trabajadorPas.generarreporte();
        System.out.println("antiguedad del profesor " + profesorpdoPdi.calcularAntiguedad() + "años");
        profesorpdoPdi.solicitarVacaciones();
        System.out.println();
        //estudiantes 

        Estudiantegrado estGrado = new Estudiantegrado("laura", LocalDate.of(2003, 7, 19), "Chimalhuacan", "22353788", 9.2, LocalDate.of(2023, 9, 18), cuentaGrado, "tesis", 310, true);
        //doctorado

        Estudiantedoctorado estDoc = new Estudiantedoctorado("luiz martinez", LocalDate.of(1996, 1, 5), "universidad 500", "262626777", 9.6, LocalDate.of(2026, 6, 8), cuentaDoctorado, "ciencias de la computacion", "criptografia", "armando lopez");
        //registrar estudiantes 

        System.out.println(" registro de estudiantes en universidad");
        miuniversidad.registrarestudiante(estDoc);
        miuniversidad.registrarestudiante(estGrado);
        System.out.println();
        //metodos de estudiantes

        System.out.println("metodos de estudiantes ");
        estGrado.inscribirmateria("Apaloo");
        System.out.println("monto de la beca de laura " + estGrado.calcularbeca());
        estGrado.realizarproyecto();
        estGrado.solicitartitulacion();
        System.out.println();
        estDoc.realizartesis();
        estDoc.publicararticulo();
        System.out.println("monto de beca luis " + estDoc.calcularbeca());
        System.out.println();
        //busqueda de estudiante de forma recursiva
        System.out.println("buscando al estudiante " + estudiante1.getnombre() + " de forma recursiva");
        int posicionestudiante = miuniversidad.buscarestudianteRecursivo(estudiante1, 0);
        if (posicionestudiante != -1) {
            System.out.println("el estudiante " + estudiante1.getnombre() + " fue encontrado en la posicion " + posicionestudiante);
        } else {
            System.out.println("el estudiante " + estudiante1.getnombre() + " no fue encontrado");
        }

        //resumen 
        System.out.println("RESUMEN DEL SISTEMA ");
        System.out.println(miuniversidad.toString());
        System.out.println(departamentocomputacion.toString());
        System.out.println(estGrado.toString());
        System.out.println(estDoc.toString());

    }

}
