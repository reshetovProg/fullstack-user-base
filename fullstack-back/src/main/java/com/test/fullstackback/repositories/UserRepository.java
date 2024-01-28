package com.test.fullstackback.repositories;

import com.test.fullstackback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
