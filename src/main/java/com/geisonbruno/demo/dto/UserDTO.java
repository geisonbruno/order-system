package com.geisonbruno.demo.dto;

import com.geisonbruno.demo.entities.User;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.password = user.getPassword();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }
}
