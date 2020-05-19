package polimorfismo.exemplo1;

import java.util.Scanner;

public class TestePolimorfismo1 {

	  public static void main(String[] args) {
	  
	  //Cria o objeto da classe Conta passando os parâmetros para o construtor
	  Conta conta = new Conta("55768-7", 100);
	  System.out.println(conta.toString());
	  
	  //Entrada de dados
	  System.out.println("Porfavor entre com o valor do saque:"); 
	  
	  Scanner input = new Scanner(System.in);
	  
	  //Capturar o valor como string 
	  String valor = input.nextLine();
	  
	  //Menssagem para objeto conta 
	  conta.saque(Double.parseDouble(valor));
	  
	  //Imprimir resultado no console 
	  System.out.println(conta.toString());
	  
	  input.close();
	  
	  }
}
