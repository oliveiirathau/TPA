package prjAula01;

//Importa��o da Classe Scanner para leitura de dados
import java.util.Scanner;

public class CalculaImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  // cria��o do objeto in para leitura dos dados
	  Scanner in = new Scanner (System.in);
	  // cria��o das vari�veis peso,h,imc
  
     double peso,h,imc;
	
	
      // envio de mensagem na tela para o usu�rio
      System.out.println("Ente com o valor do peso");
	 //faz a leitura e guarda na vari�vel peso
  
    peso= in.nextDouble();
	
	// envio de mensagem na tela para o usu�rio
	System.out.println("Entre com o valor da altura");
			//faz a leitura e guarda na vari�vel altura
			
			
	h = in.nextDouble();
			
	//calcular o imc e guardar em imc 
			
	imc = peso/(h*h);
			
	// mostrar o resultado na tela para o usu�rio
	System.out.println (" O imc �= " +imc);
			
			

	}

}
