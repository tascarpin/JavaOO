package sintaxe.exercicios;

/*Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
	se x é par, x = x / 2
	se x é impar, x = 3 * x + 1
	imprime x
O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13 , a saída será:
40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1*/

public class Ex1 {

    public static void main(String[] args){
        int x = 13, sentinela = 0;
        while(sentinela != 1){
            if(x%2 == 0){ //Para x par a divisão não possui resto
                sentinela = x/2;
            } else {
                sentinela = 3 * x + 1;
            }
            System.out.print(sentinela+", ");
            x = sentinela;
        }
    }

}
