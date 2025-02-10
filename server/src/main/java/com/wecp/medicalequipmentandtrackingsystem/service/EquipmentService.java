package com.wecp.medicalequipmentandtrackingsystem.service;


import com.wecp.medicalequipmentandtrackingsystem.entitiy.Equipment;
import com.wecp.medicalequipmentandtrackingsystem.entitiy.Hospital;
import com.wecp.medicalequipmentandtrackingsystem.repository.EquipmentRepository;
import com.wecp.medicalequipmentandtrackingsystem.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EquipmentService 
{
    @Autowired 
    private EquipmentRepository equipmentRepository;

    @Autowired 
    private HospitalRepository hospitalRepository;

    public Equipment addEquipment(Long hospitalId,Equipment equipment) 
    {
        Hospital hospital=hospitalRepository.findById(hospitalId).orElse(null);
        if(hospital!=null)
        {
            equipment.setHospital(hospital);
            return equipmentRepository.save(equipment);
        }
        return null;
    }

    public List<Equipment> getAllEquipmentsOfHospital(Long hospitalId)
    {
        return equipmentRepository.findByHospitalId(hospitalId);
    }
}
