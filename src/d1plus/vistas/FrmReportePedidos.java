package d1plus.vistas;

/**
 * Vista: Reporte de pedidos procesados y pendientes (RF28)
 */
public class FrmReportePedidos extends javax.swing.JFrame {

    public FrmReportePedidos() {
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
        lblVolverAReportes = new javax.swing.JLabel();
        cmbTodosLosEstados = new javax.swing.JComboBox<>();
        btnExportar = new javax.swing.JButton();
        pnlPedidosProcesados = new javax.swing.JPanel();
        lblPedidosProcesadosTitulo = new javax.swing.JLabel();
        lblPedidosProcesadosValor = new javax.swing.JLabel();
        pnlPedidosPendientes = new javax.swing.JPanel();
        lblPedidosPendientesTitulo = new javax.swing.JLabel();
        lblPedidosPendientesValor = new javax.swing.JLabel();
        scpPedidos = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Reporte de pedidos");
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
        lblProveedores.setText("   Proveedores");

        lblReportes.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setBackground(new java.awt.Color(37, 99, 235));
        lblReportes.setOpaque(true);
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
        lblSeccion.setText("Reporte de pedidos");

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
        lblTitulo.setText("Reporte de Pedidos Procesados y Pendientes");

        lblVolverAReportes.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblVolverAReportes.setForeground(new java.awt.Color(37, 99, 235));
        lblVolverAReportes.setText("← Volver a Reportes");

        cmbTodosLosEstados.setFont(new java.awt.Font("Segoe UI", 0, 13));
        cmbTodosLosEstados.setBackground(new java.awt.Color(255, 255, 255));
        cmbTodosLosEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los estados", "Pendiente", "Aprobado", "Despachado", "Recibido" }));

        btnExportar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnExportar.setForeground(new java.awt.Color(30, 41, 59));
        btnExportar.setBackground(new java.awt.Color(255, 255, 255));
        btnExportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnExportar.setText("Exportar");
        btnExportar.setFocusPainted(false);

        pnlPedidosProcesados.setBackground(new java.awt.Color(255, 255, 255));
        pnlPedidosProcesados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblPedidosProcesadosTitulo.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblPedidosProcesadosTitulo.setForeground(new java.awt.Color(100, 116, 139));
        lblPedidosProcesadosTitulo.setText("Pedidos procesados");

        lblPedidosProcesadosValor.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblPedidosProcesadosValor.setForeground(new java.awt.Color(22, 163, 74));
        lblPedidosProcesadosValor.setText("18");

        pnlPedidosPendientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlPedidosPendientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblPedidosPendientesTitulo.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblPedidosPendientesTitulo.setForeground(new java.awt.Color(100, 116, 139));
        lblPedidosPendientesTitulo.setText("Pedidos pendientes");

        lblPedidosPendientesValor.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblPedidosPendientesValor.setForeground(new java.awt.Color(245, 158, 11));
        lblPedidosPendientesValor.setText("4");

        scpPedidos.setViewportView(tblPedidos);

        tblPedidos.setFont(new java.awt.Font("Segoe UI", 0, 13));
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N.º Pedido", "Proveedor", "Fecha", "Estado"
            }
        ));
        tblPedidos.setRowHeight(36);
        tblPedidos.setGridColor(new java.awt.Color(203, 213, 225));

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

        javax.swing.GroupLayout pnlPedidosProcesadosLayout = new javax.swing.GroupLayout(pnlPedidosProcesados);
        pnlPedidosProcesados.setLayout(pnlPedidosProcesadosLayout);
        pnlPedidosProcesadosLayout.setHorizontalGroup(
            pnlPedidosProcesadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
            .addGroup(pnlPedidosProcesadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPedidosProcesadosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPedidosProcesadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPedidosProcesadosValor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPedidosProcesadosLayout.setVerticalGroup(
            pnlPedidosProcesadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(pnlPedidosProcesadosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblPedidosProcesadosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPedidosProcesadosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblPedidosProcesadosValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlPedidosPendientesLayout = new javax.swing.GroupLayout(pnlPedidosPendientes);
        pnlPedidosPendientes.setLayout(pnlPedidosPendientesLayout);
        pnlPedidosPendientesLayout.setHorizontalGroup(
            pnlPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
            .addGroup(pnlPedidosPendientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPedidosPendientesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPedidosPendientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPedidosPendientesValor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPedidosPendientesLayout.setVerticalGroup(
            pnlPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(pnlPedidosPendientesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblPedidosPendientesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPedidosPendientesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblPedidosPendientesValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(lblVolverAReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(cmbTodosLosEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(pnlPedidosProcesados, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addComponent(pnlPedidosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(scpPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(120, 120, 120)
                .addComponent(lblVolverAReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(cmbTodosLosEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(pnlPedidosProcesados, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(pnlPedidosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(scpPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        scpPedidos.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {"P-0001", "Distribuidora ABC", "28/09/2026", "Pendiente"},
                {"P-0002", "Alimentos del Valle", "30/09/2026", "Aprobado"},
                {"P-0003", "Distribuidora ABC", "07/10/2026", "Despachado"},
                {"P-0004", "Proveedora Nacional", "02/10/2026", "Recibido"}
            },
            new String[] {"N.º Pedido", "Proveedor", "Fecha", "Estado"}));
        tblPedidos.getTableHeader().setBackground(new java.awt.Color(226, 232, 240));
        tblPedidos.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 13));
        tblPedidos.getTableHeader().setPreferredSize(new java.awt.Dimension(100, 36));
        tblPedidos.getColumnModel().getColumn(0).setPreferredWidth(204);
        tblPedidos.getColumnModel().getColumn(1).setPreferredWidth(318);
        tblPedidos.getColumnModel().getColumn(2).setPreferredWidth(204);
        tblPedidos.getColumnModel().getColumn(3).setPreferredWidth(204);
    }

    public static void main(String[] args) {
        new FrmReportePedidos().setVisible(true);
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
    private javax.swing.JLabel lblVolverAReportes;
    private javax.swing.JComboBox<String> cmbTodosLosEstados;
    private javax.swing.JButton btnExportar;
    private javax.swing.JPanel pnlPedidosProcesados;
    private javax.swing.JLabel lblPedidosProcesadosTitulo;
    private javax.swing.JLabel lblPedidosProcesadosValor;
    private javax.swing.JPanel pnlPedidosPendientes;
    private javax.swing.JLabel lblPedidosPendientesTitulo;
    private javax.swing.JLabel lblPedidosPendientesValor;
    private javax.swing.JScrollPane scpPedidos;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
