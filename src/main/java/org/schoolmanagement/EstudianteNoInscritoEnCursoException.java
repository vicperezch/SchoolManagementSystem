package org.schoolmanagement;

/**
 * @author Victor Pérez
 * @since 24/03/2024
 * Excepción cuando se intenta eliminar un estudiante de un curso no inscrito
 */
public class EstudianteNoInscritoEnCursoException extends Exception {
    public EstudianteNoInscritoEnCursoException(String message) {
        super(message);
    }
}
