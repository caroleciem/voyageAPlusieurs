package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Country;
import com.simplon.voyageaplusieurs.Model.Person;
import com.simplon.voyageaplusieurs.Model.Role;
import com.simplon.voyageaplusieurs.Model.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("SELECT role FROM Role role where role.roleType = :roleType ")
    Optional<Role> findByRoleType(String roleType);
}
