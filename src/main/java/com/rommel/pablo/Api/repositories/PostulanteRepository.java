package com.rommel.pablo.Api.repositories;

import com.rommel.pablo.Api.entities.Postulante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostulanteRepository extends JpaRepository<Postulante,Integer> {
        List<Postulante> findPostulantesBySolicitud_CodigoSolicitud(int codSolicitud);
}
