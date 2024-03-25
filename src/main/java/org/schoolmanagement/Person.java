package org.schoolmanagement;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Clase que modela una persona
 */
public class Person {
    protected String name;
    protected String lastName;
    protected String dateOfBirth;

    /**
     * Constructor de clase
     * @param name Nombre de la persona
     * @param lastName Apellido
     * @param dateOfBirth Fecha de nacimiento
     */
    public Person(String name, String lastName, String dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters y Setters
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
}
