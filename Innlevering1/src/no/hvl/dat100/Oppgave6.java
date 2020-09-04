package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("n fakultet: "));
		int sum = 1;
		
		String sumTxt = "";
		
		if (n > 0) {
			for (int f = 1; f <= n; f++) {
				sum *= f; 
				sumTxt += f + "! = " + sum + ", \n";
						
			}
			 	showMessageDialog(null, sumTxt);
			
		} else {
			showMessageDialog(null, "Feil n! ");
		}
	}

}
