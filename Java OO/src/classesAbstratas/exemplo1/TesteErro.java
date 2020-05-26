package classesAbstratas.exemplo1;

public class TesteErro {

	public static void main(String[] args) {
		Animal p = new Cachorro();
		p.genero = "Mamífero";
		/* ERRO */
		//Esse método só está disponível para objeto da Classe cachorro e não da classe Animal.
		//p.setRaca("Sem raça definida.");
		
		p.imprimirDados();
		
	}

}
