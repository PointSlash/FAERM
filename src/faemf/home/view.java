/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package faemf.home;
import model.*;
import controller.*;
import javax.swing.JFrame;
import codeArt.*;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author GadgetZone
 */
public class view extends javax.swing.JFrame {
    private int Id_;
    /**
     * Creates new form home
     * @param Id__
     */
        
    public view(int Id_) {
        this.Id_ = Id_;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        NSsocial = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        consultation = new javax.swing.JButton();
        hospitalisation = new javax.swing.JButton();
        presmedicament = new javax.swing.JButton();
        patient = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlabel1_photoId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        sexe = new javax.swing.JLabel();
        names = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        allergie = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        jLabel18.setText("jLabel18");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);

        panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jTextArea1.setSelectionColor(new java.awt.Color(153, 0, 153));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.setOpaque(false);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Numero de sercurite social :");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Email : ");

        mail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(51, 51, 51));
        mail.setText("____________________");

        NSsocial.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NSsocial.setForeground(new java.awt.Color(51, 51, 51));
        NSsocial.setText("____________________");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NSsocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mail)
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NSsocial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel4.setOpaque(false);

        consultation.setBackground(new java.awt.Color(255, 255, 255));
        consultation.setForeground(new java.awt.Color(255, 0, 51));
        consultation.setText("Consultation");
        consultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultationActionPerformed(evt);
            }
        });

        hospitalisation.setBackground(new java.awt.Color(255, 255, 255));
        hospitalisation.setForeground(new java.awt.Color(255, 0, 51));
        hospitalisation.setText("Hospitalisations");
        hospitalisation.setBorderPainted(false);
        hospitalisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalisationActionPerformed(evt);
            }
        });

        presmedicament.setBackground(new java.awt.Color(255, 255, 255));
        presmedicament.setForeground(new java.awt.Color(255, 0, 51));
        presmedicament.setText("Prescriptions et médicaments");
        presmedicament.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        presmedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presmedicamentActionPerformed(evt);
            }
        });

        patient.setText("patient");
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(consultation)
                .addGap(23, 23, 23)
                .addComponent(hospitalisation)
                .addGap(27, 27, 27)
                .addComponent(presmedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consultation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presmedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patient))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(hospitalisation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlabel1_photoId.setBackground(new java.awt.Color(153, 153, 153));
        jlabel1_photoId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel1_photoId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_20px_1.png"))); // NOI18N
        jlabel1_photoId.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Profil Patient");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nom :");

        name.setBackground(new java.awt.Color(175, 175, 175));
        name.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setText("________________");
        name.setRequestFocusEnabled(false);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Poste nom :");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Date :");

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Contact :");

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Contact membre proche");

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Sexe :");

        pname.setBackground(new java.awt.Color(175, 175, 175));
        pname.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        pname.setForeground(new java.awt.Color(51, 51, 51));
        pname.setText("___________");
        pname.setToolTipText("");

        date.setBackground(new java.awt.Color(175, 175, 175));
        date.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        date.setForeground(new java.awt.Color(51, 51, 51));
        date.setText("________________");

        contact.setBackground(new java.awt.Color(175, 175, 175));
        contact.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        contact.setForeground(new java.awt.Color(51, 51, 51));
        contact.setText("________________");

        sexe.setBackground(new java.awt.Color(175, 175, 175));
        sexe.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        sexe.setForeground(new java.awt.Color(51, 51, 51));
        sexe.setText("________________");

        names.setBackground(new java.awt.Color(175, 175, 175));
        names.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        names.setForeground(new java.awt.Color(51, 51, 51));
        names.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        names.setText("________________");

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Adresse :");

        address.setBackground(new java.awt.Color(175, 175, 175));
        address.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        address.setForeground(new java.awt.Color(51, 51, 51));
        address.setText("________________");

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Allergies :");

        allergie.setBackground(new java.awt.Color(175, 175, 175));
        allergie.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        allergie.setForeground(new java.awt.Color(51, 51, 51));
        allergie.setText("________________");

        jLabel27.setBackground(new java.awt.Color(51, 51, 51));
        jLabel27.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Reference :");

        id.setBackground(new java.awt.Color(175, 175, 175));
        id.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        id.setForeground(new java.awt.Color(51, 51, 51));
        id.setText("________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(names, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allergie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jlabel1_photoId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel1_photoId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allergie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlabel1_photoId.setBorder(new CurveBorder(100));
        pname.setText("_________________________________________");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Mere");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultationActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        controllerConsultation cc = new controllerConsultation();
        List<modelConsultation> consultations = cc.Lst(Id_);

        for (int i=0; i < consultations.size();i++) {
            
            jTextArea1.append(String.format("____________________________________________________________________________________________________________________________________________________________\n"));
            jTextArea1.append(String.format("Numero de cosultation : "+cc.Lst(Id_).get(i).getConsultation_id() +"\n\n"));
            jTextArea1.append(String.format("Consultation Date : "+cc.Lst(Id_).get(i).getConsultation_date())+"\n");
            jTextArea1.append(String.format("Notes : "+cc.Lst(Id_).get(i).getNotes()+"\n"));
            jTextArea1.append(String.format("Diagnosis :"+cc.Lst(Id_).get(i).getDiagnosis()+"\n"));
            jTextArea1.append(String.format("Traitement : "+cc.Lst(Id_).get(i).getTreatment() +"\n"));
            jTextArea1.append(String.format("____________________________________________________________________________________________________________________________________________________________\n"));
   
        }                          
    }//GEN-LAST:event_consultationActionPerformed

    private void hospitalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalisationActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        controllerHospitalization ch = new controllerHospitalization();
        List<modelHospitalization> hospitalization = ch.Lst(Id_);

        for (int i=0; i < hospitalization.size();i++) {
            
            jTextArea1.append(String.format("____________________________________________________________________________________________________________________________________________________________\n"));
            jTextArea1.append(String.format("Numero de l'hospitalisation : "+ch.Lst(Id_).get(i).getHospitalization_id() +"\n\n"));
            jTextArea1.append(String.format("date de debut de l'hospitalisation : "+ch.Lst(Id_).get(i).getAdmission_date())+"\n");
            jTextArea1.append(String.format("date de fin de l'hospitalisation : "+ch.Lst(Id_).get(i).getDischarge_date())+"\n");
            jTextArea1.append(String.format("Raison : "+ch.Lst(Id_).get(i).getReason()+"\n"));
            jTextArea1.append(String.format("Traitement :"+ch.Lst(Id_).get(i).getTreatment()+"\n"));
            jTextArea1.append(String.format("____________________________________________________________________________________________________________________________________________________________\n"));
   
        } 
    }//GEN-LAST:event_hospitalisationActionPerformed

    private void presmedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presmedicamentActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        
        controllerPrescription cp = new controllerPrescription();
        List<Integer> pres_Id = new ArrayList<>();
        List<Integer> med_Id = new ArrayList<>();
        
        List<modelPrescription> prescriptions = cp.Lst(Id_);

        for (int i=0; i < prescriptions.size();i++) {
            
            jTextArea1.append(String.format("____________________________________________________________________________________________________________________________________________________________\n"));
            jTextArea1.append(String.format("Numero de prescription : "+cp.Lst(Id_).get(i).getPrescription_id() +"\n\n"));
            jTextArea1.append(String.format("Date de prescription: "+cp.Lst(Id_).get(i).getPrescription_date())+"\n");
            pres_Id.addLast(cp.Lst(Id_).get(i).getPrescription_id());
         
        }
        
        //prescription_medication
        
        for (int i = 0; i < pres_Id.size(); i++) {
            controllerPrescriptionMedication cpm = new controllerPrescriptionMedication();
            List<modelPrescriptionMedication> prescriptionMedication = cpm.Lst(Id_);
            
            for (int h=0; h < prescriptionMedication.size();h++) {
            
                med_Id.addLast(cpm.Lst(Id_).get(h).getMedication_id());
         
            }
            
        }

        
        //fin prescription_medication
        
        
        for (int i = 0; i < med_Id.size(); i++) {
//
            controllerMedication cm = new controllerMedication();
            List<modelMedication> medications = cm.Lst(med_Id.get(i));

                for (int k=0; k < medications.size();k++) {
                    jTextArea1.append(String.format("\n"));
                    jTextArea1.append(String.format("Nom du medicament : "+cm.Lst(med_Id.get(i)).get(k).getName()+"\n"));
                    jTextArea1.append(String.format("Dosages :"+cm.Lst(med_Id.get(i)).get(k).getDosage()+"\n"));
                    jTextArea1.append(String.format("Descriptions : "+cm.Lst(med_Id.get(i)).get(k).getDescription() +"\n"));
                    jTextArea1.append(String.format("Effet indeirable : "+cm.Lst(med_Id.get(i)).get(k).getSide_effects() +"\n"));
                    jTextArea1.append(String.format("____________________________________________________________________________________________________________________________________________________________\n"));
                }
                
        }
        
    }//GEN-LAST:event_presmedicamentActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
        
        controllerPatient cp1 = new controllerPatient();

               name.setText(cp1.Lst(Id_).get(0).getFirst_name());
               pname.setText(cp1.Lst(Id_).get(0).getLast_name());
               date.setText(""+cp1.Lst(Id_).get(0).getBirth_date());
               contact.setText(cp1.Lst(Id_).get(0).getPhone_number());
               sexe.setText(cp1.Lst(Id_).get(0).getGender());
               address.setText(cp1.Lst(Id_).get(0).getAddress());
               allergie.setText(cp1.Lst(Id_).get(0).getAllergies());
               id.setText(""+cp1.Lst(Id_).get(0).getPatient_id());
               names.setText(cp1.Lst(Id_).get(0).getEmergency_contact());
               mail.setText(cp1.Lst(Id_).get(0).getEmail());
               NSsocial.setText(cp1.Lst(Id_).get(0).getSocial_security_number());
               
               patient.setVisible(false);
    }//GEN-LAST:event_patientActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view(0).setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NSsocial;
    private javax.swing.JLabel address;
    private javax.swing.JLabel allergie;
    private javax.swing.JButton consultation;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel date;
    private javax.swing.JButton hospitalisation;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlabel1_photoId;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel name;
    private javax.swing.JLabel names;
    private java.awt.Panel panel3;
    private javax.swing.JButton patient;
    private javax.swing.JLabel pname;
    private javax.swing.JButton presmedicament;
    private javax.swing.JLabel sexe;
    // End of variables declaration//GEN-END:variables
}