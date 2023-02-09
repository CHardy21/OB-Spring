package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("----------------------");
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
		String texto = calculadora.holaMundo();
 		System.out.println(texto);        
		
/*
 * 	Ejercicio 1
 * 
 * Crear proyecto maven con la dependencia spring-context y crear una clase Saludo con un método imprimirSaludo 
 * que imprima un texto por consola.
 * Crear el archivo beans.xml con un bean para la clase Saludo.
 * Obtener el bean desde el método main y ejecutar el método imprimirSaludo.
 * 
*/
 		System.out.println("----------------------");
 		System.out.println("-    Ejercicio 1.    -");
 		System.out.println("----------------------");
 		
 		Saludo saludo = (Saludo) context.getBean("saludo");
        saludo.imprimirSaludo();
		
/*
 * Ejercicio 2
 * 
 * Crear la clase NotificationService, con un método que imprima un saludo.
 * Crear una clase UserService que tenga un atributo de clase NotificationService.
 * Utilizar la anotación @Component en cada clase.
 * Habilitar el escaneo de clases en el archivo beans.xml
 * Desde el método main, probar a obtener el bean UserService y ejecutar el método imprimirSaludo 
 * que tiene asociado el atributo de tipo NotificationService. De forma similar a la realizada en clase.
 * 
*/
 		System.out.println("----------------------");
 		System.out.println("-    Ejercicio 2.    -");
 		System.out.println("----------------------");  
 		
 		UserService saludoUserServ = (UserService) context.getBean("userService");

        saludoUserServ.notificationService.imprimeSaludo();
		
 		
 		
/* Ejercicio 3
 * 
 * Crear un proyecto Spring Boot con las dependencias:
 * 		Spring Data JPA
 * 		H2
 * 
 * En caso de querer que la base de datos se guarde en disco habrá que añadir las siguientes propiedades 
 * en el archivo application.properties:

		spring.jpa.show-sql=true
		spring.datasource.url=jdbc:h2:file:C:/data/sample
		spring.datasource.username=sa
		spring.datasource.password=
		spring.datasource.driverClassName=org.h2.Driver
		#spring.jpa.hibernate.ddl-auto=creat
		spring.jpa.hibernate.ddl-auto=update
		spring.sql.init.mode=always
		spring.jpa.defer-datasource-initialization=true
 */
 		
 		System.out.println("----------------------");
 		System.out.println("-    Ejercicio 3.    -");
 		System.out.println("----------------------");
 		
 		System.out.println(" Ver imagen Ejercicio3.png");
 		
 		
 		
 		
	}

}
