package com.example.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

	// atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String marca;
    private String fabricante;
    private String procesador;
    private Double ram;
    private Double capacidadDisco;
    private LocalDate releaseDate;
    private Boolean online;
	
    // costructores
    public Laptop() {
		super();
	}


	public Laptop(Long id, String marca, String fabricante, String procesador, Double ram, Double capacidadDisco,
			LocalDate releaseDate, Boolean online) {
		super();
		this.id = id;
		this.marca = marca;
		this.fabricante = fabricante;
		this.procesador = procesador;
		this.ram = ram;
		this.capacidadDisco = capacidadDisco;
		this.releaseDate = releaseDate;
		this.online = online;
	}

	
	// getters y setters
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public Double getRam() {
		return ram;
	}


	public void setRam(Double ram) {
		this.ram = ram;
	}


	public Double getCapacidadDisco() {
		return capacidadDisco;
	}


	public void setCapacidadDisco(Double capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
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
