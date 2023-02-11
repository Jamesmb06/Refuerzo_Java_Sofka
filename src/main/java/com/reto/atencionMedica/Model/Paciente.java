package com.reto.atencionMedica.Model;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String documento;
    private String nombre;
    private List<HistorialMedico> historialMedicos;

    public Paciente(String documento, String nombre, List<Cita> citasAgendadas, List<HistorialMedico> historialMedicos) {
        this.documento = documento;
        this.nombre = nombre;
        this.historialMedicos = new ArrayList<>();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<HistorialMedico> getHistorialMedicos() {
        return historialMedicos;
    }

    public void setHistorialMedicos(List<HistorialMedico> historialMedicos) {
        this.historialMedicos = historialMedicos;
    }

/* public void setInformacionPersonal(String informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }
    public Paciente(String id, String nombre, String informacionPersonal) {
        this.id = id;
        this.nombre = nombre;
        this.informacionPersonal = informacionPersonal;

    }
    public void modificarInformacionPersonal(String informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }*/
}

