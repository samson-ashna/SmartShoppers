import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class CreateAnAccount extends JFrame {
	
	private Image img_logo = new ImageIcon(UserLogin.class.getResource("resources/LogoMakr-2qKyhr.png")).getImage().getScaledInstance(180, 130, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textemail;
	private JPasswordField passwordField_1;
	private JPasswordField pwdRetypePassword;
	private JTextField txtSignUp;
	private JTextField txtBackToLogin;
	private JLabel lblIconLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAnAccount frame = new CreateAnAccount();
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
	public CreateAnAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 60, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBackToLogin = new JTextField();
		txtBackToLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserLogin login = new UserLogin();
				UserLogin.main(null);
			}
		});
		txtBackToLogin.setText("Back to Login");
		txtBackToLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtBackToLogin.setForeground(Color.WHITE);
		txtBackToLogin.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtBackToLogin.setColumns(10);
		txtBackToLogin.setBorder(null);
		txtBackToLogin.setBackground(new Color(204, 193, 255));
		txtBackToLogin.setBounds(268, 319, 110, 24);
		contentPane.add(txtBackToLogin);
		
		lblIconLogo = new JLabel("");
		lblIconLogo.setForeground(new Color(255, 255, 255));
		lblIconLogo.setBounds(10, 100, 183, 160);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					CreateAnAccount.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
		});	
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblX.setBounds(377, 0, 23, 25);
		contentPane.add(lblX);
		
		JPanel usernamepanel = new JPanel();
		usernamepanel.setBounds(193, 67, 185, 25);
		contentPane.add(usernamepanel);
		usernamepanel.setBackground(new Color(255, 234, 254));
		usernamepanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 0, 173, 28);
		usernamepanel.add(textField);
		textField.setText("Username");
		textField.setSelectedTextColor(new Color(255, 248, 220));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(255, 234, 254));
		
		JPanel panelUsername = new JPanel();
		panelUsername.setBounds(0, 0, 185, 24);
		usernamepanel.add(panelUsername);
		panelUsername.setLayout(null);
		
		JPanel emailpanel = new JPanel();
		emailpanel.setBounds(193, 135, 185, 25);
		contentPane.add(emailpanel);
		emailpanel.setLayout(null);
		emailpanel.setBackground(new Color(255, 234, 254));
		
		textemail = new JTextField();
		textemail.setText("Email");
		textemail.setSelectedTextColor(new Color(255, 248, 220));
		textemail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textemail.setColumns(10);
		textemail.setBorder(null);
		textemail.setBackground(new Color(255, 234, 254));
		textemail.setBounds(10, 0, 173, 28);
		emailpanel.add(textemail);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setBounds(-2, 0, 185, 24);
		emailpanel.add(panelEmail);
		panelEmail.setLayout(null);
		
		JPanel passwordpanel = new JPanel();
		passwordpanel.setBounds(193, 201, 185, 25);
		contentPane.add(passwordpanel);
		passwordpanel.setLayout(null);
		passwordpanel.setBackground(new Color(255, 234, 254));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setText("Password");
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField_1.setEchoChar('
