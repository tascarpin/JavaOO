package associacoa.agregacao.exemplo1;

public class Motorista {

	/*
	 * Atributos.
	 */
	private String nome;
	private int habilitacao;
	
	/*
	 * Método construtor passando como parâmetro uma String representando 
	 * o nome do objeto Motorista e um int representando a habilitação.
	 */
	public Motorista(String nome, int habilitacao) {
		this();
		this.nome = nome;
		this.habilitacao = habilitacao;
	}

	/*
	 * Método construtor padrão.
	 */
	public Motorista() {
		super();
	}

	/*
	 * Métodos Getters and Setters.
	 */
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHabilitacao() {
		return this.habilitacao;
	}

	public void setHabilitacao(int habilitacao) {
		this.habilitacao = habilitacao;
	}

	/*
	 * Método toString() para impressão em formato String do objeto Motorista.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motorista [nome=");
		builder.append(nome);
		builder.append(", habilitacao=");
		builder.append(habilitacao);
		builder.append("]");
		return builder.toString();
	}

}