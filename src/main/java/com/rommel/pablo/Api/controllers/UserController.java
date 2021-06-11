package com.rommel.pablo.Api.controllers;

import com.rommel.pablo.Api.dtos.UserDto;
import com.rommel.pablo.Api.entities.generated.UsuarioEntity;
import com.rommel.pablo.Api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto login(UserDto userDto) {
        Optional<UsuarioEntity> userOptional = this.userRepository.findByApellidos(userDto.getApellidos());
    }
}
