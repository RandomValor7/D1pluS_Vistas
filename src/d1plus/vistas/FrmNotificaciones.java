package d1plus.vistas;

/**
 * Vista: Centro de notificaciones (RF33 a RF36)
 */
public class FrmNotificaciones extends javax.swing.JFrame {

    public FrmNotificaciones() {
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
        cmbTodasLasNotificaciones = new javax.swing.JComboBox<>();
        btnMarcarTodasComoLeidas = new javax.swing.JButton();
        pnlStockBajoLecheEntera = new javax.swing.JPanel();
        pnlBarraStockBajoLecheEntera = new javax.swing.JPanel();
        lblPuntoStockBajoLecheEntera = new javax.swing.JLabel();
        lblMensajeStockBajoLecheEntera = new javax.swing.JLabel();
        pnlNuevoPedidoPendiente = new javax.swing.JPanel();
        pnlBarraNuevoPedidoPendiente = new javax.swing.JPanel();
        lblPuntoNuevoPedidoPendiente = new javax.swing.JLabel();
        lblMensajeNuevoPedidoPendiente = new javax.swing.JLabel();
        pnlProductoVencidoArroz = new javax.swing.JPanel();
        pnlBarraProductoVencidoArroz = new javax.swing.JPanel();
        lblPuntoProductoVencidoArroz = new javax.swing.JLabel();
        lblMensajeProductoVencidoArroz = new javax.swing.JLabel();
        pnlErrorCriticoFalloLaS = new javax.swing.JPanel();
        pnlBarraErrorCriticoFalloLaS = new javax.swing.JPanel();
        lblPuntoErrorCriticoFalloLaS = new javax.swing.JLabel();
        lblMensajeErrorCriticoFalloLaS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Notificaciones");
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
        lblReportes.setText("   Reportes");

        lblNotificaciones.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblNotificaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblNotificaciones.setBackground(new java.awt.Color(37, 99, 235));
        lblNotificaciones.setOpaque(true);
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
        lblSeccion.setText("Notificaciones");

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
        lblTitulo.setText("Centro de Notificaciones");

        cmbTodasLasNotificaciones.setFont(new java.awt.Font("Segoe UI", 0, 13));
        cmbTodasLasNotificaciones.setBackground(new java.awt.Color(255, 255, 255));
        cmbTodasLasNotificaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las notificaciones", "Stock bajo", "Pedidos", "Vencimientos", "Errores" }));

        btnMarcarTodasComoLeidas.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnMarcarTodasComoLeidas.setForeground(new java.awt.Color(30, 41, 59));
        btnMarcarTodasComoLeidas.setBackground(new java.awt.Color(255, 255, 255));
        btnMarcarTodasComoLeidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        btnMarcarTodasComoLeidas.setText("Marcar todas como leídas");
        btnMarcarTodasComoLeidas.setFocusPainted(false);

        pnlStockBajoLecheEntera.setBackground(new java.awt.Color(255, 255, 255));
        pnlStockBajoLecheEntera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        pnlBarraStockBajoLecheEntera.setBackground(new java.awt.Color(245, 158, 11));

        lblPuntoStockBajoLecheEntera.setFont(new java.awt.Font("Segoe UI", 0, 22));
        lblPuntoStockBajoLecheEntera.setForeground(new java.awt.Color(245, 158, 11));
        lblPuntoStockBajoLecheEntera.setText("●");

        lblMensajeStockBajoLecheEntera.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblMensajeStockBajoLecheEntera.setForeground(new java.awt.Color(30, 41, 59));
        lblMensajeStockBajoLecheEntera.setText("Stock bajo: Leche Entera 1L en Tienda Norte");

        pnlNuevoPedidoPendiente.setBackground(new java.awt.Color(255, 255, 255));
        pnlNuevoPedidoPendiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        pnlBarraNuevoPedidoPendiente.setBackground(new java.awt.Color(37, 99, 235));

        lblPuntoNuevoPedidoPendiente.setFont(new java.awt.Font("Segoe UI", 0, 22));
        lblPuntoNuevoPedidoPendiente.setForeground(new java.awt.Color(37, 99, 235));
        lblPuntoNuevoPedidoPendiente.setText("●");

        lblMensajeNuevoPedidoPendiente.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblMensajeNuevoPedidoPendiente.setForeground(new java.awt.Color(30, 41, 59));
        lblMensajeNuevoPedidoPendiente.setText("Nuevo pedido pendiente de aprobación: P-0001");

        pnlProductoVencidoArroz.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductoVencidoArroz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        pnlBarraProductoVencidoArroz.setBackground(new java.awt.Color(220, 38, 38));

        lblPuntoProductoVencidoArroz.setFont(new java.awt.Font("Segoe UI", 0, 22));
        lblPuntoProductoVencidoArroz.setForeground(new java.awt.Color(220, 38, 38));
        lblPuntoProductoVencidoArroz.setText("●");

        lblMensajeProductoVencidoArroz.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblMensajeProductoVencidoArroz.setForeground(new java.awt.Color(30, 41, 59));
        lblMensajeProductoVencidoArroz.setText("Producto vencido: Arroz Diana 500g");

        pnlErrorCriticoFalloLaS.setBackground(new java.awt.Color(255, 255, 255));
        pnlErrorCriticoFalloLaS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        pnlBarraErrorCriticoFalloLaS.setBackground(new java.awt.Color(30, 41, 59));

        lblPuntoErrorCriticoFalloLaS.setFont(new java.awt.Font("Segoe UI", 0, 22));
        lblPuntoErrorCriticoFalloLaS.setForeground(new java.awt.Color(30, 41, 59));
        lblPuntoErrorCriticoFalloLaS.setText("●");

        lblMensajeErrorCriticoFalloLaS.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblMensajeErrorCriticoFalloLaS.setForeground(new java.awt.Color(30, 41, 59));
        lblMensajeErrorCriticoFalloLaS.setText("Error crítico: falló la sincronización del inventario");

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

        javax.swing.GroupLayout pnlBarraStockBajoLecheEnteraLayout = new javax.swing.GroupLayout(pnlBarraStockBajoLecheEntera);
        pnlBarraStockBajoLecheEntera.setLayout(pnlBarraStockBajoLecheEnteraLayout);
        pnlBarraStockBajoLecheEnteraLayout.setHorizontalGroup(
            pnlBarraStockBajoLecheEnteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pnlBarraStockBajoLecheEnteraLayout.setVerticalGroup(
            pnlBarraStockBajoLecheEnteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlStockBajoLecheEnteraLayout = new javax.swing.GroupLayout(pnlStockBajoLecheEntera);
        pnlStockBajoLecheEntera.setLayout(pnlStockBajoLecheEnteraLayout);
        pnlStockBajoLecheEnteraLayout.setHorizontalGroup(
            pnlStockBajoLecheEnteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
            .addGroup(pnlStockBajoLecheEnteraLayout.createSequentialGroup()
                .addComponent(pnlBarraStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlStockBajoLecheEnteraLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPuntoStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlStockBajoLecheEnteraLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblMensajeStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlStockBajoLecheEnteraLayout.setVerticalGroup(
            pnlStockBajoLecheEnteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(pnlStockBajoLecheEnteraLayout.createSequentialGroup()
                .addComponent(pnlBarraStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlStockBajoLecheEnteraLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblPuntoStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlStockBajoLecheEnteraLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblMensajeStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBarraNuevoPedidoPendienteLayout = new javax.swing.GroupLayout(pnlBarraNuevoPedidoPendiente);
        pnlBarraNuevoPedidoPendiente.setLayout(pnlBarraNuevoPedidoPendienteLayout);
        pnlBarraNuevoPedidoPendienteLayout.setHorizontalGroup(
            pnlBarraNuevoPedidoPendienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pnlBarraNuevoPedidoPendienteLayout.setVerticalGroup(
            pnlBarraNuevoPedidoPendienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlNuevoPedidoPendienteLayout = new javax.swing.GroupLayout(pnlNuevoPedidoPendiente);
        pnlNuevoPedidoPendiente.setLayout(pnlNuevoPedidoPendienteLayout);
        pnlNuevoPedidoPendienteLayout.setHorizontalGroup(
            pnlNuevoPedidoPendienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
            .addGroup(pnlNuevoPedidoPendienteLayout.createSequentialGroup()
                .addComponent(pnlBarraNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlNuevoPedidoPendienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPuntoNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlNuevoPedidoPendienteLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblMensajeNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlNuevoPedidoPendienteLayout.setVerticalGroup(
            pnlNuevoPedidoPendienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(pnlNuevoPedidoPendienteLayout.createSequentialGroup()
                .addComponent(pnlBarraNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlNuevoPedidoPendienteLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblPuntoNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlNuevoPedidoPendienteLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblMensajeNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBarraProductoVencidoArrozLayout = new javax.swing.GroupLayout(pnlBarraProductoVencidoArroz);
        pnlBarraProductoVencidoArroz.setLayout(pnlBarraProductoVencidoArrozLayout);
        pnlBarraProductoVencidoArrozLayout.setHorizontalGroup(
            pnlBarraProductoVencidoArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pnlBarraProductoVencidoArrozLayout.setVerticalGroup(
            pnlBarraProductoVencidoArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlProductoVencidoArrozLayout = new javax.swing.GroupLayout(pnlProductoVencidoArroz);
        pnlProductoVencidoArroz.setLayout(pnlProductoVencidoArrozLayout);
        pnlProductoVencidoArrozLayout.setHorizontalGroup(
            pnlProductoVencidoArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
            .addGroup(pnlProductoVencidoArrozLayout.createSequentialGroup()
                .addComponent(pnlBarraProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlProductoVencidoArrozLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPuntoProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlProductoVencidoArrozLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblMensajeProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlProductoVencidoArrozLayout.setVerticalGroup(
            pnlProductoVencidoArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(pnlProductoVencidoArrozLayout.createSequentialGroup()
                .addComponent(pnlBarraProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlProductoVencidoArrozLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblPuntoProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlProductoVencidoArrozLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblMensajeProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBarraErrorCriticoFalloLaSLayout = new javax.swing.GroupLayout(pnlBarraErrorCriticoFalloLaS);
        pnlBarraErrorCriticoFalloLaS.setLayout(pnlBarraErrorCriticoFalloLaSLayout);
        pnlBarraErrorCriticoFalloLaSLayout.setHorizontalGroup(
            pnlBarraErrorCriticoFalloLaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pnlBarraErrorCriticoFalloLaSLayout.setVerticalGroup(
            pnlBarraErrorCriticoFalloLaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlErrorCriticoFalloLaSLayout = new javax.swing.GroupLayout(pnlErrorCriticoFalloLaS);
        pnlErrorCriticoFalloLaS.setLayout(pnlErrorCriticoFalloLaSLayout);
        pnlErrorCriticoFalloLaSLayout.setHorizontalGroup(
            pnlErrorCriticoFalloLaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
            .addGroup(pnlErrorCriticoFalloLaSLayout.createSequentialGroup()
                .addComponent(pnlBarraErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlErrorCriticoFalloLaSLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPuntoErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlErrorCriticoFalloLaSLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblMensajeErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlErrorCriticoFalloLaSLayout.setVerticalGroup(
            pnlErrorCriticoFalloLaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(pnlErrorCriticoFalloLaSLayout.createSequentialGroup()
                .addComponent(pnlBarraErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlErrorCriticoFalloLaSLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblPuntoErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlErrorCriticoFalloLaSLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblMensajeErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(cmbTodasLasNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(btnMarcarTodasComoLeidas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(pnlStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(pnlNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(pnlProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(pnlErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(134, 134, 134)
                .addComponent(cmbTodasLasNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnMarcarTodasComoLeidas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(pnlStockBajoLecheEntera, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(pnlNuevoPedidoPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(pnlProductoVencidoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(pnlErrorCriticoFalloLaS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    public static void main(String[] args) {
        new FrmNotificaciones().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbTodasLasNotificaciones;
    private javax.swing.JButton btnMarcarTodasComoLeidas;
    private javax.swing.JPanel pnlStockBajoLecheEntera;
    private javax.swing.JPanel pnlBarraStockBajoLecheEntera;
    private javax.swing.JLabel lblPuntoStockBajoLecheEntera;
    private javax.swing.JLabel lblMensajeStockBajoLecheEntera;
    private javax.swing.JPanel pnlNuevoPedidoPendiente;
    private javax.swing.JPanel pnlBarraNuevoPedidoPendiente;
    private javax.swing.JLabel lblPuntoNuevoPedidoPendiente;
    private javax.swing.JLabel lblMensajeNuevoPedidoPendiente;
    private javax.swing.JPanel pnlProductoVencidoArroz;
    private javax.swing.JPanel pnlBarraProductoVencidoArroz;
    private javax.swing.JLabel lblPuntoProductoVencidoArroz;
    private javax.swing.JLabel lblMensajeProductoVencidoArroz;
    private javax.swing.JPanel pnlErrorCriticoFalloLaS;
    private javax.swing.JPanel pnlBarraErrorCriticoFalloLaS;
    private javax.swing.JLabel lblPuntoErrorCriticoFalloLaS;
    private javax.swing.JLabel lblMensajeErrorCriticoFalloLaS;
    // End of variables declaration//GEN-END:variables
}
