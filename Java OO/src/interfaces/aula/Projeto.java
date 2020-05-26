package interfaces.aula;

public abstract class Projeto{
	private String nomeProjeto, descricao;
	private Funcionario respondavel;
		
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Funcionario getRespondavel() {
		return respondavel;
	}
	
	public void setRespondavel(Funcionario respondavel) {
		this.respondavel = respondavel;
	}
	
}
