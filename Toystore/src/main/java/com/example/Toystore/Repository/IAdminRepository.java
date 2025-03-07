package com.example.Toystore.Repository;

import com.example.Toystore.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface IAdminRepository extends JpaRepository<Admin,Long> {


    Optional<Object> findByEmailAddress(String username);
}
