package heranca.exemplo2;

import java.util.List;

import java.util.ArrayList;

public class Coordenador extends Funcionario{
	private List<Projeto> projetos = new ArrayList<Projeto>();

	public Coordenador(String nome, String cpf, int tempoDeServico, int matricula, double salarioBase) {
		super(nome, cpf, tempoDeServico, matricula, salarioBase);
	}

	public boolean adicionaProjeto(Projeto projeto) {
		try {
			projetos.add(projeto);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}		
	}
	
	public boolean removeProjeto(Projeto projeto) {		
		try {
			projetos.remove(projeto);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
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
