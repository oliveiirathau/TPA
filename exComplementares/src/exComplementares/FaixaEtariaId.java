package exComplementares;

import java.util.Scanner;

public class FaixaEtariaId {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int id, r,i=0;
		double  pri =0,seg =0,ter=0,quar=0,qui=0;
		double porc1,porc2,porc3,porc4,porc5;
		
		do {
		System.out.println("Digite a idade");
		id = in.nextInt();
		
		if(id<=15) {
			System.out.println("1a Faixa Et�ria");
			pri= pri + 1;
			
		}else if(id<=30){
			System.out.println("2a Faixa Et�ria");
			seg = seg + 1;
			
		}else if (id <= 45) {
			System.out.println("3a Faixa Et�ria");
			ter = ter +1;
			
		}else if (id<=60) {
			System.out.println("4a Faixa Et�ria");
			quar = quar +1;
		}else {
			System.out.println("5a Faixa Et�ria");
			qui = qui +1;
		}
		
		
		System.out.println("Deseja continuar a execuc�o ? (1-Sim / 2-N�o)");
		r = in.nextInt();
		
		i++;
		}while (r==1);
		
		
		System.out.println("Quantidade de pessoas em cada faixa et�ria");
		
		System.out.println("1a Faixa Et�ria:" + pri);
		System.out.println("2a Faixa Et�ria:" + seg);
		System.out.println("3a Faixa Et�ria:" + ter);
		System.out.println("4a Faixa Et�ria:" + quar);
		System.out.println("5a Faixa Et�ria:" + qui);
		
		
		System.out.println(" Em Porcentagem:");
		
		porc1 = (pri/i)*100;                     
		System.out.println("1a Faixa Et�ria:" + porc1 + "%");
		
		porc2 = (seg/i)*100;
		System.out.println("2a Faixa Et�ria:" + porc2 + "%" );
		
		porc3 = (ter/i)*100;
		System.out.println("3a Faixa Et�ria:" + porc3 + "%" );
		
		porc4 = (quar/i)*100;
		System.out.println("4a Faixa Et�ria:" + porc4 + "%" );
		
		porc5 = (qui/i)*100;
		System.out.println("5a Faixa Et�ria:" + porc5 + "%" );  
		
		
		
	}

}
