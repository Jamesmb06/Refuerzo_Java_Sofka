package com.reto.atencionMedica.Model;

import java.util.Map;

public class Doctor {
    private String nombre;
    private Map<String, String> horarioDisponibilidad;

    public Doctor(String nombre, Map<String, String> horarioDisponibilidad) {
        this.nombre = nombre;
        this.horarioDisponibilidad = horarioDisponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Map<String, String> getHorarioDisponibilidad() {
        return horarioDisponibilidad;
    }

    public void setHorarioDisponibilidad(Map<String, String> horarioDisponibilidad) {
        this.horarioDisponibilidad = horarioDisponibilidad;
    }
}

