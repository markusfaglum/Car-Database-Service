package com.carService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carService.model.cars;

@RestController()
public class apiController {

	@Autowired
	private com.carService.service.service carsRepo;
	
	@PostMapping("/addCar")
	public cars addCar(@RequestBody cars Car) {
		
		return carsRepo.saveCar(Car);
		
	}
	
	@PostMapping("/addCars")
	public List<cars> addCars(@RequestBody List<cars> Cars) {
		
		return carsRepo.saveCars(Cars);
		
	}
	
	@GetMapping("/getAllCars")
	public List<cars> getAllCars() {
		
		return carsRepo.getAllCars();
		
	}
	
	@GetMapping("/getCarBy/{licenceplate}")
	public cars getCarsByLicenceplate(@PathVariable String licenceplate) {
		
		return carsRepo.getCarByName(licenceplate);
		
	}
	
	@GetMapping("/car/{id}")
	public cars getCarsByid(@PathVariable int id) {
		
		return carsRepo.getCarByid(id);
		
	}
	
	@PutMapping("/updateCar")
	public cars updateCar(@PathVariable cars car) {
		
		return carsRepo.updateCar(car);
	}
	
	@DeleteMapping("/car/{id}")
	public String deleteCarById(@PathVariable int id) {
		
		return carsRepo.deleteCar(id);
		
		
	}
}
