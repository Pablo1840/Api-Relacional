package com.rommel.pablo.Api.repositories;

import com.rommel.pablo.Api.entities.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud,Integer> {
}
