package com.mochawake.model.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "profile")
    private List<Follower> followers = new ArrayList<>();

    @OneToMany(mappedBy = "profile")
    private List<Following> followings = new ArrayList<>();

    private int stars;

    @OneToMany(mappedBy = "profile")
    private List<Achievement> achievements = new ArrayList<>();

    @Column(nullable = false)
    private String profilePictureUrl;

    public void changeProfilePicture(String newProfilePictureUrl) {
        this.profilePictureUrl = newProfilePictureUrl;
    }

}