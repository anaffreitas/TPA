package prjListaVetores;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		final int TAM = 20;
		int i, a[], b[], n;
		
		a = new int[TAM];
		b = new int[TAM];
		n = 0; // sempre pra andar dentro de um vetor tem que ser usada outra variavel, senao os indices vao ser copiados exatamente como estao no vetor A
		
		System.out.println("Insira " + TAM + " números: ");
		for (i=0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
	
			if (a[i] % 2 == 0) {
				b[n] = a[i];
				n++;
			} 
		}
			for (i=0; i<TAM; i++) {
				
				if (a[i] % 2 == 1) {
					b[n] = a[i];
					n++;
				} // para verificar os impares 
			}
			
			for (i=0; i<n; i++) {
				System.out.print(b[i]+ " ");
			}

	

	}
}


