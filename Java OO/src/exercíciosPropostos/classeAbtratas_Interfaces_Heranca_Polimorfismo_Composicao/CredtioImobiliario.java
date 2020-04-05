package exercíciosPropostos.classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class CredtioImobiliario extends Credito implements Emprestimos{

	public CredtioImobiliario(Conta conta, double valorCredito, double jurosMes, int numMeses) {
		super(conta, valorCredito, jurosMes, numMeses);
	}

	@Override
	public void calculoJuros() {
		
	}

	@Override
	public String toString() {
		return "CredtioImobiliario [valorCredito=" + valorCredito + ", jurosMes=" + jurosMes + ", numMeses=" + numMeses
				+ "]\n";
	}	
	
}
