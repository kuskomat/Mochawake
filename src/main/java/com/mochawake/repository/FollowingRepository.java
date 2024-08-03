package com.mochawake.repository;


import com.mochawake.model.entity.Following;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowingRepository extends JpaRepository<Following, Long> {
}
