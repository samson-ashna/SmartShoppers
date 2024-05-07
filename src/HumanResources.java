import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.JTextField;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.JLabel;
	import javax.swing.JComboBox;
	import javax.swing.DefaultComboBoxModel;

	public class HumanResources {

	    public static void main(String[] args){
	        
	        // create JFrame and JTable and set table model & rows/columns
	        JFrame frame = new JFrame();
	        frame.getContentPane().setBackground(new Color(85, 60, 139));
	        JTable table = new JTable(); 
	        
	        
	        Object[] columns = {"MANAGER ID", "MANAGER NAME", "USERNAME", "TEMP. PASSWORD", "LOCATION"};
	        Object[] row1 = {"132546", "Ted Russo","ted123","ru55o$546","Ontario - ON"};
	        Object[] row2 = {"329837","Jake Khan","jake123","khaN$837","Manitoba - MB"};
	        Object[] row3 = {"552853", "Paris Alexis","paris123","al3xi5$853","Nova Scotia - NS"};
	        Object[] row4 = {"687495", "Lin Layla","lin123","lAy1a$495","British Columbia - BC"};
	        Object[] row5 = {"724912", "Abel Mosby","abel123","m05by$912","Saskatchewan - SK"};
	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columns);
	        model.addRow(row1);
	        model.addRow(row2);
	        model.addRow(row3);
	        model.addRow(row4);
	        model.addRow(row5);
	        table.setModel(model);
	        
	       
	        table.setBackground(Color.LIGHT_GRAY);
	        table.setForeground(Color.black);
	        Font font = new Font("", 1, 17);
	        table.setFont(font);
	        table.setRowHeight(20);
	        
	        // create JTextFields and JButtons
	        JTextField textManagerID = new JTextField();
	        JTextField textManagerName = new JTextField();
	        JTextField textUsername = new JTextField();
	        JTextField texttempPass = new JTextField();
	        texttempPass.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        
	        JButton btnAdd = new JButton("Add");
	        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        JButton btnDelete = new JButton("Delete");
	        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        JButton btnUpdate = new JButton("Update");     
	        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        
	        textManagerID.setBounds(151, 261, 100, 25);
	        textManagerName.setBounds(151, 291, 100, 25);
	        textUsername.setBounds(432, 261, 100, 25);
	        texttempPass.setBounds(432, 291, 100, 25);
	        
	        btnAdd.setBounds(765, 221, 100, 25);
	        btnUpdate.setBounds(765, 266, 100, 25);
	        btnDelete.setBounds(765, 311, 100, 25);
	        
	        // create JScrollPane
	        JScrollPane pane = new JScrollPane(table);
	        pane.setBackground(new Color(158, 169, 240));
	        pane.setBounds(0, 0, 880, 200);
	        
	        frame.getContentPane().setLayout(null);
	        
	        frame.getContentPane().add(pane);
	        
	        // add JTextFields and JButtons to the jframe
	        frame.getContentPane().add(textManagerID);
	        frame.getContentPane().add(textManagerName);
	        frame.getContentPane().add(textUsername);
	        frame.getContentPane().add(texttempPass);
	    
	        frame.getContentPane().add(btnAdd);
	        frame.getContentPane().add(btnDelete);
	        frame.getContentPane().add(btnUpdate);
	        
	        JLabel lblNewLabel = new JLabel("HUMAN RESOURCES");
	        lblNewLabel.setForeground(new Color(158, 169, 240));
	        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
	        lblNewLabel.setBounds(35, 210, 240, 40);
	        frame.getContentPane().add(lblNewLabel);
	        
	        JLabel lblProductID = new JLabel("MANAGER ID:");
	        lblProductID.setForeground(new Color(204, 193, 255));
	        lblProductID.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblProductID.setBounds(10, 265, 113, 14);
	        frame.getContentPane().add(lblProductID);
	        
	        JLabel lblProduct = new JLabel("MANAGER NAME:");
	        lblProduct.setForeground(new Color(204, 193, 255));
	        lblProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblProduct.setBounds(5, 302, 140, 14);
	        frame.getContentPane().add(lblProduct);
	        
	        JLabel lblQuantity = new JLabel("USERNAME:");
	        lblQuantity.setForeground(new Color(204, 193, 255));
	        lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblQuantity.setBounds(261, 261, 161, 25);
	        frame.getContentPane().add(lblQuantity);
	        
	        JLabel lblPrice = new JLabel("TEMP PASSWORD:");
	        lblPrice.setForeground(new Color(204, 193, 255));
	        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblPrice.setBounds(261, 302, 161, 14);
	        frame.getContentPane().add(lblPrice);
	        
	        JLabel lblLocation = new JLabel("MAP:");
	        lblLocation.setForeground(new Color(204, 193, 255));
	        lblLocation.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblLocation.setBounds(542, 282, 130, 14);
	        frame.getContentPane().add(lblLocation);
	        
	        JComboBox boxLocation = new JComboBox();
	        boxLocation.setModel(new DefaultComboBoxModel(new String[] {"Alberta - AB", "British Columbia - BC", "Manitoba - MB", 
	        		"New Brunswick - NB", "Newfoundland and Labrador - NL", "Northwest Territories - NT", 
	        		"Nova Scotia - NS", "Nunavut - NU", "Ontario - ON", "Prince Edward Island - PE", "Quebec - QC", 
	        		"Saskatchewan - SK", "Yukon - YT"}));
	        boxLocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        boxLocation.setBounds(596, 276, 159, 26);
	        frame.getContentPane().add(boxLocation);
	        
	        JLabel lblViewStoreManagement = new JLabel("View Store Management");
	        lblViewStoreManagement.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		StoreManagement storemanagement = new StoreManagement();
	        		StoreManagement.main(null);
	        	}
	        });
	        lblViewStoreManagement.setForeground(new Color(255, 234, 254));
	        lblViewStoreManagement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
	        lblViewStoreManagement.setBounds(499, 221, 198, 24);
	        frame.getContentPane().add(lblViewStoreManagement);
	        
	        // create an array of objects to set the row data and add button for new row
	        Object[] row = new Object[5];
	       
	        btnAdd.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	                row[0] = textManagerID.getText();
	                row[1] = textManagerName.getText();
	                row[2] = textUsername.getText();
	                row[3] = texttempPass.getText();
	                row[4] = boxLocation.getSelectedItem();
	                
	                model.addRow(row);
	            }
	        });
	        
	        // button to remove row
	        btnDelete.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
	                // i is the index of the selected row and remove a row from jtable
	                int i = table.getSelectedRow();
	                if(i >= 0){
	                    model.removeRow(i);
	                }
	                else{
	                    System.out.println("Delete Error");
	                }
	            }
	        });
	        
	        // get selected row data From table to textfields 
	        table.addMouseListener(new MouseAdapter(){
	        
	        @Override
	        public void mouseClicked(MouseEvent e){
	            
	        
	            int i = table.getSelectedRow();
	            
	            textManagerID.setText(model.getValueAt(i, 0).toString());
	            textManagerName.setText(model.getValueAt(i, 1).toString());
	            textUsername.setText(model.getValueAt(i, 2).toString());
	            texttempPass.setText(model.getValueAt(i, 3).toString());
	            boxLocation.setSelectedItem(model.getValueAt(i, 4).toString());
	        }
	        });
	        
	        // button to update row
	        btnUpdate.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	               
	                int i = table.getSelectedRow();
	                
	                if(i >= 0) 
	                {
	                   model.setValueAt(textManagerID.getText(), i, 0);
	                   model.setValueAt(textManagerName.getText(), i, 1);
	                   model.setValueAt(textUsername.getText(), i, 2);
	                   model.setValueAt(texttempPass.getText(), i, 3);
	                   model.setValueAt(boxLocation.getSelectedItem(), i, 4);
	                }
	                else{
	                    System.out.println("Update Error");
	                }
	            }
	        });
	        
	        frame.setSize(900,400);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        
	    }


}