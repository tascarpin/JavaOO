package heranca;

//Super classe
public class Pessoa {

	String nome;
	protected int idade; //Protected dá visibilidade apenas até suas subclasses
	
	public void seApresentar() {
		System.out.println("Olá, eu sou o " + nome + ", e tenho " + idade + " anos.");
	}
	
}