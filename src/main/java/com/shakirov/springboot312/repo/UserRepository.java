package com.shakirov.springboot312.repo;

import com.shakirov.springboot312.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    User findByEmail(String email);
    User findByName(String name);

}
