import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {
	public static void main(String args[]) {
		JWindow window = new JWindow();
		ImageIcon icon = new ImageIcon("test.jpg");
		JLabel label = new JLabel(icon);

		window.setSize(icon.getIconWidth() , icon.getIconHeight());
		window.setLocation(100 , 100);
		window.getContentPane().add(label);
		window.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		window.show();		
	}
}