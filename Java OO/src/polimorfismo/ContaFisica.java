package polimorfismo;

public class ContaFisica extends Conta{
	private String titular = null;

	public ContaFisica(String nome, String numConta, double valor) {
		super(numConta, valor);
		this.titular = nome;
	}

	//Sobreposicao de método
	public void saque(double valor) {
		//Lembre que a ordem dos fatores afeta no sinal do resultado da operação
		saldo -= (valor + (valor*0.1));	
	}
	
	//Sobrecarga de método
	public void saque(double valor, double juros) {
		saldo -= (valor + (valor*juros));		
	}

	@Override
	public String toString() {
		return "ContaCorrente [titular=" + titular + ", saldo=" + saldo + ", numConta=" + numConta + "]";
	}
	
}
