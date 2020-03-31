package loginGUI;

import java.awt.Button;
import java.awt.Component;
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

@SuppressWarnings("serial")
public class Edit_proile extends JFrame implements ActionListener
{
	public static String name;
	private JPanel contentPane;
	private JTextField fldNome;
	private JTextField fldSenha;
	private JTextField fldContato;
	private JTextField fldEmail;
	private Component frame;
	Button btnVoltar,btnEnviar;

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
	public Edit_proile() 
	{
		setTitle("Editar");
		setResizable(false);
		//System.out.println(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPerfil = new JLabel("Editar perfil");
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblPerfil.setBounds(101, 11, 207, 44);
		contentPane.add(lblPerfil);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(10, 72, 49, 31);
		contentPane.add(lblNome);

		fldNome = new JTextField();
		fldNome.setBounds(101, 79, 207, 20);
		contentPane.add(fldNome);
		fldNome.setColumns(10);


		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(10, 114, 80, 20);
		contentPane.add(lblSenha);

		fldSenha = new JPasswordField();
		fldSenha.setBounds(101, 110, 207, 20);
		fldSenha.setEditable(true);
		contentPane.add(fldSenha);
		fldSenha.setColumns(10);

		JLabel lblContato = new JLabel("Contato");
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContato.setBounds(10, 145, 88, 20);
		contentPane.add(lblContato);

		fldContato = new JTextField();
		fldContato.setBounds(101, 141, 207, 20);
		fldContato.setEditable(true);
		contentPane.add(fldContato);
		fldContato.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 183, 83, 14);
		contentPane.add(lblEmail);

		fldEmail = new JTextField();
		fldEmail.setBounds(101, 182, 207, 20);
		fldEmail.setEditable(true);
		contentPane.add(fldEmail);
		fldEmail.setColumns(10);

		btnVoltar = new Button("Voltar");
		btnVoltar.addActionListener(this);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(61, 228, 89, 23);
		contentPane.add(btnVoltar);

		btnEnviar = new Button("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEnviar.setBounds(172, 229, 89, 23);
		btnEnviar.addActionListener(this);
		contentPane.add(btnEnviar);

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from Java where name='"+name+"'");
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
	public Edit_proile(String n)
	{
		name=n;

	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		Button bb=(Button)ae.getSource();
		if(bb==btnEnviar)
		{
			if(fldSenha.getText().trim().isEmpty())
			{
				JOptionPane.showMessageDialog(frame,"Porfavor, é obrigatório criar uma senha.");
			}
			else
			{
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
					PreparedStatement ps=cn.prepareStatement("update Java set name=(?),password=(?),contact=(?),email=(?) where name='"+name+"'");
					ps.setString(1,fldNome.getText());
					ps.setString(2, fldSenha.getText());
					ps.setString(3, fldContato.getText());
					ps.setString(4, fldEmail.getText());
					ps.executeUpdate();
					JOptionPane.showMessageDialog(frame,"Atualização realizada com sucesso.");
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
		if(bb==btnVoltar)
		{
			dispose();
			Login_Welcome m=new Login_Welcome();          //gets us back to Login_Welcome 
			m.setVisible(true);
		}

	}
}
