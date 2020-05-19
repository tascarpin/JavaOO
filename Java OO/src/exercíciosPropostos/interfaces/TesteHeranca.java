package exercíciosPropostos.interfaces;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Tassio", "123456789-10");
		pessoa.setNome("Tassio Pinheiro");		
		pessoa.setNome("Tassio");
		
		//Forma errada pq a classe funcionário é abstrata
		//Funcionario funcionario = new Funcionario();
		
		Coordenador coordenador = new Coordenador("Tassio", "123456789-10", 10, 12345, 2500);
		//Funcionario programador = new Programador("Tassio", "123456789-10", 10, 123456, 
		//		2500.00, null, "Java", null);		

		new Projeto("Desenvolvimento IA", "Avalição dos algoritmos de Machine Learning", coordenador);
		new Projeto("Business Intelligence", "Data Analitcs", coordenador);
	
		System.out.println("Nome Funcionário: "+ coordenador.getNome());
		System.out.println("CPF Funcionário: "+ coordenador.getCpf());
		System.out.println("Tempo de Serviço: "+ coordenador.tempoDeServico +" anos.");
		System.out.println("Matriculo: "+ coordenador.matricula);
		System.out.println("Salario Base: "+ coordenador.salarioBase);
		
		
		System.out.println(coordenador.toString());		
//		System.out.println();
//		coordenador.imprimirProjetos();
		
	}

}
