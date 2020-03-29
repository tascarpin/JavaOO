package heranca;

public class Jogador extends Pessoa {

	protected String aindaJoga = "Não. Não joga mais.";

	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}

}