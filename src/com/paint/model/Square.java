package com.paint.model;

public class Square extends Shape{
	//atributos
	private double side = 0;
	
	//constructores
		public Square() {
			//vacio
		}
	//constructores parametrizado
		public Square(double side) {
			this.side = side;
		}
		
	//metodos
		
		public double CalculateArea() {
			return this.side*2;
		}
		
		public double CalculatePerimeter() {
			return this.side*4;
		}
		
	//geters and setters
		
		//get
		
		public double getSide() {
			return this.side;
		}
		
		//set
		
		public void setSide(double side) {
			this.side = side;
		}
	
}
