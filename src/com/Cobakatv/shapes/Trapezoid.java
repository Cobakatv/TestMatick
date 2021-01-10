package com.Cobakatv.shapes;

import java.lang.Math;

public class Trapezoid extends Shape
{
	private double height,  firstSide, secondSide;
	
	public Trapezoid()
	{
		height = Math.random() * 100 + 1;
		firstSide = Math.random() * 100 + 1;
		secondSide = Math.random() * 100 + 1;
		area = ((firstSide+secondSide)/2)*height;
	}
	
	public double getHeight()
	{
		return height;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trapezoid";
	}

}
