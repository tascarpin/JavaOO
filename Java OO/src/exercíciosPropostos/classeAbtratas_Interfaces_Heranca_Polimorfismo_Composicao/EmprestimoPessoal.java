package exercíciosPropostos.classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class EmprestimoPessoal implements Emprestimos {
	private Conta conta;
	private double valorEmpretismoPessoal;
	private double jurosMes;
	private int numMeses;
	
	public EmprestimoPessoal(Conta conta, double valorEmpretismoPessoal, double jurosMes, int numMeses) {
		this.conta = conta;
		this.valorEmpretismoPessoal = valorEmpretismoPessoal;
		this.jurosMes = jurosMes;
		this.numMeses = numMeses;
	}

	public Conta getConta() {
		return conta;
	}

	public double getValorEmpretismoPessoal() {
		return valorEmpretismoPessoal;
	}

	public double getJurosMes() {
		return jurosMes;
	}

	public int getNumMeses() {
		return numMeses;
	}

	@Override
	public void calculoJuros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "EmprestimoPessoal [valorEmpretismoPessoal=" + valorEmpretismoPessoal + ", jurosMes=" + jurosMes
				+ ", numMeses=" + numMeses + "]\n";
	}
		
}
