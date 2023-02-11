package com.reto.atencionMedica.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cita  {
    private int id;
    private Paciente paciente;
    private Doctor doctor;
    private LocalDateTime hora;
    private LocalDate fecha;

    public Cita(int id, Paciente paciente, Doctor doctor, LocalDateTime hora, LocalDate fecha) {
        this.id = id;
        this.paciente = paciente;
        this.doctor = doctor;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}






