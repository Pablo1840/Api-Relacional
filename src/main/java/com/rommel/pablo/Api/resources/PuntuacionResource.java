package com.rommel.pablo.Api.resources;

import com.rommel.pablo.Api.controllers.PuntuacionController;
import com.rommel.pablo.Api.controllers.SolicitudController;
import com.rommel.pablo.Api.entities.Puntuacion;
import com.rommel.pablo.Api.entities.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = ID)
    public ResponseEntity getNotasPostulanteById(@PathVariable int codPostulante) {
        Optional<Puntuacion> puntuacionOptional = this.puntuacionController.findPuntuacionsByPostulante_CodPostulante(codPostulante);
        if (puntuacionOptional.isPresent()) {
            return new ResponseEntity(puntuacionOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity("\"No existe notas del Postulante\"", HttpStatus.NOT_FOUND);
        }

    }
}
