package org.schoolmanagement;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Victor", "Pérez", "01/10/2004", "Matriculado");
        Student student2 = new Student(2, "Juan", "Ramírez", "05/06/2003", "Matriculado");

        Course course1 = new Course(1, "Cálculo I", "Clase introductoria de cálculo", 6, 1);
        Course course2 = new Course(2, "Estructuras de datos", "Programación en Java", 5, 2);

        AcademicManager am = new AcademicManager();

        am.registerStudent(student1);
        am.registerStudent(student2);
        am.addCourse(course1);
        am.addCourse(course2);
        System.out.println();

        try {
            am.enrollStudentCourse(student1, 1);
            am.enrollStudentCourse(student2, 2);
            am.enrollStudentCourse(student1, 1);


        } catch (EstudianteYaInscritoException e) {
            System.out.println("Excepción: El estudiante ya está inscrito en el curso.");
        }

        try {
            am.withdrawStudentCourse(student1.getId(), course1.getId());
            am.withdrawStudentCourse(student2.getId(), course1.getId());

        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println("Excepción: El estudiante no está inscrito en el curso.");
        }
    }
}