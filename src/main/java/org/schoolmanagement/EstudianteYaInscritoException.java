package org.schoolmanagement;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Excepción cuando se intenta escribir a un estudiante dos veces a un curso
 */
public class EstudianteYaInscritoException extends Exception {
    public EstudianteYaInscritoException(String message) {
        super(message);
    }
}
