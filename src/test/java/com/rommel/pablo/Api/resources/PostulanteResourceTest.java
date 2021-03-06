package com.rommel.pablo.Api.resources;


import com.rommel.pablo.Api.entities.Postulante;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostulanteResourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private RestService restService;
    private Postulante postulante;


    @Before
    public void before() {
        postulante = new Postulante();
        this.postulante.setNombres("Alberto");
        this.postulante.setCurriculo("");
        this.postulante.setCertificadobanca("1725351330");
        this.postulante.setTitulo("Ingeniero");
    }

    @Test
    public void getAllPostulantes() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(PostulanteResource.POSTULANTE).get().build();
        System.out.println(json);
    }

    @Test
    public void getById() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(PostulanteResource.POSTULANTE).path(PostulanteResource.ID).expand(201).get().build();
        System.out.println(json);
    }

    @Test
    public void getPostulantesByCodSolicitud() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(PostulanteResource.POSTULANTE).path(PostulanteResource.CODSOLICITUD).path(PostulanteResource.CODSOLICITUDID).expand(101).get().build();
        System.out.println(json);
    }

    @Test
    public void editPostulante() {
        this.postulante.setNombres("Pedro Juan");
        this.postulante.setCurriculo("ruta");
        this.postulante.setCertificadobanca("ruta");
        this.postulante.setTitulo("Ing. Sistemas");
        this.postulante.setCodPostulante(3);
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(PostulanteResource.POSTULANTE).path(PostulanteResource.ID)
                .expand(201).body(postulante).put().build();
        System.out.println(json);
    }
}