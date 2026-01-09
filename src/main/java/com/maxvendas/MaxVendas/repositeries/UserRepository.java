package com.maxvendas.maxvendas.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxvendas.maxvendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> // (Entidade que ele gerencia, Tipo do ID)
{

	
}
