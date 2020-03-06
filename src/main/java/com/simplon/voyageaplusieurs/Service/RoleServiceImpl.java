package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Role;
import com.simplon.voyageaplusieurs.Repository.RoleRepository;
import com.simplon.voyageaplusieurs.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository alimentRepository) {
        this.roleRepository = alimentRepository;
    }

    public Role getRoleByRoleType(String roleType) throws EntityNotFoundException {
        Optional<Role> role = roleRepository.findByRoleType(roleType);

        if (role.isPresent()) {
            return role.get();
        } else {
            throw new EntityNotFoundException("The role with roleType: " + roleType + " cannot be found in DB", "Role");        }
    }
}
