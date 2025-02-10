package com.wecp.medicalequipmentandtrackingsystem.repository;
 
 
import com.wecp.medicalequipmentandtrackingsystem.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
 
@Repository
public interface UserRepository extends JpaRepository<User,Long>  
{
    
    User findByUsername(String username);
}
