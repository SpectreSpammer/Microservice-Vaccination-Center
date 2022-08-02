package com.microservices.CitizenService.entity;


import com.microservices.CitizenService.dto.CitizenDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer vaccinationCenterId;

    public Citizen ( CitizenDTO citizenDTO){
        this.id = citizenDTO.getId();
        this.name = citizenDTO.getName();
        this.vaccinationCenterId = citizenDTO.getVaccinationCenterId();
    }

}
