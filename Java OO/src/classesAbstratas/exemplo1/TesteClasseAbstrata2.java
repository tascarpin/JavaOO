package classesAbstratas.exemplo1;

public class TesteClasseAbstrata2 {

	public static void main(String[] args) {
		//Lembrando que não podemos instanciar classes abstratas
		Animal p = new Cachorro();
		p.genero = "Mamífero";
		
		Cachorro pp = (Cachorro) p;
		pp.setRaca("Sem raça definida.");
		
		p.imprimirDados();
		
	}

}
