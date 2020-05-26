package classesAbstratas.exemplo1;

public class TesteClasseAbstrata1 {

	public static void main(String[] args) {
		Cachorro p = new Cachorro();
		p.genero = "Mamífero";
		p.setRaca("Sem raça definida.");		
		p.imprimirDados();
		
	}

}
