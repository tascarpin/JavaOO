package classe.exercicio;

import java.util.Scanner;

public class TesteExercicio {
	
	public static void main(String[] args) {
		//Criar um obejto Conta corrente e imprimi seus dados
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setTitular("Tassio");
		contaCorrente.setNumConta("61337-1");
		contaCorrente.setSaldo(100);		
		contaCorrente.imprimirDadosConta();		
		
		//Criar um obejto Conta poupança e imprimi seus dados		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setTitular("Pinheiro");
		contaPoupanca.setNumConta("55768-7");
		contaPoupanca.setSaldo(200);			
		contaPoupanca.imprimirDadosConta();
				
		/* Manipulação da conta corrente com depósito */
		//Entrada de dados
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o valor do seu depósito:");	
		String valor = input.nextLine();		
		//Envio de menssagem para o objeto
		contaCorrente.deposito(Double.parseDouble(valor));
		contaCorrente.imprimirDadosConta();

		/* Manipulação da conta corrente com saque */
		//Entrada e dados
		System.out.println("Qual o valor do seu saque:");	
		valor = input.nextLine();		
		//Envio de menssagem para o objeto
		contaCorrente.saque(Double.parseDouble(valor));
		contaCorrente.imprimirDadosConta();
		input.close();
		
	}
}
