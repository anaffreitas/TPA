package prjListaComplementarLacoFaca;

import java.util.Scanner;

public class FaixasIdade {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, idade, faixa1, faixa2, faixa3, faixa4, faixa5, total, p1, p2, p3, p4, p5;
		
		faixa1 = 0;
		faixa2 = 0;
		faixa3 = 0;
		faixa4 = 0;
		faixa5 = 0;
		total = 0;
		do {
		System.out.println("Digite a idade: ");
		idade = in.nextInt();
		
		
		if (idade <= 15) {
			faixa1 = faixa1 + 1;
			System.out.println("1a Faixa ");
		} else if (idade <= 30){
			 faixa2 = faixa2 + 1;
			 System.out.println("2a Faixa ");
		} else if (idade <=45 ) {
			faixa3 = faixa3 + 1;
			System.out.println("3a Faixa ");
		} else if (idade <=60) {
			faixa4 = faixa4 + 1;
			System.out.println("4a Faixa ");
		} else {
			faixa5 = faixa5 + 1;
			System.out.println("5a Faixa ");
		}
		
		total = total +1;
		
		System.out.println("Deseja continuar a execução? (1 - Sim ou 2 - Não)1");
		i = in.nextInt();
		} while (i==1);
		
		
			
			System.out.println("A quantidade de pessoas em cada faixa etária é: ");
			
			System.out.println("1a Faixa: " + faixa1);
			
			System.out.println("2a Faixa: " + faixa2);
			
			System.out.println("3a Faixa: " + faixa3);
			
			System.out.println("4a Faixa: " + faixa4);
			
			System.out.println("5a Faixa: " + faixa5);
			
			p1 = (faixa1*100)/total;
			p2 = (faixa2*100)/total;
			p3 = (faixa3*100)/total;
			p4 = (faixa4*100)/total;
			p5 = (faixa5*100)/total;
			
			System.out.println("A porcentagem de pessoas em cada faixa etária é: ");
			
			System.out.println("1a Faixa: " + p1 + "%");
			
			System.out.println("2a Faixa: " + p2 + "%");
			
			System.out.println("3a Faixa: " + P3 + "%");
			
			System.out.println("4a Faixa: " + p4 + "%");
			
			System.out.println("5a Faixa: " + p5 + "%");
		
	
}
	
}
