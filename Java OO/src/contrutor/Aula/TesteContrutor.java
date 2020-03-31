package contrutor.Aula;

import java.util.Scanner;

public class TesteContrutor {

	public static void main(String[] args) {
		
		Conta conta =  new Conta(0.0, "12345-6", "Tassio");
		conta.imprimirDados();
		
		//Entrada de dados para deposito
		Scanner input = new Scanner(System.in);
		System.out.println("Porfavor entre com o valor do depósito:");
		
		//Com parse
		//String valorDeposito = input.nextLine();
		//conta.deposito(Double.parseDouble(valorDeposito));
		
		//Sem o parse
		double valorDeposito = input.nextDouble();
		conta.deposito(valorDeposito);
		conta.imprimirDados();
		
		System.out.println("Porfavor entre com o valor do depósito:");				
		conta.deposito(input.nextDouble());
		conta.imprimirDados();
		
		input.close();
	}

}
