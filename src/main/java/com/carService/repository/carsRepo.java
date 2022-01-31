package com.carService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carService.model.cars;

@Repository
public interface carsRepo extends JpaRepository<cars,Integer> {

	 cars findBylicenceplate(String licenceplate);

}
