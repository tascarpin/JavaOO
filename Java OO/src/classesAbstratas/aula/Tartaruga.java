package classesAbstratas.aula;

public class Tartaruga extends Animal {
	public String tipoCaso;

	public void som() {
		System.out.println("Nada");
	}
	
	@Override
	public void imprimirDados() {
		System.out.println("Animal do gênero: " + super.getEspecie() + "\nTipo de casco: " + tipoCaso);
	}
	
}
