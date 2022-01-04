package client;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import service.endpoint.ClientServiceService;
import types.Client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.endpoint.SearchCriteriaServiceService;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
        jTableAvailableCars.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableCarsInRent.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableListCars.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableOrders.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));
        jTableClients.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 16));

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
        jPanelRentedCars = new javax.swing.JPanel();
        jButtonRentedCarsCloseOrder = new javax.swing.JButton();
        jButtonRentedCarsUpdateTable = new javax.swing.JButton();
        jLabelRentedCarsSearchСriteriaFirst = new javax.swing.JLabel();
        jLabelRentedCarsSearchСriteriaSecond = new javax.swing.JLabel();
        jComboBoxRentedCarsSearchСriteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxRentedCarsSearchСriteriaSecond = new javax.swing.JComboBox<>();
        jScrollPaneAvailableCars1 = new javax.swing.JScrollPane();
        jTableCarsInRent = new javax.swing.JTable();
        jPanelListCars = new javax.swing.JPanel();
        jButtonAddCar = new javax.swing.JButton();
        jButtonDeleteCar = new javax.swing.JButton();
        jLabelListCarsSearchСriteriaFirst = new javax.swing.JLabel();
        jLabelListCarsSearchСriteriaSecond = new javax.swing.JLabel();
        jComboBoxListCarsSearchСriteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxSearchСriteriaSecond = new javax.swing.JComboBox<>();
        jButtonEditDataCar = new javax.swing.JButton();
        jScrollPaneAvailableCars2 = new javax.swing.JScrollPane();
        jTableListCars = new javax.swing.JTable();
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

        jTableAvailableCars.setFont(getFont());
        jTableAvailableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Бренд", "Марка", "Коробка передач", "Привод", "Цвет", "Цена, руб/сут.", "Номер"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPaneAvailableCars.setViewportView(jTableAvailableCars);

        javax.swing.GroupLayout jPanelAvailableCarsLayout = new javax.swing.GroupLayout(jPanelAvailableCars);
        jPanelAvailableCars.setLayout(jPanelAvailableCarsLayout);
        jPanelAvailableCarsLayout.setHorizontalGroup(
            jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvailableCarsLayout.createSequentialGroup()
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabelAvailableCarsSearchСriteriaFirst))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvailableCarsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelAvailableCarsSearchСriteriaSecond)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxAvailableCarsSearchСriteriaFirst, 0, 276, Short.MAX_VALUE)
                            .addComponent(jComboBoxAvailableCarsSearchСriteriaSecond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAvailableCarsUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAvailableCarsAddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneAvailableCars, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneAvailableCars, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAutopark.addTab("Доступные автомобили", jPanelAvailableCars);

        jPanelRentedCars.setPreferredSize(new java.awt.Dimension(810, 100));
        jPanelRentedCars.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelRentedCarsComponentShown(evt);
            }
        });

        jButtonRentedCarsCloseOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonRentedCarsCloseOrder.setText("Завершить заказ");

        jButtonRentedCarsUpdateTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonRentedCarsUpdateTable.setText("Обновить список автомобилей");

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

        jTableCarsInRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Бренд", "Марка", "Коробка передач", "Привод", "Цвет", "Цена, руб/сут.", "Номер"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPaneAvailableCars1.setViewportView(jTableCarsInRent);

        javax.swing.GroupLayout jPanelRentedCarsLayout = new javax.swing.GroupLayout(jPanelRentedCars);
        jPanelRentedCars.setLayout(jPanelRentedCarsLayout);
        jPanelRentedCarsLayout.setHorizontalGroup(
            jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRentedCarsLayout.createSequentialGroup()
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
                            .addComponent(jComboBoxRentedCarsSearchСriteriaSecond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRentedCarsUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRentedCarsCloseOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(jButtonRentedCarsCloseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRentedCarsSearchСriteriaFirst)
                    .addComponent(jComboBoxRentedCarsSearchСriteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRentedCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRentedCarsSearchСriteriaSecond)
                        .addComponent(jComboBoxRentedCarsSearchСriteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneAvailableCars1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
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

        jComboBoxSearchСriteriaSecond.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxSearchСriteriaSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchСriteriaSecondActionPerformed(evt);
            }
        });

        jButtonEditDataCar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonEditDataCar.setText("Изменить данные автомобиля");
        jButtonEditDataCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataCarActionPerformed(evt);
            }
        });

        jTableListCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Бренд", "Марка", "Коробка передач", "Привод", "Цвет", "Цена, руб/сут.", "Номер"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
                            .addComponent(jComboBoxSearchСriteriaSecond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jComboBoxSearchСriteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEditDataCar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteCar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jComboBoxAvailableCarsSearchСriteriaSecond.setSelectedItem(null);
        if (jComboBoxAvailableCarsSearchСriteriaFirst.getSelectedItem() != null) {
            List listSecondCriteria = searchCriteriaService.getSearchCriteriaServicePort().getListSecondCriteria(jComboBoxAvailableCarsSearchСriteriaFirst.getSelectedItem().toString());
            System.out.print(listSecondCriteria.toString());
            cbModel = new DefaultComboBoxModel<>();
            for (int i = 0; i < listSecondCriteria.size(); i++)
                if (i%2 == 1) cbModel.addElement(String.valueOf(listSecondCriteria.get(i)));
            jComboBoxAvailableCarsSearchСriteriaSecond.setModel(cbModel);
            jComboBoxAvailableCarsSearchСriteriaSecond.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBoxAvailableCarsSearchСriteriaFirstActionPerformed

    private void jComboBoxListCarsSearchСriteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListCarsSearchСriteriaFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListCarsSearchСriteriaFirstActionPerformed

    private void jComboBoxRentedCarsSearchСriteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRentedCarsSearchСriteriaFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRentedCarsSearchСriteriaFirstActionPerformed

    private void jPanelClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelClientsMouseClicked

    }//GEN-LAST:event_jPanelClientsMouseClicked
    private void UpdateListClients() {
        try {
            model = (DefaultTableModel) jTableClients.getModel();
            doVivod(clientService.getClientServicePort().getListOfClients());
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
        //dfgfdg
    }//GEN-LAST:event_jComboBoxAvailableCarsSearchСriteriaSecondActionPerformed

    private void jComboBoxRentedCarsSearchСriteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRentedCarsSearchСriteriaSecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRentedCarsSearchСriteriaSecondActionPerformed

    private void jComboBoxSearchСriteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchСriteriaSecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearchСriteriaSecondActionPerformed

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

        // Получаем список клиентов
        List<Client> clients = clientService.getClientServicePort().getListOfClients();

        // Создаем документ
        Document document = new Document();
        document.setPageSize(PageSize.A4.rotate());

        TableModel tableClientsModel = jTableClients.getModel();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("ListClientsJava.pdf"));
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
    }//GEN-LAST:event_jButtonExportClientsToPDFActionPerformed

    private void jPanelAvailableCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelAvailableCarsComponentShown
        SearchCriteriaFirst(jTableAvailableCars, jComboBoxAvailableCarsSearchСriteriaFirst);
        UpdateListClients();
    }//GEN-LAST:event_jPanelAvailableCarsComponentShown

    private void jPanelClientsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelClientsComponentShown

        this.setSize(1600, 730);
        this.setLocationRelativeTo(null);

    }//GEN-LAST:event_jPanelClientsComponentShown

    private void jPanelClientsComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelClientsComponentHidden
        this.setSize(1280, 730);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jPanelClientsComponentHidden

    private void jPanelRentedCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelRentedCarsComponentShown
        SearchCriteriaFirst(jTableCarsInRent, jComboBoxRentedCarsSearchСriteriaFirst);
    }//GEN-LAST:event_jPanelRentedCarsComponentShown

    private void jPanelListCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelListCarsComponentShown
        SearchCriteriaFirst(jTableListCars, jComboBoxListCarsSearchСriteriaFirst);
    }//GEN-LAST:event_jPanelListCarsComponentShown

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

    private void doVivod(List<Client> listClients) {
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
    private javax.swing.JButton jButtonAvailableCarsUpdateTable;
    private javax.swing.JButton jButtonBlockClient;
    private javax.swing.JButton jButtonCloseOrder;
    private javax.swing.JButton jButtonDeleteCar;
    private javax.swing.JButton jButtonEditDataCar;
    private javax.swing.JButton jButtonEditDataClient;
    private javax.swing.JButton jButtonEditDataOrder;
    private javax.swing.JButton jButtonEnter1;
    private javax.swing.JButton jButtonExportClientsToPDF;
    private javax.swing.JButton jButtonRentedCarsCloseOrder;
    private javax.swing.JButton jButtonRentedCarsUpdateTable;
    private javax.swing.JButton jButtonUpdateTableClients;
    private javax.swing.JButton jButtonUpdateTableOrders;
    private javax.swing.JComboBox<String> jComboBoxAvailableCarsSearchСriteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxAvailableCarsSearchСriteriaSecond;
    private javax.swing.JComboBox<String> jComboBoxListCarsSearchСriteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxRentedCarsSearchСriteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxRentedCarsSearchСriteriaSecond;
    private javax.swing.JComboBox<String> jComboBoxSearchСriteriaSecond;
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
