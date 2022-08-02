package com.microservices.CitizenService.dto;


import com.microservices.CitizenService.entity.Citizen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CitizenDTO {

    private Integer id;

    private String name;


    private Integer vaccinationCenterId;

    public CitizenDTO ( Citizen citizen){
        this.id = citizen.getId();
        this.name = citizen.getName();
        this.vaccinationCenterId = citizen.getVaccinationCenterId();
    }

}
