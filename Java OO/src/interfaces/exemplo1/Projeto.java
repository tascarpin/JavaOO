package interfaces.exemplo1;

public class Projeto {
	private String nomeProjeto, descricao;
	private IProjeto responsavel;
	
	public Projeto(String nomeProjeto, String descricao, IProjeto responsavel) {
		this.nomeProjeto = nomeProjeto;
		this.descricao = descricao;
		this.responsavel = responsavel;		
		responsavel.adicionaProjeto(this);
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

	public IProjeto getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(IProjeto responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return "Projeto [nomeProjeto=" + nomeProjeto + ", descricao=" + descricao + "]";
	}
	
}
