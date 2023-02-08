package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		

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
        
/* Ejercicio 3
 * 
 * Crear un proyecto Spring Boot con las dependencias:
 * 		Spring Data JPA
 * 		H2
 * 
 */
	}

}
