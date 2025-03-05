/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GEINDEL
 */
public class Paciente {
    private String nombre;
    private String id;

    // Constructor
    public Paciente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    // Método para mostrar la información del paciente
    @Override
    public String toString() {
        return "Paciente: " + nombre + " (ID: " + id + ")";
    }
    
}
