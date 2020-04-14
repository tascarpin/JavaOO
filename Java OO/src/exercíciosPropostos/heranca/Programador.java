package exercíciosPropostos.heranca;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Funcionario {
	private List<String> linguagens = new ArrayList<String>();
	private String preferencia;
	private Projeto projetoAtual;
	
	public Programador(String nome, String cpf, int tempoDeServico, int matricula, double salarioBase,
			List<String> linguagens, String preferencia, Projeto projetoAtual) {
		super(nome, cpf, tempoDeServico, matricula, salarioBase);
		this.linguagens = linguagens;
		this.preferencia = preferencia;
		this.projetoAtual = projetoAtual;
	}
	
	public List<String> getLinguagens() {
		return linguagens;
	}
	
	public void setLinguagens(List<String> linguagens) {
		this.linguagens = linguagens;
	}
	
	public String getPreferencia() {
		return preferencia;
	}
	
	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}
	
	public Projeto getProjetoAtual() {
		return projetoAtual;
	}
	
	public void setProjetoAtual(Projeto projetoAtual) {
		this.projetoAtual = projetoAtual;
	}
	
	public boolean adicionaLinguagem(String linguagem) {
		try {
			linguagens.add(linguagem);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}	
	}	
	
	@Override
	public boolean adicionaProjeto(Projeto projeto) {
		try {
			projetoAtual = projeto;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}		
	}

	@Override
	public void computaSalario() {
		double adicionalProgramador = 550.5;
		setSalarioBase(salarioBase + adicionalProgramador);
	}

	@Override
	public String toString() {
		return "Programador [linguagens=" + linguagens.size() + ", preferencia=" + preferencia + ", projetoAtual="
				+ projetoAtual + "]";
	}

	
	
}
