package com.shakirov.springboot312.repo;

import com.shakirov.springboot312.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
