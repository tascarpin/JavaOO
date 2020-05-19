package loginGUI.aula;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Login_welcome implements ActionListener {

	public static String nome;
	public JFrame frmLoginWelcome;
	private JPanel contentPane;	
	private JLabel lblHiwelcome;
	private Button btnVisualizar,btnEditar,btnLogOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_welcome window = new Login_welcome();
					window.frmLoginWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
//	public Login_welcome(String n)
//	{
//		nome=n;
//	}

	/**
	 * Create the application.
	 */
	public Login_welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				
		/* INICIALIZANDO OS COMPONENTES */

		//Criando os componentes		
		frmLoginWelcome = new JFrame();
		contentPane = new JPanel();
		lblHiwelcome = new JLabel("New text");
		btnVisualizar = new Button("Visualizar Perfil");
		btnEditar = new Button("Editar Perfil");
		btnLogOut=new Button("Log Out");
		
		/* CONFIGURANDO DOS COMPONENTES */

		//Configurando o frame
		frmLoginWelcome.setResizable(false);
		frmLoginWelcome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmLoginWelcome.setBounds(100, 100, 450, 300);
		frmLoginWelcome.setContentPane(contentPane);

		//Configurando o contentPane
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		
		contentPane.setLayout(null);
		
		//Configurando tela de boas vindas
		lblHiwelcome.setBounds(99, 11, 209, 62);
		lblHiwelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		String mssge="Olá ";
		mssge+=nome;
		mssge+="..Seja bem vindo!!!";
		lblHiwelcome.setText(mssge);


		//Configurando o botão visualizar
		btnVisualizar.setBounds(21, 111, 99, 44);
		btnVisualizar.addActionListener(this);

		//Configurando o botão editar
		btnEditar.setBounds(127, 111, 106, 44);
		btnEditar.addActionListener(this);

		//Configurando o botão logOut
		btnLogOut.addActionListener(this);
		btnLogOut.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnLogOut.setBounds(350, 11, 74, 19);
		
		/* Adicionando os componentes do contentPane */

		contentPane.add(lblHiwelcome);
		contentPane.add(btnVisualizar);
		contentPane.add(btnEditar);
		contentPane.add(btnLogOut);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		Button bb=(Button)ae.getSource();
		if(bb==btnVisualizar)
		{
			frmLoginWelcome.dispose();
			View_profile.nome = nome;;
			View_profile le = new View_profile();  //View Profile
			le.frmViewProfile.setVisible(true);

		}
		if(bb==btnEditar)
		{
			frmLoginWelcome.dispose();
			Edit_profile.nome = nome;
			Edit_profile ep=new Edit_profile();   //Edit Profile
			ep.frmEditProfile.setVisible(true);
		}

		if(bb==btnLogOut)
		{
			frmLoginWelcome.dispose();
			Login p=new Login();        //Logs us out ie. gets us back to Page1(Login page)
			p.frmLogin.setVisible(true);
		}
		
	}
	
	

}
