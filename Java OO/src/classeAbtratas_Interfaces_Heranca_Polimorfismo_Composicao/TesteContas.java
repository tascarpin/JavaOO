package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class TesteContas {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Tassio", "123465789", "Professor");
		System.out.println(cliente.toString());
		
		Conta cc = new ContaCorrente(cliente, 11,111);
		cc.depositar(100.0);
			
		Conta cp = new ContaPoupanca(cliente, 11, 110);
		cp.depositar(200.0);
		
		cc.transferir(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		System.out.println();
		
		cc.sacar(50);
		cp.sacar(5);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CC: " + cc.getSaldo());
		System.out.println();
		
		
		//Adiconar serviços e empréstiomos
		Emprestimos emprestimoPessoal = new EmprestimoPessoal(cc, 50.000, 0.3, 24);
		Emprestimos creditoVeiculo = new CreditoVeiculo(cc, 85.000, 1.5, 60);
		Emprestimos creditoImobiliario = new CredtioImobiliario(cc, 350.000, 0.05, 360);
		Seguros servico = new SeguroDeVida(500.000);
		
		cc.setEmprestimo(emprestimoPessoal);
		cc.setEmprestimo(creditoVeiculo);
		cc.setEmprestimo(creditoImobiliario);
		
		
		cc.setServicos(servico);
		
		System.out.println(cc.emprestimo.toString());
		System.out.println(cc.servico.toString());
		
		
		//Calcular o imposto de renda
//		CalculadorImposto.calcular(cc);
		
		
	}

}
