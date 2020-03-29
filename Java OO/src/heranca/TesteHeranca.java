package heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		//Criando um objeto
		Jogador j = new Jogador();
		j.nome = "Ronaldo";
		j.idade = 33;

		//Menssagem enviada ao objeto Jogador para chamar a função seApresentar, que pertece a super classe pessoa.
		j.seApresentar(); 
		j.dizerSeAindaJoga();
				
	}
	
}
