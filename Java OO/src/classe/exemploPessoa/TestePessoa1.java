package classe.exemploPessoa;

public class TestePessoa1 {

	public static void main(String[] args) {

		//Criando um objeto conta e imprimi seus dados
		Pessoa conta = new Pessoa();
		conta.setNome("Tassio");
		String nome = conta.getNome();
		System.out.printf("Conta do %s.", nome);

	}

}
