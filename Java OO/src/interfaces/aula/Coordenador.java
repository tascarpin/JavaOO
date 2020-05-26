package interfaces.aula;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
	private List<IProjeto> projetos = new ArrayList<IProjeto>();
	
	public Coordenador(String nome, String cpf, int tempoDeServico, int matricula, double sarioBase) {
		super(nome, cpf, tempoDeServico, matricula, sarioBase);
	}

	public void addProjeto(IProjeto projeto) {
		projetos.add(projeto);
	}
	
//	List<SuaClasse> lista = new ArrayList<SuaClasse>();
	public void imprimirLista() {
//		for (SuaClasse obj : lista) {
//		    System.out.println (obj.x1 + "," + obj.x2);
//		}
	}
}
