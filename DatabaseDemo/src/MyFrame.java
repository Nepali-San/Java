
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author San
 */
public final class MyFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyFrame
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    Connection conn;
    Statement stat;
    ResultSet rs;
//  int upId;           Was created to store id for delete and update operation,instead use id Label to store the required id
    
    /*
    upId used to store the id when the row is selected by clicking.
    */
    
    public MyFrame()  {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/student_info","root","");
            stat = conn.createStatement();            
            JOptionPane.showMessageDialog(null,"connection established");         
            String query2 = "SELECT * FROM `facultytable`";        
                 
            //get all the faculty list in comboBox            
            rs = stat.executeQuery(query2);
            
//            String Create_table_eg = "create table tb_admin(id int primary key auto_increment, name varchar(50) not  null, username varchar(50) unique not null, email varchar(100) unique not null,contact varchar(10) not null,created_date datetime not null,last_login datetime null);";
//            stat.executeUpdate(Create_table_eg);
            
            while(rs.next()) comboBox.addItem(rs.getString("Faculty"));
            
            viewDataOnTable();  
            
        }
        catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex + " Error on connecting to database ");
            System.exit(0);
        }        
    }
    
   public ArrayList<UserClass> getUsersList()
    {
        ArrayList<UserClass> userList = new ArrayList<>();             
        String query = "SELECT * FROM `list`";
        UserClass user;       
        try{
            rs = stat.executeQuery(query);
            
             while(rs.next()){
                user = new UserClass(rs.getInt("Id"), rs.getString("Name"),rs.getString("Faculty"),rs.getString("Contact"));                            
                userList.add(user);
            }            
        }
        catch(SQLException ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null,ex);
            System.exit(0);
        }
        return userList;
    }
   
   public void viewDataOnTable(){
       ArrayList<UserClass> userList = getUsersList();
       DefaultTableModel table = (DefaultTableModel)jTable1.getModel();       
       Object[] rows = new Object[4]; 
       for(int i = 0 ; i < userList.size(); i++){      
           UserClass u = userList.get(i);
           rows[0] = u.getId();
           rows[1] = u.getName();
           rows[2] = u.getFaculty();
           rows[3] = u.getContact();  
           table.addRow(rows);
       }
       
   }      
       
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        idL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        insertB = new javax.swing.JButton();
        updateB = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contactTF = new javax.swing.JTextField();
        deleteB = new javax.swing.JButton();
        refreshB = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        messageL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton3.setText("jButton3");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        idL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setText("Id");

        jLabel1.setText("Name");

        nameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        insertB.setText("Add");
        insertB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBActionPerformed(evt);
            }
        });

        updateB.setText("Update");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        comboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setText("Faculty");

        jLabel3.setText("Contact");

        contactTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        refreshB.setText("Refresh");
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });

        searchTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });
        searchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTFKeyTyped(evt);
            }
        });

        jLabel5.setText("Search / Filter");

        messageL.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Faculty", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(25, 25, 25)
                                            .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(idL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(50, 50, 50)
                                                        .addComponent(insertB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(updateB)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(refreshB))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messageL, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertB))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateB))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteB))
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(messageL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void insertBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBActionPerformed
        messageL.setText(""); 
        String name    = nameTF.getText();
        nameTF.setText("");
        String faculty = (String) comboBox.getSelectedItem();
        String contact = contactTF.getText();
        contactTF.setText("");
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();                                
        jTable1.getSelectionModel().clearSelection();
        idL.setText("");                                
        
        //check if field is empty
        if(name.trim().equals("")  || contact.trim().equals("")){            
            messageL.setForeground(Color.red);
            messageL.setText("Warning : Fields cannot be empty !!!");
        }
        else{                      
                        
            try{
                //check if data already exists                                
                rs = stat.executeQuery("select `faculty` from `list` where `name` = '" + name + "' AND `contact` = '" + contact+ "' AND `faculty` = '"+ faculty +"'");                
                
                if(rs.next()){                    
                    if(rs.getString("Faculty").equals(faculty)){
                        messageL.setForeground(Color.red);
                        messageL.setText("Warning : Data already exists !!!");
                        return;
                    }
                }
                String query   = "insert into `list`(`Name`,`Faculty`,`Contact`) values('"+name+"','"+faculty+"','"+contact+"')";                
                stat.executeUpdate(query); 
                                  
                String idQuery = "select Id from list ORDER BY Id DESC LIMIT 1";
                rs  = stat.executeQuery(idQuery);
                int id = 0; 
                if(rs.next()){
                    id = rs.getInt("Id");                                   
                }                 
                table.addRow(new Object[]{id,name,faculty,contact}); 
                messageL.setForeground(Color.blue);
                messageL.setText("Successfully added record with new id = " + id);                
             }
            catch(SQLException ex){ 
                JOptionPane.showMessageDialog(null,ex);
                System.exit(0);
            }
        }
    }//GEN-LAST:event_insertBActionPerformed
    
    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        messageL.setText("");
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selected_row = jTable1.getSelectedRow();
        
        messageL.setForeground(Color.red);
        
        //check if item is selected or not
        if(selected_row == -1){            
            if(jTable1.getRowCount() == 0){                
                messageL.setText("Warning : Empty table !!!");
            }
            else{
                messageL.setText("Warning : Item not selected !!!");
            }
        }
        else{
           //check if our fields are empty or not
            if(nameTF.getText().trim().equals("") ||  contactTF.getText().trim().equals("")){
                messageL.setText("Warning : Fields cannot be empty !!!");
                return;
            }
            
            //check if data fields are modified or not , before update operation
            int selected_id = (int) jTable1.getValueAt(selected_row,0);
            try {
                rs = stat.executeQuery("Select * from `list` where `id` = " + selected_id );
                if(rs.next()){
                    String name = rs.getString("Name"); String contact = rs.getString("Contact"); String faculty = rs.getString("Faculty");                   
                    String facultyTF = (String) comboBox.getSelectedItem();                        
                    if(name.equals(nameTF.getText()) && contact.equals(contactTF.getText()) && faculty.equals(facultyTF)) {
                        
                        messageL.setForeground(Color.red);
                        messageL.setText("Warning : No changes made");                        
                        return;
                    }
                }
            } catch (SQLException ex) {          
                JOptionPane.showMessageDialog(null,ex);
                System.exit(0);
            }
            
            String updateQ = "UPDATE `list` SET `NAME`='"+ nameTF.getText() +"',`Faculty`='"+comboBox.getSelectedItem()+"',`Contact`='"+ contactTF.getText()+"' WHERE Id = "+ idL.getText();
            
            try { 
                   stat.executeUpdate(updateQ);
            } catch (SQLException ex) {         
                JOptionPane.showMessageDialog(null,ex);
                return;
            }
            //table.setValueAt(upId,jTable1.getSelectedRow(),0);
            table.setValueAt(nameTF.getText() , selected_row,1);
            table.setValueAt((String)comboBox.getSelectedItem() , selected_row,2);
            table.setValueAt(contactTF.getText() , selected_row,3);
            messageL.setForeground(Color.blue);
            messageL.setText("Successfully updated record with id = " + idL.getText());            
            nameTF.setText("");
            contactTF.setText("");
            idL.setText("");                   
            jTable1.getSelectionModel().clearSelection();
        }
    }//GEN-LAST:event_updateBActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selected_row = jTable1.getSelectedRow();
        selected_row = jTable1.convertRowIndexToModel(selected_row);
        
   //  upId = (int) table.getValueAt(selected_row, 0); 
   //  if id label is not used store the id into class variable upId        
        if(selected_row > -1){
        idL.setText(table.getValueAt(selected_row,0).toString());
        nameTF.setText(table.getValueAt(selected_row,1).toString());
        contactTF.setText(table.getValueAt(selected_row,3).toString());        
        comboBox.setSelectedItem(table.getValueAt(selected_row,2).toString());
        }
             
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed

        messageL.setText("");
        messageL.setForeground(Color.red);
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        
        //check if row is selected or not
        if(jTable1.getSelectedRow() == -1){
            if(jTable1.getRowCount() == 0){
                messageL.setText("Warning : Empty table !!!");
            }
            else{
                messageL.setText("Warning : Item not selected !!!");
            }
        }
        else{
            String deleteQ = "delete from `list` WHERE Id = " + idL.getText();            
            try {
                stat.executeUpdate(deleteQ);
            } catch (SQLException ex) {         
                System.out.println(deleteQ);
                JOptionPane.showMessageDialog(null,ex);
                return;
            }
            table.removeRow(jTable1.getSelectedRow());
           
            jTable1.getSelectionModel().clearSelection();
            
            nameTF.setText("");
            contactTF.setText("");                 
            messageL.setForeground(Color.blue);
            messageL.setText("Successfully deleted record with id   " + idL.getText());
            idL.setText("");
        }
    }//GEN-LAST:event_deleteBActionPerformed
    
    //Searching the data on every key entry (event -> key)
    private void searchTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTFKeyTyped

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(((DefaultTableModel)jTable1.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter(searchTF.getText()));
        jTable1.setRowSorter(sorter);                
        
    }//GEN-LAST:event_searchTFKeyTyped

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        // TODO add your handling code here:
        messageL.setText("");
        jTable1.getSelectionModel().clearSelection();
        nameTF.setText("");
        idL.setText("");
        searchTF.setText("");
        contactTF.setText("");
        comboBox.setSelectedItem("Education");        
        jTable1.setRowSorter(null);        
    }//GEN-LAST:event_refreshBActionPerformed

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField contactTF;
    private javax.swing.JButton deleteB;
    private javax.swing.JLabel idL;
    private javax.swing.JButton insertB;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel messageL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton refreshB;
    private javax.swing.JTextField searchTF;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}