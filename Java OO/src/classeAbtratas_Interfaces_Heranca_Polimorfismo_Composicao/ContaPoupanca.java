package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class ContaPoupanca extends Conta implements Tributavel{

	public ContaPoupanca(Cliente cliente, int agencia, int numero) {
		super(cliente, agencia, numero);
	}

	public ContaPoupanca(Cliente cliente, int agencia, int numero, Emprestimos emprestimo, Seguros servicos) {
		super(cliente, agencia, numero, emprestimo, servicos);
	}

	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println("Total do saque: " + valor);
			System.out.println("Saque realizado com sucesso.\n");
		}else {
			System.out.println("Saldo insuficiente.\n");
		}
	}
}
