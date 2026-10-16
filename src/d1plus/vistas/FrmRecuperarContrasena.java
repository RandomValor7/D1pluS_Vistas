package d1plus.vistas;

/**
 * Vista: Recuperar contraseña (RF04)
 */
public class FrmRecuperarContrasena extends javax.swing.JFrame {

    public FrmRecuperarContrasena() {
        initComponents();
        aplicarDiseno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTarjeta = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        btnEnviarCodigo = new javax.swing.JButton();
        lblVolverAlInicioDeSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Recuperar contraseña");
        setResizable(false);

        pnlTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        pnlTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 30));
        lblLogo.setForeground(new java.awt.Color(37, 99, 235));
        lblLogo.setText("D1pluS");
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        lblSubtitulo.setText("<html><center>Ingresa tu correo registrado y te enviaremos<br>un código para restablecer tu contraseña</center></html>");
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblCorreoElectronico.setForeground(new java.awt.Color(30, 41, 59));
        lblCorreoElectronico.setText("Correo electrónico");

        txtCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));

        btnEnviarCodigo.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnEnviarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarCodigo.setBackground(new java.awt.Color(37, 99, 235));
        btnEnviarCodigo.setText("Enviar código");
        btnEnviarCodigo.setFocusPainted(false);
        btnEnviarCodigo.setBorderPainted(false);

        lblVolverAlInicioDeSesion.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblVolverAlInicioDeSesion.setForeground(new java.awt.Color(37, 99, 235));
        lblVolverAlInicioDeSesion.setText("Volver al inicio de sesión");
        lblVolverAlInicioDeSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlTarjetaLayout = new javax.swing.GroupLayout(pnlTarjeta);
        pnlTarjeta.setLayout(pnlTarjetaLayout);
        pnlTarjetaLayout.setHorizontalGroup(
            pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnEnviarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblVolverAlInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTarjetaLayout.setVerticalGroup(
            pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(lblCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnEnviarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(lblVolverAlInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(pnlTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnlTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(248, 250, 252));
    }

    public static void main(String[] args) {
        new FrmRecuperarContrasena().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlTarjeta;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JButton btnEnviarCodigo;
    private javax.swing.JLabel lblVolverAlInicioDeSesion;
    // End of variables declaration//GEN-END:variables
}
