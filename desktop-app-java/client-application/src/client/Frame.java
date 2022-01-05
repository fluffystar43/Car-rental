package client;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;

import service.endpoint.ClientServiceService;
import types.Client;
import java.text.SimpleDateFormat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import service.endpoint.SearchCriteriaServiceService;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
        jTableAvailableCars.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableCarsInRent.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableListCars.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableOrders.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableClients.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jButtonAvailableCarsAddOrder.setEnabled(false);

        //jDialogLogin.setVisible(true);
    }

    static DefaultTableModel model = new DefaultTableModel();
    static ClientServiceService clientService = null;
    static SearchCriteriaServiceService searchCriteriaService = null;

    static {
        clientService = new ClientServiceService();
        searchCriteriaService = new SearchCriteriaServiceService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogLogin = new javax.swing.JDialog();
        jPanelLogin1 = new javax.swing.JPanel();
        jTextFieldLogin1 = new javax.swing.JTextField();
        jLabelLogin1 = new javax.swing.JLabel();
        jLabelPassword1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonEnter1 = new javax.swing.JButton();
        jTabbedPaneForm = new javax.swing.JTabbedPane();
        jPanelAutopark = new javax.swing.JPanel();
        jTabbedPaneAutopark = new javax.swing.JTabbedPane();
        jPanelAvailableCars = new javax.swing.JPanel();
        jButtonAvailableCarsAddOrder = new javax.swing.JButton();
        jButtonAvailableCarsUpdateTable = new javax.swing.JButton();
        jLabelAvailableCarsSearchСriteriaFirst = new javax.swing.JLabel();
        jLabelAvailableCarsSearchСriteriaSecond = new javax.swing.JLabel();
        jComboBoxAvailableCarsSearchСriteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxAvailableCarsSearchСriteriaSecond = new javax.swing.JComboBox<>();
        jScrollPaneAvailableCars = new javax.swing.JScrollPane();
        jTableAvailableCars = new javax.swing.JTable();
        jButtonAvailableCarsClearSearchCriteries = new javax.swing.JButton();
        jPanelRentedCars = new javax.swing.JPanel();
        jButtonRentedCarsMoveToOrders = new javax.swing.JButton();
        jButtonRentedCarsUpdateTable = new javax.swing.JButton();
        jLabelRentedCarsSearchСriteriaFirst = new javax.swing.JLabel();
        jLabelRentedCarsSearchСriteriaSecond = new javax.swing.JLabel();
        jComboBoxRentedCarsSearchСriteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxRentedCarsSearchСriteriaSecond = new javax.swing.JComboBox<>();
        jScrollPaneAvailableCars1 = new javax.swing.JScrollPane();
        jTableCarsInRent = new javax.swing.JTable();
        jButtonRentedCarsClearSearchCriteries = new javax.swing.JButton();
        jPanelListCars = new javax.swing.JPanel();
        jButtonAddCar = new javax.swing.JButton();
        jButtonDeleteCar = new javax.swing.JButton();
        jLabelListCarsSearchСriteriaFirst = new javax.swing.JLabel();
        jLabelListCarsSearchСriteriaSecond = new javax.swing.JLabel();
        jComboBoxListCarsSearchСriteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxListCarsSearchСriteriaSecond = new javax.swing.JComboBox<>();
        jButtonEditDataCar = new javax.swing.JButton();
        jScrollPaneAvailableCars2 = new javax.swing.JScrollPane();
        jTableListCars = new javax.swing.JTable();
        jButtonListCarsClearSearchCriteries = new javax.swing.JButton();
        jButtonListCarsUpdateTable = new javax.swing.JButton();
        jPanelOrders = new javax.swing.JPanel();
        jButtonCloseOrder = new javax.swing.JButton();
        jButtonUpdateTableOrders = new javax.swing.JButton();
        jButtonEditDataOrder = new javax.swing.JButton();
        jScrollPaneOrders = new javax.swing.JScrollPane();
        jTableOrders = new javax.swing.JTable();
        jPanelClients = new javax.swing.JPanel();
        jScrollPaneClients = new javax.swing.JScrollPane();
        jTableClients = new javax.swing.JTable();
        jButtonEditDataClient = new javax.swing.JButton();
        jButtonUpdateTableClients = new javax.swing.JButton();
        jButtonBlockClient = new javax.swing.JButton();
        jButtonExportClientsToPDF = new javax.swing.JButton();

        jDialogLogin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogLogin.setTitle("Авторизация");
        jDialogLogin.setName("dialogLogin"); // NOI18N
        jDialogLogin.setResizable(false);

        jTextFieldLogin1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldLogin1.setToolTipText("Введите логин");

        jLabelLogin1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLogin1.setText("Логин:");

        jLabelPassword1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPassword1.setText("Пароль:");

        jButtonEnter1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonEnter1.setText("Войти");

        javax.swing.GroupLayout jPanelLogin1Layout = new javax.swing.GroupLayout(jPanelLogin1);
        jPanelLogin1.setLayout(jPanelLogin1Layout);
        jPanelLogin1Layout.setHorizontalGroup(
            jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogin1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPassword1)
                    .addComponent(jLabelLogin1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldLogin1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogin1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanelLogin1Layout.setVerticalGroup(
            jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogin1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogin1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButtonEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogLoginLayout = new javax.swing.GroupLayout(jDialogLogin.getContentPane());
        jDialogLogin.getContentPane().setLayout(jDialogLoginLayout);
        jDialogLoginLayout.setHorizontalGroup(
            jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogLoginLayout.setVerticalGroup(
            jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Прокат автомобилей");
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTabbedPaneForm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTabbedPaneAutopark.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanelAvailableCars.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelAvailableCarsComponentShown(evt);
            }
        });

        jButtonAvailableCarsAddOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonAvailableCarsAddOrder.setText("Оформить заказ");

        jButtonAvailableCarsUpdateTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonAvailableCarsUpdateTable.setText("Обновить список автомобилей");
        jButtonAvailableCarsUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvailableCarsUpdateTableActionPerformed(evt);
            }
        });

        jLabelAvailableCarsSearchСriteriaFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelAvailableCarsSearchСriteriaFirst.setText("Выберите критерий поиска:");

        jLabelAvailableCarsSearchСriteriaSecond.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelAvailableCarsSearchСriteriaSecond.setText("Выберите из списка:");

        jComboBoxAvailableCarsSearchСriteriaFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxAvailableCarsSearchСriteriaFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAvailableCarsSearchСriteriaFirstActionPerformed(evt);
            }
        });

        jComboBoxAvailableCarsSearchСriteriaSecond.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxAvailableCarsSearchСriteriaSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAvailableCarsSearchСriteriaSecondActionPerformed(evt);
            }
        });

        jTableAvailableCars.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableAvailableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Бренд", "Модель", "Коробка передач", "Привод", "Цвет", "Цена, руб/сут.", "Номер"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAvailableCars.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableAvailableCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAvailableCarsMouseClicked(evt);
            }
        });
        jScrollPaneAvailableCars.setViewportView(jTableAvailableCars);

        jButtonAvailableCarsClearSearchCriteries.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAvailableCarsClearSearchCriteries.setText("Очистить поля выбора");
        jButtonAvailableCarsClearSearchCriteries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvailableCarsClearSearchCriteriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAvailableCarsLayout = new javax.swing.GroupLayout(jPanelAvailableCars);
        jPanelAvailableCars.setLayout(jPanelAvailableCarsLayout);
        jPanelAvailableCarsLayout.setHorizontalGroup(
            jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneAvailableCars, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE))
                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAvailableCarsClearSearchCriteries)
                            .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabelAvailableCarsSearchСriteriaFirst))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvailableCarsLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabelAvailableCarsSearchСriteriaSecond)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxAvailableCarsSearchСriteriaFirst, 0, 301, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAvailableCarsSearchСriteriaSecond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAvailableCarsUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAvailableCarsAddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelAvailableCarsLayout.setVerticalGroup(
            jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvailableCarsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAvailableCarsAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAvailableCarsSearchСriteriaFirst)
                    .addComponent(jComboBoxAvailableCarsSearchСriteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAvailableCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAvailableCarsSearchСriteriaSecond)
                        .addComponent(jComboBoxAvailableCarsSearchСriteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAvailableCarsClearSearchCriteries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneAvailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPaneAutopark.addTab("Доступные автомобили", jPanelAvailableCars);

        jPanelRentedCars.setPreferredSize(new java.awt.Dimension(810, 100));
        jPanelRentedCars.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelRentedCarsComponentShown(evt);
            }
        });

        jButtonRentedCarsMoveToOrders.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonRentedCarsMoveToOrders.setActionCommand("Перейти к заказам");
        jButtonRentedCarsMoveToOrders.setLabel("Перейти к заказам");
        jButtonRentedCarsMoveToOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentedCarsMoveToOrdersActionPerformed(evt);
            }
        });

        jButtonRentedCarsUpdateTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonRentedCarsUpdateTable.setText("Обновить список автомобилей");
        jButtonRentedCarsUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentedCarsUpdateTableActionPerformed(evt);
            }
        });

        jLabelRentedCarsSearchСriteriaFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelRentedCarsSearchСriteriaFirst.setText("Выберите критерий поиска:");

        jLabelRentedCarsSearchСriteriaSecond.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelRentedCarsSearchСriteriaSecond.setText("Выберите из списка:");

        jComboBoxRentedCarsSearchСriteriaFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxRentedCarsSearchСriteriaFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRentedCarsSearchСriteriaFirstActionPerformed(evt);
            }
        });

        jComboBoxRentedCarsSearchСriteriaSecond.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxRentedCarsSearchСriteriaSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRentedCarsSearchСriteriaSecondActionPerformed(evt);
            }
        });

        jTableCarsInRent.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableCarsInRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Бренд", "Модель", "Номер", "Клиент", "Дата аренды", "Дата возврата", "Количество дней"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCarsInRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarsInRentMouseClicked(evt);
            }
        });
        jScrollPaneAvailableCars1.setViewportView(jTableCarsInRent);

        jButtonRentedCarsClearSearchCriteries.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRentedCarsClearSearchCriteries.setText("Очистить поля выбора");
        jButtonRentedCarsClearSearchCriteries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentedCarsClearSearchCriteriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRentedCarsLayout = new javax.swing.GroupLayout(jPanelRentedCars);
        jPanelRentedCars.setLayout(jPanelRentedCarsLayout);
        jPanelRentedCarsLayout.setHorizontalGroup(
            jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonRentedCarsClearSearchCriteries)
                            .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabelRentedCarsSearchСriteriaFirst))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRentedCarsLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabelRentedCarsSearchСriteriaSecond)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxRentedCarsSearchСriteriaFirst, 0, 305, Short.MAX_VALUE)
                                    .addComponent(jComboBoxRentedCarsSearchСriteriaSecond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRentedCarsUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRentedCarsMoveToOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneAvailableCars1, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelRentedCarsLayout.setVerticalGroup(
            jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRentedCarsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRentedCarsMoveToOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRentedCarsSearchСriteriaFirst)
                    .addComponent(jComboBoxRentedCarsSearchСriteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRentedCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRentedCarsSearchСriteriaSecond)
                        .addComponent(jComboBoxRentedCarsSearchСriteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRentedCarsClearSearchCriteries)
                .addGap(12, 12, 12)
                .addComponent(jScrollPaneAvailableCars1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAutopark.addTab("Автомобили в прокате", jPanelRentedCars);

        jPanelListCars.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelListCarsComponentShown(evt);
            }
        });

        jButtonAddCar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonAddCar.setText("Добавить автомобиль");
        jButtonAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCarActionPerformed(evt);
            }
        });

        jButtonDeleteCar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonDeleteCar.setText("Удалить автомобиль");
        jButtonDeleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCarActionPerformed(evt);
            }
        });

        jLabelListCarsSearchСriteriaFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelListCarsSearchСriteriaFirst.setText("Выберите критерий поиска:");

        jLabelListCarsSearchСriteriaSecond.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelListCarsSearchСriteriaSecond.setText("Выберите из списка:");

        jComboBoxListCarsSearchСriteriaFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxListCarsSearchСriteriaFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListCarsSearchСriteriaFirstActionPerformed(evt);
            }
        });

        jComboBoxListCarsSearchСriteriaSecond.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxListCarsSearchСriteriaSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListCarsSearchСriteriaSecondActionPerformed(evt);
            }
        });

        jButtonEditDataCar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonEditDataCar.setText("Изменить данные автомобиля");
        jButtonEditDataCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataCarActionPerformed(evt);
            }
        });

        jTableListCars.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableListCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Бренд", "Модель", "Коробка передач", "Привод", "Цвет", "Цена, руб/сут.", "Номер"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAvailableCars2.setViewportView(jTableListCars);

        jButtonListCarsClearSearchCriteries.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonListCarsClearSearchCriteries.setText("Очистить поля выбора");
        jButtonListCarsClearSearchCriteries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCarsClearSearchCriteriesActionPerformed(evt);
            }
        });

        jButtonListCarsUpdateTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonListCarsUpdateTable.setText("Обновить список автомобилей");
        jButtonListCarsUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCarsUpdateTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListCarsLayout = new javax.swing.GroupLayout(jPanelListCars);
        jPanelListCars.setLayout(jPanelListCarsLayout);
        jPanelListCarsLayout.setHorizontalGroup(
            jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListCarsLayout.createSequentialGroup()
                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneAvailableCars2, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListCarsLayout.createSequentialGroup()
                        .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelListCarsLayout.createSequentialGroup()
                                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabelListCarsSearchСriteriaFirst))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListCarsLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabelListCarsSearchСriteriaSecond)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxListCarsSearchСriteriaFirst, 0, 305, Short.MAX_VALUE)
                                    .addComponent(jComboBoxListCarsSearchСriteriaSecond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButtonListCarsClearSearchCriteries))
                        .addGap(60, 60, 60)
                        .addComponent(jButtonListCarsUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonEditDataCar, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jButtonAddCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDeleteCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelListCarsLayout.setVerticalGroup(
            jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListCarsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelListCarsSearchСriteriaFirst)
                        .addComponent(jComboBoxListCarsSearchСriteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelListCarsSearchСriteriaSecond)
                        .addComponent(jComboBoxListCarsSearchСriteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEditDataCar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDeleteCar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonListCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonListCarsClearSearchCriteries))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneAvailableCars2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneAutopark.addTab("Список автомобилей", jPanelListCars);

        javax.swing.GroupLayout jPanelAutoparkLayout = new javax.swing.GroupLayout(jPanelAutopark);
        jPanelAutopark.setLayout(jPanelAutoparkLayout);
        jPanelAutoparkLayout.setHorizontalGroup(
            jPanelAutoparkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneAutopark)
        );
        jPanelAutoparkLayout.setVerticalGroup(
            jPanelAutoparkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneAutopark)
        );

        jTabbedPaneAutopark.getAccessibleContext().setAccessibleName("Автомобили в прокате");

        jTabbedPaneForm.addTab("Автопарк", jPanelAutopark);

        jButtonCloseOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonCloseOrder.setText("Завершить заказ");
        jButtonCloseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseOrderActionPerformed(evt);
            }
        });

        jButtonUpdateTableOrders.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonUpdateTableOrders.setText("Обновить данные");
        jButtonUpdateTableOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateTableOrdersActionPerformed(evt);
            }
        });

        jButtonEditDataOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonEditDataOrder.setText("Изменить данные заказа");
        jButtonEditDataOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataOrderActionPerformed(evt);
            }
        });

        jTableOrders.setFont(getFont());
        jTableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Клиент", "Автомобиль", "Дата заказа", "Дата окончания", "Количество дней аренды", "Стоимость, руб."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPaneOrders.setViewportView(jTableOrders);

        javax.swing.GroupLayout jPanelOrdersLayout = new javax.swing.GroupLayout(jPanelOrders);
        jPanelOrders.setLayout(jPanelOrdersLayout);
        jPanelOrdersLayout.setHorizontalGroup(
            jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneOrders)
                    .addGroup(jPanelOrdersLayout.createSequentialGroup()
                        .addGap(0, 826, Short.MAX_VALUE)
                        .addGroup(jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCloseOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditDataOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdateTableOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelOrdersLayout.setVerticalGroup(
            jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUpdateTableOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButtonEditDataOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCloseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPaneForm.addTab("Заказы", jPanelOrders);

        jPanelClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelClientsMouseClicked(evt);
            }
        });
        jPanelClients.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanelClientsComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelClientsComponentShown(evt);
            }
        });

        jTableClients.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Фамилия", "Имя", "Отчество", "Дата рождения", "Паспортные данные", "Водительское удостоверение", "Номер телефона", "Электронная почта"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneClients.setViewportView(jTableClients);

        jButtonEditDataClient.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonEditDataClient.setText("Изменить данные клиента");
        jButtonEditDataClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataClientActionPerformed(evt);
            }
        });

        jButtonUpdateTableClients.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonUpdateTableClients.setText("Обновить данные");
        jButtonUpdateTableClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateTableClientsActionPerformed(evt);
            }
        });

        jButtonBlockClient.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonBlockClient.setText("Заблокировать клиента");
        jButtonBlockClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlockClientActionPerformed(evt);
            }
        });

        jButtonExportClientsToPDF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonExportClientsToPDF.setText("Экспортировать данные в PDF");
        jButtonExportClientsToPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportClientsToPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClientsLayout = new javax.swing.GroupLayout(jPanelClients);
        jPanelClients.setLayout(jPanelClientsLayout);
        jPanelClientsLayout.setHorizontalGroup(
            jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneClients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
                    .addGroup(jPanelClientsLayout.createSequentialGroup()
                        .addComponent(jButtonExportClientsToPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBlockClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditDataClient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdateTableClients, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelClientsLayout.setVerticalGroup(
            jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneClients, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExportClientsToPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelClientsLayout.createSequentialGroup()
                        .addGroup(jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonUpdateTableClients, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jButtonEditDataClient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBlockClient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jTabbedPaneForm.addTab("Клиенты", jPanelClients);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneForm)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneForm)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private DefaultComboBoxModel<String> cbModel;

    private void SearchCriteriaFirst(JTable table, JComboBox<String> comboBox) {
        cbModel = new DefaultComboBoxModel<>();
        for (int i = 0; i < table.getModel().getColumnCount(); i++) {
            cbModel.addElement((String) table.getModel().getColumnName(i));
        }
        comboBox.setModel(cbModel);
        comboBox.setSelectedIndex(-1);
    }
    private void jComboBoxAvailableCarsSearchСriteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAvailableCarsSearchСriteriaFirstActionPerformed
        if (jComboBoxAvailableCarsSearchСriteriaSecond.getSelectedItem() != null) {
            jComboBoxAvailableCarsSearchСriteriaSecond.setSelectedIndex(-1);
        }
        if (jComboBoxAvailableCarsSearchСriteriaFirst.getSelectedItem() != null) {
            // Открываем доступ ко второму критерию
            jComboBoxAvailableCarsSearchСriteriaSecond.setEnabled(true);
            List listSecondCriteria = searchCriteriaService.getSearchCriteriaServicePort().getListSecondCriteria(jComboBoxAvailableCarsSearchСriteriaFirst.getSelectedItem().toString());

            cbModel = new DefaultComboBoxModel<>();

            for (int i = 0; i < listSecondCriteria.size(); i++) {
                cbModel.addElement(String.valueOf(listSecondCriteria.get(i)));
            }

            jComboBoxAvailableCarsSearchСriteriaSecond.setModel(cbModel);
            jComboBoxAvailableCarsSearchСriteriaSecond.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBoxAvailableCarsSearchСriteriaFirstActionPerformed

    private void jComboBoxListCarsSearchСriteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListCarsSearchСriteriaFirstActionPerformed
         if (jComboBoxListCarsSearchСriteriaSecond.getSelectedItem() != null) {
            jComboBoxListCarsSearchСriteriaSecond.setSelectedIndex(-1);
        }
        if (jComboBoxListCarsSearchСriteriaFirst.getSelectedItem() != null) {
            // Открываем доступ ко второму критерию
            jComboBoxListCarsSearchСriteriaSecond.setEnabled(true);
            List listSecondCriteria = searchCriteriaService.getSearchCriteriaServicePort().getListSecondCriteria(jComboBoxListCarsSearchСriteriaFirst.getSelectedItem().toString());

            cbModel = new DefaultComboBoxModel<>();

            for (int i = 0; i < listSecondCriteria.size(); i++) {
                cbModel.addElement(String.valueOf(listSecondCriteria.get(i)));
            }

            jComboBoxListCarsSearchСriteriaSecond.setModel(cbModel);
            jComboBoxListCarsSearchСriteriaSecond.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBoxListCarsSearchСriteriaFirstActionPerformed

    private void jComboBoxRentedCarsSearchСriteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRentedCarsSearchСriteriaFirstActionPerformed
        if (jComboBoxRentedCarsSearchСriteriaSecond.getSelectedItem() != null) {
            jComboBoxRentedCarsSearchСriteriaSecond.setSelectedIndex(-1);
        }
        if (jComboBoxRentedCarsSearchСriteriaFirst.getSelectedItem() != null) {
            jComboBoxRentedCarsSearchСriteriaSecond.setEnabled(true);
            String criteria = jComboBoxRentedCarsSearchСriteriaFirst.getSelectedItem().toString();
            List listSecondCriteria = searchCriteriaService.getSearchCriteriaServicePort().getListSecondCriteria(criteria);

            cbModel = new DefaultComboBoxModel<>();

            for (int i = 0; i < listSecondCriteria.size(); i++) {
                if (!"Дата аренды".equals(criteria) && !"Дата возврата".equals(criteria)) {
                    cbModel.addElement(String.valueOf(listSecondCriteria.get(i)));
                } else {
                    cbModel.addElement(String.valueOf(listSecondCriteria.get(i)).substring(0, 10));
                }
            }

            jComboBoxRentedCarsSearchСriteriaSecond.setModel(cbModel);
            jComboBoxRentedCarsSearchСriteriaSecond.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBoxRentedCarsSearchСriteriaFirstActionPerformed

    private void jPanelClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelClientsMouseClicked

    }//GEN-LAST:event_jPanelClientsMouseClicked
    private void UpdateListClients() {
        try {
            model = (DefaultTableModel) jTableClients.getModel();
            OutputToTable(clientService.getClientServicePort().getListOfClients());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void jButtonUpdateTableClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateTableClientsActionPerformed
        UpdateListClients();
    }//GEN-LAST:event_jButtonUpdateTableClientsActionPerformed

    private void jComboBoxAvailableCarsSearchСriteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAvailableCarsSearchСriteriaSecondActionPerformed
        jButtonAvailableCarsAddOrder.setEnabled(false);

        if (jComboBoxAvailableCarsSearchСriteriaSecond.getSelectedItem() != null) {
            List listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxAvailableCarsSearchСriteriaFirst.getSelectedItem().toString(),
                            jComboBoxAvailableCarsSearchСriteriaSecond.getSelectedItem().toString());

            try {
                model = (DefaultTableModel) jTableAvailableCars.getModel();
                OutputToTableCars(listCars);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                        "Ошибка",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBoxAvailableCarsSearchСriteriaSecondActionPerformed

    private void jComboBoxRentedCarsSearchСriteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRentedCarsSearchСriteriaSecondActionPerformed

        if (jComboBoxRentedCarsSearchСriteriaSecond.getSelectedItem() != null) {
            List listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListRentedCars(jComboBoxRentedCarsSearchСriteriaFirst.getSelectedItem().toString(),
                            jComboBoxRentedCarsSearchСriteriaSecond.getSelectedItem().toString());

            try {
                model = (DefaultTableModel) jTableCarsInRent.getModel();
                OutputToTableRentedCars(listCars);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                        "Ошибка",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBoxRentedCarsSearchСriteriaSecondActionPerformed

    private void jComboBoxListCarsSearchСriteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListCarsSearchСriteriaSecondActionPerformed

        if (jComboBoxListCarsSearchСriteriaSecond.getSelectedItem() != null) {
            List listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxListCarsSearchСriteriaFirst.getSelectedItem().toString(),
                            jComboBoxListCarsSearchСriteriaSecond.getSelectedItem().toString());

            try {
                model = (DefaultTableModel) jTableListCars.getModel();
                OutputToTableCars(listCars);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                        "Ошибка",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBoxListCarsSearchСriteriaSecondActionPerformed

    private void jButtonUpdateTableOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateTableOrdersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateTableOrdersActionPerformed

    private void jButtonCloseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCloseOrderActionPerformed

    private void jButtonEditDataOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditDataOrderActionPerformed

    private void jButtonBlockClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlockClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBlockClientActionPerformed

    private void jButtonEditDataClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditDataClientActionPerformed

    private void jButtonAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddCarActionPerformed

    private void jButtonEditDataCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditDataCarActionPerformed

    private void jButtonDeleteCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteCarActionPerformed

    private void jButtonExportClientsToPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportClientsToPDFActionPerformed

        JFileChooser pdfFile = new JFileChooser();
        pdfFile.setSelectedFile(new File("ListClients"));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Documents (*.pdf)|*.pdf", "pdf");
        pdfFile.setFileFilter(filter);
        if (pdfFile.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            // Получаем список клиентов
            List<Client> clients = clientService.getClientServicePort().getListOfClients();

            // Создаем документ
            Document document = new Document();
            document.setPageSize(PageSize.A4.rotate());

            TableModel tableClientsModel = jTableClients.getModel();

            try {
                String path = pdfFile.getSelectedFile().getAbsolutePath() + ".pdf";
                PdfWriter.getInstance(document, new FileOutputStream(path));
            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Открываем созданный документ для изменения данных
            document.open();

            BaseFont baseFont;
            Font font = null;
            try {
                baseFont = BaseFont.createFont("C:\\Windows\\Fonts\\arial.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
                font = new Font(baseFont, Font.DEFAULTSIZE, Font.NORMAL);
            } catch (DocumentException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Создаем таблицу и добавляем в нее данные
            PdfPTable table = new PdfPTable(jTableClients.getModel().getColumnCount() - 2);
            table.setWidthPercentage(105f);
            float[] widths = new float[]{10f, 40f, 30f, 40f, 30f, 40f};

            try {
                table.setWidths(widths);
                table.setTotalWidth(widths);
            } catch (DocumentException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

            addTableHeader(table, tableClientsModel, font);
            addRows(table, clients, font);

            try {
                document.add(table);
            } catch (DocumentException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        } else {
            JOptionPane.showMessageDialog(null, "Экспорт данных отменен!", "Внимание!", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonExportClientsToPDFActionPerformed

    private void jPanelAvailableCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelAvailableCarsComponentShown
        // Отключаем доступ ко второму критерию
        jComboBoxAvailableCarsSearchСriteriaSecond.setEnabled(false);

        SearchCriteriaFirst(jTableAvailableCars, jComboBoxAvailableCarsSearchСriteriaFirst);
    }//GEN-LAST:event_jPanelAvailableCarsComponentShown

    private void jPanelClientsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelClientsComponentShown

        UpdateListClients();
        this.setSize(1600, 730);
        this.setLocationRelativeTo(null);

    }//GEN-LAST:event_jPanelClientsComponentShown

    private void jPanelClientsComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelClientsComponentHidden
        this.setSize(1280, 730);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jPanelClientsComponentHidden

    private void jPanelRentedCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelRentedCarsComponentShown
        // Отключаем доступ ко второму критерию
        jComboBoxRentedCarsSearchСriteriaSecond.setEnabled(false);
        
        // Изменяем ширину столбца данных клиента
        jTableCarsInRent.getColumnModel().getColumn(3).setMaxWidth(300);
        jTableCarsInRent.getColumnModel().getColumn(3).setPreferredWidth(300);
        
        // Добавление данных в первый критерий поиска
        SearchCriteriaFirst(jTableCarsInRent, jComboBoxRentedCarsSearchСriteriaFirst);
        if (jComboBoxRentedCarsSearchСriteriaFirst.getItemCount() != 0) {
            jComboBoxRentedCarsSearchСriteriaFirst.removeItemAt(jComboBoxRentedCarsSearchСriteriaFirst.getItemCount() - 1);
        }

        // Получаем список арендованных автомобилей
        jButtonRentedCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jPanelRentedCarsComponentShown

    private void jPanelListCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelListCarsComponentShown
        SearchCriteriaFirst(jTableListCars, jComboBoxListCarsSearchСriteriaFirst);
        jButtonListCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jPanelListCarsComponentShown

    private void jButtonAvailableCarsUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvailableCarsUpdateTableActionPerformed
        jButtonAvailableCarsAddOrder.setEnabled(false);
        List listCars = null;
        if (jComboBoxAvailableCarsSearchСriteriaFirst.getSelectedItem() == null
                || jComboBoxAvailableCarsSearchСriteriaSecond.getSelectedItem() == null) {
            listCars = searchCriteriaService.getSearchCriteriaServicePort().getListAvailableCars(null, null);
        } else {
            listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxAvailableCarsSearchСriteriaFirst.getSelectedItem().toString(),
                            jComboBoxAvailableCarsSearchСriteriaSecond.getSelectedItem().toString());
        }
        try {
            model = (DefaultTableModel) jTableAvailableCars.getModel();
            if (listCars != null) {
                OutputToTableCars(listCars);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAvailableCarsUpdateTableActionPerformed

    private void jTableAvailableCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAvailableCarsMouseClicked
        jButtonAvailableCarsAddOrder.setEnabled(true);
    }//GEN-LAST:event_jTableAvailableCarsMouseClicked

    private void jTableCarsInRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarsInRentMouseClicked
        jButtonRentedCarsMoveToOrders.setEnabled(true);
    }//GEN-LAST:event_jTableCarsInRentMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jButtonAvailableCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_formComponentShown

    private void jButtonRentedCarsUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentedCarsUpdateTableActionPerformed

        List listCars = null;
        if (jComboBoxRentedCarsSearchСriteriaFirst.getSelectedItem() == null
                || jComboBoxRentedCarsSearchСriteriaSecond.getSelectedItem() == null) {
            listCars = searchCriteriaService.getSearchCriteriaServicePort().getListRentedCars(null, null);
        } else {
            listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListRentedCars(jComboBoxRentedCarsSearchСriteriaFirst.getSelectedItem().toString(),
                            jComboBoxRentedCarsSearchСriteriaSecond.getSelectedItem().toString());
        }
        try {
            model = (DefaultTableModel) jTableCarsInRent.getModel();
            if (listCars != null) {
                OutputToTableRentedCars(listCars);
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRentedCarsUpdateTableActionPerformed

    private void jButtonRentedCarsMoveToOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentedCarsMoveToOrdersActionPerformed
        jTabbedPaneForm.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonRentedCarsMoveToOrdersActionPerformed

    private void jButtonAvailableCarsClearSearchCriteriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvailableCarsClearSearchCriteriesActionPerformed
        jComboBoxAvailableCarsSearchСriteriaFirst.setSelectedIndex(-1);
        jComboBoxAvailableCarsSearchСriteriaSecond.setSelectedIndex(-1);
        jButtonAvailableCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jButtonAvailableCarsClearSearchCriteriesActionPerformed

    private void jButtonRentedCarsClearSearchCriteriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentedCarsClearSearchCriteriesActionPerformed
        jComboBoxRentedCarsSearchСriteriaFirst.setSelectedIndex(-1);
        jComboBoxRentedCarsSearchСriteriaSecond.setSelectedIndex(-1);
        jButtonRentedCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jButtonRentedCarsClearSearchCriteriesActionPerformed

    private void jButtonListCarsClearSearchCriteriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCarsClearSearchCriteriesActionPerformed
        jComboBoxListCarsSearchСriteriaFirst.setSelectedIndex(-1);
        jComboBoxListCarsSearchСriteriaSecond.setSelectedIndex(-1);
        jButtonListCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jButtonListCarsClearSearchCriteriesActionPerformed

    private void jButtonListCarsUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCarsUpdateTableActionPerformed

        List listCars = null;
        if (jComboBoxListCarsSearchСriteriaFirst.getSelectedItem() == null
                || jComboBoxListCarsSearchСriteriaSecond.getSelectedItem() == null) {
            listCars = searchCriteriaService.getSearchCriteriaServicePort().getListAvailableCars(null, null);
        } else {
            listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxListCarsSearchСriteriaFirst.getSelectedItem().toString(),
                            jComboBoxListCarsSearchСriteriaSecond.getSelectedItem().toString());
        }
        try {
            model = (DefaultTableModel) jTableListCars.getModel();
            if (listCars != null) {
                OutputToTableCars(listCars);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonListCarsUpdateTableActionPerformed
    private void OutputToTableCars(List listСars) throws ParseException {
        doClearTable();
        Object[] rowData = new String[7];
        int i = 0;
        for (Object var : listСars) {
            rowData[i] = String.valueOf(var);
            if (i != 0 && i % 6 == 0) {
                model.addRow(rowData);
                i = 0;
                continue;
            }
            i++;
        }
    }

    private void OutputToTableRentedCars(List listСars) throws ParseException {
        doClearTable();
        Object[] rowData = new String[7];
        int i = 0;
        for (Object var : listСars) {
            if (i != 4 && i != 5) {
                rowData[i] = String.valueOf(var);
            } else {
                rowData[i] = String.valueOf(var).substring(0, 10);
            }
            if (i == 5) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = dateFormat.parse((String) rowData[i - 1]);
                Date date2 = dateFormat.parse((String) rowData[i]);

                // Разница между датами в миллисекундах и днях
                long milliseconds = date2.getTime() - date1.getTime();
                int days = (int) (milliseconds / (24 * 60 * 60 * 1000));

                rowData[i + 1] = String.valueOf(days);

                model.addRow(rowData);
                i = 0;
                continue;
            }
            i++;
        }
    }

    private void addTableHeader(PdfPTable table, TableModel tableModel, Font font) {
        String[] array = new String[tableModel.getColumnCount() - 2];

        for (int i = 0, j = 0; i < tableModel.getColumnCount(); i++) {

            if (i == 0) {
                array[j] = "№";
                j++;
            }
            if (i != 3 && i != 4 && i != 5) {
                array[j] = tableModel.getColumnName(i);
                j++;
            }
            if (i == 7) {
                break;
            }

        }

        // Stream API
        Arrays.stream(array)
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle, font));
                    table.addCell(header);
                });
    }

    private void addRows(PdfPTable table, List<Client> clients, Font font) {
        // Добавляем записи в таблицу
        int i = 0;
        for (Client person : clients) {
            i++;
            table.addCell(new Phrase(String.valueOf(i), font));
            table.addCell(new Phrase(person.getSecondName(), font));
            table.addCell(new Phrase(person.getFirstName(), font));
            table.addCell(new Phrase(person.getMiddleName(), font));
            table.addCell(new Phrase(person.getPhoneNumber(), font));
            table.addCell(new Phrase(person.getEmail(), font));
        }
    }

    private void OutputToTable(List<Client> listClients) {
        doClearTable();

        listClients.stream().map(client -> {
            Object[] rowData = new Object[8];
            rowData[0] = client.getSecondName();
            rowData[1] = client.getFirstName();
            rowData[2] = client.getMiddleName();
            rowData[3] = client.getDateBirthday().toString().substring(0, 10);
            rowData[4] = client.getPassportData();
            rowData[5] = client.getDriversLicense();
            rowData[6] = client.getPhoneNumber();
            rowData[7] = client.getEmail();
            return rowData;
        }).forEachOrdered(rowData -> {
            model.addRow(rowData);
        });
    }

    private void doClearTable() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCar;
    private javax.swing.JButton jButtonAvailableCarsAddOrder;
    private javax.swing.JButton jButtonAvailableCarsClearSearchCriteries;
    private javax.swing.JButton jButtonAvailableCarsUpdateTable;
    private javax.swing.JButton jButtonBlockClient;
    private javax.swing.JButton jButtonCloseOrder;
    private javax.swing.JButton jButtonDeleteCar;
    private javax.swing.JButton jButtonEditDataCar;
    private javax.swing.JButton jButtonEditDataClient;
    private javax.swing.JButton jButtonEditDataOrder;
    private javax.swing.JButton jButtonEnter1;
    private javax.swing.JButton jButtonExportClientsToPDF;
    private javax.swing.JButton jButtonListCarsClearSearchCriteries;
    private javax.swing.JButton jButtonListCarsUpdateTable;
    private javax.swing.JButton jButtonRentedCarsClearSearchCriteries;
    private javax.swing.JButton jButtonRentedCarsMoveToOrders;
    private javax.swing.JButton jButtonRentedCarsUpdateTable;
    private javax.swing.JButton jButtonUpdateTableClients;
    private javax.swing.JButton jButtonUpdateTableOrders;
    private javax.swing.JComboBox<String> jComboBoxAvailableCarsSearchСriteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxAvailableCarsSearchСriteriaSecond;
    private javax.swing.JComboBox<String> jComboBoxListCarsSearchСriteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxListCarsSearchСriteriaSecond;
    private javax.swing.JComboBox<String> jComboBoxRentedCarsSearchСriteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxRentedCarsSearchСriteriaSecond;
    private javax.swing.JDialog jDialogLogin;
    private javax.swing.JLabel jLabelAvailableCarsSearchСriteriaFirst;
    private javax.swing.JLabel jLabelAvailableCarsSearchСriteriaSecond;
    private javax.swing.JLabel jLabelListCarsSearchСriteriaFirst;
    private javax.swing.JLabel jLabelListCarsSearchСriteriaSecond;
    private javax.swing.JLabel jLabelLogin1;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelRentedCarsSearchСriteriaFirst;
    private javax.swing.JLabel jLabelRentedCarsSearchСriteriaSecond;
    private javax.swing.JPanel jPanelAutopark;
    private javax.swing.JPanel jPanelAvailableCars;
    private javax.swing.JPanel jPanelClients;
    private javax.swing.JPanel jPanelListCars;
    private javax.swing.JPanel jPanelLogin1;
    private javax.swing.JPanel jPanelOrders;
    private javax.swing.JPanel jPanelRentedCars;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPaneAvailableCars;
    private javax.swing.JScrollPane jScrollPaneAvailableCars1;
    private javax.swing.JScrollPane jScrollPaneAvailableCars2;
    private javax.swing.JScrollPane jScrollPaneClients;
    private javax.swing.JScrollPane jScrollPaneOrders;
    private javax.swing.JTabbedPane jTabbedPaneAutopark;
    private javax.swing.JTabbedPane jTabbedPaneForm;
    private javax.swing.JTable jTableAvailableCars;
    private javax.swing.JTable jTableCarsInRent;
    private javax.swing.JTable jTableClients;
    private javax.swing.JTable jTableListCars;
    private javax.swing.JTable jTableOrders;
    private javax.swing.JTextField jTextFieldLogin1;
    // End of variables declaration//GEN-END:variables
}
