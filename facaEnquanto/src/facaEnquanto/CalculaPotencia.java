package facaEnquanto;

import java.util.Scanner;

public class CalculaPotencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b,ex;
		int i=1;
		int potencia = 1;
	
		System.out.println("Digite o valor da base");
		b= in.nextInt();
		
		System.out.println("Digite o valor do expoente");
		ex= in.nextInt();
		
	    if (ex==0){
	    	System.out.println("o resultado � 1");
	    }else {
		do {
		    potencia = potencia*b;
			i++; 
		}while (i<=ex);
       
		System.out.println(" A potencia de de " + b + " elevado a " + ex + " � = " + potencia);
	    }
	}

}
 