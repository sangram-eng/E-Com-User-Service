package com.us.mapper;

import com.us.dto.AddressDto;
import com.us.entity.Address;

public class AddressMapper {

    public static AddressDto mapToSddressDto(Address address, AddressDto addressDto) {
    	addressDto.setCityName(address.getCityName());
    	addressDto.setStateName(address.getStateName());
    	addressDto.setPinCode(address.getPinCode());
        return addressDto;
    }

    public static Address mapToAddress(AddressDto addressDto, Address address) {
    	address.setCityName(addressDto.getCityName());
    	address.setStateName(addressDto.getStateName());
    	address.setPinCode(addressDto.getPinCode());
        return address;
    }

}
