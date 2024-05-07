//package javaapp;

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

public class ItemManagement {

    public static void main(String[] args){
        
        // create JFrame and JTable
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(85, 60, 139));
        JTable table = new JTable(); 
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"PRODUCT ID", "PRODUCT", "QUANTITY", "PRICE", "CATEGORY"};
        Object[] row1 = {"1", "potatoes","150","$21.99","Produce"};
        Object[] row2 = {"2", "eggs","600","$150.70","Dairy"};
        Object[] row3 = {"3", "cameras","56","$16,800.00","Electronics"};
        Object[] row4 = {"4", "coca cola cans","779","$184.89","Dairy"};
        Object[] row5 = {"5", "pringles can","338","$754.89","Snacks"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        model.addRow(row1);
        model.addRow(row2);
        model.addRow(row3);
        model.addRow(row4);
        model.addRow(row5);
        
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("", 1, 17);
        table.setFont(font);
        table.setRowHeight(20);
        
        // create JTextFields
        JTextField textProductID = new JTextField();
        JTextField textProductName = new JTextField();
        JTextField textQuantity = new JTextField();
        JTextField textPrice = new JTextField();
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JButton btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JButton btnUpdate = new JButton("Update");     
        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        textProductID.setBounds(138, 261, 100, 25);
        textProductName.setBounds(138, 291, 100, 25);
        textQuantity.setBounds(379, 261, 100, 25);
        textPrice.setBounds(379, 291, 100, 25);
        
        btnAdd.setBounds(765, 221, 100, 25);
        btnUpdate.setBounds(765, 266, 100, 25);
        btnDelete.setBounds(765, 311, 100, 25);
        
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBackground(new Color(158, 169, 240));
        pane.setBounds(0, 0, 880, 200);
        
        frame.getContentPane().setLayout(null);
        
        frame.getContentPane().add(pane);
        
        // add JTextFields to the jframe
        frame.getContentPane().add(textProductID);
        frame.getContentPane().add(textProductName);
        frame.getContentPane().add(textQuantity);
        frame.getContentPane().add(textPrice);
    
        // add JButtons to the jframe
        frame.getContentPane().add(btnAdd);
        frame.getContentPane().add(btnDelete);
        frame.getContentPane().add(btnUpdate);
        
        JLabel lblNewLabel = new JLabel("ITEM MANAGEMENT");
        lblNewLabel.setForeground(new Color(158, 169, 240));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
        lblNewLabel.setBounds(35, 210, 240, 40);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblCategory = new JLabel("CATEGORY:");
        lblCategory.setForeground(new Color(204, 193, 255));
        lblCategory.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblCategory.setBounds(510, 279, 113, 14);
        frame.getContentPane().add(lblCategory);
        
        JComboBox boxCategory = new JComboBox();
        boxCategory.setModel(new DefaultComboBoxModel(new String[] {"Bakery", "Beverage", "Clothing", "Dairy", "Electronics", "Produce", "Meat ", "Seafood", "Snacks"}));
        boxCategory.setFont(new Font("Tahoma", Font.PLAIN, 18));
        boxCategory.setBounds(627, 273, 113, 26);
        frame.getContentPane().add(boxCategory);
        
        JLabel lblProductID = new JLabel("PRODUCT ID:");
        lblProductID.setForeground(new Color(204, 193, 255));
        lblProductID.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblProductID.setBounds(10, 265, 113, 14);
        frame.getContentPane().add(lblProductID);
        
        JLabel lblProduct = new JLabel("PRODUCT:");
        lblProduct.setForeground(new Color(204, 193, 255));
        lblProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblProduct.setBounds(10, 302, 113, 14);
        frame.getContentPane().add(lblProduct);
        
        JLabel lblQuantity = new JLabel("QUANTITY:");
        lblQuantity.setForeground(new Color(204, 193, 255));
        lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblQuantity.setBounds(271, 261, 113, 25);
        frame.getContentPane().add(lblQuantity);
        
        JLabel lblPrice = new JLabel("PRICE:");
        lblPrice.setForeground(new Color(204, 193, 255));
        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPrice.setBounds(271, 301, 113, 14);
        frame.getContentPane().add(lblPrice);
        
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
        
        // create an array of objects to set the row data
        Object[] row = new Object[5];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = textProductID.getText();
                row[1] = textProductName.getText();
                row[2] = textQuantity.getText();
                row[3] = textPrice.getText();
                row[4] = boxCategory.getSelectedItem();
                
                // add row to the model
                model.addRow(row);
            }
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
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
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            textProductID.setText(model.getValueAt(i, 0).toString());
            textProductName.setText(model.getValueAt(i, 1).toString());
            textQuantity.setText(model.getValueAt(i, 2).toString());
            textPrice.setText(model.getValueAt(i, 3).toString());
            boxCategory.setSelectedItem(model.getValueAt(i, 4).toString());
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textProductID.getText(), i, 0);
                   model.setValueAt(textProductName.getText(), i, 1);
                   model.setValueAt(textQuantity.getText(), i, 2);
                   model.setValueAt(textPrice.getText(), i, 3);
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