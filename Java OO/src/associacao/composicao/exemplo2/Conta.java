package associacao.composicao.exemplo2;

public class Conta {
	public Cliente cliente;
	public String agencia;
	public String numero;
	
	public Conta(Cliente cliente, String agencia, String numero) {		
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.cliente.getConta().add(this);

	}
	
	public void addConta(Cliente cliente, String agencia, String numero) {
		new Conta(cliente,agencia, numero);
	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente.getNome() + ", agencia=" + agencia + ", numero=" + numero + "]";
	}
	
	
}
