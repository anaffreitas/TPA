package listaExercicios;
import java.util.Scanner; 

public class Combustivel {
	    public static void main(String args[]) {
	    	
	    	Scanner in = new Scanner(System.in);
	    	
	    	double km, l, g;
	    	
	    	System.out.println("Insira a distância em KM: ");
	    		km = in.nextDouble();
	    	
	    	System.out.println("Insira a capacidade do tanque em Litros: ");
	    		l = in.nextDouble();
	    	
	    		g = km / l;
	    			System.out.println("O gasto médio de combustível é: " + g);
	    			
	    			if (g >= 10) {
	    				System.out.println("Seu carro é economico!");
	    			} else {
	    				System.out.println("Seu carro não é economico!");
	    			}
	    			
	    	
	    	
	    }// fim do método main
}
