package org.schoolmanagement;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Interfaz con los métodos para manejar el sistema escolar
 */
public interface IAcademicServices {
    void registerStudent(Student student);

    void addCourse(Course course);

    void enrollStudentCourse(Student student, int courseId) throws EstudianteYaInscritoException;

    void withdrawStudentCourse(int studentId, int courseId) throws EstudianteNoInscritoEnCursoException;
}
