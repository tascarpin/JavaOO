package classe.exemploPessoa;

/*
 * Por convenção, identificadores de nomes de variáveis iniciam com uma letra minúscula e cada palavra no nome depois da primeira
 * começa com uma letra maiúscula. 
 * 
 * Por exemplo, o identificador de nome da variável firstNumber inicia a sua segunda palavra, Number, com uma letra N maiúscula. 
 * Essa convenção de nomenclatura é conhecida como notação camelo, porque as letras maiúsculas destacam-se como corcovas desse animal.
 * 
 * Por convenção, os nomes de classe come�am com uma letra maiúscula, e os de métodos e de variáveis iniciam com uma letra minúscula.
*/

public class Pessoa {
	
	/*Modificadores de acesso: private, protected, public */	
	private String nome; //variável de instáncia. Variavel de escopo local. Quando não são inicializadas toda variável de instância tem um valor inicial null.
	//private String nome = "Sem nome cadastrado";
	//public String nome = "Sem nome cadastrado";
	
	//Um ou mais métodos que manipulam as variáveis de instância pertencentes aos objetos particulares dela.
	public void setNome(String nome) { //Cabeçalho do método. O void indica que não será retornado nada ao chamador
		this.nome = nome; //"This" é uma palavra chave utilizada para referenciar a variavel de instância.
	}
	
	//Método para recuperar o nome do objeto
	public String getNome() {
		return nome; //Retorna o valor do nome para quem chamar o m�todo
	}
	
}//Fim da classe conta
