package prjAula01;

//Importa��o da Classe Scanner para leitura de dados
import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static void main (String [] args) {
		
		
   // cria��o do objeto in para leitura dos dados
		 Scanner in = new Scanner (System.in);
	// cria��o das vari�veis base, h e area
   
   double base,h,area;
	
	
   // envio de mensagem na tela para o usu�rio
   System.out.println("Ente com o valor da base do tr�ngulo");
	//faz a leitura e guarda na vari�vel base
   
   base= in.nextDouble();
	
	// envio de mensagem na tela para o usu�rio
			System.out.println("Entre com o valor da altura do tr�ngulo");
			//faz a leitura e guarda na vari�vel area 
			
			
	h = in.nextDouble();
			
	//calcular a �rea do tri�ngulo e guardar em area 
			
	area = (base* h)/2;
			
	// mostrar o resultado na tela para o usu�rio
	System.out.println (" A �rea do tri�ngulo �= " +area);
			
			
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
	