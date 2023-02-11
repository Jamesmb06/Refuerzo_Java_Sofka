package com.reto.atencionMedica.Model;

import com.reto.atencionMedica.Intefaces.Horario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doctor {
    private String id;
    private String nombre;
    private Map<String, Horario> horarios;

    private List<Paciente>pacientes;

    public Doctor(String id, String nombre, Map<String, Horario> horarios, List<Paciente> pacientes) {
        this.id = id;
        this.nombre = nombre;
        this.horarios = new HashMap<>();;
        this.pacientes = new ArrayList<>();
    }
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Map<String, Horario> getHorarios() {
        return horarios;
    }
    public void setHorarios(Map<String, Horario> horarios) {
        this.horarios = horarios;
    }
    public void agregarHorario(String dia, Horario horario) {
        horarios.put(dia, horario);
    }
    public void modificarHorario(String dia, Horario horario) {
        horarios.replace(dia, horario);
    }
    public Map<String, Horario> obtenerHorarios() {
        return horarios;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", horarios=" + horarios +
                ", pacientes=" + pacientes +
                '}';
    }
}

