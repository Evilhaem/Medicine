import net.proteanit.sql.DbUtils;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anungoobyambadorj
 */

public abstract class DatabaseFrame extends javax.swing.JFrame {


    public DatabaseFrame() {
        initComponents();
        setComponents();
        Connect();
    }
    java.sql.Connection conn;

    //Connects to database
    public void Connect() {
        try {
            conn = Connector.getInstance();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(AddFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Initializes components
    private void initComponents() {
        this.setSize(2000, 2000);
        JPanel jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        JButton jButton1 = new JButton();
        JLabel jLabel2 = new JLabel();
        txtsearch = new javax.swing.JTextField();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("DATABASE");
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", Font.BOLD, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));


        jButton1.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jButton1.setText("Буцах");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(254, 254, 254)
                                .addComponent(jLabel1)
                                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 13)); // NOI18N
        jLabel2.setText("Хайх");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased();
            }
        });

        jTable1.setFont(new java.awt.Font("Arial Unicode MS", Font.PLAIN, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Эм, тарианы нэр", "Эм, тарианы код", "Үйдвэрлэсэн улс", "Найрлага", "Хэмжээ, тоо ширхэг", "Зориулалт", "Үйлдвэрлэсэн огноо", "Дуусах огноо", "Бүртгэсэн огноо", "Нэмэлт"
                }
        ) {
            final boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(436, 436, 436))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    public abstract void setComponents();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void txtsearchKeyReleased() {
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        String search = txtsearch.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }

    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtsearch;
    private static JLabel jLabel1;
    public String sql;

    //Subclass for DatabaseFrame. Shows Injections
    public static class InjectionDatabaseFrame extends DatabaseFrame {
        @Override
        public void setComponents() {
            this.setSize(1300, 600);
            sql = "select * from injectionreg";
            jLabel1.setText("БҮРТГЭГДСЭН ТАРИАНЫ ЖАГСААЛТ");
        }
    }

    //Subclass for DatabaseFrame. Shows Pills
    public static class PillDatabaseFrame extends DatabaseFrame {
        @Override
        public void setComponents() {
            this.setSize(1300, 600);
            sql = "select * from medicinereg";
            jLabel1.setText("БҮРТГЭГДСЭН ЭМИЙН ЖАГСААЛТ");
        }
    }

}
