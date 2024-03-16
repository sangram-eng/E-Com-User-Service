package com.us.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Schema(
        name = "UserAddress",
        description = "Schema to hold User Address information"
)
public class AddressDto {


    @NotEmpty(message = "City name can not be a null or empty")
    @Schema(
            description = "This is user city name", example = "Bhubaneswar"
    )
    private String cityName;

    @NotEmpty(message = "State name can not be a null or empty")
    @Schema(
            description = "This is user state name", example = "Odisha"
    )
    private String stateName;
    
    @NotEmpty(message = "Pin code can not be a null or empty")
    @Schema(
            description = "This is user pin code", example = "75133"
    )
    private String pinCode;
}
