package polimorfismo;

import java.util.Scanner;

public class TestePolimorfismo3 {

	public static void main(String[] args) {
		
		/* Teste utilizado a sobrecarga e sobreposicao */
		
		//Entrada de dados
		Scanner input = new Scanner(System.in);
		System.out.println("Porfavor entre com o número da conta:");
		String numConta = input.nextLine();
		System.out.println("Porfavor entre com o valor do depósito:");
		double valor = input.nextDouble();
		
		//Criando o objeto da classe Conta Corrente com a passagem de parâmetros para o construtor 
		Conta conta = new ContaCorrente("Tassio", numConta, valor);			
		
		System.out.println(conta.toString() + "\n");
		
		//Entrada de dados
		System.out.println("Porfavor entre com o valor do saque:");
		valor = input.nextDouble();
		
		//Envio de menssagem para o objeto 
		conta.saque(valor);
		
		//Imprimi os dados da conta
		System.out.println(conta.toString());
		
		input.close();

	}

}
