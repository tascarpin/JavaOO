package associacao.agregacao.exemplo1;

public class Motor {

	/*
	 * Atributos.
	 */
	private int potencia;

	/*
	 * Método construtor passando a potência do objeto motor como parâmetro
	 */
	public Motor(int potencia) {
		this();
		this.potencia = potencia;
	}

	/*
	 * Método construtor padrão
	 */
	public Motor() {
		super();
	}

	/*
	 * Métodos Getters and Setters
	 */
	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/*
	 * Método toString() para impressão em formato String do objeto Motor
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	}

}