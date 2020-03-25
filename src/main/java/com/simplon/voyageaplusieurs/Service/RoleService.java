package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Role;
import com.simplon.voyageaplusieurs.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoleService {
    /**
     * Get the complete list of Destinations
     * @return the complete list from persistence layer.
     */
    List<Role> getRoles();

}
