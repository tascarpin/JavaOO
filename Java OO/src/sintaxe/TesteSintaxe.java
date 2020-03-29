package sintaxe;

public class TesteSintaxe {

	public static void main(String[] args) {
		
//		System.out.println("Hello World");
		
//		int x = 2;
//		int idade = 37;		
//			
//		System.out.println("Valor: " + x);
//		System.out.println("Valor: " + idade);
//		System.out.println("-------------");
//		
//		Variaveis var = new Variaveis();
//		Variaveis var = new Variaveis();		
//		var.imprimir();
//		System.out.println("-------------");
//		
//		System.out.println("Valor: " + var.x);
//		System.out.println("Valor: " + var.idade);
		
		
//		OperacaoMatematica opMat = new OperacaoMatematica();
//		
//		opMat.soma(2, 3.2);
//		System.out.println();
//		System.out.println("-------------");
//		opMat.subtracao(5, 7);
//		System.out.println();
//		System.out.println("-------------");
//		opMat.multiplicacao(10, 12);
//		System.out.println();
//		System.out.println("-------------");
//		opMat.divisao(15, 20);
//		System.out.println();
//		System.out.println("-------------");
//		opMat.divisao();
//		System.out.println();
//		System.out.println("-------------");	
		
		int idade = 17;
		
		controleFluxo id = new controleFluxo();
		id.podeBeber(idade);
		System.out.println("-------------");	
		
//		id.podeBeber(id.crecer(idade));
		
		int novaIdade = id.crecer(idade);
		id.podeBeber(novaIdade);
		
		System.out.println("-------------");
		
		id.beberTodas(novaIdade);
		
	}

}
