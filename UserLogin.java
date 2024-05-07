import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class UserLogin extends JFrame {
	
	private Image img_logo = new ImageIcon(UserLogin.class.getResource("resources/LogoMakr-2qKyhr.png")).getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
	private Image img_username = new ImageIcon(UserLogin.class.getResource("resources/admin-blue-icon.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
	private Image img_password = new ImageIcon(UserLogin.class.getResource("resources/padlock-key-icon.png")).getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);


	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField pwdPassword;
	private JTextField txtWelcomeToSmartshoppers;
	private JTextField txtLogin;
	private JTextField textField;
	private JLabel lblIconLogo;
	private JLabel lblAdmin;
	private JLabel lblPassword;
	private JTextField txtCreateAnAccount;
	private JLabel lblLoginMsg;
	private JPanel loginButton = new JPanel();
	private JButton btnNewButton;
	
	// link to logo maker: logomakr.com/app/2qKyhr
	// 29:32 in video
	// https://colorhunt.co/palette/553c8b9ea9f0ccc1ffffeafe

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 60, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		txtWelcomeToSmartshoppers = new JTextField();
		txtWelcomeToSmartshoppers.setBounds(30, 25, 247, 27);
		contentPane.add(txtWelcomeToSmartshoppers);
		txtWelcomeToSmartshoppers.setBackground(new Color(158, 169, 240));
		txtWelcomeToSmartshoppers.setFont(new Font("Belleza", Font.BOLD, 20));
		txtWelcomeToSmartshoppers.setText("Welcome to SmartShoppers!");
		txtWelcomeToSmartshoppers.setBorder(null);
		txtWelcomeToSmartshoppers.setColumns(10);
		
		JPanel Welcomepanel = new JPanel();
		Welcomepanel.setBackground(new Color(158, 169, 240));
		Welcomepanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Welcomepanel.setBounds(25, 23, 254, 33);
		contentPane.add(Welcomepanel);
		Welcomepanel.setLayout(null);
		
		JPanel usernamepanel = new JPanel();
		usernamepanel.setBackground(new Color(255, 234, 254));
		usernamepanel.setBounds(41, 105, 188, 33);
		contentPane.add(usernamepanel);
		usernamepanel.setLayout(null);
		
		usernameField = new JTextField();
		usernameField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(usernameField.getText().equals("Username")) {
					usernameField.setText("");
				}
				else {
					usernameField.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(usernameField.getText().equals("")) {
					usernameField.setText("Username");
				}
			}
		});
		usernameField.setBackground(new Color(255, 234, 254));
		usernameField.setSelectedTextColor(new Color(255, 248, 220));
		usernameField.setBorder(null);
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usernameField.setText("Username");
		usernameField.setBounds(53, 5, 136, 25);
		usernamepanel.add(usernameField);
		usernameField.setColumns(10);
		
		lblAdmin = new JLabel("");
		lblAdmin.setBounds(0, 0, 41, 33);
		usernamepanel.add(lblAdmin);
		lblAdmin.setHorizontalTextPosition(SwingConstants.LEADING);
		lblAdmin.setBackground(new Color(204, 193, 255));
		lblAdmin.setForeground(new Color(0, 0, 0));
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setIcon(new ImageIcon(img_username));
		loginButton.setName("");
		
		loginButton.setBackground(new Color(204, 193, 255));
		loginButton.setLayout(null);
		loginButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		loginButton.setBounds(83, 211, 144, 34);
		contentPane.add(loginButton);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(10, 2, 122, 28);
		loginButton.add(txtLogin);
		txtLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(usernameField.getText().equals("user") && pwdPassword.getText().equals("user123")) {
					lblLoginMsg.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful");
					//if user inputs are correct
					ItemSearch_ShoppingCart shopping = new ItemSearch_ShoppingCart();
					ItemSearch_ShoppingCart.main(null);
					
					SmartShoppersDashBoard dashboard = new SmartShoppersDashBoard();
					SmartShoppersDashBoard.main(null);
					
				}
				else if (usernameField.getText().equals("manager") && pwdPassword.getText().equals("manager123")) {
					lblLoginMsg.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful");
					//if user inputs are correct
					ItemManagement item = new ItemManagement();
					ItemManagement.main(null);
				}
				else if ( usernameField.getText().equals("admin") && pwdPassword.getText().equals("admin123")) {
					lblLoginMsg.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful");
					//if user inputs are correct
					HumanResources resourses = new HumanResources();
					HumanResources.main(null);
				}
				else if(usernameField.getText().equals("") || usernameField.getText().equals("Username") ||
						pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
					lblLoginMsg.setText("Please input all requirements.");
				}
				else {
					lblLoginMsg.setText("Username and password did not match. Please try again.");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				loginButton.setBackground(new Color(30, 60, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				loginButton.setBackground(new Color(47, 79, 79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				loginButton.setBackground(new Color(60, 80, 80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				loginButton.setBackground(new Color(30, 60, 60));
			}
			
		});
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setForeground(new Color(255, 255, 255));
		txtLogin.setText("LOGIN");
		txtLogin.setFont(new Font("Arial Black", Font.PLAIN, 22));
		txtLogin.setColumns(10);
		txtLogin.setBorder(null);
		txtLogin.setBackground(new Color(204, 193, 255));
		
		JPanel passwordpanel = new JPanel();
		passwordpanel.setBackground(new Color(255, 234, 254));
		passwordpanel.setBounds(41, 143, 188, 33);
		contentPane.add(passwordpanel);
		passwordpanel.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
				pwdPassword.setEchoChar('●');
				pwdPassword.setText("");
			}
				else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
					pwdPassword.setEchoChar((char)0);
				}
			}
		});
		pwdPassword.setBackground(new Color(255, 234, 254));
		pwdPassword.setBorder(null);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pwdPassword.setText("Password");
		pwdPassword.setBounds(53, 5, 120, 25);
		passwordpanel.add(pwdPassword);
		
		lblPassword = new JLabel("");
		lblPassword.setBounds(0, 0, 41, 33);
		passwordpanel.add(lblPassword);
		lblPassword.setHorizontalTextPosition(SwingConstants.LEADING);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setIcon(new ImageIcon(img_password));
		
		textField = new JTextField();
		textField.setDisabledTextColor(new Color(85, 60, 139));
		textField.setBounds(55, 67, 81, 27);
		contentPane.add(textField);
		textField.setText("LOGIN");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(85, 60, 139));
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					UserLogin.this.dispose();
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
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setBounds(277, 0, 23, 25);
		contentPane.add(lblX);
		
		lblIconLogo = new JLabel("");
		lblIconLogo.setForeground(new Color(255, 255, 255));
		lblIconLogo.setBounds(76, 285, 162, 104);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		
		txtCreateAnAccount = new JTextField();
		txtCreateAnAccount.setForeground(Color.WHITE);
		txtCreateAnAccount.setBackground(new Color(85, 60, 139));
		txtCreateAnAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCreateAnAccount.setBorder(null);
		txtCreateAnAccount.setText("Don't have an account?");
		txtCreateAnAccount.setBounds(42, 256, 169, 33);
		contentPane.add(txtCreateAnAccount);
		txtCreateAnAccount.setColumns(10);
		
		lblLoginMsg = new JLabel("");
		lblLoginMsg.setBounds(10, 185, 280, 25);
		contentPane.add(lblLoginMsg);
		lblLoginMsg.setForeground(new Color(220, 20, 60));
		lblLoginMsg.setFont(new Font("Arial", Font.BOLD, 10));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"User", "Manager", "Admin"}));
		comboBox.setBounds(161, 72, 116, 22);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("Create");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CreateAnAccount newaccount = new CreateAnAccount();
				CreateAnAccount.main(null);
			}
		});
		btnNewButton.setBounds(212, 260, 78, 23);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	} }

