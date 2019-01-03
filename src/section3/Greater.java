package section3;

import javax.swing.JOptionPane;

public class Greater {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Hi there " + name);
	}

}
