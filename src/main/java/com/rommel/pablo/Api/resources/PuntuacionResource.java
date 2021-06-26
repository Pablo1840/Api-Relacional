package com.rommel.pablo.Api.resources;

import com.rommel.pablo.Api.controllers.PuntuacionController;
import com.rommel.pablo.Api.controllers.SolicitudController;
import com.rommel.pablo.Api.entities.Puntuacion;
import com.rommel.pablo.Api.entities.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(PuntuacionResource.PUNTUACION)
public class PuntuacionResource {
    public static final String PUNTUACION = "/puntuacion";
    public static final String ID = "/{codigoEvaluacion}";

    private PuntuacionController puntuacionController;

    @Autowired
    public PuntuacionResource(PuntuacionController puntuacionController) {
        this.puntuacionController = puntuacionController;
    }

    @GetMapping
    public List<Puntuacion> getAllCalificaciones(@RequestParam(required = false) Integer codPostulante) {
        if (codPostulante == null) return this.puntuacionController.findAllCalificaciones();
        return this.puntuacionController.findPuntuacionsByPostulante_CodPostulante(codPostulante);
    }

}
