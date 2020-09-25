package no.hvl.dat100;

public class Matrise {
	
	public static void skrivUtv1(int[][] matrise) {
		
		
		for (int i = 0; i < matrise.length; i++) {
			System.out.print("Tabell " + i + ": [ ");
			
			for (int j = 0; j < matrise.length+1; j++){
				System.out.print(matrise[i][j] + ", ");

				
			}
			System.out.println("]");
		}
	}

	public static String tilStreng(int[][] matrise) {
		String matriseTxt = " ";
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int j = 0; j < matrise.length + 1; j++) {
				matriseTxt = Integer.toString(matrise[i][j]);
				System.out.print(matriseTxt);
				
			}
			System.out.println();
		}
		
		return matriseTxt;
	}
	public static int[][] skaler(int tall, int[][] matrise){
		int[][] ny = new int[matrise.length][matrise.length+1];
		
		for (int i = 0; i < matrise.length; i++) {
			
			System.out.print("Tabell " + i + ": ");
			
			for (int j = 0; j < matrise.length+1; j++) {
				ny[i][j] += matrise[i][j] * tall;
				
				System.out.print(ny[i][j] + ", ");
				
			}
			System.out.println();
			ny = matrise;
		}
		
		
		return ny;
	}
	
	public static boolean erLik(int[][] mat1, int [][] mat2) {
		boolean lik = false;
		
		for (int i = 0; i < mat1.length; i++) {
			
			for (int j = 0; j < mat1.length + 1; j++) {
				if (mat1[i][j] == mat2[i][j]) {
					lik = true;
				} else {
					lik = false;
				}
				
			}
			
		}
		System.out.println("Er matrisene lik: " +lik);
		return lik;
	}
	
	public static void main(String[] args) {
		
		int [][] todim = {
				{1,2,3,4,}, //rad 0
				{1,3,5,7,}, //rad 1
				{2,4,6,8,}, //rad 2
		};
		int [][] todim1 = {
				{1,2,3,4,}, //rad 0
				{1,3,5,7,}, //rad 1
				{2,4,6,8,}, //rad 2
		};
		int [][] todim2 = {
				{1,2,3,4,}, //rad 0
				{1,3,5,7,}, //rad 1
				{2,4,6,8,}, //rad 2
		};
		skrivUtv1(todim);
		tilStreng(todim);
		skaler(3, todim);
		erLik(todim1, todim2);
	}

}