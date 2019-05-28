
//Torbert, e-mail: smtorbert@fcps.edu
//version 6.17.2003
//Billington, version 7.25.2007

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//import

@SuppressWarnings("serial")
public class DinoPanel extends JPanel {
	private static final int FRAME1 = 1000;
	private static final int FRAME2 = 400;
	private static final Color BACKGROUND = new Color(204, 204, 204);

	private BufferedImage myImage;
	private Graphics myBuffer;
	// private Ball ball;
	private Timer t;
	private Dino a;
//	private Key key;
	//private Listener listener;

	public DinoPanel() {
		myImage = new BufferedImage(FRAME1, FRAME2, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();
		myBuffer.setColor(BACKGROUND); // cover the
			myBuffer.fillRect(0, 0, FRAME1, FRAME2); // old ball
			myBuffer.setColor(new Color(196, 196, 196));
			myBuffer.fillRect(0, 300, FRAME1, FRAME2);
		
		myBuffer.setColor(new Color(100, 100, 100));
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
         myBuffer.drawString("Up makes the dino stand, Space makes it jump, and Down makes it duck", 100, 80);
         myBuffer.drawString("Press Up to start the game!", 100, 100);
         
         a = new Dino();
         a.draw(myBuffer);
		// int yPos = (int)(Math.random()*(FRAME2-100)+ 50);

		//listener = new Listener();
//		key = new Key();



		// t = new Timer(5, listener);
// 		t.start();

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_UP) {
		   myBuffer.setColor(BACKGROUND); // cover the
			myBuffer.fillRect(0, 0, FRAME1, FRAME2); // old ball
			myBuffer.setColor(new Color(196, 196, 196));
			myBuffer.fillRect(0, 300, FRAME1, FRAME2);

			a.draw(myBuffer);

			repaint();
 				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) 
            {
         myBuffer.setColor(BACKGROUND); // cover the
			myBuffer.fillRect(0, 0, FRAME1, FRAME2); // old ball
			myBuffer.setColor(new Color(196, 196, 196));
			myBuffer.fillRect(0, 300, FRAME1, FRAME2);

			a.duck(myBuffer);

			repaint();
				}
         if (e.getKeyCode() == KeyEvent.VK_SPACE) 
         {
		   myBuffer.setColor(BACKGROUND); // cover the
			myBuffer.fillRect(0, 0, FRAME1, FRAME2); // old ball
			myBuffer.setColor(new Color(196, 196, 196));
			myBuffer.fillRect(0, 300, FRAME1, FRAME2);

			a.jump(myBuffer);

			repaint();
 				}

			}
		});
		
		setFocusable(true);
		requestFocusInWindow();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

// 	private class Listener implements ActionListener {
// 		public void actionPerformed(ActionEvent e) {
// 		
// 		}
// 	}

//	private class Key extends KeyAdapter {
//		public void keyPressed(KeyEvent e) {
//			if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_SPACE) {
//				System.out.println("Check");
//				a.jump(FRAME1, FRAME2, myBuffer);
//			}
//			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//				// display.duck();
//			}
//		}
//	}
}
