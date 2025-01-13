package com.geisonbruno.demo.repositories;

import com.geisonbruno.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
