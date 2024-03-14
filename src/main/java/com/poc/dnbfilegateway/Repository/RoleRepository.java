package com.poc.dnbfilegateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poc.dnbfilegateway.Entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}

