package associacao.composicao.exemplo2;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Tassio", "2020", "12345-6");		
		System.out.println(cliente.toString());
		
		Conta conta = new Conta(cliente, "10", "10");
		conta.addConta(cliente, "2020", "12345-x");
		System.out.println(conta.toString());
	}

}
