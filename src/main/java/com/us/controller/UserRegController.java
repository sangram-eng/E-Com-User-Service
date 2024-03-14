package com.us.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.us.bean.UserRegInfo;
import com.us.entity.UserReg;
import com.us.exception.UserNotFoundException;
import com.us.repository.UserRegRepository;
import com.us.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserRegController {
	@Autowired
	UserService userService ;
	
	UserRegRepository userRegRepository;      
	
	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	UserReg register(@RequestBody UserRegInfo userReginfo) {
		return userService .register(userReginfo);		
	}
	 @PutMapping("/edit/{id}")
	 UserReg  update(@RequestBody UserReg newUser, @PathVariable Long id) {
	        return userRegRepository.findById(id)
	                .map(user -> {
	                    user.setName(newUser.getName());
	                    user.setEmail(newUser.getEmail());
	                    user.setMobileNumber(newUser.getMobileNumber());
	                    return userRegRepository.save(user);
	                }).orElseThrow(() -> new UserNotFoundException(id));
	    }
	@GetMapping("/getAll")
	
	public List<UserReg> getAll(){
		
		return userRegRepository.findAll();
	}
	 
    @GetMapping("/getAll/{id}")
    UserReg getUserById(@PathVariable Long id) {
        return userRegRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/delete/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRegRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRegRepository .deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

}
