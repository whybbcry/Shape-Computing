/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscLib;

/**
 *
 * @author whybbcry
 */

import javax.swing.JOptionPane;

public abstract class SimpleInput {

	public static int getInteger(String prompt) {
		do {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
			}
			catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Invalid integer!");
			}
		} while (true);
	}

	public static float getFloat(String prompt) {
		do {
			try {
				return Float.parseFloat(JOptionPane.showInputDialog(null, prompt));
			}
			catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Invalid number!");
			}
		} while (true);
	}

	public static String getString(String prompt) {
		return JOptionPane.showInputDialog(null, prompt);
	}

	public static char getChar(String prompt) {
		String s;
		do {
				s = JOptionPane.showInputDialog(null, prompt);
				if (s.length() == 1)
					return s.charAt(0);
			} while (true);
	}


} // class SimpleInput