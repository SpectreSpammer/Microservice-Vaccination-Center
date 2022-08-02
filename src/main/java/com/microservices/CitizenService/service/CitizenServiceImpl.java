package com.microservices.CitizenService.service;


import com.microservices.CitizenService.dto.CitizenDTO;
import com.microservices.CitizenService.entity.Citizen;
import com.microservices.CitizenService.exception.CitizenException;
import com.microservices.CitizenService.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CitizenServiceImpl implements CitizenService{


    @Autowired
    CitizenRepository repository;


    @Override
    public List<CitizenDTO> getAllCitizen() {
        List<CitizenDTO> citizenDTOList = repository.findAll().stream().map(CitizenDTO::new).collect(Collectors.toList());
        return citizenDTOList;
    }

    @Override
    public CitizenDTO getById(Integer id) {
       Citizen citizen = repository.findById(id).orElseThrow(() -> new CitizenException(" Citizen Id " + id + " not found "));
        return new CitizenDTO(citizen);
    }

    @Override
    public Citizen save(Citizen citizen) {
        return repository.save(citizen);
    }


}
