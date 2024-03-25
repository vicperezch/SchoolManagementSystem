package org.schoolmanagement;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Clase que modela un estudiante
 */
public class Student extends Person {
    private int id;
    private String status;

    /**
     * Constructor de clase
     * @param id ID del estudiante
     * @param name Nombre
     * @param lastName Apellido
     * @param dateOfBirth Fecha de nacimiento
     * @param status Estado (matriculado, inactivo, graduado)
     */
    public Student (int id, String name, String lastName, String dateOfBirth, String status) {
        super(name, lastName, dateOfBirth);

        this.id = id;
        this.status = status;
    }

    // Setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
