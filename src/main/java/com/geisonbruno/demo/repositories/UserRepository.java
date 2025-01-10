package com.geisonbruno.demo.repositories;

import com.geisonbruno.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
