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
		
	System.out.println("Sua idade �: " + idade );
		
		if (idade < 10) {
			System.out.println("Voc� � crian�a!");
		} else if (idade < 18) {
			System.out.println("Voc� � adolescente!");
		} else if (idade < 60) {
			System.out.println("Voc� � adulto!");
		} else {
			System.out.println("Voc� � idoso!");
		}
		
	
	} // public static

}
