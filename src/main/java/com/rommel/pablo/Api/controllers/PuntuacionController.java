package com.rommel.pablo.Api.controllers;

import com.rommel.pablo.Api.entities.Puntuacion;
import com.rommel.pablo.Api.entities.Solicitud;
import com.rommel.pablo.Api.repositories.PuntuacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PuntuacionController {

    private PuntuacionRepository puntuacionRepository;
    @Autowired
    public PuntuacionController(PuntuacionRepository puntuacionRepository) {
        this.puntuacionRepository = puntuacionRepository;
    }

    public Optional<Puntuacion> findPuntuacionsByPostulante_CodPostulante(int codPostulante) {
        return this.puntuacionRepository.findPuntuacionsByPostulante_CodPostulante(codPostulante);
    }

}
