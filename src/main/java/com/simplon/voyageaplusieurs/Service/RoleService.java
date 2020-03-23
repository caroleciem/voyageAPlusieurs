package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Role;
import com.simplon.voyageaplusieurs.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RoleService {
    Role getRoleByRoleType(String roleType) throws EntityNotFoundException;
}
