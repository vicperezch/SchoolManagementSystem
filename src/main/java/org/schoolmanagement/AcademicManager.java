package org.schoolmanagement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Clase controladora de los cursos y estudiantes
 */
public class AcademicManager implements IAcademicServices {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private HashMap<Integer, ArrayList<Integer>> enrolledStudents;

    /**
     * Constructor de clase
     */
    public AcademicManager() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.enrolledStudents = new HashMap<>();
    }

    /**
     * Matricula un estudiante si no lo está
     * @param student Estudiante a matricular
     */
    @Override
    public void registerStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("El estudiante " + student.getName() + " ha sido matriculado.");

        } else {
            System.out.println("El estudiante " + student.getName() + " ya está matriculado.");
        }
    }

    /**
     * Agrega un curso a la lista si no existe
     * @param course Curso a agregar
     */
    @Override
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            enrolledStudents.put(course.getId(), new ArrayList<>());

            System.out.println("Se ha creado el curso " + course.getName() + ".");

        } else {
            System.out.println("El curso " + course.getName() + " ya existe.");
        }
    }

    /**
     * Inscribe un estudiante a un curso
     * @param student Estudiante a inscribir
     * @param courseId ID del curso
     */
    @Override
    public void enrollStudentCourse(Student student, int courseId) throws EstudianteYaInscritoException {
        ArrayList<Integer> studentList = enrolledStudents.get(courseId);

        if (studentList.contains(student.getId())) {
            throw new EstudianteYaInscritoException("El estudiante ya está inscrito en el curso.");
        }

        String courseName = "";
        for (Course c: courses) {
            if (c.getId() == courseId) {
                courseName = c.getName();
            }
        }

        studentList.add(student.getId());
        enrolledStudents.replace(courseId, studentList);
        System.out.println("Se ha inscrito al estudiante " + student.getName() + " en " + courseName + ".");
    }

    /**
     * Retira un estudiante de un curso
     * @param studentId ID del estudiante a retirar
     * @param courseId ID del curso
     */
    @Override
    public void withdrawStudentCourse(int studentId, int courseId) throws EstudianteNoInscritoEnCursoException {
        ArrayList<Integer> studentList = enrolledStudents.get(courseId);

        if (!studentList.contains(studentId)) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante no se encuentra inscrito en el curso");
        }

        studentList.remove((Integer) studentId);
        enrolledStudents.replace(courseId, studentList);
        String name = "";

        for (Student st: students) {
            if (st.getId() == studentId) {
                name = st.getName();
            }
        }

        System.out.println("Se ha retirado al estudiante " + name + " del curso.");
    }
}
