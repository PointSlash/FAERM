 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package faemf.home;

import jssc.SerialPort;
import jssc.SerialPortList;
import jssc.SerialPortException;
import jssc.SerialPortEvent;

/**
 *
 * @author GadgetZone
 */
public class verification extends javax.swing.JFrame {
    
    private StringBuilder buffer = new StringBuilder();
    private boolean capturing = false;
    private int captureCount = 0;
    private final int CAPTURE_SIZE = 1026;
    private String capturedData = "";
    private SerialPort port;

    /**
     * Creates new form home
     */
    public verification() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        body = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rfid = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fingerprint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Verification");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Enregistrement");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Deconnection");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Historique");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Image1_1.png"))); // NOI18N
        jLabel2.setText("Dashboard");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 200, 80));

        panel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Verifier via RFID");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images (1).png"))); // NOI18N
        jLabel3.setOpaque(true);

        rfid.setText("RFID");
        rfid.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        rfid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rfid, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(rfid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        panel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Verifier via Empreinte digital");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images (2).png"))); // NOI18N
        jLabel4.setOpaque(true);

        fingerprint.setText("Empreinte");
        fingerprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fingerprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fingerprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fingerprint, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Mere");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VRfid enr = new VRfid();
        enr.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        historique his = new historique();
        his.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void fingerprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fingerprintActionPerformed
        // TODO add your handling code here:
        connect("COM10");
        
        sendData("1");
//        System.out.println("OPI__");
        
    }//GEN-LAST:event_fingerprintActionPerformed

    private void rfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfidActionPerformed
        // TODO add your handling code here:
        sendData("1");
//        System.out.println("OPI__");
    }//GEN-LAST:event_rfidActionPerformed

    /**
     * 
     * ici je met les foction pour la verification _rfid et figenrprint_
     * 
     */
    
    public void connect(String portname) {
        port = new SerialPort(portname);
  
        try {
            port.openPort();
            port.setParams(
                    SerialPort.BAUDRATE_9600, 
                    SerialPort.DATABITS_8, 
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE
            );

            port.addEventListener((SerialPortEvent event) -> {
                if (event.isRXCHAR()) {
                    try {
                        String s = port.readString(event.getEventValue());
                        if (s != null) {
                            System.out.print(s);
                            buffer.append(s);

                            // Détection et traitement de la séquence "8y"
                            if (buffer.indexOf("yyyyyyyy") != -1) {
                                int index = buffer.indexOf("yyyyyyyy");
                                if (buffer.length() >= index + 22) {
                                    String next8Chars = buffer.substring(index + 11, index + 22);
                                    System.out.println("Les 8 caractères suivants:__ " + next8Chars+"__fin");
                                    buffer.delete(0, index + 10); // Supprime jusqu'à après les 8 caractères suivants
//                                    sendData("1");
                                }
                            }

                            if (capturing) {
                                int remaining = CAPTURE_SIZE - capturedData.length();
                                if (s.length() <= remaining) {
                                    capturedData += s;
                                } else {
                                    capturedData += s.substring(0, remaining);
                                }

                                if (capturedData.length() >= CAPTURE_SIZE) {
                                    System.out.println("\nCaptured Data_ff: " + capturedData);
                                    capturing = false;
                                    capturedData = "";
                                }
                            } else {
                                String receivedData = buffer.toString();
                                int index = receivedData.indexOf("xxxxxxxx");
                                if (index != -1) {
                                    capturing = true;
                                    buffer.delete(0, index + 8); // Remove everything up to and including "xxxxxxxx"
                                    capturedData = "";
                                }
                            }

                        }
                    } catch (SerialPortException e) {
                        e.printStackTrace();
                    }
                }
            });
            System.out.println("Connecté au port: " + portname);
            
            // Envoi du caractère "1" après l'ouverture du port
//            sendData("1");
            
        } catch (SerialPortException e) {
            e.printStackTrace();
//                System.out.print("opi_____GoldenSlash");
        }
    }
    
    
    // Méthode pour envoyer des données sur le port série
    public void sendData(String data) {

        try {
            if (port != null && port.isOpened()) {
                port.writeString(data);
                System.out.println("Données envoyées : " + data);
            } else {
                System.out.println("Port non ouvert ou null");
            }
        } catch (SerialPortException e) {
            e.printStackTrace();
            }
    }
    
    
    /**
     ca prend fin ici__
     */
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        /*
            ici encore ce mon code:
        */
            String[] portlist = SerialPortList.getPortNames();
        for (String port : portlist) {
//            System.out.println(port);
        }
//        verification obj = new verification();
        boolean connected = false;
        for (String port : portlist) {
            try {
//                obj.connect("COM10");
                connected = true;
                break;
            } catch (Exception e) {
                System.err.println("Impossible de se connecter au port: " + port);
            }
        }
//        if (!connected) {
//            System.out.println("Aucun port série disponible n'a pu être connecté.");
//        }
        /*
            ca prend fin ici:
        */
           
        
        
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
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verification().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel body;
    private javax.swing.JButton fingerprint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JButton rfid;
    // End of variables declaration//GEN-END:variables
}
