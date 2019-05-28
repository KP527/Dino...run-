import javax.swing.*;
import java.awt.*;
/*****************************************************************
   * A Cactus is an extension of the abstract class Obstacle who's only
   * new field in myNumber which is the number of cacti in a group at a
   * given time. Everything else is called from the Obstacle class. It knows
   * how to move across the display.
   ****************************************************************/
public class Cactus extends Obstacle
{
   private int myNumber, myX, myY, myHeight, myLength, mySpeed;
       private ImageIcon cacc = new ImageIcon("Cactus-1.png");    
  
   /**************************************************************
    * Constructs a catus with the fields myX, myY, myHeight, myLength
    * from the super
    **************************************************************/
  
   public Cactus()
   {
      super();
   }
   /**************************************************************
    * Constructs a catus with the fields myX, myY, myHeight, myLength
    * from the super
    **************************************************************/
   public Cactus(int x, int y, int h, int l, int s)
   {
      super(x, y, h, l, s);
   }
   /**************************************************************
    * Constructs a catus with the fields myX, myY, myHeight, myLength
    * from the super and it sets myNumber
    **************************************************************/
   public Cactus(int x)
   {
      super();
   }

   
   public void draw(Graphics myBuffer)
   {
      setX(getX() -10);
      myBuffer.drawImage(cacc.getImage(), myX, myY, myLength, myHeight, null);
      
   }
   
   public void move()
      {
         setX(myX +  mySpeed); 
         if(getX() >= 0)  //hit right edge
        {
            setX(100); 
        }               // move horizontally
        
      }


 }


