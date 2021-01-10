package com.Cobakatv.shapes;

import java.lang.Math;

public abstract class Shape 
{
	
	protected double area;
	protected String color;
	
	public Shape() 
	{
		int col = (int)(Math.random() * 7);
		switch(col)
		{
		case 0:
			color = "red";
			break;
		case 1:
			color = "orange";
			break;
		case 2:
			color = "yellow";
			break;
		case 3:
			color = "green";
			break;
		case 4:
			color = "blue";
			break;
		case 5:
			color = "dark blue";
			break;
		case 6:
			color = "purple";
			break;
		default:
			color = "white";
			break;
		}
	}
	
	public double getArea()
	{
		return area;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public abstract String toString(); 
}
