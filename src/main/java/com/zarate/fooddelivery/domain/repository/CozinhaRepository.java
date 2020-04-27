package com.zarate.fooddelivery.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zarate.fooddelivery.domain.model.Cozinha;

public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

}
