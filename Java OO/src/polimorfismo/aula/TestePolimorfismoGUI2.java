package polimorfismo.aula;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class TestePolimorfismoGUI2 implements ActionListener{

	//Inicialização dos componentes
	JFrame frmAplicaoJava = new JFrame("Aplicação Java");
	JPanel panel = new JPanel();
	JLabel lblValor = new JLabel("Porfavor entre com valor do saque:");
	JTextField fldValor = new JTextField();
	JButton btnEnviar = new JButton("Enviar");
	JTextArea txtArea = new JTextArea();
	private Conta conta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conta conta = new Conta("12345-6", 100.00);
					TestePolimorfismoGUI2 window = new TestePolimorfismoGUI2(conta);
					window.frmAplicaoJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestePolimorfismoGUI2(Conta conta) {
		this.conta = conta;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		//Configuração dos componentes
		frmAplicaoJava.setBounds(100, 100, 450, 300);
		frmAplicaoJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		fldValor.setColumns(10);
		txtArea.setText(conta.toString() + "\n");
		
		//Adiconando os componentes no panel Frame
		frmAplicaoJava.getContentPane().add(panel, BorderLayout.NORTH);
		frmAplicaoJava.getContentPane().add(txtArea, BorderLayout.CENTER);
		
		//Adicionando os componentes no painel panel
		panel.add(lblValor);				
		panel.add(fldValor);
		panel.add(btnEnviar);
		
		btnEnviar.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(!fldValor.getText().isEmpty()) {
			conta.saque(Double.parseDouble(fldValor.getText()));
			JOptionPane.showMessageDialog(frmAplicaoJava,  conta.toString(), 
					"Aviso", JOptionPane.INFORMATION_MESSAGE);
			txtArea.setText(txtArea.getText() + conta.toString() + "\n");
		}else
			JOptionPane.showMessageDialog(frmAplicaoJava, "Insira um valor.", 
					"Alerta", JOptionPane.WARNING_MESSAGE);
	}

}
