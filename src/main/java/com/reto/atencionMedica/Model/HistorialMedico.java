package com.reto.atencionMedica.Model;

import com.reto.atencionMedica.Intefaces.InteraccionMedica;

import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private int id;
    private List<InteraccionMedica> interacciones;

    public HistorialMedico(int id, List<InteraccionMedica> interacciones) {
        this.id = id;
        this.interacciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<InteraccionMedica> getInteracciones() {
        return interacciones;
    }

    public void setInteracciones(List<InteraccionMedica> interacciones) {
        this.interacciones = interacciones;
    }
}
