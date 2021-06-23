package com.rommel.pablo.Api.repositories;


import com.rommel.pablo.Api.entities.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PuntuacionRepository extends JpaRepository<Puntuacion,Integer> {
    Optional<Puntuacion> findPuntuacionsByPostulante_CodPostulante(int codPostulante);
}
