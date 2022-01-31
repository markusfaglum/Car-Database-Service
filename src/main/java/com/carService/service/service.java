package com.carService.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carService.model.cars;
import com.carService.repository.carsRepo;

@Component
public class service {
	
	@Autowired
	private carsRepo repository;
	
	public cars saveCar(cars Cars) {
		return repository.save(Cars);
	}
	
	public List<cars> saveCars(List<cars> Cars){
		return repository.saveAll(Cars);
	}
	
	public List<cars> getAllCars(){
		return repository.findAll();
	}
	
	public cars getCarByid(int id){
		return repository.findById(id).orElse(null);
	}
	
	public cars getCarByName(String licenceplate){
		return repository.findBylicenceplate(licenceplate);
	}
	
	public String deleteCar(int id) {
		repository.deleteById(id);
		return "Car Removed "+ id;
	}
	
	public cars updateCar(cars Car) {
		cars existingCars=repository.findById(Car.getId()).orElse(null);
		existingCars.setLicenceplate(Car.getLicenceplate());
		existingCars.setManufacturer(Car.getManufacturer());
		existingCars.setColor(Car.getColor());
		existingCars.setModel(Car.getModel());
		existingCars.setYear(Car.getYear());
		existingCars.setPrice(Car.getPrice());
		return repository.save(existingCars);

	}

}
