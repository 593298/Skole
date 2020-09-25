package no.hvl.dat100;

public class TabellerogMetoder {
	
	//a)
	public static void skrivUt (int[] tabell) {
		System.out.print("Tabell: ");
		for (int i : tabell) {
		System.out.print(i + ", ");
		}
		System.out.println();
	}
	//b)
	public static String tilStreng (int[] tabell) {
		
		System.out.print("Streng: [ ");
		
		String tabTxt = " ";
		
		for(int i : tabell) {
			tabTxt = Integer.toString(i);
			System.out.print(i + ", ");
		}
		System.out.println("]");
		
		return tabTxt;
	}
	//c)
	public static int summer1 (int[] tabell) {
		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++ ) {
			sum += tabell[i];
		}
		System.out.println("Sum 1: " + sum);
		
		return sum;
	}
	public static int summer2 (int[] tabell) {
		
		int sum = 0;
		int grense = tabell.length;
		int i = 0;
		
		while (i < grense) {
			sum += tabell[i];
			i++;
		}
		System.out.println("Sum 2: " + sum);
		return sum;
	}
	
	public static int summer3 (int[] tabell) {
		
		int sum = 0;
		
		for (int i : tabell) {
			sum += i;
		}
		System.out.println("Sum 3: " + sum);
		
		return sum;
	}
	//d)
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;
		
		while (!funnet && i < tabell.length) {
			if (tall == tabell[i]) {
				funnet = true;
			}
			i++;
		}
		System.out.println("Finnes Tallet: " + funnet);
		return funnet;
	}
	//e)
	public static int posisjonTall (int[] tabell, int tall) {
		// skjønte ikke "og -1 ellers" i oppgaveteksten
		boolean funnet = false;
		int i = 0;
		int pos = -1;
		
		while (!funnet && i < tabell.length) {
			if (tall == tabell[i]) {
				funnet = true;
				pos = i;
			}
			i++;
		}
		System.out.println("Tabellposisjon: " + pos);
		return pos;
		
	}
	//f)
	public static int[] reverser(int[] tabell) {
		int reverse = tabell.length-1;
		int grense = tabell.length;
		int i = 0;
		int[] reverseTab = new int [tabell.length];
		
		while (i < grense) {
			reverseTab[i] = tabell[reverse];
			i++;
			reverse--;
		}
		System.out.print("Ny ");
		skrivUt(reverseTab);
		return reverseTab;
		
	}
	//g)
	public static boolean erSortert (int[] tabell) {
		boolean sortert = true;
		int i = 1;
		while (sortert && i < tabell.length) {
			if (tabell[i] < tabell[i-1]) {
				sortert = false;
			}
			i++;
		}
		
		System.out.println(sortert);
		return sortert;
	}
	//h)
	public static int [] settSammen(int [] tabell1, int[] tabell2) {
		int[] sammen = new int[tabell1.length];
		int i = 0;
		int j = 0;
		
		while (i < tabell1.length) {
			sammen[i] = sammen[i] + tabell1[i];
			i++;
		}
		
		while (j < tabell2.length) {
			sammen[j] = sammen[j] + tabell2[j];
			j++;
		}
		System.out.print("Sammensatt ");
		skrivUt(sammen);
		return sammen;
	}
	
	public static void main(String[] args) {
		
		int[] test = {1, 2, 3, 3, 5};
		int[] test2 = {1, 2, 3, 4, 5};
		skrivUt(test);
		tilStreng(test);
		summer1(test);
		summer2(test);
		summer3(test);
		finnesTall(test, 1);
		posisjonTall(test, 2);
		reverser(test);
		erSortert(test);
		settSammen(test, test2);
	}

}