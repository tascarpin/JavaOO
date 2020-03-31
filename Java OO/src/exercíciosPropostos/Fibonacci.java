package exercíciosPropostos;


/*Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento 
somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).*/

public class Fibonacci {

	public static void main(String[] args) {
		int resultado = 0, ant = 0, prox = 1;

		System.out.println(ant);
		System.out.println(prox);		
		
		do{
			resultado = prox + ant;
			System.out.println(resultado);
			ant = prox;
			prox = resultado;			
		}while(resultado<100); 
	}
	
	//Outro jeito
//	public static void main(String[] args) {
//	int ant = 0, prox = 1;
//
//	System.out.println(ant);
//	System.out.println(prox);		
//	
//	while(prox<100) {
//		prox+=ant;
//		ant = prox - ant;
//		System.out.println(prox);				
//	}
//}

}