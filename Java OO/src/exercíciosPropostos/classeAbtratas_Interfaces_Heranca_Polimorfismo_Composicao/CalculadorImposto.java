package exercíciosPropostos.classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public abstract class CalculadorImposto {
	
	private static double totalImposto;
	
	
	public static void calcular(Tributavel t) {
		//Imaginar uma cálculo qualquer
		totalImposto = 0;
	}
	
	public static double getTotalImposto() {
		return totalImposto;
	}
}
