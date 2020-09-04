package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
		
		
		
		for (int elev = 1; elev < 11; elev++) {
			int poeng = Integer.parseInt(showInputDialog("Karakter poengsum mellom 0 - 100 på elev " + elev));	
			
				while (poeng < 0 || poeng > 100) {
				showMessageDialog(null, "Negativ verdi eller over 100");
				poeng = Integer.parseInt(showInputDialog("Skriv inn på nytt på elev " + elev));
				}
			
				if (poeng >= 0 && poeng <= 39) {
					showMessageDialog(null, "Karakteren til elev " + elev + " er F");
				
				} else if (poeng <= 49) {
					showMessageDialog(null, "Karakteren til elev " + elev + " er E");
				
				} else if (poeng <= 59) {
					showMessageDialog(null, "Karakteren til elev " + elev + " er D");
				
				} else if (poeng <= 79) {
					showMessageDialog(null, "Karakteren til elev " + elev + " er C");
				
				} else if (poeng <= 89) {
					showMessageDialog(null, "Karakteren til elev " + elev + " er B");
				
				} else if (poeng <= 100) {
					showMessageDialog(null, "Karakteren til elev " + elev + " er A");
			}
		} 
	}
				
}
