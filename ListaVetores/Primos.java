package prjListaVetores;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			
			final int TAM = 10;
			int i, a[], n, primo;
						
			a = new int[TAM];
			
			System.out.println("entre com um numero e veja se é primo");
			
			for (i=0; i<TAM; i++) {
				a[i] = in.nextInt();
				
				primo = 0;
			
				for(n=1; n<=a[i]; n++) {
					 if (a[i]%n == 0) {
						primo++;					
					} // testar divisores dos numeros
				}
				
				if( a[i]<=1) { 
					System.out.println("não é primo");
				} else if(primo == 2)  { // se a variavel dos divisores for igual a dois (so tiver 2 dentro dela) vai ser primo
					System.out.println("é primo");
				} else {
					System.out.println("não é primo");
				}
			
			}
					
					
			
	}
		
}



