package view;

import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import controller.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import static view.Clients.pnMain;

public class Servers extends javax.swing.JFrame {

    public String idKhachHang = "";
    public int i = 0;
    public int count = 0;
    public JMenuItem[] mn;
    Socket skClient;
    DataOutputStream dos = null;
    DataInputStream dis = null;
    public static ServerSocket serverSocket = null;
    Thread thread;
    String str;
    public Servers() {
        initComponents();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        txtID.setEditable(false);

        new PopupMenu_2().load(lb).addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });
        try {
            serverSocket = new ServerSocket(6654);
            System.out.println("loading");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        lb = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        pnRight = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSend = new javax.swing.JButton();
        btnCamera = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbScroll = new javax.swing.JScrollPane();
        pnMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));
        setSize(new java.awt.Dimension(600, 800));

        pn.setBackground(java.awt.Color.white);
        pn.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray, 3));
        pn.setLayout(new java.awt.BorderLayout());

        pnLeft.setBackground(new java.awt.Color(43, 172, 244));
        pnLeft.setMaximumSize(new java.awt.Dimension(85, 800));
        pnLeft.setMinimumSize(new java.awt.Dimension(85, 800));
        pnLeft.setPreferredSize(new java.awt.Dimension(85, 800));
        pnLeft.setLayout(null);

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avata.PNG"))); // NOI18N
        pnLeft.add(lb);
        lb.setBounds(0, 0, 90, 98);

        btn.setBackground(new java.awt.Color(255, 255, 255));
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sms.png"))); // NOI18N
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        pnLeft.add(btn);
        btn.setBounds(12, 120, 63, 70);

        txtID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setText("Server");
        pnLeft.add(txtID);
        txtID.setBounds(0, 210, 90, 64);

        pn.add(pnLeft, java.awt.BorderLayout.LINE_START);

        pnRight.setBackground(java.awt.Color.white);
        pnRight.setMaximumSize(new java.awt.Dimension(531, 800));
        pnRight.setMinimumSize(new java.awt.Dimension(531, 800));
        pnRight.setPreferredSize(new java.awt.Dimension(531, 800));
        pnRight.setRequestFocusEnabled(false);
        pnRight.setLayout(null);

        btnSend.setBackground(java.awt.Color.white);
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.png"))); // NOI18N
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnCamera.setBackground(java.awt.Color.white);
        btnCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/camera.png"))); // NOI18N
        btnCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCameraActionPerformed(evt);
            }
        });

        btnImport.setBackground(java.awt.Color.white);
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attach.png"))); // NOI18N

        input.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnRight.add(jPanel1);
        jPanel1.setBounds(0, 650, 550, 137);

        cbScroll.setPreferredSize(new java.awt.Dimension(515, 650));

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setMaximumSize(new java.awt.Dimension(515, 5000));
        pnMain.setMinimumSize(new java.awt.Dimension(515, 648));
        pnMain.setPreferredSize(new java.awt.Dimension(515, 648));

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        cbScroll.setViewportView(pnMain);

        pnRight.add(cbScroll);
        cbScroll.setBounds(0, 0, 530, 650);

        pn.add(pnRight, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void load(String time1,String messClient, String messServer, JPanel pnMain) {
        pnMain.add(new pn_MessServer(messServer));
        pnMain.add(new pn_MessClient(messClient, time1));
    }
    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed

    }//GEN-LAST:event_btnActionPerformed
    public void updateGUI(int i) {
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        pnMain.setPreferredSize(new Dimension(530, i * 123));
        cbScroll.getViewport().setViewPosition(new Point(0, i * 123));
        cbScroll.validate();
        pnMain.updateUI();
    }
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        i += 2;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Socket connectSocket = serverSocket.accept();
                        DataInputStream dis = new DataInputStream(connectSocket.getInputStream());
                        DataOutputStream dos = new DataOutputStream(connectSocket.getOutputStream());
                        String in = dis.readUTF();
                        Thread threadMain = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    load(in.split("@")[0],in.split("@")[1], input.getText(), pnMain);
                                }
                            });
                        threadMain.start();
                        Date date2 = new Date(System.currentTimeMillis());
                        String time2 = new SimpleDateFormat("hh:mm:ss").format(date2);
                        load(time2, in, input.getText(), pnMain);
                        
                        dos.writeUTF(input.getText() + "@" + time2);
                        dos.flush();
                        updateGUI(i);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        
        input.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCameraActionPerformed

    }//GEN-LAST:event_btnCameraActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnCamera;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane cbScroll;
    public static javax.swing.JTextField input;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnLeft;
    public static javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnRight;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
