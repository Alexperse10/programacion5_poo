package org.example;

public class InstitutoApp {

    public static void main(String[] args) {


        Instituto instituto = new Instituto("IES MUTXAMEL", "Mutxamel");

        // se crean los cursos
        Curso cursoJava = new Curso("Java", 100);
        Curso cursoPython = new Curso("Python", 70);

        // añado los cursoss
        instituto.insertarcurso(cursoJava);
        instituto.insertarcurso(cursoPython);

        // intentar cursos dupli
        instituto.insertarcurso(new Curso("Java", 100));

        // se crean los estudiantes
        Estudiante e1 = new Estudiante("Carlos", 20, cursoJava);
        Estudiante e2 = new Estudiante("Ana", 22, cursoPython);

        // añadoo estudiantes al insti
        instituto.agregarEstudiante(e1);
        instituto.agregarEstudiante(e2);


        instituto.agregarEstudiante(new Estudiante("Carlos", 25, cursoPython));

        // se intenta con null
        instituto.insertarcurso(null);
        instituto.agregarEstudiante(null);

        // aqui muestro los curso
        System.out.println("--- CURSOS ---");
        System.out.println(instituto.getCursos());


        System.out.println("--- ESTUDIANTES ---");
        System.out.println(instituto.getEstudiantes());


        System.out.println("--- INSTITUTO ---");
        System.out.println(instituto);
    }
}