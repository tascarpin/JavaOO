package sintaxe.exercicios;


/*Imprima todos os números de 150 a 300*/

public class Imprimir_150a300 {

	public static void main(String[] args) {
		
		int num;
		num = 150;
		while (num < 300) {
			num = num + 1;
			System.out.println(num);
		}

	}
	
	//Outro jeito

//	public static void main(String[] args) {
//		for(int i = 150; i<=300; i++) {
//			System.out.println(i);
//		}
//	}
	
}