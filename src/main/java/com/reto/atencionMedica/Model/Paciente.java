package com.reto.atencionMedica.Model;

import java.util.List;

public class Paciente {
    private String nombre;
    private String informacionPersonal;
    private List<Cita> historialMedico;

    public Paciente(String nombre, String informacionPersonal, List<Cita> historialMedico) {
        this.nombre = nombre;
        this.informacionPersonal = informacionPersonal;
        this.historialMedico = historialMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInformacionPersonal() {
        return informacionPersonal;
    }

    public void setInformacionPersonal(String informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }

    public List<Cita> getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(List<Cita> historialMedico) {
        this.historialMedico = historialMedico;
    }
}

