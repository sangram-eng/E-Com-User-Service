package com.us.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.us.entity.*;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Optional<Address> findById(String addressId);


}
