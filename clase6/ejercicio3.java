    package clase6;

    public class ejercicio3 {

        public static void main(String[] args) {

            System.out.println("CONSIGNA UNO -----------------------------------");
            Universidad u = new Universidad("Universidad Nacional");
            Profesor prof1 = new Profesor("P1", "Juan Rodriguez", "Matematica");
            Profesor prof2 = new Profesor("P2", "Federico Lopez", "Fisica");
            Profesor prof3 = new Profesor("P3", "Maria Perez", "Literatura");
            Curso c1 = new Curso("C1", "Matematicas I");
            Curso c2 = new Curso("C2", "Fisica I");
            Curso c3 = new Curso("C3", "Literatura");
            Curso c4 = new Curso("C4", "Algebra");
            Curso c5 = new Curso("C5", "Fisica II");
            
            System.out.println("CONSIGNA DOS -----------------------------------");
            u.agregarProfesor(prof1);
            u.agregarProfesor(prof2);
            u.agregarProfesor(prof3);
            u.agregarCurso(c1);
            u.agregarCurso(c2);
            u.agregarCurso(c3);
            u.agregarCurso(c4);
            u.agregarCurso(c5);

            System.out.println("CONSIGNA TRES ----------------------------------");
            u.asignarProfesorACurso("C1", "P1");
            u.asignarProfesorACurso("C2", "P1");
            u.asignarProfesorACurso("C3", "P2");
            u.asignarProfesorACurso("C4", "P2");
            u.asignarProfesorACurso("C5", "P3");

            System.out.println("CONSIGNA CUATRO --------------------------------");
            System.out.println("Listado de cursos con profesor:");
            u.listarCursos();
            System.out.println("Listado de profesores con sus cursos:");
            u.listarProfesores();

            System.out.println("CONSIGNA CINCO ---------------------------------");
            System.out.println("Cambiar profesor de C5 a P3:");
            u.asignarProfesorACurso("C5", "P3");
            System.out.println("Cursos de P2:");
            prof2.listarCursos();
            System.out.println("Cursos de P3:");
            prof3.listarCursos();

            System.out.println("CONSIGNA SEIS ----------------------------------");
            System.out.println("Eliminar curso C4");
            u.eliminarCurso("C4");
            prof1.listarCursos();

            System.out.println("CONSIGNA SIETE ---------------------------------");
            System.out.println("Eliminar profesor P3");
            u.eliminarProfesor("P3");
            u.listarCursos();

            System.out.println("CONSIGNA OCHO ----------------------------------");
            System.out.println("Cantidad de cursos por profesor:");
            for (Profesor p : new Profesor[]{prof1, prof2, prof3}) {
                System.out.println(p.getNombre() + ": " + p.getCursos().size());
            }

        }

    }
