package polimorfismo.aula;

import java.util.Scanner;

public class TestePolimorfismo1 {

	public static void main(String[] args) {		
		
		Conta contaFisica = new ContaFisica("12345-6", 100, "Tassio");
		
		System.out.println("Porfavor entre com o valor do deposito:");
		Scanner input = new Scanner(System.in);
		double valor = input.nextDouble();		
		contaFisica.deposito(valor);
		System.out.println(contaFisica.toString());
		System.out.println();
		
		System.out.println("Porfavor entre com o valor do saque:");
		valor = input.nextDouble();
		contaFisica.saque(valor);
		System.out.println(contaFisica.toString());
		System.out.println();
		
		
		
		input.close();
	}

}
