package d1plus.vistas;

/**
 * Vista: Listado de proveedores (RF21)
 */
public class FrmProveedores extends javax.swing.JFrame {

    public FrmProveedores() {
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
        btnRegistrarProveedor = new javax.swing.JButton();
        txtBuscarProveedor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAsociarProductos = new javax.swing.JButton();
        btnRegistrarDevolucion = new javax.swing.JButton();
        scpProveedores = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Proveedores");
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
        lblSeccion.setText("Proveedores");

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
        lblTitulo.setText("Listado de Proveedores");

        btnRegistrarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnRegistrarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProveedor.setBackground(new java.awt.Color(37, 99, 235));
        btnRegistrarProveedor.setText("Registrar Proveedor");
        btnRegistrarProveedor.setFocusPainted(false);
        btnRegistrarProveedor.setBorderPainted(false);

        txtBuscarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 13));
        txtBuscarProveedor.setForeground(new java.awt.Color(100, 116, 139));
        txtBuscarProveedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));
        txtBuscarProveedor.setText("Buscar proveedor...");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnBuscar.setForeground(new java.awt.Color(30, 41, 59));
        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusPainted(false);

        btnAsociarProductos.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnAsociarProductos.setForeground(new java.awt.Color(30, 41, 59));
        btnAsociarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnAsociarProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnAsociarProductos.setText("Asociar productos");
        btnAsociarProductos.setFocusPainted(false);

        btnRegistrarDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnRegistrarDevolucion.setForeground(new java.awt.Color(30, 41, 59));
        btnRegistrarDevolucion.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarDevolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnRegistrarDevolucion.setText("Registrar devolución");
        btnRegistrarDevolucion.setFocusPainted(false);

        scpProveedores.setViewportView(tblProveedores);

        tblProveedores.setFont(new java.awt.Font("Segoe UI", 0, 13));
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "NIT", "Contacto", "Productos que ofrece"
            }
        ));
        tblProveedores.setRowHeight(36);
        tblProveedores.setGridColor(new java.awt.Color(203, 213, 225));

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
                .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(btnAsociarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(882, 882, 882)
                .addComponent(btnRegistrarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(scpProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnAsociarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnRegistrarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(scpProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        scpProveedores.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {"Distribuidora ABC", "900.523.459-1", "301 555 0101", "Abarrotes"},
                {"Alimentos del Valle", "900.444.321-3", "300 444 0002", "Lácteos y perecederos"},
                {"Proveedora Nacional", "900.789.123-4", "302 555 0303", "Aseo y limpieza"},
                {"Panadería La Espiga", "900.321.654-8", "310 222 0404", "Panadería"}
            },
            new String[] {"Nombre", "NIT", "Contacto", "Productos que ofrece"}));
        tblProveedores.getTableHeader().setBackground(new java.awt.Color(226, 232, 240));
        tblProveedores.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 13));
        tblProveedores.getTableHeader().setPreferredSize(new java.awt.Dimension(100, 36));
        tblProveedores.getColumnModel().getColumn(0).setPreferredWidth(261);
        tblProveedores.getColumnModel().getColumn(1).setPreferredWidth(199);
        tblProveedores.getColumnModel().getColumn(2).setPreferredWidth(188);
        tblProveedores.getColumnModel().getColumn(3).setPreferredWidth(282);
    }

    public static void main(String[] args) {
        new FrmProveedores().setVisible(true);
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
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JTextField txtBuscarProveedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnAsociarProductos;
    private javax.swing.JButton btnRegistrarDevolucion;
    private javax.swing.JScrollPane scpProveedores;
    private javax.swing.JTable tblProveedores;
    // End of variables declaration//GEN-END:variables
}
