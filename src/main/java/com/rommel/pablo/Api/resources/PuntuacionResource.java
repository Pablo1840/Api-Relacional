package com.rommel.pablo.Api.resources;

import com.rommel.pablo.Api.controllers.PuntuacionController;
import com.rommel.pablo.Api.entities.Puntuacion;
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
    public static final String CODPOSTULANTE = "/{codPostulante}";

    private PuntuacionController puntuacionController;

    @Autowired
    public PuntuacionResource(PuntuacionController puntuacionController) {
        this.puntuacionController = puntuacionController;
    }

    @GetMapping
    public List<Puntuacion> getAllCalificaciones() {
        return this.puntuacionController.findAllCalificaciones();
    }

    @GetMapping(value = CODPOSTULANTE)
    public ResponseEntity getAllCalificacionesByCodPostulante(@PathVariable Integer codPostulante) {
       if (codPostulante == null){
           return new ResponseEntity("\"El postulante no existe\"", HttpStatus.NOT_FOUND);
       }else{
           return new ResponseEntity(this.puntuacionController.findPuntuacionsByPostulante_CodPostulante(codPostulante),HttpStatus.OK);
       }
    }
}
