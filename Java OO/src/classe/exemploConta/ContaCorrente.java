package classe.exemploConta;

public class ContaCorrente {
	String titular = null;
	String numConta = null;
	double saldo = 0;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public void saque(double valor) {
		saldo -= valor;		
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public void imprimirDadosConta() {
		System.out.println("Extrato:");
		System.out.println("Titular da conta = " + titular);
		System.out.println("Número da conta = " + numConta);
		System.out.println("Saldo = " + saldo);
		System.out.println("---");
	}
	
}
