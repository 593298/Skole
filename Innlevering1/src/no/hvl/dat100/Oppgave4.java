package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Oppgave4 {

	public static void main(String[] args) {
		
		float lonn = Integer.parseInt(showInputDialog("Lønn"));
		
		if (lonn <= 164100) {
		 showMessageDialog(null, "Trenger ikke å betale trinnskatt"); 
		} else if (lonn > 164100 && lonn <= 230950) {
			lonn *= 0.0093;			
			showMessageDialog(null, "Du må betale : " + lonn + " i skatt");
		} else if (lonn > 230950 && lonn <= 580650) {
			lonn *=0.0241;
			showMessageDialog(null, "Du må betale : " + lonn + " i skatt");
		} else if (lonn > 580650 && lonn <= 934050) {
			lonn *= 0.1152;
			showMessageDialog(null, "Du må betale : " + lonn + " i skatt");
		} else if (lonn > 934050) {
			lonn *= 0.1452;
			showMessageDialog(null, "Du må betale : " + lonn + " i skatt");
		}
		
	}

}
