package com.rommel.pablo.Api.repositories;

import com.rommel.pablo.Api.entities.User;
import com.rommel.pablo.Api.entities.generated.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UsuarioEntity,Integer> {
    Optional<UsuarioEntity> findByCodUsuario(int codUsuario);
}