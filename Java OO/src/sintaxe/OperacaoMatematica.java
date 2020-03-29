package sintaxe;

public class OperacaoMatematica {
	int x = 2;
	int y = 5;
	float a = 2.3f;
	char b = 'T';
	String classe = "Operacao Matematica";
		
	public void soma(int x, double y){
		System.out.println(x+y);		
		System.out.printf("Valor: %f", x+y);
	}
	
	public void subtracao(int x, int y){
		System.out.println(x-y);
		System.out.printf("Valo;r: %d", x-y);
	}
	
	public void multiplicacao(int x, int y){
		System.out.println(x*y);
		System.out.printf("Valor: %d", x*y);
	}
	
	public void divisao(int x, int y){
		System.out.println(y/x);
		System.out.printf("Valor: %d", x/y);
	}
	
	public void divisao() {
		System.out.println(y/x);
		System.out.printf("Valor: %d", x+y);
	}
}
