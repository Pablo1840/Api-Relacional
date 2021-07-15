package com.rommel.pablo.Api.resources;

import com.rommel.pablo.Api.dtos.UserDto;
import com.rommel.pablo.Api.entities.User;

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
public class AuthResourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private RestService restService;

    private UserDto userDto;
    private User user;

    @Before
    public void Before(){
        userDto=new UserDto();
        user = new User();
        userDto.setEmail("prueba@gmail.com");
        userDto.setContrasena("12345");
        user.setNombres("Pablo");
        user.setApellidos("Salazar");
        user.setEmail("prueba@gmail.com");
        user.setContrasena("12345");
        user.setCargo("Director de Carrera");
        user.setArea("Software");
    }
    
    @Test
    public void createUser() {
        String json=
                restService.restBuilder(new RestBuilder<String>().clazz(String.class))
                        .path(AuthResource.AUTH)
                        .body(this.user).post().build();
        System.out.println(json);
    }

    @Test
    public void login() {
        String json=
                restService.restBuilder(new RestBuilder<String>().clazz(String.class))
                        .path(AuthResource.AUTH).path(AuthResource.LOGIN)
                        .body(this.userDto).post().build();
        System.out.println(json);
    }
}