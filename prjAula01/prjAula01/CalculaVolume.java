package prjAula01;

//Importa��o da Classe Scanner para leitura de dados
import java.util.Scanner;

// Cria��o da classe CalculaVolume
public class CalculaVolume {

	//Assinatura do m�todo main 
	public static void main(String[] args) {
		
		// cria��o do objeto in para leitura dos dados
		Scanner in = new Scanner (System.in);
		// cria��o das vari�veis r,h,volume
	  
	     double r,h,volume;
		
		
	     // envio de mensagem na tela para o usu�rio
	     System.out.println("Ente com o valor do raio");
		 //faz a leitura e guarda na vari�vel raio
	  
	    r= in.nextDouble();
		
		// envio de mensagem na tela para o usu�rio
		System.out.println("Entre com o valor da altura");
		//faz a leitura e guarda na vari�vel altura
				
				
		h = in.nextDouble();
				
		//calcular o volume e guardar em volume
				
		volume =3.14 * r*r*h;
				
		// mostrar o resultado na tela para o usu�rio
		System.out.println (" O volume �= " +volume);
				

	}

}
