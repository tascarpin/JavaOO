package exercíciosPropostos;

/*Imprima todos os fatoriais de acima de 20.
Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Por quê? 
Mude de int para long para ver alguma mudança.*/


public class Fatorial_mais_de_20 {

	public static void main(String[] args) {
		double fatorial = 1;
		for (double i=1; i <=20; i++) {
			fatorial*=i;
			System.out.println(i+ " " + fatorial);
		}

	}

}
