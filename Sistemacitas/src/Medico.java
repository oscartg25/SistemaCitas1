/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GEINDEL
 */
public class Medico {
    private String nombre;
    private String especialidad;

    // Constructor
    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // Método para mostrar la información del médico
    @Override
    public String toString() {
        return "Médico: " + nombre + " (Especialidad: " + especialidad + ")";
    }
    
}
