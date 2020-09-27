package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	/*
	 public static void skrivUt(int[] tabell) {		
			for (int i  = 0; i<tabell.length; i++) {
			System.out.print(tabell[i]);
			}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		  String streng = ("[");
	        for (int i = 0; i<tabell.length; i++) {
	            if (i != tabell.length - 1) {
	                streng += (tabell[i] + ",");
	            } else {
	                streng += (tabell [i]);
	        }
	        }    
	        streng += ("]");
	        System.out.println(streng);
	        return streng; 
	
	}
	

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i  = 0; i<tabell.length; i++) {
		sum += tabell[i];
		}
		System.out.println(sum);
		}
		return sum;
	*/	
	/*
	public static int summer(int[] tabell) {
	
	int i = 0; 
	int sum = 0; 
	while (i < tabell.length) {
		sum += tabell[i];
		i++;
	}
	return sum;
} */

/*
	public static int summer(int[] tabell) {
	int sum = 0;
	for (int i : tabell){
		sum += i;
	}
	return sum;
	}
*/
	// d)
/*
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean a = false;
		
		for (int i  = 0; i < tabell.length; i++) {
			int tll = tabell [i];
			if (tll == tall) {
				a = true;
	}
	}
		return a;
	}
*/
/*	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int sum = -1;
		for (int i  = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
			sum = i;
			}
			}
		System.out.println(sum);
		return sum;

	}*/
	/*
	for (int i  = tabell.length; i<0; i++) {
		int a = tabell.length;
		for (int b  = tabell.length;b<0; b++) {
			if (tabell[b] > tabell[a])
				a=b;
	*/
	// f)
	public static int[] reverser(int[] tabell) {
		int [] nyTabell = new int[tabell.length];
		
		for (int tallNr=0; tallNr<tabell.length; tallNr++) {
			int minPos = 0;
			for (int posNr=1; posNr<tabell.length; posNr++) {
				if (tabell[posNr] > tabell[minPos])
					minPos=posNr;
			}
			nyTabell[tallNr]=tabell[minPos];
		}
			tabell = nyTabell;
		
		return tabell;
}
	// g)
/*
	public static int[] reverser(int[] tabell) {
        for(int i=0; i<tabell.length/2; i++){
               int j = tabell[i];
               tabell[i] = tabell[tabell.length -i -1];
               tabell[tabell.length -i -1] = j;
           }
        int[] tabell2 = tabell;
        return tabell2;
   }
*/
	
	// h)
/*
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int lengde = tabell1.length + tabell2.length;
        int[] tabell = new int[lengde];
        for (int i = 0; i < tabell1.length; i++) {
            tabell[i] = tabell1[i];
        }
        for (int j = 0; j < tabell2.length; j++) {
            tabell[tabell1.length + j] = tabell2[j];
        }
        return tabell;



    }
}
*/

