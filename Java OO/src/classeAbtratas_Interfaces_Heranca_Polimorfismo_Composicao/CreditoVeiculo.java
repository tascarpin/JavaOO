package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class CreditoVeiculo extends Credito implements Emprestimos {
	
	public CreditoVeiculo(Conta conta, double valorCredito, double jurosMes, int numMeses) {
		super(conta, valorCredito, jurosMes, numMeses);
	}

	@Override
	public void calculoJuros() {
		//Inventar um código aqui
	}

	@Override
	public String toString() {
		return "CreditoVeiculo [valorCredito=" + valorCredito + ", jurosMes=" + jurosMes + ", numMeses=" + numMeses
				+ "]\n";
	}
	
}
