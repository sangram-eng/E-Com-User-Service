package com.us.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address extends BaseEntity{
	
	@Column(name="address_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column(name="city_name")
     private String cityName;

    @Column(name="state_name")
    private String stateName;

    @Column(name="pin_code")
    private String pinCode;


}
