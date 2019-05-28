
import javax.swing.*;
import java.awt.*;

public class Dino {
	private double myX; // x and y coordinates of center
	private double myY;
	private double dx; // pixels to move each time step() is called.
	private double dy;
	private double myDiameter;
	private Color myColor;
	private double myRadius;
	private ImageIcon dino = new ImageIcon("dino.png");
   private ImageIcon duck = new ImageIcon("Dino-below.png");

	// constructors
	public Dino() // default constructor
	{
		myX = 150;
		myY = 300;
		myDiameter = 100;
		myColor = Color.RED;
		myRadius = myDiameter / 2;
	}

	public Dino(double x, double y, double d, Color c) 
   {
		myX = x;
		myY = y;
		myDiameter = d;
		myColor = c;
		myRadius = d / 2;
	}

	// accessor methods
	public double getX() {
		return myX;
	}

	public double getY() {
		return myY;
	}

	public double getDiameter() {
		return myDiameter;
	}

	public Color getColor() {
		return myColor;
	}

	public double getRadius() {
		return myRadius;
	}

	public void setdx(double x) {
		dx = x;
	}

	public void setdy(double y) {
		dy = y;
	}

	// accessor methods
	public double getdx() {
		return dx;
	}

	public double getdy() {
		return dy;
	}

	// modifier methods
	public void setX(double x) {
		myX = x;
	}

	public void setY(double y) {
		myY = y;
	}

	public void setColor(Color c) {
		myColor = c;
	}

	public void setDiameter(double d) {
		myDiameter = d;
		myRadius = d / 2;
	}

	public void setRadius(double r) {
		myRadius = r;
		myDiameter = 2 * r;
	}

	// instance methods
	// public void jump(int rightEdge, int bottomEdge, Graphics myBuffer) {
// 		//int setyval = 0;
//       setY(getY() + 40);
//       draw(myBuffer);
// 
// 	}
   
   	public void sit(int rightEdge, int bottomEdge, Graphics myBuffer) {
		//int setyval = 0;
      setY(getY() - 40);
      draw(myBuffer);

	}

	public void draw(Graphics myBuffer) 
   {
		myBuffer.drawImage(dino.getImage(), (int) (getX() - getRadius()), (int) (getY() - getRadius()),
				(int) getDiameter(), (int) getDiameter(), null);
	}
   
   public void duck(Graphics myBuffer)
   {
      myBuffer.drawImage(duck.getImage(), (int) ((getX() - getRadius())), (int) ((getY() - getRadius()*0.1)),
				(int) (getDiameter()), (int) (getDiameter()*0.5), null);

   }
   
   public void jump(Graphics myBuffer)
   {
      myBuffer.drawImage(dino.getImage(), (int) (getX() - getRadius()), (int) (getY() - getRadius()-100),
				(int) getDiameter(), (int) getDiameter(), null);
   }
}