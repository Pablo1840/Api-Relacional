package com.rommel.pablo.Api.controllers;

import com.rommel.pablo.Api.entities.Postulante;
import com.rommel.pablo.Api.repositories.PostulanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PostulanteController {

    private PostulanteRepository postulanteRepository;

    @Autowired
    public PostulanteController(PostulanteRepository postulanteRepository) {
        this.postulanteRepository = postulanteRepository;
    }

    public List<Postulante> findAllPostulantes() {
        return this.postulanteRepository.findAll();
    }

    public Optional<Postulante> findPostulanteByCodPostulante(int codPostulante) {
        return this.postulanteRepository.findById(codPostulante);
    }

    public List<Postulante> findPostulantesBySolicitud_CodigoSolicitud(int codSolicitud) {
        return this.postulanteRepository.findPostulantesBySolicitud_CodigoSolicitud(codSolicitud);
    }

    public boolean editPostulanteByCodPostulante(int codPostulante, Postulante postulante) {
        Optional<Postulante> postulanteOptional = this.findPostulanteByCodPostulante(codPostulante);
        if (!postulanteOptional.isPresent()) return false;
        Postulante postulantedb = postulanteOptional.get();
        postulantedb.setNombres(postulante.getNombres());
        postulantedb.setCurriculo(postulante.getCurriculo());
        postulantedb.setCertificadobanca(postulante.getCertificadobanca());
        postulantedb.setTitulo(postulante.getTitulo());
        postulanteRepository.save(postulantedb);
        return true;
    }

}
