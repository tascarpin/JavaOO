package sintaxe;

public class controleFluxo {
	
	
	//IF ELSE	
	public void podeBeber(int idade) {
		if(idade >= 18) {
			System.out.println("Pode beber!!!");	
		}else
		{
			System.out.println("Vai crescer!!!");	
		}
	}
	
	//WHILE
	public int crecer(int idade) {
		while(idade < 18) {
			idade = idade +1;
		}
		return idade;
	}

//	//FOR
//	public void beberTodas(int novaIdade) {
//		// TODO Auto-generated method stub
//		for(int i = 0; i <= 10; ++i) {
//			System.out.printf("Bebo com %d", novaIdade + i);
//			System.out.println();
//		}
//		
//	}

	public void beberTodas(int novaIdade) {
		while(novaIdade < 30) {
			for(int i = 0; i <= 10; ++i) {
				System.out.printf("Bebo com %d", novaIdade + i);
				System.out.println();
				novaIdade = novaIdade + i;
			}
		}
	}
			
}
