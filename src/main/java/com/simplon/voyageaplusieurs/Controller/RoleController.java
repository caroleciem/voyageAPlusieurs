package com.simplon.voyageaplusieurs.Controller;

import com.simplon.voyageaplusieurs.exception.EntityNotFoundException;
import com.simplon.voyageaplusieurs.Model.Role;

import com.simplon.voyageaplusieurs.Service.RoleService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;



@RestController
@RequestMapping("/api/role")
@CrossOrigin(origins = "*")
public class RoleController {

    private RoleService roleService;
    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }
/**
 * Getting an Aliment with its ID.
 *
 * @param roleType the aliment ID to look for.
 * @return  the aliment if found, an Entity not found Exception otherwise
 * @see com.simplon.voyageaplusieurs.exception.DestinationApiExceptionHandler#handleEntityNotFoundException(EntityNotFoundException) for Exception handling
 */
    @GetMapping
    public Role getRoleByRoleType(@RequestParam String roleType) {
        return roleService.getRoleByRoleType(roleType);
    }


}
