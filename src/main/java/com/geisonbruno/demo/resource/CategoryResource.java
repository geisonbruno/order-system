package com.geisonbruno.demo.resource;

import com.geisonbruno.demo.entities.Category;
import com.geisonbruno.demo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    // Buscando todas as categorias
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {

        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    // Buscando categoria por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {

        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
