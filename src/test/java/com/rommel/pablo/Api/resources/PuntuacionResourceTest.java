package com.rommel.pablo.Api.resources;

import com.rommel.pablo.Api.entities.Puntuacion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PuntuacionResourceTest {

    @Autowired
    private RestService restService;
    private Puntuacion puntuacion;

    @Test
    public void getNotasPostulanteById() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(PuntuacionResource.PUNTUACION).path(PuntuacionResource.ID).expand(201).get().build();
        System.out.println(json);
    }
}