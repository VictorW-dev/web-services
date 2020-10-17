package com.ifpe.servicoWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.servicoWeb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
