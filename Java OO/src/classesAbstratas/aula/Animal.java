package classesAbstratas.aula;

public abstract class Animal {
	public String especie;
	
	public abstract void imprimirDados();
	
	public abstract void som();
	
	public final String getEspecie() {
		return especie;
	}	
}
