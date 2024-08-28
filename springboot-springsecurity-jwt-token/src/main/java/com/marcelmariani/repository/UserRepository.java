package com.marcelmariani.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.marcelmariani.entity.User;

public interface UserRepository extends CrudRepository<User, String> {
	Optional<User> findByUsername(String username);
}