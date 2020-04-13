package associacao.composicao.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Conta> conta = new ArrayList<Conta>();

	public Cliente(String nome, String agencia, String numero) {
		this.nome = nome;
		new Conta(this,agencia, numero);
	}

	public String getNome() {
		return nome;
	}
	
	public List<Conta> getConta() {
		return conta;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", conta=" + conta.toArray() + "]";
	}
	
	
}
