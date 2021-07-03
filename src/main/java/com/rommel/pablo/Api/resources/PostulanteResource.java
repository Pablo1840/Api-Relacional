package com.rommel.pablo.Api.resources;

import com.rommel.pablo.Api.controllers.PostulanteController;
import com.rommel.pablo.Api.entities.Postulante;
import com.rommel.pablo.Api.entities.Solicitud;
import com.rommel.pablo.Api.resources.exceptions.EditPostulanteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(PostulanteResource.POSTULANTE)
public class PostulanteResource {

    public static final String POSTULANTE = "/postulante";
    public static final String ID = "/{codPostulante}";
    public static final String CODSOLICITUD = "/codSolicitud";
    public static final String CODSOLICITUDID = "/{codSolicitud}";

    private PostulanteController postulanteController;

    @Autowired
    public PostulanteResource(PostulanteController postulanteController) {
        this.postulanteController = postulanteController;
    }

    @GetMapping
    public List<Postulante>getAllPostulantes(){
        return this.postulanteController.findAllPostulantes();
    }

    @GetMapping(value = ID)
    public ResponseEntity getPostulanteById(@PathVariable int codPostulante) {
        Optional<Postulante> postulanteOptional = this.postulanteController.findPostulanteByCodPostulante(codPostulante);
        if (postulanteOptional.isPresent()) {
            return new ResponseEntity(postulanteOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity("\"El Postulante no  existe\"", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = CODSOLICITUD + CODSOLICITUDID)
    public ResponseEntity getPostulantesByCodSolicitud(@PathVariable Integer codSolicitud) {
        if (codSolicitud == null){
            return new ResponseEntity("\"No existe postulantes asignados\"", HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity(this.postulanteController.findPostulantesBySolicitud_CodigoSolicitud(codSolicitud),HttpStatus.OK);
        }
    }


    @PutMapping(value = ID)
    public ResponseEntity editPostulante(@RequestBody Postulante postulante, @PathVariable int codPostulante) throws EditPostulanteException {
        try {
            if (this.postulanteController.editPostulanteByCodPostulante(codPostulante, postulante))
                return new ResponseEntity("\"El postulante fue editado\"", HttpStatus.ACCEPTED);
            return new ResponseEntity("\"El postulante no  existe\"", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            throw new EditPostulanteException("Los datos enviados no son los correctos");
        }
    }

}
