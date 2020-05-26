package interfaces.aula;

public abstract class Funcionario extends Pessoa{
	protected int tempoDeServico, matricula;
	protected double sarioBase;
	
	public Funcionario(String nome, String cpf, int tempoDeServico, int matricula, double sarioBase) {
		super(nome, cpf);
		this.tempoDeServico = tempoDeServico;
		this.matricula = matricula;
		this.sarioBase = sarioBase;
	}

	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setSarioBase(double sarioBase) {
		this.sarioBase = sarioBase;
	}
	
}
