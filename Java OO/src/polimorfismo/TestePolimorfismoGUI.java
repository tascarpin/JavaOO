package polimorfismo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JTextField;
import polimorfismo.TestePolimorfismoGUI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestePolimorfismoGUI  {

	private JFrame frame;
	private JPanel contentPanel;
	private JTextField fldValor;
	private JLabel lblValor;
	private JButton btnValor;
	private Conta conta;
	private JTextArea fldArea;
	
	/**
	 * Create the application.
	 */
	public TestePolimorfismoGUI(Conta conta) {
		this.conta = conta;
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Inicializado componentes
		frame = new JFrame("Aplicação Java");	
		contentPanel = new JPanel();
		lblValor = new JLabel("Porfavor entre com o valor do saque:");
		fldValor = new JTextField();
		fldArea = new JTextArea();
		btnValor = new JButton("Enviar");
		
		//Configurando os componentes
		frame.setBounds(100, 100, 431, 151);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fldValor.setColumns(10);
		fldArea.setColumns(10);
		fldArea.setText(conta.toString() + "\n");
		
		//Adionanando os componentes no panel
		contentPanel.add(lblValor);
		contentPanel.add(fldValor);
		contentPanel.add(btnValor);
		
		//Adicionando o panel ao frame
		frame.getContentPane().add(contentPanel, BorderLayout.NORTH);						
		frame.getContentPane().add(fldArea, BorderLayout.CENTER);
		
		frame.setVisible(true);
			
		btnValor.addActionListener(new ActionListener() {
	  
			@Override 
			public void actionPerformed(ActionEvent e) { // TODO Auto-generated method stub 
				if(!fldValor.getText().isEmpty() ) {
					conta.saque(Double.parseDouble(fldValor.getText()));
					//Usando o JOptionPane
					JOptionPane.showMessageDialog( frame, conta.toString(), "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
					//Usando um campo textArea
					fldArea.setText(fldArea.getText() + conta.toString() + "\n");
					fldValor.setText(null);
			  }else 
				  JOptionPane.showMessageDialog( frame, "Insira um valor.", "Alerta",
					  JOptionPane.WARNING_MESSAGE); 
			  } 
		});
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conta conta = new Conta("55768-7", 100);
					new TestePolimorfismoGUI(conta);									
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
