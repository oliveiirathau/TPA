package prjAula01;

//Importa��o da Classe Scanner para leitura de dados
import java.util.Scanner;

public class ConverterDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//Cria��o das variaveis dia, mes, ano
		double dia,mes,ano;
		
		//envio de mensagem na tela
		System.out.println("Entre com os dias a ser convertidos");
		
		//fazer a leitura e guarda na variavel dia
		dia = in.nextInt();
		
		//Calcular a coversa��o de dias em m�s e guardar na vari�vel m�s
		mes = dia/30;
		
		//Calcular a coversa��o de dias em m�s e guardar na vari�vel m�s
		ano = mes/12;
		
		
		 System.out.println("Meses: " + mes);
	     System.out.println("Anos: " + ano);



	}

}
