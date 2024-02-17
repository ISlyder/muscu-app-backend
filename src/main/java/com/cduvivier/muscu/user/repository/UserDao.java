package com.cduvivier.muscu.user.repository;

import com.cduvivier.muscu.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String username);
}
