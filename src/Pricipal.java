
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Pricipal extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    
    /**
     * Creates new form Pricipal
     */
    public Pricipal() {
        initComponents();
        con = databaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        birthday = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        imageIcon = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        pastpresent = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        mainmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRINCIPAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 0));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(0, 51, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADDRESS");
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGE");
        jLabel6.setMaximumSize(new java.awt.Dimension(0, 0));

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BIRTHDAY");
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));

        birthday.setBackground(new java.awt.Color(255, 255, 255));
        birthday.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        birthday.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 51, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENDER");
        jLabel8.setMaximumSize(new java.awt.Dimension(0, 0));

        gender.setBackground(new java.awt.Color(255, 255, 255));
        gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        jLabel11.setBackground(new java.awt.Color(0, 51, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTACT NO.");
        jLabel11.setMaximumSize(new java.awt.Dimension(0, 0));

        contact.setBackground(new java.awt.Color(255, 255, 255));
        contact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(0, 0, 0));

        select.setBackground(new java.awt.Color(51, 51, 51));
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setText("SELECT IMAGE");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        pastpresent.setBackground(new java.awt.Color(51, 51, 51));
        pastpresent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pastpresent.setForeground(new java.awt.Color(255, 255, 255));
        pastpresent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAST/PRESENT", "PRESENT", "PAST" }));

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(51, 51, 51));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\project Image\\project Image\\submit.png")); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID");
        jLabel5.setMaximumSize(new java.awt.Dimension(0, 0));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));

        search.setBackground(new java.awt.Color(51, 51, 51));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\project Image\\project Image\\loupe.png")); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        mainmenu.setBackground(new java.awt.Color(51, 51, 51));
        mainmenu.setForeground(new java.awt.Color(255, 255, 255));
        mainmenu.setText("MAIN MENU");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(select))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(birthday, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(id)
                                    .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pastpresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addComponent(mainmenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(update)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(search)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(imageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pastpresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainmenu)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        imageIcon.setIcon(new ImageIcon(file.toString()));
        filename = file.getAbsolutePath();

        try
        {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte [] buf = new byte [1024];
            for(int readnum; (readnum = fis.read(buf)) != -1;)
            {
                bos.write(buf, 0, readnum);
            }
            photo = bos.toByteArray();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_selectActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try
        {
            stmt = con.createStatement();
            
            
            int sId = Integer.parseInt(id.getText());
            String sName = name.getText();
            String sAddress = address.getText();
            int sAge = Integer.parseInt(age.getText());
            long Birthday = Date.parse(birthday.getText());
            java.sql.Date sBirthday = new java.sql.Date(Birthday);
            String sGender = (String) gender.getSelectedItem();
            int sContact = Integer.parseInt(contact.getText());
            String PastPresent = (String) pastpresent.getSelectedItem();
            
            String query = "INSERT INTO principal (id, name, address, age, birthday, gender, contact, image, pastpresent) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, sId);
            preparedStmt.setString(2, sName);
            preparedStmt.setString(3, sAddress);
            preparedStmt.setInt(4, sAge);
            preparedStmt.setDate(5, sBirthday);
            preparedStmt.setString(6, sGender);
            preparedStmt.setInt(7, sContact);
            preparedStmt.setBytes(8, photo);
            preparedStmt.setString(9, PastPresent);
            
            preparedStmt.execute();
            JOptionPane.showMessageDialog(null, "ADDED");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_addActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try
        {
            stmt = con.createStatement();
            
            int sId = Integer.parseInt(id.getText());
            
            String query = "SELECT * FROM principal";
            
            ResultSet rs = stmt.executeQuery(query);
           
            while(rs.next())
            {
                if(sId == rs.getInt("id"))
                {
                    name.setText(rs.getString("name"));
                    address.setText(rs.getString("address"));
                    age.setText(String.format("%s", rs.getInt("age")));
                    birthday.setText(String.format("%tD", rs.getDate("birthday")));
                    gender.setSelectedItem(rs.getString("gender"));
                    contact.setText(String.format(0 + "%s", rs.getInt("contact")));
                    pastpresent.setSelectedItem(rs.getString("pastpresent"));
                    
                    BufferedImage image = ImageIO.read(rs.getBinaryStream("image"));
                    imageIcon.setIcon(new ImageIcon(image));
                    
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try
        {
            stmt = con.createStatement();
            
            
            int sId = Integer.parseInt(id.getText());
            String sName = name.getText();
            String sAddress = address.getText();
            int sAge = Integer.parseInt(age.getText());
            long Birthday = Date.parse(birthday.getText());
            java.sql.Date sBirthday = new java.sql.Date(Birthday);
            String sGender = (String) gender.getSelectedItem();
            int sContact = Integer.parseInt(contact.getText());
            String PastPresent = (String) pastpresent.getSelectedItem();
            
            String query = "UPDATE principal SET name = ?, address = ?, age = ?, birthday = ?, gender = ?, contact = ?, image = ?, pastpresent = ? WHERE id = ?";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            preparedStmt.setString(1, sName);
            preparedStmt.setString(2, sAddress);
            preparedStmt.setInt(3, sAge);
            preparedStmt.setDate(4, sBirthday);
            preparedStmt.setString(5, sGender);
            preparedStmt.setInt(6, sContact);
            preparedStmt.setBytes(7, photo);
            preparedStmt.setString(8, PastPresent);
            preparedStmt.setInt(9, sId);
            
            preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home view = new Home();
        view.setVisible(true);
    }//GEN-LAST:event_mainmenuActionPerformed

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
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField birthday;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imageIcon;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainmenu;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> pastpresent;
    private javax.swing.JButton search;
    private javax.swing.JButton select;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
byte [] photo = null;
String filename = null;

}
