package interfaces.exemplo1;

import java.util.List;
import java.util.ArrayList;

public class Coordenador extends Funcionario implements IProjeto {
	private List<Projeto> projetos = new ArrayList<Projeto>();

	public Coordenador(String nome, String cpf, int tempoDeServico, int matricula, double salarioBase) {
		super(nome, cpf, tempoDeServico, matricula, salarioBase);
	}
	
	public void adicionaProjeto(Projeto projeto) {
		try {
			projetos.add(projeto);
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
	}
	
	public void removeProjeto(Projeto projeto) {		
		try {
			projetos.remove(projeto);
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}
	
	public int getNumProjeto() {
		return projetos.size();
	}

	public void imprimirProjetos() {
		for (Projeto projeto : projetos) {
		    System.out.println (projeto.getNomeProjeto() + "," + projeto.getResponsavel() + "," + projeto.getDescricao());
		}
	}
	
	@Override
	public void computaSalario() {
		double adicionalCoordenador = 550.5;
		double adicionalProgramador = 550.5;
		setSalarioBase(salarioBase + adicionalCoordenador + adicionalProgramador);
	}

	@Override
	public String toString() {
		return "Coordenador [projetos=" + projetos + ", tempoDeServico=" + tempoDeServico + ", matricula=" + matricula
				+ ", salarioBase=" + salarioBase + ", Nome=" + getNome() + ", Cpf=" + getCpf() + "]";
	}
	
}
