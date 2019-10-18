package com.poo.app;
import java.util.Scanner;

import com.paint.model.*;

public class App {
	public static void main(String[] args) {
		
		//declaracion de variables
			//para el circulo
				double radio = 0;
			//para el triangulo
				double base = 0;
				double altura = 0;
			//menu
				int respuesta = 0;
			//cuadrado
				double lado = 0;
				
		//creacion de objetos
			//Scanner
				Scanner input = new Scanner(System.in);
			//Circulo
				Circle circulo = new Circle();
			//Triangulo
				Triangle triangulo = new Triangle();
			//cuadrado
				Square cuadrado = new Square();
			
		//output menu
				System.out.println("Menu");
				System.out.println("[1] Circulo: perimetro y radio");
				System.out.println("[2] Triangulo: perimetro y area");
				System.out.println("[3] Cuadrado: perimetro y area");
				
		//leer respuesta de menu
				respuesta = input.nextInt();
		
		//switch menu
				
				switch(respuesta) {
				case 1: 
					//pedir radio al usuario para un circulo
						System.out.println("Ingresa un radio");
						radio = input.nextDouble();
					
					//creamos un circulo con ese radio
					    circulo = new Circle(radio);
				    
				    //output circulo
					    System.out.println("el area del circulo es: "+circulo.CalculateArea());
					    System.out.println("el perimetro del circulo es: "+circulo.CalculatePerimeter());
					    
					//salto de linea
					    System.out.println("");	   
					    
					    break;
					
				case 2:
				    
					 //pedir base y altura para un triangulo al usuario
					    System.out.println("Ingresa la base");
					    base = input.nextDouble();
					    System.out.println("Ingresa la altura");
					    altura = input.nextDouble();
					    
					 //creacion de objeto
					    triangulo = new Triangle(base,altura);
					    
					 //output triangulo
					    System.out.println("El area del triangulo es: "+triangulo.CalculateArea());
					    System.out.println("El perimetro del triangulo es: "+triangulo.CalculatePerimeter());
					   
				    
					    break;
				
				case 3:
					
					//pedir el lado del cuadrado
					System.out.println("Ingresa el lado");
					lado = input.nextDouble();
					
					cuadrado = new Square(lado);
					
					//imprimimos el area
					System.out.println("El area del cuadrado es: "+cuadrado.CalculateArea());
					//imprimimos el perimetro
					System.out.println("El perimetro del cuadrado es: "+cuadrado.CalculatePerimeter());
					
					
					break;
				}
	}
}
