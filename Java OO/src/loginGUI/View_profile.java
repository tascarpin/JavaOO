package loginGUI;

import java.awt.Button;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View_profile extends JFrame implements ActionListener
{
    public static String nome;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	Button voltar,sair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					View_profile frame = new View_profile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View_profile() 
	{
		/* INICIALIZANDO OS COMPONENTES */
		
			//Criando os componentes
			contentPane = new JPanel();
			JLabel lblPerfil = new JLabel("Perfil");
			JLabel lblNome = new JLabel("Nome");
			JLabel lblSenha = new JLabel("Senha");
			JLabel lblContato = new JLabel("Contato");
			JLabel lblEmail = new JLabel("E-mail");
			textField = new JTextField();
			textField_1 = new JTextField();
			textField_2 = new JTextField();
			textField_3 = new JTextField();
			voltar = new Button("Voltar");
			sair = new Button("Sair");
		
		/*------------------------------------------------*/
			
		/* CONFIGURANDO DOS COMPONENTES */
		
			//Configurando o Frame
			setTitle("Perfil");		
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 372, 302);
			setContentPane(contentPane);
			
			//Configurando o ContentPane		
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
					
			//Configurando o Label Perfil
			lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 36));
			lblPerfil.setBounds(152, 11, 109, 44);		
			
			//Configurando o Label Nome
			lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNome.setBounds(10, 72, 49, 31);
			
			//Configurando o Label Senha
			lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSenha.setBounds(10, 114, 80, 20);
			
			//Configurando o Label Contato
			lblContato.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblContato.setBounds(10, 145, 88, 20);
	
			//Configurando o Label Email
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEmail.setBounds(10, 183, 83, 14);
	
			//Configurando o TextField
			textField.setBounds(101, 79, 200, 20);
			textField.setEditable(false);		
			textField.setColumns(10);	
			
			//Configurando o TextField 1
			textField_1.setBounds(101, 110, 200, 20);
			textField_1.setEditable(false);		
			textField_1.setColumns(10);
					
			//Configurando o TextField 2
			textField_2.setBounds(101, 141, 200, 20);
			textField_2.setEditable(false);		
			textField_2.setColumns(10);		
		
			//Configurando o TextField 3
			textField_3.setBounds(101, 182, 200, 20);
			textField_3.setEditable(false);		
			textField_3.setColumns(10);
			
			//Configurando o Botão Voltar
			voltar.addActionListener(this);
			voltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			voltar.setBounds(61, 228, 89, 23);
	
			//Configurando o Botão sair
			sair.addActionListener(this);
			sair.setFont(new Font("Tahoma", Font.PLAIN, 12));
			sair.setBounds(172, 229, 89, 23);
		
		/*------------------------------------------------------*/
		
		
		/* Adicionando os componentes do Content Pane */
			
			contentPane.add(lblPerfil);
			contentPane.add(lblNome);		
			contentPane.add(lblSenha);
			contentPane.add(lblContato);
			contentPane.add(lblEmail);
			contentPane.add(textField);
			contentPane.add(textField_1);
			contentPane.add(textField_2);
			contentPane.add(textField_3);
			contentPane.add(voltar);
			contentPane.add(sair);
			
		/*----------------------------------------------------------------*/
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from Java where name='"+nome+"'");
			if(rs.next())
			{
				textField.setText(rs.getString(1));
				textField_1.setText(rs.getString(2));
				textField_2.setText(rs.getString(3));
				textField_3.setText(rs.getString(4));
	       
		     }
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Class nt found");
		}
	    catch(SQLException se)
		{
	    	se.printStackTrace();
		}
		
		
	}
	public View_profile(String n)
	{
		nome=n;
		
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		Button bb=(Button)ae.getSource();
		if(bb==voltar)
		{
			dispose();
			Login_Welcome m=new Login_Welcome();          //gets us back to Login_Welcome page
			m.setVisible(true);
		}
		if(bb==sair)
		{
			System.exit(0);
		}
		
	}
}

