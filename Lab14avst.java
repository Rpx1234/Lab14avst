// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{
 public void paint(Graphics g)
 {
	 
  drawGrid(g);

  Shape oct = new Shape3Octagon();
  Shape Triangle = new Shape2Triangle();
  Shape square = new Shape1Square();
  Shape circle = new Shape4Circle();

  ArrayList<Shape> shapes = new ArrayList();
  shapes.add(oct);
  shapes.add(square);
  shapes.add(Triangle);
  shapes.add(circle);


	 for(Shape shape : shapes)
	 {
		 shape.drawShape(g);
		 shape.displayName(g);
		 shape.displayNumSides(g);
	 }
	  
	  
	  
	  
 }
 

 public void drawGrid(Graphics g)
 {
  g.drawRect(10,10,800,600);
  g.drawLine(10,300,810,300);
  g.drawLine(410,10,410,610);
 }
}

