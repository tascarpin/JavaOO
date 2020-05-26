package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	protected Cliente cliente;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected List<Emprestimos> emprestimo;
	protected List<Seguros> servico;
		
	public Conta(Cliente cliente, int agencia, int numero) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;	
		this.emprestimo = new ArrayList<Emprestimos>();
		this.servico = new ArrayList<Seguros>();
	}
	
	public Conta(Cliente cliente, int agencia, int numero, Emprestimos emprestimo, Seguros servicos) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
		this.emprestimo = new ArrayList<Emprestimos>();
		this.emprestimo.add(emprestimo);
		this.servico = new ArrayList<Seguros>();
		this.servico.add(servicos);
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
		
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public List<Emprestimos> getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimos emprestimo) {
		this.emprestimo.add(emprestimo);
	}

	public List<Seguros> getServicos() {
		return servico;
	}

	public void setServicos(Seguros servico) {
		this.servico.add(servico);
	}

	public boolean transferir(double valor, Conta conta) {
		if(saldo >= valor) {
			saldo-= valor;
			conta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public abstract void sacar(double valor);
	
}

	