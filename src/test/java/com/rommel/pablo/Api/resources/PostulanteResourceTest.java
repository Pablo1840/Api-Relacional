package com.rommel.pablo.Api.resources;


import com.rommel.pablo.Api.entities.Postulante;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostulanteResourceTest {

    @Autowired
    private RestService restService;
    private Postulante postulante;

    @Test
    public void getAllPostulante() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(PostulanteResource.POSTULANTE).get().build();
        System.out.println(json);
    }

    @Test
    public void getById() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(PostulanteResource.POSTULANTE).path(PostulanteResource.ID).expand(202).get().build();
        System.out.println(json);
    }
}