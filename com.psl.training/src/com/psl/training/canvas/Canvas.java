package com.psl.training.canvas;
import com.psl.training.shapes.*;
import com.psl.training.shapes.Shape;

public class Canvas{
	
	public void drawShape(Shape s)
	{
		s.draw();
		
		if(s instanceof Circle)
			((Circle)s).bounce();//Casting from shape to circle
		if(s instanceof Square)
			((Square)s).rotate();
		if(s instanceof Triangle)
			((Triangle)s).rotate();
		if(s instanceof Triangle)
			((Triangle)s).bounce();
		
		
		if(s instanceof Bouncable)
			((Bouncable) s).bounce();//reference casting, s object of bouncable
		if(s instanceof Rotatable)
			((Rotatable) s).rotate();
	}

}
