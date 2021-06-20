package com.rommel.pablo.Api.resources;

import com.rommel.pablo.Api.controllers.SolicitudController;
import com.rommel.pablo.Api.entities.Solicitud;
import com.rommel.pablo.Api.resources.exceptions.SolicitudCreateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(SolicitudResource.SOLICITUD)
public class SolicitudResource {
    public static final String SOLICITUD = "/solicitud";
    public static final String ID = "/{codigoSolicitud}";

    private SolicitudController solicitudController;

    @Autowired
    public SolicitudResource(SolicitudController solicitudController) {
        this.solicitudController = solicitudController;
    }

    @GetMapping
    public List<Solicitud> getAllSolicituds(@RequestParam(required = false) Integer codUsuario) {
        if (codUsuario == null) return this.solicitudController.findAllSolicituds();
        return this.solicitudController.findSolicitudsByUsuario_CodUsuario(codUsuario);
    }

    @GetMapping(value = ID)
    public ResponseEntity getProductById(@PathVariable int codigoSolicitud) {
        Optional<Solicitud> solicitudOptional = this.solicitudController.findSolicitudByCodSolicitud(codigoSolicitud);
        if (solicitudOptional.isPresent()) {
            return new ResponseEntity(solicitudOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity("\"La solicitud no  existe\"", HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping
    public ResponseEntity createSolicitud(@RequestBody Solicitud solicitud) throws SolicitudCreateException {
        try {
            this.solicitudController.createSolicitud(solicitud);
            return new ResponseEntity("\"La Solicitud fue creada\"", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new SolicitudCreateException("los datos enviados no son los correctos");
        }
    }



}
