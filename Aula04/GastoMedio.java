package prjListaSe;

import java.util.Scanner;

public class GastoMedio {
	public static void main (String [] args) { 
		 
	    Scanner in = new Scanner (System.in);
	    double d, c, gasto; 

	    System.out.println ("Distância percorrida:");
	    d = in.nextDouble (); 
	    System.out.println (" Capacidade do tanque de combustivel (L):");
	    c = in.nextDouble ();
	 
	    gasto = d/c; 
	    System.out.println ( "O gasto médio foi de:" + gasto); 

	    if (gasto>=10) {
	        System.out.println ("Econômico"); 
	    } else {
	        System.out.println ("Não econômico"); 
	    } 
	}
}
