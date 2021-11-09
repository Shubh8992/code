package com.psl.training.shapes;

public class Triangle extends Shape implements Rotatable,Bouncable{
	public void draw()
	{
		
	}
	public void bounce()
	{
		System.out.println("triangle is bouncing in "+Bouncable.DIRECTION);
	}
	public void rotate() {
		
		System.out.println("triangle is rotating in "+Rotatable.DIRECTION);
	}
}
