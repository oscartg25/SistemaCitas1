/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GEINDEL
 */
public class SistemaCitas {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Cita> citas;

    // Constructor
    public SistemaCitas() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        citas = new ArrayList<>();
    }

    // Método para agregar un paciente
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente agregado: " + paciente.getNombre());
    }

    // Método para agregar un médico
    public void agregarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico agregado: " + medico.getNombre());
    }

    // Método para solicitar una cita
    public void solicitarCita(Paciente paciente, Medico medico, String fecha, String hora) {
        // Verificar si el paciente ya tiene 3 citas
        long citasPaciente = citas.stream()
            .filter(c -> c.getPaciente().equals(paciente))
            .count();

        if (citasPaciente >= 3) {
            System.out.println("El paciente " + paciente.getNombre() + " ya tiene 3 citas. No puede solicitar más.");
            return;
        }

        // Crear la cita
        Cita cita = new Cita(paciente, medico, fecha, hora);
        citas.add(cita);
        System.out.println("Cita agendada: " + cita);
    }

    // Método para cancelar una cita
    public void cancelarCita(Paciente paciente, String fecha, String hora) {
        Cita citaCancelar = citas.stream()
            .filter(c -> c.getPaciente().equals(paciente) && c.getFecha().equals(fecha) && c.getHora().equals(hora))
            .findFirst()
            .orElse(null);

        if (citaCancelar != null) {
            citas.remove(citaCancelar);
            System.out.println("Cita cancelada: " + citaCancelar);
        } else {
            System.out.println("No se encontró la cita para cancelar.");
        }
    }

    // Método para mostrar todas las citas
    public void mostrarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas agendadas.");
        } else {
            System.out.println("Citas agendadas:");
            citas.forEach(System.out::println);
        }
    }
}
