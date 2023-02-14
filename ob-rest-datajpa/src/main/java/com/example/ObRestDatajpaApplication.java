package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.entities.Book;
import com.example.entities.Laptop;
import com.example.repository.BookRepository;
import com.example.repository.LaptopRepository;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		// CRUD
		// crear libro
		Book book1 = new Book(null, "Homo Deus", "Yuval Noah", 450, 29.99, LocalDate.of(2018, 12, 1), true);
		Book book2 = new Book(null, "Homo Sapiens", "Yuval Noah", 450, 19.99, LocalDate.of(2013, 12, 1), true);
		// almacenar un libro
		//System.out.println("Num libros en base de datos: " + repository.findAll().size());

		repository.save(book1);
		repository.save(book2);

		// recuperar todos los libros
		//System.out.println("Num libros en base de datos: " + repository.findAll().size());

		// borrar un libro
		// repository.deleteById(1L);

		
		
		// crear libro
		Laptop laptop1 = new Laptop(null, "Sony Vaio", "Sony", "i7", 8.0, 2.0, LocalDate.of(2018, 10, 01), true);
		Laptop laptop2 = new Laptop(null, "Series 500 Dell", "Dell", "i7", 8.0, 2.0, LocalDate.of(2021, 12, 01), true);
		Laptop laptop3 = new Laptop(null, "Lenovo h4500", "Lenevo", "i5", 8.0, 1.0, LocalDate.of(2020, 05, 15), true);
		
		// persistiendo objetos creados
		
		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
		laptopRepository.save(laptop3);
		
		// recuperar todos los registros en DB
		Integer numLibrosEnDB = repository.findAll().size();
		Integer numLaptopsEnDB = laptopRepository.findAll().size();
		
		System.out.println("----------------------------------");
		System.out.println("Num Libros en DB:  " + numLibrosEnDB);
		System.out.println("Num Laptops en DB: " + numLaptopsEnDB);

		
	}

}