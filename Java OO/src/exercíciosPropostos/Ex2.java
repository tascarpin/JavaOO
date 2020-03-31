package exercíciosPropostos;

/*Imprima a seguinte tabela, usando for s encadeados:
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n

Ex.
1  
2 4  
3 6 9  
4 8 12 16  
5 10 15 20 25  
6 12 18 24 30 36  
7 14 21 28 35 42 49  
8 16 24 32 40 48 56 64  
9 18 27 36 45 54 63 72 81  
10 20 30 40 50 60 70 80 90 100 
*/

public class Ex2 {

	public static void main(String[] args) {

		for (int n = 1; n <= 10; n++){   
			for (int i = 1; i <= n; i++){   
				System.out.print((n*i) + " ");  
			}   
			System.out.println();
		}

	}
}
