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
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto login(UserDto userDto) {
        Optional<UsuarioEntity> userOptional = this.userRepository.findByCodUsuario(userDto.getCodUsuario());
        if (userOptional.isPresent()) {
            UsuarioEntity user = userOptional.get();
            UserDto userDto1;
            if (user.getContrasena().equals(userDto.getContrasena())) {
                userDto1 = new UserDto(user);
            } else {
                userDto1 = new UserDto();
                userDto1.setCodUsuario(user.getCodUsuario());
            }
            return userDto1;

        } else {
            return new UserDto();
        }

    }
}
