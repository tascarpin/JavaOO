package contrutor;

import java.util.Scanner;

public class TesteConstrutor {

	public static void main(String[] args) {
		
		//Entrada de dados para criação do objeto
		Scanner input = new Scanner(System.in);
		System.out.println("Profavor entre com o número da conta:");
		String nome = input.nextLine();
		System.out.println("Profavor entre com o valor do depósito:");
		String valor = input.nextLine();
		
		//Criação do objeto conta
		Conta conta = new Conta(Double.parseDouble(valor), nome);		
		System.out.println(conta.toString());
		
		//Entrada de dados
		System.out.println("Profavor entre com o valor do saque:");
		
		//Envio de menssagem para o objeto
		valor = input.nextLine();
		conta.saque(Double.parseDouble(valor));
		System.out.println(conta.toString());
		
		input.close();
	}
}
