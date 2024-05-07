import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;

public class Products extends JFrame {

	private JPanel contentPane;
	private JTextField textProductID;
	private JTextField textProductName;
	private JTextField textQuantity;
	private JTextField textPrice;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products frame = new Products();
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
	public Products() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 60, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel lightdecorpanel = new JPanel();
		lightdecorpanel.setBounds(128, 27, 938, 423);
		lightdecorpanel.setBackground(new Color(158, 169, 240));
		contentPane.add(lightdecorpanel);
		lightdecorpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MANAGE PRODUCTS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(355, 11, 228, 40);
		lightdecorpanel.add(lblNewLabel);
		
		JLabel lblProductID = new JLabel("PRODUCT ID:");
		lblProductID.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductID.setBounds(10, 71, 113, 14);
		lightdecorpanel.add(lblProductID);
		
		textProductID = new JTextField();
		textProductID.setColumns(10);
		textProductID.setBounds(127, 65, 113, 26);
		lightdecorpanel.add(textProductID);
		
		JLabel lblProduct = new JLabel("PRODUCT:");
		lblProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProduct.setBounds(10, 108, 113, 14);
		lightdecorpanel.add(lblProduct);
		
		textProductName = new JTextField();
		textProductName.setColumns(10);
		textProductName.setBounds(127, 102, 113, 26);
		lightdecorpanel.add(textProductName);
		
		JLabel lblQuantity = new JLabel("QUANTITY:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantity.setBounds(316, 68, 113, 14);
		lightdecorpanel.add(lblQuantity);
		
		JLabel lblPrice = new JLabel("PRICE:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrice.setBounds(316, 108, 113, 14);
		lightdecorpanel.add(lblPrice);
		
		textQuantity = new JTextField();
		textQuantity.setColumns(10);
		textQuantity.setBounds(433, 62, 113, 26);
		lightdecorpanel.add(textQuantity);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(433, 102, 113, 26);
		lightdecorpanel.add(textPrice);
		
		JLabel lblCategory = new JLabel("CATEGORY:");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCategory.setBounds(621, 87, 113, 14);
		lightdecorpanel.add(lblCategory);
		
		JComboBox comboBoxCategory_1_1 = new JComboBox();
		comboBoxCategory_1_1.setModel(new DefaultComboBoxModel(new String[] {"Bakery", "Beverage", "Produce", "Meat ", "Seafood", "Snacks"}));
		comboBoxCategory_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxCategory_1_1.setBounds(738, 81, 113, 26);
		lightdecorpanel.add(comboBoxCategory_1_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdd.setBounds(225, 152, 89, 36);
		lightdecorpanel.add(btnAdd);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnUpdate.setBounds(325, 152, 105, 36);
		lightdecorpanel.add(btnUpdate);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRemove.setBounds(440, 152, 109, 36);
		lightdecorpanel.add(btnRemove);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnClear.setBounds(558, 152, 96, 36);
		lightdecorpanel.add(btnClear);
		
		table = new JTable();
		table.setBackground(new Color(176, 196, 222));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"PRODUCT ID", "PRODUCT", "QUANTITY", "PRICE", "CATEGORY"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"PRODUCT ID", "PRODUCT", "QUANTITY", "PRICE", "CATEGORY"
			}
		));
		table.setBounds(25, 248, 888, 164);
		lightdecorpanel.add(table);
		
		JLabel lblProductsList = new JLabel("PRODUCTS LIST");
		lblProductsList.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductsList.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblProductsList.setBounds(337, 220, 228, 27);
		lightdecorpanel.add(lblProductsList);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Products.this.dispose();
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
		lblX.setBounds(1057, 0, 23, 25);
		contentPane.add(lblX);
		setUndecorated(true);
	}
}
