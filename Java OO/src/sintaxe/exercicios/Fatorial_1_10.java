package sintaxe.exercicios;

/*Imprima todos os fatoriais de 1 a 10.*/

public class Fatorial_1_10 {

//	public static void main(String[] args) {
//		int fatorial = 1;
//		for (int i=1; i <=10; i++) {
//			fatorial*=i;
//			System.out.println(i+ " " + fatorial);
//		}
//
//	}
	
	//Outro jeito
	public static void main(String[] args) {
	    long fatorial = 1;
	    for (int n = 1; n <= 10; n++) {
	        while (n >= 2){
	            fatorial = fatorial * n;
	            break;            
	        }
	        System.out.println("Fatorial de "+n+" = "+fatorial);
	    }
	}

}
