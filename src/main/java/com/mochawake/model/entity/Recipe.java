package com.mochawake.model.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@Entity
@Table(name = "recipes")
public class Recipe extends BaseEntity {

    @Length(min = 2, max = 36)
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Type type;

    @Column(nullable = false)
    private String photoUrl;

    @Column(nullable = false)
    private String ingredients;

    @Column(nullable = false)
    private String recipeDescription;

    @ManyToOne
    @JoinColumn(name = "recipe_publisher_id", nullable = false)
    private User recipePublisher;
}