package client;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
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
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultFormatter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import operation.OrderOperation;
import service.endpoint.SearchCriteriaServiceService;

public class Frame extends javax.swing.JFrame {

    public Frame() {

        initComponents();
        jTableAvailableCars.getTableHeader().setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20));
        jTableCarsInRent.getTableHeader().setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20));
        jTableListCars.getTableHeader().setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20));
        jTableOrders.getTableHeader().setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20));
        jTableClients.getTableHeader().setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20));
        jButtonAvailableCarsAddOrder.setEnabled(false);
        jDialogEditDataClient.setMinimumSize(new Dimension(800, 750));
        jDialogEditDataClient.setLocationRelativeTo(null);
        jDialogEditDataClient.setResizable(false);

        jDialogAddOrder.setLocationRelativeTo(null);

        setDefaultFormSize();

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
        jDialogEditDataClient = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEditDataClientEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonEditClientAccept = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEditDataClientPhoneNumber = new javax.swing.JTextField();
        jTextFieldEditDataClientMiddleName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonEditClientClose = new javax.swing.JButton();
        jTextFieldEditDataClientFirstName = new javax.swing.JTextField();
        jTextFieldEditDataClientSecondName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEditDataClientPassportData = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaEditDataClientDriversLicense = new javax.swing.JTextArea();
        jDialogAddOrder = new javax.swing.JDialog();
        jPanelAddOrder = new javax.swing.JPanel();
        jLabelAddOrderClientSecondName = new javax.swing.JLabel();
        jLabelAddOrderRentalCost = new javax.swing.JLabel();
        jLabelAddOrderCountDays = new javax.swing.JLabel();
        jLabelAddOrderEndDate = new javax.swing.JLabel();
        jLabelAddOrderStartDate = new javax.swing.JLabel();
        jLabelAddOrderTotalCost = new javax.swing.JLabel();
        jComboBoxAddOrderCar = new javax.swing.JComboBox<>();
        jTextFieldAddOrderRentalCost = new javax.swing.JTextField();
        jTextFieldAddOrderTotalCost = new javax.swing.JTextField();
        jTextFieldAddOrderStartDate = new javax.swing.JTextField();
        jTextFieldAddOrderEndDate = new javax.swing.JTextField();
        jButtonAddOrder = new javax.swing.JButton();
        jButtonAddOrderClose = new javax.swing.JButton();
        jTextFieldAddOrderBrandAndModel = new javax.swing.JTextField();
        jSpinnerAddOrderCountDays = new javax.swing.JSpinner();
        jLabelAddOrderCar1 = new javax.swing.JLabel();
        jLabelAddOrderClientFirstName = new javax.swing.JLabel();
        jLabelAddOrderCarAddOrderClientMiddleName = new javax.swing.JLabel();
        jLabelAddOrderClientDateBirthday = new javax.swing.JLabel();
        jLabelAddOrderClientNumberPhone = new javax.swing.JLabel();
        jLabelAddOrderClientPassportData = new javax.swing.JLabel();
        jLabelAddOrderClientDriversLicense = new javax.swing.JLabel();
        jLabelAddOrderClientEmail = new javax.swing.JLabel();
        jLabelAddOrderClient = new javax.swing.JLabel();
        jComboBoxAddOrderClient = new javax.swing.JComboBox<>();
        jLabelAddOrderCar10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldAddOrderClientSecondName = new javax.swing.JTextField();
        jTextFieldAddOrderClientFirstName = new javax.swing.JTextField();
        jTextFieldAddOrderClientMiddleName = new javax.swing.JTextField();
        jSpinnerAddOrderClientDateBirthday = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaAddOrderClientDriversLicense = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaAddOrderClientPassportData = new javax.swing.JTextArea();
        jTextFieldAddOrderClientNumberPhone = new javax.swing.JTextField();
        jTextFieldAddOrderClientEmail = new javax.swing.JTextField();
        jLabelInfoAboutFields = new javax.swing.JLabel();
        jButtonAddOrderClearClient = new javax.swing.JButton();
        jLabelAddOrderDateFormat = new javax.swing.JLabel();
        jTabbedPaneForm = new javax.swing.JTabbedPane();
        jPanelAutopark = new javax.swing.JPanel();
        jTabbedPaneAutopark = new javax.swing.JTabbedPane();
        jPanelAvailableCars = new javax.swing.JPanel();
        jButtonAvailableCarsAddOrder = new javax.swing.JButton();
        jButtonAvailableCarsUpdateTable = new javax.swing.JButton();
        jLabelAvailableCarsSearch??riteriaFirst = new javax.swing.JLabel();
        jLabelAvailableCarsSearch??riteriaSecond = new javax.swing.JLabel();
        jComboBoxAvailableCarsSearch??riteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxAvailableCarsSearch??riteriaSecond = new javax.swing.JComboBox<>();
        jScrollPaneAvailableCars = new javax.swing.JScrollPane();
        jTableAvailableCars = new javax.swing.JTable();
        jButtonAvailableCarsClearSearchCriteries = new javax.swing.JButton();
        jLabelAvailableCarsCount = new javax.swing.JLabel();
        jPanelRentedCars = new javax.swing.JPanel();
        jButtonRentedCarsMoveToOrders = new javax.swing.JButton();
        jButtonRentedCarsUpdateTable = new javax.swing.JButton();
        jLabelRentedCarsSearch??riteriaFirst = new javax.swing.JLabel();
        jLabelRentedCarsSearch??riteriaSecond = new javax.swing.JLabel();
        jComboBoxRentedCarsSearch??riteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxRentedCarsSearch??riteriaSecond = new javax.swing.JComboBox<>();
        jScrollPaneAvailableCars1 = new javax.swing.JScrollPane();
        jTableCarsInRent = new javax.swing.JTable();
        jButtonRentedCarsClearSearchCriteries = new javax.swing.JButton();
        jLabelCarsInRentCount = new javax.swing.JLabel();
        jPanelListCars = new javax.swing.JPanel();
        jButtonAddCar = new javax.swing.JButton();
        jButtonDeleteCar = new javax.swing.JButton();
        jLabelListCarsSearch??riteriaFirst = new javax.swing.JLabel();
        jLabelListCarsSearch??riteriaSecond = new javax.swing.JLabel();
        jComboBoxListCarsSearch??riteriaFirst = new javax.swing.JComboBox<>();
        jComboBoxListCarsSearch??riteriaSecond = new javax.swing.JComboBox<>();
        jButtonEditDataCar = new javax.swing.JButton();
        jScrollPaneAvailableCars2 = new javax.swing.JScrollPane();
        jTableListCars = new javax.swing.JTable();
        jButtonListCarsClearSearchCriteries = new javax.swing.JButton();
        jButtonListCarsUpdateTable = new javax.swing.JButton();
        jLabelListCarsCount = new javax.swing.JLabel();
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
        jDialogLogin.setTitle("??????????????????????");
        jDialogLogin.setName("dialogLogin"); // NOI18N
        jDialogLogin.setResizable(false);

        jTextFieldLogin1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldLogin1.setToolTipText("?????????????? ??????????");

        jLabelLogin1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLogin1.setText("??????????:");

        jLabelPassword1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPassword1.setText("????????????:");

        jButtonEnter1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonEnter1.setText("??????????");

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

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setText("??????:");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel4.setText("?????????? ????????????????:");

        jTextFieldEditDataClientEmail.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel6.setText("???????????????????????? ??????????????????????????:");

        jButtonEditClientAccept.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonEditClientAccept.setText("????????????????");
        jButtonEditClientAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditClientAcceptActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel5.setText("???????????????????? ????????????:");

        jTextFieldEditDataClientPhoneNumber.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldEditDataClientMiddleName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("??????????????:");

        jButtonEditClientClose.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonEditClientClose.setText("????????????");
        jButtonEditClientClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditClientCloseActionPerformed(evt);
            }
        });

        jTextFieldEditDataClientFirstName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldEditDataClientSecondName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("?????????????????????? ??????????:");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setText("????????????????:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        jTextAreaEditDataClientPassportData.setColumns(20);
        jTextAreaEditDataClientPassportData.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTextAreaEditDataClientPassportData.setLineWrap(true);
        jTextAreaEditDataClientPassportData.setRows(5);
        jTextAreaEditDataClientPassportData.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaEditDataClientPassportData);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBar(null);

        jTextAreaEditDataClientDriversLicense.setColumns(20);
        jTextAreaEditDataClientDriversLicense.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTextAreaEditDataClientDriversLicense.setLineWrap(true);
        jTextAreaEditDataClientDriversLicense.setRows(5);
        jTextAreaEditDataClientDriversLicense.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextAreaEditDataClientDriversLicense);

        javax.swing.GroupLayout jDialogEditDataClientLayout = new javax.swing.GroupLayout(jDialogEditDataClient.getContentPane());
        jDialogEditDataClient.getContentPane().setLayout(jDialogEditDataClientLayout);
        jDialogEditDataClientLayout.setHorizontalGroup(
            jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEditDataClientLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialogEditDataClientLayout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogEditDataClientLayout.createSequentialGroup()
                        .addComponent(jButtonEditClientAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditClientClose, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldEditDataClientMiddleName)
                    .addComponent(jTextFieldEditDataClientFirstName)
                    .addComponent(jTextFieldEditDataClientSecondName)
                    .addComponent(jTextFieldEditDataClientEmail)
                    .addComponent(jTextFieldEditDataClientPhoneNumber)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jDialogEditDataClientLayout.setVerticalGroup(
            jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEditDataClientLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldEditDataClientSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEditDataClientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditDataClientMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogEditDataClientLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogEditDataClientLayout.createSequentialGroup()
                        .addComponent(jTextFieldEditDataClientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditDataClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jDialogEditDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditClientAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditClientClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jDialogAddOrder.setMinimumSize(new java.awt.Dimension(1350, 800));
        jDialogAddOrder.setResizable(false);
        jDialogAddOrder.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jDialogAddOrderComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jDialogAddOrderComponentShown(evt);
            }
        });

        jLabelAddOrderClientSecondName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClientSecondName.setText("??????????????*:");

        jLabelAddOrderRentalCost.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderRentalCost.setText("?????????????????? ??????./??????.:");

        jLabelAddOrderCountDays.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderCountDays.setText("???????????????????? ????????:");

        jLabelAddOrderEndDate.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderEndDate.setText("???????? ????????????????:");

        jLabelAddOrderStartDate.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderStartDate.setText("???????? ????????????:");

        jLabelAddOrderTotalCost.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderTotalCost.setText("???????????????? ??????????????????:");

        jComboBoxAddOrderCar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jComboBoxAddOrderCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAddOrderCarActionPerformed(evt);
            }
        });

        jTextFieldAddOrderRentalCost.setEditable(false);
        jTextFieldAddOrderRentalCost.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldAddOrderTotalCost.setEditable(false);
        jTextFieldAddOrderTotalCost.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldAddOrderStartDate.setEditable(false);
        jTextFieldAddOrderStartDate.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldAddOrderEndDate.setEditable(false);
        jTextFieldAddOrderEndDate.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jButtonAddOrder.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonAddOrder.setText("???????????????? ??????????");
        jButtonAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddOrderActionPerformed(evt);
            }
        });

        jButtonAddOrderClose.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonAddOrderClose.setText("????????????");
        jButtonAddOrderClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddOrderCloseActionPerformed(evt);
            }
        });

        jTextFieldAddOrderBrandAndModel.setEditable(false);
        jTextFieldAddOrderBrandAndModel.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jSpinnerAddOrderCountDays.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jSpinnerAddOrderCountDays.setModel(new javax.swing.SpinnerNumberModel(1, 1, 365, 1));
        jSpinnerAddOrderCountDays.setValue(1);
        jSpinnerAddOrderCountDays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinnerAddOrderCountDaysMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSpinnerAddOrderCountDaysMousePressed(evt);
            }
        });
        jSpinnerAddOrderCountDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinnerAddOrderCountDaysKeyTyped(evt);
            }
        });

        jLabelAddOrderCar1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderCar1.setText("????????????????????:");

        jLabelAddOrderClientFirstName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClientFirstName.setText("??????*:");

        jLabelAddOrderCarAddOrderClientMiddleName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderCarAddOrderClientMiddleName.setText("????????????????:");

        jLabelAddOrderClientDateBirthday.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClientDateBirthday.setText("???????? ????????????????*:");

        jLabelAddOrderClientNumberPhone.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClientNumberPhone.setText("?????????? ????????????????*:");

        jLabelAddOrderClientPassportData.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClientPassportData.setText("???????????????????? ????????????*:");

        jLabelAddOrderClientDriversLicense.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClientDriversLicense.setText("???????????????????????? ??????????????????????????*:");

        jLabelAddOrderClientEmail.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClientEmail.setText("?????????????????????? ??????????*:");

        jLabelAddOrderClient.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderClient.setText("???????????????? ?????????????????????????? ??????????????:");

        jComboBoxAddOrderClient.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jComboBoxAddOrderClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAddOrderClientActionPerformed(evt);
            }
        });

        jLabelAddOrderCar10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAddOrderCar10.setText("?????? ?????????????? ???????????? ?? ?????????? ??????????????:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextFieldAddOrderClientSecondName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldAddOrderClientFirstName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldAddOrderClientMiddleName.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jSpinnerAddOrderClientDateBirthday.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jSpinnerAddOrderClientDateBirthday.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(978210000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinnerAddOrderClientDateBirthday.setEditor(new javax.swing.JSpinner.DateEditor(jSpinnerAddOrderClientDateBirthday, "yyyy-MM-dd"));
        jSpinnerAddOrderClientDateBirthday.setNextFocusableComponent(jTextAreaAddOrderClientPassportData);
        jSpinnerAddOrderClientDateBirthday.setOpaque(false);

        jTextAreaAddOrderClientDriversLicense.setColumns(20);
        jTextAreaAddOrderClientDriversLicense.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTextAreaAddOrderClientDriversLicense.setLineWrap(true);
        jTextAreaAddOrderClientDriversLicense.setRows(5);
        jTextAreaAddOrderClientDriversLicense.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextAreaAddOrderClientDriversLicense);

        jTextAreaAddOrderClientPassportData.setColumns(20);
        jTextAreaAddOrderClientPassportData.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTextAreaAddOrderClientPassportData.setLineWrap(true);
        jTextAreaAddOrderClientPassportData.setRows(5);
        jTextAreaAddOrderClientPassportData.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextAreaAddOrderClientPassportData);

        jTextFieldAddOrderClientNumberPhone.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jTextFieldAddOrderClientEmail.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jLabelInfoAboutFields.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabelInfoAboutFields.setText("* - ????????, ???????????????????????? ?????? ????????????????????");

        jButtonAddOrderClearClient.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonAddOrderClearClient.setText("???????????????? ??????????");
        jButtonAddOrderClearClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddOrderClearClientActionPerformed(evt);
            }
        });

        jLabelAddOrderDateFormat.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabelAddOrderDateFormat.setText("(??????-??????????-????????)");

        javax.swing.GroupLayout jPanelAddOrderLayout = new javax.swing.GroupLayout(jPanelAddOrder);
        jPanelAddOrder.setLayout(jPanelAddOrderLayout);
        jPanelAddOrderLayout.setHorizontalGroup(
            jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                            .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelAddOrderStartDate)
                                .addComponent(jLabelAddOrderEndDate)
                                .addComponent(jLabelAddOrderCountDays)
                                .addComponent(jLabelAddOrderRentalCost))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldAddOrderStartDate)
                                .addComponent(jTextFieldAddOrderEndDate)
                                .addComponent(jTextFieldAddOrderRentalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerAddOrderCountDays, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddOrderLayout.createSequentialGroup()
                            .addComponent(jLabelAddOrderTotalCost)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldAddOrderTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabelAddOrderCar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAddOrderCar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAddOrderBrandAndModel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButtonAddOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddOrderClose)))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                        .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                                    .addGap(178, 178, 178)
                                    .addComponent(jLabelAddOrderClientDateBirthday))
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelAddOrderClientPassportData)
                                            .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                                                    .addGap(48, 48, 48)
                                                    .addComponent(jLabelAddOrderClientFirstName))
                                                .addComponent(jLabelAddOrderClientSecondName)
                                                .addComponent(jLabelAddOrderCarAddOrderClientMiddleName))))
                                    .addComponent(jLabelAddOrderClientDriversLicense, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAddOrderClientNumberPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAddOrderClientEmail, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jButtonAddOrderClearClient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAddOrderClientEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAddOrderClientNumberPhone)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAddOrderClientSecondName)
                            .addComponent(jTextFieldAddOrderClientFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAddOrderClientMiddleName)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAddOrderCar10)
                                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                                        .addComponent(jSpinnerAddOrderClientDateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelAddOrderDateFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabelInfoAboutFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                        .addComponent(jLabelAddOrderClient)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBoxAddOrderClient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAddOrderLayout.setVerticalGroup(
            jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                        .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabelAddOrderClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAddOrderClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAddOrderClearClient)
                                    .addComponent(jLabelAddOrderCar10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderClientSecondName)
                                    .addComponent(jTextFieldAddOrderClientSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderClientFirstName)
                                    .addComponent(jTextFieldAddOrderClientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderCarAddOrderClientMiddleName)
                                    .addComponent(jTextFieldAddOrderClientMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinnerAddOrderClientDateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAddOrderClientDateBirthday)
                                    .addComponent(jLabelAddOrderDateFormat))
                                .addGap(19, 19, 19)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAddOrderClientPassportData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAddOrderClientDriversLicense))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldAddOrderClientNumberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAddOrderClientNumberPhone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderClientEmail)
                                    .addComponent(jTextFieldAddOrderClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelInfoAboutFields))
                            .addGroup(jPanelAddOrderLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxAddOrderCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAddOrderCar1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAddOrderBrandAndModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderRentalCost)
                                    .addComponent(jTextFieldAddOrderRentalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderCountDays)
                                    .addComponent(jSpinnerAddOrderCountDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderTotalCost)
                                    .addComponent(jTextFieldAddOrderTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAddOrderStartDate)
                                    .addComponent(jTextFieldAddOrderStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAddOrderEndDate)
                                    .addComponent(jTextFieldAddOrderEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanelAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAddOrder)
                                    .addComponent(jButtonAddOrderClose))))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogAddOrderLayout = new javax.swing.GroupLayout(jDialogAddOrder.getContentPane());
        jDialogAddOrder.getContentPane().setLayout(jDialogAddOrderLayout);
        jDialogAddOrderLayout.setHorizontalGroup(
            jDialogAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAddOrderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jDialogAddOrderLayout.setVerticalGroup(
            jDialogAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAddOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("???????????? ??????????????????????");
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jTabbedPaneForm.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jPanelAutopark.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jPanelAutopark.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelAutoparkComponentShown(evt);
            }
        });

        jTabbedPaneAutopark.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        jPanelAvailableCars.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jPanelAvailableCars.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelAvailableCarsComponentShown(evt);
            }
        });

        jButtonAvailableCarsAddOrder.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonAvailableCarsAddOrder.setText("???????????????? ??????????");
        jButtonAvailableCarsAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvailableCarsAddOrderActionPerformed(evt);
            }
        });

        jButtonAvailableCarsUpdateTable.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonAvailableCarsUpdateTable.setText("???????????????? ???????????? ??????????????????????");
        jButtonAvailableCarsUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvailableCarsUpdateTableActionPerformed(evt);
            }
        });

        jLabelAvailableCarsSearch??riteriaFirst.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAvailableCarsSearch??riteriaFirst.setText("???????????????? ???????????????? ????????????:");

        jLabelAvailableCarsSearch??riteriaSecond.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelAvailableCarsSearch??riteriaSecond.setText("???????????????? ???? ????????????:");

        jComboBoxAvailableCarsSearch??riteriaFirst.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jComboBoxAvailableCarsSearch??riteriaFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAvailableCarsSearch??riteriaFirstActionPerformed(evt);
            }
        });

        jComboBoxAvailableCarsSearch??riteriaSecond.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jComboBoxAvailableCarsSearch??riteriaSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAvailableCarsSearch??riteriaSecondActionPerformed(evt);
            }
        });

        jTableAvailableCars.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTableAvailableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??????????", "????????????", "?????????????? ??????????????", "????????????", "????????", "????????, ??????/??????.", "??????????"
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
        jTableAvailableCars.setRowHeight(28);
        jTableAvailableCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAvailableCarsMouseClicked(evt);
            }
        });
        jScrollPaneAvailableCars.setViewportView(jTableAvailableCars);

        jButtonAvailableCarsClearSearchCriteries.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonAvailableCarsClearSearchCriteries.setText("???????????????? ???????? ????????????");
        jButtonAvailableCarsClearSearchCriteries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvailableCarsClearSearchCriteriesActionPerformed(evt);
            }
        });

        jLabelAvailableCarsCount.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabelAvailableCarsCount.setText("???????????????????? ?????????????????????? ?? ??????????????: 10");

        javax.swing.GroupLayout jPanelAvailableCarsLayout = new javax.swing.GroupLayout(jPanelAvailableCars);
        jPanelAvailableCars.setLayout(jPanelAvailableCarsLayout);
        jPanelAvailableCarsLayout.setHorizontalGroup(
            jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAvailableCars, javax.swing.GroupLayout.DEFAULT_SIZE, 1631, Short.MAX_VALUE)
                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabelAvailableCarsSearch??riteriaFirst))
                                    .addComponent(jLabelAvailableCarsSearch??riteriaSecond, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxAvailableCarsSearch??riteriaFirst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAvailableCarsSearch??riteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonAvailableCarsClearSearchCriteries))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAvailableCarsCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAvailableCarsUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAvailableCarsAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelAvailableCarsLayout.setVerticalGroup(
            jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAvailableCarsSearch??riteriaFirst)
                            .addComponent(jComboBoxAvailableCarsSearch??riteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAvailableCarsSearch??riteriaSecond)
                            .addComponent(jComboBoxAvailableCarsSearch??riteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAvailableCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAvailableCarsClearSearchCriteries)
                            .addComponent(jLabelAvailableCarsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAvailableCarsLayout.createSequentialGroup()
                        .addComponent(jButtonAvailableCarsAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAvailableCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneAvailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPaneAutopark.addTab("?????????????????? ????????????????????", jPanelAvailableCars);

        jPanelRentedCars.setPreferredSize(new java.awt.Dimension(810, 100));
        jPanelRentedCars.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelRentedCarsComponentShown(evt);
            }
        });

        jButtonRentedCarsMoveToOrders.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonRentedCarsMoveToOrders.setActionCommand("?????????????? ?? ??????????????");
        jButtonRentedCarsMoveToOrders.setLabel("?????????????? ?? ??????????????");
        jButtonRentedCarsMoveToOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentedCarsMoveToOrdersActionPerformed(evt);
            }
        });

        jButtonRentedCarsUpdateTable.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonRentedCarsUpdateTable.setText("???????????????? ???????????? ??????????????????????");
        jButtonRentedCarsUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentedCarsUpdateTableActionPerformed(evt);
            }
        });

        jLabelRentedCarsSearch??riteriaFirst.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelRentedCarsSearch??riteriaFirst.setText("???????????????? ???????????????? ????????????:");

        jLabelRentedCarsSearch??riteriaSecond.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelRentedCarsSearch??riteriaSecond.setText("???????????????? ???? ????????????:");

        jComboBoxRentedCarsSearch??riteriaFirst.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jComboBoxRentedCarsSearch??riteriaFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRentedCarsSearch??riteriaFirstActionPerformed(evt);
            }
        });

        jComboBoxRentedCarsSearch??riteriaSecond.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jComboBoxRentedCarsSearch??riteriaSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRentedCarsSearch??riteriaSecondActionPerformed(evt);
            }
        });

        jTableCarsInRent.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTableCarsInRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??????????", "????????????", "??????????", "????????????", "???????? ????????????", "???????? ????????????????", "???????????????????? ????????"
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
        jTableCarsInRent.setRowHeight(28);
        jTableCarsInRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarsInRentMouseClicked(evt);
            }
        });
        jScrollPaneAvailableCars1.setViewportView(jTableCarsInRent);

        jButtonRentedCarsClearSearchCriteries.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonRentedCarsClearSearchCriteries.setText("???????????????? ???????? ????????????");
        jButtonRentedCarsClearSearchCriteries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentedCarsClearSearchCriteriesActionPerformed(evt);
            }
        });

        jLabelCarsInRentCount.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabelCarsInRentCount.setText("???????????????????? ?????????????????????? ?? ??????????????: 10");

        javax.swing.GroupLayout jPanelRentedCarsLayout = new javax.swing.GroupLayout(jPanelRentedCars);
        jPanelRentedCars.setLayout(jPanelRentedCarsLayout);
        jPanelRentedCarsLayout.setHorizontalGroup(
            jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneAvailableCars1))
                    .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRentedCarsSearch??riteriaFirst)
                                    .addComponent(jLabelRentedCarsSearch??riteriaSecond, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxRentedCarsSearch??riteriaFirst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxRentedCarsSearch??riteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonRentedCarsClearSearchCriteries))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCarsInRentCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRentedCarsUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRentedCarsMoveToOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelRentedCarsLayout.setVerticalGroup(
            jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonRentedCarsMoveToOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRentedCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRentedCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRentedCarsSearch??riteriaFirst)
                            .addComponent(jComboBoxRentedCarsSearch??riteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRentedCarsSearch??riteriaSecond)
                            .addComponent(jComboBoxRentedCarsSearch??riteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRentedCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRentedCarsClearSearchCriteries)
                            .addComponent(jLabelCarsInRentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addComponent(jScrollPaneAvailableCars1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPaneAutopark.addTab("???????????????????? ?? ??????????????", jPanelRentedCars);

        jPanelListCars.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelListCarsComponentShown(evt);
            }
        });

        jButtonAddCar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonAddCar.setText("???????????????? ????????????????????");
        jButtonAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCarActionPerformed(evt);
            }
        });

        jButtonDeleteCar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonDeleteCar.setText("?????????????? ????????????????????");
        jButtonDeleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCarActionPerformed(evt);
            }
        });

        jLabelListCarsSearch??riteriaFirst.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelListCarsSearch??riteriaFirst.setText("???????????????? ???????????????? ????????????:");

        jLabelListCarsSearch??riteriaSecond.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabelListCarsSearch??riteriaSecond.setText("???????????????? ???? ????????????:");

        jComboBoxListCarsSearch??riteriaFirst.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jComboBoxListCarsSearch??riteriaFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListCarsSearch??riteriaFirstActionPerformed(evt);
            }
        });

        jComboBoxListCarsSearch??riteriaSecond.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jComboBoxListCarsSearch??riteriaSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListCarsSearch??riteriaSecondActionPerformed(evt);
            }
        });

        jButtonEditDataCar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonEditDataCar.setText("???????????????? ???????????? ????????????????????");
        jButtonEditDataCar.setMinimumSize(new java.awt.Dimension(319, 40));
        jButtonEditDataCar.setPreferredSize(new java.awt.Dimension(315, 30));
        jButtonEditDataCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataCarActionPerformed(evt);
            }
        });

        jTableListCars.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTableListCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??????????", "????????????", "?????????????? ??????????????", "????????????", "????????", "????????, ??????/??????.", "??????????"
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
        jTableListCars.setRowHeight(28);
        jScrollPaneAvailableCars2.setViewportView(jTableListCars);

        jButtonListCarsClearSearchCriteries.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonListCarsClearSearchCriteries.setText("???????????????? ???????? ????????????");
        jButtonListCarsClearSearchCriteries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCarsClearSearchCriteriesActionPerformed(evt);
            }
        });

        jButtonListCarsUpdateTable.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonListCarsUpdateTable.setText("???????????????? ???????????? ??????????????????????");
        jButtonListCarsUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCarsUpdateTableActionPerformed(evt);
            }
        });

        jLabelListCarsCount.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        jLabelListCarsCount.setText("???????????????????? ?????????????????????? ?? ??????????????: 10");

        javax.swing.GroupLayout jPanelListCarsLayout = new javax.swing.GroupLayout(jPanelListCars);
        jPanelListCars.setLayout(jPanelListCarsLayout);
        jPanelListCarsLayout.setHorizontalGroup(
            jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListCarsLayout.createSequentialGroup()
                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneAvailableCars2))
                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelListCarsLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                                        .addComponent(jLabelListCarsSearch??riteriaSecond)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxListCarsSearch??riteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonListCarsClearSearchCriteries))
                                .addGap(30, 30, 30)
                                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonListCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelListCarsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelListCarsLayout.createSequentialGroup()
                                .addComponent(jLabelListCarsSearch??riteriaFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxListCarsSearch??riteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditDataCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDeleteCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelListCarsLayout.setVerticalGroup(
            jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListCarsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                        .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelListCarsSearch??riteriaFirst)
                            .addComponent(jComboBoxListCarsSearch??riteriaFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelListCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelListCarsSearch??riteriaSecond)
                            .addComponent(jComboBoxListCarsSearch??riteriaSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListCarsClearSearchCriteries))
                    .addGroup(jPanelListCarsLayout.createSequentialGroup()
                        .addComponent(jButtonAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditDataCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListCarsLayout.createSequentialGroup()
                        .addComponent(jButtonListCarsUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelListCarsCount)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneAvailableCars2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jLabelListCarsCount.getAccessibleContext().setAccessibleName("");

        jTabbedPaneAutopark.addTab("???????????? ??????????????????????", jPanelListCars);

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

        jTabbedPaneAutopark.getAccessibleContext().setAccessibleName("???????????????????? ?? ??????????????");

        jTabbedPaneForm.addTab("????????????????", jPanelAutopark);

        jPanelOrders.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jPanelOrders.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelOrdersComponentShown(evt);
            }
        });

        jButtonCloseOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonCloseOrder.setText("?????????????????? ??????????");
        jButtonCloseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseOrderActionPerformed(evt);
            }
        });

        jButtonUpdateTableOrders.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonUpdateTableOrders.setText("???????????????? ????????????");
        jButtonUpdateTableOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateTableOrdersActionPerformed(evt);
            }
        });

        jButtonEditDataOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonEditDataOrder.setText("???????????????? ???????????? ????????????");
        jButtonEditDataOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataOrderActionPerformed(evt);
            }
        });

        jTableOrders.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "????????????", "????????????????????", "???????? ????????????", "???????? ??????????????????", "???????????????????? ????????", "??????????????????, ??????."
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
        jTableOrders.setRowHeight(28);
        jTableOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrdersMouseClicked(evt);
            }
        });
        jScrollPaneOrders.setViewportView(jTableOrders);

        javax.swing.GroupLayout jPanelOrdersLayout = new javax.swing.GroupLayout(jPanelOrders);
        jPanelOrders.setLayout(jPanelOrdersLayout);
        jPanelOrdersLayout.setHorizontalGroup(
            jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1636, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrdersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCloseOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditDataOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdateTableOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelOrdersLayout.setVerticalGroup(
            jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUpdateTableOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditDataOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCloseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPaneForm.addTab("????????????", jPanelOrders);

        jPanelClients.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jPanelClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelClientsMouseClicked(evt);
            }
        });
        jPanelClients.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelClientsComponentShown(evt);
            }
        });

        jTableClients.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jTableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??????????????", "??????", "????????????????", "???????? ????????????????", "???????????????????? ????????????", "???????????????????????? ??????????????????????????", "?????????? ????????????????", "?????????????????????? ??????????"
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
        jTableClients.setRowHeight(28);
        jTableClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientsMouseClicked(evt);
            }
        });
        jScrollPaneClients.setViewportView(jTableClients);

        jButtonEditDataClient.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonEditDataClient.setText("???????????????? ???????????? ??????????????");
        jButtonEditDataClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataClientActionPerformed(evt);
            }
        });

        jButtonUpdateTableClients.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonUpdateTableClients.setText("???????????????? ????????????");
        jButtonUpdateTableClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateTableClientsActionPerformed(evt);
            }
        });

        jButtonBlockClient.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonBlockClient.setText("?????????????????????????? ??????????????");
        jButtonBlockClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlockClientActionPerformed(evt);
            }
        });

        jButtonExportClientsToPDF.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jButtonExportClientsToPDF.setText("???????????????????????????? ???????????? ?? PDF");
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
                    .addComponent(jScrollPaneClients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1636, Short.MAX_VALUE)
                    .addGroup(jPanelClientsLayout.createSequentialGroup()
                        .addComponent(jButtonExportClientsToPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBlockClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdateTableClients, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelClientsLayout.setVerticalGroup(
            jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneClients, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExportClientsToPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelClientsLayout.createSequentialGroup()
                        .addGroup(jPanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonUpdateTableClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBlockClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jTabbedPaneForm.addTab("??????????????", jPanelClients);

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
    private void jComboBoxAvailableCarsSearch??riteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAvailableCarsSearch??riteriaFirstActionPerformed
        if (jComboBoxAvailableCarsSearch??riteriaSecond.getSelectedItem() != null) {
            jComboBoxAvailableCarsSearch??riteriaSecond.setSelectedIndex(-1);
        }
        if (jComboBoxAvailableCarsSearch??riteriaFirst.getSelectedItem() != null) {
            // ?????????????????? ???????????? ???? ?????????????? ????????????????
            jComboBoxAvailableCarsSearch??riteriaSecond.setEnabled(true);
            List listSecondCriteria = searchCriteriaService.getSearchCriteriaServicePort().getListSecondCriteria(jComboBoxAvailableCarsSearch??riteriaFirst.getSelectedItem().toString());

            cbModel = new DefaultComboBoxModel<>();

            for (int i = 0; i < listSecondCriteria.size(); i++) {
                cbModel.addElement(String.valueOf(listSecondCriteria.get(i)));
            }

            jComboBoxAvailableCarsSearch??riteriaSecond.setModel(cbModel);
            jComboBoxAvailableCarsSearch??riteriaSecond.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBoxAvailableCarsSearch??riteriaFirstActionPerformed

    private void jComboBoxListCarsSearch??riteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListCarsSearch??riteriaFirstActionPerformed

        if (jComboBoxListCarsSearch??riteriaSecond.getSelectedItem() != null) {
            jComboBoxListCarsSearch??riteriaSecond.setSelectedIndex(-1);
        }
        if (jComboBoxListCarsSearch??riteriaFirst.getSelectedItem() != null) {
            // ?????????????????? ???????????? ???? ?????????????? ????????????????
            jComboBoxListCarsSearch??riteriaSecond.setEnabled(true);
            List listSecondCriteria = searchCriteriaService.getSearchCriteriaServicePort().getListSecondCriteria(jComboBoxListCarsSearch??riteriaFirst.getSelectedItem().toString());

            cbModel = new DefaultComboBoxModel<>();

            for (int i = 0; i < listSecondCriteria.size(); i++) {
                cbModel.addElement(String.valueOf(listSecondCriteria.get(i)));
            }

            jComboBoxListCarsSearch??riteriaSecond.setModel(cbModel);
            jComboBoxListCarsSearch??riteriaSecond.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBoxListCarsSearch??riteriaFirstActionPerformed

    private void jComboBoxRentedCarsSearch??riteriaFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRentedCarsSearch??riteriaFirstActionPerformed
        if (jComboBoxRentedCarsSearch??riteriaSecond.getSelectedItem() != null) {
            jComboBoxRentedCarsSearch??riteriaSecond.setSelectedIndex(-1);
        }
        if (jComboBoxRentedCarsSearch??riteriaFirst.getSelectedItem() != null) {
            jComboBoxRentedCarsSearch??riteriaSecond.setEnabled(true);
            String criteria = jComboBoxRentedCarsSearch??riteriaFirst.getSelectedItem().toString();
            List listSecondCriteria = searchCriteriaService.getSearchCriteriaServicePort().getListSecondCriteria(criteria);

            cbModel = new DefaultComboBoxModel<>();

            for (int i = 0; i < listSecondCriteria.size(); i++) {
                if (!"???????? ????????????".equals(criteria) && !"???????? ????????????????".equals(criteria)) {
                    cbModel.addElement(String.valueOf(listSecondCriteria.get(i)));
                } else {
                    cbModel.addElement(String.valueOf(listSecondCriteria.get(i)).substring(0, 10));
                }
            }

            jComboBoxRentedCarsSearch??riteriaSecond.setModel(cbModel);
            jComboBoxRentedCarsSearch??riteriaSecond.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBoxRentedCarsSearch??riteriaFirstActionPerformed

    private void jPanelClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelClientsMouseClicked

    }//GEN-LAST:event_jPanelClientsMouseClicked
    private void UpdateListClients() {
        try {
            jButtonEditDataClient.setEnabled(false);
            jButtonBlockClient.setEnabled(false);

            model = (DefaultTableModel) jTableClients.getModel();
            OutputToTable(clientService.getClientServicePort().getListOfClients());

            if (jTableClients.getRowCount() == 0) {
                jButtonExportClientsToPDF.setEnabled(false);
            } else {
                jButtonExportClientsToPDF.setEnabled(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                    "????????????",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void jButtonUpdateTableClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateTableClientsActionPerformed
        UpdateListClients();
    }//GEN-LAST:event_jButtonUpdateTableClientsActionPerformed

    private void jComboBoxAvailableCarsSearch??riteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAvailableCarsSearch??riteriaSecondActionPerformed
        jButtonAvailableCarsAddOrder.setEnabled(false);

        if (jComboBoxAvailableCarsSearch??riteriaSecond.getSelectedItem() != null) {
            List listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxAvailableCarsSearch??riteriaFirst.getSelectedItem().toString(),
                            jComboBoxAvailableCarsSearch??riteriaSecond.getSelectedItem().toString(), true);

            try {
                model = (DefaultTableModel) jTableAvailableCars.getModel();
                OutputToTableCars(listCars);
                jLabelAvailableCarsCount.setText("???????????????????? ?????????????????????? ?? ??????????????: " + jTableAvailableCars.getModel().getRowCount());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                        "????????????",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBoxAvailableCarsSearch??riteriaSecondActionPerformed

    private void jComboBoxRentedCarsSearch??riteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRentedCarsSearch??riteriaSecondActionPerformed

        if (jComboBoxRentedCarsSearch??riteriaSecond.getSelectedItem() != null) {
            List listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListRentedCars(jComboBoxRentedCarsSearch??riteriaFirst.getSelectedItem().toString(),
                            jComboBoxRentedCarsSearch??riteriaSecond.getSelectedItem().toString());

            try {
                model = (DefaultTableModel) jTableCarsInRent.getModel();
                OutputToTableRentedCars(listCars);
                jLabelCarsInRentCount.setText("???????????????????? ?????????????????????? ?? ??????????????: " + jTableCarsInRent.getModel().getRowCount());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                        "????????????",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBoxRentedCarsSearch??riteriaSecondActionPerformed

    private void jComboBoxListCarsSearch??riteriaSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListCarsSearch??riteriaSecondActionPerformed

        if (jComboBoxListCarsSearch??riteriaSecond.getSelectedItem() != null) {
            List listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxListCarsSearch??riteriaFirst.getSelectedItem().toString(),
                            jComboBoxListCarsSearch??riteriaSecond.getSelectedItem().toString(), false);

            try {
                model = (DefaultTableModel) jTableListCars.getModel();
                OutputToTableCars(listCars);
                jLabelListCarsCount.setText("???????????????????? ?????????????????????? ?? ??????????????: " + jTableListCars.getModel().getRowCount());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                        "????????????",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBoxListCarsSearch??riteriaSecondActionPerformed

    private void jButtonUpdateTableOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateTableOrdersActionPerformed

        jButtonCloseOrder.setEnabled(false);
        jButtonEditDataOrder.setEnabled(false);

        try {

            /**
             * ???????????????????? ?????????? lookup ???????????? Naming ?????? ?????????????????? ??????????????????
             * ???????????? ???? ?????????????????? ???????????? Order ?? ???????????????? URL.
             */
            OrderOperation order = (OrderOperation) Naming.lookup("//localhost:1199/orderRMI");

            model = (DefaultTableModel) jTableOrders.getModel();
            OutputToTableOrders(order.getListOrders());
        } catch (NotBoundException | MalformedURLException | RemoteException | ParseException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUpdateTableOrdersActionPerformed

    private void jButtonCloseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseOrderActionPerformed
        int row = jTableOrders.getSelectedRow();

        String fullName = jTableOrders.getValueAt(row, 0).toString().trim();
        String registrationNumber = jTableOrders.getValueAt(row, 1).toString().trim();

        int result = JOptionPane.showConfirmDialog(this,
                "???? ?????????????????? ?????????? ??????????????: " + fullName + "?",
                "????????????????!",
                JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                /**
                 * ???????????????????? ?????????? lookup ???????????? Naming ?????? ?????????????????? ??????????????????
                 * ???????????? ???? ?????????????????? ???????????? Order ?? ???????????????? URL.
                 */
                OrderOperation order = (OrderOperation) Naming.lookup("//localhost:1199/orderRMI");
                order.closeOrder(fullName, registrationNumber);

                JOptionPane.showMessageDialog(this, "?????????? ??????????????: " + fullName + " ????????????????!",
                        "??????????????",
                        JOptionPane.NO_OPTION);

                jButtonUpdateTableOrdersActionPerformed(null);

            } catch (NotBoundException | MalformedURLException | RemoteException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonCloseOrderActionPerformed

    private void jButtonEditDataOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditDataOrderActionPerformed

    private void jButtonBlockClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlockClientActionPerformed
        int result = JOptionPane.showConfirmDialog(this,
                "???? ?????????????? ?????????????????????????? ???????????????",
                "????????????????!",
                JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                int row = jTableClients.getSelectedRow();
                int column = 6;
                String numberPhone = jTableClients.getModel().getValueAt(row, column).toString();

                Long idClient = null;
                idClient = clientService.getClientServicePort().findClientByNumberPhone(numberPhone);

                clientService.getClientServicePort().blockClient(idClient);

                JOptionPane.showMessageDialog(this, "???????????? ????????????????????????",
                        "??????????????",
                        JOptionPane.NO_OPTION);

                UpdateListClients();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                        "????????????",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButtonBlockClientActionPerformed

    private void jButtonEditDataClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataClientActionPerformed
        if (jTableClients.getSelectedRow() != -1) {
            int row = jTableClients.getSelectedRow();

            jTextFieldEditDataClientSecondName.setText((String) jTableClients.getModel().getValueAt(row, 0));
            jTextFieldEditDataClientFirstName.setText((String) jTableClients.getModel().getValueAt(row, 1));
            jTextFieldEditDataClientMiddleName.setText((String) jTableClients.getModel().getValueAt(row, 2));

            jTextAreaEditDataClientPassportData.setText((String) jTableClients.getModel().getValueAt(row, 4));
            jTextAreaEditDataClientDriversLicense.setText((String) jTableClients.getModel().getValueAt(row, 5));
            jTextFieldEditDataClientPhoneNumber.setText((String) jTableClients.getModel().getValueAt(row, 6));
            jTextFieldEditDataClientEmail.setText((String) jTableClients.getModel().getValueAt(row, 7));

            jDialogEditDataClient.setVisible(true);
        }

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
        pdfFile.setSelectedFile(new File("C?????????? ????????????????"));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Documents (*.pdf)|*.pdf", "pdf");
        pdfFile.setFileFilter(filter);
        if (pdfFile.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            // ???????????????? ???????????? ????????????????
            List<Client> clients = clientService.getClientServicePort().getListOfClients();

            // ?????????????? ????????????????
            Document document = new Document();
            document.setPageSize(PageSize.A4.rotate());

            TableModel tableClientsModel = jTableClients.getModel();

            try {
                String path = pdfFile.getSelectedFile().getAbsolutePath() + ".pdf";
                PdfWriter.getInstance(document, new FileOutputStream(path));
            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

            // ?????????????????? ?????????????????? ???????????????? ?????? ?????????????????? ????????????
            document.open();

            BaseFont baseFont;
            Font font = null;
            try {
                baseFont = BaseFont.createFont("C:\\Windows\\Fonts\\arial.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
                font = new Font(baseFont, Font.DEFAULTSIZE, Font.NORMAL);
            } catch (DocumentException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

            // ?????????????? ?????????????? ?? ?????????????????? ?? ?????? ????????????
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
            JOptionPane.showMessageDialog(null, "?????????????? ???????????? ??????????????!", "????????????????!", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonExportClientsToPDFActionPerformed

    private void jPanelAvailableCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelAvailableCarsComponentShown
        // ?????????????????? ???????????? ???? ?????????????? ????????????????
        jComboBoxAvailableCarsSearch??riteriaSecond.setEnabled(false);

        SearchCriteriaFirst(jTableAvailableCars, jComboBoxAvailableCarsSearch??riteriaFirst);
        jButtonAvailableCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jPanelAvailableCarsComponentShown

    private void jPanelClientsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelClientsComponentShown

        UpdateListClients();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) (screenSize.height * 0.7);
        int width = (int) (screenSize.width * 0.95);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        jButtonEditDataClient.setEnabled(false);
        jButtonBlockClient.setEnabled(false);

    }//GEN-LAST:event_jPanelClientsComponentShown

    // ?????????????? ?????????????????? ???????????????? ???????????????? ??????????
    private void setDefaultFormSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) (screenSize.height * 0.7);
        int width = (int) (screenSize.width * 0.8);

        Dimension currentFormSize = this.getSize();

        // ???????? ?????????????? ?????????? ?????????? ???????????? ??????????????, ??????????????????????????
        // ?????????? ????????????
        if (currentFormSize.height != height || currentFormSize.width != width) {
            this.setSize(width, height);
        }
        this.setLocationRelativeTo(null);
    }
    private void jPanelRentedCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelRentedCarsComponentShown
        // ?????????????????? ???????????? ???? ?????????????? ????????????????
        jComboBoxRentedCarsSearch??riteriaSecond.setEnabled(false);

        // ???????????????? ???????????? ?????????????? ???????????? ??????????????
        jTableCarsInRent.getColumnModel().getColumn(3).setMaxWidth(400);
        jTableCarsInRent.getColumnModel().getColumn(3).setPreferredWidth(350);

        // ???????????????????? ???????????? ?? ???????????? ???????????????? ????????????
        SearchCriteriaFirst(jTableCarsInRent, jComboBoxRentedCarsSearch??riteriaFirst);
        if (jComboBoxRentedCarsSearch??riteriaFirst.getItemCount() != 0) {
            jComboBoxRentedCarsSearch??riteriaFirst.removeItemAt(jComboBoxRentedCarsSearch??riteriaFirst.getItemCount() - 1);
        }

        // ???????????????? ???????????? ???????????????????????? ??????????????????????
        jButtonRentedCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jPanelRentedCarsComponentShown

    private void jPanelListCarsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelListCarsComponentShown
        SearchCriteriaFirst(jTableListCars, jComboBoxListCarsSearch??riteriaFirst);
        jComboBoxListCarsSearch??riteriaSecond.setEnabled(false);
        jButtonListCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jPanelListCarsComponentShown

    private void jButtonAvailableCarsUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvailableCarsUpdateTableActionPerformed
        jButtonAvailableCarsAddOrder.setEnabled(false);
        List listCars = null;
        if (jComboBoxAvailableCarsSearch??riteriaFirst.getSelectedItem() == null
                || jComboBoxAvailableCarsSearch??riteriaSecond.getSelectedItem() == null) {
            listCars = searchCriteriaService.getSearchCriteriaServicePort().getListAvailableCars(null, null, true);
        } else {
            listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxAvailableCarsSearch??riteriaFirst.getSelectedItem().toString(),
                            jComboBoxAvailableCarsSearch??riteriaSecond.getSelectedItem().toString(), true);
        }
        try {
            model = (DefaultTableModel) jTableAvailableCars.getModel();
            if (listCars != null) {
                OutputToTableCars(listCars);
                jLabelAvailableCarsCount.setText("???????????????????? ?????????????????????? ?? ??????????????: " + jTableAvailableCars.getModel().getRowCount());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                    "????????????",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAvailableCarsUpdateTableActionPerformed

    private void jTableAvailableCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAvailableCarsMouseClicked
        jButtonAvailableCarsAddOrder.setEnabled(true);
    }//GEN-LAST:event_jTableAvailableCarsMouseClicked

    private void jTableCarsInRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarsInRentMouseClicked
        jButtonRentedCarsMoveToOrders.setEnabled(true);
    }//GEN-LAST:event_jTableCarsInRentMouseClicked

    private void jButtonRentedCarsUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentedCarsUpdateTableActionPerformed

        List listCars = null;
        if (jComboBoxRentedCarsSearch??riteriaFirst.getSelectedItem() == null
                || jComboBoxRentedCarsSearch??riteriaSecond.getSelectedItem() == null) {
            listCars = searchCriteriaService.getSearchCriteriaServicePort().getListRentedCars(null, null);
        } else {
            listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListRentedCars(jComboBoxRentedCarsSearch??riteriaFirst.getSelectedItem().toString(),
                            jComboBoxRentedCarsSearch??riteriaSecond.getSelectedItem().toString());
        }
        try {
            model = (DefaultTableModel) jTableCarsInRent.getModel();
            if (listCars != null) {
                OutputToTableRentedCars(listCars);
                jLabelCarsInRentCount.setText("???????????????????? ?????????????????????? ?? ??????????????: " + jTableCarsInRent.getModel().getRowCount());
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                    "????????????",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRentedCarsUpdateTableActionPerformed

    private void jButtonRentedCarsMoveToOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentedCarsMoveToOrdersActionPerformed
        jTabbedPaneForm.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonRentedCarsMoveToOrdersActionPerformed

    private void jButtonAvailableCarsClearSearchCriteriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvailableCarsClearSearchCriteriesActionPerformed
        jComboBoxAvailableCarsSearch??riteriaFirst.setSelectedIndex(-1);
        jComboBoxAvailableCarsSearch??riteriaSecond.setSelectedIndex(-1);
        jComboBoxAvailableCarsSearch??riteriaSecond.setEnabled(false);
        jButtonAvailableCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jButtonAvailableCarsClearSearchCriteriesActionPerformed

    private void jButtonRentedCarsClearSearchCriteriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentedCarsClearSearchCriteriesActionPerformed
        jComboBoxRentedCarsSearch??riteriaFirst.setSelectedIndex(-1);
        jComboBoxRentedCarsSearch??riteriaSecond.setSelectedIndex(-1);
        jComboBoxRentedCarsSearch??riteriaSecond.setEnabled(false);
        jButtonRentedCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jButtonRentedCarsClearSearchCriteriesActionPerformed

    private void jButtonListCarsClearSearchCriteriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCarsClearSearchCriteriesActionPerformed
        jComboBoxListCarsSearch??riteriaFirst.setSelectedIndex(-1);
        jComboBoxListCarsSearch??riteriaSecond.setSelectedIndex(-1);
        jComboBoxListCarsSearch??riteriaSecond.setEnabled(false);
        jButtonListCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jButtonListCarsClearSearchCriteriesActionPerformed

    private void jButtonListCarsUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCarsUpdateTableActionPerformed

        List listCars = null;
        if (jComboBoxListCarsSearch??riteriaFirst.getSelectedItem() == null
                || jComboBoxListCarsSearch??riteriaSecond.getSelectedItem() == null) {
            listCars = searchCriteriaService.getSearchCriteriaServicePort().getListAvailableCars(null, null, false);
        } else {
            listCars = searchCriteriaService
                    .getSearchCriteriaServicePort()
                    .getListAvailableCars(jComboBoxListCarsSearch??riteriaFirst.getSelectedItem().toString(),
                            jComboBoxListCarsSearch??riteriaSecond.getSelectedItem().toString(), false);
        }
        try {
            model = (DefaultTableModel) jTableListCars.getModel();
            if (listCars != null) {
                OutputToTableCars(listCars);

                jLabelListCarsCount.setText("???????????????????? ?????????????????????? ?? ??????????????: " + jTableListCars.getModel().getRowCount());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "???? ?????????????? ???????????????????? ???????????????????? ?? ????????????????:" + ex.getMessage() + ".",
                    "????????????",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonListCarsUpdateTableActionPerformed

    private void jTableClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientsMouseClicked
        jButtonEditDataClient.setEnabled(true);
        jButtonBlockClient.setEnabled(true);
    }//GEN-LAST:event_jTableClientsMouseClicked

    private void jButtonEditClientCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditClientCloseActionPerformed
        jDialogEditDataClient.setVisible(false);
    }//GEN-LAST:event_jButtonEditClientCloseActionPerformed

    private void jButtonEditClientAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditClientAcceptActionPerformed

        int row = jTableClients.getSelectedRow();

        Long idClient = clientService
                .getClientServicePort()
                .findClientByNumberPhone((String) jTableClients.getModel().getValueAt(row, 6));
        Client client = new Client(
                idClient,
                "login",
                "pass",
                jTextFieldEditDataClientSecondName.getText(),
                jTextFieldEditDataClientFirstName.getText(),
                jTextFieldEditDataClientMiddleName.getText(),
                jTextFieldEditDataClientPhoneNumber.getText(),
                jTextAreaEditDataClientPassportData.getText(),
                jTextAreaEditDataClientDriversLicense.getText(),
                jTextFieldEditDataClientEmail.getText(),
                false
        );

        try {
            clientService.getClientServicePort().updateClient(client);
            jDialogEditDataClient.setVisible(false);
            jButtonUpdateTableClientsActionPerformed(null);
            JOptionPane.showMessageDialog(this, "???????????? ?????????????? ???????????????? ??????????????!",
                    "??????????????!",
                    JOptionPane.NO_OPTION);
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "???????????? ?????????????????? ???????????? ??????????????: " + ex.getMessage() + ".",
                    "????????????",
                    JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonEditClientAcceptActionPerformed

    private void jButtonAvailableCarsAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvailableCarsAddOrderActionPerformed
        int selectedRow = jTableAvailableCars.getSelectedRow();

        if (selectedRow != -1) {
            // ???????????????? ???????????????? ??????????
            this.setVisible(false);

            // ?????????????? ?????????? ???????????????????? ????????????
            jDialogAddOrder.setVisible(true);

        }

    }//GEN-LAST:event_jButtonAvailableCarsAddOrderActionPerformed

    private void jDialogAddOrderComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDialogAddOrderComponentShown

        int selectedRow = jTableAvailableCars.getSelectedRow();

        if (selectedRow != -1) {
            String registrationNumber = jTableAvailableCars.getValueAt(selectedRow, 6).toString();
            String brand = jTableAvailableCars.getValueAt(selectedRow, 0).toString();
            String model = jTableAvailableCars.getValueAt(selectedRow, 1).toString();
            String rentalCost = jTableAvailableCars.getValueAt(selectedRow, 5).toString();

            // ???????? ????????????
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String startDate = dateFormat.format(new Date());
            jTextFieldAddOrderStartDate.setText(startDate);

            cbModel = new DefaultComboBoxModel<>();
            for (int i = 0; i < jTableAvailableCars.getModel().getRowCount(); i++) {
                cbModel.addElement((String) jTableAvailableCars.getModel().getValueAt(i, 6));
            }
            jComboBoxAddOrderCar.setModel(cbModel);
            jComboBoxAddOrderCar.setSelectedItem((Object) registrationNumber);
            jTextFieldAddOrderBrandAndModel.setText(brand + " " + model);
            jTextFieldAddOrderRentalCost.setText(rentalCost);
            jTextFieldAddOrderTotalCost.setText(rentalCost);

            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(dateFormat.parse(startDate));
            } catch (ParseException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

            // ???????????????????? ????????
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            // ???????? ????????????????
            String endDate = dateFormat.format(calendar.getTime());

            jTextFieldAddOrderEndDate.setText(endDate);

            JComponent comp = jSpinnerAddOrderCountDays.getEditor();
            JFormattedTextField field = (JFormattedTextField) comp.getComponent(0);
            DefaultFormatter formatter = (DefaultFormatter) field.getFormatter();
            formatter.setCommitsOnValidEdit(true);
            jSpinnerAddOrderCountDays.addChangeListener(new ChangeListener() {

                @Override
                public void stateChanged(ChangeEvent e) {
                    try {
                        int rentalCost = Integer.parseInt(jTextFieldAddOrderRentalCost.getText());
                        jSpinnerAddOrderCountDays.commitEdit();
                        int countDays = (Integer) jSpinnerAddOrderCountDays.getValue();

                        jTextFieldAddOrderTotalCost.setText(String.valueOf(rentalCost * countDays));

                        String startDate = jTextFieldAddOrderStartDate.getText();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(sdf.parse(startDate));

                        // ???????????????????? ????????
                        calendar.add(Calendar.DAY_OF_MONTH, countDays);
                        // ???????? ????????????????
                        String endDate = sdf.format(calendar.getTime());

                        jTextFieldAddOrderEndDate.setText(endDate);

                    } catch (ParseException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            // *???????????????????? ?????????????? ???????????? ????????????????*
            // ?????????????????? ????????????????
            List<Client> clients = clientService.getClientServicePort().getListOfClients();

            // ?????????? ???????????? ?????? ClientComboBox
            cbModel = new DefaultComboBoxModel<>();

            // ?????????????? ???????? ????????????????
            for (Client client : clients) {
                String secondName = client.getSecondName();
                String familyName = client.getFirstName();
                String middleName = client.getMiddleName();
                String fullName = String.format("%s %s %s", secondName, familyName, middleName);

                /*
                    ?????????? ?????????????????????? ???????????? ?????? ?????????????????????????????????? ?????????????? 
                    (???????? ?? ?????? ?????????????????? ???????????????? ?? ???????????????????? ??????)
                 */
                String passportData = client.getPhoneNumber();
                cbModel.addElement(String.format("%s, %s", fullName, passportData));
            }

            // ?????????????????? ???????????? ?????? ClientComboBox
            jComboBoxAddOrderClient.setModel(cbModel);
            jComboBoxAddOrderClient.setSelectedIndex(-1);

            // ???????????? "???????????????? ??????????"
            jButtonAddOrderClearClient.setEnabled(false);
        }
    }//GEN-LAST:event_jDialogAddOrderComponentShown

    private void jSpinnerAddOrderCountDaysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinnerAddOrderCountDaysKeyTyped
        int rentalCost = Integer.parseInt(jTextFieldAddOrderRentalCost.getText());
        int countDays = Integer.parseInt(jTextFieldAddOrderRentalCost.getText());

        jTextFieldAddOrderTotalCost.setText(String.valueOf(rentalCost * countDays));
    }//GEN-LAST:event_jSpinnerAddOrderCountDaysKeyTyped

    private void jSpinnerAddOrderCountDaysMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerAddOrderCountDaysMousePressed
        int rentalCost = Integer.parseInt(jTextFieldAddOrderRentalCost.getText());
        int countDays = Integer.parseInt(jTextFieldAddOrderRentalCost.getText());

        jTextFieldAddOrderTotalCost.setText(String.valueOf(rentalCost * countDays));
    }//GEN-LAST:event_jSpinnerAddOrderCountDaysMousePressed

    private void jSpinnerAddOrderCountDaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerAddOrderCountDaysMouseClicked
        int rentalCost = Integer.parseInt(jTextFieldAddOrderRentalCost.getText());
        int countDays = Integer.parseInt(jTextFieldAddOrderRentalCost.getText());

        jTextFieldAddOrderTotalCost.setText(String.valueOf(rentalCost * countDays));
    }//GEN-LAST:event_jSpinnerAddOrderCountDaysMouseClicked

    private void jButtonAddOrderCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddOrderCloseActionPerformed
        jDialogAddOrder.setVisible(false);
    }//GEN-LAST:event_jButtonAddOrderCloseActionPerformed

    private void jComboBoxAddOrderCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAddOrderCarActionPerformed

        // ?????????????????????????????? ?????????? ???????????????????? - ?????????? ???????????????????? ?? ????????????
        String registrationNumber = jComboBoxAddOrderCar.getSelectedItem().toString();

        // ???????????????? ???????????? ???????????? ???????????????????? ????????????????????
        List infoAboutCar = searchCriteriaService
                .getSearchCriteriaServicePort()
                .getListCarsByRegistrationNumber(registrationNumber);

        // ?????????? ?? ?????????? ???????????????????? ????????????????????
        String brand = (String) infoAboutCar.get(0);
        String modelCar = (String) infoAboutCar.get(1);

        // ???????????????????? ?????????? ?? ?????????? ???????????????????? ????????????????????
        jTextFieldAddOrderBrandAndModel.setText(String.format("%s %s", brand, modelCar));

    }//GEN-LAST:event_jComboBoxAddOrderCarActionPerformed

    private void jComboBoxAddOrderClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAddOrderClientActionPerformed

        // ???????? ?? ClientComboBox ?????????????? ????????????????
        if (jComboBoxAddOrderClient.getSelectedIndex() != -1) {
            // ???????????? "???????????????? ??????????"
            jButtonAddOrderClearClient.setEnabled(true);

            // ???????? ?????????? ???????????????????? ?? ?????????????? ???????????? ????????????????????????
            jTextFieldAddOrderClientSecondName.setEnabled(false);
            jTextFieldAddOrderClientFirstName.setEnabled(false);
            jTextFieldAddOrderClientMiddleName.setEnabled(false);
            jSpinnerAddOrderClientDateBirthday.setEnabled(false);
            jTextAreaAddOrderClientPassportData.setEnabled(false);
            jTextAreaAddOrderClientDriversLicense.setEnabled(false);
            jTextFieldAddOrderClientNumberPhone.setEnabled(false);
            jTextFieldAddOrderClientEmail.setEnabled(false);

            // ???????????? ?????????? ?????????????????????????? ????????????????????
            jLabelInfoAboutFields.setText("");
        }


    }//GEN-LAST:event_jComboBoxAddOrderClientActionPerformed

    private void jDialogAddOrderComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDialogAddOrderComponentHidden
        
        this.setVisible(true);

        // ?????????????? ???????????????? ?????????????????????? ??????????
        jComboBoxAddOrderClient.setSelectedIndex(-1);
        jTextFieldAddOrderClientSecondName.setText("");
        jTextFieldAddOrderClientFirstName.setText("");
        jTextFieldAddOrderClientSecondName.setText("");
        jTextAreaAddOrderClientPassportData.setText("");
        jTextAreaAddOrderClientDriversLicense.setText("");
        jTextFieldAddOrderClientNumberPhone.setText("");
        jTextFieldAddOrderClientEmail.setText(""); 

    }//GEN-LAST:event_jDialogAddOrderComponentHidden

    private void jButtonAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddOrderActionPerformed

        // ???????? ???????????????????????? ???????? ???? ?????????????????? ???????????????????????? ???????? ??????????????????
        if (jComboBoxAddOrderClient.getSelectedIndex() == -1
                && (jTextFieldAddOrderClientSecondName.getText().trim().length() == 0
                || jTextFieldAddOrderClientFirstName.getText().trim().length() == 0
                || jTextAreaAddOrderClientPassportData.getText().trim().length() == 0
                || jTextAreaAddOrderClientDriversLicense.getText().trim().length() == 0
                || jTextFieldAddOrderClientNumberPhone.getText().trim().length() == 0
                || jTextFieldAddOrderClientEmail.getText().trim().length() == 0)) {
            JOptionPane.showMessageDialog(this, "?????????????????? ?????? ???????????????????????? ???????? - (*)",
                    "????????????", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            jSpinnerAddOrderCountDays.commitEdit();

        } catch (ParseException ex) {
            Logger.getLogger(Frame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        // ???????? ???? ????????????????????
        String formattedDate = dateFormat.format(jSpinnerAddOrderClientDateBirthday.getValue());
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(dateFormat.parse(formattedDate));

        } catch (ParseException ex) {
            Logger.getLogger(Frame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        // ???????????????? ?? ??????????????
        String dateStr2 = dateFormat.format(calendar.getTime());
        Date date = null;
        try {
            date = dateFormat.parse(dateStr2);

        } catch (ParseException ex) {
            Logger.getLogger(Frame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        GregorianCalendar c = new GregorianCalendar();
        c.setTime(date);
        XMLGregorianCalendar date2 = null;
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(Frame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        List info = new ArrayList<>();
        info.add(jComboBoxAddOrderCar.getSelectedItem().toString());
        info.add(jTextFieldAddOrderStartDate.getText());
        info.add(jTextFieldAddOrderEndDate.getText());
        info.add(Integer.parseInt(jTextFieldAddOrderTotalCost.getText()));

        if (jComboBoxAddOrderClient.getSelectedIndex() != -1) {
            String[] fullNameAndPhoneString = jComboBoxAddOrderClient.getSelectedItem().toString().split(", ");
            List fullNameAndPhone = new ArrayList<>();
            fullNameAndPhone.add(fullNameAndPhoneString[0]);
            fullNameAndPhone.add(fullNameAndPhoneString[1]);
            searchCriteriaService.getSearchCriteriaServicePort().addOrder(info, null, false, fullNameAndPhone);
        } else {
            Client client = new Client(
                    jTextFieldAddOrderClientSecondName.getText(),
                    jTextFieldAddOrderClientFirstName.getText(),
                    jTextFieldAddOrderClientMiddleName.getText(),
                    date2,
                    jTextAreaAddOrderClientPassportData.getText(),
                    jTextAreaAddOrderClientDriversLicense.getText(),
                    jTextFieldAddOrderClientNumberPhone.getText(),
                    jTextFieldAddOrderClientEmail.getText()
            );
            searchCriteriaService.getSearchCriteriaServicePort().addOrder(info, client, true, null);
        }

        jDialogAddOrder.setVisible(false);

        JOptionPane.showMessageDialog(this, "?????????? ?????????????? ????????????????!",
                "??????????????!",
                JOptionPane.NO_OPTION);

        jButtonAvailableCarsUpdateTableActionPerformed(null);

    }//GEN-LAST:event_jButtonAddOrderActionPerformed

    private void jButtonAddOrderClearClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddOrderClearClientActionPerformed

        // ???????????????? ?????????? ?? ClientComboBox
        jComboBoxAddOrderClient.setSelectedIndex(-1);

        // ???????? ?????????? ???????????????????? ?? ?????????????? ???????????? ????????????????????
        jTextFieldAddOrderClientSecondName.setEnabled(true);
        jTextFieldAddOrderClientFirstName.setEnabled(true);
        jTextFieldAddOrderClientMiddleName.setEnabled(true);
        jSpinnerAddOrderClientDateBirthday.setEnabled(true);
        jTextAreaAddOrderClientPassportData.setEnabled(true);
        jTextAreaAddOrderClientDriversLicense.setEnabled(true);
        jTextFieldAddOrderClientNumberPhone.setEnabled(true);
        jTextFieldAddOrderClientEmail.setEnabled(true);

        // ?????????????????? ?????????? ?????????????????????????? ????????????????????
        jLabelInfoAboutFields.setText("* - ????????, ???????????????????????? ?????? ????????????????????");

    }//GEN-LAST:event_jButtonAddOrderClearClientActionPerformed

    private void jPanelOrdersComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelOrdersComponentShown
        setDefaultFormSize();

        // ???????????????? ???????????? ?????????????? ???????????? ??????????????
        jTableOrders.getColumnModel().getColumn(0).setMaxWidth(450);
        jTableOrders.getColumnModel().getColumn(0).setPreferredWidth(450);

        // ???????????????? ???????????? ?????????????? ???????????????????? ????????
        jTableOrders.getColumnModel().getColumn(4).setMaxWidth(220);
        jTableOrders.getColumnModel().getColumn(4).setPreferredWidth(220);

        jButtonUpdateTableOrdersActionPerformed(null);

    }//GEN-LAST:event_jPanelOrdersComponentShown

    private void jPanelAutoparkComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelAutoparkComponentShown
        setDefaultFormSize();
        jButtonAvailableCarsUpdateTableActionPerformed(null);
    }//GEN-LAST:event_jPanelAutoparkComponentShown

    private void jTableOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrdersMouseClicked
        jButtonCloseOrder.setEnabled(true);
        jButtonEditDataOrder.setEnabled(true);
    }//GEN-LAST:event_jTableOrdersMouseClicked

    private void OutputToTableOrders(List listOrders) throws ParseException {
        doClearTable();
        Object[] rowData = new String[6];
        int i = 0;
        for (Object var : listOrders) {
            switch (i) {
                case 0:
                    rowData[0] = var + " ";
                    break;
                case 1:
                case 2:
                    rowData[0] += var + " ";
                    if (i == 2) {
                        rowData[0] = rowData[0].toString().trim();
                    }
                    break;
                case 3:
                    rowData[1] = var + " ";
                    break;
                case 4:
                    rowData[2] = String.valueOf(var).substring(0, 10);
                    break;
                case 5:
                    rowData[3] = String.valueOf(var).substring(0, 10);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date1 = dateFormat.parse((String) rowData[2]);
                    Date date2 = dateFormat.parse((String) rowData[3]);
                    // ?????????????? ?????????? ???????????? ?? ?????????????????????????? ?? ????????
                    long milliseconds = date2.getTime() - date1.getTime();
                    int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
                    rowData[4] = String.valueOf(days);
                    break;
                case 6:
                    rowData[5] = var.toString();
                    model.addRow(rowData);
                    i = 0;
                    continue;
                default:
                    break;
            }
            i++;
        }

    }

    private void OutputToTableCars(List list??ars) throws ParseException {
        doClearTable();
        Object[] rowData = new String[7];
        int i = 0;
        for (Object var : list??ars) {
            rowData[i] = String.valueOf(var);
            if (i != 0 && i % 6 == 0) {
                model.addRow(rowData);
                i = 0;
                continue;
            }
            i++;
        }
    }

    private void OutputToTableRentedCars(List list??ars) throws ParseException {
        doClearTable();
        Object[] rowData = new String[7];
        int i = 0;
        for (Object var : list??ars) {
            if (i != 4 && i != 5) {
                rowData[i] = String.valueOf(var);
            } else {
                rowData[i] = String.valueOf(var).substring(0, 10);
            }
            if (i == 5) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = dateFormat.parse((String) rowData[i - 1]);
                Date date2 = dateFormat.parse((String) rowData[i]);

                // ?????????????? ?????????? ???????????? ?? ?????????????????????????? ?? ????????
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
                array[j] = "???";
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
        // ?????????????????? ???????????? ?? ??????????????
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
            java.util.logging.Logger.getLogger(Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButtonAddOrder;
    private javax.swing.JButton jButtonAddOrderClearClient;
    private javax.swing.JButton jButtonAddOrderClose;
    private javax.swing.JButton jButtonAvailableCarsAddOrder;
    private javax.swing.JButton jButtonAvailableCarsClearSearchCriteries;
    private javax.swing.JButton jButtonAvailableCarsUpdateTable;
    private javax.swing.JButton jButtonBlockClient;
    private javax.swing.JButton jButtonCloseOrder;
    private javax.swing.JButton jButtonDeleteCar;
    private javax.swing.JButton jButtonEditClientAccept;
    private javax.swing.JButton jButtonEditClientClose;
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
    private javax.swing.JComboBox<String> jComboBoxAddOrderCar;
    private javax.swing.JComboBox<String> jComboBoxAddOrderClient;
    private javax.swing.JComboBox<String> jComboBoxAvailableCarsSearch??riteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxAvailableCarsSearch??riteriaSecond;
    private javax.swing.JComboBox<String> jComboBoxListCarsSearch??riteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxListCarsSearch??riteriaSecond;
    private javax.swing.JComboBox<String> jComboBoxRentedCarsSearch??riteriaFirst;
    private javax.swing.JComboBox<String> jComboBoxRentedCarsSearch??riteriaSecond;
    private javax.swing.JDialog jDialogAddOrder;
    private javax.swing.JDialog jDialogEditDataClient;
    private javax.swing.JDialog jDialogLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAddOrderCar1;
    private javax.swing.JLabel jLabelAddOrderCar10;
    private javax.swing.JLabel jLabelAddOrderCarAddOrderClientMiddleName;
    private javax.swing.JLabel jLabelAddOrderClient;
    private javax.swing.JLabel jLabelAddOrderClientDateBirthday;
    private javax.swing.JLabel jLabelAddOrderClientDriversLicense;
    private javax.swing.JLabel jLabelAddOrderClientEmail;
    private javax.swing.JLabel jLabelAddOrderClientFirstName;
    private javax.swing.JLabel jLabelAddOrderClientNumberPhone;
    private javax.swing.JLabel jLabelAddOrderClientPassportData;
    private javax.swing.JLabel jLabelAddOrderClientSecondName;
    private javax.swing.JLabel jLabelAddOrderCountDays;
    private javax.swing.JLabel jLabelAddOrderDateFormat;
    private javax.swing.JLabel jLabelAddOrderEndDate;
    private javax.swing.JLabel jLabelAddOrderRentalCost;
    private javax.swing.JLabel jLabelAddOrderStartDate;
    private javax.swing.JLabel jLabelAddOrderTotalCost;
    private javax.swing.JLabel jLabelAvailableCarsCount;
    private javax.swing.JLabel jLabelAvailableCarsSearch??riteriaFirst;
    private javax.swing.JLabel jLabelAvailableCarsSearch??riteriaSecond;
    private javax.swing.JLabel jLabelCarsInRentCount;
    private javax.swing.JLabel jLabelInfoAboutFields;
    private javax.swing.JLabel jLabelListCarsCount;
    private javax.swing.JLabel jLabelListCarsSearch??riteriaFirst;
    private javax.swing.JLabel jLabelListCarsSearch??riteriaSecond;
    private javax.swing.JLabel jLabelLogin1;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelRentedCarsSearch??riteriaFirst;
    private javax.swing.JLabel jLabelRentedCarsSearch??riteriaSecond;
    private javax.swing.JPanel jPanelAddOrder;
    private javax.swing.JPanel jPanelAutopark;
    private javax.swing.JPanel jPanelAvailableCars;
    private javax.swing.JPanel jPanelClients;
    private javax.swing.JPanel jPanelListCars;
    private javax.swing.JPanel jPanelLogin1;
    private javax.swing.JPanel jPanelOrders;
    private javax.swing.JPanel jPanelRentedCars;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPaneAvailableCars;
    private javax.swing.JScrollPane jScrollPaneAvailableCars1;
    private javax.swing.JScrollPane jScrollPaneAvailableCars2;
    private javax.swing.JScrollPane jScrollPaneClients;
    private javax.swing.JScrollPane jScrollPaneOrders;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerAddOrderClientDateBirthday;
    private javax.swing.JSpinner jSpinnerAddOrderCountDays;
    private javax.swing.JTabbedPane jTabbedPaneAutopark;
    private javax.swing.JTabbedPane jTabbedPaneForm;
    private javax.swing.JTable jTableAvailableCars;
    private javax.swing.JTable jTableCarsInRent;
    private javax.swing.JTable jTableClients;
    private javax.swing.JTable jTableListCars;
    private javax.swing.JTable jTableOrders;
    private javax.swing.JTextArea jTextAreaAddOrderClientDriversLicense;
    private javax.swing.JTextArea jTextAreaAddOrderClientPassportData;
    private javax.swing.JTextArea jTextAreaEditDataClientDriversLicense;
    private javax.swing.JTextArea jTextAreaEditDataClientPassportData;
    private javax.swing.JTextField jTextFieldAddOrderBrandAndModel;
    private javax.swing.JTextField jTextFieldAddOrderClientEmail;
    private javax.swing.JTextField jTextFieldAddOrderClientFirstName;
    private javax.swing.JTextField jTextFieldAddOrderClientMiddleName;
    private javax.swing.JTextField jTextFieldAddOrderClientNumberPhone;
    private javax.swing.JTextField jTextFieldAddOrderClientSecondName;
    private javax.swing.JTextField jTextFieldAddOrderEndDate;
    private javax.swing.JTextField jTextFieldAddOrderRentalCost;
    private javax.swing.JTextField jTextFieldAddOrderStartDate;
    private javax.swing.JTextField jTextFieldAddOrderTotalCost;
    private javax.swing.JTextField jTextFieldEditDataClientEmail;
    private javax.swing.JTextField jTextFieldEditDataClientFirstName;
    private javax.swing.JTextField jTextFieldEditDataClientMiddleName;
    private javax.swing.JTextField jTextFieldEditDataClientPhoneNumber;
    private javax.swing.JTextField jTextFieldEditDataClientSecondName;
    private javax.swing.JTextField jTextFieldLogin1;
    // End of variables declaration//GEN-END:variables
}
