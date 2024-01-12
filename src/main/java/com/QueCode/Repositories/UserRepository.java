package com.QueCode.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QueCode.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	public Optional<User> findByEmail (String email);
}
