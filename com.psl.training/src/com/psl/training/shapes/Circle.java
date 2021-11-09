package com.psl.training.shapes;

public class Circle extends Shape implements Bouncable{
	public void draw()
	{
		System.out.println("Draw Circle ");
	}
	public void bounce(){
		System.out.println("Circle is bouncing in "+DIRECTION);
	}

}
