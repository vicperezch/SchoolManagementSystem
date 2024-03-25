package org.schoolmanagement;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Clase que modela un estudiante
 */
public class Student {
    private int id;
    private String name;
    private String lastName;
    private String dateOfBirth;
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
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
    }

    // Setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
