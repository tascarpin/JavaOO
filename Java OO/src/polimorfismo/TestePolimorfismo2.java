package polimorfismo;

import java.util.Scanner;

public class TestePolimorfismo2 {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner input = new Scanner(System.in);
		System.out.println("Porfavor entre com o número da conta:");
		String numConta = input.nextLine();
		System.out.println("Porfavor entre com o valor do depósito:");
		//Captura o valor já como double
		double valor = input.nextDouble();	
		
		//Criacao do objeto da Classe com passagem de parâmetro para construtor
		Conta conta = new Conta(numConta, valor);		
		System.out.println(conta.toString());
		
		System.out.println("Porfavor entre com o valor do saque:");
		valor = input.nextDouble();
		conta.saque(valor);
		System.out.println(conta.toString());
		
		input.close();

	}

}
