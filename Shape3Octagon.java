// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
   public void drawShape(Graphics g)
   {
	   Polygon p = new Polygon();
		 p.addPoint(100,400);
		 p.addPoint(100,450);
		 p.addPoint(150,500);
		 p.addPoint(200,500);
		 p.addPoint(250,450);
		 p.addPoint(250,400);
		 p.addPoint(200,350);
		 p.addPoint(150,350);

		 g.fillPolygon(p);
		
   }
   public void displayName (Graphics g)
   {
		  g.drawString("Octagon",20 ,320);

   }
   public void displayNumSides (Graphics g)
   {
	   g.drawString("A Octagon has 8 sides. ",20  ,575 ); 

   }
}

