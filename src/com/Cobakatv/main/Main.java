package com.Cobakatv.main;

import java.lang.Math;
import com.Cobakatv.shapes.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape Shapes[] = new Shape[(int) (Math.random()*100 + 1)];
		
		for(int i = 0;i < Shapes.length;i++)
		{
			int shape = (int) (Math.random()*4);
			
			if(shape == 0)
				Shapes[i] = new Circle();
			if(shape == 1)
				Shapes[i] = new Square();
			if(shape == 2)
				Shapes[i] = new Trapezoid();
			if(shape == 3)
				Shapes[i] = new Triangle();
		}
		
		System.out.println("Program created "+Shapes.length+" shapes");
		
		for(Shape shape:Shapes)
		{
			double area = shape.getArea();
			double uniqLength = 0;
			String uniq = "";
			if(shape instanceof Circle)
			{
				uniqLength = ((Circle)shape).getRadius();
				uniq = "radius";
			}
			if(shape instanceof Square)
			{
				uniqLength = ((Square)shape).getSide();
				uniq = "length of side";
			}
			if(shape instanceof Trapezoid)
			{
				uniqLength = ((Trapezoid)shape).getHeight();
				uniq = "height";
			}
			if(shape instanceof Triangle)
			{
				uniqLength = ((Triangle)shape).getHypotenuse();
				uniq = "hypotenuse";
			}
			System.out.printf("Shape: %s, area is %.1f sq. units, %s is %.1f units, color is %s \n", shape.toString(), area, uniq, uniqLength, shape.getColor());
		}
		
		
	}
}
