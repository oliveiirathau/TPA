package prjAula01;

//Importa��o da Classe Scanner para leitura de dados
import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//Cria��o das variaveis AnoAtual, AnoNascimento, Idade;
		int AnoAtual, AnoNascimento, Idade;
		
		//envio de mensagem na tela
		System.out.println("Digite o ano atual");
		
		//fazer a leitura e guarda na variavel AnoAtual
		AnoAtual = in.nextInt();
		
		
        System.out.println("Digite o ano de nascimento");
		
        //faz a leitura e guarda na vari�vel AnoNascimento
		AnoNascimento = in.nextInt();
		
		//Calcular a idade e guardar na vari�vel Idade
		Idade = AnoAtual-AnoNascimento;
		
		System.out.println("A idade � =" +Idade);

	}

}
