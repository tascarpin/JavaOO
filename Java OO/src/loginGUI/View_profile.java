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
	private JTextField fldNome;
	private JTextField fldSenha;
	private JTextField fldContato;
	private JTextField fldEmail;
	Button btnVoltar,btnSair;

	public View_profile(String n)
	{
		nome=n;		
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
		fldNome = new JTextField();
		fldSenha = new JTextField();
		fldContato = new JTextField();
		fldEmail = new JTextField();
		btnVoltar = new Button("Voltar");
		btnSair = new Button("Sair");

		/*------------------------------------------------*/

		/* CONFIGURANDO DOS COMPONENTES */

		//Configurando o frame
		setTitle("Perfil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 302);
		setContentPane(contentPane);
		setResizable(false);

		//Configurando o contentPane		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		//Configurando o label perfil
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblPerfil.setBounds(152, 11, 109, 44);		

		//Configurando o label nome
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(10, 72, 49, 31);

		//Configurando o label senha
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(10, 114, 80, 20);

		//Configurando o label contato
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContato.setBounds(10, 145, 88, 20);

		//Configurando o label email
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 183, 83, 14);

		//Configurando o textField nome
		fldNome.setBounds(101, 79, 200, 20);
		fldNome.setEditable(false);		
		fldNome.setColumns(10);	

		//Configurando o textField senha
		fldSenha.setBounds(101, 110, 200, 20);
		fldSenha.setEditable(false);		
		fldSenha.setColumns(10);

		//Configurando o textField contato
		fldContato.setBounds(101, 141, 200, 20);
		fldContato.setEditable(false);		
		fldContato.setColumns(10);		

		//Configurando o textField  email
		fldEmail.setBounds(101, 182, 200, 20);
		fldEmail.setEditable(false);		
		fldEmail.setColumns(10);

		//Configurando o botão voltar
		btnVoltar.addActionListener(this);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(61, 228, 89, 23);

		//Configurando o botão sair
		btnSair.addActionListener(this);
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBounds(172, 229, 89, 23);

		/*------------------------------------------------------*/


		/* Adicionando os componentes do contentPane */

		contentPane.add(lblPerfil);
		contentPane.add(lblNome);		
		contentPane.add(lblSenha);
		contentPane.add(lblContato);
		contentPane.add(lblEmail);
		contentPane.add(fldNome);
		contentPane.add(fldSenha);
		contentPane.add(fldContato);
		contentPane.add(fldEmail);
		contentPane.add(btnVoltar);
		contentPane.add(btnSair);

		/*----------------------------------------------------------------*/

		try
		{
			//			Class.forName("oracle.jdbc.driver.OracleDriver");
			//			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_oo?user=root&password=");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select * from perfil where name='"+nome+"'");
			if(rs.next())
			{
				fldNome.setText(rs.getString(1));
				fldSenha.setText(rs.getString(2));
				fldContato.setText(rs.getString(3));
				fldEmail.setText(rs.getString(4));

			}
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Dados não encontrados.");
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}


	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		Button bb=(Button)ae.getSource();
		if(bb==btnVoltar)
		{
			dispose();
			Login_Welcome m = new Login_Welcome();
			m.setVisible(true);
		}
		if(bb==btnSair)
		{
			System.exit(0);
		}

	}

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
}

