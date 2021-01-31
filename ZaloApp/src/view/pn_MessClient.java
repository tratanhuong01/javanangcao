package view;

public class pn_MessClient extends javax.swing.JPanel {

    public pn_MessClient(String messClient,String name) {
        initComponents();
        taMessClient.setWrapStyleWord(true);
        if (messClient.split("@").length <= 1) {
            taMessClient.setText(messClient);
        }
        else {
            taMessClient.setText(messClient.split("@")[0]);
            time.setText(messClient.split("@")[2]);
            taMessClient.setEditable(false);
            nameU.setText(name);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taMessClient = new javax.swing.JTextArea();
        time = new javax.swing.JLabel();
        nameU = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(530, 123));
        setMinimumSize(new java.awt.Dimension(530, 123));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(530, 123));
        setRequestFocusEnabled(false);
        setLayout(null);

        taMessClient.setBackground(new java.awt.Color(102, 255, 255));
        taMessClient.setColumns(1);
        taMessClient.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        taMessClient.setLineWrap(true);
        taMessClient.setRows(3);
        taMessClient.setWrapStyleWord(true);
        taMessClient.setMargin(new java.awt.Insets(8, 8, 8, 8));
        taMessClient.setMaximumSize(new java.awt.Dimension(27, 79));
        taMessClient.setMinimumSize(new java.awt.Dimension(27, 79));
        jScrollPane1.setViewportView(taMessClient);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 10, 430, 70);

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        time.setText("jLabel1");
        add(time);
        time.setBounds(350, 80, 160, 30);

        nameU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(nameU);
        nameU.setBounds(0, 26, 100, 40);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameU;
    private javax.swing.JTextArea taMessClient;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
