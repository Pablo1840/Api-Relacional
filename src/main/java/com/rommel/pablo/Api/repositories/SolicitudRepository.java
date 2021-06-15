package com.rommel.pablo.Api.repositories;

import com.rommel.pablo.Api.entities.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud,Integer> {
    List<Solicitud> findProductsByCodigoSolicitud(int codSolicitud);
}
