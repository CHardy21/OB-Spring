package com.example.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Book;
import com.example.entities.Laptop;
import com.example.repository.LaptopRepository;

@RestController
public class LaptopController {
	
	private LaptopRepository laptopRepository;
	public LaptopController(LaptopRepository laptopRepository) {
		super();
		this.laptopRepository = laptopRepository;
	}
	
	
	@GetMapping("/api/laptops")
	public List<Laptop> findAll(){
		return laptopRepository.findAll();
	}

	@PostMapping("/api/laptops")
	public Laptop create(@RequestBody Laptop laptop) {
		return laptopRepository.save(laptop);
	}
	
}
