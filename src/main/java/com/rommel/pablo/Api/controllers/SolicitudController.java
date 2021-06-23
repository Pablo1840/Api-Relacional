package com.rommel.pablo.Api.controllers;

import com.rommel.pablo.Api.entities.Solicitud;
import com.rommel.pablo.Api.repositories.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class SolicitudController {

    private SolicitudRepository solicitudRepository;

    @Autowired
    public SolicitudController(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    public List<Solicitud> findAllSolicituds() {
        return this.solicitudRepository.findAll();
    }

    public Optional<Solicitud> findSolicitudByCodSolicitud(int codigoSolicitud) {
        return this.solicitudRepository.findById(codigoSolicitud);
    }

    public List<Solicitud> findSolicitudsByUsuario_CodUsuario(int codUsuario) {
        return this.solicitudRepository.findSolicitudsByUsuario_CodUsuario(codUsuario);
    }

    public void createSolicitud(Solicitud solicitud) {
        this.solicitudRepository.save(solicitud);
    }

}
