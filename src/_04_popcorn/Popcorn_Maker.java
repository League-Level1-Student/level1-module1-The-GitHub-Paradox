package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Maker {
	public static void main(String[] args) {
		System.out.println("Microwave has been made");
		String s = JOptionPane.showInputDialog("What flavour do you want your Popcorn to be?");
		System.out.print("Adding " + s + " flavour to popcorn");
		String s1 = JOptionPane.showInputDialog("How long do you want your popcorn to be cooked?");
		System.out.println("                           Microwave set to " + s1 + " minutes");
		System.out.println(s1 + " minutes later");
		String s2 = JOptionPane.showInputDialog("Eat the " + s + " flavoured popcorn?");
		if(s2.equals("Yes")) {
			System.out.println("Eating Popcorn...");
		}
		else {
			System.out.println("You decided not to eat the popcorn.");
		}
	}
}
