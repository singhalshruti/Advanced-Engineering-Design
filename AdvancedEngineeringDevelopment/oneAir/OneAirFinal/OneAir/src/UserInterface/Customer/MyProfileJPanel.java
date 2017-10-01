/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import UserInterface.*;
import Business.Business;
import Business.Customer.Customer;
import Business.Enterprise.CustomerEnterprise;
import Business.Enterprise.Enterprise;
import Business.Language;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import UserInterface.Customer.CustomerWorkAreaJPanel;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rakesh
 */
public class MyProfileJPanel extends javax.swing.JPanel {

    // private UserAccount userAccount;
    private UserAccount ua;

    private Business business;
    private JPanel mainContainer;
    private Enterprise enterprise;

    /**
     * Creates new form CustomerSignUpJPanel
     */
    public MyProfileJPanel(JPanel mainContainer, UserAccount ua, Organization organization, Enterprise enterprise, Business business) {
        this.mainContainer = mainContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.ua = ua;

        initComponents();
        loadScreen();
        loadLabels();
    }

    private void loadLabels() {
        
        lblFName.setText(Language.firstName);
        lblMName.setText(Language.middleName);
        lblLName.setText(Language.lastName);
        lblGender.setText(Language.gender);
        lblMStatus.setText(Language.maritalStatus);
        lblAddress1.setText(Language.addreess1);
        lblAddress2.setText(Language.address2);
        lblCity.setText(Language.city);
        lblState.setText(Language.state);
        lblCountry.setText(Language.country);
        lblZip.setText(Language.zip);
        lblHPhone.setText(Language.homePhone);
        lblCPhone.setText(Language.cellPhone);
        lblEmail.setText(Language.email);
        lblEmergencyContact.setText(Language.emergencyContactInformation);
        lblEFName.setText(Language.firstName);
        lblEMName.setText(Language.middleName);
        lblELName.setText(Language.lastName);
        lblECPhone.setText(Language.cellPhone);
        lblRelationship.setText(Language.relationship);
        
        btnSavePatientDetails.setText(Language.save);
        lblCustomerInformation.setText(Language.customerInformation);

    }

    public void loadScreen() {
        Customer customer = ua.getCustomer();
        txtFName.setText(customer.getPerson().getFirstName());
        txtMName.setText(customer.getPerson().getMiddleName());
        txtLName.setText(customer.getPerson().getLastName());
        txtDob.setText(customer.getPerson().getDOBInStringFormat());
        
        txtAddress1.setText(customer.getPerson().getContactDetails().getStreetAddressLine1());
        txtAddress2.setText(customer.getPerson().getContactDetails().getStreetAddressLine2());
        txtCity.setText(customer.getPerson().getContactDetails().getCity());
        txtState.setText(customer.getPerson().getContactDetails().getState());
        txtCountry.setText(customer.getPerson().getContactDetails().getCountry());
        txtZip.setText(String.valueOf(customer.getPerson().getContactDetails().getZip()));
        txtHPhone.setText(String.valueOf(customer.getPerson().getContactDetails().getPhoneNo()));
        txtCPhone.setText(String.valueOf(customer.getPerson().getContactDetails().getCellPhoneNo()));
        txtEmail.setText(customer.getPerson().getContactDetails().getEmail());
        txtEFName.setText(customer.getPerson().getContactDetails().getEmergencyContact().getFirstName());
        txtEMName.setText(customer.getPerson().getContactDetails().getEmergencyContact().getMiddleName());
        txtELName.setText(customer.getPerson().getContactDetails().getEmergencyContact().getLastName());
        tctRelationship.setText(customer.getPerson().getContactDetails().getEmergencyContact().getRelationship());
        txtECPhone.setText(String.valueOf(customer.getPerson().getContactDetails().getEmergencyContact().getPhoneNo()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientHistoryPanel = new javax.swing.JPanel();
        lblCPhone = new javax.swing.JLabel();
        txtCPhone = new javax.swing.JTextField();
        cmbMStatus = new javax.swing.JComboBox();
        lblMStatus = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lblEmergencyContact = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        txtEFName = new javax.swing.JTextField();
        lblMName = new javax.swing.JLabel();
        lblEFName = new javax.swing.JLabel();
        txtMName = new javax.swing.JTextField();
        lblEMName = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        txtEMName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        lblELName = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblAddress1 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        txtELName = new javax.swing.JTextField();
        lblECPhone = new javax.swing.JLabel();
        tctRelationship = new javax.swing.JTextField();
        lblRelationship = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtECPhone = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        lblHPhone = new javax.swing.JLabel();
        txtHPhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        lblAddress2 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblCustomerInformation = new javax.swing.JLabel();
        btnSavePatientDetails = new javax.swing.JButton();

        patientHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        patientHistoryPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientHistoryPanel.setAutoscrolls(true);

        lblCPhone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblCPhone.setText("Cell Phone");

        txtCPhone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        cmbMStatus.setEditable(true);
        cmbMStatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbMStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Married" }));

        lblMStatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblMStatus.setText("Marital Status");

        txtFName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblEmergencyContact.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblEmergencyContact.setText("Emergency Contact Information");

        lblFName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblFName.setText("First Name");

        txtEFName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblMName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblMName.setText("Middle Name");

        lblEFName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblEFName.setText("First Name");

        txtMName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblEMName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblEMName.setText("Middle Name");

        lblLName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblLName.setText("Last Name");

        txtEMName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtLName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblELName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblELName.setText("Last Name");

        lblSSN.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblSSN.setText("SSN");

        txtSSN.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtSSN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSSNFocusLost(evt);
            }
        });

        lblAddress1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblAddress1.setText("Address Line 1");

        txtAddress1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });

        txtELName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblECPhone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblECPhone.setText("Cell Phone");

        tctRelationship.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblRelationship.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblRelationship.setText("Relationship");

        lblCity.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblCity.setText("City");

        txtECPhone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtCity.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblCountry.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblCountry.setText("Country");

        txtCountry.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblHPhone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblHPhone.setText("Home Phone");

        txtHPhone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtDob.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblDOB.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblDOB.setText("DOB");

        lblGender.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblGender.setText("Gender");

        cmbGender.setEditable(true);
        cmbGender.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        lblAddress2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblAddress2.setText("Address Line 2");

        txtAddress2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblState.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblState.setText("State");

        txtState.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblZip.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblZip.setText("Zip");

        txtZip.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblCustomerInformation.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblCustomerInformation.setText("General Customer Information");

        btnSavePatientDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnSavePatientDetails.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSavePatientDetails.setText("Save");
        btnSavePatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientHistoryPanelLayout = new javax.swing.GroupLayout(patientHistoryPanel);
        patientHistoryPanel.setLayout(patientHistoryPanelLayout);
        patientHistoryPanelLayout.setHorizontalGroup(
            patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                .addComponent(lblCustomerInformation)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmergencyContact)
                    .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                                .addComponent(lblECPhone)
                                .addGap(37, 37, 37)
                                .addComponent(txtECPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEFName)
                            .addComponent(txtEFName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSSN)
                            .addComponent(lblHPhone)
                            .addComponent(lblAddress1)
                            .addComponent(lblGender)
                            .addComponent(lblFName))
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblState)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEMName)
                            .addComponent(lblRelationship))
                        .addGap(45, 45, 45)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEMName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tctRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryPanelLayout.createSequentialGroup()
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMStatus)
                                    .addComponent(lblMName))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientHistoryPanelLayout.createSequentialGroup()
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCountry, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addComponent(lblLName)
                            .addComponent(lblELName)
                            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblZip)))
                        .addGap(18, 18, 18)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtELName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSavePatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientHistoryPanelLayout.createSequentialGroup()
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblCity))
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        patientHistoryPanelLayout.setVerticalGroup(
            patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblCustomerInformation)
                .addGap(10, 10, 10)
                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientHistoryPanelLayout.createSequentialGroup()
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLName)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOB)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity))
                        .addGap(18, 18, 18)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblZip)
                                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryPanelLayout.createSequentialGroup()
                                .addComponent(lblFName)
                                .addGap(18, 18, 18)
                                .addComponent(lblGender)
                                .addGap(18, 18, 18)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddress1)
                                    .addComponent(lblAddress2)
                                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHPhone)
                                    .addComponent(txtHPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPhone)
                                    .addComponent(txtCPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSSN))
                                .addGap(30, 30, 30))
                            .addGroup(patientHistoryPanelLayout.createSequentialGroup()
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMName)
                                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMStatus)
                                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbMStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblState)
                                    .addComponent(lblCountry))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblEmergencyContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEFName)
                            .addComponent(lblEMName)
                            .addComponent(txtEMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblELName)
                            .addComponent(txtELName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtECPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblECPhone)
                            .addComponent(lblRelationship)
                            .addComponent(tctRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(btnSavePatientDetails)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientHistoryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(patientHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSSNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSSNFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNFocusLost

    private void btnSavePatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePatientDetailsActionPerformed
        // TODO add your handling code here:
        try {

            String firstName = txtFName.getText().trim();
            String middleName = txtMName.getText().trim();
            String lastName = txtLName.getText().trim();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date DOB = null;
            try {
                DOB = dateFormat.parse(txtDob.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please specify valid DOB.");
                return;
            }
            String maritalStatus = String.valueOf(cmbMStatus.getSelectedItem());
            String gender = String.valueOf(cmbGender.getSelectedItem());
            String addressLine1 = txtAddress1.getText().trim();
            String addressLine2 = txtAddress2.getText().trim();
            String city = txtCity.getText().trim();
            String state = txtState.getText().trim();
            String country = txtCountry.getText().trim();
            Integer zip = Integer.valueOf(txtZip.getText().trim());
            String homePhone = txtHPhone.getText().trim();
            String cellPhone = txtCPhone.getText().trim();
            String email = txtEmail.getText().trim();
            String eFirstName = txtEFName.getText().trim();
            String eMiddleName = txtEMName.getText().trim();
            String eLastName = txtELName.getText().trim();
            String eRelationship = tctRelationship.getText().trim();
            String eCellPhone = txtECPhone.getText().trim();

            Person person = ua.getCustomer().getPerson();
            person.setFirstName(firstName);
            person.setMiddleName(middleName);
            person.setLastName(lastName);
            person.setDOB(DOB);
            person.setSex(gender);
            person.setMaritalStatus(maritalStatus);
            person.getContactDetails().setStreetAddressLine1(addressLine1);
            person.getContactDetails().setStreetAddressLine1(addressLine2);
            person.getContactDetails().setCity(city);
            person.getContactDetails().setState(state);
            person.getContactDetails().setCountry(country);
            person.getContactDetails().setZip(zip);
            person.getContactDetails().setPhoneNo(homePhone);
            person.getContactDetails().setCellPhoneNo(cellPhone);
            person.getContactDetails().setEmail(email);

            person.getContactDetails().getEmergencyContact().setFirstName(eFirstName);
            person.getContactDetails().getEmergencyContact().setMiddleName(eMiddleName);
            person.getContactDetails().getEmergencyContact().setLastName(eLastName);
            person.getContactDetails().getEmergencyContact().setPhoneNo(eCellPhone);
            person.getContactDetails().getEmergencyContact().setRelationship(eRelationship);
            JOptionPane.showMessageDialog(null, "Account Modified");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to modify Person");
        }
    }//GEN-LAST:event_btnSavePatientDetailsActionPerformed

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePatientDetails;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbMStatus;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblCPhone;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblCustomerInformation;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblECPhone;
    private javax.swing.JLabel lblEFName;
    private javax.swing.JLabel lblELName;
    private javax.swing.JLabel lblEMName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmergencyContact;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHPhone;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMName;
    private javax.swing.JLabel lblMStatus;
    private javax.swing.JLabel lblRelationship;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblZip;
    private javax.swing.JPanel patientHistoryPanel;
    private javax.swing.JTextField tctRelationship;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtCPhone;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtECPhone;
    private javax.swing.JTextField txtEFName;
    private javax.swing.JTextField txtELName;
    private javax.swing.JTextField txtEMName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtHPhone;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
