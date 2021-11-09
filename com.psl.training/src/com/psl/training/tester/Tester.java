package com.psl.training.tester;

import java.lang.reflect.*;

import com.psl.training.canvas.Canvas;
import com.psl.training.shapes.*;

public class Tester {

	public static void main(String args[])
	{

		Canvas cobj = new Canvas();
		cobj.drawShape(new Circle());
		Shape s = new Circle();
		
		//cobj.drawShape(new Square());
		//cobj.drawShape(new Triangle());
	}
}
