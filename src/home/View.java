/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Nonzoiku
 */
public class View extends javax.swing.JFrame {
     Map param = new HashMap();
     JasperReport jasrep;
    JasperDesign jasdes;
    JasperPrint jaspri;

    /**
     * Creates new form HomeC
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        find = new javax.swing.JButton();
        SearchID = new javax.swing.JTextField();
        cetak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        Jcity = new javax.swing.JComboBox<>();
        Jgender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jButton_Update = new javax.swing.JButton();
        jButton_Delate = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Insert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 110, -1));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("KARYAWAN");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 240, -1));

        find.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        find.setForeground(new java.awt.Color(0, 153, 204));
        find.setText("Find");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        jPanel3.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 70, 20));

        SearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDActionPerformed(evt);
            }
        });
        jPanel3.add(SearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 80, -1));

        cetak.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        cetak.setForeground(new java.awt.Color(0, 153, 204));
        cetak.setText("Cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        jPanel3.add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1635989683_Logo saja UHW Perbanas (2).png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 1010, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2), "CRUD App", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Address");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 30));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("First Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Last Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 30));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Gander");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("City");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 30));
        jPanel4.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, 30));
        jPanel4.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 270, 30));

        Jcity.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Jcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".....", "Balikpapan", "Surabaya", "Jakarta", "NTT", "NTB", "Samarinda", "Siduarjo", "Magetan", "Nganjuk", "Madura", "Malang" }));
        jPanel4.add(Jcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 270, 30));

        Jgender.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Jgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "......", "Laki-Laki", "Perempuan" }));
        jPanel4.add(Jgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 270, 30));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 270, -1));

        jButton_Update.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Update.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 40));

        jButton_Delate.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Delate.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_Delate.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delate.setText("Delate");
        jButton_Delate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DelateActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_Delate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 130, 40));

        jButton_Clear.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Clear.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 130, 40));

        jButton_Insert.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Insert.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_Insert.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Insert.setText("Insert");
        jButton_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 500));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1000, 40));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Gender", "City", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel6.add(jScrollPane2);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 590, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 1000, 670));

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-home-20.png"))); // NOI18N
        jMenuItem1.setText("Kos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-employee-20.png"))); // NOI18N
        jMenuItem2.setText("Penyewa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-employee-20.png"))); // NOI18N
        jMenuItem3.setText("Karyawan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("ABC");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    public void loadData() {
            try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:MySQL://localhost:3306/curd_app";
        String user = "root";
        String pass = "";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
            
       DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "First Name", "Last Name", "Gender","City","Address"}, 0);
      
       Table.setModel(model);
       String sql = "SELECT * FROM employe";
       
       ResultSet rs = (ResultSet) st.executeQuery(sql);
       String i, f, l,e,c,a;
       while(rs.next()){
         i = rs.getString("id");
         f = rs.getString("first_name");
         l = rs.getString("last_name");
         e = rs.getString("Gender");
         c = rs.getString("City");
         a = rs.getString("Address");
         model.addRow(new Object[]{i, f, l, e, c, a});
       }
     }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
     }   
    }
    
    private void jButton_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertActionPerformed
       String fn, ln, gd, ct, ad, query ;
       
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           String url = "jdbc:MySQL://localhost:3306/curd_app";
           String user  = "root";
           String pass = "";
           
           Connection con = DriverManager.getConnection(url, user, pass);
           Statement st = con.createStatement();
           
           if ("".equals(fName.getText())){
               
               JOptionPane.showMessageDialog(new JFrame(), "First Name is require", "Dialog", 
                                             JOptionPane.ERROR_MESSAGE);
           }else if ("".equals(lName.getText())) {
               JOptionPane.showMessageDialog(new JFrame(), "Last Name is require", "Dialog", 
                                             JOptionPane.ERROR_MESSAGE);
           }else if ("".equals(Jgender.getSelectedItem())) {
               JOptionPane.showMessageDialog(new JFrame(), "Gender is require", "Dialog", 
                                             JOptionPane.ERROR_MESSAGE);
           }else if ("".equals(Jcity.getSelectedItem())) {
               JOptionPane.showMessageDialog(new JFrame(), "City is require", "Dialog", 
                                             JOptionPane.ERROR_MESSAGE);
           }else if ("".equals(address.getText())) {
               JOptionPane.showMessageDialog(new JFrame(), "Address is require", "Dialog", 
                                             JOptionPane.ERROR_MESSAGE);
           }else {
                fn = fName.getText();
                ln = lName.getText();
                gd = (String) Jgender.getSelectedItem();
                ct = (String) Jcity.getSelectedItem();
                ad = address.getText();
               
                
                query = "INSERT INTO employe (`first_name`, `last_name`, Gender, City, Address)"
                       + "VALUES ('" + fn + "','" + ln + "','" + gd + "','" + ct + "','" + ad + "')";

               
                st.executeUpdate(query);
                fName.setText("");
                lName.setText("");
                Jgender.setSelectedItem("");
                Jcity.setSelectedItem("");
                address.setText("");
                loadData();
                con.close();
                
               System.out.println(query);
           }
          
           
           
       }  catch (Exception e) {
           System.out.println("Error" + e.getMessage());
       }
       
        
    }//GEN-LAST:event_jButton_InsertActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        String ID;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/curd_app";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID = SearchID.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM employe WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                   fName.setText(rs.getString("first_name"));
                   lName.setText(rs.getString("last_name"));
                   Jgender.setSelectedItem(rs.getString("Gender"));
                   Jcity.setSelectedItem (rs.getString("City"));
                    address.setText (rs.getString("Address"));
                   notFound = 1;

                  con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }    
        
    
    }//GEN-LAST:event_findActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        String ID;
        int notFound = 0;
         String fn, ln, gd, ct, ad;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/curd_app";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID = SearchID.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM employe WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                fn = fName.getText();
                ln = lName.getText();
                gd = (String) Jgender.getSelectedItem();
                ct = (String) Jcity.getSelectedItem();
                ad = address.getText();
                String sql2 = "UPDATE employe SET first_name='"+fn+"', last_name='"+ln+"', Gender='"+gd+"', City='"+ct+"',"
                        + "Address='"+ad+"'  WHERE id="+ID;
                 st.executeUpdate(sql2); 
                 loadData();
                 con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
       fName.setText("");
       lName.setText("");
       Jgender.setSelectedItem("");
       Jcity.setSelectedItem("");
       address.setText("");
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_DelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DelateActionPerformed
       String ID;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/curd_app";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID = SearchID.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM employe WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                 String sql2 = "DELETE FROM employe WHERE id="+ID;
                 st.executeUpdate(sql2); 
                 loadData();
                 con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        } 
    }//GEN-LAST:event_jButton_DelateActionPerformed

    
    
    private void SearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchIDActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
try {
            String reportPath = "src/report/karyawan.jasper";
            Connection c = Koneksi.getKoneksi();
            HashMap<String,Object> parameters = new HashMap<>();
            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,c);
            JasperViewer viewer = new JasperViewer(print,false);
            viewer.setVisible(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }     
    }//GEN-LAST:event_cetakActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        View vm = new View();
                vm.setVisible(true);
                vm.pack();
                vm.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        kos ks = new kos();
                ks.setVisible(true);
                ks.pack();
                ks.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        penyewa py = new penyewa();
                py.setVisible(true);
                py.pack();
                py.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                View x = new View();
                x.loadData();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jcity;
    private javax.swing.JComboBox<String> Jgender;
    private javax.swing.JTextField SearchID;
    private javax.swing.JTable Table;
    private javax.swing.JTextArea address;
    private javax.swing.JButton cetak;
    private javax.swing.JTextField fName;
    private javax.swing.JButton find;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delate;
    private javax.swing.JButton jButton_Insert;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lName;
    // End of variables declaration//GEN-END:variables

     

}