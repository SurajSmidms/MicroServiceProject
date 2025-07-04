package com.smidms.security_service.repository;

import com.smidms.security_service.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long>{

    Optional<Role> findByName(String name);

}
