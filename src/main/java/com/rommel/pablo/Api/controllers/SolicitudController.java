package com.rommel.pablo.Api.controllers;

import com.rommel.pablo.Api.entities.Solicitud;
import com.rommel.pablo.Api.repositories.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SolicitudController {

    private SolicitudRepository solicitudRepository;

    @Autowired
    public SolicitudController(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    public void createSolicitud(Solicitud solicitud) {
        this.solicitudRepository.save(solicitud);
    }

}
