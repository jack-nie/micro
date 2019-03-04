package com.hcp.microcourse.model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private String role;

    User() {
        super();
    }

    User(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }
}
