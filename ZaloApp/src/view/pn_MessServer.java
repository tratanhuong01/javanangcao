package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pn_MessServer extends javax.swing.JPanel {

    Timer time;
    int i = 0;

    public pn_MessServer(String messServer) {
        initComponents();
        pnMess.removeAll();
        pnMess.setLayout(new BorderLayout());
        JLabel lb = new JLabel();
        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/load.gif")));
        pnMess.add(lb);
        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                i++;
                if (i == 1) {
                    time.stop();
                    pnMess.removeAll();
                    pnMess.setLayout(new BorderLayout());
                    pnMess.add(taMessServer);
                    taMessServer.setText(messServer.split("@")[1]);
                    times.setText(messServer.split("@")[2]);
                    pnMess.validate();
                }
            }
        });
        time.start();
        taMessServer.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnMess = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMessServer = new javax.swing.JTextArea();
        times = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(530, 123));
        setMinimumSize(new java.awt.Dimension(530, 123));
        setPreferredSize(new java.awt.Dimension(530, 123));
        setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avata.PNG"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 89, 110);

        pnMess.setBackground(java.awt.Color.white);
        pnMess.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        pnMess.setLayout(null);

        taMessServer.setColumns(1);
        taMessServer.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        taMessServer.setLineWrap(true);
        taMessServer.setRows(3);
        taMessServer.setWrapStyleWord(true);
        taMessServer.setMargin(new java.awt.Insets(8, 8, 8, 8));
        taMessServer.setMaximumSize(new java.awt.Dimension(27, 79));
        taMessServer.setMinimumSize(new java.awt.Dimension(27, 79));
        jScrollPane1.setViewportView(taMessServer);

        pnMess.add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 434, 70);

        add(pnMess);
        pnMess.setBounds(94, 0, 436, 84);

        times.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        times.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(times);
        times.setBounds(350, 80, 160, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnMess;
    private javax.swing.JTextArea taMessServer;
    private javax.swing.JLabel times;
    // End of variables declaration//GEN-END:variables
}
