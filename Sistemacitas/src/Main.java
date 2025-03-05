/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GEINDEL
 */
public class Main {
    public static void main(String[] args) {
        // Crear el sistema de citas
        SistemaCitas sistema = new SistemaCitas();

        // Crear pacientes
        Paciente paciente1 = new Paciente("Juan Pérez", "P001");
        Paciente paciente2 = new Paciente("María López", "P002");

        // Crear médicos
        Medico medico1 = new Medico("Dr. García", "Cardiología");
        Medico medico2 = new Medico("Dra. Martínez", "Pediatría");

        // Agregar pacientes y médicos al sistema
        sistema.agregarPaciente(paciente1);
        sistema.agregarPaciente(paciente2);
        sistema.agregarMedico(medico1);
        sistema.agregarMedico(medico2);

        // Solicitar citas
        sistema.solicitarCita(paciente1, medico1, "2023-10-15", "10:00");
        sistema.solicitarCita(paciente1, medico2, "2023-10-16", "11:00");
        sistema.solicitarCita(paciente1, medico1, "2023-10-17", "12:00"); // Esta cita no se agendará (límite de 3 citas)

        // Mostrar citas
        sistema.mostrarCitas();

        // Cancelar una cita
        sistema.cancelarCita(paciente1, "2023-10-15", "10:00");

        // Mostrar citas después de cancelar
        sistema.mostrarCitas();
    }
}
