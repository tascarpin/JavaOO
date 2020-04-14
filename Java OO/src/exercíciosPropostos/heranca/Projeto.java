package exercíciosPropostos.heranca;

public class Projeto {
	private String nomeProjeto, descricao, responsavel;

	public Projeto(String nomeProjeto, String descricao, String responsavel) {
		this.nomeProjeto = nomeProjeto;
		this.descricao = descricao;
		this.responsavel = responsavel;
	}

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

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
