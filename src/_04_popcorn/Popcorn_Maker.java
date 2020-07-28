package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Maker {
	public static void main(String[] args) {
		Popcorn p = new Popcorn("Caramel");
		Microwave m = new Microwave();
		m.putInMicrowave(p);
		m.setTime(3);
		m.startMicrowave();
		p.applyHeat();
		
}
}
