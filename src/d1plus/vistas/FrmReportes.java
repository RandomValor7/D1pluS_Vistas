package d1plus.vistas;

/**
 * Vista: Panel principal de reportes (RF24 a RF30)
 */
public class FrmReportes extends javax.swing.JFrame {

    public FrmReportes() {
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
        pnlReporteDeVentas = new javax.swing.JPanel();
        lblReporteDeVentasTitulo = new javax.swing.JLabel();
        lblReporteDeVentasDesc = new javax.swing.JLabel();
        pnlProductosAgotadosPorAgot = new javax.swing.JPanel();
        lblProductosAgotadosPorAgotTitulo = new javax.swing.JLabel();
        lblProductosAgotadosPorAgotDesc = new javax.swing.JLabel();
        pnlPedidosProcesadosYPendie = new javax.swing.JPanel();
        lblPedidosProcesadosYPendieTitulo = new javax.swing.JLabel();
        lblPedidosProcesadosYPendieDesc = new javax.swing.JLabel();
        pnlRotacionDeProductos = new javax.swing.JPanel();
        lblRotacionDeProductosTitulo = new javax.swing.JLabel();
        lblRotacionDeProductosDesc = new javax.swing.JLabel();
        pnlInventarioEnTiempoReal = new javax.swing.JPanel();
        lblInventarioEnTiempoRealTitulo = new javax.swing.JLabel();
        lblInventarioEnTiempoRealDesc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D1pluS - Reportes");
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
        lblSeccion.setText("Reportes");

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
        lblTitulo.setText("Reportes y Analíticas");

        pnlReporteDeVentas.setBackground(new java.awt.Color(255, 255, 255));
        pnlReporteDeVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblReporteDeVentasTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15));
        lblReporteDeVentasTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblReporteDeVentasTitulo.setText("Reporte de Ventas");

        lblReporteDeVentasDesc.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblReporteDeVentasDesc.setForeground(new java.awt.Color(100, 116, 139));
        lblReporteDeVentasDesc.setText("<html>Consulta el total de ventas por período.</html>");

        pnlProductosAgotadosPorAgot.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductosAgotadosPorAgot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblProductosAgotadosPorAgotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15));
        lblProductosAgotadosPorAgotTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblProductosAgotadosPorAgotTitulo.setText("Productos Agotados / Por Agotarse");

        lblProductosAgotadosPorAgotDesc.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblProductosAgotadosPorAgotDesc.setForeground(new java.awt.Color(100, 116, 139));
        lblProductosAgotadosPorAgotDesc.setText("<html>Identifica productos sin stock o próximos a agotarse.</html>");

        pnlPedidosProcesadosYPendie.setBackground(new java.awt.Color(255, 255, 255));
        pnlPedidosProcesadosYPendie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblPedidosProcesadosYPendieTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15));
        lblPedidosProcesadosYPendieTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblPedidosProcesadosYPendieTitulo.setText("Pedidos Procesados y Pendientes");

        lblPedidosProcesadosYPendieDesc.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblPedidosProcesadosYPendieDesc.setForeground(new java.awt.Color(100, 116, 139));
        lblPedidosProcesadosYPendieDesc.setText("<html>Consulta el estado de todos los pedidos.</html>");

        pnlRotacionDeProductos.setBackground(new java.awt.Color(255, 255, 255));
        pnlRotacionDeProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblRotacionDeProductosTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15));
        lblRotacionDeProductosTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblRotacionDeProductosTitulo.setText("Rotación de Productos");

        lblRotacionDeProductosDesc.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblRotacionDeProductosDesc.setForeground(new java.awt.Color(100, 116, 139));
        lblRotacionDeProductosDesc.setText("<html>Analiza qué productos se mueven más o menos.</html>");

        pnlInventarioEnTiempoReal.setBackground(new java.awt.Color(255, 255, 255));
        pnlInventarioEnTiempoReal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));

        lblInventarioEnTiempoRealTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15));
        lblInventarioEnTiempoRealTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblInventarioEnTiempoRealTitulo.setText("Inventario en Tiempo Real");

        lblInventarioEnTiempoRealDesc.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblInventarioEnTiempoRealDesc.setForeground(new java.awt.Color(100, 116, 139));
        lblInventarioEnTiempoRealDesc.setText("<html>Consulta las existencias actuales por ubicación.</html>");

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

        javax.swing.GroupLayout pnlReporteDeVentasLayout = new javax.swing.GroupLayout(pnlReporteDeVentas);
        pnlReporteDeVentas.setLayout(pnlReporteDeVentasLayout);
        pnlReporteDeVentasLayout.setHorizontalGroup(
            pnlReporteDeVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(pnlReporteDeVentasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblReporteDeVentasTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlReporteDeVentasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblReporteDeVentasDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlReporteDeVentasLayout.setVerticalGroup(
            pnlReporteDeVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
            .addGroup(pnlReporteDeVentasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblReporteDeVentasTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlReporteDeVentasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblReporteDeVentasDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlProductosAgotadosPorAgotLayout = new javax.swing.GroupLayout(pnlProductosAgotadosPorAgot);
        pnlProductosAgotadosPorAgot.setLayout(pnlProductosAgotadosPorAgotLayout);
        pnlProductosAgotadosPorAgotLayout.setHorizontalGroup(
            pnlProductosAgotadosPorAgotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(pnlProductosAgotadosPorAgotLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblProductosAgotadosPorAgotTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlProductosAgotadosPorAgotLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblProductosAgotadosPorAgotDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlProductosAgotadosPorAgotLayout.setVerticalGroup(
            pnlProductosAgotadosPorAgotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
            .addGroup(pnlProductosAgotadosPorAgotLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblProductosAgotadosPorAgotTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlProductosAgotadosPorAgotLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblProductosAgotadosPorAgotDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlPedidosProcesadosYPendieLayout = new javax.swing.GroupLayout(pnlPedidosProcesadosYPendie);
        pnlPedidosProcesadosYPendie.setLayout(pnlPedidosProcesadosYPendieLayout);
        pnlPedidosProcesadosYPendieLayout.setHorizontalGroup(
            pnlPedidosProcesadosYPendieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(pnlPedidosProcesadosYPendieLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblPedidosProcesadosYPendieTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPedidosProcesadosYPendieLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblPedidosProcesadosYPendieDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPedidosProcesadosYPendieLayout.setVerticalGroup(
            pnlPedidosProcesadosYPendieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
            .addGroup(pnlPedidosProcesadosYPendieLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPedidosProcesadosYPendieTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPedidosProcesadosYPendieLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblPedidosProcesadosYPendieDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlRotacionDeProductosLayout = new javax.swing.GroupLayout(pnlRotacionDeProductos);
        pnlRotacionDeProductos.setLayout(pnlRotacionDeProductosLayout);
        pnlRotacionDeProductosLayout.setHorizontalGroup(
            pnlRotacionDeProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(pnlRotacionDeProductosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRotacionDeProductosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlRotacionDeProductosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRotacionDeProductosDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlRotacionDeProductosLayout.setVerticalGroup(
            pnlRotacionDeProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
            .addGroup(pnlRotacionDeProductosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblRotacionDeProductosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlRotacionDeProductosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblRotacionDeProductosDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlInventarioEnTiempoRealLayout = new javax.swing.GroupLayout(pnlInventarioEnTiempoReal);
        pnlInventarioEnTiempoReal.setLayout(pnlInventarioEnTiempoRealLayout);
        pnlInventarioEnTiempoRealLayout.setHorizontalGroup(
            pnlInventarioEnTiempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(pnlInventarioEnTiempoRealLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblInventarioEnTiempoRealTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlInventarioEnTiempoRealLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblInventarioEnTiempoRealDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlInventarioEnTiempoRealLayout.setVerticalGroup(
            pnlInventarioEnTiempoRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
            .addGroup(pnlInventarioEnTiempoRealLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblInventarioEnTiempoRealTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlInventarioEnTiempoRealLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblInventarioEnTiempoRealDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(pnlReporteDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(736, 736, 736)
                .addComponent(pnlProductosAgotadosPorAgot, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(pnlPedidosProcesadosYPendie, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(736, 736, 736)
                .addComponent(pnlRotacionDeProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(pnlInventarioEnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(pnlReporteDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(pnlProductosAgotadosPorAgot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(pnlPedidosProcesadosYPendie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(pnlRotacionDeProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(pnlInventarioEnTiempoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarDiseno() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    public static void main(String[] args) {
        new FrmReportes().setVisible(true);
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
    private javax.swing.JPanel pnlReporteDeVentas;
    private javax.swing.JLabel lblReporteDeVentasTitulo;
    private javax.swing.JLabel lblReporteDeVentasDesc;
    private javax.swing.JPanel pnlProductosAgotadosPorAgot;
    private javax.swing.JLabel lblProductosAgotadosPorAgotTitulo;
    private javax.swing.JLabel lblProductosAgotadosPorAgotDesc;
    private javax.swing.JPanel pnlPedidosProcesadosYPendie;
    private javax.swing.JLabel lblPedidosProcesadosYPendieTitulo;
    private javax.swing.JLabel lblPedidosProcesadosYPendieDesc;
    private javax.swing.JPanel pnlRotacionDeProductos;
    private javax.swing.JLabel lblRotacionDeProductosTitulo;
    private javax.swing.JLabel lblRotacionDeProductosDesc;
    private javax.swing.JPanel pnlInventarioEnTiempoReal;
    private javax.swing.JLabel lblInventarioEnTiempoRealTitulo;
    private javax.swing.JLabel lblInventarioEnTiempoRealDesc;
    // End of variables declaration//GEN-END:variables
}
