package somaGUI.aula;

import javax.swing.JOptionPane;

public class SomaGUI {

	public static void main(String[] args) {
		String numA = 
				JOptionPane.showInputDialog("Entre com o primeiro número inteiro");
		String numB = 
				JOptionPane.showInputDialog("Entre com o segundo número inteiro");
		
		
		int num1 = Integer.parseInt(numA);
		int num2 = Integer.parseInt(numB);
		
		int soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "A soma é " + soma, 
				"Soma de dois inteiro", JOptionPane.INFORMATION_MESSAGE);
	}
}
