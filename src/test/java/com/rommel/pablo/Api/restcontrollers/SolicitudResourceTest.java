package com.rommel.pablo.Api.restcontrollers;

import com.rommel.pablo.Api.entities.Solicitud;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SolicitudResourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private RestService restService;
    private Solicitud solicitud;

    @Before
    public void before() {
        solicitud = new Solicitud();
        Date fecha = new Date(21,01,03);
        this.solicitud.setRazon("Renuncia Repentina");
        this.solicitud.setNombre("Ingenieria en Software");
        this.solicitud.setEstado("En proceso");
        this.solicitud.setFecha(fecha);
    }

    @Test
    public void createSolicitud() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(SolicitudResource.SOLICITUD).body(this.solicitud).post().build();
        System.out.println(json);

    }
}