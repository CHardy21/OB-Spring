package com.example.restcontroller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Book;
import com.example.repository.BookRepository;

@RestController
public class BookController {
	
	private final Logger log = LoggerFactory.getLogger(BookController.class);
	
	private BookRepository bookRepository;
		public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	
	// Listar todos los books
	@GetMapping("/api/books")
	public List<Book> findAll(){
		return bookRepository.findAll();
	}
	
	// mostrar un book por su id
	@GetMapping("/api/books/{id}")
	public ResponseEntity<Book> findById(@PathVariable Long id){
		Optional<Book> bookOpt = bookRepository.findById(id);
		
		if(bookOpt.isPresent()) {
			return ResponseEntity.ok(bookOpt.get());
		} else {
			return ResponseEntity.notFound().build();
		}
		// return bookOpt.orElse(null);
	}
	
	// persistir un book
	@PostMapping("/api/books")
	public ResponseEntity<Book> create(@RequestBody Book book) {
		// verifico si me estan pasando un id
		if(book.getId() != null) {
			log.warn("log: trying to create book with id");
			System.out.println("trying to create book with id");
			
			return ResponseEntity.badRequest().build();
		} else {
			Book response = bookRepository.save(book);
		return ResponseEntity.ok(response);
		}
	}
	
	// actualizar info de un book
	
	
}
