package polimorfismo.aula;

public class ContaFisica extends Conta {
	private String titular;

	public ContaFisica(String numConta, double saldo, String titular) {
		super(numConta, saldo);
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	@Override
	public void saque(double valor) {
		saldo -= (valor + (valor*0.1));
	}
	
	//Sobrecarga
	public void saque(double valor, double tarifa) {
		saldo -= (valor + (valor*tarifa));
	}

	@Override
	public String toString() {
		return "ContaFisica [titular=" + titular + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
}
