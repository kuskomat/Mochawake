package com.mochawake.model.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "types")
public class Type extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private TypeName typeName;

    @OneToMany(mappedBy = "type")
    private Set<Recipe> recipes;
}