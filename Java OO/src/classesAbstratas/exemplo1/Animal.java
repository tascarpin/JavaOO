package classesAbstratas.exemplo1;

public abstract class Animal {
	String genero;
	
	//Método abstrato
	public abstract void imprimirDados();
	
	//Método regular
	public String getDescricao() {
		return genero;
	}
}
