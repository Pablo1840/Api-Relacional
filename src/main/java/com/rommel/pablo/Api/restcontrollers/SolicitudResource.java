package com.rommel.pablo.Api.restcontrollers;

import com.rommel.pablo.Api.controllers.SolicitudController;
import com.rommel.pablo.Api.entities.Solicitud;
import com.rommel.pablo.Api.restcontrollers.exceptions.SolicitudCreateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SolicitudResource.SOLICITUD)
public class SolicitudResource {
    public static final String SOLICITUD = "/solicitud";
    public static final String ID = "/{codSolicitud}";

    private SolicitudController solicitudController;

    @Autowired
    public SolicitudResource(SolicitudController solicitudController) {
        this.solicitudController = solicitudController;
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
