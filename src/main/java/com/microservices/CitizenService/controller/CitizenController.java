package com.microservices.CitizenService.controller;


import com.microservices.CitizenService.dto.CitizenDTO;
import com.microservices.CitizenService.entity.Citizen;
import com.microservices.CitizenService.repository.CitizenRepository;
import com.microservices.CitizenService.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenService service;


    @GetMapping(("/"))
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello", HttpStatus.OK);

    }
    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllCitizen(){
        List<CitizenDTO> citizenDTOList =  service.getAllCitizen().stream().filter(citizenDTO -> )
        return new ResponseEntity<>(citizenDTOList,HttpStatus.ACCEPTED);
    }


    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id){
        CitizenDTO citizenDTO =  service.getById(id);
        return new ResponseEntity<>(citizenDTO,HttpStatus.OK);

    }


//    @GetMapping("/{id}")
//    public CitizenDTO getProductById(@PathVariable Integer id){
//
//        return service.getById(id);
//
//    }

    @PostMapping(value = "/citizen")
    public ResponseEntity<Citizen> save(@RequestBody Citizen citizen){
        Citizen save = service.save(citizen);
        return new ResponseEntity<>(save,HttpStatus.CREATED);
    }



}
