package com.test.fullstackback.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

    @Id@GeneratedValue
    private Long id;
    private String userName;
    private String name;
    private String email;
}
