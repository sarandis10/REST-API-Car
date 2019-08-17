package com.sarandis;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	@Autowired
	CarRepository repo;
	
	@RequestMapping("cars")
	public List<Car> getCars(){
		
		List<Car> cars= (List<Car>) repo.findAll();
		
		return cars;
	}
}
