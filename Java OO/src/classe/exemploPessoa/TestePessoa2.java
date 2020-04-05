package classe.exemploPessoa;

import java.util.Scanner;

public class TestePessoa2 {

	public static void main(String[] args) {
		
		//Criar um objeto Scanner para obter a entrada de dados a partir da janela de comando - console				
		Scanner input = new Scanner(System.in);
		Pessoa minhaConta = new Pessoa();
		System.out.printf("Nome inicial é: %s%n%n", minhaConta.getNome());
		
		//Solicita e lê o nome
		System.out.println("Profavor entre com seu primeiro nome:");
		String nome = input.nextLine();
		
		//Envio de menssagem para o objeto minhaConta
		minhaConta.setNome(nome);
		System.out.println();
		System.out.printf("Seja bem vindo: %n%s%n", minhaConta.getNome());
		
		input.close();
	}

}
