package com.reto.atencionMedica.Repository;

import com.reto.atencionMedica.Model.Paciente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PacienteRepository {

    List<Paciente> pacientes;


    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void actualizarPaciente(Paciente paciente) {

        pacientes = pacientes.stream().map(p -> {
            if (p.getDocumento().equals(paciente.getDocumento())) {
                return paciente;
            }
            return p;
        }).collect(Collectors.toList());
    }
}



