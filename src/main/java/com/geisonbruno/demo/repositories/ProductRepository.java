package com.geisonbruno.demo.repositories;

import com.geisonbruno.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
