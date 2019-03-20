// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
   public void drawShape(Graphics g)
   {
	   g.fillRect(100,50,200,200);
	   
   }
   public void displayName(Graphics g)
   {
	  g.drawString("Square",20 ,30);
   }
   public void displayNumSides(Graphics g)
   {
	   g.drawString(" A Square has 3 sides.",20  ,275 ); 
  
   }

}

