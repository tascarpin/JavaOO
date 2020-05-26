package sintaxe.exercicios;

/*Imprima a soma de 1 até 1000*/

public class ImprimirSoma_1a1000 {

	public static void main(String[] args) {
		int num=0;
		int soma=0;
		while (num <= 1000) {
			soma = soma+num;
			num++;
			
		}
		System.out.println(soma);	
	}
	
}