package org.schoolmanagement;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Clase que modela un curso
 */
public class Course {
    private int id;
    private String name;
    private String description;
    private int creditNumber;
    private int version;

    /**
     * Constructor de clase
     * @param id ID del curso
     * @param name Nombre
     * @param description Descripción
     * @param creditNumber Número de créditos que otorga
     * @param version Versión
     */
    public Course(int id, String name, String description, int creditNumber, int version) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creditNumber = creditNumber;
        this.version = version;
    }

    // Setters y Getters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
