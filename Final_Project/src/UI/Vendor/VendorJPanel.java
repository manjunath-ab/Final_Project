/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Vendor;

import UI.MainJFrame;
import UI.Validate;
import UI.Vendor.CRUDVendor;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Vendor.GroceryStall;
import model.UniqueID;

/**
 *
 * @author Admin
 */
public class VendorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VendorJPanel
     */
    String username;
    Validate validate = new Validate();
    public VendorJPanel(String u) {
        initComponents();
        username=u;
        ObjectContainer db = Db4o.openFile("grocerystall.db4o");
        
        db.close();
        populateTable();
        
    }
    private int generateID(){
        // create instance of Random class
        Random rand = new Random();
        ObjectContainer db = Db4o.openFile("uniqueid.db4o");
        // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(1000);
        ObjectSet result = db.queryByExample(UniqueID.class);
        while (result.hasNext()) {
           UniqueID u=(UniqueID) result.next();
           if(rand_int==u.getId()){
               generateID();
           }      
        }
        UniqueID uid=new UniqueID();
        uid.setId(rand_int);
        db.store(uid);
        db.commit();
        db.close();
        return rand_int;
    }
    private void populateTable(){
        ObjectContainer db = Db4o.openFile("grocerystall.db4o");
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        GroceryStall newObj=new GroceryStall();
        newObj.setOwnerUsername(username);
        ObjectSet result = db.queryByExample(newObj);
        while (result.hasNext()) {
        GroceryStall g = (GroceryStall) result.next();            
            Object[] row = new Object[100];//2 members for now
            //row[0]=e.getName();
            row[0]=g;//1st column stores object names so..they get deleted
            
            
            model.addRow(row);
            
        }
        db.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbLocation = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "My Grocery Shops"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stall Name");

        jLabel1.setText("Register Grocery Store:");

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(77, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        cbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allston", "Back Bay", "Bay Village", "Beacon Hill", "Brighton", "Charlestown", "Chinatown–Leather District", "Dorchester", "Downtown", "East Boston", "Fenway-Kenmore", "Hyde Park", "Jamaica Plain", "Mattapan", "Mission Hill", "North End", "Roslindale", "Roxbury", "South Boston", "South End", "West End", "West Roxbury", "Wharf District" }));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSelect))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(73, 73, 73)
                                .addComponent(cbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegister)
                        .addGap(66, 66, 66)
                        .addComponent(btnDelete)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnSelect)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnDelete))
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        if(validate.isEmptyOrNull(name)){
                   
                  JOptionPane.showMessageDialog(this,"Name Should not be empty or null");
        }else
        {
        GroceryStall newStall= new GroceryStall();
        newStall.setOwnerUsername(username);
        newStall.setLocation(cbLocation.getItemAt(cbLocation.getSelectedIndex()));
        newStall.setName(txtName.getText());
        newStall.setId(generateID());
        ObjectContainer db = Db4o.openFile("grocerystall.db4o");
        db.store(newStall);
        db.commit();
        db.close();
        populateTable();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a Stall");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        //getting the whole object to manipulate
        GroceryStall selectedStall= (GroceryStall) model.getValueAt(selectedRowIndex,0);
        //figure a way to properly link menu per restaurant model
        CRUDVendor crudPanel = new CRUDVendor(selectedStall,username);
        //code to move to next JPanel
        //SearchJPanel1 searchJPanel1=new SearchJPanel1(selectedCommunity);
        //searchJPanel1.setVisible(true);
        //ObjectContainer db = Db4o.openFile("restaurant.db4o");
        //db1.close();
        MainJFrame.splitPane.setRightComponent(crudPanel);
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select an Stall");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        //getting the whole object to manipulate
        GroceryStall f= (GroceryStall) model.getValueAt(selectedRowIndex,0);
        ObjectContainer db = Db4o.openFile("grocerystall.db4o");
       //List <Order> result=db.queryByExample(selectedOrder);
        ObjectSet result = db.queryByExample(f);
        f=(GroceryStall)result.next();
        db.delete(f);
        db.close();
        JOptionPane.showMessageDialog(this,"Item Deleted");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a stall");
            return;
        }
        if(validate.isEmptyOrNull(txtName.getText())){
                  JOptionPane.showMessageDialog(this,"Name Should not be empty or null");
  
        }else {
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        //getting the whole object to manipulate
        GroceryStall f= (GroceryStall) model.getValueAt(selectedRowIndex,0);
        ObjectContainer db = Db4o.openFile("grocerystall.db4o");
       //List <Order> result=db.queryByExample(selectedOrder);
        ObjectSet result = db.queryByExample(f);
        f=(GroceryStall)result.next();
        f.setName(txtName.getText());
       
        f.setLocation(cbLocation.getItemAt(cbLocation.getSelectedIndex()));
        db.store(f);
        db.close();
        JOptionPane.showMessageDialog(this,"Item Updated");
        populateTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
