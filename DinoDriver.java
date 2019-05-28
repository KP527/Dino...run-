
import javax.swing.JFrame;

public class DinoDriver {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Dino run?");
		frame.setSize(1000, 400);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new DinoPanel());
		frame.setVisible(true);
	}
}