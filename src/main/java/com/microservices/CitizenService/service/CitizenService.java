package com.microservices.CitizenService.service;

import com.microservices.CitizenService.dto.CitizenDTO;
import com.microservices.CitizenService.entity.Citizen;

import java.util.List;

public interface CitizenService {

    List<CitizenDTO> getAllCitizen();
    CitizenDTO getById(Integer id);

    Citizen save(Citizen citizen);
}
