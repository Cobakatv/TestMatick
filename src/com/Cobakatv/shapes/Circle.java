package com.Cobakatv.shapes;

import java.lang.Math;

public class Circle extends Shape
{
	private double rad;
	
	public Circle()
	{
		rad = Math.random()*100+1;
		area = Math.PI * rad * rad;
	}
	
	
	public double getRadius() 
	{
		return rad;
		
	}
	
	public String toString() 
	{
		return "Circle";
	}

}
