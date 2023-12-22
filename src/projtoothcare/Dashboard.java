/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projtoothcare;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class Dashboard extends javax.swing.JFrame {

    
     //Creates new form Dashboard
     
    public Dashboard() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jPanelAppointments = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelAppointments = new javax.swing.JLabel();
        jPanelCheckout = new javax.swing.JPanel();
        jLabelCheckout = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelBooking = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxDay = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jButtonBook = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jCheckBoxCleaning = new javax.swing.JCheckBox();
        jCheckBoxWhitening = new javax.swing.JCheckBox();
        jCheckBoxFilling = new javax.swing.JCheckBox();
        jCheckBoxNerveFilling = new javax.swing.JCheckBox();
        jCheckBoxRootCanal = new javax.swing.JCheckBox();
        jTextFieldTotal = new javax.swing.JTextField();
        jPanelAppoint = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonView = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAppointment = new javax.swing.JTable();
        jComboBoxOption = new javax.swing.JComboBox<>();
        jButtonFilter = new javax.swing.JButton();
        jPanelUpdate = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldUName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldUAge = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jRadioButtonUMale = new javax.swing.JRadioButton();
        jRadioButtonUFemale = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldUPhone = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jCheckBoxUCleaning = new javax.swing.JCheckBox();
        jCheckBoxUWhitening = new javax.swing.JCheckBox();
        jCheckBoxUFilling = new javax.swing.JCheckBox();
        jCheckBoxUNerveFilling = new javax.swing.JCheckBox();
        jCheckBoxURootCanal = new javax.swing.JCheckBox();
        jButtonUUpdate = new javax.swing.JButton();
        jButtonSearch2 = new javax.swing.JButton();
        jComboBoxUDay = new javax.swing.JComboBox<>();
        jComboBoxUTime = new javax.swing.JComboBox<>();
        jPanelPay = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldPayAppID = new javax.swing.JTextField();
        jButtonGenerate = new javax.swing.JButton();
        jButtonPaid = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInvoice = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 0, 53));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 181, 59));
        jLabel1.setText("Tooth Care Hospital");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 181, 59));
        jLabel2.setText("Dr. A.D. Ranasinghe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(34, 40, 44));

        jLabel3.setFont(new java.awt.Font("STHupo", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 181, 59));
        jLabel3.setText("DASHBOARD");

        jPanelHome.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHome.setPreferredSize(new java.awt.Dimension(219, 55));
        jPanelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projtoothcare/icons8_home_30px_1.png"))); // NOI18N

        jLabelHome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(207, 181, 59));
        jLabelHome.setText("HOME");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelHomeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabelHome)
                .addGap(19, 19, 19))
        );

        jPanelAppointments.setBackground(new java.awt.Color(51, 51, 51));
        jPanelAppointments.setPreferredSize(new java.awt.Dimension(219, 55));
        jPanelAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAppointmentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAppointmentsMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projtoothcare/icons8_planner_30px.png"))); // NOI18N

        jLabelAppointments.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelAppointments.setForeground(new java.awt.Color(207, 181, 59));
        jLabelAppointments.setText("APPOINTMENTS");
        jLabelAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAppointmentsMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAppointmentsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAppointmentsLayout = new javax.swing.GroupLayout(jPanelAppointments);
        jPanelAppointments.setLayout(jPanelAppointmentsLayout);
        jPanelAppointmentsLayout.setHorizontalGroup(
            jPanelAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAppointmentsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAppointments)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelAppointmentsLayout.setVerticalGroup(
            jPanelAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppointmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppointmentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAppointments)
                .addGap(15, 15, 15))
        );

        jPanelCheckout.setBackground(new java.awt.Color(51, 51, 51));
        jPanelCheckout.setPreferredSize(new java.awt.Dimension(219, 55));
        jPanelCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCheckoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCheckoutMouseExited(evt);
            }
        });

        jLabelCheckout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelCheckout.setForeground(new java.awt.Color(207, 181, 59));
        jLabelCheckout.setText("CHECKOUT");
        jLabelCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCheckoutMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCheckoutMousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projtoothcare/icons8_door_sensor_checked_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelCheckoutLayout = new javax.swing.GroupLayout(jPanelCheckout);
        jPanelCheckout.setLayout(jPanelCheckoutLayout);
        jPanelCheckoutLayout.setHorizontalGroup(
            jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckoutLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCheckout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCheckoutLayout.setVerticalGroup(
            jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCheckoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCheckoutLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelCheckout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(37, 37, 37))
            .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAppointments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(68, 68, 68)
                .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBooking.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBooking.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 0, 53));
        jLabel5.setText("APPOINTMENT BOOKING");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 0, 53));
        jLabel7.setText("NAME :");

        jTextFieldName.setToolTipText("");
        jTextFieldName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 3, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 0, 53));
        jLabel9.setText("AGE :");

        jTextFieldAge.setToolTipText("");
        jTextFieldAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 3, true));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(2, 0, 53));
        jLabel11.setText("GENDER :");

        buttonGroup1.add(jRadioButtonMale);
        jRadioButtonMale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMale.setForeground(new java.awt.Color(2, 0, 53));
        jRadioButtonMale.setText("MALE");
        jRadioButtonMale.setName(""); // NOI18N

        buttonGroup1.add(jRadioButtonFemale);
        jRadioButtonFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonFemale.setForeground(new java.awt.Color(2, 0, 53));
        jRadioButtonFemale.setText("FEMALE");
        jRadioButtonFemale.setName(""); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(2, 0, 53));
        jLabel12.setText("PHONE NO :");

        jTextFieldPhone.setToolTipText("");
        jTextFieldPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 3, true));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(2, 0, 53));
        jLabel13.setText("DAY :");

        jComboBoxDay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxDay.setForeground(new java.awt.Color(2, 0, 53));
        jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DAY", "MONDAY", "WEDNESDAY", "SATURDAY", "SUNDAY" }));
        jComboBoxDay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 3, true));
        jComboBoxDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxDayMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBoxDayMouseExited(evt);
            }
        });
        jComboBoxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDayActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(2, 0, 53));
        jLabel14.setText("TIME :");

        jComboBoxTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxTime.setForeground(new java.awt.Color(2, 0, 53));
        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TIME" }));
        jComboBoxTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 3, true));
        jComboBoxTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTimeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxTimeMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxTimeMousePressed(evt);
            }
        });

        jButtonBook.setBackground(new java.awt.Color(2, 0, 53));
        jButtonBook.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButtonBook.setForeground(new java.awt.Color(207, 181, 59));
        jButtonBook.setText("Book");
        jButtonBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonBookMousePressed(evt);
            }
        });
        jButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(2, 0, 53));
        jButtonClear.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(207, 181, 59));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(2, 0, 53));
        jLabel15.setText("TREATMENTS :");

        jCheckBoxCleaning.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxCleaning.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxCleaning.setText("CLEANING");

        jCheckBoxWhitening.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxWhitening.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxWhitening.setText("WHITENING");

        jCheckBoxFilling.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxFilling.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxFilling.setText("FILLING");

        jCheckBoxNerveFilling.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxNerveFilling.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxNerveFilling.setText("NERVE FILLING");

        jCheckBoxRootCanal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxRootCanal.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxRootCanal.setText("ROOT CANAL THERAPY");

        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 4, true));

        javax.swing.GroupLayout jPanelBookingLayout = new javax.swing.GroupLayout(jPanelBooking);
        jPanelBooking.setLayout(jPanelBookingLayout);
        jPanelBookingLayout.setHorizontalGroup(
            jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBookingLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addGroup(jPanelBookingLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(141, 141, 141)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBookingLayout.createSequentialGroup()
                        .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)
                            .addComponent(jButtonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBookingLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBookingLayout.createSequentialGroup()
                                        .addComponent(jCheckBoxCleaning, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jCheckBoxWhitening)
                                        .addGap(38, 38, 38)
                                        .addComponent(jCheckBoxFilling, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBookingLayout.createSequentialGroup()
                                        .addComponent(jCheckBoxNerveFilling)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxRootCanal))
                                    .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelBookingLayout.createSequentialGroup()
                                            .addComponent(jRadioButtonMale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButtonFemale))
                                        .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelBookingLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
            .addGroup(jPanelBookingLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel5)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanelBookingLayout.setVerticalGroup(
            jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBookingLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jCheckBoxCleaning)
                    .addComponent(jCheckBoxWhitening)
                    .addComponent(jCheckBoxFilling))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxNerveFilling)
                    .addComponent(jCheckBoxRootCanal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBook)
                        .addComponent(jButtonClear))
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanelAppoint.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jButtonView.setBackground(new java.awt.Color(2, 0, 53));
        jButtonView.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButtonView.setForeground(new java.awt.Color(207, 181, 59));
        jButtonView.setText("VIEW");
        jButtonView.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 2, true));
        jButtonView.setDisplayedMnemonicIndex(1);
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(2, 0, 53));
        jButtonUpdate.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(207, 181, 59));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 2, true));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonView)
                    .addComponent(jButtonUpdate))
                .addContainerGap())
        );

        jPanelView.setBackground(new java.awt.Color(255, 255, 255));

        jTableAppointment.setForeground(new java.awt.Color(2, 0, 53));
        jTableAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment", "Name", "Phone", "Day", "Time", "Cleaning", "Whitening", "Filling", "Nerve filling", "Root Canal", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAppointment);

        jComboBoxOption.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxOption.setForeground(new java.awt.Color(2, 0, 53));
        jComboBoxOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "MONDAY", "WEDNESDAY", "SATURDAY", "SUNDAY" }));
        jComboBoxOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 3, true));

        jButtonFilter.setBackground(new java.awt.Color(2, 0, 53));
        jButtonFilter.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButtonFilter.setForeground(new java.awt.Color(207, 181, 59));
        jButtonFilter.setText("Filter");
        jButtonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxOption, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonFilter)
                .addGap(53, 53, 53))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelUpdate.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(2, 0, 53));
        jLabel16.setText("Search Patient :");

        jTextFieldSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 3, true));

        jButtonSearch.setBackground(new java.awt.Color(2, 0, 53));
        jButtonSearch.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(207, 181, 59));
        jButtonSearch.setText("Search");
        jButtonSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 1, true));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(2, 0, 53));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 0, 53));
        jLabel17.setText("Name :");

        jTextFieldUName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 3, true));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 0, 53));
        jLabel18.setText("Age :");

        jTextFieldUAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 3, true));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 0, 53));
        jLabel19.setText("Gender :");

        buttonGroup1.add(jRadioButtonUMale);
        jRadioButtonUMale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonUMale.setText("Male");

        buttonGroup1.add(jRadioButtonUFemale);
        jRadioButtonUFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonUFemale.setText("Female");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 0, 53));
        jLabel20.setText("Phone  :");

        jTextFieldUPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 3, true));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 0, 53));
        jLabel21.setText("Day  :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(2, 0, 53));
        jLabel22.setText("Time  :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(2, 0, 53));
        jLabel23.setText("Treatments  :");

        jCheckBoxUCleaning.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxUCleaning.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxUCleaning.setText("Cleaning");

        jCheckBoxUWhitening.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxUWhitening.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxUWhitening.setText("Whitening");

        jCheckBoxUFilling.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxUFilling.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxUFilling.setText("Filling");

        jCheckBoxUNerveFilling.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxUNerveFilling.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxUNerveFilling.setText("Nerve Filling");

        jCheckBoxURootCanal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxURootCanal.setForeground(new java.awt.Color(2, 0, 53));
        jCheckBoxURootCanal.setText("Root Canal Therapy");

        jButtonUUpdate.setBackground(new java.awt.Color(2, 0, 53));
        jButtonUUpdate.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jButtonUUpdate.setForeground(new java.awt.Color(207, 181, 59));
        jButtonUUpdate.setText("Update");
        jButtonUUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 1, true));
        jButtonUUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUUpdateActionPerformed(evt);
            }
        });

        jButtonSearch2.setBackground(new java.awt.Color(2, 0, 53));
        jButtonSearch2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jButtonSearch2.setForeground(new java.awt.Color(207, 181, 59));
        jButtonSearch2.setText("Clear");
        jButtonSearch2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 1, true));
        jButtonSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch2ActionPerformed(evt);
            }
        });

        jComboBoxUDay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxUDay.setForeground(new java.awt.Color(2, 0, 53));
        jComboBoxUDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DAY", "MONDAY", "WEDNESDAY", "SATURDAY", "SUNDAY" }));
        jComboBoxUDay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 3, true));
        jComboBoxUDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBoxUDayMouseExited(evt);
            }
        });

        jComboBoxUTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxUTime.setForeground(new java.awt.Color(2, 0, 53));
        jComboBoxUTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TIME" }));
        jComboBoxUTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 181, 59), 3, true));
        jComboBoxUTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxUTimeMouseEntered(evt);
            }
        });
        jComboBoxUTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUpdateLayout = new javax.swing.GroupLayout(jPanelUpdate);
        jPanelUpdate.setLayout(jPanelUpdateLayout);
        jPanelUpdateLayout.setHorizontalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jCheckBoxUNerveFilling)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(206, 206, 206)
                                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonUMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonUFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22)
                                    .addComponent(jComboBoxUTime, 0, 224, Short.MAX_VALUE)))
                            .addComponent(jTextFieldUName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateLayout.createSequentialGroup()
                        .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                .addComponent(jButtonUUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBoxUCleaning, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldUAge)
                                    .addComponent(jTextFieldUPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxUDay, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxURootCanal)
                                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                        .addComponent(jCheckBoxUWhitening, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jCheckBoxUFilling, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(187, 187, 187))))
        );
        jPanelUpdateLayout.setVerticalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonUMale)
                    .addComponent(jRadioButtonUFemale))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxUDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jCheckBoxUCleaning)
                    .addComponent(jCheckBoxUWhitening)
                    .addComponent(jCheckBoxUFilling))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxUNerveFilling)
                    .addComponent(jCheckBoxURootCanal))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(jPanelView, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanelUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelUpdate.setVisible(false);

        javax.swing.GroupLayout jPanelAppointLayout = new javax.swing.GroupLayout(jPanelAppoint);
        jPanelAppoint.setLayout(jPanelAppointLayout);
        jPanelAppointLayout.setHorizontalGroup(
            jPanelAppointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelAppointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane2))
        );
        jPanelAppointLayout.setVerticalGroup(
            jPanelAppointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAppointLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 449, Short.MAX_VALUE))
            .addGroup(jPanelAppointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppointLayout.createSequentialGroup()
                    .addGap(0, 49, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelPay.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel8.setText("Payment Receipt System");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(2, 0, 53));
        jLabel24.setText("Appointment ID :");

        jTextFieldPayAppID.setToolTipText("");
        jTextFieldPayAppID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 3, true));

        jButtonGenerate.setBackground(new java.awt.Color(2, 0, 53));
        jButtonGenerate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonGenerate.setForeground(new java.awt.Color(207, 181, 59));
        jButtonGenerate.setText("Generate Receipt");
        jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateActionPerformed(evt);
            }
        });

        jButtonPaid.setBackground(new java.awt.Color(2, 0, 53));
        jButtonPaid.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonPaid.setForeground(new java.awt.Color(207, 181, 59));
        jButtonPaid.setText("Paid");
        jButtonPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaidActionPerformed(evt);
            }
        });

        jTextAreaInvoice.setColumns(20);
        jTextAreaInvoice.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaInvoice.setRows(5);
        jTextAreaInvoice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 0, 53), 2, true));
        jScrollPane2.setViewportView(jTextAreaInvoice);

        javax.swing.GroupLayout jPanelPayLayout = new javax.swing.GroupLayout(jPanelPay);
        jPanelPay.setLayout(jPanelPayLayout);
        jPanelPayLayout.setHorizontalGroup(
            jPanelPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPayLayout.createSequentialGroup()
                .addGroup(jPanelPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPayLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel25))
                    .addGroup(jPanelPayLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPayLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jTextFieldPayAppID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPayLayout.createSequentialGroup()
                                .addComponent(jButtonGenerate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelPayLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPayLayout.setVerticalGroup(
            jPanelPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPayLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldPayAppID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanelPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGenerate)
                    .addComponent(jButtonPaid))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(jPanelPayLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jPanelBooking, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanelAppoint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanelPay, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAppoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAppoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAppoint.setVisible(false);
        jPanelPay.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 303, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 77, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void setColorPanel(JPanel p){
        p.setBackground(new Color(2,0,53));
    }
    
    public void resetColorPanel(JPanel p){
        p.setBackground(new Color(51,51,51));
    }
    
    
    //Related to Setting Colors for the Label
    public void setColorLabel(JLabel l){
        l.setBackground(new Color(2,0,53));
        l.setForeground(new Color (207,181,59));
    }
    
     public void resetColorLabel(JLabel l){
        l.setBackground(new Color(51,51,51));
        l.setForeground(new Color (207,181,59));
    }
    
    
    
    private void jLabelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMousePressed
        // TODO add your handling code here:
        jPanelBooking.setVisible(true);
        jPanelAppoint.setVisible(false);
        jPanelPay.setVisible(false);
    }//GEN-LAST:event_jLabelHomeMousePressed

    private void jButtonBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBookMousePressed

        
    }//GEN-LAST:event_jButtonBookMousePressed

    private void updateComboBoxTime() {
        String selectedDay = (String) jComboBoxDay.getSelectedItem();
        DefaultComboBoxModel<String> timeModel = new DefaultComboBoxModel<>();

        if ("MONDAY".equals(selectedDay) || "WEDNESDAY".equals(selectedDay)) {
            // Add times for MONDAY and WEDNESDAY
            String[] times = {"6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "9:00 PM"};
            for (String time : times) {
                timeModel.addElement(time);
            }
        } else if ("SATURDAY".equals(selectedDay) || "SUNDAY".equals(selectedDay)) {
            // Add times for SATURDAY and SUNDAY
            String[] times = {"3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM",
                              "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM"};
            for (String time : times) {
                timeModel.addElement(time);
            }
        }

        jComboBoxTime.setModel(timeModel);
    }
    
    
    private void updateComboBoxUTime() {
        String selectedDay = (String) jComboBoxUDay.getSelectedItem();
        DefaultComboBoxModel<String> timeModel = new DefaultComboBoxModel<>();

        if ("MONDAY".equals(selectedDay) || "WEDNESDAY".equals(selectedDay)) {
            // Add times for MONDAY and WEDNESDAY
            String[] times = {"6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "9:00 PM"};
            for (String time : times) {
                timeModel.addElement(time);
            }
        } else if ("SATURDAY".equals(selectedDay) || "SUNDAY".equals(selectedDay)) {
            // Add times for SATURDAY and SUNDAY
            String[] times = {"3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM",
                              "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM"};
            for (String time : times) {
                timeModel.addElement(time);
            }
        }

        jComboBoxUTime.setModel(timeModel);
    }
    
    
    private void jComboBoxDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDayMouseClicked

    }//GEN-LAST:event_jComboBoxDayMouseClicked

    private void jComboBoxTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTimeMouseClicked
        
    }//GEN-LAST:event_jComboBoxTimeMouseClicked

    private void jComboBoxTimeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTimeMousePressed

    }//GEN-LAST:event_jComboBoxTimeMousePressed

    private void jComboBoxDayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDayMouseExited
        updateComboBoxTime();
    }//GEN-LAST:event_jComboBoxDayMouseExited

    private void jComboBoxTimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTimeMouseEntered
        updateComboBoxTime();
    }//GEN-LAST:event_jComboBoxTimeMouseEntered

    private void jButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookActionPerformed
        
        //validation
        if(jTextFieldName.getText()!= null && !jTextFieldAge.getText().isEmpty()  && (jRadioButtonMale.isSelected() || jRadioButtonFemale.isSelected()) && !jTextFieldPhone.getText().isEmpty() &&  jComboBoxDay.getSelectedIndex()!=0 && (jCheckBoxCleaning.isSelected() || jCheckBoxWhitening.isSelected() || jCheckBoxFilling.isSelected() || jCheckBoxNerveFilling.isSelected() || jCheckBoxRootCanal.isSelected())){
        
        //Text Fields
        String name = jTextFieldName.getText();
        int age = Integer.parseInt(jTextFieldAge.getText());
        String phone = jTextFieldPhone.getText();
        
        //Radio Button
        String gender = jRadioButtonMale.isSelected() ? "Male" : "Female";
        
        //Combo Box
        String day = (String) jComboBoxDay.getSelectedItem();
        String time = (String) jComboBoxTime.getSelectedItem();
        
        //CheckBox
        boolean cleaningSelected = jCheckBoxCleaning.isSelected();
        boolean whiteningSelected = jCheckBoxWhitening.isSelected();
        boolean fillingSelected = jCheckBoxFilling.isSelected();
        boolean nerveFillingSelected = jCheckBoxNerveFilling.isSelected();
        boolean rootCanalSelected = jCheckBoxRootCanal.isSelected();
        
            //Used to show in the database whether the treatments are required or not
            String RequireCleaning;
            String RequireWhitening;
            String RequireFilling;
            String RequireNerveFilling;
            String RequireRootCanal;
            
            //Prices
            int CleaningCost = 1500;
            int WhiteningCost = 1500;
            int FillingCost = 1500;
            int NerveFillingCost = 1500;
            int RootCanalCost = 1500;
            
            int tot = 0;
        
        //Cleaning
        if (cleaningSelected) {
            tot = tot+CleaningCost;
            RequireCleaning = "Required";
        } else {
            RequireCleaning = "Not Required";
        }
        
        //Whitening
        if (whiteningSelected) {
                tot = tot+WhiteningCost;
                RequireWhitening = "Required";
        } else {
                RequireWhitening = "Not Required";
        }
        
        //Filling
        if (fillingSelected) {
            tot = tot+FillingCost;
            RequireFilling = "Required";
        } else {
            RequireFilling = "Not Required";
        }
        
        //Nerve Filling
        if (nerveFillingSelected) {
            tot = tot+NerveFillingCost;
            RequireNerveFilling = "Required";
        } else {
            RequireNerveFilling = "Not Required";
        }

        //Root Canal
        if (rootCanalSelected) {
            tot = tot+RootCanalCost;
            RequireRootCanal = "Required";
        } else {
            RequireRootCanal = "Not Required";
        }
        
        String STot = String.valueOf(tot);
        jTextFieldTotal.setEditable(false);
        
        
        try{
            
            String query = "INSERT INTO tblappointment (name, age, gender, phone, day, time, cleaning, whitening, filling, nervefilling, root_canal_theropy, price) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            //Load the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toothcaredb", "root", "");
            
            // Check if there is an existing appointment for the specified date and time
            String checkQuery = "SELECT * FROM tblappointment WHERE day = ? AND time = ?";
    
            try (PreparedStatement checkStatement = con.prepareStatement(checkQuery)) {
            checkStatement.setString(1, day);
            checkStatement.setString(2, time);
        
            ResultSet resultSet = checkStatement.executeQuery();
        
                if (resultSet.next()) {
                // There is an existing appointment for the specified date and time
                JOptionPane.showMessageDialog(null, "An appointment already exists for the specified date and time.", "Error", JOptionPane.ERROR_MESSAGE);
                return;  // Exit the method or handle accordingly
                    }

                else{
                    
                    //Continue the appoitment
                    
                    PreparedStatement preparedStatement = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                    
                    preparedStatement.setString(1, name);
                    preparedStatement.setInt(2, age);
                    preparedStatement.setString(3, gender);
                    preparedStatement.setString(4, phone);
                    preparedStatement.setString(5, day);
                    preparedStatement.setString(6, time);
                    preparedStatement.setString(7, RequireCleaning);
                    preparedStatement.setString(8, RequireWhitening);
                    preparedStatement.setString(9, RequireFilling);
                    preparedStatement.setString(10, RequireNerveFilling);
                    preparedStatement.setString(11, RequireRootCanal);
                    preparedStatement.setString(12, STot);
                
                    preparedStatement.executeUpdate();
                    
                    // Retrieve the generated keys
                    ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                         
                    
                    if (generatedKeys.next()) {
                        
                        // Retrieve the generated AppointmentID
                        int generatedAppointmentID = generatedKeys.getInt(1);

                        // Display the generated AppointmentID
                        JOptionPane.showMessageDialog(null, "Appointment Booked successfully!   \n AppointmentID: " + generatedAppointmentID, "Success", JOptionPane.INFORMATION_MESSAGE);
                        jTextFieldTotal.setText(STot + " LKR    |    AppointmentID: " + generatedAppointmentID);
                        
                    } else {
                        
                        // No key was generated
                        JOptionPane.showMessageDialog(null, "Failed to retrieve AppointmentID", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    }                   
                }
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Validation failed. Please check your input.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonBookActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed

        //Clearing the text box
        jTextFieldName.setText("");
        jTextFieldAge.setText("");
        jTextFieldPhone.setText("");
        jTextFieldTotal.setText("");

        jRadioButtonMale.setSelected(false);
        jRadioButtonFemale.setSelected(false);

        jComboBoxDay.setSelectedIndex(0);
        jComboBoxTime.setSelectedIndex(0);

        jCheckBoxCleaning.setSelected(false);
        jCheckBoxWhitening.setSelected(false);
        jCheckBoxFilling.setSelected(false);
        jCheckBoxNerveFilling.setSelected(false);
        jCheckBoxRootCanal.setSelected(false);
        
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        
        jPanelUpdate.setVisible(false);
        jPanelView.setVisible(true);
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toothcaredb", "root", "");
            
            String sql = "SELECT * FROM tblappointment";
            
            try (PreparedStatement preparedStatement = con.prepareStatement(sql);
                    ResultSet resultSet = preparedStatement.executeQuery()){
                    DefaultTableModel model = (DefaultTableModel)jTableAppointment.getModel();
                    model.setRowCount(0);
                    while(resultSet.next()){
                        model.addRow(new String[]{resultSet.getString(1),resultSet.getString(2),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11),resultSet.getString(12),resultSet.getString(13)});
                    }
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jLabelAppointmentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAppointmentsMousePressed
        jPanelBooking.setVisible(false);
        jPanelPay.setVisible(false);
        jPanelAppoint.setVisible(true);
    }//GEN-LAST:event_jLabelAppointmentsMousePressed

    private void jButtonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilterActionPerformed
        
        // Get the selected day from jComboBoxOption
        String selectedDay = (String) jComboBoxOption.getSelectedItem();

        // Validate that a valid day is selected
        if (selectedDay.equals("Select an Option")) {
            JOptionPane.showMessageDialog(null, "Please select a valid day.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform the query with the selected day
        String sql = "SELECT * FROM tblappointment WHERE day = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toothcaredb", "root", "");
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             preparedStatement.setString(1, selectedDay);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                DefaultTableModel model = (DefaultTableModel) jTableAppointment.getModel();
                model.setRowCount(0);

                while (resultSet.next()) {
                    model.addRow(new String[]{
                            resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(5),
                            resultSet.getString(6),
                            resultSet.getString(7),
                            resultSet.getString(8),
                            resultSet.getString(9),
                            resultSet.getString(10),
                            resultSet.getString(11),
                            resultSet.getString(12),
                            resultSet.getString(13)
                    });
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonFilterActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        
        // abstract the AppointmentID from jTextFieldSearch
        String searchAppointmentID = jTextFieldSearch.getText();

        // Validate if AppointmentID is provided
        if (searchAppointmentID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an AppointmentID for search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform the search query
        String sql = "SELECT * FROM tblappointment WHERE AppointmentID = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toothcaredb", "root", "");
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, searchAppointmentID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                
                if (resultSet.next()) {
                    
                    jTextFieldUName.setText(resultSet.getString("name"));
                    jTextFieldUAge.setText(resultSet.getString("age"));

                    String gender = resultSet.getString("gender");
                    if ("Male".equals(gender)) {
                        jRadioButtonUMale.setSelected(true);
                    } else if ("Female".equals(gender)) {
                        jRadioButtonUFemale.setSelected(true);
                    }

                    jTextFieldUPhone.setText(resultSet.getString("phone"));

                    // abstrcting Data of Date and Time
                    jComboBoxUDay.setSelectedItem(resultSet.getString("day"));
                    
                    String selectedTime = resultSet.getString("time");
                    JOptionPane.showMessageDialog(null, "Appointment Time: " + selectedTime, "Information", JOptionPane.INFORMATION_MESSAGE);


                    jCheckBoxUCleaning.setSelected("Required".equals(resultSet.getString("cleaning")));
                    jCheckBoxUWhitening.setSelected("Required".equals(resultSet.getString("whitening")));
                    jCheckBoxUFilling.setSelected("Required".equals(resultSet.getString("filling")));
                    jCheckBoxUNerveFilling.setSelected("Required".equals(resultSet.getString("nervefilling")));
                    jCheckBoxURootCanal.setSelected("Required".equals(resultSet.getString("root_canal_theropy")));
                } else {
                    // Display a message if no data found
                    JOptionPane.showMessageDialog(null, "No record found for AppointmentID: " + searchAppointmentID, "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jComboBoxUDayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxUDayMouseExited
        updateComboBoxUTime();
    }//GEN-LAST:event_jComboBoxUDayMouseExited

    private void jComboBoxUTimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxUTimeMouseEntered
        updateComboBoxUTime();
    }//GEN-LAST:event_jComboBoxUTimeMouseEntered

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        jPanelUpdate.setVisible(true);
        jPanelView.setVisible(false);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jComboBoxUTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUTimeActionPerformed
        
    }//GEN-LAST:event_jComboBoxUTimeActionPerformed

    private void jButtonUUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUUpdateActionPerformed
        
        if(jTextFieldUName.getText()!= null && !jTextFieldUAge.getText().isEmpty()  && (jRadioButtonUMale.isSelected() || jRadioButtonUFemale.isSelected()) && !jTextFieldUPhone.getText().isEmpty() &&  jComboBoxUDay.getSelectedIndex()!=0 && (jCheckBoxUCleaning.isSelected() || jCheckBoxUWhitening.isSelected() || jCheckBoxUFilling.isSelected() || jCheckBoxUNerveFilling.isSelected() || jCheckBoxURootCanal.isSelected())){
        
            //Text Fields
            String updatedName = jTextFieldUName.getText();
            int updatedAge = Integer.parseInt(jTextFieldUAge.getText());
            int searchAppointmentID = Integer.parseInt(jTextFieldSearch.getText());
            String updatedPhone = jTextFieldUPhone.getText();

            //Radio Button
            String updatedGender = jRadioButtonUMale.isSelected() ? "Male" : "Female";

            //Combo Box
            String updatedDay = (String) jComboBoxUDay.getSelectedItem();
            String updatedTime = (String) jComboBoxUTime.getSelectedItem();

            //CheckBox
            boolean cleaningUSelected = jCheckBoxUCleaning.isSelected();
            boolean whiteningUSelected = jCheckBoxUWhitening.isSelected();
            boolean fillingUSelected = jCheckBoxUFilling.isSelected();
            boolean nerveFillingUSelected = jCheckBoxUNerveFilling.isSelected();
            boolean rootCanalUSelected = jCheckBoxURootCanal.isSelected();
            
            
            int Utot = 0;
            
            int CleaningCost = 1500;
            int WhiteningCost = 1500;
            int FillingCost = 1500;
            int NerveFillingCost = 1500;
            int RootCanalCost = 1500;
        
            String updatedCleaning;
            String updatedWhitening;
            String updatedFilling;
            String updatedNerveFilling;
            String updatedRootCanal;
            
                //Cleaning
                if (cleaningUSelected) {
                    Utot = Utot+CleaningCost;
                    updatedCleaning = "Required";
                } else {
                    updatedCleaning = "Not Required";
                }

                //Whitening
                if (whiteningUSelected) {
                    Utot = Utot+WhiteningCost;
                    updatedWhitening = "Required";
                } else {
                    updatedWhitening = "Not Required";
                }

                //Filling
                if (fillingUSelected) {
                    Utot = Utot+FillingCost;
                    updatedFilling = "Required";
                } else {
                    updatedFilling = "Not Required";
                }

                //Nerve Filling
                if (nerveFillingUSelected) {
                    Utot = Utot+NerveFillingCost;
                    updatedNerveFilling = "Required";
                } else {
                    updatedNerveFilling = "Not Required";
                }

                //Root Canal
                if (rootCanalUSelected) {
                    Utot = Utot+RootCanalCost;
                    updatedRootCanal = "Required";
                } else {
                    updatedRootCanal = "Not Required";
                }
            
                String updatedPrice = String.valueOf(Utot);
            
            
            
            
            String updateQuery = "UPDATE tblappointment SET name = ?, age = ?, gender = ?, phone = ?, day = ?, time = ?, cleaning = ?, whitening = ?, filling = ?, nervefilling = ?, root_canal_theropy = ?, price = ? WHERE AppointmentID = ?";
            
            String checkQuery = "SELECT * FROM tblappointment WHERE day = ? AND time = ?";
            
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toothcaredb", "root", "");
                    
                 // Check if there is an existing appointment for the specified date and time
                    
                
                
                 PreparedStatement checkStatement = con.prepareStatement(checkQuery);
                 PreparedStatement preparedStatement = con.prepareStatement(updateQuery)) {
                // Set the updated values
                
                checkStatement.setString(1, updatedDay);
                checkStatement.setString(2, updatedTime);
                ResultSet resultSet = checkStatement.executeQuery();
                
                if (resultSet.next()) {
                // There is an existing appointment for the specified date and time
                JOptionPane.showMessageDialog(null, "An appointment already exists for the specified date and time.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                else{
                
                
                preparedStatement.setString(1, updatedName);
                preparedStatement.setInt(2, updatedAge);
                preparedStatement.setString(3, updatedGender);
                preparedStatement.setString(4, updatedPhone);
                preparedStatement.setString(5, updatedDay);
                preparedStatement.setString(6, updatedTime);
                preparedStatement.setString(7, updatedCleaning);
                preparedStatement.setString(8, updatedWhitening);
                preparedStatement.setString(9, updatedFilling);
                preparedStatement.setString(10, updatedNerveFilling);
                preparedStatement.setString(11, updatedRootCanal);
                preparedStatement.setString(12, updatedPrice);

                // Set the AppointmentID for the WHERE clause
                preparedStatement.setInt(13, searchAppointmentID);

                // Execute the update query
                int rowsUpdated = preparedStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Appointment data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No record found for AppointmentID: " + searchAppointmentID, "Information", JOptionPane.INFORMATION_MESSAGE);
                }
              }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
            
        
        }
        
    }//GEN-LAST:event_jButtonUUpdateActionPerformed

    private void jButtonSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch2ActionPerformed
        //Clearing the text box
        jTextFieldUName.setText("");
        jTextFieldUAge.setText("");
        jTextFieldUPhone.setText("");
        jTextFieldSearch.setText("");

        jRadioButtonUMale.setSelected(false);
        jRadioButtonUFemale.setSelected(false);

        jComboBoxUDay.setSelectedIndex(0);
        jComboBoxUTime.setSelectedIndex(0);

        jCheckBoxUCleaning.setSelected(false);
        jCheckBoxUWhitening.setSelected(false);
        jCheckBoxUFilling.setSelected(false);
        jCheckBoxUNerveFilling.setSelected(false);
        jCheckBoxURootCanal.setSelected(false);
    }//GEN-LAST:event_jButtonSearch2ActionPerformed

    private void jPanelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseEntered
        setColorPanel(jPanelHome);
        setColorLabel(jLabelHome);
    }//GEN-LAST:event_jPanelHomeMouseEntered

    private void jLabelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseEntered
        setColorPanel(jPanelHome);
        setColorLabel(jLabelHome);
    }//GEN-LAST:event_jLabelHomeMouseEntered

    private void jPanelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseExited
        resetColorPanel(jPanelHome);
        resetColorLabel(jLabelHome);
    }//GEN-LAST:event_jPanelHomeMouseExited

    private void jPanelAppointmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAppointmentsMouseEntered
        setColorPanel(jPanelAppointments);
        setColorLabel(jLabelAppointments);
    }//GEN-LAST:event_jPanelAppointmentsMouseEntered

    private void jLabelAppointmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAppointmentsMouseEntered
        setColorPanel(jPanelAppointments);
        setColorLabel(jLabelAppointments);
    }//GEN-LAST:event_jLabelAppointmentsMouseEntered

    private void jPanelAppointmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAppointmentsMouseExited
        resetColorPanel(jPanelAppointments);
        resetColorLabel(jLabelAppointments);
    }//GEN-LAST:event_jPanelAppointmentsMouseExited

    private void jPanelCheckoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCheckoutMouseEntered
        setColorPanel(jPanelCheckout);
        setColorLabel(jLabelCheckout);
    }//GEN-LAST:event_jPanelCheckoutMouseEntered

    private void jLabelCheckoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckoutMouseEntered
        setColorPanel(jPanelCheckout);
        setColorLabel(jLabelCheckout);
    }//GEN-LAST:event_jLabelCheckoutMouseEntered

    private void jPanelCheckoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCheckoutMouseExited
        resetColorPanel(jPanelCheckout);
        resetColorLabel(jLabelCheckout);
    }//GEN-LAST:event_jPanelCheckoutMouseExited

    private void jLabelCheckoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckoutMousePressed
        jPanelBooking.setVisible(false);
        jPanelAppoint.setVisible(false);
        jPanelPay.setVisible(true);
    }//GEN-LAST:event_jLabelCheckoutMousePressed

    private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateActionPerformed
        
       
        String paymentAppointmentID = jTextFieldPayAppID.getText();

        // Validation
        if (paymentAppointmentID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an AppointmentID for payment.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Select Query
        String sql = "SELECT * FROM tblappointment WHERE AppointmentID = ?";
        
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toothcaredb", "root", "");
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            preparedStatement.setString(1, paymentAppointmentID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Check if the result set has data
                if (resultSet.next()) {
                    // Retrieve data from the result set and store in variables
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    String gender = resultSet.getString("gender");
                    String phone = resultSet.getString("phone");
                    String day = resultSet.getString("day");
                    String time = resultSet.getString("time");
                    String cleaning = resultSet.getString("cleaning");
                    String whitening = resultSet.getString("whitening");
                    String filling = resultSet.getString("filling");
                    String nerveFilling = resultSet.getString("nervefilling");
                    String rootCanal = resultSet.getString("root_canal_theropy");
                    String Strprice = resultSet.getString("price");
                    
                    int price = Integer.parseInt(Strprice);
                    //Already paid the registration fee
                    int discountedPrice = price - 1000;
                    
                    jTextAreaInvoice.setText("***********************************\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"   - Tooth Care Dental Hospital -  \n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"***********************************\n");
                    
                    Date obj = new Date();
                    String date = obj.toString();
                    
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"\n"+date+"\n");
                    
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Name : "+name+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Age : "+age+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Appointment Day : "+day+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Appointment Time : "+time+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+cleaning+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+whitening+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+filling+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+nerveFilling+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+rootCanal+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"\n***********************************\n\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Total Payment : "+Strprice+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Registration Fee : "+"1000"+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Balance Payment : "+discountedPrice+"\n");
                } else {
                    // No record found for the specified AppointmentID
                    JOptionPane.showMessageDialog(null, "No record found for AppointmentID: " + paymentAppointmentID, "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonGenerateActionPerformed

    private void jButtonPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaidActionPerformed
        
        
        // Get the AppointmentID from jTextFieldPayAppID
        String paymentAppointmentID = jTextFieldPayAppID.getText();

        // Validate if AppointmentID is provided
        if (paymentAppointmentID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an AppointmentID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform the delete query
        String deleteQuery = "DELETE FROM tblappointment WHERE AppointmentID = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toothcaredb", "root", "");
             PreparedStatement deleteStatement = con.prepareStatement(deleteQuery)) {

            deleteStatement.setString(1, paymentAppointmentID);

            // Execute the delete query
            int rowsDeleted = deleteStatement.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Appointment marked as paid and deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                    jTextAreaInvoice.setText("***********************************\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"   - Tooth Care Dental Hospital -  \n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"***********************************\n");
                    
                    Date obj = new Date();
                    String date = obj.toString();
                    
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"\n"+date+"\n");
                    
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Name : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Age : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Appointment Day : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Appointment Time : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Cleaning : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"\n***********************************\n\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Total Payment : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Registration Fee : "+"\n");
                    jTextAreaInvoice.setText(jTextAreaInvoice.getText()+"Balance Payment : "+"\n");
                    
                    jTextFieldPayAppID.setText("");
                
            } else {
                JOptionPane.showMessageDialog(null, "No record found for AppointmentID: " + paymentAppointmentID, "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }    
        
    }//GEN-LAST:event_jButtonPaidActionPerformed

    private void jComboBoxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDayActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBook;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonFilter;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JButton jButtonPaid;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearch2;
    private javax.swing.JButton jButtonUUpdate;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JCheckBox jCheckBoxCleaning;
    private javax.swing.JCheckBox jCheckBoxFilling;
    private javax.swing.JCheckBox jCheckBoxNerveFilling;
    private javax.swing.JCheckBox jCheckBoxRootCanal;
    private javax.swing.JCheckBox jCheckBoxUCleaning;
    private javax.swing.JCheckBox jCheckBoxUFilling;
    private javax.swing.JCheckBox jCheckBoxUNerveFilling;
    private javax.swing.JCheckBox jCheckBoxURootCanal;
    private javax.swing.JCheckBox jCheckBoxUWhitening;
    private javax.swing.JCheckBox jCheckBoxWhitening;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxOption;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private javax.swing.JComboBox<String> jComboBoxUDay;
    private javax.swing.JComboBox<String> jComboBoxUTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAppointments;
    private javax.swing.JLabel jLabelCheckout;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAppoint;
    private javax.swing.JPanel jPanelAppointments;
    private javax.swing.JPanel jPanelBooking;
    private javax.swing.JPanel jPanelCheckout;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelPay;
    private javax.swing.JPanel jPanelUpdate;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonUFemale;
    private javax.swing.JRadioButton jRadioButtonUMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAppointment;
    private javax.swing.JTextArea jTextAreaInvoice;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPayAppID;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldUAge;
    private javax.swing.JTextField jTextFieldUName;
    private javax.swing.JTextField jTextFieldUPhone;
    // End of variables declaration//GEN-END:variables
}
