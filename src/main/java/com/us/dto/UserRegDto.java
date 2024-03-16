package com.us.dto;


import org.hibernate.annotations.BatchSize;

import com.us.entity.Address;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import jakarta.validation.constraints.Size;

@Data
@Schema(
        name = "user",
        description = "Schema to hold User and Account information"
)
public class UserRegDto {
	

    @NotEmpty(message = "User Id can not be a null or empty")
    @Schema(
            description = "User Id of user account", example = "1"
    )
    private Long id;


    @Schema(
            description = "Name of the user", example = "XYZ"
    )
    @NotEmpty(message = "Name can not be a null or empty")
   @BatchSize(min = 5, max = 30, message = "The length of the user name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the user", example = "xyz@123.com"
    )
    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the user", example = "9345432123"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Adreess details of the User"
    )
    private Address addressId;
}
