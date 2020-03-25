package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Role;
import com.simplon.voyageaplusieurs.Repository.RoleRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository alimentRepository) {
        this.roleRepository = alimentRepository;
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }
}
