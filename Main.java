
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("===========Sistema iniciado=========");
        //instanciar universidad
        Universidad miuniversidad = new Universidad("universidad autonoma", "ciudad de mexico", 1994);
        //crea departamentos 
        Departamento departamentocomputacion = new Departamento("computacion", "num189", "edificio AT");
        //instancia doctores 
        Doctor doc1 = new Doctor("inteligencia artificial", "UAM ", 2022);
        Doctor doc2 = new Doctor("Systemas distribuidos", "UNAM", 2018);
        //METODOS DE DOCTOR 
        System.out.println("pruebas de doctor ");
        if (doc1.validartitulo()) {
            doc1.registrartitulo();
        }
        System.out.println(doc1.toString());
        System.out.println();
        //Pas
        Pas trabajadorPas = new Pas("Carlos Gomez ", "AV. CENTRAL 123", LocalDate.of(2010, 4, 12), "Administrador en sistemas", 16000, LocalDate.of(2020, 3, 8), "escolares", 2, "matutino");
        //PDI
        PDI profesorpdoPdi = new PDI("ARMANDO LOPEZ ", "SANTA MARTA ", LocalDate.of(2003, 3, 1), "profesor titular", 5000, LocalDate.of(2015, 5, 9), "Titular c", "computacion", 12);
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
        Estudiantegrado estGrado = new Estudiantegrado("laura ", LocalDate.of(2003, 7, 19), "Chimalhuacan ", "22353788", 9.2, LocalDate.of(2023, 9, 18), "tesis", 310, true);
        //doctorado
        Estudiantedoctorado estDoc = new Estudiantedoctorado("luiz martinez ", LocalDate.of(1996, 1, 5), "universidad 500", "262626777", 9.6, LocalDate.of(2026, 6, 8), "ciencias de la computacion", "criptografia", "armando lopez");
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
        //resumen 
        System.out.println("RESUMEN DEL SISTEMA ");
        System.out.println(miuniversidad.toString());
        System.out.println(departamentocomputacion.toString());
        System.out.println(estGrado.toString());
        System.out.println(estDoc.toString());
    }

}
