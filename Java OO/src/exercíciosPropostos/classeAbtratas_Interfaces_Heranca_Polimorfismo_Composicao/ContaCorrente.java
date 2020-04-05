package exercíciosPropostos.classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class ContaCorrente extends Conta implements Tributavel{	
	private double tarifaSaque = 0.1;

	public ContaCorrente(Cliente cliente, int agencia, int numero) {
		super(cliente, agencia, numero);
	}

	public ContaCorrente(Cliente cliente, int agencia, int numero, Emprestimos emprestimo, Seguros servicos) {
		super(cliente, agencia, numero, emprestimo, servicos);
	}

	public void sacar(double valor) {
		double aux = valor;
		aux += aux*tarifaSaque;
		if(saldo >= aux) {
			saldo -= aux;
			System.out.println("Total do saque: " + valor);
			System.out.println("Tarifa para saque: " + valor*tarifaSaque);
			System.out.println("Saque realizado com sucesso.\n");
		}else {
			System.out.println("Saldo insuficiente.\n");
		}
	}
}