package exercíciosPropostos.heranca;

public abstract class Funcionario extends Pessoa {
	protected int tempoDeServico, matricula;
	protected double salarioBase;
	
	public Funcionario(String nome, String cpf, int tempoDeServico, int matricula, double salarioBase) {
		super(nome, cpf);
		this.tempoDeServico = tempoDeServico;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}
	
	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract boolean adicionaProjeto(Projeto projeto);
	
	public abstract void computaSalario();
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
