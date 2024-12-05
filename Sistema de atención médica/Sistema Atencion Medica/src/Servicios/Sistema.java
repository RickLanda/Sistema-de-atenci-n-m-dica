package Servicios;

import modelo.*;
import java.util.*;

public class Sistema {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Cita> citas = new ArrayList<>();

    public void registrarPaciente(String nombre, int edad, String id) {
        pacientes.add(new Paciente(nombre, edad, id));
    }

    public void registrarMedico(String nombre, String especialidad, String id) {
        medicos.add(new Medico(nombre, especialidad, id));
    }

    public void agendarCita(String id, String idPaciente, String idMedico, String fecha) {
        citas.add(new Cita(id, idPaciente, idMedico, fecha));
    }

    public List<Paciente> obtenerPacientes() {
        return pacientes;
    }

    public List<Medico> obtenerMedicos() {
        return medicos;
    }

    public List<Cita> obtenerCitas() {
        return citas;
    }

    public void cancelarCita(String id) {
        citas.removeIf(cita -> cita.getId().equals(id));
    }
}
