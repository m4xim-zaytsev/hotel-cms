package com.example.hotel_cms.repository.jpa;

import com.example.hotel_cms.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User,Long>{
    @EntityGraph(attributePaths = {"role"})
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Boolean existsByUsernameOrEmail(String username, String email);
}
