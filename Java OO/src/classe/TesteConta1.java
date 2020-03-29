package classe;

public class TesteConta1 {

	public static void main(String[] args) {

		//Criando um objeto conta e imprimi seus dados
		Conta conta = new Conta();
		conta.setNome("Tassio");
		String nome = conta.getNome();
		System.out.printf("Conta do %s.", nome);

	}

}
