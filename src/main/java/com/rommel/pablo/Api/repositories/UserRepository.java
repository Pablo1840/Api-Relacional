package com.rommel.pablo.Api.repositories;

import com.rommel.pablo.Api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}