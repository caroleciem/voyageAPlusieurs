package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}   
