package exercíciosPropostos.heranca;

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

	@Override
	public void computaSalario() {
		double adicionalCoordenador = 550.5;
		double adicionalProgramador = 550.5;
		setSalarioBase(salarioBase + adicionalCoordenador + adicionalProgramador);
	}

	@Override
	public String toString() {
		return "Coordenador [toString()=" + super.toString() + "]";
	}
	
}
