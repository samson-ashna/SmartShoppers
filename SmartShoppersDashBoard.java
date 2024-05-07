

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class SmartShoppersDashBoard extends JFrame {
	
	private Image img_logo = new ImageIcon(UserLogin.class.getResource("resources/LogoMakr-2qKyhr.png")).getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtToDescribeUs;
/*	
	private PanelResManagement PanelResManagement;
	private PanelOnlineService PanelOnlineService;
	private PanelRecommendation PanelRecommendation;
	private PanelShoppingCart PanelShoppingCart;
	private PanelUserProfile PanelUserProfile;
	private PanelSignOut PanelSignOut;
*/
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartShoppersDashBoard frame = new SmartShoppersDashBoard();
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
	public SmartShoppersDashBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 60, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(158, 169, 240));
		panelMenu.setBounds(0, 0, 251, 400);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(10, 5, 231, 150);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		panelMenu.add(lblIconLogo);
		
		JPanel panelResManagement = new JPanel();
		panelResManagement.addMouseListener(new PanelButtonMouseAdapter(panelResManagement));
		panelResManagement.setBackground(new Color(204, 193, 255));
		panelResManagement.setBounds(0, 155, 251, 35);
		panelMenu.add(panelResManagement);
		panelResManagement.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item Management");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ItemManagement item = new ItemManagement();
				ItemManagement.main(null);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 10, 249, 19);
		panelResManagement.add(lblNewLabel);
		
		JPanel panelOnlineService = new JPanel();
		panelOnlineService.addMouseListener(new PanelButtonMouseAdapter(panelOnlineService));
		panelOnlineService.setBackground(new Color(204, 193, 255));
		panelOnlineService.setBounds(0, 190, 251, 35);
		panelMenu.add(panelOnlineService);
		panelOnlineService.setLayout(null);
		
		JLabel lblOnlineService = new JLabel("Store Management");
		lblOnlineService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StoreManagement storemanagement = new StoreManagement();
        		StoreManagement.main(null);
			}
		});
		lblOnlineService.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOnlineService.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlineService.setBounds(0, 10, 251, 19);
		panelOnlineService.add(lblOnlineService);
		
		JPanel panelRecommendation = new JPanel();
		panelRecommendation.addMouseListener(new PanelButtonMouseAdapter(panelRecommendation));
		panelRecommendation.setBackground(new Color(204, 193, 255));
		panelRecommendation.setBounds(0, 225, 251, 35);
		panelMenu.add(panelRecommendation);
		panelRecommendation.setLayout(null);
		
		JLabel lblRecommendation = new JLabel("Human Resources");
		lblRecommendation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HumanResources resourses = new HumanResources();
				HumanResources.main(null);
			}
		});
		lblRecommendation.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecommendation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRecommendation.setBounds(0, 10, 251, 19);
		panelRecommendation.add(lblRecommendation);
		
		JPanel panelShoppingCart = new JPanel();
		panelShoppingCart.addMouseListener(new PanelButtonMouseAdapter(panelShoppingCart));
		panelShoppingCart.setBackground(new Color(204, 193, 255));
		panelShoppingCart.setBounds(0, 260, 251, 35);
		panelMenu.add(panelShoppingCart);
		panelShoppingCart.setLayout(null);
		
		JLabel lblShoppingCart = new JLabel("Shopping List/Cart");
		lblShoppingCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ItemSearch_ShoppingCart shopping = new ItemSearch_ShoppingCart();
				ItemSearch_ShoppingCart.main(null);
			}
		});
		lblShoppingCart.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblShoppingCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoppingCart.setBounds(0, 10, 249, 19);
		panelShoppingCart.add(lblShoppingCart);
		
		JPanel panelUserProfile = new JPanel();
		panelUserProfile.addMouseListener(new PanelButtonMouseAdapter(panelUserProfile));
		panelUserProfile.setBackground(new Color(204, 193, 255));
		panelUserProfile.setBounds(0, 295, 251, 35);
		panelMenu.add(panelUserProfile);
		panelUserProfile.setLayout(null);
		
		JLabel lblUserProfile = new JLabel("User Profile");
		lblUserProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserProfile userprofile = new UserProfile();
        		UserProfile.main(null);
			}
		});
		lblUserProfile.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserProfile.setBounds(0, 10, 251, 19);
		panelUserProfile.add(lblUserProfile);
		
		JPanel panelSignOut = new JPanel();
		panelSignOut.addMouseListener(new PanelButtonMouseAdapter(panelSignOut));
		panelSignOut.setBackground(new Color(204, 193, 255));
		panelSignOut.setBounds(0, 330, 251, 35);
		panelMenu.add(panelSignOut);
		panelSignOut.setLayout(null);
		
		JLabel lblSignOut = new JLabel("Sign Out");
		lblSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignOut.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblSignOut.setBounds(0, 8, 251, 21);
		panelSignOut.add(lblSignOut);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblExit.setBounds(777, 0, 25, 25);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					SmartShoppersDashBoard.this.dispose();
				}
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			lblExit.setForeground(Color.RED);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			lblExit.setForeground(Color.WHITE);
		}
	});
	contentPane.add(lblExit);
	
	JPanel panelHome = new JPanel();
	panelHome.setBackground(new Color(255, 234, 254));
	panelHome.setBounds(260, 20, 530, 370);
	contentPane.add(panelHome);
	panelHome.setLayout(null);
	
	
	
	JLabel lblNewLabel_2 = new JLabel("\tWelcome to Smart Shoppers!");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
	lblNewLabel_2.setBounds(64, 24, 390, 21);
	panelHome.add(lblNewLabel_2);
	
	JTextArea txtrToDescribeUs = new JTextArea();
	txtrToDescribeUs.setBackground(new Color(255, 234, 254));
	txtrToDescribeUs.setFont(new Font("Monospaced", Font.PLAIN, 15));
	txtrToDescribeUs.setText("To describe us, we re-brand top-quality merchandise to provide our customers with unbeatable savings. We co-brand with customer favourites to offer big value savings on most loved products. We source new products from all over the world with new trends, products, flavours, and technologies. Everything we offer meet high standards of valuable taste, health, quality, and convenience.");
	txtrToDescribeUs.setBounds(64, 56, 400, 257);
	txtrToDescribeUs.setLineWrap(true);
	txtrToDescribeUs.setWrapStyleWord(true);
	panelHome.add(txtrToDescribeUs);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 124, 148));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(204, 193, 255));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(255, 234, 254));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(158, 169, 240));
			
		}
	}
}
