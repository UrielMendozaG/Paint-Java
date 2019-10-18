package com.paint.model;

public class Circle extends Shape {
	//variables
	private double radio = 0;
	private double perimetro = 0;
	
	
	//constructores
		public Circle(){
			//vacio
		}
		
	//constructor no vacio
		public Circle(double radio){
			this.radio = radio;
		}
	//metodos
		
		public double CalculateArea() {
			double pi = 3.1416;
			return pi*(this.radio*this.radio);
		}
	
		public double CalculatePerimeter() {
			double pi = 3.1416;
			return pi*2*this.radio;
		}
	
}
