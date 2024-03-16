package com.us.mapper;


import com.us.dto.UserRegDto;
import com.us.entity.UserReg;

public class UserMapper {

    public static UserRegDto mapToUserRegDto(UserReg user, UserRegDto userDto) {
    	userDto.setName(user.getName());
    	userDto.setEmail(user.getEmail());
    	userDto.setMobileNumber(user.getMobileNumber());
    	userDto.setAddressId(user.getAddressId());
        return userDto;
    }

    public static UserReg mapToAccounts(UserRegDto uerDto, UserReg user) {
    	user.setName(uerDto.getName());
    	user.setEmail(uerDto.getEmail());
    	user.setMobileNumber(uerDto.getMobileNumber());
    	user.setAddressId(uerDto.getAddressId());
        return user;
    }

}
