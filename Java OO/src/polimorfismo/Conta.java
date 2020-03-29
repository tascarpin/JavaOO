package polimorfismo;

/*
 * Percebe-se aqui que a classe conta desse pacote não entra em conflito com a classe conta do pacote "abstracao_classe" 
 * justamente por estarem em pacotes diferentes. 
*/
public class Conta {
	protected String numConta;
	protected double saldo;		
		
	public Conta() {

	}
	
	//Sobrecarga do contrutor: Mesma assinatura(independe do retorno da método) do métodos porém com lista de argumentos diferentes	
	public Conta(String numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
	}
	
	//Sobreposição do método toString: Mesma assinatura, com mesmo tipo de retorno, mesma quantidade de argumentos
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numConta=" + numConta + "]";
	}
	
}
