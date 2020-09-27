package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)		
/*
 public static void skrivUt(int[][] matrise) {
		for (int[] i : matrise) {
			for( int j : i) {
				System.out.println(j + " ");
			}
		}
	}
*/
	// b)
/*
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (j != matrise[i].length -1) {
					streng += (matrise[i][j] + " ");
				}
				else {
					streng += (matrise[i][j] + " \n");
				}

				
			}
		}
		return streng;
	}
*/
	// c)
/*
	public static int[][] skaler(int tall, int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matrise[i][j] = matrise[i][j] * tall ;
			}
		}
		return matrise;
	}
*/
	// d)
/*
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == b[i][j]) {
					lik = true;
				}
			}
		}
		return lik;
	}
*/
	// e)

	public static int[][] speile(int[][] matrise) {

		
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
