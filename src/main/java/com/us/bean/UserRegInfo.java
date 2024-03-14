package com.us.bean;

import com.us.entity.UserReg;

import lombok.Data;

@Data
public class UserRegInfo {
	private String Id;
    private String name;
    private String email;
    private String mobileNumber;
    private String address;
	
	
	public UserReg convertToEntity() {
		
		UserReg user = new UserReg();
			if(Id!=null && Id!="0")			
			user.setId(Long.valueOf(Id));
			user.setName(name);
			user.setEmail(email);
			user.setMobileNumber(mobileNumber);
			user.setAddress(address);
			return user ;
			
			
	}
}
