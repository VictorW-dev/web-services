package com.ifpe.servicoWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.servicoWeb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
