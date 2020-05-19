package loginGUI.aula;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

public class Edit_profile implements ActionListener{

	public static String nome;
	public JFrame frmEditProfile;
	private JPanel contentPane;
	private JLabel lblPerfil, lblNome, lblSenha, lblContato, lblEmail;  
	private JTextField fldNome;
	private JTextField fldSenha;
	private JTextField fldContato;
	private JTextField fldEmail;
	private Button btnVoltar,btnEnviar;
	
	/**
	 * Create the application.
	 */
	public Edit_profile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Inicialização do componentes
		frmEditProfile = new JFrame();
		contentPane = new JPanel();
		lblPerfil = new JLabel("Editar perfil");
		lblNome = new JLabel("Nome");
		fldNome = new JTextField();
		lblSenha = new JLabel("Senha");
		fldSenha = new JPasswordField();
		fldEmail = new JTextField();
		
		//Configuração dos componentes
		
		//Frame
		frmEditProfile.setTitle("Editar");
		frmEditProfile.setResizable(false);
		frmEditProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditProfile.setBounds(100, 100, 386, 306);
		frmEditProfile.setContentPane(contentPane);
		
		//ContentPane
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		//Labels e filds
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblPerfil.setBounds(101, 11, 207, 44);
		
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(10, 72, 49, 31);
		
		fldNome.setBounds(101, 79, 207, 20);
		fldNome.setColumns(10);

		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(10, 114, 80, 20);
		
		fldSenha.setBounds(101, 110, 207, 20);
		fldSenha.setEditable(true);
		fldSenha.setColumns(10);

		lblContato = new JLabel("Contato");
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContato.setBounds(10, 145, 88, 20);
		
		fldContato = new JTextField();
		fldContato.setBounds(101, 141, 207, 20);
		fldContato.setEditable(true);
		fldContato.setColumns(10);

		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 183, 83, 14);
		
		fldEmail.setBounds(101, 182, 207, 20);
		fldEmail.setEditable(true);
		fldEmail.setColumns(10);

		//Botões
		btnVoltar = new Button("Voltar");
		btnVoltar.addActionListener(this);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(61, 228, 89, 23);
		
		btnEnviar = new Button("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEnviar.setBounds(172, 229, 89, 23);
		btnEnviar.addActionListener(this);
		
		//Adicionando os componentes no contentPane
		contentPane.add(lblPerfil);
		contentPane.add(lblNome);
		contentPane.add(fldNome);
		contentPane.add(lblSenha);
		contentPane.add(fldSenha);
		contentPane.add(lblContato);
		contentPane.add(fldContato);
		contentPane.add(lblEmail);
		contentPane.add(fldEmail);
		contentPane.add(btnVoltar);
		contentPane.add(btnEnviar);
		
		try
		{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_oo?user=root&password=");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select nome, senha, contato, email from perfil where nome='"+ nome +"'");
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
	public void actionPerformed(ActionEvent ae) {
		
		Button bb=(Button)ae.getSource();
		if(bb==btnVoltar)	
		{
			frmEditProfile.dispose();
			Login_welcome m=new Login_welcome(); 
			m.frmLoginWelcome.setVisible(true);
		}
		
		if(bb==btnEnviar)
		{
			if(fldSenha.getText().trim().isEmpty())
			{
				JOptionPane.showMessageDialog(frmEditProfile,"Porfavor, é obrigatório criar uma senha.");
			}
			else
			{
				try
				{
					Class.forName("org.mariadb.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_oo?user=root&password=");
					PreparedStatement ps=connection.prepareStatement("update perfil set nome=(?),senha=(?), contato=(?), email=(?) where nome='"+nome+"'");
					ps.setString(1,fldNome.getText());
					ps.setString(2, fldSenha.getText());
					ps.setString(3, fldContato.getText());
					ps.setString(4, fldEmail.getText());
					ps.executeUpdate();
					JOptionPane.showMessageDialog(frmEditProfile,"Atualização realizada com sucesso.");
					frmEditProfile.dispose();
					Login_welcome m=new Login_welcome(); 
					m.frmLoginWelcome.setVisible(true);
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

		}
		
	}
}
