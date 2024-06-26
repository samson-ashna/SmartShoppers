import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class UserProfile extends JFrame {
	
	private Image img_avatar = new ImageIcon(UserLogin.class.getResource("resources/avatar.PNG")).getImage().getScaledInstance(140, 120, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtUserProfile;
	private JTextField txtFirstName;
	private JPasswordField pwdChangePassword;
	private JPasswordField passwordField_1;
	private JTextField txtFirstName_1;
	private JTextField txtLastName;
	private JTextField txtChangeUsername_1;
	private JTextField txtChangePassword;
	private JTextField txtRetypePassword;
	private JPanel usernamepanel_1;
	private JTextField textField;
	private JTextField txtFirstName_2;
	private JTextField txtSavedStoreLocation;
	private JTextField txtModifyStoreLocation;
	private JPanel deleteButton;
	private JTextField txtDeleteAccount;
	private JPanel savedstorepanel;
	private JTextField txtStoreLocation;
	private JPanel modifystorepanel;
	private JTextField txtModifyStoreLocation_1;
	private JTextField txtSecurityQuestion;
	private JTextField txtAnswer;
	private JPanel usernamepanel_3;
	private JTextField txtAnswer_1;
	private JTextField txtSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfile frame = new UserProfile();
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
	public UserProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setUndecorated(true);
		
		JPanel userProfilepane = new JPanel();
		userProfilepane.setLayout(null);
		userProfilepane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		userProfilepane.setBackground(new Color(85, 60, 139));
		contentPane.add(userProfilepane, BorderLayout.CENTER);
		
		JPanel Welcomepanel = new JPanel();
		Welcomepanel.setLayout(null);
		Welcomepanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Welcomepanel.setBackground(new Color(158, 169, 240));
		Welcomepanel.setBounds(210, 24, 149, 33);
		userProfilepane.add(Welcomepanel);
		
		txtUserProfile = new JTextField();
		txtUserProfile.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserProfile.setBounds(10, 4, 124, 27);
		Welcomepanel.add(txtUserProfile);
		txtUserProfile.setText("User Profile");
		txtUserProfile.setFont(new Font("Belleza", Font.BOLD, 20));
		txtUserProfile.setColumns(10);
		txtUserProfile.setBorder(null);
		txtUserProfile.setBackground(new Color(158, 169, 240));
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					UserProfile.this.dispose();
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
		lblX.setBounds(567, 0, 23, 25);
		userProfilepane.add(lblX);
		
		JPanel usernamepanel = new JPanel();
		usernamepanel.setLayout(null);
		usernamepanel.setBackground(new Color(255, 234, 254));
		usernamepanel.setBounds(220, 74, 185, 25);
		userProfilepane.add(usernamepanel);
		
		txtFirstName_2 = new JTextField();
		txtFirstName_2.setText("First Name");
		txtFirstName_2.setSelectedTextColor(new Color(255, 248, 220));
		txtFirstName_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFirstName_2.setColumns(10);
		txtFirstName_2.setBorder(null);
		txtFirstName_2.setBackground(new Color(255, 234, 254));
		txtFirstName_2.setBounds(10, 0, 173, 28);
		usernamepanel.add(txtFirstName_2);
		
		JPanel lastNamepanel = new JPanel();
		lastNamepanel.setLayout(null);
		lastNamepanel.setBackground(new Color(255, 234, 254));
		lastNamepanel.setBounds(220, 122, 185, 25);
		userProfilepane.add(lastNamepanel);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("Last Name");
		txtFirstName.setSelectedTextColor(new Color(255, 248, 220));
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(null);
		txtFirstName.setBackground(new Color(255, 234, 254));
		txtFirstName.setBounds(10, 0, 173, 28);
		lastNamepanel.add(txtFirstName);
		
		JPanel changepasswordpanel = new JPanel();
		changepasswordpanel.setLayout(null);
		changepasswordpanel.setBackground(new Color(255, 234, 254));
		changepasswordpanel.setBounds(220, 215, 185, 25);
		userProfilepane.add(changepasswordpanel);
		
		pwdChangePassword = new JPasswordField();
		pwdChangePassword.setText("Change Password");
		pwdChangePassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pwdChangePassword.setEchoChar(' ');
		pwdChangePassword.setBorder(null);
		pwdChangePassword.setBackground(new Color(255, 234, 254));
		pwdChangePassword.setBounds(10, 0, 173, 28);
		changepasswordpanel.add(pwdChangePassword);
		
		JPanel retypepasswordpanel = new JPanel();
		retypepasswordpanel.setLayout(null);
		retypepasswordpanel.setBackground(new Color(255, 234, 254));
		retypepasswordpanel.setBounds(220, 260, 185, 25);
		userProfilepane.add(retypepasswordpanel);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setText("Retype Password");
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField_1.setEchoChar(' ');
		passwordField_1.setBorder(null);
		passwordField_1.setBackground(new Color(255, 234, 254));
		passwordField_1.setBounds(10, 0, 173, 28);
		retypepasswordpanel.add(passwordField_1);
		
		txtFirstName_1 = new JTextField();
		txtFirstName_1.setForeground(Color.WHITE);
		txtFirstName_1.setText("First Name:");
		txtFirstName_1.setSelectedTextColor(new Color(255, 248, 220));
		txtFirstName_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFirstName_1.setColumns(10);
		txtFirstName_1.setBorder(null);
		txtFirstName_1.setBackground(new Color(85, 60, 139));
		txtFirstName_1.setBounds(10, 71, 98, 28);
		userProfilepane.add(txtFirstName_1);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name:");
		txtLastName.setSelectedTextColor(new Color(255, 248, 220));
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtLastName.setColumns(10);
		txtLastName.setBorder(null);
		txtLastName.setBackground(new Color(85, 60, 139));
		txtLastName.setBounds(10, 119, 98, 28);
		userProfilepane.add(txtLastName);
		
		txtChangeUsername_1 = new JTextField();
		txtChangeUsername_1.setText("Change Username:");
		txtChangeUsername_1.setSelectedTextColor(new Color(255, 248, 220));
		txtChangeUsername_1.setForeground(Color.WHITE);
		txtChangeUsername_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtChangeUsername_1.setColumns(10);
		txtChangeUsername_1.setBorder(null);
		txtChangeUsername_1.setBackground(new Color(85, 60, 139));
		txtChangeUsername_1.setBounds(10, 167, 174, 28);
		userProfilepane.add(txtChangeUsername_1);
		
		txtChangePassword = new JTextField();
		txtChangePassword.setText("Change Password:");
		txtChangePassword.setSelectedTextColor(new Color(255, 248, 220));
		txtChangePassword.setForeground(Color.WHITE);
		txtChangePassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtChangePassword.setColumns(10);
		txtChangePassword.setBorder(null);
		txtChangePassword.setBackground(new Color(85, 60, 139));
		txtChangePassword.setBounds(10, 215, 174, 28);
		userProfilepane.add(txtChangePassword);
		
		txtRetypePassword = new JTextField();
		txtRetypePassword.setText("Retype Password:");
		txtRetypePassword.setSelectedTextColor(new Color(255, 248, 220));
		txtRetypePassword.setForeground(Color.WHITE);
		txtRetypePassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtRetypePassword.setColumns(10);
		txtRetypePassword.setBorder(null);
		txtRetypePassword.setBackground(new Color(85, 60, 139));
		txtRetypePassword.setBounds(10, 260, 174, 28);
		userProfilepane.add(txtRetypePassword);
		
		usernamepanel_1 = new JPanel();
		usernamepanel_1.setLayout(null);
		usernamepanel_1.setBackground(new Color(255, 234, 254));
		usernamepanel_1.setBounds(220, 170, 185, 25);
		userProfilepane.add(usernamepanel_1);
		
		textField = new JTextField();
		textField.setText("Change Username");
		textField.setSelectedTextColor(new Color(255, 248, 220));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(255, 234, 254));
		textField.setBounds(10, 0, 173, 28);
		usernamepanel_1.add(textField);
		
		txtSavedStoreLocation = new JTextField();
		txtSavedStoreLocation.setText("Saved Store Location:");
		txtSavedStoreLocation.setSelectedTextColor(new Color(255, 248, 220));
		txtSavedStoreLocation.setForeground(Color.WHITE);
		txtSavedStoreLocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSavedStoreLocation.setColumns(10);
		txtSavedStoreLocation.setBorder(null);
		txtSavedStoreLocation.setBackground(new Color(85, 60, 139));
		txtSavedStoreLocation.setBounds(10, 398, 174, 28);
		userProfilepane.add(txtSavedStoreLocation);
		
		txtModifyStoreLocation = new JTextField();
		txtModifyStoreLocation.setText("Modify Store Location:");
		txtModifyStoreLocation.setSelectedTextColor(new Color(255, 248, 220));
		txtModifyStoreLocation.setForeground(Color.WHITE);
		txtModifyStoreLocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtModifyStoreLocation.setColumns(10);
		txtModifyStoreLocation.setBorder(null);
		txtModifyStoreLocation.setBackground(new Color(85, 60, 139));
		txtModifyStoreLocation.setBounds(10, 445, 192, 28);
		userProfilepane.add(txtModifyStoreLocation);
		
		deleteButton = new JPanel();
		deleteButton.setLayout(null);
		deleteButton.setName("");
		deleteButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		deleteButton.setBackground(new Color(204, 193, 255));
		deleteButton.setBounds(81, 495, 221, 34);
		userProfilepane.add(deleteButton);
		
		txtDeleteAccount = new JTextField();
		txtDeleteAccount.setText("Delete Account");
		txtDeleteAccount.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeleteAccount.setForeground(Color.WHITE);
		txtDeleteAccount.setFont(new Font("Arial Black", Font.PLAIN, 22));
		txtDeleteAccount.setColumns(10);
		txtDeleteAccount.setBorder(null);
		txtDeleteAccount.setBackground(new Color(204, 193, 255));
		txtDeleteAccount.setBounds(10, 2, 195, 28);
		deleteButton.add(txtDeleteAccount);
		
		JLabel lblViewShoppingList = new JLabel("View Shopping List");
		lblViewShoppingList.setHorizontalAlignment(SwingConstants.CENTER);
        lblViewShoppingList.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ItemSearch_ShoppingCart shopping = new ItemSearch_ShoppingCart();
				ItemSearch_ShoppingCart.main(null);
        	}
        });
        lblViewShoppingList.setForeground(new Color(204, 193, 255));
        lblViewShoppingList.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        lblViewShoppingList.setBounds(25, 34, 159, 24);
        userProfilepane.add(lblViewShoppingList);

		txtDeleteAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Your account has been successfully deleted.");
				}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				deleteButton.setBackground(new Color(30, 60, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				deleteButton.setBackground(new Color(47, 79, 79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				deleteButton.setBackground(new Color(60, 80, 80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				deleteButton.setBackground(new Color(30, 60, 60));
			}
			
		});
		
		savedstorepanel = new JPanel();
		savedstorepanel.setLayout(null);
		savedstorepanel.setBackground(new Color(255, 234, 254));
		savedstorepanel.setBounds(220, 401, 185, 25);
		userProfilepane.add(savedstorepanel);
		
		txtStoreLocation = new JTextField();
		txtStoreLocation.setText("Store Location");
		txtStoreLocation.setSelectedTextColor(new Color(255, 248, 220));
		txtStoreLocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtStoreLocation.setColumns(10);
		txtStoreLocation.setBorder(null);
		txtStoreLocation.setBackground(new Color(255, 234, 254));
		txtStoreLocation.setBounds(10, 0, 173, 28);
		savedstorepanel.add(txtStoreLocation);
		
		modifystorepanel = new JPanel();
		modifystorepanel.setLayout(null);
		modifystorepanel.setBackground(new Color(255, 234, 254));
		modifystorepanel.setBounds(220, 448, 185, 25);
		userProfilepane.add(modifystorepanel);
		
		txtModifyStoreLocation_1 = new JTextField();
		txtModifyStoreLocation_1.setText("Modify Store Location");
		txtModifyStoreLocation_1.setSelectedTextColor(new Color(255, 248, 220));
		txtModifyStoreLocation_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtModifyStoreLocation_1.setColumns(10);
		txtModifyStoreLocation_1.setBorder(null);
		txtModifyStoreLocation_1.setBackground(new Color(255, 234, 254));
		txtModifyStoreLocation_1.setBounds(10, 0, 173, 28);
		modifystorepanel.add(txtModifyStoreLocation_1);
		
		txtSecurityQuestion = new JTextField();
		txtSecurityQuestion.setText("Security Question:");
		txtSecurityQuestion.setSelectedTextColor(new Color(255, 248, 220));
		txtSecurityQuestion.setForeground(Color.WHITE);
		txtSecurityQuestion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSecurityQuestion.setColumns(10);
		txtSecurityQuestion.setBorder(null);
		txtSecurityQuestion.setBackground(new Color(85, 60, 139));
		txtSecurityQuestion.setBounds(10, 306, 174, 28);
		userProfilepane.add(txtSecurityQuestion);
		
		txtAnswer = new JTextField();
		txtAnswer.setText("Answer:");
		txtAnswer.setSelectedTextColor(new Color(255, 248, 220));
		txtAnswer.setForeground(Color.WHITE);
		txtAnswer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAnswer.setColumns(10);
		txtAnswer.setBorder(null);
		txtAnswer.setBackground(new Color(85, 60, 139));
		txtAnswer.setBounds(10, 355, 174, 28);
		userProfilepane.add(txtAnswer);
		
		usernamepanel_3 = new JPanel();
		usernamepanel_3.setLayout(null);
		usernamepanel_3.setBackground(new Color(255, 234, 254));
		usernamepanel_3.setBounds(220, 355, 185, 25);
		userProfilepane.add(usernamepanel_3);
		
		txtAnswer_1 = new JTextField();
		txtAnswer_1.setText("Answer");
		txtAnswer_1.setSelectedTextColor(new Color(255, 248, 220));
		txtAnswer_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAnswer_1.setColumns(10);
		txtAnswer_1.setBorder(null);
		txtAnswer_1.setBackground(new Color(255, 234, 254));
		txtAnswer_1.setBounds(10, 0, 173, 28);
		usernamepanel_3.add(txtAnswer_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"In what city were you born?", "What is the name of your favorite pet?", "What is your mother's maiden name?", "What high school did you attend?", "What is the name of your first school?", "What was the make of your first car?", "What was your favorite food as a child?"}));
		comboBox.setBounds(220, 305, 319, 28);
		comboBox.setBackground(new Color(255, 248, 220));
		userProfilepane.add(comboBox);
		
		JPanel saveButton = new JPanel();
		saveButton.setLayout(null);
		saveButton.setName("");
		saveButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		saveButton.setBackground(new Color(204, 193, 255));
		saveButton.setBounds(387, 495, 121, 34);
		userProfilepane.add(saveButton);
		
		txtSave = new JTextField();
		txtSave.setText("Save");
		txtSave.setHorizontalAlignment(SwingConstants.CENTER);
		txtSave.setForeground(Color.WHITE);
		txtSave.setFont(new Font("Arial Black", Font.PLAIN, 22));
		txtSave.setColumns(10);
		txtSave.setBorder(null);
		txtSave.setBackground(new Color(204, 193, 255));
		txtSave.setBounds(10, 2, 109, 28);
		saveButton.add(txtSave);
		
		JLabel lblAvatar = new JLabel("");
		lblAvatar.setForeground(new Color(255, 255, 255));
		lblAvatar.setBounds(431, 74, 149, 127);
		userProfilepane.add(lblAvatar);
		lblAvatar.setIcon(new ImageIcon(img_avatar));
		
		txtSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Your account has been successfully saved!");
				}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				saveButton.setBackground(new Color(30, 60, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				saveButton.setBackground(new Color(47, 79, 79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				saveButton.setBackground(new Color(60, 80, 80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				saveButton.setBackground(new Color(30, 60, 60));
			}
			
		});
	}
}
