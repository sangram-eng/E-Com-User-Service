package com.us.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.us.entity.UserReg;


@Repository
public interface UserRegRepository extends JpaRepository<UserReg, Long> {
	Optional<UserReg> findById(Long id);
  

}
