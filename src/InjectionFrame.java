import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anungoobyambadorj
 */
public class InjectionFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    java.sql.Connection conn;
    PreparedStatement pst;

    public InjectionFrame() {
        initComponents();
        conn = Connector.getInstance();
    }
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        txtName = new javax.swing.JTextField();
        JLabel jLabel3 = new JLabel();
        txtId = new javax.swing.JTextField();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        txtCountry = new javax.swing.JTextField();
        txtIngredient = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JComboBox<>();
        JPanel jPanel2 = new JPanel();
        // Variables declaration
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        txtAdd = new javax.swing.JTextField();
        JLabel jLabel10 = new JLabel();
        txtExp = new com.toedter.calendar.JDateChooser();
        txtManufacturer = new com.toedter.calendar.JDateChooser();
        txtRegistration = new com.toedter.calendar.JDateChooser(new Date());
        JLabel jLabel11 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("INJECTION REGISTRATION");
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", Font.BOLD, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ТАРИА ШИНЭЭР БҮРТГЭЛ ҮҮСГЭХ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel2.setText("Тарианы нэр:");

        jLabel3.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel3.setText("Тарианы код:");

        jLabel4.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel4.setText("Үйлдвэрлэсэн огноо:");

        jLabel5.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel5.setText("Тун:");

        jLabel6.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel6.setText("Дуусах огноо:");

        jLabel7.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel7.setText("Тоо ширхэг:");

        jLabel8.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel8.setText("Найрлага:");

        jLabel9.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel9.setText("Үйлдвэрлэсэн улс:");

        txtPurpose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jButton1.setText("Нэмэх");
        jButton1.setActionCommand("");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jButton2.setText("Бүртгэл");
        jButton2.setActionCommand("");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jButton3.setText("Гарах");
        jButton3.setActionCommand("");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
        );

        jLabel10.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel10.setText("Нэмэлт тайлбар:");

        jLabel11.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel11.setText("Бүртгэсэн огноо:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10)
                                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtManufacturer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtIngredient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtExp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                        .addComponent(jLabel6))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCountry)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel5)
                                        .addComponent(txtPurpose, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addComponent(txtRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAdd))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String medName = txtName.getText();
            String medId = txtId.getText();
            String medCountry = txtCountry.getText();
            String medIngredients = txtIngredient.getText();
            String medNumber = txtNum.getText();
            String medPurpose = Objects.requireNonNull(txtPurpose.getSelectedItem()).toString();
            SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
            String medManuDate = date_format.format(txtManufacturer.getDate());
            String medExpDate = date_format.format(txtExp.getDate());
            String medRegDate = date_format.format(txtRegistration.getDate());
            String medAdditional = txtAdd.getText();

            Drug.Injection injection = (Drug.Injection) DrugFactory.createDrug("INJECTION", medName, medId,medCountry,medIngredients,medNumber,medPurpose,medManuDate, medExpDate, medRegDate, medAdditional);

            pst = conn.prepareStatement("insert into injectionreg(name,id,country,ingredients,number,dose,manudate,expdate,regdate,additional)values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, injection.getName());
            pst.setString(2, injection.getId());
            pst.setString(3, injection.getCountry());
            pst.setString(4, injection.getIngredients());
            pst.setString(5, injection.getNumber());
            pst.setString(6, injection.getDose());
            pst.setString(7, injection.getManuDate());
            pst.setString(8, injection.getExpDate());
            pst.setString(9, injection.getRegDate());
            pst.setString(10, injection.getAdditional());

            injection = null;

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Амжилттай бүртгэгдлээ!");

            txtName.setText("");
            txtId.setText("");
            txtCountry.setText("");
            txtIngredient.setText("");
            txtNum.setText("");
            txtPurpose.setSelectedIndex(0);
            txtManufacturer.setDate(null);
            txtExp.setDate(null);
            txtRegistration.setDate(null);
            txtAdd.setText("");


        }catch (SQLException ex) {
            Logger.getLogger(PillFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InjectionDatabaseFrame db = new InjectionDatabaseFrame();
        db.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Гарах уу?",
                "Эм, тарианы бүртгэлийн систем",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new PillFrame().setVisible(true));
    }

    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCountry;
    private com.toedter.calendar.JDateChooser txtExp;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIngredient;
    private com.toedter.calendar.JDateChooser txtManufacturer;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JComboBox<String> txtPurpose;
    private com.toedter.calendar.JDateChooser txtRegistration;
}
