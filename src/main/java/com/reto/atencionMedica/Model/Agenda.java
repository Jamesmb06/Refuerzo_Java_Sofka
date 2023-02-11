package com.reto.atencionMedica.Model;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Agenda {

    private int id;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Set<Cita> citasAgendadas;

    public Agenda(int id, String dia, LocalTime horaInicio, LocalTime horaFin, Set<Cita> citasAgendadas) {
        this.id = id;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.citasAgendadas = new HashSet<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public Set<Cita> getCitasAgendadas() {
        return citasAgendadas;
    }

    public void setCitasAgendadas(Set<Cita> citasAgendadas) {
        this.citasAgendadas = citasAgendadas;
    }
}




    /*public boolean agendarCita(Cita cita) {
        if (citasAgendadas.stream().anyMatch(c -> c.getHora().equals(cita.getHora()))) {
            return false;
        }
        citasAgendadas.add(cita);
        return true;
    }

    public void cancelarCita(Cita cita) {
        citasAgendadas.remove(cita);
    }*/

