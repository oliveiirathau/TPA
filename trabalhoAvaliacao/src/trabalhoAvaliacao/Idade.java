package trabalhoAvaliacao;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1;
		int anoA,anoNasc,id,r;
		
		do {
			System.out.println("Digite o ano atual");
			anoA = in.nextInt();
			
			System.out.println("Digite o ano de Nascimento");
			anoNasc = in.nextInt();
			
			id=anoA-anoNasc;
			System.out.println("A idade �: "+id);
			
			System.out.println("Deseja continuar a execuc�o ? (1-Continuar / 0-N�o continuar)");
			r = in.nextInt();
		i++;	
		}while(r==1);
		
		System.out.println("Fim da execu��o");
		
		}

}
