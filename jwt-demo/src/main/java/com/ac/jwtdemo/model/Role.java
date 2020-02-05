package com.ac.jwtdemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Role {

    @Id
    private RoleName name;

    public Role() {}

    public Role(RoleName name) {
        this.name = name;
    }

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }
}