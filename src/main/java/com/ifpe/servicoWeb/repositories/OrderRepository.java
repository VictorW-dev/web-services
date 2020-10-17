package com.ifpe.servicoWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.servicoWeb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
