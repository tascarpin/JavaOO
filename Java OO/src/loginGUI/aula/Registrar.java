package loginGUI.aula;

import java.awt.Button;
import java.awt.EventQueue;
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

@SuppressWarnings("unused")
public class Registrar implements ActionListener{

	public JFrame frmRegistrar;
	private JPanel contentPane;
	private JTextField fldNome, fldSenha, fldConfirmarSenha, fldContato, fldEmail;
	private JLabel lblRegistrar, lblNome, lblSenha, lblConfirmarSenha, lblContato, lblEmail;
	Button btnEnviar,btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar window = new Registrar();
					window.frmRegistrar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrar = new JFrame();
		frmRegistrar.setTitle("Registrar");
		frmRegistrar.setResizable(false);
		frmRegistrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrar.setBounds(100, 100, 508, 372);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Adicionando o contentPane ao frmRegistrar
		frmRegistrar.setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		lblRegistrar = new JLabel("Registrar");
		lblRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblRegistrar.setBounds(140, 17, 205, 44);
		contentPane.add(lblRegistrar);

		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(53, 66, 52, 30);
		contentPane.add(lblNome);

		fldNome = new JTextField();
		fldNome.setBounds(198, 73, 176, 20);
		fldNome.setColumns(10);
		contentPane.add(fldNome);

		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(53, 169, 67, 30);
		contentPane.add(lblSenha);

		fldSenha = new JPasswordField();
		//textField_1.setEchoChar('*');
		fldSenha.setBounds(198, 176, 176, 20);
		contentPane.add(fldSenha);
		fldSenha.setColumns(10);

		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConfirmarSenha.setBounds(53, 210, 139, 14);
		contentPane.add(lblConfirmarSenha);

		fldConfirmarSenha = new JPasswordField();
		fldConfirmarSenha.setBounds(198, 207, 176, 20);
		//textField_2.setEchoChar('*');
		contentPane.add(fldConfirmarSenha);
		fldConfirmarSenha.setColumns(10);

		JLabel lblContato = new JLabel("Contato");
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContato.setBounds(53, 102, 96, 20);
		contentPane.add(lblContato);

		fldContato = new JTextField();
		fldContato.setBounds(198, 104, 176, 20);
		contentPane.add(fldContato);
		fldContato.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(53, 138, 86, 20);
		contentPane.add(lblEmail);

		fldEmail = new JTextField();
		fldEmail.setBounds(198, 140, 176, 20);
		contentPane.add(fldEmail);
		fldEmail.setColumns(10);

		btnEnviar= new Button("Enviar");
		btnEnviar.addActionListener(this);
		btnEnviar.setBounds(250, 269, 67, 23);
		contentPane.add(btnEnviar);

		btnVoltar = new Button("Voltar");
		btnVoltar.addActionListener(this);
		btnVoltar.setBounds(125, 269, 67, 23);
		contentPane.add(btnVoltar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button bb = (Button)e.getSource();
		if(bb==btnEnviar) {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection connection = 
						DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_oo?user=root&password=");
				Statement st=connection.createStatement();
				if(fldNome.getText().trim().isEmpty()||fldSenha.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frmRegistrar,"O campo nome ou senha são obrigatórios.");
				}
				else
				{
					ResultSet rs=st.executeQuery("select * from perfil where nome='"+fldNome.getText()+"'");
					if(rs.next())
					{
						JOptionPane.showMessageDialog(frmRegistrar,"O nome de usuário já existe.");
					}
					else
					{
						if(fldSenha.getText().equals(fldConfirmarSenha.getText()))
						{
							PreparedStatement ps=connection.prepareStatement("insert into perfil(nome, senha, contato, email) values (?,?,?,?)");
							ps.setString(1,fldNome.getText());
							ps.setString(2,fldSenha.getText());
							ps.setString(3,fldContato.getText());
							ps.setString(4,fldEmail.getText());
							ps.executeUpdate();
							JOptionPane.showMessageDialog(frmRegistrar,"Perfil criado com sucesso.");
							frmRegistrar.dispose();
							Login p = new Login();
							p.frmLogin.setVisible(true);
							connection.close();
							ps.close();
						}
						else
						{
							JOptionPane.showMessageDialog(frmRegistrar,"Senha incorreta.");
						}
					}
				
				}
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println("Dados não encontrados");
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		
		if(bb==btnVoltar)
		{
			frmRegistrar.dispose();
			Login p=new Login();         //gets us back to Page1 ie. Login page
			p.frmLogin.setVisible(true);
		}

	}
}
