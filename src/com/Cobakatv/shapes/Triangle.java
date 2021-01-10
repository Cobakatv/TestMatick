package com.Cobakatv.shapes;

import java.lang.Math;

public class Triangle extends Shape
{
	private double firstCathetus, secondCathetus, hypotenuse;
	
	public Triangle()
	{
		firstCathetus = Math.random() * 100 + 1;
		secondCathetus = Math.random() * 100 + 1;
		hypotenuse = Math.sqrt(firstCathetus*firstCathetus + secondCathetus*secondCathetus);
		area = (firstCathetus*secondCathetus)/2;
	}
	
	public double getHypotenuse()
	{
		return hypotenuse;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle";
	}

}
