package com.microservices.CitizenService.repository;

import com.microservices.CitizenService.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {


}
