package prjFacaEnquanto;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int resultado, atual, anterior,n, i; 
		i= 1; 
		atual = 1;
		anterior = 0;
		
		
		System.out.println("Digite o n�mero: ");
		n = in.nextInt();
		
		do {
			resultado = atual + anterior;
			i++;
		} while (i<=n);
			
		System.out.println("De acordo com a s�rie de Fibonacci o resultado �= " + resultado);
	}

}
 