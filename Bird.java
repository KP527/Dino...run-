import javax.swing.*;
import java.awt.*;

public class Bird extends Obstacle
{
  
    
    private int myX, myY, myHeight, myLength, mySpeed;
    private ImageIcon borb = new ImageIcon("bird bird.png");    
    /**************************************************************
    * Constructs a bird with the fields myX, myY, myHeight, myLength
    * from the super
    **************************************************************/
  
   public Bird()
   {
      super();
   }
    /**************************************************************
    * Constructs a bird with the fields myX, myY, myHeight, myLength
    * from the super 
    **************************************************************/
   public Bird(int x, int y, int h, int l, int s)
   {
     super(x, y, h, l, s);
   }
    /**************************************************************
    * Sets the hight of where the bird flies
    **************************************************************/  

   public void draw(Graphics myBuffer)
   {
     setX(getX() -10);
      myBuffer.drawImage(borb.getImage(), myX, myY, myLength, myHeight, null);
   }
   
}


