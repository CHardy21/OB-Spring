package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

	public NotificationService() {
		super();
	    System.out.println("Ejecutando constructor NotificationService");
	}
	
	
	public void imprimeSaludo(){
		
		System.out.println("Saludos desde la clase NotificationService...");

	}


	
}
