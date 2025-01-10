package com.geisonbruno.demo.repositories;

import com.geisonbruno.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
