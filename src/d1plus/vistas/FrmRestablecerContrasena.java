package d1plus.vistas;

/**
 * Vista: Restablecer contraseña (RF04)
 */
public class FrmRestablecerContrasena extends javax.swing.JFrame {

    public FrmRestablecerContrasena() {
        initComponents();
        aplicarDiseno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTarjeta = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblCodigoDeVerificacion = new javax.swing.JLabel();
        txtCodigoDeVerificacion = new javax.swing.JTextField();
        lblNuevaContrasena = new javax.swing.JLabel();
        txtNuevaContrasena = new javax.swing.JPasswordField();
        lblConfirmarNuevaContrasena = new javax.swing.JLabel();
        txtConfirmarNuevaContrasena = new javax.swing.JPasswordField();
        btnRestablecerContrasena = new javax.swing.JButton();
        lblVolverAlInicioDeSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Restablecer contraseña");
        setResizable(false);

        pnlTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        pnlTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 30));
        lblLogo.setForeground(new java.awt.Color(37, 99, 235));
        lblLogo.setText("D1pluS");
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        lblSubtitulo.setText("<html><center>Escribe el código que recibiste<br>y elige tu nueva contraseña</center></html>");
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblCodigoDeVerificacion.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblCodigoDeVerificacion.setForeground(new java.awt.Color(30, 41, 59));
        lblCodigoDeVerificacion.setText("Código de verificación");

        txtCodigoDeVerificacion.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtCodigoDeVerificacion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));

        lblNuevaContrasena.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblNuevaContrasena.setForeground(new java.awt.Color(30, 41, 59));
        lblNuevaContrasena.setText("Nueva contraseña");

        txtNuevaContrasena.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtNuevaContrasena.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));

        lblConfirmarNuevaContrasena.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblConfirmarNuevaContrasena.setForeground(new java.awt.Color(30, 41, 59));
        lblConfirmarNuevaContrasena.setText("Confirmar nueva contraseña");

        txtConfirmarNuevaContrasena.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtConfirmarNuevaContrasena.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));

        btnRestablecerContrasena.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnRestablecerContrasena.setForeground(new java.awt.Color(255, 255, 255));
        btnRestablecerContrasena.setBackground(new java.awt.Color(37, 99, 235));
        btnRestablecerContrasena.setText("Restablecer contraseña");
        btnRestablecerContrasena.setFocusPainted(false);
        btnRestablecerContrasena.setBorderPainted(false);

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
                .addComponent(lblCodigoDeVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtCodigoDeVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblConfirmarNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtConfirmarNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRestablecerContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblVolverAlInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTarjetaLayout.setVerticalGroup(
            pnlTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(lblCodigoDeVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(txtCodigoDeVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(lblNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(txtNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(lblConfirmarNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(txtConfirmarNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(btnRestablecerContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTarjetaLayout.createSequentialGroup()
                .addGap(431, 431, 431)
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
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnlTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(248, 250, 252));
    }

    public static void main(String[] args) {
        new FrmRestablecerContrasena().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlTarjeta;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblCodigoDeVerificacion;
    private javax.swing.JTextField txtCodigoDeVerificacion;
    private javax.swing.JLabel lblNuevaContrasena;
    private javax.swing.JPasswordField txtNuevaContrasena;
    private javax.swing.JLabel lblConfirmarNuevaContrasena;
    private javax.swing.JPasswordField txtConfirmarNuevaContrasena;
    private javax.swing.JButton btnRestablecerContrasena;
    private javax.swing.JLabel lblVolverAlInicioDeSesion;
    // End of variables declaration//GEN-END:variables
}
