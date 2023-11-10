/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.awt.Color;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jandell
 */
public final class calcu extends javax.swing.JFrame {

    float height;
    float width;
    float result;
    String numericPartBox2;
    String numericPart;
    String numericPartBox3;
    String wastage;

    
    
    public calcu() {
        initComponents();
        panels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Roof = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        gutter = new javax.swing.JTextField();
        rafter = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        box2 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        box3 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        sheetCost = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        roofArea1 = new javax.swing.JTextField();
        sheets = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Cost = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        roofSheetArea = new javax.swing.JTextField();
        TilesFloor = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        fArea = new javax.swing.JTextField();
        Tneeded = new javax.swing.JTextField();
        Tcost = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Flength = new javax.swing.JTextField();
        Fwidth = new javax.swing.JTextField();
        Tlength = new javax.swing.JTextField();
        Twidth = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        box4 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        components = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        panel1btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fTiles = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panel2btn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        txtf2 = new javax.swing.JTextField();
        txtf1 = new javax.swing.JTextField();
        txtf3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtf4 = new javax.swing.JTextField();
        txtf5 = new javax.swing.JTextField();
        txtf6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        Title2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtf9 = new javax.swing.JTextField();
        Title3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        plywood = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        pTextW = new javax.swing.JTextField();
        pTextH = new javax.swing.JTextField();
        pArea = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Title6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        woodLength = new javax.swing.JTextField();
        woodWidth = new javax.swing.JTextField();
        woodsNeeded = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Title7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        woodCost = new javax.swing.JTextField();
        woodCosts = new javax.swing.JTextField();
        modelPanel = new javax.swing.JPanel();

        Roof.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Roof.setTitle("Roof Sheets");
        Roof.setAutoRequestFocus(false);
        Roof.setBackground(new java.awt.Color(51, 51, 51));
        Roof.setForeground(new java.awt.Color(204, 204, 204));
        Roof.setMinimumSize(new java.awt.Dimension(1426, 761));
        Roof.setResizable(false);
        Roof.setSize(new java.awt.Dimension(1426, 761));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Roof Sheets Estimator (m)");

        gutter.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        gutter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gutter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gutterActionPerformed(evt);
            }
        });

        rafter.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rafter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rafter.setPreferredSize(new java.awt.Dimension(70, 22));
        rafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rafterActionPerformed(evt);
            }
        });

        Calculate.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Roof Width:");

        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Roof length: ");

        jLabel28.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Roof sheet length:");

        jLabel27.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Roof sheet width: ");

        box1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5FT", "6FT", "7FT", "8FT", "9FT", "10FT", "12FT" }));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        box2.setForeground(new java.awt.Color(204, 204, 204));
        box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.8 m", "0.9 m", "1.0 m", "1.2 m" }));
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Corrugation:");

        box3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        box3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.5 Corrugation", "2.5 Corrugation" }));
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Cost Per Sheet:");

        sheetCost.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        sheetCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(box2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(gutter, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(box3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sheetCost)
                            .addComponent(rafter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(140, 140, 140))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(rafter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gutter)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(box1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sheetCost, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel8.setBackground(new java.awt.Color(33, 33, 33));
        jPanel8.setMaximumSize(new java.awt.Dimension(462, 747));
        jPanel8.setMinimumSize(new java.awt.Dimension(462, 747));

        jLabel20.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Calculations");

        jLabel21.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Roof Total Area: ");

        roofArea1.setEditable(false);
        roofArea1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        roofArea1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roofArea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roofArea1ActionPerformed(evt);
            }
        });

        sheets.setEditable(false);
        sheets.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        sheets.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sheets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sheetsActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Sheet Area Need: ");

        jLabel31.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Total Cost:");

        Cost.setEditable(false);
        Cost.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Roof Sheet Area:");

        roofSheetArea.setEditable(false);
        roofSheetArea.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        roofSheetArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roofSheetAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roofArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sheets, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roofSheetArea, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roofArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sheets, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roofSheetArea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(221, 221, 221))
        );

        javax.swing.GroupLayout RoofLayout = new javax.swing.GroupLayout(Roof.getContentPane());
        Roof.getContentPane().setLayout(RoofLayout);
        RoofLayout.setHorizontalGroup(
            RoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoofLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RoofLayout.setVerticalGroup(
            RoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TilesFloor.setMaximumSize(new java.awt.Dimension(1426, 761));
        TilesFloor.setMinimumSize(new java.awt.Dimension(1426, 761));
        TilesFloor.setResizable(false);

        jPanel13.setBackground(new java.awt.Color(33, 33, 33));
        jPanel13.setPreferredSize(new java.awt.Dimension(526, 758));

        jLabel38.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Calculation");

        jLabel39.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Floor Area:");

        jLabel40.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("Tiles needed:");

        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Cost:");

        fArea.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        fArea.setForeground(new java.awt.Color(204, 204, 204));
        fArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tneeded.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tneeded.setForeground(new java.awt.Color(204, 204, 204));
        Tneeded.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tcost.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tcost.setForeground(new java.awt.Color(204, 204, 204));
        Tcost.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tneeded, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tcost))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fArea, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fArea, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(Tneeded))
                .addGap(60, 60, 60)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(Tcost))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));

        jLabel30.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Tile Floor Estimation");

        jLabel33.setBackground(new java.awt.Color(51, 51, 51));
        jLabel33.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Floor Length: ");

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Floor Width: ");

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Tile length: ");

        jLabel36.setBackground(new java.awt.Color(51, 51, 51));
        jLabel36.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Tile width: ");

        jLabel37.setBackground(new java.awt.Color(51, 51, 51));
        jLabel37.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Wastage:");

        Flength.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Flength.setForeground(new java.awt.Color(204, 204, 204));
        Flength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Flength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlengthActionPerformed(evt);
            }
        });

        Fwidth.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Fwidth.setForeground(new java.awt.Color(204, 204, 204));
        Fwidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fwidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FwidthActionPerformed(evt);
            }
        });

        Tlength.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tlength.setForeground(new java.awt.Color(204, 204, 204));
        Tlength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tlength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TlengthActionPerformed(evt);
            }
        });

        Twidth.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Twidth.setForeground(new java.awt.Color(204, 204, 204));
        Twidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Twidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwidthActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        box4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        box4.setForeground(new java.awt.Color(204, 204, 204));
        box4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5%", "10%", "15%", "20%" }));
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Flength)
                            .addComponent(Fwidth, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(Tlength, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(Twidth, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(box4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(140, 140, 140))
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Flength, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fwidth, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tlength, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Twidth, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout TilesFloorLayout = new javax.swing.GroupLayout(TilesFloor.getContentPane());
        TilesFloor.getContentPane().setLayout(TilesFloorLayout);
        TilesFloorLayout.setHorizontalGroup(
            TilesFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TilesFloorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TilesFloorLayout.setVerticalGroup(
            TilesFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcu bitch\n");
        setBackground(new java.awt.Color(19, 44, 89));
        setForeground(new java.awt.Color(20, 33, 35));
        setMinimumSize(new java.awt.Dimension(1475, 838));
        setResizable(false);
        setSize(new java.awt.Dimension(1475, 838));

        components.setBackground(new java.awt.Color(34, 40, 44));
        components.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        components.setMaximumSize(new java.awt.Dimension(100, 100));

        sidePanel.setBackground(new java.awt.Color(19, 25, 30));
        sidePanel.setForeground(new java.awt.Color(12, 12, 12));

        panel1btn.setBackground(new java.awt.Color(102, 102, 102));
        panel1btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        panel1btn.setForeground(new java.awt.Color(204, 204, 204));
        panel1btn.setText("Concrete Hollow Blocks");
        panel1btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panel1btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1btn.setFocusPainted(false);
        panel1btn.setFocusable(false);
        panel1btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel1btnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Roof");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fTiles.setBackground(new java.awt.Color(102, 102, 102));
        fTiles.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        fTiles.setForeground(new java.awt.Color(204, 204, 204));
        fTiles.setText("Floor Tiles");
        fTiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTilesActionPerformed(evt);
            }
        });

        jButton4.setText("jButton1");

        jButton5.setText("jButton1");

        jButton6.setText("jButton1");

        panel2btn.setBackground(new java.awt.Color(102, 102, 102));
        panel2btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        panel2btn.setForeground(new java.awt.Color(204, 204, 204));
        panel2btn.setText("Plywood");
        panel2btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panel2btn.setDefaultCapable(false);
        panel2btn.setFocusPainted(false);
        panel2btn.setFocusable(false);
        panel2btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel2btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTiles, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panel1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(panel2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(fTiles, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(34, 40, 44));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BuildQuantify");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Building Precision, One Calculation at a Time");

        jPanel4.setBackground(new java.awt.Color(20, 30, 31));

        jButton9.setBackground(new java.awt.Color(20, 30, 31));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-bookmark-64.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setRequestFocusEnabled(false);
        jButton9.setRolloverEnabled(false);
        jButton9.setVerifyInputWhenFocusTarget(false);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("README");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(20, 30, 31));

        jButton8.setBackground(new java.awt.Color(20, 30, 31));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-settings-60.png"))); // NOI18N
        jButton8.setToolTipText("");
        jButton8.setBorder(null);
        jButton8.setDefaultCapable(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setRequestFocusEnabled(false);
        jButton8.setRolloverEnabled(false);
        jButton8.setVerifyInputWhenFocusTarget(false);

        jLabel10.setBackground(new java.awt.Color(20, 30, 31));
        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Settings");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(20, 30, 31));

        jButton10.setBackground(new java.awt.Color(20, 30, 31));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-about-60.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setFocusPainted(false);
        jButton10.setFocusable(false);
        jButton10.setRequestFocusEnabled(false);
        jButton10.setRolloverEnabled(false);
        jButton10.setVerifyInputWhenFocusTarget(false);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("About");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(34, 40, 44));

        jPanel1.setBackground(new java.awt.Color(40, 35, 35));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        label1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("Height:");

        label2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(204, 204, 204));
        label2.setText("Width:");

        txtf2.setBackground(new java.awt.Color(204, 204, 204));
        txtf2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtf2.setForeground(new java.awt.Color(102, 102, 102));
        txtf2.setToolTipText("Enter Width by m");
        txtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf2ActionPerformed(evt);
            }
        });

        txtf1.setBackground(new java.awt.Color(204, 204, 204));
        txtf1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtf1.setForeground(new java.awt.Color(102, 102, 102));
        txtf1.setToolTipText("Enter height by m");
        txtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf1ActionPerformed(evt);
            }
        });

        txtf3.setBackground(new java.awt.Color(204, 204, 204));
        txtf3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf3.setEnabled(false);
        txtf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtf3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtf3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtf2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(40, 35, 35));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Length: ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Width:");

        txtf4.setBackground(new java.awt.Color(204, 204, 204));
        txtf4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtf4.setForeground(new java.awt.Color(102, 102, 102));
        txtf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf4.setText("40cm (default)");
        txtf4.setToolTipText("Enter height by m");
        txtf4.setEnabled(false);
        txtf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf4ActionPerformed(evt);
            }
        });

        txtf5.setBackground(new java.awt.Color(204, 204, 204));
        txtf5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtf5.setForeground(new java.awt.Color(102, 102, 102));
        txtf5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf5.setText("20cm (default)");
        txtf5.setToolTipText("Enter height by m");
        txtf5.setEnabled(false);
        txtf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf5ActionPerformed(evt);
            }
        });

        txtf6.setBackground(new java.awt.Color(204, 204, 204));
        txtf6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txtf6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf6.setEnabled(false);
        txtf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Blocks Needed:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtf5, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(txtf4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txtf6))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtf5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        Title1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Title1.setForeground(new java.awt.Color(204, 204, 204));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Wall Caculation");
        Title1.setToolTipText("");

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(102, 102, 102));
        btn1.setText("Calculate!");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        Title2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Title2.setForeground(new java.awt.Color(204, 204, 204));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title2.setText("Concrete Block");
        Title2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(40, 35, 35));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Price each CHB:");
        jLabel3.setToolTipText("");

        totalP.setBackground(new java.awt.Color(204, 204, 204));
        totalP.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        totalP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalP.setEnabled(false);
        totalP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Cost:");

        txtf9.setBackground(new java.awt.Color(204, 204, 204));
        txtf9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf9.setForeground(new java.awt.Color(102, 102, 102));
        txtf9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtf9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(totalP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalP, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        Title3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Title3.setForeground(new java.awt.Color(204, 204, 204));
        Title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title3.setText("Costing");
        Title3.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Concrete Hollow Blocks");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Title3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(30, 40, 44));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Plywood");

        Title4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Title4.setForeground(new java.awt.Color(204, 204, 204));
        Title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title4.setText("Wall Caculation");
        Title4.setToolTipText("");

        plywood.setBackground(new java.awt.Color(204, 204, 204));
        plywood.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        plywood.setForeground(new java.awt.Color(102, 102, 102));
        plywood.setText("Calculate!");
        plywood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plywoodActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(40, 35, 35));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel6.setForeground(new java.awt.Color(204, 204, 204));

        label3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(204, 204, 204));
        label3.setText("Height:");

        label4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(204, 204, 204));
        label4.setText("Width:");

        pTextW.setBackground(new java.awt.Color(204, 204, 204));
        pTextW.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pTextW.setForeground(new java.awt.Color(102, 102, 102));
        pTextW.setToolTipText("Enter Width by m");
        pTextW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTextWActionPerformed(evt);
            }
        });

        pTextH.setBackground(new java.awt.Color(204, 204, 204));
        pTextH.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        pTextH.setForeground(new java.awt.Color(102, 102, 102));
        pTextH.setToolTipText("Enter height by m");
        pTextH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTextHActionPerformed(evt);
            }
        });

        pArea.setBackground(new java.awt.Color(204, 204, 204));
        pArea.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pArea.setEnabled(false);
        pArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAreaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Wall Size in m");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Wall Area");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pTextH, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(pTextW))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pArea, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTextH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pTextW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(pArea, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Title6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Title6.setForeground(new java.awt.Color(204, 204, 204));
        Title6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title6.setText("Plywood Calculation");
        Title6.setToolTipText("");

        jPanel7.setBackground(new java.awt.Color(40, 35, 35));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Length: ");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Width:");

        woodLength.setBackground(new java.awt.Color(204, 204, 204));
        woodLength.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        woodLength.setForeground(new java.awt.Color(102, 102, 102));
        woodLength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        woodLength.setToolTipText("");
        woodLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodLengthActionPerformed(evt);
            }
        });

        woodWidth.setBackground(new java.awt.Color(204, 204, 204));
        woodWidth.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        woodWidth.setForeground(new java.awt.Color(102, 102, 102));
        woodWidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        woodWidth.setToolTipText("");
        woodWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodWidthActionPerformed(evt);
            }
        });

        woodsNeeded.setBackground(new java.awt.Color(204, 204, 204));
        woodsNeeded.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        woodsNeeded.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        woodsNeeded.setEnabled(false);
        woodsNeeded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodsNeededActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Plywood Sheets Needed");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Plywood Size in FT");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(woodWidth, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(woodLength)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(woodsNeeded)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(woodLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(woodWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(woodsNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Title7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Title7.setForeground(new java.awt.Color(204, 204, 204));
        Title7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title7.setText("Plywood Cost");
        Title7.setToolTipText("");

        jPanel11.setBackground(new java.awt.Color(40, 35, 35));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Plywood Price");

        woodCost.setBackground(new java.awt.Color(204, 204, 204));
        woodCost.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        woodCost.setForeground(new java.awt.Color(102, 102, 102));
        woodCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        woodCost.setToolTipText("");
        woodCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodCostActionPerformed(evt);
            }
        });

        woodCosts.setBackground(new java.awt.Color(204, 204, 204));
        woodCosts.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        woodCosts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        woodCosts.setEnabled(false);
        woodCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodCostsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(woodCost, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(woodCosts)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(woodCosts, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(woodCost, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plywood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(Title4, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Title6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Title7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plywood, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(Title4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(742, Short.MAX_VALUE)))
        );

        modelPanel.setBackground(new java.awt.Color(34, 40, 44));

        javax.swing.GroupLayout modelPanelLayout = new javax.swing.GroupLayout(modelPanel);
        modelPanel.setLayout(modelPanelLayout);
        modelPanelLayout.setHorizontalGroup(
            modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        modelPanelLayout.setVerticalGroup(
            modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout componentsLayout = new javax.swing.GroupLayout(components);
        components.setLayout(componentsLayout);
        componentsLayout.setHorizontalGroup(
            componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentsLayout.createSequentialGroup()
                    .addContainerGap(1554, Short.MAX_VALUE)
                    .addComponent(modelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)))
            .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(componentsLayout.createSequentialGroup()
                    .addGap(371, 371, 371)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1052, Short.MAX_VALUE)))
        );
        componentsLayout.setVerticalGroup(
            componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(componentsLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(componentsLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(modelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
            .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(componentsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(components, javax.swing.GroupLayout.DEFAULT_SIZE, 1469, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(components, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void woodCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_woodCostsActionPerformed

    private void woodCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_woodCostActionPerformed

    private void woodsNeededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodsNeededActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_woodsNeededActionPerformed

    private void woodWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_woodWidthActionPerformed

    private void woodLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_woodLengthActionPerformed

    private void pAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAreaActionPerformed

    private void pTextHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTextHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTextHActionPerformed

    private void pTextWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTextWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTextWActionPerformed

    private void plywoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plywoodActionPerformed
        function2();
    }//GEN-LAST:event_plywoodActionPerformed

    private void totalPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        function1();
    }//GEN-LAST:event_btn1ActionPerformed

    private void txtf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf6ActionPerformed

    private void txtf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf5ActionPerformed

    private void txtf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf4ActionPerformed

    private void txtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf3ActionPerformed

    }//GEN-LAST:event_txtf3ActionPerformed

    private void txtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf1ActionPerformed

    }//GEN-LAST:event_txtf1ActionPerformed

    private void txtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf2ActionPerformed

    }//GEN-LAST:event_txtf2ActionPerformed

    private void panel2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel2btnActionPerformed
        modelPanel.setVisible(true);
        panel2.setVisible(true);
        panel1.setVisible(false);
        mainPanel.setVisible(false);
        TilesFloor.setVisible(false);
    }//GEN-LAST:event_panel2btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel1.setVisible(false);
        modelPanel.setVisible(false);
        mainPanel.setVisible(false);
        panel2.setVisible(false);
        Roof.setVisible(true);
        TilesFloor.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void panel1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel1btnActionPerformed
        panel1.setVisible(true);
        modelPanel.setVisible(true);
        mainPanel.setVisible(false);
        panel2.setVisible(false);
        TilesFloor.setVisible(false);
    }//GEN-LAST:event_panel1btnActionPerformed

    private void fTilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTilesActionPerformed
        TilesFloor.setVisible(true);
        panel1.setVisible(false);
        modelPanel.setVisible(false);
        mainPanel.setVisible(false);
        panel2.setVisible(false);
    }//GEN-LAST:event_fTilesActionPerformed

    private void rafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rafterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rafterActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // Assuming box1 is your JComboBox<String>
        Object selectedObject = box1.getSelectedItem();

        // Check if an item is selected
        if (selectedObject != null) {
        // Convert the selected item to a String
        String selectedValue = selectedObject.toString();

        // Extract the numeric part (remove "FT" and any other non-numeric characters)
        numericPart = selectedValue.replaceAll("[^\\d]", "");

        // Convert the numeric part to an int
        try {
            int intValue = Integer.parseInt(numericPart);

        // Now you have the integer value
        System.out.println("Selected Value as Integer: " + intValue);
        } catch (NumberFormatException e) {
        // Handle the case where the selected value is not a valid integer
        System.err.println("Error: Selected value is not a valid integer");
        }
        } else {
            // Handle the case where no item is selected
            System.err.println("Error: No item selected");
}

    }//GEN-LAST:event_box1ActionPerformed

    private void gutterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gutterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gutterActionPerformed

    private void roofArea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roofArea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roofArea1ActionPerformed

    private void sheetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sheetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sheetsActionPerformed

    private void CostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostActionPerformed

    private void roofSheetAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roofSheetAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roofSheetAreaActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
       // Assuming box2 is your JComboBox<String>
        Object selectedObjectBox2 = box2.getSelectedItem();

        // Check if an item is selected
        if (selectedObjectBox2 != null) {
         // Convert the selected item to a String
            String selectedValueBox2 = selectedObjectBox2.toString();

         // Extract the numeric part (remove " m" and any other non-numeric characters)
         numericPartBox2 = selectedValueBox2.replaceAll("[^\\d.]", "");

            // Convert the numeric part to a double
                try {
            double doubleValueBox2 = Double.parseDouble(numericPartBox2);

                // Now you have the double value
                System.out.println("Selected Value from box2 as Double: " + doubleValueBox2);
            } catch (NumberFormatException e) {
                // Handle the case where the selected value is not a valid double
                System.err.println("Error: Selected value from box2 is not a valid double");
            }
        } else {
            // Handle the case where no item is selected
            System.err.println("Error: No item selected in box2");
        }

    }//GEN-LAST:event_box2ActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        float roofWidth = Float.parseFloat(rafter.getText());
        float roofLength = Float.parseFloat(gutter.getText());
        int sheetLength = Integer.parseInt(numericPart);
        double sheetWidth = Double.parseDouble(numericPartBox2);
        double corrugation = Double.parseDouble(numericPartBox3);
        float costing = Float.parseFloat(sheetCost.getText());

        float roofArea = roofWidth * roofLength;
        double effectiveWidth = sheetWidth / corrugation;
        double sheetLengthtoM = sheetLength * 0.3048;
        double totalSheetArea = effectiveWidth * sheetLengthtoM;
        double sheetsNeeded = roofArea / totalSheetArea;
        int roundedupSheets = (int) Math.round(sheetsNeeded);

        double totalCost = roundedupSheets * costing;

        roofArea1.setText(String.valueOf(roofArea + "m"));
        sheets.setText(String.valueOf(roundedupSheets + " Sheets"));
        roofSheetArea.setText(String.valueOf(totalSheetArea + "m"));
        Cost.setText(String.valueOf(totalCost));
    }//GEN-LAST:event_CalculateActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        // Assuming box2 is your JComboBox<String>
        Object selectedObjectBox3 = box3.getSelectedItem();

        // Check if an item is selected
        if (selectedObjectBox3 != null) {
            // Convert the selected item to a String
            String selectedValueBox3 = selectedObjectBox3.toString();

            // Extract the numeric part (remove any non-numeric characters except for dots)
            numericPartBox3 = selectedValueBox3.replaceAll("[^\\d.]", "");

            // Ensure only one dot in the numeric part
            if (numericPartBox3.matches(".*\\..*\\..*")) {
                System.err.println("Error: Invalid format in box2");
            } else {
                // Convert the numeric part to a double
                try {
                    double doubleValueBox3 = Double.parseDouble(numericPartBox3);

                    // Now you have the double value
                    System.out.println("Selected Value from box2 as Double: " + doubleValueBox3);
                } catch (NumberFormatException e) {
                    // Handle the case where the selected value is not a valid double
                    System.err.println("Error: Selected value from box2 is not a valid double");
                }
            }
        } else {
            // Handle the case where no item is selected
            System.err.println("Error: No item selected in box2");
        }

    }//GEN-LAST:event_box3ActionPerformed

    private void FlengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlengthActionPerformed

    private void FwidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FwidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FwidthActionPerformed

    private void TlengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TlengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TlengthActionPerformed

    private void TwidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TwidthActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
             // Assuming box3 is your JComboBox<String>
            Object selectedObjectBox4 = box4.getSelectedItem();

            // Check if an item is selected
            if (selectedObjectBox4 != null) {
                // Convert the selected item to a String
                String selectedValueBox4 = selectedObjectBox4.toString();

                // Extract the numeric part (remove any non-numeric characters except for dots)
                wastage = selectedValueBox4.replaceAll("[^\\d.]", "");

                // Ensure only one dot in the numeric part
                if (wastage.matches(".*\\..*\\..*")) {
                    System.err.println("Error: Invalid format in box2");
                } else {
                    // Convert the numeric part to a double
                    try {
                        double doubleValueBox4 = Double.parseDouble(wastage);

                        // Convert percentage to decimal (divide by 100)
                        double decimalValueBox4 = doubleValueBox4 / 100.0;

                        // Now you have the decimal value
                        System.out.println("Selected Value from box3 as Decimal: " + decimalValueBox4);
                    } catch (NumberFormatException e) {
                        // Handle the case where the selected value is not a valid double
                        System.err.println("Error: Selected value from box3 is not a valid double");
                    }
                }
            } else {
                // Handle the case where no item is selected
                System.err.println("Error: No item selected in box3");
            }


    }//GEN-LAST:event_box4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float floorLength = Float.parseFloat(Flength.getText());
        float floorWidth = Float.parseFloat(Fwidth.getText());
        float TileLength = Float.parseFloat(Tlength.getText());
        float TileWidth = Float.parseFloat(Twidth.getText());
        double waste = Double.parseDouble(wastage);
        
        float fARea = floorLength * floorWidth;
        float tARea = TileLength * TileWidth;
        float tNeed = fARea/tARea;
        double totalNeed = (waste/100) * tNeed;
        int roundUptotalNeed = (int) Math.round(totalNeed);
        
        fArea.setText(String.valueOf(fARea));
        Tneeded.setText(String.valueOf(roundUptotalNeed));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcu().setVisible(true);
            }
        });
    }
    public void panels(){
        panel1.setVisible(false);
        panel2.setVisible(false);
        mainPanel.setVisible(true);
        Roof.setVisible(false);
    }
    
    public void function1 (){
        
        // Assuming txtf1 and txtf2 contain the width and height in meters, not inches
         float width = Float.parseFloat(txtf1.getText());
         float height = Float.parseFloat(txtf2.getText());

        // Define the conversion factor for meters to centimeters
        int meterToCm = 100;

        // Calculate the wall area in square meters
        float result = 0;

        if (width > 0 && height > 0) {
            result = width * height;
        }

        // Convert the dimensions to centimeters
        int cmWidth = (int) (width * meterToCm);
        int cmHeight = (int) (height * meterToCm);

        // Define the dimensions of a brick in centimeters
        int brickLength = 40;
        int brickWidth = 20;

        // Calculate the number of bricks required
        int result1 = (cmWidth * cmHeight) / (brickLength * brickWidth);

        // Assuming txtf9 contains the cost per brick
        int costPerBrick = Integer.parseInt(txtf9.getText());

        // Calculate the total cost
        int total = costPerBrick * result1;

        // Update the text field with the number of bricks
        txtf6.setText(String.valueOf(result1));

        // Update the text field with the total cost
        totalP.setText(String.valueOf(total));

        // Display the wall area with proper units
        txtf3.setText("Wall Area = " + result + " m²");
}
    
    
    
    
    
    public void function2() {
    try {
        // Get the wall dimensions in meters
        float pHeight = Float.parseFloat(pTextH.getText());
        float pWidth = Float.parseFloat(pTextW.getText());

        // Calculate the wall area in square meters
        float pResult = 0;

        if (pHeight > 0 && pWidth > 0) {
            pResult = pHeight * pWidth;

            // Display wall area in square meters
            pArea.setText(String.valueOf(pResult + "m²"));

            // Get the plywood dimensions in meters
            float woodL = Float.parseFloat(woodLength.getText()) * 0.3048f;
            float woodW = Float.parseFloat(woodWidth.getText()) * 0.3048f;

            // Calculate the area of one plywood sheet in square meters
            float plySheetArea = woodL * woodW;

            // Calculate the number of plywood sheets needed
            int sheetsNeeded = (int) Math.ceil(pResult / plySheetArea);

            // Display the number of sheets needed
            woodsNeeded.setText(String.valueOf(sheetsNeeded));

            // Get the cost per sheet of plywood
            float woodPrice = Float.parseFloat(woodCost.getText());

            // Calculate the total cost
            int plyPrice = (int) (woodPrice * sheetsNeeded);

            // Display the total cost
            woodCosts.setText(String.valueOf(plyPrice));
        }
    } catch (NumberFormatException e) {
        // Handle parsing errors here (e.g., display an error message to the user)
    }
}
    
    
    
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField Cost;
    private javax.swing.JTextField Flength;
    private javax.swing.JTextField Fwidth;
    private javax.swing.JFrame Roof;
    private javax.swing.JTextField Tcost;
    private javax.swing.JFrame TilesFloor;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JTextField Tlength;
    private javax.swing.JTextField Tneeded;
    private javax.swing.JTextField Twidth;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box2;
    private javax.swing.JComboBox<String> box3;
    private javax.swing.JComboBox<String> box4;
    private javax.swing.JButton btn1;
    private javax.swing.JPanel components;
    private javax.swing.JTextField fArea;
    private javax.swing.JButton fTiles;
    private javax.swing.JTextField gutter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel modelPanel;
    private javax.swing.JTextField pArea;
    private javax.swing.JTextField pTextH;
    private javax.swing.JTextField pTextW;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton panel1btn;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton panel2btn;
    private javax.swing.JButton plywood;
    private javax.swing.JTextField rafter;
    private javax.swing.JTextField roofArea1;
    private javax.swing.JTextField roofSheetArea;
    private javax.swing.JTextField sheetCost;
    private javax.swing.JTextField sheets;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField totalP;
    private javax.swing.JTextField txtf1;
    private javax.swing.JTextField txtf2;
    private javax.swing.JTextField txtf3;
    private javax.swing.JTextField txtf4;
    private javax.swing.JTextField txtf5;
    private javax.swing.JTextField txtf6;
    private javax.swing.JTextField txtf9;
    private javax.swing.JTextField woodCost;
    private javax.swing.JTextField woodCosts;
    private javax.swing.JTextField woodLength;
    private javax.swing.JTextField woodWidth;
    private javax.swing.JTextField woodsNeeded;
    // End of variables declaration//GEN-END:variables

    private void getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
