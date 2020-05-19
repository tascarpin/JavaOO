package polimorfismo.aula;

public class Conta {
	protected String numConta;
	protected double saldo;
	
	public Conta(String numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -=valor;
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
}
