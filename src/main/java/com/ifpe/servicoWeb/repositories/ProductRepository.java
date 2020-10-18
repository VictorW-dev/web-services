package com.ifpe.servicoWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.servicoWeb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
