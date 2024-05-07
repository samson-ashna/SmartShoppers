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

	public class StoreManagement {

	    public static void main(String[] args){
	        
	        // create JFrame and JTable and set table model & rows/columns
	        JFrame frame = new JFrame();
	        frame.getContentPane().setBackground(new Color(85, 60, 139));
	        JTable table = new JTable(); 
	        
	        
	        Object[] columns = {"STORE ID", "STORE", "AVAILABILITY", "HOURS", "MAP", "CATEGORY", "AISLE"};
	        Object[] row1 = {"1730813", "Store A","Yes","Mon-Fri 9am-11pm, Sat 11am-3pm","Ontario - ON","Bakery","Aisle 1"};
	        Object[] row2 = {"3297364", "Store B","No","Mon-Thurs 10am-7pm, Sun 11am-5pm","Manitoba - MB","Meat","Aisle 7"};
	        Object[] row3 = {"5037239", "Store C","Yes","Tues-Sat 8am-9pm","Nova Scotia - NS","Snacks","Aisle 9"};
	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columns);
	        model.addRow(row1);
	        model.addRow(row2);
	        model.addRow(row3);
	        table.setModel(model);
	        
	       
	        table.setBackground(Color.LIGHT_GRAY);
	        table.setForeground(Color.black);
	        Font font = new Font("", 1, 17);
	        table.setFont(font);
	        table.setRowHeight(20);
	        
	        // create JTextFields and JButtons
	        JTextField textStoreID = new JTextField();
	        JTextField textStoreName = new JTextField();
	        JTextField textAvailability = new JTextField();
	        JTextField textHours = new JTextField();
	        textHours.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        
	        JButton btnAdd = new JButton("Add");
	        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        JButton btnDelete = new JButton("Delete");
	        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        JButton btnUpdate = new JButton("Update");     
	        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        
	        textStoreID.setBounds(138, 261, 100, 25);
	        textStoreName.setBounds(138, 291, 100, 25);
	        textAvailability.setBounds(379, 261, 100, 25);
	        textHours.setBounds(379, 291, 100, 25);
	        
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
	        frame.getContentPane().add(textStoreID);
	        frame.getContentPane().add(textStoreName);
	        frame.getContentPane().add(textAvailability);
	        frame.getContentPane().add(textHours);
	    
	        frame.getContentPane().add(btnAdd);
	        frame.getContentPane().add(btnDelete);
	        frame.getContentPane().add(btnUpdate);
	        
	        JLabel lblNewLabel = new JLabel("STORE MANAGEMENT");
	        lblNewLabel.setForeground(new Color(158, 169, 240));
	        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
	        lblNewLabel.setBounds(35, 210, 240, 40);
	        frame.getContentPane().add(lblNewLabel);
	        
	        JLabel lblCategory = new JLabel("CATEGORY:");
	        lblCategory.setForeground(new Color(204, 193, 255));
	        lblCategory.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblCategory.setBounds(502, 282, 130, 14);
	        frame.getContentPane().add(lblCategory);
	        
	        JComboBox boxCategory = new JComboBox();
	        boxCategory.setModel(new DefaultComboBoxModel(new String[] {"Bakery", "Beverage", "Clothing", "Dairy", "Electronics", "Produce", "Meat ", "Seafood", "Snacks"}));
	        boxCategory.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        boxCategory.setBounds(620, 278, 113, 26);
	        frame.getContentPane().add(boxCategory);
	        
	        JLabel lblProductID = new JLabel("STORE ID:");
	        lblProductID.setForeground(new Color(204, 193, 255));
	        lblProductID.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblProductID.setBounds(10, 265, 113, 14);
	        frame.getContentPane().add(lblProductID);
	        
	        JLabel lblProduct = new JLabel("STORE:");
	        lblProduct.setForeground(new Color(204, 193, 255));
	        lblProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblProduct.setBounds(10, 302, 113, 14);
	        frame.getContentPane().add(lblProduct);
	        
	        JLabel lblQuantity = new JLabel("AVAILABILITY:");
	        lblQuantity.setForeground(new Color(204, 193, 255));
	        lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblQuantity.setBounds(248, 261, 136, 25);
	        frame.getContentPane().add(lblQuantity);
	        
	        JLabel lblPrice = new JLabel("HOURS:");
	        lblPrice.setForeground(new Color(204, 193, 255));
	        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblPrice.setBounds(271, 301, 113, 14);
	        frame.getContentPane().add(lblPrice);
	        
	        JLabel lblAisle = new JLabel("AISLE:");
	        lblAisle.setForeground(new Color(204, 193, 255));
	        lblAisle.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblAisle.setBounds(502, 315, 130, 17);
	        frame.getContentPane().add(lblAisle);
	        
	        JLabel lblMap = new JLabel("MAP:");
	        lblMap.setForeground(new Color(204, 193, 255));
	        lblMap.setFont(new Font("Tahoma", Font.BOLD, 16));
	        lblMap.setBounds(502, 247, 130, 14);
	        frame.getContentPane().add(lblMap);
	        
	        JComboBox boxMap = new JComboBox();
	        boxMap.setModel(new DefaultComboBoxModel(new String[] {"Alberta - AB", "British Columbia - BC", "Manitoba - MB", 
	        		"New Brunswick - NB", "Newfoundland and Labrador - NL", "Northwest Territories - NT", 
	        		"Nova Scotia - NS", "Nunavut - NU", "Ontario - ON", "Prince Edward Island - PE", "Quebec - QC", 
	        		"Saskatchewan - SK", "Yukon - YT"}));
	        boxMap.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        boxMap.setBounds(556, 241, 199, 26);
	        frame.getContentPane().add(boxMap);
	        
	        JComboBox boxAisle = new JComboBox();
	        boxAisle.setModel(new DefaultComboBoxModel(new String[] {"Aisle 1", "Aisle 2", "Aisle 3", "Aisle 4", "Aisle 5", "Aisle 6", "Aisle 7", "Aisle 8", "Aisle 9"}));
	        boxAisle.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        boxAisle.setBounds(620, 314, 113, 26);
	        frame.getContentPane().add(boxAisle);
	        
	        // create an array of objects to set the row data and add button for new row
	        Object[] row = new Object[5];
	       
	        btnAdd.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	                row[0] = textStoreID.getText();
	                row[1] = textStoreName.getText();
	                row[2] = textAvailability.getText();
	                row[3] = textHours.getText();
	                row[4] = boxCategory.getSelectedItem();
	                
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
	            
	            textStoreID.setText(model.getValueAt(i, 0).toString());
	            textStoreName.setText(model.getValueAt(i, 1).toString());
	            textAvailability.setText(model.getValueAt(i, 2).toString());
	            textHours.setText(model.getValueAt(i, 3).toString());
	            boxCategory.setSelectedItem(model.getValueAt(i, 4).toString());
	        }
	        });
	        
	        // button to update row
	        btnUpdate.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	               
	                int i = table.getSelectedRow();
	                
	                if(i >= 0) 
	                {
	                   model.setValueAt(textStoreID.getText(), i, 0);
	                   model.setValueAt(textStoreName.getText(), i, 1);
	                   model.setValueAt(textAvailability.getText(), i, 2);
	                   model.setValueAt(textHours.getText(), i, 3);
	                   model.setValueAt(boxCategory.getSelectedItem(), i, 4);
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
