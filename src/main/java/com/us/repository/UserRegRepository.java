package com.us.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.us.entity.UserReg;

public interface UserRegRepository extends JpaRepository<UserReg, Long>{
	
	UserReg findByName(String name);
	 
}
