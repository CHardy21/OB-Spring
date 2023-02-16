package com.example.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel("Entidad Libros")
public class Book {

	// atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer pages;
    @ApiModelProperty("Precio en Pesos Arg con dos decimales")
    private Double price;
    private LocalDate releaseDate;
    private Boolean online;

    // constructores
    
    public Book() {
    	super();
	}

	public Book(Long id, String title, String author, Integer pages, Double price, LocalDate releaseDate,
			Boolean online) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
		this.releaseDate = releaseDate;
		this.online = online;
	}
	
	// Getters y Setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Boolean getOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}
    

	
	
    
}
