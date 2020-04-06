package associacoa.agregacao.exemplo1;

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
	 * Atributo motor faz referência a um objeto do tipo Motorista.
	 */
	private Motorista motorista;

	/*
	 * Método construtor sobrecarregado adicionando o parâmetro do tipo
	 * Motorista neste caso o motorista não será instânciado dentro do
	 * construtor da classe Automovel, será instânciado fora desta e adicionado
	 * a lista de parâmetros deste contrustor, pois caso o objeto Automovel seja
	 * destruído o objeto Motorista continuará existindo.
	 */
	public Automovel(String modelo, int potenciaMotor, Motorista motorista) {
		this(modelo, potenciaMotor);
		this.motorista = motorista;
	}

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

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
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
		builder.append(", motorista=");
		builder.append(motorista);
		builder.append("]");
		return builder.toString();
	}

}