package classesAbstratas.exemploAnimal;

public class Cachorro extends Animal {
	private String raca;	

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void imprimirDados() {
		// TODO Auto-generated method stub
		System.out.println("Animal do gênero: " + super.getDescricao() + "\nDa raça: " + raca);
	}
}
 