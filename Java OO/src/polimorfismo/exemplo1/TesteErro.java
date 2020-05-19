package polimorfismo.exemplo1;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		
		/* Teste utilizado a sobrecarga e sobreposicao */
		
		//Entrada de dados
		Scanner input = new Scanner(System.in);
		System.out.println("Porfavor entre com o número da conta:");
		String numConta = input.nextLine();
		System.out.println("Porfavor entre com o valor do depósito:");

		String valor = input.nextLine();	
		
		//Outra forma de criar o objeto conta corrente
		Conta conta = new ContaFisica("Tassio", numConta, Double.parseDouble(valor));		
		
		System.out.println(conta.toString() + "\n");
		
		//Entrada de dados
		System.out.println("Porfavor entre com o valor do saque:");
		valor = input.nextLine();
		valor = input.next();
						
		/* ERRO */
		//Esse método pertence a Conta corrente e não está disponível para objetos Conta
		//conta.saque(Double.parseDouble(valor), 0.15);
		
		//Imprimi os dados da conta
		System.out.println(conta.toString());
		
		input.close();

	}

}
