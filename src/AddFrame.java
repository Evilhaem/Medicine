import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
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
public abstract class AddFrame extends javax.swing.JFrame {
    Connection connection;
    PreparedStatement preparedStatement;

    public AddFrame() {
        initComponents();
        setComponents();
        connection = Connector.getInstance();
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        nameLabel = new JLabel();
        txtName = new javax.swing.JTextField();
        idLabel = new JLabel();
        txtId = new javax.swing.JTextField();
        manuDateLabel = new JLabel();
        purposeLabel = new JLabel();
        expDateLabel = new JLabel();
        quantityLabel = new JLabel();
        ingredientsLabel = new JLabel();
        countyLabel = new JLabel();
        txtCountry = new javax.swing.JTextField();
        txtIngredient = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JComboBox<>();
        JPanel jPanel2 = new JPanel();
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

        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", Font.BOLD, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));


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

        nameLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        nameLabel.setText("Тарианы нэр:");

        idLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        idLabel.setText("Тарианы код:");

        manuDateLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        manuDateLabel.setText("Үйлдвэрлэсэн огноо:");

        purposeLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        purposeLabel.setText("Тун:");

        expDateLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        expDateLabel.setText("Дуусах огноо:");

        quantityLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        quantityLabel.setText("Тоо ширхэг:");

        ingredientsLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        ingredientsLabel.setText("Найрлага:");

        countyLabel.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        countyLabel.setText("Үйлдвэрлэсэн улс:");



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
                                        .addComponent(nameLabel)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ingredientsLabel)
                                        .addComponent(manuDateLabel)
                                        .addComponent(jLabel10)
                                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtManufacturer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtIngredient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtExp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                        .addComponent(expDateLabel))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCountry)
                                        .addComponent(countyLabel)
                                        .addComponent(purposeLabel)
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
                                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(idLabel)
                                                        .addComponent(countyLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ingredientsLabel)
                                        .addComponent(purposeLabel)
                                        .addComponent(quantityLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(expDateLabel)
                                                        .addComponent(manuDateLabel))
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
    }
    public abstract void setComponents();
    public abstract void jButton1ActionPerformed(java.awt.event.ActionEvent evt);
    public abstract void jButton2ActionPerformed(java.awt.event.ActionEvent evt);

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Гарах уу?",
                "Эм, тарианы бүртгэлийн систем",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }

    private static javax.swing.JTextField txtAdd;
    private static javax.swing.JTextField txtCountry;
    private static com.toedter.calendar.JDateChooser txtExp;
    private static javax.swing.JTextField txtId;
    private static javax.swing.JTextField txtIngredient;
    private static com.toedter.calendar.JDateChooser txtManufacturer;
    private static javax.swing.JTextField txtName;
    private static javax.swing.JTextField txtNum;
    private static javax.swing.JComboBox<String> txtPurpose;
    private static com.toedter.calendar.JDateChooser txtRegistration;
    JLabel jLabel1, nameLabel, idLabel, manuDateLabel, purposeLabel, expDateLabel, quantityLabel, ingredientsLabel, countyLabel;

    public static class InjectionFrame extends AddFrame {

        @Override
        public void setComponents() {
            setTitle("INJECTION REGISTRATION");
            jLabel1.setText("ТАРИА ШИНЭЭР БҮРТГЭЛ ҮҮСГЭХ");
            txtPurpose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        }

        @Override
        public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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

                Drug.Injection injection = (Drug.Injection) Drug.DrugFactory.createDrug("INJECTION", medName, medId,medCountry,medIngredients,medNumber,medPurpose,medManuDate, medExpDate, medRegDate, medAdditional);

                preparedStatement = connection.prepareStatement("insert into injectionreg(name,id,country,ingredients,number,dose,manudate,expdate,regdate,additional)values(?,?,?,?,?,?,?,?,?,?)");
                preparedStatement.setString(1, injection.getName());
                preparedStatement.setString(2, injection.getId());
                preparedStatement.setString(3, injection.getCountry());
                preparedStatement.setString(4, injection.getIngredients());
                preparedStatement.setString(5, injection.getNumber());
                preparedStatement.setString(6, injection.getDose());
                preparedStatement.setString(7, injection.getManuDate());
                preparedStatement.setString(8, injection.getExpDate());
                preparedStatement.setString(9, injection.getRegDate());
                preparedStatement.setString(10, injection.getAdditional());

                injection = null;

                preparedStatement.executeUpdate();
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
                Logger.getLogger(InjectionFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void jButton2ActionPerformed(ActionEvent evt) {
            DatabaseFrame.InjectionDatabaseFrame db = new DatabaseFrame.InjectionDatabaseFrame();
            db.setVisible(true);
        }

    }

    public static class PillFrame extends AddFrame {

        @Override
        public void setComponents() {
            setTitle("PILL REGISTRATION");
            jLabel1.setText("ЭМ ШИНЭЭР БҮРТГЭЛ ҮҮСГЭХ");
            nameLabel.setText("Эмийн нэр:");
            idLabel.setText("Эмийн код:");
            manuDateLabel.setText("Үйлдвэрлэсэн огноо:");
            purposeLabel.setText("Зориулалт:");
            expDateLabel.setText("Дуусах огноо:");
            quantityLabel.setText("Хэмжээ, тоо ширхэг:");
            ingredientsLabel.setText("Найрлага:");
            countyLabel.setText("Үйлдвэрлэсэн улс:");
            txtPurpose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Дотуур", "Гадуур"}));
        }

        @Override
        public void jButton1ActionPerformed(ActionEvent evt) {
            try{
                String medname = txtName.getText();
                String medid = txtId.getText();
                String medcountry = txtCountry.getText();
                String medingredients = txtIngredient.getText();
                String mednumber = txtNum.getText();
                String medpurpose = Objects.requireNonNull(txtPurpose.getSelectedItem()).toString();
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String medmanudate = date_format.format(txtManufacturer.getDate());
                String medexpdate = date_format.format(txtExp.getDate());
                String medregdate = date_format.format(txtRegistration.getDate());
                String medadditional = txtAdd.getText();

                Drug.Pill pill = (Drug.Pill) Drug.DrugFactory.createDrug("PILL", medname, medid,medcountry,medingredients,mednumber,medpurpose,medmanudate, medexpdate, medregdate, medadditional);

                preparedStatement = connection.prepareStatement("insert into medicinereg(name,id,country,ingredients,number,purpose,manudate,expdate,regdate,additional)values(?,?,?,?,?,?,?,?,?,?)");
                preparedStatement.setString(1, pill.getName());
                preparedStatement.setString(2, pill.getId());
                preparedStatement.setString(3, pill.getCountry());
                preparedStatement.setString(4, pill.getIngredients());
                preparedStatement.setString(5, pill.getNumber());
                preparedStatement.setString(6, pill.getPurpose());
                preparedStatement.setString(7, pill.getManuDate());
                preparedStatement.setString(8, pill.getExpDate());
                preparedStatement.setString(9, pill.getRegDate());
                preparedStatement.setString(10, pill.getAdditional());

                pill = null;

                preparedStatement.executeUpdate();
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
        }

        @Override
        public void jButton2ActionPerformed(ActionEvent evt) {
            DatabaseFrame.PillDatabaseFrame db = new DatabaseFrame.PillDatabaseFrame();
            db.setVisible(true);
        }

    }
}
