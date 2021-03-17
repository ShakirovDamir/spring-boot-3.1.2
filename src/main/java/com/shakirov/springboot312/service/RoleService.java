package com.shakirov.springboot312.service;

import com.shakirov.springboot312.model.Role;

import java.util.Set;

public interface RoleService {
    void createRoles(Set<Role> roles);
    Set<Role> getAllRoles();
}