package com.paint.model;

public class Shape implements Shapeable {

	@Override
	public String Draw() {
		// TODO Auto-generated method stub
		return "Estamos dibujando la figura";
	}

	@Override
	public String ChangeColor() {
		// TODO Auto-generated method stub
		return "Figura esta cambiando de color";
	}

	@Override
	public String Erease() {
		// TODO Auto-generated method stub
		return "Estamos borrando la figura";
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stu
		return 0;
		
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
