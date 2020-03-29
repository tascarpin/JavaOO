package contrutores;

/*
 * Percebe-se aqui que a classe conta desse pacote não entra em conflito com a classe conta do pacote "abstracao_classe" 
 * justamente por estarem em pacotes diferentes. 
*/
public class Conta {
	private double saldo;
	private String numConta;	
	
	public Conta(double saldo, String numConta) {
		this.saldo = saldo;
		this.numConta = numConta;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numConta=" + numConta + "]";
	}
	
}
