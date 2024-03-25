package org.schoolmanagement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Clase controladora de los cursos y estudiantes
 */
public class AcademicManager {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private HashMap<Course, ArrayList<Student>> enrolledStudents;

    /**
     * Constructor de clase
     */
    public AcademicManager() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.enrolledStudents = new HashMap<>();
    }
}
