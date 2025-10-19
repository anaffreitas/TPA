package prjAulaExercicios;

import java.util.Scanner;

public class Temperatura {
	 public static void main(String[] args) {
		 
		 Scanner in = new Scanner(System.in);
		 
		 double f, c;
		 
		 f = in.nextDouble();
		 c = (f-32)/1.8;
		 System.out.println("A temperatura é :" + c);
		 
		 if(c<15) {
			 System.out.println("Frio");
		 }else if (c < 22) {
			 System.out.println("Ameno");
		 } else {
			 System.out.println("Calor");
		 }
			 
				 
	 } // fim do metodo main
}
