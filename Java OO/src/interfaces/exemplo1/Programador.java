package interfaces.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Funcionario implements IProjeto {
	private List<String> linguagens = new ArrayList<String>();
	private String preferencia;
	private Projeto projeto;

	public Programador(String nome, String cpf, int tempoDeServico, int matricula, double salarioBase,
			List<String> linguagens, String preferencia, Projeto projeto) {
		super(nome, cpf, tempoDeServico, matricula, salarioBase);
		this.linguagens = linguagens;
		this.preferencia = preferencia;
		this.projeto = projeto;
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
		return projeto;
	}

	public void adicionaProjeto(Projeto projeto) {
		try {
			this.projeto = projeto;		
		} catch (Exception e) {
			System.out.println(e.toString());		
		}
	}

	public void removeProjeto(Projeto projeto) {		
		try {
			if (this.projeto.equals(projeto)) projeto = null; 
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}

	public int getNumProjeto() {
		return 1;
	}

	public void imprimirProjetos() {
		System.out.println (projeto.getNomeProjeto() + "," + projeto.getResponsavel() + "," + projeto.getDescricao());
	}

	public void adicionaLinguagem(String linguagem) {
		try {
			linguagens.add(linguagem);
		} catch (Exception e) {
			System.out.println(e.toString());
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
				+ projeto + "]";
	}

}
