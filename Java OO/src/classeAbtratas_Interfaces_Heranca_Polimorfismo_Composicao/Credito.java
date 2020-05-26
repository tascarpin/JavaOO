package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public abstract class Credito {
	protected Conta conta;
	protected double valorCredito;
	protected double jurosMes;
	protected int numMeses;
	
	public Credito(Conta conta, double valorCredito, double jurosMes, int numMeses) {
		this.conta = conta;
		this.valorCredito = valorCredito;
		this.jurosMes = jurosMes;
		this.numMeses = numMeses;
	}

	public Conta getConta() {
		return conta;
	}

	public double getValorCredito() {
		return valorCredito;
	}
	
	public double getJurosMes() {
		return jurosMes;
	}

	public int getNumMeses() {
		return numMeses;
	}

	public abstract void calculoJuros();
		
}
