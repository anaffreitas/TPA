package prjListaVetores;

import java.util.Scanner;

public class Intersecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], c[], i, n;
		
		a = new int[TAM];
		b = new int [TAM];
		c = new int [TAM];
		n = 0;
		
		
		System.out.println("Digite os números do vetor A: ");
		for (i=0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		  System.out.println("Digite os números do vetor B: ");
		  for (i=0; i<TAM; i++) {
			  b[i] = in.nextInt();
		   }
			
			
		for (i=0; i<TAM; i++) {
			for (n=0; n<TAM; n++) {
				if (a[i] == b[n]) {
					c[i]=a[i];
				}
			}
			
		}
	
		System.out.println("A interseção é: ");
			for (i=0; i<TAM; i++) {
				System.out.print(c[i]+ " ");
			}
			

  }
}
