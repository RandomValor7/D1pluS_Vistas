package d1plus.vistas;

/**
 * Vista: Registrar una devolución a proveedor (RF23)
 */
public class FrmDevolucionProveedor extends javax.swing.JFrame {

    public FrmDevolucionProveedor() {
        initComponents();
        aplicarDiseno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblNotificaciones = new javax.swing.JLabel();
        lblAuditoria = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();
        pnlBarra = new javax.swing.JPanel();
        lblSeccion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        lblCantidadADevolver = new javax.swing.JLabel();
        txtCantidadADevolver = new javax.swing.JTextField();
        lblMotivoDeLaDevolucion = new javax.swing.JLabel();
        txtMotivoDeLaDevolucion = new javax.swing.JTextField();
        btnRegistrarDevolucion = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Devolución a proveedor");
        setResizable(false);

        pnlMenu.setBackground(new java.awt.Color(30, 41, 59));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 26));
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setText("D1pluS");

        lblDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("   Dashboard");

        lblUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setText("   Usuarios");

        lblInventario.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblInventario.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario.setText("   Inventario");

        lblVentas.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setText("   Ventas");

        lblPedidos.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblPedidos.setForeground(new java.awt.Color(255, 255, 255));
        lblPedidos.setText("   Pedidos");

        lblProveedores.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblProveedores.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores.setBackground(new java.awt.Color(37, 99, 235));
        lblProveedores.setOpaque(true);
        lblProveedores.setText("   Proveedores");

        lblReportes.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setText("   Reportes");

        lblNotificaciones.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblNotificaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblNotificaciones.setText("   Notificaciones");

        lblAuditoria.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblAuditoria.setForeground(new java.awt.Color(255, 255, 255));
        lblAuditoria.setText("   Auditoría");

        lblAyuda.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblAyuda.setForeground(new java.awt.Color(255, 255, 255));
        lblAyuda.setText("   Ayuda");

        pnlBarra.setBackground(new java.awt.Color(248, 250, 252));

        lblSeccion.setFont(new java.awt.Font("Segoe UI", 1, 15));
        lblSeccion.setForeground(new java.awt.Color(30, 41, 59));
        lblSeccion.setText("Devolución a proveedor");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblUsuario.setForeground(new java.awt.Color(100, 116, 139));
        lblUsuario.setText("Mito Ramírez");
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblAvatar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lblAvatar.setBackground(new java.awt.Color(245, 158, 11));
        lblAvatar.setOpaque(true);
        lblAvatar.setText("M");
        lblAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22));
        lblTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblTitulo.setText("Registrar Devolución a Proveedor");

        lblProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblProveedor.setForeground(new java.awt.Color(30, 41, 59));
        lblProveedor.setText("Proveedor");

        cmbProveedor.setFont(new java.awt.Font("Segoe UI", 0, 13));
        cmbProveedor.setBackground(new java.awt.Color(255, 255, 255));
        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distribuidora ABC", "Alimentos del Valle", "Proveedora Nacional" }));

        lblProducto.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblProducto.setForeground(new java.awt.Color(30, 41, 59));
        lblProducto.setText("Producto");

        txtProducto.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtProducto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));

        lblCantidadADevolver.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblCantidadADevolver.setForeground(new java.awt.Color(30, 41, 59));
        lblCantidadADevolver.setText("Cantidad a devolver");

        txtCantidadADevolver.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtCantidadADevolver.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));

        lblMotivoDeLaDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lblMotivoDeLaDevolucion.setForeground(new java.awt.Color(30, 41, 59));
        lblMotivoDeLaDevolucion.setText("Motivo de la devolución");

        txtMotivoDeLaDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtMotivoDeLaDevolucion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));

        btnRegistrarDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnRegistrarDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarDevolucion.setBackground(new java.awt.Color(37, 99, 235));
        btnRegistrarDevolucion.setText("Registrar Devolución");
        btnRegistrarDevolucion.setFocusPainted(false);
        btnRegistrarDevolucion.setBorderPainted(false);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnCancelar.setForeground(new java.awt.Color(30, 41, 59));
        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusPainted(false);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(lblPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(lblNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(lblAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addGap(952, 952, 952)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(pnlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblCantidadADevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(txtCantidadADevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblMotivoDeLaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(txtMotivoDeLaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnRegistrarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(lblCantidadADevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(txtCantidadADevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(lblMotivoDeLaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(txtMotivoDeLaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(btnRegistrarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    public static void main(String[] args) {
        new FrmDevolucionProveedor().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblNotificaciones;
    private javax.swing.JLabel lblAuditoria;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JLabel lblCantidadADevolver;
    private javax.swing.JTextField txtCantidadADevolver;
    private javax.swing.JLabel lblMotivoDeLaDevolucion;
    private javax.swing.JTextField txtMotivoDeLaDevolucion;
    private javax.swing.JButton btnRegistrarDevolucion;
    private javax.swing.JButton btnCancelar;
    // End of variables declaration//GEN-END:variables
}
