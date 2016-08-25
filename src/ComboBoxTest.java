
// Fig. 11.22: ComboBoxTest.java
// Testing ComboBoxFrame.
import javax.swing.JFrame;

public class ComboBoxTest
{
	public static void main(String args[])
	{
		ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
		comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		comboBoxFrame.setSize(350, 150); // set frame size
		comboBoxFrame.setVisible(true); // display frame
	} // end main
} // end class ComboBoxTest