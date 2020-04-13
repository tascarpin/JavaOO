package polimorfismo;

import java.util.Scanner;

public class TestePolimorfismo4 {

	public static void main(String[] args) {
		
		/* Teste utilizado a sobrecarga e sobreposicao */
		
		//Entrada de dados
		Scanner input = new Scanner(System.in);
		System.out.println("Porfavor entre com o número da conta:");
		String numConta = input.nextLine();
		System.out.println("Porfavor entre com o valor do depósito:");
		double valor = input.nextDouble();	
		
		//Outra forma de criar o objeto conta corrente
		ContaFisica conta = new ContaFisica("Tassio", numConta, valor);		
		
		System.out.println(conta.toString() + "\n");
		
		//Entrada de dados
		System.out.println("Porfavor entre com o valor do saque:");
		valor = input.nextDouble();
				
		//Outra forma de do envio de menssagem
		conta.saque(valor, 0.15);
		
		//Imprimi os dados da conta
		System.out.println(conta.toString());
		
		input.close();

	}

}
