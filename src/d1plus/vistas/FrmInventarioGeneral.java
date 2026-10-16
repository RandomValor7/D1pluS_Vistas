package d1plus.vistas;

/**
 * Vista: Inventario general por ubicación (RF06, RF07)
 */
public class FrmInventarioGeneral extends javax.swing.JFrame {

    public FrmInventarioGeneral() {
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
        btnRegistrarEntrada = new javax.swing.JButton();
        cmbTodasLasUbicaciones = new javax.swing.JComboBox<>();
        scpInventario = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        btnRegistrarSalida = new javax.swing.JButton();
        btnActualizarInventario = new javax.swing.JButton();
        btnProductosVencidos = new javax.swing.JButton();
        btnBajaRotacion = new javax.swing.JButton();
        btnTiempoReal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Inventario general");
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
        lblInventario.setBackground(new java.awt.Color(37, 99, 235));
        lblInventario.setOpaque(true);
        lblInventario.setText("   Inventario");

        lblVentas.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setText("   Ventas");

        lblPedidos.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblPedidos.setForeground(new java.awt.Color(255, 255, 255));
        lblPedidos.setText("   Pedidos");

        lblProveedores.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblProveedores.setForeground(new java.awt.Color(255, 255, 255));
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
        lblSeccion.setText("Inventario");

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
        lblTitulo.setText("Inventario General");

        btnRegistrarEntrada.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnRegistrarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEntrada.setBackground(new java.awt.Color(37, 99, 235));
        btnRegistrarEntrada.setText("+ Registrar Entrada");
        btnRegistrarEntrada.setFocusPainted(false);
        btnRegistrarEntrada.setBorderPainted(false);

        cmbTodasLasUbicaciones.setFont(new java.awt.Font("Segoe UI", 0, 13));
        cmbTodasLasUbicaciones.setBackground(new java.awt.Color(255, 255, 255));
        cmbTodasLasUbicaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las ubicaciones", "Bodega Principal", "Tienda Norte", "Tienda Centro" }));

        scpInventario.setViewportView(tblInventario);

        tblInventario.setFont(new java.awt.Font("Segoe UI", 0, 13));
        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Ubicación", "Cantidad", "Estado", "Acciones"
            }
        ));
        tblInventario.setRowHeight(36);
        tblInventario.setGridColor(new java.awt.Color(203, 213, 225));

        btnRegistrarSalida.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnRegistrarSalida.setForeground(new java.awt.Color(30, 41, 59));
        btnRegistrarSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnRegistrarSalida.setText("Registrar salida");
        btnRegistrarSalida.setFocusPainted(false);

        btnActualizarInventario.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnActualizarInventario.setForeground(new java.awt.Color(30, 41, 59));
        btnActualizarInventario.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnActualizarInventario.setText("Actualizar inventario");
        btnActualizarInventario.setFocusPainted(false);

        btnProductosVencidos.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnProductosVencidos.setForeground(new java.awt.Color(30, 41, 59));
        btnProductosVencidos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductosVencidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnProductosVencidos.setText("Productos vencidos");
        btnProductosVencidos.setFocusPainted(false);

        btnBajaRotacion.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnBajaRotacion.setForeground(new java.awt.Color(30, 41, 59));
        btnBajaRotacion.setBackground(new java.awt.Color(255, 255, 255));
        btnBajaRotacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnBajaRotacion.setText("Baja rotación");
        btnBajaRotacion.setFocusPainted(false);

        btnTiempoReal.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnTiempoReal.setForeground(new java.awt.Color(30, 41, 59));
        btnTiempoReal.setBackground(new java.awt.Color(255, 255, 255));
        btnTiempoReal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnTiempoReal.setText("Tiempo real");
        btnTiempoReal.setFocusPainted(false);

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
                .addGap(991, 991, 991)
                .addComponent(btnRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(cmbTodasLasUbicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(scpInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(btnActualizarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(666, 666, 666)
                .addComponent(btnProductosVencidos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(867, 867, 867)
                .addComponent(btnBajaRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1026, 1026, 1026)
                .addComponent(btnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(80, 80, 80)
                .addComponent(btnRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(cmbTodasLasUbicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(scpInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnActualizarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnProductosVencidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnBajaRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        scpInventario.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {"Arroz Diana 500g", "Tienda Centro", "85", "Normal", "Ver"},
                {"Leche Entera 1L", "Tienda Norte", "6", "Bajo", "Ver"},
                {"Aceite Girasol 1L", "Bodega Principal", "120", "Normal", "Ver"},
                {"Papel Higiénico x4", "Bodega Principal", "0", "Agotado", "Ver"},
                {"Yogurt Natural 200g", "Tienda Centro", "34", "Normal", "Ver"}
            },
            new String[] {"Producto", "Ubicación", "Cantidad", "Estado", "Acciones"}));
        tblInventario.getTableHeader().setBackground(new java.awt.Color(226, 232, 240));
        tblInventario.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 13));
        tblInventario.getTableHeader().setPreferredSize(new java.awt.Dimension(100, 36));
        tblInventario.getColumnModel().getColumn(0).setPreferredWidth(264);
        tblInventario.getColumnModel().getColumn(1).setPreferredWidth(232);
        tblInventario.getColumnModel().getColumn(2).setPreferredWidth(148);
        tblInventario.getColumnModel().getColumn(3).setPreferredWidth(137);
        tblInventario.getColumnModel().getColumn(4).setPreferredWidth(148);
    }

    public static void main(String[] args) {
        new FrmInventarioGeneral().setVisible(true);
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
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JComboBox<String> cmbTodasLasUbicaciones;
    private javax.swing.JScrollPane scpInventario;
    private javax.swing.JTable tblInventario;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JButton btnActualizarInventario;
    private javax.swing.JButton btnProductosVencidos;
    private javax.swing.JButton btnBajaRotacion;
    private javax.swing.JButton btnTiempoReal;
    // End of variables declaration//GEN-END:variables
}
