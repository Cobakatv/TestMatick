package com.Cobakatv.shapes;

import java.lang.Math;

public class Square extends Shape
{
	private double side;
	
	public Square()
	{
		side = Math.random()*100 + 1;
		area = side * side;
	}
	
	
	public double getSide()
	{
		return side;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square";
	}
}
