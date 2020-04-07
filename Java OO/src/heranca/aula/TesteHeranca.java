package heranca.aula;

public class TesteHeranca {

	public static void main(String[] args) {
		//Criar o bjeto Jogador
		Jogador jogador = new Jogador("Tassio", 37);
		
		jogador.seApresentar();
		jogador.getAindaJoga();
		
		jogador.setAindaJoga("Claro que sim. "
				+ "E apesar de gordo ainda faço gol.");
		jogador.getAindaJoga();
		
		jogador.nome = "Ronaldinho";
		jogador.setIdade(45);
		
		jogador.seApresentar();
		jogador.setAindaJoga("Claro que não. "
				+ "O coitado está preso.");
		jogador.getAindaJoga();

	}

}
