// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
	
   public void drawShape(Graphics g)
   {
	 Polygon p = new Polygon();
	 p.addPoint(600,50);
	 p.addPoint(500,200);
	 p.addPoint(700,200);
	 g.fillPolygon(p);
   }
   public void displayName(Graphics g)
   {
	  g.drawString("Triangle",450 ,30);
   }
   public void displayNumSides(Graphics g)
   {
	   g.drawString(" A Triangle has 3 sides.",450  ,275 ); 
  
   }
   

}

