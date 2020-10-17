package com.ifpe.servicoWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.servicoWeb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
