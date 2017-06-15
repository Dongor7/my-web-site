package com.example.demo.repositories;

import com.example.demo.domain.User;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(@NonNull String username);
}
