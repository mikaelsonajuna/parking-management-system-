package packingms;

import java.awt.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AJUNA MICHAEL
 */
public class dashboard extends javax.swing.JFrame {

    Connection connect;
    Statement statement;
    ResultSet data;
    String sql;
 
    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();

        connect = null;
        statement = null;
        data = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/mustparkingms", "root", "");
            statement = connect.createStatement();
        }
        catch(Exception ex){
        }
        listed();
    }
   
    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void listed(){
    DefaultTableModel tab = new DefaultTableModel();
    tab.addColumn("username");
    tab.addColumn("phoneNo");
    tab.addColumn("numberPlate");
    tab.addColumn("carName");
    
    sql = "SELECT login.username, customer.phoneNo, customer.numberPlate, customer.carName FROM customer INNER JOIN login WHERE customer.custID = login.loginID;";
            
    try{
      data = statement.executeQuery(sql);
      
      while(data.next()){
      tab.addRow(new Object[]{
              data.getString(1),
              data.getString(2),
              data.getString(3),
              data.getString(4),
            }
        );
      }
      currentt.setModel(tab);
    }
    catch(Exception exp){
        System.out.println(exp);
        }     
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        txt_admin = new javax.swing.JLabel();
        current_label = new javax.swing.JLabel();
        register_label = new javax.swing.JLabel();
        delete_label = new javax.swing.JLabel();
        change_label = new javax.swing.JLabel();
        currentpan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentt = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        delete_pan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        delete_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_carname = new javax.swing.JTextField();
        txt_noplate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Fname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_sname = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Grenze Medium", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CURRENT USERS");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Grenze Medium", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CURRENT USERS");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(0, 0, 0));
        logoutbtn.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("LOG OUT ");
        logoutbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        txt_admin.setFont(new java.awt.Font("Roboto Black", 1, 40)); // NOI18N
        txt_admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_adminMouseClicked(evt);
            }
        });

        current_label.setFont(new java.awt.Font("Grenze Medium", 0, 24)); // NOI18N
        current_label.setForeground(new java.awt.Color(255, 255, 255));
        current_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        current_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packingms/user_groups_26px.png"))); // NOI18N
        current_label.setText("   CURRENT USERS");
        current_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        current_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                current_labelMouseClicked(evt);
            }
        });

        register_label.setFont(new java.awt.Font("Grenze Medium", 0, 24)); // NOI18N
        register_label.setForeground(new java.awt.Color(255, 255, 255));
        register_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packingms/add_user_male_26px.png"))); // NOI18N
        register_label.setText("   REGISTER A USER ");
        register_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        register_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_labelMouseEntered(evt);
            }
        });

        delete_label.setFont(new java.awt.Font("Grenze Medium", 0, 24)); // NOI18N
        delete_label.setForeground(new java.awt.Color(255, 255, 255));
        delete_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packingms/delete_26px.png"))); // NOI18N
        delete_label.setText("       DELETE A USER");
        delete_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        delete_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_labelMouseClicked(evt);
            }
        });

        change_label.setFont(new java.awt.Font("Grenze Medium", 0, 24)); // NOI18N
        change_label.setForeground(new java.awt.Color(255, 255, 255));
        change_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        change_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packingms/search_24px.png"))); // NOI18N
        change_label.setText("     SEARCH  USERS");
        change_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        change_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                change_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(txt_admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(current_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(register_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(change_label, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txt_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(current_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(register_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(delete_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(change_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        currentpan.setBackground(new java.awt.Color(255, 255, 255));

        currentt.setForeground(new java.awt.Color(51, 51, 51));
        currentt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "username", "phoneNo", "numberPlate", "carName"
            }
        ));
        jScrollPane1.setViewportView(currentt);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Grenze Medium", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CURRENT USERS");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout currentpanLayout = new javax.swing.GroupLayout(currentpan);
        currentpan.setLayout(currentpanLayout);
        currentpanLayout.setHorizontalGroup(
            currentpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentpanLayout.createSequentialGroup()
                .addGroup(currentpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentpanLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(currentpanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        currentpanLayout.setVerticalGroup(
            currentpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentpanLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        delete_pan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Grenze Medium", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEARCH AND DELETE USERS");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchBtn.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packingms/search_24px.png"))); // NOI18N
        searchBtn.setText("     SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        delete_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_txtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CAR NAME:");

        txt_carname.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        txt_carname.setForeground(new java.awt.Color(0, 0, 0));
        txt_carname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txt_noplate.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        txt_noplate.setForeground(new java.awt.Color(0, 0, 0));
        txt_noplate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_noplate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("NUMBER PLATE : ");

        txt_Fname.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        txt_Fname.setForeground(new java.awt.Color(0, 0, 0));
        txt_Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Fname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(" FIRST NAME :");

        jLabel11.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("SUR NAME :");

        txt_sname.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        txt_sname.setForeground(new java.awt.Color(0, 0, 0));
        txt_sname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_sname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btn_delete.setFont(new java.awt.Font("Grenze Medium", 0, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setBorder(new javax.swing.border.MatteBorder(null));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_panLayout = new javax.swing.GroupLayout(delete_pan);
        delete_pan.setLayout(delete_panLayout);
        delete_panLayout.setHorizontalGroup(
            delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(delete_panLayout.createSequentialGroup()
                        .addComponent(delete_txt)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_panLayout.createSequentialGroup()
                        .addGroup(delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, delete_panLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_sname))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, delete_panLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_carname)
                            .addGroup(delete_panLayout.createSequentialGroup()
                                .addGap(0, 30, Short.MAX_VALUE)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_noplate))
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        delete_panLayout.setVerticalGroup(
            delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_panLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_carname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(delete_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_noplate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete_pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(currentpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(delete_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        register reg = new register();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void delete_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_txtActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
         String records;
        records = delete_txt.getText();
        
        try{
            String query = "Select customer.carName, customer.numberPlate, customer.fname, customer.sname FROM customer WHERE fname='"+records+"' OR numberPlate='"+records+"';";
            
            data = statement.executeQuery(query);
            
            if(data.first()){
                txt_Fname.setText(data.getString("fname"));
                txt_sname.setText(data.getString("sname"));
                txt_carname.setText(data.getString("carName"));
                txt_noplate.setText(data.getString("numberPlate"));
             
            }
            else if (records.isEmpty()){
                showMessageDialog(null, "Search Cannot be Empty ! ! ! ");
                delete_txt.requestFocus();
            }
            
            else{
                showMessageDialog(null, "Wrong Search Inputs!!");
                delete_txt.setText("");
                delete_txt.requestFocus();
            }
        }
        
        catch(Exception ex){
            showMessageDialog(null, ex.getMessage());
            
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        
        String delete_user;
        delete_user = txt_Fname.getText();
        
        try{
            String query2 = "DELETE customer, login FROM customer INNER JOIN login WHERE customer.custID = login.loginID AND customer.fname='"+delete_user+"';";
            
             statement.executeUpdate(query2);
             
             showMessageDialog(null, "ARE SURE YOU WANT TO DELETE " + delete_user + "?");
             
             txt_Fname.setText("");
             txt_sname.setText("");
             txt_carname.setText("");
             txt_noplate.setText("");
        }
        catch(Exception exp){
            showMessageDialog(null, exp);
        }
        
        finally{
            listed();
        }        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_adminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adminMouseClicked

    private void current_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_current_labelMouseClicked
        // TODO add your handling code here:
        
        currentpan.setVisible(true);
        delete_pan.setVisible(false);
    }//GEN-LAST:event_current_labelMouseClicked

    private void register_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_labelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_register_labelMouseEntered

    private void register_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_labelMouseClicked
        // TODO add your handling code here:
        
        userDetails a = new userDetails();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(userDetails.EXIT_ON_CLOSE);
    }//GEN-LAST:event_register_labelMouseClicked

    private void delete_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_labelMouseClicked
        // TODO add your handling code here:
        delete_pan.setVisible(true);
        currentpan.setVisible(false);
        delete_pan.setAlignmentX(100);
        delete_pan.setAlignmentY(0);
    }//GEN-LAST:event_delete_labelMouseClicked

    private void change_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_labelMouseClicked
        // TODO add your handling code here:
        delete_pan.setAlignmentX(100);
        delete_pan.setAlignmentY(0);
        currentpan.setVisible(false);
        delete_pan.setVisible(true);
    }//GEN-LAST:event_change_labelMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                dashboard obj2 = new dashboard();
                obj2.setVisible(true);
                obj2.setLocationRelativeTo(null);
                obj2.getContentPane().setBackground(Color.DARK_GRAY);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JLabel change_label;
    private javax.swing.JLabel current_label;
    private javax.swing.JPanel currentpan;
    private javax.swing.JTable currentt;
    private javax.swing.JLabel delete_label;
    private javax.swing.JPanel delete_pan;
    private javax.swing.JTextField delete_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JLabel register_label;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField txt_Fname;
    public static javax.swing.JLabel txt_admin;
    private javax.swing.JTextField txt_carname;
    private javax.swing.JTextField txt_noplate;
    private javax.swing.JTextField txt_sname;
    // End of variables declaration//GEN-END:variables
}
