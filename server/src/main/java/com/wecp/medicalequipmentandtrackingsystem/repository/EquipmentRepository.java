package com.wecp.medicalequipmentandtrackingsystem.repository;


import com.wecp.medicalequipmentandtrackingsystem.entitiy.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment,Long>
{
    // extent jpa repository and add custom methods if needed
   
    List<Equipment> findByHospitalId(Long hospitalId);
}
