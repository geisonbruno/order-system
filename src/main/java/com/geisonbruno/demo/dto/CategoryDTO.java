package com.geisonbruno.demo.dto;

import com.geisonbruno.demo.entities.Category;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
