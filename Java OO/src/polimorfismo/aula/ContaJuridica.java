package polimorfismo.aula;

public class ContaJuridica extends Conta {
	private String titular;

	public ContaJuridica(String numConta, double saldo, String titular) {
		super(numConta, saldo);
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	@Override
	public void saque(double valor) {
		saldo -= (valor + (valor*0.3));
	}
	
	//Sobrecarga
	public void saque(double valor, double tarifa) {
		saldo -= (valor + (valor*tarifa));
	}
	
//	//Outra possibilidade Sobrecarga
//	public double saque(double valor, double tarifa) {
//		return saldo -= (valor + (valor*tarifa));
//	}

	@Override
	public String toString() {
		return "ContaJuridica [titular=" + titular + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
}
