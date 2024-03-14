package com.poc.dnbfilegateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poc.dnbfilegateway.Entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String username);

    //List<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
}
