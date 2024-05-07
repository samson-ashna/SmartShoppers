import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ItemSearch_ShoppingCart extends JFrame
{
	static String[] itemchoices =
	{
		"Candy                  2.20",
		"Pringles Can           3.40",
		"Camera                 250.00",
		"Television             355.67",
		"Broccoli               2.30",
		"Sirloin Steak          22.54",
		"Butter                 4.85",
		"Eggs                   3.23",
		"Macaroni               1.46",
		"Corn flakes-Cereal     5.28",
		"Lilacs-Flower Boquet   17.29",
		"Apples                 4.03",
		"Bananas                1.58",
		"Orange Juice           4.02",
		"Baked beans, canned    1.32",
		"Coffee, instant        7.71",
		"Peanut butter          3.31",
		"Shampoo                4.18",
		"Deodorant              4.63",
		"Toothpaste             2.79"
		    			   
	};

	static double[] itemprices = {2.20,3.40,250.00,355.67,2.30,22.54,4.85,3.23,1.46,5.28,
			17.29,4.03,1.58,4.02,1.32,7.71,3.31,4.18,4.63,2.79};

	private JList txtShoppingList;
	private checkOutButtonHandler cHandler;
	private clearButtonHandler crHandler;
	private selectionButtonHandler sHandler;
	private removeButtonHandler rmHandler;
	private JButton checkB,clearB,btnSelect,removeB;
	private JCheckBox check;
	private JTextArea list,bill;
	private Container pane;
	private JTextField txtSearch;
	private JLabel lblNewLabel;
	private JTable table_1;
	private JLabel lblViewStoreManagement;

	public ItemSearch_ShoppingCart()
	{
		super("Happy Shopping!");

		pane = getContentPane();
		pane.setBackground(new Color(158, 169, 240));
		getContentPane().setLayout(null);

		JLabel yourChoicesJLabel = new JLabel("The Shopping List                                                             Shopping Cart  ");
		yourChoicesJLabel.setForeground(new Color(85, 60, 139));
		yourChoicesJLabel.setBounds(0, 0, 786, 26);
		pane.add(yourChoicesJLabel);
		yourChoicesJLabel.setFont(new Font("Dialog",Font.BOLD,20));

		JPanel paneshoppinglist = new JPanel();
		paneshoppinglist.setBackground(new Color(204, 193, 255));
		paneshoppinglist.setBounds(0, 31, 478, 669);
		paneshoppinglist.setLayout(null);
		
		JLabel lblStoreLocation = new JLabel("Preferred Store Location:");
		lblStoreLocation.setForeground(new Color(85, 60, 139));
		lblStoreLocation.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStoreLocation.setBounds(10, 534, 172, 14);
		paneshoppinglist.add(lblStoreLocation);
		
		lblNewLabel = new JLabel("Search:");
		lblNewLabel.setBounds(10, 22, 54, 14);
		paneshoppinglist.add(lblNewLabel);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(74, 19, 118, 20);
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel table = (DefaultTableModel)txtShoppingList.getModel();
				String search = txtSearch.getText().toLowerCase();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
				//((Object) txtShoppingList).setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		
		table_1 = new JTable();
		table_1.setBounds(50, 104, 0, 0);
		paneshoppinglist.add(table_1);
		paneshoppinglist.add(txtSearch);
		txtSearch.setColumns(10);
		txtShoppingList = new JList(itemchoices);
		txtShoppingList.setBackground(new Color(158, 169, 240));
		txtShoppingList.setBounds(20, 47, 261, 447);
		paneshoppinglist.add(txtShoppingList);
		txtShoppingList.setFont(new Font("Courier",Font.BOLD,14));
		pane.add(paneshoppinglist);

		btnSelect=new JButton("Select");
		btnSelect.setBounds(291, 266, 77, 23);
		sHandler=new selectionButtonHandler();
		btnSelect.addActionListener(sHandler);
		paneshoppinglist.add(btnSelect);
		
		JComboBox boxLocation = new JComboBox();
		boxLocation.setModel(new DefaultComboBoxModel(new String[] {"Alberta - AB", "British Columbia - BC", "Manitoba - MB", "New Brunswick - NB", "Newfoundland and Labrador - NL", "Northwest Territories - NT", "Nova Scotia - NS", "Nunavut - NU", "Ontario - ON", "Prince Edward Island - PE", "Quebec - QC", "Saskatchewan - SK", "Yukon - YT"}));
		boxLocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boxLocation.setBounds(200, 531, 159, 26);
		paneshoppinglist.add(boxLocation);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(370, 531, 98, 23);
		paneshoppinglist.add(btnSave);
		
		JLabel lblCustomersInCurrent = new JLabel("Customers in Current Store:");
		lblCustomersInCurrent.setForeground(new Color(85, 60, 139));
		lblCustomersInCurrent.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCustomersInCurrent.setBounds(10, 583, 187, 14);
		paneshoppinglist.add(lblCustomersInCurrent);
		
		JComboBox boxLocation_1 = new JComboBox();
		boxLocation_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1-10", "11-30", "31-60", "61-100", "100+"}));
		boxLocation_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boxLocation_1.setBounds(200, 576, 159, 26);
		paneshoppinglist.add(boxLocation_1);
		
		JLabel lblViewUserProfile = new JLabel("View User Profile");
		lblViewUserProfile.setHorizontalAlignment(SwingConstants.CENTER);
        lblViewUserProfile.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		UserProfile userprofile = new UserProfile();
        		UserProfile.main(null);
        	}
        });
        lblViewUserProfile.setForeground(new Color(85, 60, 139));
        lblViewUserProfile.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        lblViewUserProfile.setBounds(291, 15, 159, 24);
        paneshoppinglist.add(lblViewUserProfile);

		JPanel panebill=new JPanel();
		panebill.setBounds(483, 31, 303, 669);
		panebill.setLayout(null);
		list = new JTextArea(20,50);
		list.setBackground(new Color(204, 193, 255));
		list.setBounds(0, 0, 300, 404);
		panebill.add(list);
		list.setFont(new Font("Courier",Font.PLAIN,14));

		checkB=new JButton("Check out");
		checkB.setBounds(190, 414, 100, 23);
		cHandler=new checkOutButtonHandler();
		checkB.addActionListener(cHandler);

		clearB=new JButton("Clear");
		clearB.setBounds(114, 414, 70, 23);
		crHandler=new clearButtonHandler();
		clearB.addActionListener(crHandler);

		removeB=new JButton("Remove");
		removeB.setBounds(10, 414, 98, 23);
		rmHandler=new removeButtonHandler();
		removeB.addActionListener(rmHandler);

		panebill.add(removeB);
		panebill.add(clearB);
		panebill.add(checkB);

		bill = new JTextArea(20,60);
		bill.setBackground(new Color(204, 193, 255));
		bill.setBounds(0, 442, 300, 225);
		panebill.add(bill);
		bill.setFont(new Font("Courier",Font.PLAIN,12));
		pane.add(panebill);

		setSize(800, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void displayList()
	{
		list.setEditable(false);
		list.setText("");
		int[] listArray = txtShoppingList.getSelectedIndices();

		for (int index = 0; index < listArray.length; index++)
		{
			list.append(itemchoices[listArray[index]] + "\n");
		}

		list.append("\n");
	}

	private void displayBill()
	{
		int[] listArray = txtShoppingList.getSelectedIndices();

		double subTotal = 0;
		double total;

		bill.setEditable(false);
		bill.setText("");

		for (int index = 0; index < listArray.length; index++)
			subTotal += itemprices[listArray[index]];
		total = subTotal;

		bill.append("TOTAL    \t\t"
				+ String.format("$%.2f", total) + " CAD" + "\n\n");
		bill.append("Thank you! - Have a Wonderful Day!\n\n");

		//Reset list array
		txtShoppingList.clearSelection();

		repaint();
	}


	private class checkOutButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("Check out"))
				displayBill();
		}  
	}

	private class clearButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}  
	}

	private class selectionButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("Select"))
				displayList();
		}  
	}

	private class removeButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}  
	}

	public static void main(String[] args)
	{
		ItemSearch_ShoppingCart item = new ItemSearch_ShoppingCart();
		item.setVisible(true);
	}
}