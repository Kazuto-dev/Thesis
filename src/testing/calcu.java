/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.awt.Color;
import java.awt.List;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;
import java.security.GeneralSecurityException;

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
    String CHBWastages; 
    String CHBWastages1;
    double decimalPart;
    double decimalValueTileWallWastage;
    double decimalValueBox4;
    double decimalPart1;
    
    //Excel Columns variables
    String CHB = "Concrete Hollow Blocks";
    int overallBricksRequired;
    float wallArea;
    
    
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
        jLabel37 = new javax.swing.JLabel();
        Flength = new javax.swing.JTextField();
        Fwidth = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        box4 = new javax.swing.JComboBox<>();
        costPerTile = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        TileSizes = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        TilesWall = new javax.swing.JFrame();
        jPanel15 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        fArea1 = new javax.swing.JTextField();
        Tneeded1 = new javax.swing.JTextField();
        Tcost1 = new javax.swing.JTextField();
        Tcost2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Rlength1 = new javax.swing.JTextField();
        Rwidth1 = new javax.swing.JTextField();
        Rheight1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        TileWallWastage = new javax.swing.JComboBox<>();
        TILESize = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        CHBpanel = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtf3 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtf6 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtf2 = new javax.swing.JTextField();
        txtf1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CHBWastage = new javax.swing.JComboBox<>();
        paint = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtf7 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtf8 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtf9 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        CHBWastage1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtf4 = new javax.swing.JTextField();
        txtf5 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Plywood = new javax.swing.JFrame();
        jPanel17 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        woodCost = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        woodCosts = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        woodsNeeded = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        pArea = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        WoodWidth = new javax.swing.JTextField();
        WoodLength = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        pTextW = new javax.swing.JTextField();
        pTextL = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        doorDoorjambs = new javax.swing.JFrame();
        jPanel19 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtf18 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        txtf20 = new javax.swing.JTextField();
        CHBWastage3 = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        StructuralFrame = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Floortilesbtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        gotoCHB = new javax.swing.JButton();
        electricalFrame = new javax.swing.JFrame();
        jPanel21 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        plumbingFrame = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();
        jButton52 = new javax.swing.JButton();
        ArchitecturalFrame = new javax.swing.JFrame();
        jPanel22 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        AboutFrame = new javax.swing.JFrame();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel115 = new javax.swing.JLabel();
        jButton45 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        lightBulb = new javax.swing.JFrame();
        jPanel23 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        fArea2 = new javax.swing.JTextField();
        Tneeded2 = new javax.swing.JTextField();
        Tcost3 = new javax.swing.JTextField();
        Tcost4 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        costPerTile1 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        TileSizes3 = new javax.swing.JComboBox<>();
        TileSizes4 = new javax.swing.JComboBox<>();
        costPerTile2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        costPerTile3 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        sucket = new javax.swing.JFrame();
        jPanel25 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        txtf21 = new javax.swing.JTextField();
        CHBWastage4 = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jLabel109 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        txtf19 = new javax.swing.JTextField();
        faucet = new javax.swing.JFrame();
        jPanel27 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        txtf22 = new javax.swing.JTextField();
        CHBWastage5 = new javax.swing.JComboBox<>();
        jPanel28 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        txtf23 = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        structuralBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
        fArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tneeded.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
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
        jLabel35.setText("Tile Size:");

        jLabel37.setBackground(new java.awt.Color(51, 51, 51));
        jLabel37.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Wastage:");

        Flength.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Flength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Flength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlengthActionPerformed(evt);
            }
        });

        Fwidth.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Fwidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fwidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FwidthActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton1.setText("Insert Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        box4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        box4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5%", "10%", "15%", "20%" }));
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });

        costPerTile.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        costPerTile.setForeground(new java.awt.Color(204, 204, 204));
        costPerTile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costPerTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPerTileActionPerformed(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(51, 51, 51));
        jLabel42.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("Cost per Tile:");

        TileSizes.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TileSizes.setForeground(new java.awt.Color(51, 51, 51));
        TileSizes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2\"x2\" = 0.0508 m", "4\"x4\" = 0.1016 m", "6\"x6\" = 0.1524 m", "8\"x8\" = 0.2032 m", "12\"x12\" = 0.3048 m", "16\"x16\" = 0.4064 m", "18\"x18\" = 0.4572 m", "24\"x24\" = 0.6096 m" }));
        TileSizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TileSizesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(Fwidth, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TileSizes, javax.swing.GroupLayout.Alignment.TRAILING, 0, 394, Short.MAX_VALUE)
                            .addComponent(Flength)
                            .addComponent(box4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(costPerTile))))
                .addGap(140, 140, 140))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Flength, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fwidth, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TileSizes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(costPerTile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        Flength.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TileFloorEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TileFloorEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        Fwidth.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TileFloorEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TileFloorEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        box4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TileFloorEstimator();
            }
        });
        TileSizes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TileFloorEstimator();
            }
        });

        javax.swing.GroupLayout TilesFloorLayout = new javax.swing.GroupLayout(TilesFloor.getContentPane());
        TilesFloor.getContentPane().setLayout(TilesFloorLayout);
        TilesFloorLayout.setHorizontalGroup(
            TilesFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TilesFloorLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TilesFloorLayout.setVerticalGroup(
            TilesFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TilesWall.setMinimumSize(new java.awt.Dimension(1426, 761));
        TilesWall.setResizable(false);

        jPanel15.setBackground(new java.awt.Color(33, 33, 33));
        jPanel15.setPreferredSize(new java.awt.Dimension(526, 758));

        jLabel43.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Calculation");

        jLabel44.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Floor Area:");

        jLabel45.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("Tiles needed:");

        jLabel46.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("Cost:");

        fArea1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        fArea1.setForeground(new java.awt.Color(204, 204, 204));
        fArea1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tneeded1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tneeded1.setForeground(new java.awt.Color(204, 204, 204));
        Tneeded1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tcost1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tcost1.setForeground(new java.awt.Color(204, 204, 204));
        Tcost1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tcost2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tcost2.setForeground(new java.awt.Color(204, 204, 204));
        Tcost2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel54.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("Cost per Tile:");

        jButton7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("Calculate");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tneeded1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tcost1))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tcost2))
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tneeded1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tcost2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tcost1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));

        jLabel47.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Tile Wall Estimation");

        jLabel48.setBackground(new java.awt.Color(51, 51, 51));
        jLabel48.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Room Length: ");

        jLabel49.setBackground(new java.awt.Color(51, 51, 51));
        jLabel49.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setText("Room Width: ");

        jLabel50.setBackground(new java.awt.Color(51, 51, 51));
        jLabel50.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("Room Height: ");

        jLabel51.setBackground(new java.awt.Color(51, 51, 51));
        jLabel51.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("Tile Size: ");

        jLabel52.setBackground(new java.awt.Color(51, 51, 51));
        jLabel52.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Wastage:");

        Rlength1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Rlength1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Rlength1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rlength1ActionPerformed(evt);
            }
        });

        Rwidth1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Rwidth1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Rwidth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rwidth1ActionPerformed(evt);
            }
        });

        Rheight1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Rheight1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Rheight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rheight1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton3.setText("Insert Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TileWallWastage.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TileWallWastage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5%", "10%", "15%", "20%" }));
        TileWallWastage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TileWallWastageActionPerformed(evt);
            }
        });

        TILESize.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TILESize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2\"x2\" = 0.0508 m", "4\"x4\" = 0.1016 m", "6\"x6\" = 0.1524 m", "8\"x8\" = 0.2032 m", "12\"x12\" = 0.3048 m", "16\"x16\" = 0.4064 m", "18\"x18\" = 0.4572 m", "24\"x24\" = 0.6096 m" }));
        TILESize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TILESizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rwidth1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(Rheight1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(TileWallWastage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Rlength1)
                            .addComponent(TILESize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(143, 143, 143))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rlength1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rwidth1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rheight1)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(TILESize))
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TileWallWastage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rlength1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TileWallEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TileWallEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        Rwidth1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TileWallEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TileWallEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        Rheight1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TileWallEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TileWallEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        TileWallWastage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TileFloorEstimator();
            }
        });
        TILESize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TileFloorEstimator();
            }
        });

        javax.swing.GroupLayout TilesWallLayout = new javax.swing.GroupLayout(TilesWall.getContentPane());
        TilesWall.getContentPane().setLayout(TilesWallLayout);
        TilesWallLayout.setHorizontalGroup(
            TilesWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TilesWallLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TilesWallLayout.setVerticalGroup(
            TilesWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CHBpanel.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        CHBpanel.setBackground(new java.awt.Color(51, 51, 51));
        CHBpanel.setMinimumSize(new java.awt.Dimension(1402, 732));
        CHBpanel.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Calculation");

        jLabel56.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 204, 204));
        jLabel56.setText("Wall Size:");

        txtf3.setEditable(false);
        txtf3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf3ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 204, 204));
        jLabel57.setText("CHB Need:");

        txtf6.setEditable(false);
        txtf6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel58.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setText("Cost per piece:");

        jTextField7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setCaretColor(new java.awt.Color(204, 204, 204));

        jLabel59.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setText("Total Cost:");

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton12.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(204, 204, 204));
        jButton12.setText("Calculate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Concrete Hollow Blocks");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Wall Height: ");

        jButton11.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton11.setText("Insert (Excel)");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0.4m (40cm) Default");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0.2m (20cm) Default");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        txtf2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf2ActionPerformed(evt);
            }
        });

        txtf1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtf1InputMethodTextChanged(evt);
            }
        });
        txtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("CHB Height: ");

        jLabel55.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setText("CHB Width: ");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Wall Width: ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Wastage:");

        CHBWastage.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CHBWastage.setForeground(new java.awt.Color(204, 204, 204));
        CHBWastage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5%", "10%", "15%", "20%" }));
        CHBWastage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHBWastageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(CHBWastage, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(143, 143, 143))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(872, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHBWastage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator3)
                    .addContainerGap()))
        );

        txtf2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator(); // Assuming you have a calculateResult() method
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        txtf1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        CHBWastage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CHBEstimator();
            }
        });

        javax.swing.GroupLayout CHBpanelLayout = new javax.swing.GroupLayout(CHBpanel.getContentPane());
        CHBpanel.getContentPane().setLayout(CHBpanelLayout);
        CHBpanelLayout.setHorizontalGroup(
            CHBpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CHBpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CHBpanelLayout.setVerticalGroup(
            CHBpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        paint.setMinimumSize(new java.awt.Dimension(1402, 734));
        paint.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(33, 33, 33));

        jLabel64.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 204, 204));
        jLabel64.setText("Price per liter:");

        jTextField9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setCaretColor(new java.awt.Color(204, 204, 204));

        jLabel65.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 204, 204));
        jLabel65.setText("Total Cost:");

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton14.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(204, 204, 204));
        jButton14.setText("Calculate");

        jLabel66.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(204, 204, 204));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Calculation");

        jLabel67.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(204, 204, 204));
        jLabel67.setText("No. of Coats:");

        txtf7.setEditable(false);
        txtf7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf7ActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(204, 204, 204));
        jLabel68.setText("Paint Need:");

        txtf8.setEditable(false);
        txtf8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel69.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(204, 204, 204));
        jLabel69.setText("Paint Coverage:");

        txtf9.setEditable(false);
        txtf9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtf7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        CHBWastage1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CHBWastage1.setForeground(new java.awt.Color(204, 204, 204));
        CHBWastage1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5%", "10%", "15%", "20%" }));
        CHBWastage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHBWastage1ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Wall Height: ");

        jButton13.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(204, 204, 204));
        jButton13.setText("Insert");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0.4m (40cm) Default");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0.2m (20cm) Default");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        txtf4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf4ActionPerformed(evt);
            }
        });

        txtf5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtf5InputMethodTextChanged(evt);
            }
        });
        txtf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf5ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("CHB Height: ");

        jLabel60.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 204, 204));
        jLabel60.setText("CHB Width: ");

        jLabel61.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 204, 204));
        jLabel61.setText("Wall Width: ");

        jLabel62.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 204, 204));
        jLabel62.setText("Wastage:");

        jLabel63.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 204, 204));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Paint Calculator");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtf4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtf5, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField4)
                                        .addComponent(CHBWastage1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(137, 137, 137))
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(3, 3, 3)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtf5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtf4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CHBWastage1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        CHBWastage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CHBEstimator();
            }
        });
        txtf2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator(); // Assuming you have a calculateResult() method
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        txtf1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });

        javax.swing.GroupLayout paintLayout = new javax.swing.GroupLayout(paint.getContentPane());
        paint.getContentPane().setLayout(paintLayout);
        paintLayout.setHorizontalGroup(
            paintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paintLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        paintLayout.setVerticalGroup(
            paintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paintLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4)
                .addContainerGap())
        );

        Plywood.setMinimumSize(new java.awt.Dimension(1418, 735));

        jPanel17.setBackground(new java.awt.Color(33, 33, 33));

        jLabel70.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(204, 204, 204));
        jLabel70.setText("Price per sheet:");

        woodCost.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        woodCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        woodCost.setCaretColor(new java.awt.Color(204, 204, 204));

        jLabel71.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 204, 204));
        jLabel71.setText("Total Cost:");

        woodCosts.setEditable(false);
        woodCosts.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        woodCosts.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton15.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton15.setText("Calculate");

        jLabel72.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(204, 204, 204));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Calculation");

        jLabel74.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(204, 204, 204));
        jLabel74.setText("Sheets Need:");

        woodsNeeded.setEditable(false);
        woodsNeeded.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        woodsNeeded.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel75.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 204, 204));
        jLabel75.setText("Wall Area:");

        pArea.setEditable(false);
        pArea.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(woodsNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pArea, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(woodCost, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(woodCosts, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pArea, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(woodsNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(woodCost, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(woodCosts, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));

        jLabel81.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(204, 204, 204));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Plywood Calculator");

        jLabel76.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 204, 204));
        jLabel76.setText("Wall Width: ");

        jLabel78.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(204, 204, 204));
        jLabel78.setText("Wall Length: ");

        jButton17.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton17.setText("Insert (Excel)");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        WoodWidth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        WoodWidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WoodWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WoodWidthActionPerformed(evt);
            }
        });

        WoodLength.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        WoodLength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WoodLength.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                WoodLengthInputMethodTextChanged(evt);
            }
        });
        WoodLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WoodLengthActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(204, 204, 204));
        jLabel79.setText("Plywood Length: ");

        jLabel80.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(204, 204, 204));
        jLabel80.setText("Plywood Width: ");

        pTextW.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pTextW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pTextW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTextWActionPerformed(evt);
            }
        });

        pTextL.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pTextL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pTextL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTextLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(WoodWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WoodLength, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pTextW, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WoodLength, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WoodWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTextW, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(618, Short.MAX_VALUE)))
        );

        txtf2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator(); // Assuming you have a calculateResult() method
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        txtf1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        txtf2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator(); // Assuming you have a calculateResult() method
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        txtf2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator(); // Assuming you have a calculateResult() method
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });

        javax.swing.GroupLayout PlywoodLayout = new javax.swing.GroupLayout(Plywood.getContentPane());
        Plywood.getContentPane().setLayout(PlywoodLayout);
        PlywoodLayout.setHorizontalGroup(
            PlywoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1418, Short.MAX_VALUE)
            .addGroup(PlywoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PlywoodLayout.createSequentialGroup()
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PlywoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PlywoodLayout.createSequentialGroup()
                    .addGap(707, 707, 707)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(711, Short.MAX_VALUE)))
        );
        PlywoodLayout.setVerticalGroup(
            PlywoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(PlywoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PlywoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PlywoodLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jSeparator5)
                    .addGap(12, 12, 12)))
        );

        jPanel19.setBackground(new java.awt.Color(33, 33, 33));

        jLabel73.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(204, 204, 204));
        jLabel73.setText("Price per door:");

        jTextField13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setCaretColor(new java.awt.Color(204, 204, 204));

        jLabel82.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(204, 204, 204));
        jLabel82.setText("Total Cost:");

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton18.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(204, 204, 204));
        jButton18.setText("Calculate");

        jLabel83.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(204, 204, 204));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Calculation");

        jLabel85.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 204, 204));
        jLabel85.setText("Door need:");

        txtf18.setEditable(false);
        txtf18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));

        jLabel86.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(204, 204, 204));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Door's & Door Jambs Calculator");

        jLabel87.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(204, 204, 204));
        jLabel87.setText("Quantity: ");

        jLabel88.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(204, 204, 204));
        jLabel88.setText("Door size: ");

        jButton19.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(204, 204, 204));
        jButton19.setText("Insert");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        txtf20.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf20.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtf20InputMethodTextChanged(evt);
            }
        });
        txtf20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf20ActionPerformed(evt);
            }
        });

        CHBWastage3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CHBWastage3.setForeground(new java.awt.Color(204, 204, 204));
        CHBWastage3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2.10 x 80 (Bedroom)", "2.10 x 90 (Main Door)", "2.10 x 60 (CR)", "2.10 x 70 (Service Area", "Exit Door)" }));
        CHBWastage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHBWastage3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf20, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CHBWastage3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHBWastage3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(617, Short.MAX_VALUE)))
        );

        txtf1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        CHBWastage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CHBEstimator();
            }
        });

        javax.swing.GroupLayout doorDoorjambsLayout = new javax.swing.GroupLayout(doorDoorjambs.getContentPane());
        doorDoorjambs.getContentPane().setLayout(doorDoorjambsLayout);
        doorDoorjambsLayout.setHorizontalGroup(
            doorDoorjambsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1414, Short.MAX_VALUE)
            .addGroup(doorDoorjambsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(doorDoorjambsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(doorDoorjambsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(doorDoorjambsLayout.createSequentialGroup()
                    .addGap(707, 707, 707)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(707, Short.MAX_VALUE)))
        );
        doorDoorjambsLayout.setVerticalGroup(
            doorDoorjambsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(doorDoorjambsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(doorDoorjambsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(doorDoorjambsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
            .addGroup(doorDoorjambsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(doorDoorjambsLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jSeparator6)
                    .addGap(12, 12, 12)))
        );

        StructuralFrame.setAutoRequestFocus(false);
        StructuralFrame.setBackground(new java.awt.Color(51, 51, 51));
        StructuralFrame.setFocusable(false);
        StructuralFrame.setMinimumSize(new java.awt.Dimension(900, 700));
        StructuralFrame.setResizable(false);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setMaximumSize(new java.awt.Dimension(900, 700));
        jPanel7.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel7.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Structural Materials");

        Floortilesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-floor-tiles-100.png"))); // NOI18N
        Floortilesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FloortilesbtnActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-ceramic-tiles-100.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jandell\\Downloads\\icons8-plywood-64.png")); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Concrete Hollow Blocks");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Floor Tiles");
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Wall TIles");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Plywood");
        jLabel17.setToolTipText("");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        gotoCHB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-code-blocks-60.png"))); // NOI18N
        gotoCHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoCHBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Floortilesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gotoCHB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
                            .addGap(164, 164, 164))
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gotoCHB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Floortilesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(130, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout StructuralFrameLayout = new javax.swing.GroupLayout(StructuralFrame.getContentPane());
        StructuralFrame.getContentPane().setLayout(StructuralFrameLayout);
        StructuralFrameLayout.setHorizontalGroup(
            StructuralFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StructuralFrameLayout.setVerticalGroup(
            StructuralFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        electricalFrame.setMinimumSize(new java.awt.Dimension(900, 700));

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));

        jLabel100.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(204, 204, 204));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Socket");
        jLabel100.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel101.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(204, 204, 204));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("Empty");
        jLabel101.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel102.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(204, 204, 204));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Empty");
        jLabel102.setToolTipText("");
        jLabel102.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel103.setFont(new java.awt.Font("Arial Black", 0, 32)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(204, 204, 204));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Electrical Materials");

        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(204, 204, 204));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("Light");
        jLabel104.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1414, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE))
                            .addGap(164, 164, 164))
                        .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(163, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout electricalFrameLayout = new javax.swing.GroupLayout(electricalFrame.getContentPane());
        electricalFrame.getContentPane().setLayout(electricalFrameLayout);
        electricalFrameLayout.setHorizontalGroup(
            electricalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        electricalFrameLayout.setVerticalGroup(
            electricalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        plumbingFrame.setMinimumSize(new java.awt.Dimension(900, 700));
        plumbingFrame.setResizable(false);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setMaximumSize(new java.awt.Dimension(900, 700));
        jPanel6.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel6.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel116.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(204, 204, 204));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Faucet");
        jLabel116.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel117.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(204, 204, 204));
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("Empty");
        jLabel117.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel118.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(204, 204, 204));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("Empty");
        jLabel118.setToolTipText("");
        jLabel118.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel119.setFont(new java.awt.Font("Arial Black", 0, 32)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(204, 204, 204));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("Plumbing Materials");

        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jLabel120.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(204, 204, 204));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("Sink");
        jLabel120.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton50, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                .addGap(164, 164, 164))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton51, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout plumbingFrameLayout = new javax.swing.GroupLayout(plumbingFrame.getContentPane());
        plumbingFrame.getContentPane().setLayout(plumbingFrameLayout);
        plumbingFrameLayout.setHorizontalGroup(
            plumbingFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plumbingFrameLayout.setVerticalGroup(
            plumbingFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ArchitecturalFrame.setMinimumSize(new java.awt.Dimension(900, 700));

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setMaximumSize(new java.awt.Dimension(900, 700));
        jPanel22.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel22.setPreferredSize(new java.awt.Dimension(900, 700));

        jButton41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jandell\\Downloads\\icons8-paint-bucket-64.png")); // NOI18N

        jLabel110.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(204, 204, 204));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("empty");
        jLabel110.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel111.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(204, 204, 204));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("empty");
        jLabel111.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel112.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(204, 204, 204));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("empty");
        jLabel112.setToolTipText("");
        jLabel112.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel113.setFont(new java.awt.Font("Arial Black", 0, 32)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("Architectural Materials");

        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(204, 204, 204));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("Paint");
        jLabel114.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(170, 170, 170))
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                            .addGap(164, 164, 164))
                        .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(139, 139, 139)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(158, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ArchitecturalFrameLayout = new javax.swing.GroupLayout(ArchitecturalFrame.getContentPane());
        ArchitecturalFrame.getContentPane().setLayout(ArchitecturalFrameLayout);
        ArchitecturalFrameLayout.setHorizontalGroup(
            ArchitecturalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ArchitecturalFrameLayout.setVerticalGroup(
            ArchitecturalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel115.setFont(new java.awt.Font("Arial Black", 0, 32)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(204, 204, 204));
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("About Us");

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("This application meant to help everyone to have an Idea about BOQ ...");

        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AboutFrameLayout = new javax.swing.GroupLayout(AboutFrame.getContentPane());
        AboutFrame.getContentPane().setLayout(AboutFrameLayout);
        AboutFrameLayout.setHorizontalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutFrameLayout.createSequentialGroup()
                .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator14)
                            .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutFrameLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)))
                .addContainerGap())
            .addGroup(AboutFrameLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutFrameLayout.createSequentialGroup()
                    .addContainerGap(399, Short.MAX_VALUE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(394, 394, 394)))
        );
        AboutFrameLayout.setVerticalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AboutFrameLayout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );

        jPanel23.setBackground(new java.awt.Color(33, 33, 33));
        jPanel23.setPreferredSize(new java.awt.Dimension(526, 758));

        jLabel77.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(204, 204, 204));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Calculation");

        jLabel84.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(204, 204, 204));
        jLabel84.setText("Floor Area:");

        jLabel89.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 204, 204));
        jLabel89.setText("Lumen/m²:");

        jLabel90.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(204, 204, 204));
        jLabel90.setText("Total Lumens:");

        fArea2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        fArea2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tneeded2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tneeded2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tcost3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tcost3.setForeground(new java.awt.Color(204, 204, 204));
        Tcost3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Tcost4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Tcost4.setForeground(new java.awt.Color(204, 204, 204));
        Tcost4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel98.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(204, 204, 204));
        jLabel98.setText("Total watts:");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tneeded2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tcost3))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tcost4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fArea2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tneeded2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tcost3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tcost4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));

        jLabel91.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(204, 204, 204));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Light Bulb Estimation");

        jLabel92.setBackground(new java.awt.Color(51, 51, 51));
        jLabel92.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(204, 204, 204));
        jLabel92.setText("Types of Bulb: ");

        jLabel93.setBackground(new java.awt.Color(51, 51, 51));
        jLabel93.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(204, 204, 204));
        jLabel93.setText("Types of Room: ");

        jLabel94.setBackground(new java.awt.Color(51, 51, 51));
        jLabel94.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(204, 204, 204));
        jLabel94.setText("Width:");

        jLabel95.setBackground(new java.awt.Color(51, 51, 51));
        jLabel95.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(204, 204, 204));
        jLabel95.setText("Quantity:");

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton4.setText("Insert Excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        costPerTile1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        costPerTile1.setForeground(new java.awt.Color(204, 204, 204));
        costPerTile1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costPerTile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPerTile1ActionPerformed(evt);
            }
        });

        jLabel96.setBackground(new java.awt.Color(51, 51, 51));
        jLabel96.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(204, 204, 204));
        jLabel96.setText("Lumens/watts:");

        TileSizes3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TileSizes3.setForeground(new java.awt.Color(51, 51, 51));
        TileSizes3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incandecent (15 Lumens/watts)", "Halogen (25 Lumens/watts)", "CFL (60 Lumens/watts)", "LED (75 Lumens/watts)" }));
        TileSizes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TileSizes3ActionPerformed(evt);
            }
        });

        TileSizes4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TileSizes4.setForeground(new java.awt.Color(51, 51, 51));
        TileSizes4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toilet (400 Lumens)", "Kitchen (350 Lumens)", "Dining (350 Lumens)", "Living (200 Lumens)", "Garage (200 Lumens)", "Bedroom (150 Lumens)", "Storage (100 Lumens)" }));
        TileSizes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TileSizes4ActionPerformed(evt);
            }
        });

        costPerTile2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        costPerTile2.setForeground(new java.awt.Color(204, 204, 204));
        costPerTile2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costPerTile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPerTile2ActionPerformed(evt);
            }
        });

        jLabel97.setBackground(new java.awt.Color(51, 51, 51));
        jLabel97.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(204, 204, 204));
        jLabel97.setText("Length:");

        costPerTile3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        costPerTile3.setForeground(new java.awt.Color(204, 204, 204));
        costPerTile3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costPerTile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPerTile3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(55, 55, 55)))
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TileSizes4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(costPerTile1)
                            .addComponent(TileSizes3, javax.swing.GroupLayout.Alignment.TRAILING, 0, 394, Short.MAX_VALUE)
                            .addComponent(costPerTile3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(costPerTile2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(140, 140, 140))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TileSizes3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TileSizes4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costPerTile2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(costPerTile1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costPerTile3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TileSizes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TileFloorEstimator();
            }
        });
        TileSizes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TileFloorEstimator();
            }
        });

        javax.swing.GroupLayout lightBulbLayout = new javax.swing.GroupLayout(lightBulb.getContentPane());
        lightBulb.getContentPane().setLayout(lightBulbLayout);
        lightBulbLayout.setHorizontalGroup(
            lightBulbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lightBulbLayout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        lightBulbLayout.setVerticalGroup(
            lightBulbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
            .addComponent(jSeparator8)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));

        jLabel99.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(204, 204, 204));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Sucket Calculator");

        jLabel105.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(204, 204, 204));
        jLabel105.setText("Quantity: ");

        jLabel106.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 204, 204));
        jLabel106.setText("Type of sucket: ");

        jButton20.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(204, 204, 204));
        jButton20.setText("Insert");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        txtf21.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf21.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtf21InputMethodTextChanged(evt);
            }
        });
        txtf21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf21ActionPerformed(evt);
            }
        });

        CHBWastage4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CHBWastage4.setForeground(new java.awt.Color(204, 204, 204));
        CHBWastage4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "water leaking" }));
        CHBWastage4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHBWastage4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf21, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CHBWastage4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHBWastage4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(617, Short.MAX_VALUE)))
        );

        txtf1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        CHBWastage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CHBEstimator();
            }
        });

        jPanel26.setBackground(new java.awt.Color(33, 33, 33));

        jLabel107.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(204, 204, 204));
        jLabel107.setText("Price per sucket:");

        jTextField15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setCaretColor(new java.awt.Color(204, 204, 204));

        jLabel108.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 204, 204));
        jLabel108.setText("Total Cost:");

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton21.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(204, 204, 204));
        jButton21.setText("Calculate");

        jLabel109.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(204, 204, 204));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("Calculation");

        jLabel121.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(204, 204, 204));
        jLabel121.setText("Sucket need:");

        txtf19.setEditable(false);
        txtf19.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtf19, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout sucketLayout = new javax.swing.GroupLayout(sucket.getContentPane());
        sucket.getContentPane().setLayout(sucketLayout);
        sucketLayout.setHorizontalGroup(
            sucketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1522, Short.MAX_VALUE)
            .addGroup(sucketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sucketLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        sucketLayout.setVerticalGroup(
            sucketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
            .addGroup(sucketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sucketLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(sucketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));

        jLabel122.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(204, 204, 204));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("Faucet Calculator");

        jLabel123.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(204, 204, 204));
        jLabel123.setText("Quantity: ");

        jLabel124.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(204, 204, 204));
        jLabel124.setText("Type of faucet: ");

        jButton22.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(204, 204, 204));
        jButton22.setText("Insert");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        txtf22.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf22.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtf22InputMethodTextChanged(evt);
            }
        });
        txtf22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf22ActionPerformed(evt);
            }
        });

        CHBWastage5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CHBWastage5.setForeground(new java.awt.Color(204, 204, 204));
        CHBWastage5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "water leaking" }));
        CHBWastage5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHBWastage5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf22, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CHBWastage5, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHBWastage5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(617, Short.MAX_VALUE)))
        );

        txtf1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CHBEstimator();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
        CHBWastage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CHBEstimator();
            }
        });

        jPanel28.setBackground(new java.awt.Color(33, 33, 33));

        jLabel125.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(204, 204, 204));
        jLabel125.setText("Price per faucet:");

        jTextField17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setCaretColor(new java.awt.Color(204, 204, 204));

        jLabel126.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(204, 204, 204));
        jLabel126.setText("Total Cost:");

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton23.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(204, 204, 204));
        jButton23.setText("Calculate");

        jLabel127.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(204, 204, 204));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("Calculation");

        jLabel128.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(204, 204, 204));
        jLabel128.setText("Faucet need:");

        txtf23.setEditable(false);
        txtf23.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtf23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtf23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtf23, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel28Layout.createSequentialGroup()
                                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtf23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout faucetLayout = new javax.swing.GroupLayout(faucet.getContentPane());
        faucet.getContentPane().setLayout(faucetLayout);
        faucetLayout.setHorizontalGroup(
            faucetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1522, Short.MAX_VALUE)
            .addGroup(faucetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(faucetLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        faucetLayout.setVerticalGroup(
            faucetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
            .addGroup(faucetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(faucetLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(faucetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcu bitch\n");
        setBackground(new java.awt.Color(19, 44, 89));
        setForeground(new java.awt.Color(20, 33, 35));
        setMinimumSize(new java.awt.Dimension(1475, 838));
        setResizable(false);
        setSize(new java.awt.Dimension(1475, 838));

        mainPanel.setBackground(new java.awt.Color(34, 40, 44));
        mainPanel.setMaximumSize(new java.awt.Dimension(1475, 838));
        mainPanel.setMinimumSize(new java.awt.Dimension(1475, 838));

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

        structuralBtn.setBackground(new java.awt.Color(20, 30, 31));
        structuralBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-bookmark-64.png"))); // NOI18N
        structuralBtn.setBorder(null);
        structuralBtn.setFocusPainted(false);
        structuralBtn.setFocusable(false);
        structuralBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        structuralBtn.setRequestFocusEnabled(false);
        structuralBtn.setRolloverEnabled(false);
        structuralBtn.setVerifyInputWhenFocusTarget(false);
        structuralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                structuralBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Structural");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(structuralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(structuralBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(20, 30, 31));
        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Electrical");

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
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Plumbing");

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

        jPanel11.setBackground(new java.awt.Color(20, 30, 31));

        jButton16.setBackground(new java.awt.Color(20, 30, 31));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-question-mark-64.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setFocusPainted(false);
        jButton16.setFocusable(false);
        jButton16.setRequestFocusEnabled(false);
        jButton16.setRolloverEnabled(false);
        jButton16.setVerifyInputWhenFocusTarget(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Architectural");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(34, 40, 44));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/Icons/icons8-question-mark-64.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
             // Assuming box3 is your JComboBox<String>
            Object selectedObjectBox4 = box4.getSelectedItem();

            // Check if an item is selected
            if (selectedObjectBox4 != null) {
                // Convert the selected item to a String
                String selectedValueBox4 = selectedObjectBox4.toString();

                // Extract the numeric part (remove any non-numeric characters except for dots)
                String wastage = selectedValueBox4.replaceAll("[^\\d.]", "");

                // Ensure only one dot in the numeric part
                if (wastage.matches(".*\\..*\\..*")) {
                    System.err.println("Error: Invalid format in box2");
                } else {
                    // Convert the numeric part to a double
                    try {
                        double doubleValueBox4 = Double.parseDouble(wastage);

                        // Convert percentage to decimal (divide by 100)
                        decimalValueBox4 = doubleValueBox4 / 100.0;

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
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void costPerTileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPerTileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPerTileActionPerformed

    private void Rlength1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rlength1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rlength1ActionPerformed

    private void Rwidth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rwidth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rwidth1ActionPerformed

    private void Rheight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rheight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rheight1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TileWallWastageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TileWallWastageActionPerformed
        // Assuming TileWallWastage is your JComboBox<String>
        Object selectedObjectTileWallWastage = TileWallWastage.getSelectedItem();

        // Check if an item is selected
        if (selectedObjectTileWallWastage != null) {
            // Convert the selected item to a String
            String selectedValueTileWallWastage = selectedObjectTileWallWastage.toString();

            // Extract the numeric part (remove any non-numeric characters except for dots)
            String tileWallWastageValue = selectedValueTileWallWastage.replaceAll("[^\\d.]", "");

            // Ensure only one dot in the numeric part
            if (tileWallWastageValue.matches(".*\\..*\\..*")) {
                System.err.println("Error: Invalid format in TileWallWastage");
            } else {
                // Convert the numeric part to a double
                try {
                    double doubleValueTileWallWastage = Double.parseDouble(tileWallWastageValue);

                    // Convert percentage to decimal (divide by 100)
                    decimalValueTileWallWastage = doubleValueTileWallWastage / 100.0;

                    // Now you have the decimal value
                    System.out.println("Selected Value from TileWallWastage as Decimal: " + decimalValueTileWallWastage);
                } catch (NumberFormatException e) {
                    // Handle the case where the selected value is not a valid double
                    System.err.println("Error: Selected value from TileWallWastage is not a valid double");
                }
            }
        } else {
            // Handle the case where no item is selected
            System.err.println("Error: No item selected in TileWallWastage");
        }

 
    }//GEN-LAST:event_TileWallWastageActionPerformed

    private void CHBWastageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHBWastageActionPerformed
        // Assuming CHBWastage is your JComboBox<String>
            Object selectedObjectCHBWastage = CHBWastage.getSelectedItem();

            // Check if an item is selected
            if (selectedObjectCHBWastage != null) {
                // Convert the selected item to a String
                String selectedValueCHBWastage = selectedObjectCHBWastage.toString();

                // Extract the numeric part (remove any non-numeric characters except for dots)
                CHBWastages1 = selectedValueCHBWastage.replaceAll("[^\\d.]", "");

                // Ensure only one dot in the numeric part
                if (CHBWastages1.matches(".*\\..*\\..*")) {
                    System.err.println("Error: Invalid format in CHBWastage");
                } else {
                    // Convert the numeric part to a double
                    try {
                        double doubleValueCHBWastage = Double.parseDouble(CHBWastages1);

                        // Convert percentage to decimal (divide by 100)
                        double decimalValueCHBWastage = doubleValueCHBWastage / 100.0;

                        // Now you have the decimal value
                        System.out.println("Selected Value from CHBWastage as Decimal: " + decimalValueCHBWastage);
                    } catch (NumberFormatException e) {
                        // Handle the case where the selected value is not a valid double
                        System.err.println("Error: Selected value from CHBWastage is not a valid double");
                    }
                }
            } else {
                // Handle the case where no item is selected
                System.err.println("Error: No item selected in CHBWastage");
            }

    }//GEN-LAST:event_CHBWastageActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf2ActionPerformed

    }//GEN-LAST:event_txtf2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            saveToExcel();
        } catch (IOException ex) {
            Logger.getLogger(calcu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtf1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtf1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf1InputMethodTextChanged

    private void txtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf3ActionPerformed

    private void txtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf1ActionPerformed

    private void TileSizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TileSizesActionPerformed

       // Assuming TILESize is your JComboBox<String>
            Object selectedObjectTILESize = TileSizes.getSelectedItem();

            // Check if an item is selected
            if (selectedObjectTILESize != null) {
                // Convert the selected item to a String
                String selectedValueTILESize = selectedObjectTILESize.toString();

                // Extract the numeric part after "=" excluding letters
                String numericValueTILESize = selectedValueTILESize.replaceAll("[^\\d.]+", "");

                // Ensure only one dot in the numeric part
                if (numericValueTILESize.matches(".*\\..*")) {
                    // Convert the numeric part to a double
                    try {
                        double doubleValueTILESize = Double.parseDouble(numericValueTILESize);

                        // Extract the decimal part and round it to four decimal places
                        decimalPart1 = doubleValueTILESize % 1;
                        decimalPart1 = Double.parseDouble(String.format("%.4f", decimalPart1));

                        // Now you have the rounded decimal part
                        System.out.println("Rounded Decimal Part from TILESize: " + decimalPart1);
                    } catch (NumberFormatException e) {
                        // Handle the case where the selected value is not a valid double
                        System.err.println("Error: Selected value from TILESize is not a valid double");
                    }
                } else {
                    System.err.println("Error: Invalid format in TILESize");
                }
            } else {
                // Handle the case where no item is selected
                System.err.println("Error: No item selected in TILESize");
}

    }//GEN-LAST:event_TileSizesActionPerformed

    private void CHBWastage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHBWastage1ActionPerformed
        
    }//GEN-LAST:event_CHBWastage1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf4ActionPerformed

    private void txtf5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtf5InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf5InputMethodTextChanged

    private void txtf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf5ActionPerformed

    private void txtf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf7ActionPerformed

    private void txtf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf9ActionPerformed

    private void pAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAreaActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        ArchitecturalFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void WoodWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WoodWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WoodWidthActionPerformed

    private void WoodLengthInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_WoodLengthInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_WoodLengthInputMethodTextChanged

    private void WoodLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WoodLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WoodLengthActionPerformed

    private void pTextWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTextWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTextWActionPerformed

    private void pTextLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTextLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTextLActionPerformed

    private void txtf18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void txtf20InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtf20InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf20InputMethodTextChanged

    private void txtf20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf20ActionPerformed

    private void CHBWastage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHBWastage3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHBWastage3ActionPerformed

    private void structuralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_structuralBtnActionPerformed
        StructuralFrame.setVisible(true);
    }//GEN-LAST:event_structuralBtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       TilesWall.setVisible(true);
       CHBpanel.setVisible(false);
       TilesFloor.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Plywood.setVisible(true);
        TilesWall.setVisible(false);
        CHBpanel.setVisible(false);
        TilesFloor.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        electricalFrame.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        plumbingFrame.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void gotoCHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoCHBActionPerformed
        CHBpanel.setVisible(true);
        TilesFloor.setVisible(false);
        TilesWall.setVisible(false);
    }//GEN-LAST:event_gotoCHBActionPerformed

    private void FloortilesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FloortilesbtnActionPerformed
        TilesFloor.setVisible(true);
        CHBpanel.setVisible(false);
        TilesWall.setVisible(false);
    }//GEN-LAST:event_FloortilesbtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void costPerTile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPerTile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPerTile1ActionPerformed

    private void TileSizes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TileSizes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TileSizes3ActionPerformed

    private void TileSizes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TileSizes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TileSizes4ActionPerformed

    private void costPerTile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPerTile2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPerTile2ActionPerformed

    private void costPerTile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPerTile3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPerTile3ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void txtf21InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtf21InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf21InputMethodTextChanged

    private void txtf21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf21ActionPerformed

    private void CHBWastage4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHBWastage4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHBWastage4ActionPerformed

    private void txtf19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void txtf22InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtf22InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf22InputMethodTextChanged

    private void txtf22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf22ActionPerformed

    private void CHBWastage5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHBWastage5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHBWastage5ActionPerformed

    private void txtf23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf23ActionPerformed

    private void TILESizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TILESizeActionPerformed
       // Assuming TILESize is your JComboBox<String>
        Object selectedObjectTILESize = TILESize.getSelectedItem();

        // Check if an item is selected
        if (selectedObjectTILESize != null) {
            // Convert the selected item to a String
            String selectedValueTILESize = selectedObjectTILESize.toString();

            // Print for debugging
            System.out.println("Selected Value from TILESize: " + selectedValueTILESize);

            // Extract the numeric part after "=" excluding letters
            String numericValueTILESize = selectedValueTILESize.replaceAll("[^\\d.]+", "");

            // Print for debugging
            System.out.println("Numeric Value from TILESize: " + numericValueTILESize);

            // Ensure only one dot in the numeric part
            if (numericValueTILESize.matches(".*\\..*")) {
                // Convert the numeric part to a double
                try {
                    double doubleValueTILESize = Double.parseDouble(numericValueTILESize);

                    // Extract the decimal part and round it to four decimal places
                    decimalPart = doubleValueTILESize % 1;
                    decimalPart = Double.parseDouble(String.format("%.4f", decimalPart));

                    // Now you have the rounded decimal part
                    System.out.println("Rounded Decimal Part from TILESize: " + decimalPart);
                } catch (NumberFormatException e) {
                    // Handle the case where the selected value is not a valid double
                    System.err.println("Error: Selected value from TILESize is not a valid double");
                }
            } else {
                System.err.println("Error: Invalid format in TILESize");
            }
        } else {
            // Handle the case where no item is selected
            System.err.println("Error: No item selected in TILESize");
            }

    }//GEN-LAST:event_TILESizeActionPerformed

    /**
     *
     */
    
    
            private boolean isNumeric(String str) {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
            
            
            
public void CHBEstimator() {
    try {
        // Ensure txtf1 and txtf2 are not null before accessing their text content
        if (txtf1 != null && txtf2 != null && CHBWastages1 !=null) {
            System.out.println("txtf1 value: '" + txtf1.getText() + "'");
            System.out.println("txtf2 value: '" + txtf2.getText() + "'");
            System.out.println("Wastage: '" + CHBWastages1 + "'");
                    
            // Check if the input in txtf1 and txtf2 is empty
            if (txtf1.getText().isEmpty() || txtf2.getText().isEmpty() || CHBWastages1.isEmpty()) {
                System.err.println("Error: Please enter values in both text fields.");
                return;
            }

            // Check if the input in txtf1 and txtf2 is numeric
            if (!isNumeric(txtf1.getText()) || !isNumeric(txtf2.getText()) || !isNumeric(CHBWastages1)) {
                System.err.println("Error: Invalid input. Please enter valid numeric values in txtf1 and txtf2.");
                return;
            }

           // Attempt to parse the width and height
            float wallWidth = Float.parseFloat(txtf1.getText());
            float wallHeight = Float.parseFloat(txtf2.getText());
            double wastagePercentage = Double.parseDouble(CHBWastages1);

            // Validate that the values are non-negative
            if (wallWidth < 0 || wallHeight < 0 || wastagePercentage < 0) {
                System.err.println("Error: Width, height, and wastage percentage must be non-negative.");
            }

            wallArea = wallWidth * wallHeight;
            float brickLength = 0.40f;
            float brickWidth = 0.20f;
            float brickArea = brickLength * brickWidth;

            float bricksNeeded = wallArea / brickArea;
            double totalBricksWithWastage = (wastagePercentage/100) * bricksNeeded;
            int roundedTotalBricks = (int) Math.round(totalBricksWithWastage);
            overallBricksRequired = (int) (bricksNeeded + roundedTotalBricks);

            txtf3.setText(String.valueOf(wallArea + "m²"));
            txtf6.setText(String.valueOf(overallBricksRequired));
            
            
        } else {
            System.err.println("Error: One or both text fields (txtf1 and txtf2) are null.");
        }
    } catch (NumberFormatException e) {
        // Handle the case where the user entered non-numeric or invalid values
        System.err.println("Error: Invalid input. Please enter valid non-negative numeric values in txtf1 and txtf2.");
    }
}



        private void TileWallEstimator(){
            try{
                if(Rlength1 != null && Rwidth1 != null && Rheight1 != null){
                    System.out.println("Rlength value: '" + Rlength1.getText() + "'");
                    System.out.println("Rwidth value: '" + Rwidth1.getText() + "'" );
                    System.out.println("Rheight value: '" + Rheight1.getText() + "'" );
                    System.out.println("Value: " + decimalPart);
                    System.out.println("Value: " + decimalValueTileWallWastage);
                    
                    
                      if (Rlength1.getText().isEmpty() || Rwidth1.getText().isEmpty() || Rheight1.getText().isEmpty()) {
                        System.err.println("Error: Please enter values in both text fields.");
                        return;
                    }
                       if (!isNumeric(Rlength1.getText()) || !isNumeric(Rwidth1.getText()) || !isNumeric(Rheight1.getText())) {
                        System.err.println("Error: Invalid input. Please enter valid numeric values in txtf1 and txtf2.");
                        return;
                    }
                       float tLength = Float.parseFloat(Rlength1.getText());
                       float tWidth = Float.parseFloat(Rwidth1.getText());
                       float tHeight = Float.parseFloat(Rheight1.getText());
                       
                       float twArea = tLength * tWidth * tHeight;
                       double tWallsNeed = twArea / decimalPart;
                       int tWallWastage = (int) Math.round(tWallsNeed * decimalValueTileWallWastage);
                       
                       fArea1.setText(String.valueOf(twArea + "m²"));
                       Tneeded1.setText(String.valueOf(tWallWastage));                 
                }
                
                
            
            }
            catch(NumberFormatException e){
                
            }
        }
        
        private void TileFloorEstimator(){
            try{
                // Ensure txtf1 and txtf2 are not null before accessing their text content
                if (Flength != null && Fwidth!= null) {
                    System.out.println("Flength value: '" + Flength.getText() + "'");
                    System.out.println("Fwidth value: '" + Fwidth.getText() + "'");
                    System.out.println("TileSize:  '" + decimalPart1 + "'");
                    System.out.println("WastageTiles: '" + decimalValueBox4 + "'");
                    
                     // Check if the input in txtf1 and txtf2 is empty
                    if (Flength.getText().isEmpty() || Fwidth.getText().isEmpty()) {
                        System.err.println("Error: Please enter values in both text fields.");
                        return;
                    }
                    
                         // Check if the input in txtf1 and txtf2 is numeric
                    if (!isNumeric(Flength.getText()) || !isNumeric(Fwidth.getText())){
                        System.err.println("Error: Invalid input. Please enter valid numeric values in txtf1 and txtf2.");
                        return;
                    }
                     float floorLength = Float.parseFloat(Flength.getText());
                     float floorWidth = Float.parseFloat(Fwidth.getText());
                     
                     float fARea = floorLength * floorWidth;
                     
              
                    
                                         
                
                     fArea.setText(String.valueOf(fARea + "m²"));
                } 
            
            }
            catch(NumberFormatException e){
                
            }
        }
        

    
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
//        panel2.setVisible(false);
        mainPanel.setVisible(true);
        Roof.setVisible(false);
    }
    
    
   public void PlywoodEstimator() {
    try {
        // Get the wall dimensions in meters
        float pHeight = Float.parseFloat(pTextL.getText());
        float pWidth = Float.parseFloat(pTextW.getText());

        // Calculate the wall area in square meters
        float pResult = 0;

        if (pHeight > 0 && pWidth > 0) {
            pResult = pHeight * pWidth;

            // Display wall area in square meters
            pArea.setText(String.valueOf(pResult + "m²"));

            // Get the plywood dimensions in meters
            float woodL = Float.parseFloat(WoodLength.getText()) * 0.3048f;
            float woodW = Float.parseFloat(WoodWidth.getText()) * 0.3048f;

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
   public void saveToExcel() throws IOException {
       
    // Specify the absolute path for the Excel file
    String filePath = "C:\\Users\\Jandell\\Music\\BOQ.xlsx";

    // Try to open an existing workbook or create a new one if it doesn't exist
    try (FileInputStream fis = new FileInputStream(filePath);
         Workbook workbook = (fis.available() > 0) ? new XSSFWorkbook(fis) : new XSSFWorkbook()) {

        // Get the sheet named "Bills of Quantity" or create a new one if it doesn't exist
        Sheet sheet = workbook.getSheet("Bills of Quantity");
        if (sheet == null) {
            sheet = workbook.createSheet("Bills of Quantity");

            // Create a header row if the sheet is new
            if (sheet.getLastRowNum() == 0) {
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("Material");
                headerRow.createCell(1).setCellValue("Area (m)");
                headerRow.createCell(2).setCellValue("Quantity");
            }
        }

        // Add a new row with the calculated data
        Row dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
        dataRow.createCell(0).setCellValue(CHB);
        dataRow.createCell(1).setCellValue(wallArea);
        dataRow.createCell(2).setCellValue(overallBricksRequired);

        // Write the workbook to the file
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            System.out.println("Excel file updated successfully. File saved at: " + new File(filePath).getAbsolutePath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

 
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AboutFrame;
    private javax.swing.JFrame ArchitecturalFrame;
    private javax.swing.JComboBox<String> CHBWastage;
    private javax.swing.JComboBox<String> CHBWastage1;
    private javax.swing.JComboBox<String> CHBWastage3;
    private javax.swing.JComboBox<String> CHBWastage4;
    private javax.swing.JComboBox<String> CHBWastage5;
    private javax.swing.JFrame CHBpanel;
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField Cost;
    private javax.swing.JTextField Flength;
    private javax.swing.JButton Floortilesbtn;
    private javax.swing.JTextField Fwidth;
    private javax.swing.JFrame Plywood;
    private javax.swing.JTextField Rheight1;
    private javax.swing.JTextField Rlength1;
    private javax.swing.JFrame Roof;
    private javax.swing.JTextField Rwidth1;
    private javax.swing.JFrame StructuralFrame;
    private javax.swing.JComboBox<String> TILESize;
    private javax.swing.JTextField Tcost;
    private javax.swing.JTextField Tcost1;
    private javax.swing.JTextField Tcost2;
    private javax.swing.JTextField Tcost3;
    private javax.swing.JTextField Tcost4;
    private javax.swing.JComboBox<String> TileSizes;
    private javax.swing.JComboBox<String> TileSizes3;
    private javax.swing.JComboBox<String> TileSizes4;
    private javax.swing.JComboBox<String> TileWallWastage;
    private javax.swing.JFrame TilesFloor;
    private javax.swing.JFrame TilesWall;
    private javax.swing.JTextField Tneeded;
    private javax.swing.JTextField Tneeded1;
    private javax.swing.JTextField Tneeded2;
    private javax.swing.JTextField WoodLength;
    private javax.swing.JTextField WoodWidth;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box2;
    private javax.swing.JComboBox<String> box3;
    private javax.swing.JComboBox<String> box4;
    private javax.swing.JTextField costPerTile;
    private javax.swing.JTextField costPerTile1;
    private javax.swing.JTextField costPerTile2;
    private javax.swing.JTextField costPerTile3;
    private javax.swing.JFrame doorDoorjambs;
    private javax.swing.JFrame electricalFrame;
    private javax.swing.JTextField fArea;
    private javax.swing.JTextField fArea1;
    private javax.swing.JTextField fArea2;
    private javax.swing.JFrame faucet;
    private javax.swing.JButton gotoCHB;
    private javax.swing.JTextField gutter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JFrame lightBulb;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField pArea;
    private javax.swing.JTextField pTextL;
    private javax.swing.JTextField pTextW;
    private javax.swing.JFrame paint;
    private javax.swing.JFrame plumbingFrame;
    private javax.swing.JTextField rafter;
    private javax.swing.JTextField roofArea1;
    private javax.swing.JTextField roofSheetArea;
    private javax.swing.JTextField sheetCost;
    private javax.swing.JTextField sheets;
    private javax.swing.JButton structuralBtn;
    private javax.swing.JFrame sucket;
    private javax.swing.JTextField txtf1;
    private javax.swing.JTextField txtf18;
    private javax.swing.JTextField txtf19;
    private javax.swing.JTextField txtf2;
    private javax.swing.JTextField txtf20;
    private javax.swing.JTextField txtf21;
    private javax.swing.JTextField txtf22;
    private javax.swing.JTextField txtf23;
    private javax.swing.JTextField txtf3;
    private javax.swing.JTextField txtf4;
    private javax.swing.JTextField txtf5;
    private javax.swing.JTextField txtf6;
    private javax.swing.JTextField txtf7;
    private javax.swing.JTextField txtf8;
    private javax.swing.JTextField txtf9;
    private javax.swing.JTextField woodCost;
    private javax.swing.JTextField woodCosts;
    private javax.swing.JTextField woodsNeeded;
    // End of variables declaration//GEN-END:variables

    private void getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
