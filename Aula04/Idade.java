package listaExercicios;
import java.util.Scanner;

public class Idade {
	public static void main (String args[]) {
		
	
	
	Scanner in = new Scanner(System.in);
	
	int nasc, atual, idade;
	
	System.out.println("Insira seu ano de nascimento: ");
	
	nasc = in.nextInt();
	
	System.out.println("Insira o ano atual: ");
		atual = in.nextInt();
		
		idade = atual - nasc;
		
	System.out.println("Sua idade é: " + idade );
		
		if (idade < 10) {
			System.out.println("Você é criança!");
		} else if (idade < 18) {
			System.out.println("Você é adolescente!");
		} else if (idade < 60) {
			System.out.println("Você é adulto!");
		} else {
			System.out.println("Você é idoso!");
		}
		
	
	} // public static

}
