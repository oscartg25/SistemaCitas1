/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GEINDEL
 */
public class Cita {
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String hora;

    // Constructor
    public Cita(Paciente paciente, Medico medico, String fecha, String hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters
    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    // Método para mostrar la información de la cita
    @Override
    public String toString() {
        return "Cita: " + paciente.getNombre() + " con " + medico.getNombre() + 
               " el " + fecha + " a las " + hora;
    }
    
}
