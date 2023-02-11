package com.reto.atencionMedica.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    @Autowired
    private RepositorioDoctor repositorioDoctor;

    public List<Doctor> obtenerDoctores() {
        return repositorioDoctor.obtenerDoctores();
    }

    public Doctor obtenerDoctor(int idDoctor) {
        return repositorioDoctor.obtenerDoctor(idDoctor);
    }

    public void agregarDoctor(Doctor doctor) {
        repositorioDoctor.agregarDoctor(doctor);
    }

    public void actualizarDoctor(Doctor doctor) {
        repositorioDoctor.actualizarDoctor(doctor);
    }

    public void eliminarDoctor(int idDoctor) {
        repositorioDoctor.eliminarDoctor(idDoctor);
    }

    public List<Horario> obtenerHorariosDisponibles(int idDoctor, String dia) {
        Doctor doctor = repositorioDoctor.obtenerDoctor(idDoctor);
        return doctor.getHorarios().stream().filter(h -> h.getDia().equals(dia) && h.isDisponible()).collect(Collectors.toList());
    }

    public boolean agendarCita(int idDoctor, Cita cita) {
        List<Horario> horariosDisponibles = obtenerHorariosDisponibles(idDoctor, cita.getDia());
        for (Horario horario : horariosDisponibles) {
            if (cita.getHoraInicio().compareTo(horario.getHoraInicio()) >= 0
                    && cita.getHoraFinal().compareTo(horario.getHoraFinal()) <= 0) {
                horario.setDisponible(false);
                repositorioDoctor.actualizarHorario(horario);
                return true;
            }
        }
        return false;
    }
}

