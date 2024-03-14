package com.us.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.us.bean.UserRegInfo;
import com.us.entity.UserReg;
import com.us.repository.UserRegRepository;

@Service
public class UserService {
	
	@Autowired
	UserRegRepository userRegRepository;
	
	public UserReg register(UserRegInfo userRegInfo) {
		return userRegRepository.save(userRegInfo.convertToEntity());
	}
	
	public UserReg update(UserReg UserReg) {
		return userRegRepository.save(UserReg);
	}
	
	public List<UserReg> getAll() {
		return userRegRepository.findAll();
	}
	
	public Optional<UserReg> getById(Long id) {
		return userRegRepository.findById(id);
	}
	
	public void delete(Long id) {
		userRegRepository.deleteById(id);
	}
	

}
