package com.paint.model;
import java.lang.Math;

public class Triangle extends Shape{
	
	//declaracion de variables
		private double base = 0;
		private double altura = 0;
	
	//constructores
		public Triangle(){
			//vacio
		}
		
		public Triangle(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}
		
	//metodos
		public double CalculateArea() {
			return (this.base*this.altura)/2;
		}
		
		public double Perimeter() {
			
			double hypotenuse = 1;
			hypotenuse = Math.sqrt((this.base*this.base) + (this.altura*this.altura));
			return this.base+this.altura+hypotenuse;
		}
		
	//geters and seters
		
		//geters
		
			double getBase() {
				return this.base;
			}
			
			double getAltura() {
				return this.altura;
			}
		
		//seters
		
			void setBase(double base) {
				this.base = base;
			}
			
			void setAltura(double altura) {
				this.altura = altura;
			}
}
