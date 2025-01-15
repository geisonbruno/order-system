package com.geisonbruno.demo.repositories;

import com.geisonbruno.demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
