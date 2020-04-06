package associacoa.composicao;

public class Automovel {

	/*
	 * Atributos.
	 */
	private String modelo;

	/*
	 * Atributo motor faz referência a um objeto do tipo Motor.
	 */
	private Motor motor;

	/*
	 * Método construtor passando como parâmetro uma String que indicará o
	 * modelo do Automovel e um int que indicará a potência do Motor que será
	 * instânciado dentro do deste método construtor.
	 */
	public Automovel(String modelo, int potenciaMotor) {
		this();
		this.modelo = modelo;
		/*
		 * Um objeto do tipo Motor sendo instânciado dentro do método construtor
		 * da classe Automovel sendo assim será gerada uma associção do tipo
		 * composição, pois o objeto Motor existirá somente enquanto o objeto
		 * Automovel existir.
		 */
		this.motor = new Motor(potenciaMotor);
	}

	/*
	 * Método construtor padrão.
	 */
	public Automovel() {
		super();
	}

	/*
	 * Métodos Getters and Setters.
	 */
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return this.motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/*
	 * Método toString() para impressão em formato String do objeto Automovel.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Automovel [modelo=");
		builder.append(modelo);
		builder.append(", motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}

}