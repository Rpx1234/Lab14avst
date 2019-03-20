// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   public void drawShape(Graphics g)
   {
	   g.fillOval(500, 330, 200, 200);
   }   
   public void displayName(Graphics g)

   {
	  g.drawString("Circle",450 ,320);
   }
   public void displayNumSides(Graphics g)
   {
	   g.drawString(" A Circle has 0s sides.",450  ,575 ); 
  
   }
}
