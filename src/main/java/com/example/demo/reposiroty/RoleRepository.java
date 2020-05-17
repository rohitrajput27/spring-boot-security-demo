package com.example.demo.reposiroty;

import com.example.demo.domain.entiry.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,String> {
}
