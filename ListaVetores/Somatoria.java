package prjListaVetores;

import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], i, j;
		
		a = new int[TAM];
		b= new int [TAM];
		j = 0; 
		
		System.out.println("Insira os valores do vetor A: ");
			for (i=0; i<TAM; i++) {
			a[i] = in.nextInt();
			}
		
			for (i=0; i<TAM; i++) {
				for (j=0; j< a[i]; j++) {
				b[i] += a[j]; // a[j] é o que anda no vetor A, o += soma o vetor A dentro do vetor B
			} 
		}
			
		System.out.println("Somatoria de A: ");
			for (i=0; i<TAM; i++) {
				System.out.print(b[i] + " ");
			}
	
	}
}
