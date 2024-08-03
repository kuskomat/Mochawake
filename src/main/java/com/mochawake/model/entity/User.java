package com.mochawake.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Length(min = 3, max = 20)
    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "recipePublisher")
    private Set<Recipe> recipes;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Profile profile;
}


