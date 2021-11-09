package com.psl.training.shapes;

public class Square extends Shape implements Rotatable{
	public void draw()
	{
		
	}
	public void rotate()
	{
		System.out.println("Square is rotating "+DIRECTION);
	}
}
