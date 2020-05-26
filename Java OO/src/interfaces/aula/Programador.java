package interfaces.aula;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Funcionario{
	private List<String> linguagens = new ArrayList<String>();
	private String preferencia;
	private IProjeto projeto;
	
	public Programador(String nome, String cpf, int tempoDeServico, int matricula, double sarioBase,
			String linguagem, String preferencia, IProjeto projeto) {
		super(nome, cpf, tempoDeServico, matricula, sarioBase);
		this.linguagens.add(linguagem);
		this.preferencia = preferencia;
		this.projeto = projeto;
	}

	public String getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}

	public List<String> getLinguagens() {
		return linguagens;
	}
	
	public void addLinguagens(String linguagem) {
		this.linguagens.add(linguagem);
	}
		
	public void adicionaProjeto(IProjeto projeto) {
		this.projeto = projeto;		
	}
	
	public IProjeto getProjeto() {
		return projeto;
	}
}
