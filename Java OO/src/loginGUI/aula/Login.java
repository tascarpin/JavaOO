package loginGUI.aula;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login implements ActionListener {

	public JFrame frmLogin;
	private JPanel contentPane;
	private JLabel lblLogin, lblNome, lblSenha;
	private JTextField fldNome;
	private JPasswordField fldSenha;
	private Button btnRegistrar, btnLogin, btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Inicializando os componentes
		frmLogin = new JFrame();
		contentPane = new JPanel();
		lblLogin = new JLabel("Login");
		lblNome = new JLabel("Nome");
		lblSenha = new JLabel("Senha");
		fldNome = new JTextField();
		fldSenha = new JPasswordField();
		btnRegistrar = new Button("Registrar");
		btnLogin = new Button("Login");
		btnSair = new Button("Sair");
		
		//Configurando o frmLogin
		frmLogin.setTitle("Login");
		frmLogin.setResizable(false);
		frmLogin.setBounds(100, 100, 448, 332);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(new BorderLayout(0, 0));
		frmLogin.setContentPane(contentPane);
		
		/*Configurando os componentes*/
		
		//Configurando o contentPane
		contentPane.setMaximumSize(new Dimension(2147483647, 2147483647));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));				
		contentPane.setLayout(null);

		//Configurando label login
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblLogin.setBounds(171, 6, 139, 52);


		//Configurando label nome
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(57, 83, 78, 33);

		//Configurando textField nome
		fldNome.setBounds(162, 87, 160, 29);
		fldNome.setColumns(10);

		//Configurando label senha
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSenha.setBounds(57, 137, 78, 29);

		//Configurando textField senha
		fldSenha.setBounds(162, 141, 160, 29);
		fldSenha.setColumns(10);

		//Configurando botão registrar
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRegistrar.setBounds(73, 212, 89, 23);
		btnRegistrar.addActionListener(this); //Quando implementamos a interface actionListner podemos podemos chamar o actionPerfomand pelo this


		//Configurando botão login	
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(172, 212, 89, 23);
		btnLogin.addActionListener(this);		

		//Configurando botao sair			
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(273, 212, 89, 23);
		btnSair.addActionListener(this);

		/*------------------------------------------------------*/


		/* Adicionando os componentes do contentPane */
		contentPane.add(lblLogin);
		contentPane.add(lblNome);
		contentPane.add(lblSenha);
		contentPane.add(fldNome);
		contentPane.add(fldSenha);
		contentPane.add(btnRegistrar);
		contentPane.add(btnLogin);
		contentPane.add(btnSair);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button bb = (Button)e.getSource();
		if(bb==btnRegistrar) {
			frmLogin.dispose();
			Registrar re = new Registrar();
			re.frmRegistrar.setVisible(true);
		}
		
		if(bb==btnLogin)
		{

			try
			{
				Class.forName("org.mariadb.jdbc.Driver"); //A partir do JDBC 4, que está presente no Java 6, esse passo não é mais necessário.
				Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_oo?user=root&password=");
				Statement st = connection.createStatement();				
				ResultSet rs =st.executeQuery("select * from perfil where nome='" + fldNome.getText() + "' and senha='"+ String.copyValueOf(fldSenha.getPassword()) + "'");
				String nome=fldNome.getText();
				if(rs.next())
				{
					JOptionPane.showMessageDialog(frmLogin,"Login realizado com sucesso.");
					frmLogin.dispose();
					Login_welcome.nome = nome;
					Login_welcome m = new Login_welcome();
					m.frmLoginWelcome.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(frmLogin,"Usuario ou senha incorreto.");
				}
				connection.close();
				st.close();
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

		if(bb==btnSair)
			System.exit(0);		
	}

}
