package Menus;

import Datos.Categoria;
import Datos.Cliente;
import Datos.Producto;
import Datos.Proveedor;
import Datos.SubCategoria;
import Otros.Ficheros;

public class Principal extends javax.swing.JFrame {

    public static String tienda = "";

    public static void ejecutar(String t){//Mostrar ventana en pantalla
        tienda = t;

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public Principal() {
        initComponents();
    }

    private void initComponents() {

        Tienda = new javax.swing.JLabel();
        PanelesTienda = new javax.swing.JTabbedPane();
        PanelProducto = new javax.swing.JPanel();
        TablaProducto = new javax.swing.JTabbedPane();
        PanelTablaProducto = new javax.swing.JPanel();
        ScrollTablaProducto = new javax.swing.JScrollPane();
        TabalaProducto = new javax.swing.JTable();
        PanelInsertarProductoPrincipal = new javax.swing.JPanel();
        PanelizqinsertarProducto = new javax.swing.JPanel();
        DatoPrecioProductoInsertar = new javax.swing.JTextField();
        DatoTiendaProductoInsertar = new javax.swing.JComboBox<>();
        DatoNombreProductoInsertar = new javax.swing.JTextField();
        DatoCategoriaProductoInsertar = new javax.swing.JComboBox<>();
        NombreProductoInsertar = new javax.swing.JLabel();
        DatoSubcategoriaProductoInsertar = new javax.swing.JComboBox<>();
        PrecioProductoInsertar = new javax.swing.JLabel();
        CategoriaProductoInsertar = new javax.swing.JLabel();
        SubcategoriaProductoinsertar = new javax.swing.JLabel();
        ProveedorProductoinsertar = new javax.swing.JLabel();
        TiendaProductoinsertar = new javax.swing.JLabel();
        DatoProveedorProductoInsertar = new javax.swing.JComboBox<>();
        ImagenProductoinsertar = new javax.swing.JLabel();
        scrollIMG10 = new javax.swing.JScrollPane();
        DatoImagenProductoInsertar = new javax.swing.JTextArea();
        PanelderInsertarProducto = new javax.swing.JPanel();
        DescripcionProductoInsertar = new javax.swing.JLabel();
        scrollIMG1 = new javax.swing.JScrollPane();
        DatoDescripcionProductoInsertar = new javax.swing.JTextArea();
        scrollIMG8 = new javax.swing.JScrollPane();
        DatoCaracteristicasProductoInsertar = new javax.swing.JTextArea();
        CaracteristicasProductoInsertar = new javax.swing.JLabel();
        scrollIMG9 = new javax.swing.JScrollPane();
        DatoAccesoriosProductoInsertar = new javax.swing.JTextArea();
        AccesoriosProductoInsertar = new javax.swing.JLabel();
        BotonProductoInsertar = new javax.swing.JButton();
        PanelEditarProductoPrincipal = new javax.swing.JPanel();
        DatoIDProductoEditarProducto = new javax.swing.JComboBox<>();
        IDProductoEditarProducto = new javax.swing.JLabel();
        PanelizqEditarProducto = new javax.swing.JPanel();
        DatoPrecioEditarProducto = new javax.swing.JTextField();
        DatoTiendaEditarProducto = new javax.swing.JComboBox<>();
        DatoNombreEditarProducto = new javax.swing.JTextField();
        DatoCategoriaEditarProducto = new javax.swing.JComboBox<>();
        NombreEditarProducto = new javax.swing.JLabel();
        DatoSubCategoriaEditarProducto = new javax.swing.JComboBox<>();
        PrecioEditarProducto = new javax.swing.JLabel();
        CategoriaEditarProducto = new javax.swing.JLabel();
        SubCategoriaEditarProducto = new javax.swing.JLabel();
        ProveedorEditarProducto = new javax.swing.JLabel();
        TiendaEditarProducto = new javax.swing.JLabel();
        DatoProveedorEditarProducto = new javax.swing.JComboBox<>();
        ImagenEditarProducto = new javax.swing.JLabel();
        scrollIMG14 = new javax.swing.JScrollPane();
        DatoImagenEditarProducto = new javax.swing.JTextArea();
        PanelDerEditarProducto = new javax.swing.JPanel();
        scrollIMG11 = new javax.swing.JScrollPane();
        DatoDescripcionEditarProducto = new javax.swing.JTextArea();
        DescripcionEditarProducto = new javax.swing.JLabel();
        CaracteristicasEditarProducto = new javax.swing.JLabel();
        scrollIMG12 = new javax.swing.JScrollPane();
        DatoCaracteriticasEditarProducto = new javax.swing.JTextArea();
        AccesoriosEditarProducto = new javax.swing.JLabel();
        scrollIMG13 = new javax.swing.JScrollPane();
        DatoAccesoriosEditarProducto = new javax.swing.JTextArea();
        BotonEditarProducto = new javax.swing.JButton();
        PanelBorrarProductoPrincipal = new javax.swing.JPanel();
        DatoIDProductoBorrarProducto = new javax.swing.JComboBox<>();
        IDProductoBorrarProducto = new javax.swing.JLabel();
        PanelizqBorrarProducto = new javax.swing.JPanel();
        NombreBorrarProducto = new javax.swing.JLabel();
        PrecioBorrarProducto = new javax.swing.JLabel();
        DatoPrecioBorrarProducto = new javax.swing.JLabel();
        DatoNombreBorrarProducto = new javax.swing.JLabel();
        scrollIMG15 = new javax.swing.JScrollPane();
        DatoDescripcionBorrarProducto = new javax.swing.JTextArea();
        DescripcionBorrarProducto = new javax.swing.JLabel();
        CaracteristicasBorrarProducto = new javax.swing.JLabel();
        scrollIMG16 = new javax.swing.JScrollPane();
        DatoCaracteristicasBorrarProducto = new javax.swing.JTextArea();
        PanelderBorrarProducto = new javax.swing.JPanel();
        DatoCategoriaBorrarProducto = new javax.swing.JLabel();
        SubCategoriaBorrarProducto = new javax.swing.JLabel();
        CategoriaBorrarProducto = new javax.swing.JLabel();
        DatoSubCategoriaBorrarProducto = new javax.swing.JLabel();
        ImagenBorrarProducto = new javax.swing.JLabel();
        ProveedorBorrarProducto = new javax.swing.JLabel();
        DatoProveedorBorrarProducto = new javax.swing.JLabel();
        TiendaBorrarProducto = new javax.swing.JLabel();
        DatoTiendaBorrarProducto = new javax.swing.JLabel();
        scrollIMG17 = new javax.swing.JScrollPane();
        DatoImagenBorrarProducto = new javax.swing.JTextArea();
        BotonBorrarProducto = new javax.swing.JButton();
        PanelExportarProductoPrincipal = new javax.swing.JPanel();
        ExplorardorExportarProducto = new javax.swing.JFileChooser();
        PanelImportarProductoPrincipal = new javax.swing.JPanel();
        ExplorardorImportarProducto = new javax.swing.JFileChooser();
        PanelCliente = new javax.swing.JPanel();
        TablaCliente = new javax.swing.JTabbedPane();
        PanelTablaCliente = new javax.swing.JPanel();
        ScrollTablaCliente = new javax.swing.JScrollPane();
        TablaDatoCliente = new javax.swing.JTable();
        PanelInsertarClientePrincipal = new javax.swing.JPanel();
        PanelizqinsertarCliente = new javax.swing.JPanel();
        DatoDNIClienteInsertar = new javax.swing.JTextField();
        DatoTiendaClienteInsertar = new javax.swing.JComboBox<>();
        DatoNombreClienteInsertar = new javax.swing.JTextField();
        NombreClienteInsertar = new javax.swing.JLabel();
        DNIClienteInsertar = new javax.swing.JLabel();
        TiendaClienteInsertar = new javax.swing.JLabel();
        TelefonoClienteInsertar = new javax.swing.JLabel();
        DatoTelefonoClienteInsertar = new javax.swing.JTextField();
        PanelderInsertarCliente = new javax.swing.JPanel();
        DireccionClienteInsertar = new javax.swing.JLabel();
        scrollIMG2 = new javax.swing.JScrollPane();
        DatoDireccionClienteInsertar = new javax.swing.JTextArea();
        BotonInsertarCliente = new javax.swing.JButton();
        PanelEditarClientePrincipal = new javax.swing.JPanel();
        DatoIDClienteEditarCliente = new javax.swing.JComboBox<>();
        IDClienteEditarCliente = new javax.swing.JLabel();
        PanelizqEditarCliente = new javax.swing.JPanel();
        DatoDNIEditarCliente = new javax.swing.JTextField();
        DatoNombreEditarCliente = new javax.swing.JTextField();
        NombreEditarCliente = new javax.swing.JLabel();
        DNIEditarCliente = new javax.swing.JLabel();
        TelefonoEditarCliente = new javax.swing.JLabel();
        DatoTelefonoEditarCliente = new javax.swing.JTextField();
        PanelDerEditarCliente = new javax.swing.JPanel();
        scrollIMG55 = new javax.swing.JScrollPane();
        DatoDireccionEditarCliente = new javax.swing.JTextArea();
        DireccionEditarCliente = new javax.swing.JLabel();
        botonEditarCliente = new javax.swing.JButton();
        PanelBorrarClientePrincipal = new javax.swing.JPanel();
        DatoIDClienteBorrarCliente = new javax.swing.JComboBox<>();
        IDClienteBorrarCliente = new javax.swing.JLabel();
        PanelizqBorrarCliente = new javax.swing.JPanel();
        NombreBorrarCliente = new javax.swing.JLabel();
        DNIBorrarCliente = new javax.swing.JLabel();
        DatoDNIBorrarCliente = new javax.swing.JLabel();
        DatoNombreBorrarCliente = new javax.swing.JLabel();
        TelefonoBorrarCliente = new javax.swing.JLabel();
        DatoTelefonoBorrarCliente = new javax.swing.JLabel();
        PanelderBorrarCliente = new javax.swing.JPanel();
        BotonBorrarCliente = new javax.swing.JButton();
        scrollIMG58 = new javax.swing.JScrollPane();
        DatoDireccionBorrarCliente = new javax.swing.JTextArea();
        DireccionBorrarCliente = new javax.swing.JLabel();
        PanelExportarClientePrincipal = new javax.swing.JPanel();
        ExplorardorExportarCliente = new javax.swing.JFileChooser();
        PanelImportarClientePrincipal = new javax.swing.JPanel();
        ExplorardorImportarCliente = new javax.swing.JFileChooser();
        PanelProveedor = new javax.swing.JPanel();
        TablaProveedor = new javax.swing.JTabbedPane();
        PanelTablaProveedor = new javax.swing.JPanel();
        ScrollTablaProveedor = new javax.swing.JScrollPane();
        TabalaProveeodor = new javax.swing.JTable();
        PanelInsertarProveedorPrincipal = new javax.swing.JPanel();
        PanelizqinsertarProveedor = new javax.swing.JPanel();
        DatoNIFProveedorInsertar = new javax.swing.JTextField();
        DatoNombreProveedorInsertar = new javax.swing.JTextField();
        NombreProveedorInsertar = new javax.swing.JLabel();
        NIFProveedorInsertar = new javax.swing.JLabel();
        TelefonoProveedorInsertar = new javax.swing.JLabel();
        RepresentanteProveedorInsertar = new javax.swing.JLabel();
        NombreEncargadoProveedorInsertar = new javax.swing.JLabel();
        TelefonoEncargadoProveedorInsertar = new javax.swing.JLabel();
        DatoTelefonoEncargadoProveedorInsertar = new javax.swing.JTextField();
        EncargadoProveedorInsertar = new javax.swing.JLabel();
        DatoTelefonoProveedorInsertar = new javax.swing.JTextField();
        DatoRepresentanteProveedorInsertar = new javax.swing.JTextField();
        DatoNombreEncargadoProveedorInsertar = new javax.swing.JComboBox<>();
        PanelderInsertarProveedor = new javax.swing.JPanel();
        DireccionProveedorInsertar = new javax.swing.JLabel();
        scrollIMG3 = new javax.swing.JScrollPane();
        DatoDireccionProveedorInsertar = new javax.swing.JTextArea();
        BotonProveedorInsertar = new javax.swing.JButton();
        PanelEditarProveedorPrincipal = new javax.swing.JPanel();
        DatoIDProveedorEditarProveedor = new javax.swing.JComboBox<>();
        IDProveedorEditarProveedor = new javax.swing.JLabel();
        PanelizqEditarProveedor = new javax.swing.JPanel();
        DatoNIFEditarProveedor = new javax.swing.JTextField();
        DatoNombreEncargadoEditarProveedor = new javax.swing.JComboBox<>();
        DatoNombreEditarProveedor = new javax.swing.JTextField();
        NombreEditarProveedor = new javax.swing.JLabel();
        NIFEditarProveedor = new javax.swing.JLabel();
        TelefonoEditarProveedor = new javax.swing.JLabel();
        RepresentanteEditarProveedor = new javax.swing.JLabel();
        NombreEncargadoEditarProveedor = new javax.swing.JLabel();
        EncargadoProveedorEditar = new javax.swing.JLabel();
        DatoTelefonoEncargadoEditarProveedor = new javax.swing.JTextField();
        TelefonoEncargadoEditarProveedor = new javax.swing.JLabel();
        DatoTelefonoEditarProveedor = new javax.swing.JTextField();
        DatoRepresentanteEditarProveedor = new javax.swing.JTextField();
        PanelDerEditarProveedor = new javax.swing.JPanel();
        scrollIMG65 = new javax.swing.JScrollPane();
        DatoDireccionEditarProveedor = new javax.swing.JTextArea();
        DireccionEditarProveedor = new javax.swing.JLabel();
        BotonEditarProveedor = new javax.swing.JButton();
        PanelBorrarProveedorPrincipal = new javax.swing.JPanel();
        DatoIDProveedorBorrarProveedor = new javax.swing.JComboBox<>();
        IDProveedorBorrarProveedor = new javax.swing.JLabel();
        PanelizqBorrarProveedor = new javax.swing.JPanel();
        NombreBorrarProveedor = new javax.swing.JLabel();
        NIFBorrarProveedor = new javax.swing.JLabel();
        DatoNIFBorrarProveedor = new javax.swing.JLabel();
        DatoNombreBorrarProveedor = new javax.swing.JLabel();
        DatoRepresentanteBorrarProveedor = new javax.swing.JLabel();
        RepresentanteBorrarProveedor = new javax.swing.JLabel();
        TelefonoBorrarProveedor = new javax.swing.JLabel();
        DatoTelefonoBorrarProveedor = new javax.swing.JLabel();
        EncargadoProveedorBorrar = new javax.swing.JLabel();
        NombreEncargadoBorrarProveedor = new javax.swing.JLabel();
        TelefonoEncargadoBorrarProveedor = new javax.swing.JLabel();
        DatoNombreEncargadoBorrarProducto4 = new javax.swing.JLabel();
        DatoTelefonoEncargadoBorrarProducto5 = new javax.swing.JLabel();
        PanelderBorrarProveedor = new javax.swing.JPanel();
        BotonBorrarProveedor = new javax.swing.JButton();
        scrollIMG68 = new javax.swing.JScrollPane();
        DatoDireccionBorrarProveedor = new javax.swing.JTextArea();
        DireccionBorrarProveedor = new javax.swing.JLabel();
        PanelExportarProveedorPrincipal = new javax.swing.JPanel();
        ExplorardorExportarProveedor = new javax.swing.JFileChooser();
        PanelImportarProveedorPrincipal = new javax.swing.JPanel();
        ExplorardorImportarProveedor = new javax.swing.JFileChooser();
        PanelPedido = new javax.swing.JPanel();
        TablaPedido = new javax.swing.JTabbedPane();
        PanelTablaPedido = new javax.swing.JPanel();
        ScrollTablaPedido = new javax.swing.JScrollPane();
        TabalaPedido = new javax.swing.JTable();
        PanelInsertarPedidoPrincipal = new javax.swing.JPanel();
        PanelizqinsertarPedido = new javax.swing.JPanel();
        DatoPrecioPedidoInsertar = new javax.swing.JTextField();
        DatoTiendaPedidoInsertar = new javax.swing.JComboBox<>();
        DatoNombrePedidoInsertar = new javax.swing.JTextField();
        DatoCategoriaPedidoInsertar = new javax.swing.JComboBox<>();
        NombrePedidoInsertar = new javax.swing.JLabel();
        DatoSubcategoriaPedidoInsertar = new javax.swing.JComboBox<>();
        PrecioPedidoInsertar = new javax.swing.JLabel();
        CategoriaPedidoInsertar = new javax.swing.JLabel();
        SubcategoriaPedidoInsertar = new javax.swing.JLabel();
        ProveedorPedidoInsertar = new javax.swing.JLabel();
        TiendaPedidoInsertar = new javax.swing.JLabel();
        DatoProveedorPedidoInsertar = new javax.swing.JComboBox<>();
        ImagenPedidoInsertar = new javax.swing.JLabel();
        scrollIMG71 = new javax.swing.JScrollPane();
        DatoImagenPedidoInsertar = new javax.swing.JTextArea();
        PanelderInsertarPedido = new javax.swing.JPanel();
        DescripcionProductoInsertar3 = new javax.swing.JLabel();
        scrollIMG4 = new javax.swing.JScrollPane();
        DatoDescripcionProductoInsertar3 = new javax.swing.JTextArea();
        scrollIMG72 = new javax.swing.JScrollPane();
        DatoCaracteristicasProductoInsertar3 = new javax.swing.JTextArea();
        CaracteristicasProductoInsertar3 = new javax.swing.JLabel();
        scrollIMG73 = new javax.swing.JScrollPane();
        DatoAccesoriosProductoInsertar3 = new javax.swing.JTextArea();
        AccesoriosProductoInsertar3 = new javax.swing.JLabel();
        BotonPedidoInsertar = new javax.swing.JButton();
        PanelEditarPedidoPrincipal = new javax.swing.JPanel();
        DatoIDProductoEditarProducto3 = new javax.swing.JComboBox<>();
        IDProductoEditarProducto3 = new javax.swing.JLabel();
        PanelizqEditarProducto3 = new javax.swing.JPanel();
        DatoPrecioEditarProducto3 = new javax.swing.JTextField();
        DatoTiendaEditarProducto3 = new javax.swing.JComboBox<>();
        DatoNombreEditarProducto3 = new javax.swing.JTextField();
        DatoCategoriaEditarProducto3 = new javax.swing.JComboBox<>();
        NombreEditarProducto3 = new javax.swing.JLabel();
        DatoSubCategoriaEditarProducto3 = new javax.swing.JComboBox<>();
        PrecioEditarProducto3 = new javax.swing.JLabel();
        CategoriaEditarProducto3 = new javax.swing.JLabel();
        SubCategoriaEditarProducto3 = new javax.swing.JLabel();
        ProveedorEditarProducto3 = new javax.swing.JLabel();
        TiendaEditarProducto3 = new javax.swing.JLabel();
        DatoProveedorEditarProducto3 = new javax.swing.JComboBox<>();
        ImagenEditarProducto3 = new javax.swing.JLabel();
        scrollIMG74 = new javax.swing.JScrollPane();
        DatoImagenEditarProducto3 = new javax.swing.JTextArea();
        PanelDerEditarProducto3 = new javax.swing.JPanel();
        scrollIMG75 = new javax.swing.JScrollPane();
        DatoDescripcionEditarProducto3 = new javax.swing.JTextArea();
        DescripcionEditarProducto3 = new javax.swing.JLabel();
        CaracteristicasEditarProducto3 = new javax.swing.JLabel();
        scrollIMG76 = new javax.swing.JScrollPane();
        DatoCaracteriticasEditarProducto3 = new javax.swing.JTextArea();
        AccesoriosEditarProducto3 = new javax.swing.JLabel();
        scrollIMG77 = new javax.swing.JScrollPane();
        DatoAccesoriosEditarProducto3 = new javax.swing.JTextArea();
        BotonEditarProducto3 = new javax.swing.JButton();
        PanelBorrarPedidoPrincipal = new javax.swing.JPanel();
        DatoIDProductoBorrarProducto3 = new javax.swing.JComboBox<>();
        IDProductoBorrarProducto3 = new javax.swing.JLabel();
        PanelizqBorrarProducto3 = new javax.swing.JPanel();
        NombreBorrarProducto3 = new javax.swing.JLabel();
        PrecioBorrarProducto3 = new javax.swing.JLabel();
        DatoPrecioBorrarProducto3 = new javax.swing.JLabel();
        DatoNombreBorrarProducto3 = new javax.swing.JLabel();
        scrollIMG78 = new javax.swing.JScrollPane();
        DatoDescripcionBorrarProducto3 = new javax.swing.JTextArea();
        DescripcionBorrarProducto3 = new javax.swing.JLabel();
        CaracteristicasBorrarProducto3 = new javax.swing.JLabel();
        scrollIMG79 = new javax.swing.JScrollPane();
        DatoCaracteristicasBorrarProducto3 = new javax.swing.JTextArea();
        PanelderBorrarProducto3 = new javax.swing.JPanel();
        DatoCategoriaBorrarProducto3 = new javax.swing.JLabel();
        SubCategoriaBorrarProducto3 = new javax.swing.JLabel();
        CategoriaBorrarProducto3 = new javax.swing.JLabel();
        DatoSubCategoriaBorrarProducto3 = new javax.swing.JLabel();
        ImagenBorrarProducto3 = new javax.swing.JLabel();
        ProveedorBorrarProducto3 = new javax.swing.JLabel();
        DatoProveedorBorrarProducto3 = new javax.swing.JLabel();
        TiendaBorrarProducto3 = new javax.swing.JLabel();
        DatoTiendaBorrarProducto3 = new javax.swing.JLabel();
        scrollIMG80 = new javax.swing.JScrollPane();
        DatoImagenBorrarProducto3 = new javax.swing.JTextArea();
        BotonBorrarProducto3 = new javax.swing.JButton();
        PanelExportarPedidoPrincipal = new javax.swing.JPanel();
        ExplorardorExportarPedido = new javax.swing.JFileChooser();
        PanelImportarPedidoPrincipal = new javax.swing.JPanel();
        ExplorardorImportarPedido = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tienda.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        Tienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tienda.setText("TIENDA : "+tienda+"");

        TabalaProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TabalaProducto.setModel(new javax.swing.table.DefaultTableModel(Producto.getAll(tienda),new String [] {"ID", "NOMBRE", "PRECIO", "CATEGORIA", "SUBCATEGORIA", "PROVEEDOR", "DESCRIPCION"}));
        ScrollTablaProducto.setViewportView(TabalaProducto);

        javax.swing.GroupLayout PanelTablaProductoLayout = new javax.swing.GroupLayout(PanelTablaProducto);
        PanelTablaProducto.setLayout(PanelTablaProductoLayout);
        PanelTablaProductoLayout.setHorizontalGroup(
            PanelTablaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        PanelTablaProductoLayout.setVerticalGroup(
            PanelTablaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        TablaProducto.addTab("VER ", PanelTablaProducto);

        DatoPrecioProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoTiendaProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTiendaProductoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(Datos.Tienda.getId(tienda)));

        DatoNombreProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoCategoriaProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoCategoriaProductoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(Categoria.getId()));
        DatoCategoriaProductoInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoCategoriaProductoInsertarActionPerformed(evt);
            }
        });

        NombreProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        NombreProductoInsertar.setText("Nombre");

        DatoSubcategoriaProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoSubcategoriaProductoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(SubCategoria.getId((String) DatoCategoriaProductoInsertar.getSelectedItem())));

        PrecioProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        PrecioProductoInsertar.setText("Precio");

        CategoriaProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CategoriaProductoInsertar.setText("ID Categoria");

        SubcategoriaProductoinsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        SubcategoriaProductoinsertar.setText("ID SubCategoria");

        ProveedorProductoinsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ProveedorProductoinsertar.setText("ID Proveedor");

        TiendaProductoinsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TiendaProductoinsertar.setText("ID Tienda");

        DatoProveedorProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoProveedorProductoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(Proveedor.getId(tienda)));

        ImagenProductoinsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ImagenProductoinsertar.setText("IMGENES");

        DatoImagenProductoInsertar.setColumns(20);
        DatoImagenProductoInsertar.setRows(5);
        scrollIMG10.setViewportView(DatoImagenProductoInsertar);

        javax.swing.GroupLayout PanelizqinsertarProductoLayout = new javax.swing.GroupLayout(PanelizqinsertarProducto);
        PanelizqinsertarProducto.setLayout(PanelizqinsertarProductoLayout);
        PanelizqinsertarProductoLayout.setHorizontalGroup(
            PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TiendaProductoinsertar)
                    .addComponent(ProveedorProductoinsertar)
                    .addComponent(NombreProductoInsertar)
                    .addComponent(PrecioProductoInsertar)
                    .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SubcategoriaProductoinsertar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CategoriaProductoInsertar))
                    .addComponent(ImagenProductoinsertar))
                .addGap(18, 18, 18)
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(DatoNombreProductoInsertar)
                        .addComponent(DatoPrecioProductoInsertar)
                        .addComponent(DatoSubcategoriaProductoInsertar, 0, 289, Short.MAX_VALUE)
                        .addComponent(DatoCategoriaProductoInsertar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DatoProveedorProductoInsertar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DatoTiendaProductoInsertar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollIMG10, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelizqinsertarProductoLayout.setVerticalGroup(
            PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarProductoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombreProductoInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(NombreProductoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoPrecioProductoInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(PrecioProductoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoCategoriaProductoInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(CategoriaProductoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoSubcategoriaProductoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubcategoriaProductoinsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoProveedorProductoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorProductoinsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoTiendaProductoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiendaProductoinsertar))
                .addGroup(PanelizqinsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelizqinsertarProductoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(scrollIMG10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqinsertarProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagenProductoinsertar)
                        .addGap(66, 66, 66))))
        );

        DescripcionProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DescripcionProductoInsertar.setText("DESCRIPCION");

        DatoDescripcionProductoInsertar.setColumns(20);
        DatoDescripcionProductoInsertar.setRows(5);
        scrollIMG1.setViewportView(DatoDescripcionProductoInsertar);

        DatoCaracteristicasProductoInsertar.setColumns(20);
        DatoCaracteristicasProductoInsertar.setRows(5);
        scrollIMG8.setViewportView(DatoCaracteristicasProductoInsertar);

        CaracteristicasProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CaracteristicasProductoInsertar.setText("CARACTERISTICAS / ESPECIFICACIONES");

        DatoAccesoriosProductoInsertar.setColumns(20);
        DatoAccesoriosProductoInsertar.setRows(5);
        scrollIMG9.setViewportView(DatoAccesoriosProductoInsertar);

        AccesoriosProductoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AccesoriosProductoInsertar.setText("ACCESORIOS");

        javax.swing.GroupLayout PanelderInsertarProductoLayout = new javax.swing.GroupLayout(PanelderInsertarProducto);
        PanelderInsertarProducto.setLayout(PanelderInsertarProductoLayout);
        PanelderInsertarProductoLayout.setHorizontalGroup(
            PanelderInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarProductoLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(PanelderInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollIMG9, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelderInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollIMG8)
                        .addComponent(CaracteristicasProductoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelderInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollIMG1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addComponent(DescripcionProductoInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(PanelderInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarProductoLayout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addComponent(AccesoriosProductoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        PanelderInsertarProductoLayout.setVerticalGroup(
            PanelderInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderInsertarProductoLayout.createSequentialGroup()
                .addComponent(DescripcionProductoInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(CaracteristicasProductoInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(scrollIMG9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelderInsertarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarProductoLayout.createSequentialGroup()
                    .addContainerGap(332, Short.MAX_VALUE)
                    .addComponent(AccesoriosProductoInsertar)
                    .addGap(126, 126, 126)))
        );

        BotonProductoInsertar.setText("INSERTAR PRODUCTO");
        BotonProductoInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProductoInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInsertarProductoPrincipalLayout = new javax.swing.GroupLayout(PanelInsertarProductoPrincipal);
        PanelInsertarProductoPrincipal.setLayout(PanelInsertarProductoPrincipalLayout);
        PanelInsertarProductoPrincipalLayout.setHorizontalGroup(
            PanelInsertarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarProductoPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PanelizqinsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelderInsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInsertarProductoPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonProductoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        PanelInsertarProductoPrincipalLayout.setVerticalGroup(
            PanelInsertarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarProductoPrincipalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelInsertarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelizqinsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelderInsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(BotonProductoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        TablaProducto.addTab("INSERTAR", PanelInsertarProductoPrincipal);

        DatoIDProductoEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDProductoEditarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(Producto.getId(tienda)));
        DatoIDProductoEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoIDProductoEditarProductoActionPerformed(evt);
            }
        });

        IDProductoEditarProducto.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDProductoEditarProducto.setText("ID PRODUCTO");

        DatoPrecioEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoPrecioEditarProducto.setText("");

        DatoTiendaEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTiendaEditarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(Datos.Tienda.getId(tienda)));

        DatoNombreEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoNombreEditarProducto.setText("");

        DatoCategoriaEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoCategoriaEditarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(Categoria.getId()));
        DatoCategoriaEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoCategoriaEditarProductoActionPerformed(evt);
            }
        });

        NombreEditarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NombreEditarProducto.setText("Nombre");

        DatoSubCategoriaEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoSubCategoriaEditarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(SubCategoria.getId((String) DatoCategoriaEditarProducto.getSelectedItem())));

        PrecioEditarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PrecioEditarProducto.setText("Precio");

        CategoriaEditarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CategoriaEditarProducto.setText("ID Categoria");

        SubCategoriaEditarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SubCategoriaEditarProducto.setText("ID SubCategoria");

        ProveedorEditarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ProveedorEditarProducto.setText("ID Proveedor");

        TiendaEditarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TiendaEditarProducto.setText("ID Tienda");

        DatoProveedorEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoProveedorEditarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(Proveedor.getId(tienda)));

        ImagenEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ImagenEditarProducto.setText("IMGANES (SEPERADAS  POR COMAS)");

        DatoImagenEditarProducto.setColumns(20);
        DatoImagenEditarProducto.setRows(5);
        scrollIMG14.setViewportView(DatoImagenEditarProducto);

        javax.swing.GroupLayout PanelizqEditarProductoLayout = new javax.swing.GroupLayout(PanelizqEditarProducto);
        PanelizqEditarProducto.setLayout(PanelizqEditarProductoLayout);
        PanelizqEditarProductoLayout.setHorizontalGroup(
            PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarProductoLayout.createSequentialGroup()
                .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollIMG14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addGroup(PanelizqEditarProductoLayout.createSequentialGroup()
                        .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TiendaEditarProducto)
                            .addComponent(ProveedorEditarProducto)
                            .addComponent(SubCategoriaEditarProducto)
                            .addComponent(CategoriaEditarProducto)
                            .addComponent(NombreEditarProducto)
                            .addComponent(PrecioEditarProducto))
                        .addGap(18, 18, 18)
                        .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoProveedorEditarProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatoSubCategoriaEditarProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatoCategoriaEditarProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatoPrecioEditarProducto)
                            .addComponent(DatoNombreEditarProducto)
                            .addComponent(DatoTiendaEditarProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        PanelizqEditarProductoLayout.setVerticalGroup(
            PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarProductoLayout.createSequentialGroup()
                .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEditarProducto)
                    .addComponent(DatoNombreEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoPrecioEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioEditarProducto))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoCategoriaEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaEditarProducto))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoSubCategoriaEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubCategoriaEditarProducto))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DatoProveedorEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorEditarProducto))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiendaEditarProducto)
                    .addComponent(DatoTiendaEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(ImagenEditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        DatoDescripcionEditarProducto.setColumns(20);
        DatoDescripcionEditarProducto.setRows(5);
        scrollIMG11.setViewportView(DatoDescripcionEditarProducto);

        DescripcionEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DescripcionEditarProducto.setText("DESCRIPCION");

        CaracteristicasEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CaracteristicasEditarProducto.setText("CARACTERISTICAS / ESPECIFICACIONES");

        DatoCaracteriticasEditarProducto.setColumns(20);
        DatoCaracteriticasEditarProducto.setRows(5);
        scrollIMG12.setViewportView(DatoCaracteriticasEditarProducto);

        AccesoriosEditarProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AccesoriosEditarProducto.setText("ACCESORIOS");

        DatoAccesoriosEditarProducto.setColumns(20);
        DatoAccesoriosEditarProducto.setRows(5);
        scrollIMG13.setViewportView(DatoAccesoriosEditarProducto);

        javax.swing.GroupLayout PanelDerEditarProductoLayout = new javax.swing.GroupLayout(PanelDerEditarProducto);
        PanelDerEditarProducto.setLayout(PanelDerEditarProductoLayout);
        PanelDerEditarProductoLayout.setHorizontalGroup(
            PanelDerEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarProductoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PanelDerEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollIMG12)
                    .addComponent(DescripcionEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelDerEditarProductoLayout.createSequentialGroup()
                        .addGroup(PanelDerEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaracteristicasEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccesoriosEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollIMG13, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollIMG11, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDerEditarProductoLayout.setVerticalGroup(
            PanelDerEditarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarProductoLayout.createSequentialGroup()
                .addComponent(DescripcionEditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(AccesoriosEditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(CaracteristicasEditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BotonEditarProducto.setText("EDITAR PRODUCTO");
        BotonEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEditarProductoPrincipalLayout = new javax.swing.GroupLayout(PanelEditarProductoPrincipal);
        PanelEditarProductoPrincipal.setLayout(PanelEditarProductoPrincipalLayout);
        PanelEditarProductoPrincipalLayout.setHorizontalGroup(
            PanelEditarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarProductoPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelEditarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditarProductoPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelDerEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DatoIDProductoEditarProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelEditarProductoPrincipalLayout.createSequentialGroup()
                        .addComponent(IDProductoEditarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        PanelEditarProductoPrincipalLayout.setVerticalGroup(
            PanelEditarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarProductoPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelEditarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDProductoEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDProductoEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelEditarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDerEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelizqEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TablaProducto.addTab("EDITAR ", PanelEditarProductoPrincipal);

        DatoIDProductoBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDProductoBorrarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(Producto.getId(tienda)));
        DatoIDProductoBorrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoIDProductoBorrarProductoActionPerformed(evt);
            }
        });

        IDProductoBorrarProducto.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDProductoBorrarProducto.setText("ID PRODUCTO");

        NombreBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NombreBorrarProducto.setText("Nombre");

        PrecioBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PrecioBorrarProducto.setText("Precio");

        DatoPrecioBorrarProducto.setText("Precio");
        DatoPrecioBorrarProducto.setToolTipText("");
        DatoPrecioBorrarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoNombreBorrarProducto.setText("Nombre");
        DatoNombreBorrarProducto.setToolTipText("");
        DatoNombreBorrarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoDescripcionBorrarProducto.setColumns(20);
        DatoDescripcionBorrarProducto.setRows(5);
        scrollIMG15.setViewportView(DatoDescripcionBorrarProducto);

        DescripcionBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DescripcionBorrarProducto.setText("DESCRIPCION");

        CaracteristicasBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CaracteristicasBorrarProducto.setText("CARACTERISTICAS / ESPECIFICACIONES");

        DatoCaracteristicasBorrarProducto.setColumns(20);
        DatoCaracteristicasBorrarProducto.setRows(5);
        scrollIMG16.setViewportView(DatoCaracteristicasBorrarProducto);

        javax.swing.GroupLayout PanelizqBorrarProductoLayout = new javax.swing.GroupLayout(PanelizqBorrarProducto);
        PanelizqBorrarProducto.setLayout(PanelizqBorrarProductoLayout);
        PanelizqBorrarProductoLayout.setHorizontalGroup(
            PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqBorrarProductoLayout.createSequentialGroup()
                .addGroup(PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelizqBorrarProductoLayout.createSequentialGroup()
                        .addComponent(CaracteristicasBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(212, 212, 212))
                    .addGroup(PanelizqBorrarProductoLayout.createSequentialGroup()
                        .addGroup(PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelizqBorrarProductoLayout.createSequentialGroup()
                                .addGroup(PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PrecioBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NombreBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DescripcionBorrarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DatoPrecioBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DatoNombreBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(scrollIMG15, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollIMG16, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelizqBorrarProductoLayout.setVerticalGroup(
            PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqBorrarProductoLayout.createSequentialGroup()
                .addGroup(PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombreBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreBorrarProducto))
                .addGap(20, 20, 20)
                .addGroup(PanelizqBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoPrecioBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioBorrarProducto))
                .addGap(20, 20, 20)
                .addComponent(DescripcionBorrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CaracteristicasBorrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DatoCategoriaBorrarProducto.setText("categoria");
        DatoCategoriaBorrarProducto.setToolTipText("");
        DatoCategoriaBorrarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SubCategoriaBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SubCategoriaBorrarProducto.setText("Subcategoria");

        CategoriaBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CategoriaBorrarProducto.setText("Categoria");

        DatoSubCategoriaBorrarProducto.setText("Subcategoria");
        DatoSubCategoriaBorrarProducto.setToolTipText("");
        DatoSubCategoriaBorrarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ImagenBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ImagenBorrarProducto.setText("IMAGENES");

        ProveedorBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ProveedorBorrarProducto.setText("Proveedor");

        DatoProveedorBorrarProducto.setText("Subcategoria");
        DatoProveedorBorrarProducto.setToolTipText("");
        DatoProveedorBorrarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TiendaBorrarProducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TiendaBorrarProducto.setText("Tienda");

        DatoTiendaBorrarProducto.setText("Subcategoria");
        DatoTiendaBorrarProducto.setToolTipText("");
        DatoTiendaBorrarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoImagenBorrarProducto.setColumns(20);
        DatoImagenBorrarProducto.setRows(5);
        scrollIMG17.setViewportView(DatoImagenBorrarProducto);

        BotonBorrarProducto.setText("BOTON NUCLEAR");
        BotonBorrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelderBorrarProductoLayout = new javax.swing.GroupLayout(PanelderBorrarProducto);
        PanelderBorrarProducto.setLayout(PanelderBorrarProductoLayout);
        PanelderBorrarProductoLayout.setHorizontalGroup(
            PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelderBorrarProductoLayout.createSequentialGroup()
                .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollIMG17, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelderBorrarProductoLayout.createSequentialGroup()
                            .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SubCategoriaBorrarProducto)
                                .addComponent(CategoriaBorrarProducto))
                            .addGap(50, 50, 50)
                            .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DatoCategoriaBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DatoSubCategoriaBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelderBorrarProductoLayout.createSequentialGroup()
                            .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelderBorrarProductoLayout.createSequentialGroup()
                                    .addComponent(TiendaBorrarProducto)
                                    .addGap(50, 50, 50))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderBorrarProductoLayout.createSequentialGroup()
                                    .addComponent(ProveedorBorrarProducto)
                                    .addGap(66, 66, 66)))
                            .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelderBorrarProductoLayout.createSequentialGroup()
                                    .addComponent(DatoProveedorBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4))
                                .addComponent(DatoTiendaBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        PanelderBorrarProductoLayout.setVerticalGroup(
            PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderBorrarProductoLayout.createSequentialGroup()
                .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoCategoriaBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaBorrarProducto))
                .addGap(30, 30, 30)
                .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoSubCategoriaBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubCategoriaBorrarProducto))
                .addGap(30, 30, 30)
                .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoProveedorBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorBorrarProducto))
                .addGap(30, 30, 30)
                .addGroup(PanelderBorrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoTiendaBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiendaBorrarProducto))
                .addGap(39, 39, 39)
                .addComponent(ImagenBorrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(BotonBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout PanelBorrarProductoPrincipalLayout = new javax.swing.GroupLayout(PanelBorrarProductoPrincipal);
        PanelBorrarProductoPrincipal.setLayout(PanelBorrarProductoPrincipalLayout);
        PanelBorrarProductoPrincipalLayout.setHorizontalGroup(
            PanelBorrarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarProductoPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelBorrarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatoIDProductoBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDProductoBorrarProducto)
                    .addGroup(PanelBorrarProductoPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelderBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBorrarProductoPrincipalLayout.setVerticalGroup(
            PanelBorrarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarProductoPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(IDProductoBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDProductoBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(PanelBorrarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelizqBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBorrarProductoPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelderBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        TablaProducto.addTab("BORRAR ", PanelBorrarProductoPrincipal);

        ExplorardorExportarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorExportarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelExportarProductoPrincipalLayout = new javax.swing.GroupLayout(PanelExportarProductoPrincipal);
        PanelExportarProductoPrincipal.setLayout(PanelExportarProductoPrincipalLayout);
        PanelExportarProductoPrincipalLayout.setHorizontalGroup(
            PanelExportarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarProductoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelExportarProductoPrincipalLayout.setVerticalGroup(
            PanelExportarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarProductoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaProducto.addTab("EXPORTAR", PanelExportarProductoPrincipal);

        ExplorardorImportarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorImportarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelImportarProductoPrincipalLayout = new javax.swing.GroupLayout(PanelImportarProductoPrincipal);
        PanelImportarProductoPrincipal.setLayout(PanelImportarProductoPrincipalLayout);
        PanelImportarProductoPrincipalLayout.setHorizontalGroup(
            PanelImportarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarProductoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelImportarProductoPrincipalLayout.setVerticalGroup(
            PanelImportarProductoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarProductoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaProducto.addTab("IMPORTAR ", PanelImportarProductoPrincipal);

        javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(PanelProducto);
        PanelProducto.setLayout(PanelProductoLayout);
        PanelProductoLayout.setHorizontalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaProducto, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelProductoLayout.setVerticalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaProducto)
        );

        PanelesTienda.addTab("Productos", PanelProducto);

        TablaDatoCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TablaDatoCliente.setModel(new javax.swing.table.DefaultTableModel(Cliente.get(tienda),new String [] {"ID", "DNI", "NOMBRE", "DIRECCION", "TELEFONO"}));
        ScrollTablaCliente.setViewportView(TablaDatoCliente);

        javax.swing.GroupLayout PanelTablaClienteLayout = new javax.swing.GroupLayout(PanelTablaCliente);
        PanelTablaCliente.setLayout(PanelTablaClienteLayout);
        PanelTablaClienteLayout.setHorizontalGroup(
            PanelTablaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        PanelTablaClienteLayout.setVerticalGroup(
            PanelTablaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        TablaCliente.addTab("VER ", PanelTablaCliente);

        DatoDNIClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoTiendaClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTiendaClienteInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DatoNombreClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        NombreClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        NombreClienteInsertar.setText("Nombre");

        DNIClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DNIClienteInsertar.setText("DNI");

        TiendaClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TiendaClienteInsertar.setText("ID Tienda");

        TelefonoClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TelefonoClienteInsertar.setText("Telefono");

        DatoTelefonoClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout PanelizqinsertarClienteLayout = new javax.swing.GroupLayout(PanelizqinsertarCliente);
        PanelizqinsertarCliente.setLayout(PanelizqinsertarClienteLayout);
        PanelizqinsertarClienteLayout.setHorizontalGroup(
            PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelizqinsertarClienteLayout.createSequentialGroup()
                        .addGroup(PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreClienteInsertar)
                            .addComponent(DNIClienteInsertar)
                            .addComponent(TelefonoClienteInsertar))
                        .addGap(65, 65, 65)
                        .addGroup(PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DatoTelefonoClienteInsertar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(DatoNombreClienteInsertar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoDNIClienteInsertar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelizqinsertarClienteLayout.createSequentialGroup()
                        .addComponent(TiendaClienteInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DatoTiendaClienteInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelizqinsertarClienteLayout.setVerticalGroup(
            PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombreClienteInsertar)
                    .addComponent(NombreClienteInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoDNIClienteInsertar)
                    .addComponent(DNIClienteInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoTelefonoClienteInsertar)
                    .addComponent(TelefonoClienteInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiendaClienteInsertar)
                    .addComponent(DatoTiendaClienteInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        DireccionClienteInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DireccionClienteInsertar.setText("DIRECCION");

        DatoDireccionClienteInsertar.setColumns(20);
        DatoDireccionClienteInsertar.setRows(5);
        scrollIMG2.setViewportView(DatoDireccionClienteInsertar);

        javax.swing.GroupLayout PanelderInsertarClienteLayout = new javax.swing.GroupLayout(PanelderInsertarCliente);
        PanelderInsertarCliente.setLayout(PanelderInsertarClienteLayout);
        PanelderInsertarClienteLayout.setHorizontalGroup(
            PanelderInsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarClienteLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(PanelderInsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollIMG2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(DireccionClienteInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        PanelderInsertarClienteLayout.setVerticalGroup(
            PanelderInsertarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderInsertarClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DireccionClienteInsertar)
                .addGap(18, 18, 18)
                .addComponent(scrollIMG2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonInsertarCliente.setText("INSERTAR CLIENTE");
        BotonInsertarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInsertarClientePrincipalLayout = new javax.swing.GroupLayout(PanelInsertarClientePrincipal);
        PanelInsertarClientePrincipal.setLayout(PanelInsertarClientePrincipalLayout);
        PanelInsertarClientePrincipalLayout.setHorizontalGroup(
            PanelInsertarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarClientePrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PanelizqinsertarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelderInsertarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInsertarClientePrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonInsertarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        PanelInsertarClientePrincipalLayout.setVerticalGroup(
            PanelInsertarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarClientePrincipalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelInsertarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelizqinsertarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelderInsertarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(BotonInsertarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        TablaCliente.addTab("INSERTAR", PanelInsertarClientePrincipal);

        DatoIDClienteEditarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDClienteEditarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        IDClienteEditarCliente.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDClienteEditarCliente.setText("ID CLIENTE");

        DatoDNIEditarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoDNIEditarCliente.setText("");

        DatoNombreEditarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoNombreEditarCliente.setText("");

        NombreEditarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NombreEditarCliente.setText("Nombre");

        DNIEditarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        DNIEditarCliente.setText("DNI");

        TelefonoEditarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TelefonoEditarCliente.setText("Telefono");

        DatoTelefonoEditarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTelefonoEditarCliente.setText("");

        javax.swing.GroupLayout PanelizqEditarClienteLayout = new javax.swing.GroupLayout(PanelizqEditarCliente);
        PanelizqEditarCliente.setLayout(PanelizqEditarClienteLayout);
        PanelizqEditarClienteLayout.setHorizontalGroup(
            PanelizqEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarClienteLayout.createSequentialGroup()
                .addGroup(PanelizqEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelefonoEditarCliente)
                    .addComponent(NombreEditarCliente)
                    .addComponent(DNIEditarCliente))
                .addGap(58, 58, 58)
                .addGroup(PanelizqEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatoDNIEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(DatoNombreEditarCliente)
                    .addComponent(DatoTelefonoEditarCliente))
                .addGap(36, 36, 36))
        );
        PanelizqEditarClienteLayout.setVerticalGroup(
            PanelizqEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarClienteLayout.createSequentialGroup()
                .addGroup(PanelizqEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEditarCliente)
                    .addComponent(DatoNombreEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoDNIEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIEditarCliente))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoEditarCliente)
                    .addComponent(DatoTelefonoEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(395, 395, 395))
        );

        DatoDireccionEditarCliente.setColumns(20);
        DatoDireccionEditarCliente.setRows(5);
        scrollIMG55.setViewportView(DatoDireccionEditarCliente);

        DireccionEditarCliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DireccionEditarCliente.setText("DIRECCION");

        botonEditarCliente.setText("EDITAR CLIENTE");
        botonEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDerEditarClienteLayout = new javax.swing.GroupLayout(PanelDerEditarCliente);
        PanelDerEditarCliente.setLayout(PanelDerEditarClienteLayout);
        PanelDerEditarClienteLayout.setHorizontalGroup(
            PanelDerEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarClienteLayout.createSequentialGroup()
                .addGroup(PanelDerEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DireccionEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelDerEditarClienteLayout.createSequentialGroup()
                        .addGroup(PanelDerEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollIMG55, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDerEditarClienteLayout.setVerticalGroup(
            PanelDerEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarClienteLayout.createSequentialGroup()
                .addComponent(DireccionEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG55, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(botonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelEditarClientePrincipalLayout = new javax.swing.GroupLayout(PanelEditarClientePrincipal);
        PanelEditarClientePrincipal.setLayout(PanelEditarClientePrincipalLayout);
        PanelEditarClientePrincipalLayout.setHorizontalGroup(
            PanelEditarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarClientePrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelEditarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditarClientePrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelDerEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDClienteEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatoIDClienteEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelEditarClientePrincipalLayout.setVerticalGroup(
            PanelEditarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarClientePrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(IDClienteEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDClienteEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelEditarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDerEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelizqEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TablaCliente.addTab("EDITAR ", PanelEditarClientePrincipal);

        DatoIDClienteBorrarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDClienteBorrarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        IDClienteBorrarCliente.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDClienteBorrarCliente.setText("ID CLIENTE");

        NombreBorrarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NombreBorrarCliente.setText("Nombre");

        DNIBorrarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        DNIBorrarCliente.setText("DNI");

        DatoDNIBorrarCliente.setText("Precio");
        DatoDNIBorrarCliente.setToolTipText("");
        DatoDNIBorrarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoNombreBorrarCliente.setText("Nombre");
        DatoNombreBorrarCliente.setToolTipText("");
        DatoNombreBorrarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TelefonoBorrarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TelefonoBorrarCliente.setText("Telefono");

        DatoTelefonoBorrarCliente.setText("Precio");
        DatoTelefonoBorrarCliente.setToolTipText("");
        DatoTelefonoBorrarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelizqBorrarClienteLayout = new javax.swing.GroupLayout(PanelizqBorrarCliente);
        PanelizqBorrarCliente.setLayout(PanelizqBorrarClienteLayout);
        PanelizqBorrarClienteLayout.setHorizontalGroup(
            PanelizqBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqBorrarClienteLayout.createSequentialGroup()
                .addGroup(PanelizqBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DNIBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(TelefonoBorrarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelizqBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DatoDNIBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoNombreBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(DatoTelefonoBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        PanelizqBorrarClienteLayout.setVerticalGroup(
            PanelizqBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqBorrarClienteLayout.createSequentialGroup()
                .addGroup(PanelizqBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombreBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreBorrarCliente))
                .addGap(30, 30, 30)
                .addGroup(PanelizqBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoDNIBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIBorrarCliente))
                .addGap(30, 30, 30)
                .addGroup(PanelizqBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoBorrarCliente)
                    .addComponent(DatoTelefonoBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonBorrarCliente.setText("BOTON NUCLEAR");
        BotonBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarClienteActionPerformed(evt);
            }
        });

        DatoDireccionBorrarCliente.setColumns(20);
        DatoDireccionBorrarCliente.setRows(5);
        scrollIMG58.setViewportView(DatoDireccionBorrarCliente);

        DireccionBorrarCliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DireccionBorrarCliente.setText("DIRECCION");

        javax.swing.GroupLayout PanelderBorrarClienteLayout = new javax.swing.GroupLayout(PanelderBorrarCliente);
        PanelderBorrarCliente.setLayout(PanelderBorrarClienteLayout);
        PanelderBorrarClienteLayout.setHorizontalGroup(
            PanelderBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderBorrarClienteLayout.createSequentialGroup()
                .addGroup(PanelderBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelderBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelderBorrarClienteLayout.createSequentialGroup()
                            .addComponent(DireccionBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(330, 330, 330))
                        .addComponent(scrollIMG58, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        PanelderBorrarClienteLayout.setVerticalGroup(
            PanelderBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderBorrarClienteLayout.createSequentialGroup()
                .addComponent(DireccionBorrarCliente)
                .addGap(18, 18, 18)
                .addComponent(scrollIMG58, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(BotonBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelBorrarClientePrincipalLayout = new javax.swing.GroupLayout(PanelBorrarClientePrincipal);
        PanelBorrarClientePrincipal.setLayout(PanelBorrarClientePrincipalLayout);
        PanelBorrarClientePrincipalLayout.setHorizontalGroup(
            PanelBorrarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarClientePrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelBorrarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatoIDClienteBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDClienteBorrarCliente)
                    .addGroup(PanelBorrarClientePrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelderBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBorrarClientePrincipalLayout.setVerticalGroup(
            PanelBorrarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarClientePrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(IDClienteBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDClienteBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(PanelBorrarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelizqBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBorrarClientePrincipalLayout.createSequentialGroup()
                        .addComponent(PanelderBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        TablaCliente.addTab("BORRAR ", PanelBorrarClientePrincipal);

        ExplorardorExportarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorExportarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelExportarClientePrincipalLayout = new javax.swing.GroupLayout(PanelExportarClientePrincipal);
        PanelExportarClientePrincipal.setLayout(PanelExportarClientePrincipalLayout);
        PanelExportarClientePrincipalLayout.setHorizontalGroup(
            PanelExportarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarClientePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelExportarClientePrincipalLayout.setVerticalGroup(
            PanelExportarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarClientePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaCliente.addTab("EXPORTAR", PanelExportarClientePrincipal);

        ExplorardorImportarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorImportarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelImportarClientePrincipalLayout = new javax.swing.GroupLayout(PanelImportarClientePrincipal);
        PanelImportarClientePrincipal.setLayout(PanelImportarClientePrincipalLayout);
        PanelImportarClientePrincipalLayout.setHorizontalGroup(
            PanelImportarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarClientePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelImportarClientePrincipalLayout.setVerticalGroup(
            PanelImportarClientePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarClientePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaCliente.addTab("IMPORTAR ", PanelImportarClientePrincipal);

        javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(PanelCliente);
        PanelCliente.setLayout(PanelClienteLayout);
        PanelClienteLayout.setHorizontalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaCliente, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelClienteLayout.setVerticalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaCliente)
        );

        PanelesTienda.addTab("Clientes", PanelCliente);

        TabalaProveeodor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TabalaProveeodor.setModel(new javax.swing.table.DefaultTableModel(
            Proveedor.get(tienda),
            new String [] {
                "ID", "NIF", "NOMBRE", "PAIS", "DIRECCION", "TELEFONO", "REPRESENTANTE", "IDIOMA", "CONTACTO"
            }
        ));
        ScrollTablaProveedor.setViewportView(TabalaProveeodor);

        javax.swing.GroupLayout PanelTablaProveedorLayout = new javax.swing.GroupLayout(PanelTablaProveedor);
        PanelTablaProveedor.setLayout(PanelTablaProveedorLayout);
        PanelTablaProveedorLayout.setHorizontalGroup(
            PanelTablaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        PanelTablaProveedorLayout.setVerticalGroup(
            PanelTablaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        TablaProveedor.addTab("VER ", PanelTablaProveedor);

        DatoNIFProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoNombreProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        NombreProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        NombreProveedorInsertar.setText("Nombre");

        NIFProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        NIFProveedorInsertar.setText("NIF");

        TelefonoProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TelefonoProveedorInsertar.setText("Telefono");

        RepresentanteProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        RepresentanteProveedorInsertar.setText("Representante");

        NombreEncargadoProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        NombreEncargadoProveedorInsertar.setText("Nombre");

        TelefonoEncargadoProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TelefonoEncargadoProveedorInsertar.setText("Telefono");

        DatoTelefonoEncargadoProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTelefonoEncargadoProveedorInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoTelefonoEncargadoProveedorInsertarActionPerformed(evt);
            }
        });

        EncargadoProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        EncargadoProveedorInsertar.setText("Encargado de la empresa");

        DatoTelefonoProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoRepresentanteProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoNombreEncargadoProveedorInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelizqinsertarProveedorLayout = new javax.swing.GroupLayout(PanelizqinsertarProveedor);
        PanelizqinsertarProveedor.setLayout(PanelizqinsertarProveedorLayout);
        PanelizqinsertarProveedorLayout.setHorizontalGroup(
            PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelizqinsertarProveedorLayout.createSequentialGroup()
                        .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreProveedorInsertar)
                            .addComponent(NIFProveedorInsertar)
                            .addComponent(RepresentanteProveedorInsertar)
                            .addComponent(TelefonoProveedorInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DatoNombreProveedorInsertar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(DatoNIFProveedorInsertar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoTelefonoProveedorInsertar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoRepresentanteProveedorInsertar, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(EncargadoProveedorInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqinsertarProveedorLayout.createSequentialGroup()
                        .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelizqinsertarProveedorLayout.createSequentialGroup()
                                .addComponent(TelefonoEncargadoProveedorInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqinsertarProveedorLayout.createSequentialGroup()
                                .addComponent(NombreEncargadoProveedorInsertar)
                                .addGap(56, 56, 56)))
                        .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DatoTelefonoEncargadoProveedorInsertar)
                            .addComponent(DatoNombreEncargadoProveedorInsertar, 0, 289, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelizqinsertarProveedorLayout.setVerticalGroup(
            PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarProveedorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombreProveedorInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(NombreProveedorInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNIFProveedorInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(NIFProveedorInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoProveedorInsertar)
                    .addComponent(DatoTelefonoProveedorInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepresentanteProveedorInsertar)
                    .addComponent(DatoRepresentanteProveedorInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(EncargadoProveedorInsertar)
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEncargadoProveedorInsertar)
                    .addComponent(DatoNombreEncargadoProveedorInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoEncargadoProveedorInsertar)
                    .addComponent(DatoTelefonoEncargadoProveedorInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        DireccionProveedorInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DireccionProveedorInsertar.setText("DIRECCION");

        DatoDireccionProveedorInsertar.setColumns(20);
        DatoDireccionProveedorInsertar.setRows(5);
        scrollIMG3.setViewportView(DatoDireccionProveedorInsertar);

        javax.swing.GroupLayout PanelderInsertarProveedorLayout = new javax.swing.GroupLayout(PanelderInsertarProveedor);
        PanelderInsertarProveedor.setLayout(PanelderInsertarProveedorLayout);
        PanelderInsertarProveedorLayout.setHorizontalGroup(
            PanelderInsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarProveedorLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(PanelderInsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollIMG3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(DireccionProveedorInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        PanelderInsertarProveedorLayout.setVerticalGroup(
            PanelderInsertarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderInsertarProveedorLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(DireccionProveedorInsertar)
                .addGap(18, 18, 18)
                .addComponent(scrollIMG3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BotonProveedorInsertar.setText("INSERTAR PRODUCTO");
        BotonProveedorInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProveedorInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInsertarProveedorPrincipalLayout = new javax.swing.GroupLayout(PanelInsertarProveedorPrincipal);
        PanelInsertarProveedorPrincipal.setLayout(PanelInsertarProveedorPrincipalLayout);
        PanelInsertarProveedorPrincipalLayout.setHorizontalGroup(
            PanelInsertarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarProveedorPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PanelizqinsertarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelInsertarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInsertarProveedorPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelderInsertarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInsertarProveedorPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonProveedorInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        PanelInsertarProveedorPrincipalLayout.setVerticalGroup(
            PanelInsertarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarProveedorPrincipalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelInsertarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelizqinsertarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInsertarProveedorPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelderInsertarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(BotonProveedorInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        TablaProveedor.addTab("INSERTAR", PanelInsertarProveedorPrincipal);

        DatoIDProveedorEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDProveedorEditarProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        IDProveedorEditarProveedor.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDProveedorEditarProveedor.setText("ID PROVEEDOR");

        DatoNIFEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoNIFEditarProveedor.setText("");

        DatoNombreEncargadoEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoNombreEncargadoEditarProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DatoNombreEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoNombreEditarProveedor.setText("");

        NombreEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        NombreEditarProveedor.setText("Nombre");

        NIFEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        NIFEditarProveedor.setText("NIF");

        TelefonoEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        TelefonoEditarProveedor.setText("Telefono");

        RepresentanteEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        RepresentanteEditarProveedor.setText("Representante");

        NombreEncargadoEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        NombreEncargadoEditarProveedor.setText("Nombre");

        EncargadoProveedorEditar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        EncargadoProveedorEditar.setText("Encargado de la empresa");

        DatoTelefonoEncargadoEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTelefonoEncargadoEditarProveedor.setText("");

        TelefonoEncargadoEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        TelefonoEncargadoEditarProveedor.setText("Telefono");

        DatoTelefonoEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTelefonoEditarProveedor.setText("");

        DatoRepresentanteEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoRepresentanteEditarProveedor.setText("");

        javax.swing.GroupLayout PanelizqEditarProveedorLayout = new javax.swing.GroupLayout(PanelizqEditarProveedor);
        PanelizqEditarProveedor.setLayout(PanelizqEditarProveedorLayout);
        PanelizqEditarProveedorLayout.setHorizontalGroup(
            PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarProveedorLayout.createSequentialGroup()
                .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EncargadoProveedorEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelizqEditarProveedorLayout.createSequentialGroup()
                        .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreEncargadoEditarProveedor)
                            .addComponent(RepresentanteEditarProveedor)
                            .addComponent(NombreEditarProveedor)
                            .addComponent(NIFEditarProveedor)
                            .addComponent(TelefonoEncargadoEditarProveedor)
                            .addComponent(TelefonoEditarProveedor))
                        .addGap(18, 18, 18)
                        .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoNIFEditarProveedor)
                            .addComponent(DatoNombreEditarProveedor)
                            .addComponent(DatoNombreEncargadoEditarProveedor, 0, 309, Short.MAX_VALUE)
                            .addComponent(DatoTelefonoEncargadoEditarProveedor)
                            .addComponent(DatoTelefonoEditarProveedor)
                            .addComponent(DatoRepresentanteEditarProveedor))))
                .addGap(36, 36, 36))
        );
        PanelizqEditarProveedorLayout.setVerticalGroup(
            PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarProveedorLayout.createSequentialGroup()
                .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEditarProveedor)
                    .addComponent(DatoNombreEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNIFEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIFEditarProveedor))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoEditarProveedor)
                    .addComponent(DatoTelefonoEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepresentanteEditarProveedor)
                    .addComponent(DatoRepresentanteEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(EncargadoProveedorEditar)
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEncargadoEditarProveedor)
                    .addComponent(DatoNombreEncargadoEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoTelefonoEncargadoEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoEncargadoEditarProveedor))
                .addGap(198, 198, 198))
        );

        DatoDireccionEditarProveedor.setColumns(20);
        DatoDireccionEditarProveedor.setRows(5);
        scrollIMG65.setViewportView(DatoDireccionEditarProveedor);

        DireccionEditarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DireccionEditarProveedor.setText("DIRECCION");

        BotonEditarProveedor.setText("EDITAR PRODUCTO");
        BotonEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDerEditarProveedorLayout = new javax.swing.GroupLayout(PanelDerEditarProveedor);
        PanelDerEditarProveedor.setLayout(PanelDerEditarProveedorLayout);
        PanelDerEditarProveedorLayout.setHorizontalGroup(
            PanelDerEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarProveedorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PanelDerEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DireccionEditarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelDerEditarProveedorLayout.createSequentialGroup()
                        .addGroup(PanelDerEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollIMG65, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDerEditarProveedorLayout.setVerticalGroup(
            PanelDerEditarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarProveedorLayout.createSequentialGroup()
                .addComponent(DireccionEditarProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG65, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        javax.swing.GroupLayout PanelEditarProveedorPrincipalLayout = new javax.swing.GroupLayout(PanelEditarProveedorPrincipal);
        PanelEditarProveedorPrincipal.setLayout(PanelEditarProveedorPrincipalLayout);
        PanelEditarProveedorPrincipalLayout.setHorizontalGroup(
            PanelEditarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarProveedorPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelEditarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditarProveedorPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqEditarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelDerEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DatoIDProveedorEditarProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelEditarProveedorPrincipalLayout.createSequentialGroup()
                        .addComponent(IDProveedorEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        PanelEditarProveedorPrincipalLayout.setVerticalGroup(
            PanelEditarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarProveedorPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(IDProveedorEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDProveedorEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelEditarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDerEditarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelizqEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 528, Short.MAX_VALUE))
                .addContainerGap())
        );

        TablaProveedor.addTab("EDITAR ", PanelEditarProveedorPrincipal);

        DatoIDProveedorBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDProveedorBorrarProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        IDProveedorBorrarProveedor.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDProveedorBorrarProveedor.setText("ID PROVEEDOR");

        NombreBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        NombreBorrarProveedor.setText("Nombre");

        NIFBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        NIFBorrarProveedor.setText("NIF");

        DatoNIFBorrarProveedor.setText("Precio");
        DatoNIFBorrarProveedor.setToolTipText("");
        DatoNIFBorrarProveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoNombreBorrarProveedor.setText("Nombre");
        DatoNombreBorrarProveedor.setToolTipText("");
        DatoNombreBorrarProveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoRepresentanteBorrarProveedor.setText("Subcategoria");
        DatoRepresentanteBorrarProveedor.setToolTipText("");
        DatoRepresentanteBorrarProveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RepresentanteBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        RepresentanteBorrarProveedor.setText("Representante");

        TelefonoBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        TelefonoBorrarProveedor.setText("Telefono");

        DatoTelefonoBorrarProveedor.setText("categoria");
        DatoTelefonoBorrarProveedor.setToolTipText("");
        DatoTelefonoBorrarProveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EncargadoProveedorBorrar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        EncargadoProveedorBorrar.setText("Encargado de la empresa");

        NombreEncargadoBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        NombreEncargadoBorrarProveedor.setText("Nombre");

        TelefonoEncargadoBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        TelefonoEncargadoBorrarProveedor.setText("Telefono");

        DatoNombreEncargadoBorrarProducto4.setText("categoria");
        DatoNombreEncargadoBorrarProducto4.setToolTipText("");
        DatoNombreEncargadoBorrarProducto4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoTelefonoEncargadoBorrarProducto5.setText("categoria");
        DatoTelefonoEncargadoBorrarProducto5.setToolTipText("");
        DatoTelefonoEncargadoBorrarProducto5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelizqBorrarProveedorLayout = new javax.swing.GroupLayout(PanelizqBorrarProveedor);
        PanelizqBorrarProveedor.setLayout(PanelizqBorrarProveedorLayout);
        PanelizqBorrarProveedorLayout.setHorizontalGroup(
            PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqBorrarProveedorLayout.createSequentialGroup()
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EncargadoProveedorBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGroup(PanelizqBorrarProveedorLayout.createSequentialGroup()
                        .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelefonoEncargadoBorrarProveedor)
                            .addGroup(PanelizqBorrarProveedorLayout.createSequentialGroup()
                                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RepresentanteBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NIFBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NombreBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(TelefonoBorrarProveedor, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelizqBorrarProveedorLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DatoNIFBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DatoNombreBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DatoRepresentanteBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DatoTelefonoBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqBorrarProveedorLayout.createSequentialGroup()
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DatoTelefonoEncargadoBorrarProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelizqBorrarProveedorLayout.createSequentialGroup()
                        .addComponent(NombreEncargadoBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DatoNombreEncargadoBorrarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        PanelizqBorrarProveedorLayout.setVerticalGroup(
            PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqBorrarProveedorLayout.createSequentialGroup()
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombreBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreBorrarProveedor))
                .addGap(30, 30, 30)
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNIFBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIFBorrarProveedor))
                .addGap(30, 30, 30)
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepresentanteBorrarProveedor)
                    .addComponent(DatoRepresentanteBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoTelefonoBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoBorrarProveedor))
                .addGap(50, 50, 50)
                .addComponent(EncargadoProveedorBorrar)
                .addGap(29, 29, 29)
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEncargadoBorrarProveedor)
                    .addComponent(DatoNombreEncargadoBorrarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanelizqBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoEncargadoBorrarProveedor)
                    .addComponent(DatoTelefonoEncargadoBorrarProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        BotonBorrarProveedor.setText("BOTON NUCLEAR");
        BotonBorrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarProveedorActionPerformed(evt);
            }
        });

        DatoDireccionBorrarProveedor.setColumns(20);
        DatoDireccionBorrarProveedor.setRows(5);
        scrollIMG68.setViewportView(DatoDireccionBorrarProveedor);

        DireccionBorrarProveedor.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DireccionBorrarProveedor.setText("DESCRIPCION");

        javax.swing.GroupLayout PanelderBorrarProveedorLayout = new javax.swing.GroupLayout(PanelderBorrarProveedor);
        PanelderBorrarProveedor.setLayout(PanelderBorrarProveedorLayout);
        PanelderBorrarProveedorLayout.setHorizontalGroup(
            PanelderBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderBorrarProveedorLayout.createSequentialGroup()
                .addGroup(PanelderBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DireccionBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollIMG68, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        PanelderBorrarProveedorLayout.setVerticalGroup(
            PanelderBorrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderBorrarProveedorLayout.createSequentialGroup()
                .addComponent(DireccionBorrarProveedor)
                .addGap(18, 18, 18)
                .addComponent(scrollIMG68, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout PanelBorrarProveedorPrincipalLayout = new javax.swing.GroupLayout(PanelBorrarProveedorPrincipal);
        PanelBorrarProveedorPrincipal.setLayout(PanelBorrarProveedorPrincipalLayout);
        PanelBorrarProveedorPrincipalLayout.setHorizontalGroup(
            PanelBorrarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarProveedorPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelBorrarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatoIDProveedorBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDProveedorBorrarProveedor)
                    .addGroup(PanelBorrarProveedorPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelderBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBorrarProveedorPrincipalLayout.setVerticalGroup(
            PanelBorrarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarProveedorPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(IDProveedorBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDProveedorBorrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(PanelBorrarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelderBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelizqBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TablaProveedor.addTab("BORRAR ", PanelBorrarProveedorPrincipal);

        ExplorardorExportarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorExportarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelExportarProveedorPrincipalLayout = new javax.swing.GroupLayout(PanelExportarProveedorPrincipal);
        PanelExportarProveedorPrincipal.setLayout(PanelExportarProveedorPrincipalLayout);
        PanelExportarProveedorPrincipalLayout.setHorizontalGroup(
            PanelExportarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarProveedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelExportarProveedorPrincipalLayout.setVerticalGroup(
            PanelExportarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarProveedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaProveedor.addTab("EXPORTAR", PanelExportarProveedorPrincipal);

        ExplorardorImportarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorImportarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelImportarProveedorPrincipalLayout = new javax.swing.GroupLayout(PanelImportarProveedorPrincipal);
        PanelImportarProveedorPrincipal.setLayout(PanelImportarProveedorPrincipalLayout);
        PanelImportarProveedorPrincipalLayout.setHorizontalGroup(
            PanelImportarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarProveedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelImportarProveedorPrincipalLayout.setVerticalGroup(
            PanelImportarProveedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarProveedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaProveedor.addTab("IMPORTAR ", PanelImportarProveedorPrincipal);

        javax.swing.GroupLayout PanelProveedorLayout = new javax.swing.GroupLayout(PanelProveedor);
        PanelProveedor.setLayout(PanelProveedorLayout);
        PanelProveedorLayout.setHorizontalGroup(
            PanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelProveedorLayout.setVerticalGroup(
            PanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaProveedor)
        );

        PanelesTienda.addTab("Proveedores", PanelProveedor);

        TabalaPedido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TabalaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"dfffffffffffffffffffffffffffffffffffffffffffffffg", "dg", "g", "g", "hg", "h", null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CATEGORIA", "SUBCATEGORIA", "PROVEEDOR", "DESCRIPCION"
            }
        ));
        ScrollTablaPedido.setViewportView(TabalaPedido);

        javax.swing.GroupLayout PanelTablaPedidoLayout = new javax.swing.GroupLayout(PanelTablaPedido);
        PanelTablaPedido.setLayout(PanelTablaPedidoLayout);
        PanelTablaPedidoLayout.setHorizontalGroup(
            PanelTablaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        PanelTablaPedidoLayout.setVerticalGroup(
            PanelTablaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        TablaPedido.addTab("VER ", PanelTablaPedido);

        DatoPrecioPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoTiendaPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTiendaPedidoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DatoNombrePedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        DatoCategoriaPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoCategoriaPedidoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DatoCategoriaPedidoInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoCategoriaPedidoInsertarActionPerformed(evt);
            }
        });

        NombrePedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        NombrePedidoInsertar.setText("Nombre");

        DatoSubcategoriaPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoSubcategoriaPedidoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PrecioPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        PrecioPedidoInsertar.setText("Precio");

        CategoriaPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CategoriaPedidoInsertar.setText("ID Categoria");

        SubcategoriaPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        SubcategoriaPedidoInsertar.setText("ID SubCategoria");

        ProveedorPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ProveedorPedidoInsertar.setText("ID Proveedor");

        TiendaPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TiendaPedidoInsertar.setText("ID Tienda");

        DatoProveedorPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoProveedorPedidoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ImagenPedidoInsertar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ImagenPedidoInsertar.setText("IMGENES");

        DatoImagenPedidoInsertar.setColumns(20);
        DatoImagenPedidoInsertar.setRows(5);
        scrollIMG71.setViewportView(DatoImagenPedidoInsertar);

        javax.swing.GroupLayout PanelizqinsertarPedidoLayout = new javax.swing.GroupLayout(PanelizqinsertarPedido);
        PanelizqinsertarPedido.setLayout(PanelizqinsertarPedidoLayout);
        PanelizqinsertarPedidoLayout.setHorizontalGroup(
            PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TiendaPedidoInsertar)
                    .addComponent(ProveedorPedidoInsertar)
                    .addComponent(NombrePedidoInsertar)
                    .addComponent(PrecioPedidoInsertar)
                    .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SubcategoriaPedidoInsertar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CategoriaPedidoInsertar))
                    .addComponent(ImagenPedidoInsertar))
                .addGap(18, 18, 18)
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(DatoNombrePedidoInsertar)
                        .addComponent(DatoPrecioPedidoInsertar)
                        .addComponent(DatoSubcategoriaPedidoInsertar, 0, 289, Short.MAX_VALUE)
                        .addComponent(DatoCategoriaPedidoInsertar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DatoProveedorPedidoInsertar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DatoTiendaPedidoInsertar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollIMG71, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelizqinsertarPedidoLayout.setVerticalGroup(
            PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqinsertarPedidoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombrePedidoInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(NombrePedidoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoPrecioPedidoInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(PrecioPedidoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoCategoriaPedidoInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(CategoriaPedidoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoSubcategoriaPedidoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubcategoriaPedidoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoProveedorPedidoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorPedidoInsertar))
                .addGap(30, 30, 30)
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoTiendaPedidoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiendaPedidoInsertar))
                .addGroup(PanelizqinsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelizqinsertarPedidoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(scrollIMG71, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqinsertarPedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagenPedidoInsertar)
                        .addGap(66, 66, 66))))
        );

        DescripcionProductoInsertar3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DescripcionProductoInsertar3.setText("DESCRIPCION");

        DatoDescripcionProductoInsertar3.setColumns(20);
        DatoDescripcionProductoInsertar3.setRows(5);
        scrollIMG4.setViewportView(DatoDescripcionProductoInsertar3);

        DatoCaracteristicasProductoInsertar3.setColumns(20);
        DatoCaracteristicasProductoInsertar3.setRows(5);
        scrollIMG72.setViewportView(DatoCaracteristicasProductoInsertar3);

        CaracteristicasProductoInsertar3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CaracteristicasProductoInsertar3.setText("CARACTERISTICAS / ESPECIFICACIONES");

        DatoAccesoriosProductoInsertar3.setColumns(20);
        DatoAccesoriosProductoInsertar3.setRows(5);
        scrollIMG73.setViewportView(DatoAccesoriosProductoInsertar3);

        AccesoriosProductoInsertar3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AccesoriosProductoInsertar3.setText("ACCESORIOS");

        javax.swing.GroupLayout PanelderInsertarPedidoLayout = new javax.swing.GroupLayout(PanelderInsertarPedido);
        PanelderInsertarPedido.setLayout(PanelderInsertarPedidoLayout);
        PanelderInsertarPedidoLayout.setHorizontalGroup(
            PanelderInsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarPedidoLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(PanelderInsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollIMG73, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelderInsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollIMG72)
                        .addComponent(CaracteristicasProductoInsertar3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelderInsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollIMG4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addComponent(DescripcionProductoInsertar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(PanelderInsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarPedidoLayout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addComponent(AccesoriosProductoInsertar3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        PanelderInsertarPedidoLayout.setVerticalGroup(
            PanelderInsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderInsertarPedidoLayout.createSequentialGroup()
                .addComponent(DescripcionProductoInsertar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(CaracteristicasProductoInsertar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG72, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(scrollIMG73, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelderInsertarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderInsertarPedidoLayout.createSequentialGroup()
                    .addContainerGap(332, Short.MAX_VALUE)
                    .addComponent(AccesoriosProductoInsertar3)
                    .addGap(126, 126, 126)))
        );

        BotonPedidoInsertar.setText("INSERTAR PRODUCTO");
        BotonPedidoInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidoInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInsertarPedidoPrincipalLayout = new javax.swing.GroupLayout(PanelInsertarPedidoPrincipal);
        PanelInsertarPedidoPrincipal.setLayout(PanelInsertarPedidoPrincipalLayout);
        PanelInsertarPedidoPrincipalLayout.setHorizontalGroup(
            PanelInsertarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarPedidoPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PanelizqinsertarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelderInsertarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInsertarPedidoPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonPedidoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        PanelInsertarPedidoPrincipalLayout.setVerticalGroup(
            PanelInsertarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertarPedidoPrincipalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelInsertarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelizqinsertarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelderInsertarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(BotonPedidoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        TablaPedido.addTab("INSERTAR", PanelInsertarPedidoPrincipal);

        DatoIDProductoEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDProductoEditarProducto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        IDProductoEditarProducto3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDProductoEditarProducto3.setText("ID PRODUCTO");

        DatoPrecioEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoPrecioEditarProducto3.setText("");

        DatoTiendaEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoTiendaEditarProducto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DatoNombreEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoNombreEditarProducto3.setText("");

        DatoCategoriaEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoCategoriaEditarProducto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        NombreEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NombreEditarProducto3.setText("Nombre");

        DatoSubCategoriaEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoSubCategoriaEditarProducto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PrecioEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PrecioEditarProducto3.setText("Precio");

        CategoriaEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CategoriaEditarProducto3.setText("ID Categoria");

        SubCategoriaEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SubCategoriaEditarProducto3.setText("ID SubCategoria");

        ProveedorEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ProveedorEditarProducto3.setText("ID Proveedor");

        TiendaEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TiendaEditarProducto3.setText("ID Tienda");

        DatoProveedorEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoProveedorEditarProducto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ImagenEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ImagenEditarProducto3.setText("IMGANES (SEPERADAS  POR COMAS)");

        DatoImagenEditarProducto3.setColumns(20);
        DatoImagenEditarProducto3.setRows(5);
        scrollIMG74.setViewportView(DatoImagenEditarProducto3);

        javax.swing.GroupLayout PanelizqEditarProducto3Layout = new javax.swing.GroupLayout(PanelizqEditarProducto3);
        PanelizqEditarProducto3.setLayout(PanelizqEditarProducto3Layout);
        PanelizqEditarProducto3Layout.setHorizontalGroup(
            PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarProducto3Layout.createSequentialGroup()
                .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollIMG74, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenEditarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addGroup(PanelizqEditarProducto3Layout.createSequentialGroup()
                        .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TiendaEditarProducto3)
                            .addComponent(ProveedorEditarProducto3)
                            .addComponent(SubCategoriaEditarProducto3)
                            .addComponent(CategoriaEditarProducto3)
                            .addComponent(NombreEditarProducto3)
                            .addComponent(PrecioEditarProducto3))
                        .addGap(18, 18, 18)
                        .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatoProveedorEditarProducto3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatoSubCategoriaEditarProducto3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatoCategoriaEditarProducto3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatoPrecioEditarProducto3)
                            .addComponent(DatoNombreEditarProducto3)
                            .addComponent(DatoTiendaEditarProducto3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        PanelizqEditarProducto3Layout.setVerticalGroup(
            PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqEditarProducto3Layout.createSequentialGroup()
                .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEditarProducto3)
                    .addComponent(DatoNombreEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoPrecioEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioEditarProducto3))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoCategoriaEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaEditarProducto3))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoSubCategoriaEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubCategoriaEditarProducto3))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DatoProveedorEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorEditarProducto3))
                .addGap(30, 30, 30)
                .addGroup(PanelizqEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiendaEditarProducto3)
                    .addComponent(DatoTiendaEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(ImagenEditarProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG74, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        DatoDescripcionEditarProducto3.setColumns(20);
        DatoDescripcionEditarProducto3.setRows(5);
        scrollIMG75.setViewportView(DatoDescripcionEditarProducto3);

        DescripcionEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DescripcionEditarProducto3.setText("DESCRIPCION");

        CaracteristicasEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CaracteristicasEditarProducto3.setText("CARACTERISTICAS / ESPECIFICACIONES");

        DatoCaracteriticasEditarProducto3.setColumns(20);
        DatoCaracteriticasEditarProducto3.setRows(5);
        scrollIMG76.setViewportView(DatoCaracteriticasEditarProducto3);

        AccesoriosEditarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AccesoriosEditarProducto3.setText("ACCESORIOS");

        DatoAccesoriosEditarProducto3.setColumns(20);
        DatoAccesoriosEditarProducto3.setRows(5);
        scrollIMG77.setViewportView(DatoAccesoriosEditarProducto3);

        javax.swing.GroupLayout PanelDerEditarProducto3Layout = new javax.swing.GroupLayout(PanelDerEditarProducto3);
        PanelDerEditarProducto3.setLayout(PanelDerEditarProducto3Layout);
        PanelDerEditarProducto3Layout.setHorizontalGroup(
            PanelDerEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarProducto3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PanelDerEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollIMG76)
                    .addComponent(DescripcionEditarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelDerEditarProducto3Layout.createSequentialGroup()
                        .addGroup(PanelDerEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaracteristicasEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccesoriosEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollIMG77, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollIMG75, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDerEditarProducto3Layout.setVerticalGroup(
            PanelDerEditarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerEditarProducto3Layout.createSequentialGroup()
                .addComponent(DescripcionEditarProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG75, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(AccesoriosEditarProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG77, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(CaracteristicasEditarProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG76, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BotonEditarProducto3.setText("EDITAR PRODUCTO");
        BotonEditarProducto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarProducto3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEditarPedidoPrincipalLayout = new javax.swing.GroupLayout(PanelEditarPedidoPrincipal);
        PanelEditarPedidoPrincipal.setLayout(PanelEditarPedidoPrincipalLayout);
        PanelEditarPedidoPrincipalLayout.setHorizontalGroup(
            PanelEditarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarPedidoPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelEditarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditarPedidoPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqEditarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelDerEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DatoIDProductoEditarProducto3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelEditarPedidoPrincipalLayout.createSequentialGroup()
                        .addComponent(IDProductoEditarProducto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        PanelEditarPedidoPrincipalLayout.setVerticalGroup(
            PanelEditarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarPedidoPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelEditarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDProductoEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDProductoEditarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelEditarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDerEditarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelizqEditarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TablaPedido.addTab("EDITAR ", PanelEditarPedidoPrincipal);

        DatoIDProductoBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DatoIDProductoBorrarProducto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        IDProductoBorrarProducto3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        IDProductoBorrarProducto3.setText("ID PRODUCTO");

        NombreBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NombreBorrarProducto3.setText("Nombre");

        PrecioBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PrecioBorrarProducto3.setText("Precio");

        DatoPrecioBorrarProducto3.setText("Precio");
        DatoPrecioBorrarProducto3.setToolTipText("");
        DatoPrecioBorrarProducto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoNombreBorrarProducto3.setText("Nombre");
        DatoNombreBorrarProducto3.setToolTipText("");
        DatoNombreBorrarProducto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoDescripcionBorrarProducto3.setColumns(20);
        DatoDescripcionBorrarProducto3.setRows(5);
        scrollIMG78.setViewportView(DatoDescripcionBorrarProducto3);

        DescripcionBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DescripcionBorrarProducto3.setText("DESCRIPCION");

        CaracteristicasBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        CaracteristicasBorrarProducto3.setText("CARACTERISTICAS / ESPECIFICACIONES");

        DatoCaracteristicasBorrarProducto3.setColumns(20);
        DatoCaracteristicasBorrarProducto3.setRows(5);
        scrollIMG79.setViewportView(DatoCaracteristicasBorrarProducto3);

        javax.swing.GroupLayout PanelizqBorrarProducto3Layout = new javax.swing.GroupLayout(PanelizqBorrarProducto3);
        PanelizqBorrarProducto3.setLayout(PanelizqBorrarProducto3Layout);
        PanelizqBorrarProducto3Layout.setHorizontalGroup(
            PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelizqBorrarProducto3Layout.createSequentialGroup()
                .addGroup(PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelizqBorrarProducto3Layout.createSequentialGroup()
                        .addComponent(CaracteristicasBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(212, 212, 212))
                    .addGroup(PanelizqBorrarProducto3Layout.createSequentialGroup()
                        .addGroup(PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelizqBorrarProducto3Layout.createSequentialGroup()
                                .addGroup(PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PrecioBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NombreBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DescripcionBorrarProducto3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DatoPrecioBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DatoNombreBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(scrollIMG78, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollIMG79, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelizqBorrarProducto3Layout.setVerticalGroup(
            PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelizqBorrarProducto3Layout.createSequentialGroup()
                .addGroup(PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombreBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreBorrarProducto3))
                .addGap(20, 20, 20)
                .addGroup(PanelizqBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoPrecioBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioBorrarProducto3))
                .addGap(20, 20, 20)
                .addComponent(DescripcionBorrarProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG78, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CaracteristicasBorrarProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIMG79, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DatoCategoriaBorrarProducto3.setText("categoria");
        DatoCategoriaBorrarProducto3.setToolTipText("");
        DatoCategoriaBorrarProducto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SubCategoriaBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SubCategoriaBorrarProducto3.setText("Subcategoria");

        CategoriaBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CategoriaBorrarProducto3.setText("Categoria");

        DatoSubCategoriaBorrarProducto3.setText("Subcategoria");
        DatoSubCategoriaBorrarProducto3.setToolTipText("");
        DatoSubCategoriaBorrarProducto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ImagenBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ImagenBorrarProducto3.setText("IMAGENES");

        ProveedorBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ProveedorBorrarProducto3.setText("Proveedor");

        DatoProveedorBorrarProducto3.setText("Subcategoria");
        DatoProveedorBorrarProducto3.setToolTipText("");
        DatoProveedorBorrarProducto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TiendaBorrarProducto3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TiendaBorrarProducto3.setText("Tienda");

        DatoTiendaBorrarProducto3.setText("Subcategoria");
        DatoTiendaBorrarProducto3.setToolTipText("");
        DatoTiendaBorrarProducto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatoImagenBorrarProducto3.setColumns(20);
        DatoImagenBorrarProducto3.setRows(5);
        scrollIMG80.setViewportView(DatoImagenBorrarProducto3);

        BotonBorrarProducto3.setText("BOTON NUCLEAR");
        BotonBorrarProducto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarProducto3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelderBorrarProducto3Layout = new javax.swing.GroupLayout(PanelderBorrarProducto3);
        PanelderBorrarProducto3.setLayout(PanelderBorrarProducto3Layout);
        PanelderBorrarProducto3Layout.setHorizontalGroup(
            PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelderBorrarProducto3Layout.createSequentialGroup()
                .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollIMG80, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelderBorrarProducto3Layout.createSequentialGroup()
                            .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SubCategoriaBorrarProducto3)
                                .addComponent(CategoriaBorrarProducto3))
                            .addGap(50, 50, 50)
                            .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DatoCategoriaBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DatoSubCategoriaBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelderBorrarProducto3Layout.createSequentialGroup()
                            .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelderBorrarProducto3Layout.createSequentialGroup()
                                    .addComponent(TiendaBorrarProducto3)
                                    .addGap(50, 50, 50))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelderBorrarProducto3Layout.createSequentialGroup()
                                    .addComponent(ProveedorBorrarProducto3)
                                    .addGap(66, 66, 66)))
                            .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelderBorrarProducto3Layout.createSequentialGroup()
                                    .addComponent(DatoProveedorBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4))
                                .addComponent(DatoTiendaBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        PanelderBorrarProducto3Layout.setVerticalGroup(
            PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelderBorrarProducto3Layout.createSequentialGroup()
                .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoCategoriaBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaBorrarProducto3))
                .addGap(30, 30, 30)
                .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoSubCategoriaBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubCategoriaBorrarProducto3))
                .addGap(30, 30, 30)
                .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoProveedorBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorBorrarProducto3))
                .addGap(30, 30, 30)
                .addGroup(PanelderBorrarProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoTiendaBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiendaBorrarProducto3))
                .addGap(39, 39, 39)
                .addComponent(ImagenBorrarProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollIMG80, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(BotonBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout PanelBorrarPedidoPrincipalLayout = new javax.swing.GroupLayout(PanelBorrarPedidoPrincipal);
        PanelBorrarPedidoPrincipal.setLayout(PanelBorrarPedidoPrincipalLayout);
        PanelBorrarPedidoPrincipalLayout.setHorizontalGroup(
            PanelBorrarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarPedidoPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelBorrarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatoIDProductoBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDProductoBorrarProducto3)
                    .addGroup(PanelBorrarPedidoPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelizqBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelderBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBorrarPedidoPrincipalLayout.setVerticalGroup(
            PanelBorrarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrarPedidoPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(IDProductoBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatoIDProductoBorrarProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(PanelBorrarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelizqBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBorrarPedidoPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelderBorrarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        TablaPedido.addTab("BORRAR ", PanelBorrarPedidoPrincipal);

        ExplorardorExportarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorExportarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelExportarPedidoPrincipalLayout = new javax.swing.GroupLayout(PanelExportarPedidoPrincipal);
        PanelExportarPedidoPrincipal.setLayout(PanelExportarPedidoPrincipalLayout);
        PanelExportarPedidoPrincipalLayout.setHorizontalGroup(
            PanelExportarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarPedidoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelExportarPedidoPrincipalLayout.setVerticalGroup(
            PanelExportarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExportarPedidoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorExportarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaPedido.addTab("EXPORTAR", PanelExportarPedidoPrincipal);

        ExplorardorImportarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplorardorImportarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelImportarPedidoPrincipalLayout = new javax.swing.GroupLayout(PanelImportarPedidoPrincipal);
        PanelImportarPedidoPrincipal.setLayout(PanelImportarPedidoPrincipalLayout);
        PanelImportarPedidoPrincipalLayout.setHorizontalGroup(
            PanelImportarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarPedidoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelImportarPedidoPrincipalLayout.setVerticalGroup(
            PanelImportarPedidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImportarPedidoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExplorardorImportarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );

        TablaPedido.addTab("IMPORTAR ", PanelImportarPedidoPrincipal);

        javax.swing.GroupLayout PanelPedidoLayout = new javax.swing.GroupLayout(PanelPedido);
        PanelPedido.setLayout(PanelPedidoLayout);
        PanelPedidoLayout.setHorizontalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaPedido, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelPedidoLayout.setVerticalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaPedido)
        );

        PanelesTienda.addTab("Pedidos", PanelPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelesTienda)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PanelesTienda))
        );

        pack();
    }// </editor-fold>                        

    private void ExplorardorImportarProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        Producto.Import(Ficheros.leer(ExplorardorImportarProducto.getSelectedFile()));
        
    }                                                           

    private void ExplorardorExportarProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        Producto.Export(tienda,Ficheros.escritura(ExplorardorExportarProducto.getSelectedFile()));
    }                                                           

    private void DatoCategoriaProductoInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        DatoSubcategoriaProductoInsertar.setModel(new javax.swing.DefaultComboBoxModel<>(SubCategoria.getId((String) DatoCategoriaProductoInsertar.getSelectedItem())));
    } 

    private void DatoCategoriaEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        DatoSubCategoriaEditarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(SubCategoria.getId((String) DatoCategoriaEditarProducto.getSelectedItem())));
    }

    private void ExplorardorExportarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          

    private void ExplorardorImportarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          

    private void ExplorardorExportarProveedorActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        // TODO add your handling code here:
    }                                                            

    private void ExplorardorImportarProveedorActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        // TODO add your handling code here:
    }                                                            

    private void DatoCategoriaPedidoInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        // TODO add your handling code here:
    }                                                           

    private void ExplorardorExportarPedidoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void ExplorardorImportarPedidoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void BotonProductoInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Producto p = new Producto(DatoNombreProductoInsertar.getText(),Integer.parseInt(DatoPrecioProductoInsertar.getText()),DatoDescripcionProductoInsertar.getText(),DatoCaracteristicasProductoInsertar.getText(),DatoAccesoriosProductoInsertar.getText(),DatoImagenProductoInsertar.getText(),Integer.parseInt((String)DatoCategoriaProductoInsertar.getSelectedItem()),(String)DatoSubcategoriaProductoInsertar.getSelectedItem(),Integer.parseInt((String)DatoProveedorProductoInsertar.getSelectedItem()),Integer.parseInt((String)DatoTiendaProductoInsertar.getSelectedItem()));
        p.Insert(p);
    }    
                                                     
    private void DatoIDProductoEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {  
        String [] a = Producto.getSingle((String) DatoIDProductoEditarProducto.getSelectedItem());                                                  
        DatoNombreEditarProducto.setText(a[1]);
        DatoPrecioEditarProducto.setText(a[2]);
        DatoCategoriaEditarProducto.setSelectedItem(a[3]);
        DatoSubCategoriaEditarProducto.setSelectedItem(a[4]);
        DatoAccesoriosEditarProducto.setText(a[8]);
        DatoImagenEditarProducto.setText(a[7]);
        DatoTiendaEditarProducto.setSelectedItem(Datos.Tienda.getId(tienda)[0]);
        DatoProveedorEditarProducto.setSelectedItem(a[5]);
        DatoDescripcionEditarProducto.setText(a[0]);
        DatoCaracteriticasEditarProducto.setText(a[6]);
    } 
    private void BotonEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        Producto p = new Producto(DatoNombreEditarProducto.getText(),Integer.parseInt(DatoPrecioEditarProducto.getText()),DatoDescripcionEditarProducto.getText(),DatoCaracteriticasEditarProducto.getText(),DatoAccesoriosEditarProducto.getText(),DatoImagenEditarProducto.getText(),Integer.parseInt((String)DatoCategoriaEditarProducto.getSelectedItem()),(String)DatoSubCategoriaEditarProducto.getSelectedItem(),Integer.parseInt((String)DatoProveedorEditarProducto.getSelectedItem()),Integer.parseInt((String)DatoTiendaEditarProducto.getSelectedItem()));
        p.Update(p,(String)DatoIDProductoEditarProducto.getSelectedItem());
    }                                                   

    private void BotonBorrarProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        Producto.Delete((String)DatoIDProductoBorrarProducto.getSelectedItem());
    } 
    
    private void DatoIDProductoBorrarProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        String [] a = Producto.get((String) DatoIDProductoBorrarProducto.getSelectedItem());                                                  
        DatoNombreBorrarProducto.setText(a[1]);
        DatoPrecioBorrarProducto.setText(a[2]+" €");
        DatoCategoriaBorrarProducto.setText(a[3]);
        DatoSubCategoriaBorrarProducto.setText(a[4]);
        DatoImagenBorrarProducto.setText(a[7]);
        DatoTiendaBorrarProducto.setText(tienda);
        DatoProveedorBorrarProducto.setText(a[5]);
        DatoDescripcionBorrarProducto.setText(a[0]);
        DatoCaracteristicasBorrarProducto.setText(a[6]);
    } 
    private void BotonInsertarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void botonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void BotonBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void DatoTelefonoEncargadoProveedorInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                                                       
        // TODO add your handling code here:
    }                                                                      

    private void BotonProveedorInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void BotonEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void BotonBorrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void BotonPedidoInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void BotonEditarProducto3ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void BotonBorrarProducto3ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel AccesoriosEditarProducto;
    private javax.swing.JLabel AccesoriosEditarProducto3;
    private javax.swing.JLabel AccesoriosProductoInsertar;
    private javax.swing.JLabel AccesoriosProductoInsertar3;
    private javax.swing.JButton BotonBorrarCliente;
    private javax.swing.JButton BotonBorrarProducto;
    private javax.swing.JButton BotonBorrarProducto3;
    private javax.swing.JButton BotonBorrarProveedor;
    private javax.swing.JButton BotonEditarProducto;
    private javax.swing.JButton BotonEditarProducto3;
    private javax.swing.JButton BotonEditarProveedor;
    private javax.swing.JButton BotonInsertarCliente;
    private javax.swing.JButton BotonPedidoInsertar;
    private javax.swing.JButton BotonProductoInsertar;
    private javax.swing.JButton BotonProveedorInsertar;
    private javax.swing.JLabel CaracteristicasBorrarProducto;
    private javax.swing.JLabel CaracteristicasBorrarProducto3;
    private javax.swing.JLabel CaracteristicasEditarProducto;
    private javax.swing.JLabel CaracteristicasEditarProducto3;
    private javax.swing.JLabel CaracteristicasProductoInsertar;
    private javax.swing.JLabel CaracteristicasProductoInsertar3;
    private javax.swing.JLabel CategoriaBorrarProducto;
    private javax.swing.JLabel CategoriaBorrarProducto3;
    private javax.swing.JLabel CategoriaEditarProducto;
    private javax.swing.JLabel CategoriaEditarProducto3;
    private javax.swing.JLabel CategoriaPedidoInsertar;
    private javax.swing.JLabel CategoriaProductoInsertar;
    private javax.swing.JLabel DNIBorrarCliente;
    private javax.swing.JLabel DNIClienteInsertar;
    private javax.swing.JLabel DNIEditarCliente;
    private javax.swing.JTextArea DatoAccesoriosEditarProducto;
    private javax.swing.JTextArea DatoAccesoriosEditarProducto3;
    private javax.swing.JTextArea DatoAccesoriosProductoInsertar;
    private javax.swing.JTextArea DatoAccesoriosProductoInsertar3;
    private javax.swing.JTextArea DatoCaracteristicasBorrarProducto;
    private javax.swing.JTextArea DatoCaracteristicasBorrarProducto3;
    private javax.swing.JTextArea DatoCaracteristicasProductoInsertar;
    private javax.swing.JTextArea DatoCaracteristicasProductoInsertar3;
    private javax.swing.JTextArea DatoCaracteriticasEditarProducto;
    private javax.swing.JTextArea DatoCaracteriticasEditarProducto3;
    private javax.swing.JLabel DatoCategoriaBorrarProducto;
    private javax.swing.JLabel DatoCategoriaBorrarProducto3;
    private javax.swing.JComboBox<String> DatoCategoriaEditarProducto;
    private javax.swing.JComboBox<String> DatoCategoriaEditarProducto3;
    private javax.swing.JComboBox<String> DatoCategoriaPedidoInsertar;
    private javax.swing.JComboBox<String> DatoCategoriaProductoInsertar;
    private javax.swing.JLabel DatoDNIBorrarCliente;
    private javax.swing.JTextField DatoDNIClienteInsertar;
    private javax.swing.JTextField DatoDNIEditarCliente;
    private javax.swing.JTextArea DatoDescripcionBorrarProducto;
    private javax.swing.JTextArea DatoDescripcionBorrarProducto3;
    private javax.swing.JTextArea DatoDescripcionEditarProducto;
    private javax.swing.JTextArea DatoDescripcionEditarProducto3;
    private javax.swing.JTextArea DatoDescripcionProductoInsertar;
    private javax.swing.JTextArea DatoDescripcionProductoInsertar3;
    private javax.swing.JTextArea DatoDireccionBorrarCliente;
    private javax.swing.JTextArea DatoDireccionBorrarProveedor;
    private javax.swing.JTextArea DatoDireccionClienteInsertar;
    private javax.swing.JTextArea DatoDireccionEditarCliente;
    private javax.swing.JTextArea DatoDireccionEditarProveedor;
    private javax.swing.JTextArea DatoDireccionProveedorInsertar;
    private javax.swing.JComboBox<String> DatoIDClienteBorrarCliente;
    private javax.swing.JComboBox<String> DatoIDClienteEditarCliente;
    private javax.swing.JComboBox<String> DatoIDProductoBorrarProducto;
    private javax.swing.JComboBox<String> DatoIDProductoBorrarProducto3;
    private javax.swing.JComboBox<String> DatoIDProductoEditarProducto;
    private javax.swing.JComboBox<String> DatoIDProductoEditarProducto3;
    private javax.swing.JComboBox<String> DatoIDProveedorBorrarProveedor;
    private javax.swing.JComboBox<String> DatoIDProveedorEditarProveedor;
    private javax.swing.JTextArea DatoImagenBorrarProducto;
    private javax.swing.JTextArea DatoImagenBorrarProducto3;
    private javax.swing.JTextArea DatoImagenEditarProducto;
    private javax.swing.JTextArea DatoImagenEditarProducto3;
    private javax.swing.JTextArea DatoImagenPedidoInsertar;
    private javax.swing.JTextArea DatoImagenProductoInsertar;
    private javax.swing.JLabel DatoNIFBorrarProveedor;
    private javax.swing.JTextField DatoNIFEditarProveedor;
    private javax.swing.JTextField DatoNIFProveedorInsertar;
    private javax.swing.JLabel DatoNombreBorrarCliente;
    private javax.swing.JLabel DatoNombreBorrarProducto;
    private javax.swing.JLabel DatoNombreBorrarProducto3;
    private javax.swing.JLabel DatoNombreBorrarProveedor;
    private javax.swing.JTextField DatoNombreClienteInsertar;
    private javax.swing.JTextField DatoNombreEditarCliente;
    private javax.swing.JTextField DatoNombreEditarProducto;
    private javax.swing.JTextField DatoNombreEditarProducto3;
    private javax.swing.JTextField DatoNombreEditarProveedor;
    private javax.swing.JLabel DatoNombreEncargadoBorrarProducto4;
    private javax.swing.JComboBox<String> DatoNombreEncargadoEditarProveedor;
    private javax.swing.JComboBox<String> DatoNombreEncargadoProveedorInsertar;
    private javax.swing.JTextField DatoNombrePedidoInsertar;
    private javax.swing.JTextField DatoNombreProductoInsertar;
    private javax.swing.JTextField DatoNombreProveedorInsertar;
    private javax.swing.JLabel DatoPrecioBorrarProducto;
    private javax.swing.JLabel DatoPrecioBorrarProducto3;
    private javax.swing.JTextField DatoPrecioEditarProducto;
    private javax.swing.JTextField DatoPrecioEditarProducto3;
    private javax.swing.JTextField DatoPrecioPedidoInsertar;
    private javax.swing.JTextField DatoPrecioProductoInsertar;
    private javax.swing.JLabel DatoProveedorBorrarProducto;
    private javax.swing.JLabel DatoProveedorBorrarProducto3;
    private javax.swing.JComboBox<String> DatoProveedorEditarProducto;
    private javax.swing.JComboBox<String> DatoProveedorEditarProducto3;
    private javax.swing.JComboBox<String> DatoProveedorPedidoInsertar;
    private javax.swing.JComboBox<String> DatoProveedorProductoInsertar;
    private javax.swing.JLabel DatoRepresentanteBorrarProveedor;
    private javax.swing.JTextField DatoRepresentanteEditarProveedor;
    private javax.swing.JTextField DatoRepresentanteProveedorInsertar;
    private javax.swing.JLabel DatoSubCategoriaBorrarProducto;
    private javax.swing.JLabel DatoSubCategoriaBorrarProducto3;
    private javax.swing.JComboBox<String> DatoSubCategoriaEditarProducto;
    private javax.swing.JComboBox<String> DatoSubCategoriaEditarProducto3;
    private javax.swing.JComboBox<String> DatoSubcategoriaPedidoInsertar;
    private javax.swing.JComboBox<String> DatoSubcategoriaProductoInsertar;
    private javax.swing.JLabel DatoTelefonoBorrarCliente;
    private javax.swing.JLabel DatoTelefonoBorrarProveedor;
    private javax.swing.JTextField DatoTelefonoClienteInsertar;
    private javax.swing.JTextField DatoTelefonoEditarCliente;
    private javax.swing.JTextField DatoTelefonoEditarProveedor;
    private javax.swing.JLabel DatoTelefonoEncargadoBorrarProducto5;
    private javax.swing.JTextField DatoTelefonoEncargadoEditarProveedor;
    private javax.swing.JTextField DatoTelefonoEncargadoProveedorInsertar;
    private javax.swing.JTextField DatoTelefonoProveedorInsertar;
    private javax.swing.JLabel DatoTiendaBorrarProducto;
    private javax.swing.JLabel DatoTiendaBorrarProducto3;
    private javax.swing.JComboBox<String> DatoTiendaClienteInsertar;
    private javax.swing.JComboBox<String> DatoTiendaEditarProducto;
    private javax.swing.JComboBox<String> DatoTiendaEditarProducto3;
    private javax.swing.JComboBox<String> DatoTiendaPedidoInsertar;
    private javax.swing.JComboBox<String> DatoTiendaProductoInsertar;
    private javax.swing.JLabel DescripcionBorrarProducto;
    private javax.swing.JLabel DescripcionBorrarProducto3;
    private javax.swing.JLabel DescripcionEditarProducto;
    private javax.swing.JLabel DescripcionEditarProducto3;
    private javax.swing.JLabel DescripcionProductoInsertar;
    private javax.swing.JLabel DescripcionProductoInsertar3;
    private javax.swing.JLabel DireccionBorrarCliente;
    private javax.swing.JLabel DireccionBorrarProveedor;
    private javax.swing.JLabel DireccionClienteInsertar;
    private javax.swing.JLabel DireccionEditarCliente;
    private javax.swing.JLabel DireccionEditarProveedor;
    private javax.swing.JLabel DireccionProveedorInsertar;
    private javax.swing.JLabel EncargadoProveedorBorrar;
    private javax.swing.JLabel EncargadoProveedorEditar;
    private javax.swing.JLabel EncargadoProveedorInsertar;
    private javax.swing.JFileChooser ExplorardorExportarCliente;
    private javax.swing.JFileChooser ExplorardorExportarPedido;
    private javax.swing.JFileChooser ExplorardorExportarProducto;
    private javax.swing.JFileChooser ExplorardorExportarProveedor;
    private javax.swing.JFileChooser ExplorardorImportarCliente;
    private javax.swing.JFileChooser ExplorardorImportarPedido;
    private javax.swing.JFileChooser ExplorardorImportarProducto;
    private javax.swing.JFileChooser ExplorardorImportarProveedor;
    private javax.swing.JLabel IDClienteBorrarCliente;
    private javax.swing.JLabel IDClienteEditarCliente;
    private javax.swing.JLabel IDProductoBorrarProducto;
    private javax.swing.JLabel IDProductoBorrarProducto3;
    private javax.swing.JLabel IDProductoEditarProducto;
    private javax.swing.JLabel IDProductoEditarProducto3;
    private javax.swing.JLabel IDProveedorBorrarProveedor;
    private javax.swing.JLabel IDProveedorEditarProveedor;
    private javax.swing.JLabel ImagenBorrarProducto;
    private javax.swing.JLabel ImagenBorrarProducto3;
    private javax.swing.JLabel ImagenEditarProducto;
    private javax.swing.JLabel ImagenEditarProducto3;
    private javax.swing.JLabel ImagenPedidoInsertar;
    private javax.swing.JLabel ImagenProductoinsertar;
    private javax.swing.JLabel NIFBorrarProveedor;
    private javax.swing.JLabel NIFEditarProveedor;
    private javax.swing.JLabel NIFProveedorInsertar;
    private javax.swing.JLabel NombreBorrarCliente;
    private javax.swing.JLabel NombreBorrarProducto;
    private javax.swing.JLabel NombreBorrarProducto3;
    private javax.swing.JLabel NombreBorrarProveedor;
    private javax.swing.JLabel NombreClienteInsertar;
    private javax.swing.JLabel NombreEditarCliente;
    private javax.swing.JLabel NombreEditarProducto;
    private javax.swing.JLabel NombreEditarProducto3;
    private javax.swing.JLabel NombreEditarProveedor;
    private javax.swing.JLabel NombreEncargadoBorrarProveedor;
    private javax.swing.JLabel NombreEncargadoEditarProveedor;
    private javax.swing.JLabel NombreEncargadoProveedorInsertar;
    private javax.swing.JLabel NombrePedidoInsertar;
    private javax.swing.JLabel NombreProductoInsertar;
    private javax.swing.JLabel NombreProveedorInsertar;
    private javax.swing.JPanel PanelBorrarClientePrincipal;
    private javax.swing.JPanel PanelBorrarPedidoPrincipal;
    private javax.swing.JPanel PanelBorrarProductoPrincipal;
    private javax.swing.JPanel PanelBorrarProveedorPrincipal;
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JPanel PanelDerEditarCliente;
    private javax.swing.JPanel PanelDerEditarProducto;
    private javax.swing.JPanel PanelDerEditarProducto3;
    private javax.swing.JPanel PanelDerEditarProveedor;
    private javax.swing.JPanel PanelEditarClientePrincipal;
    private javax.swing.JPanel PanelEditarPedidoPrincipal;
    private javax.swing.JPanel PanelEditarProductoPrincipal;
    private javax.swing.JPanel PanelEditarProveedorPrincipal;
    private javax.swing.JPanel PanelExportarClientePrincipal;
    private javax.swing.JPanel PanelExportarPedidoPrincipal;
    private javax.swing.JPanel PanelExportarProductoPrincipal;
    private javax.swing.JPanel PanelExportarProveedorPrincipal;
    private javax.swing.JPanel PanelImportarClientePrincipal;
    private javax.swing.JPanel PanelImportarPedidoPrincipal;
    private javax.swing.JPanel PanelImportarProductoPrincipal;
    private javax.swing.JPanel PanelImportarProveedorPrincipal;
    private javax.swing.JPanel PanelInsertarClientePrincipal;
    private javax.swing.JPanel PanelInsertarPedidoPrincipal;
    private javax.swing.JPanel PanelInsertarProductoPrincipal;
    private javax.swing.JPanel PanelInsertarProveedorPrincipal;
    private javax.swing.JPanel PanelPedido;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JPanel PanelProveedor;
    private javax.swing.JPanel PanelTablaCliente;
    private javax.swing.JPanel PanelTablaPedido;
    private javax.swing.JPanel PanelTablaProducto;
    private javax.swing.JPanel PanelTablaProveedor;
    private javax.swing.JPanel PanelderBorrarCliente;
    private javax.swing.JPanel PanelderBorrarProducto;
    private javax.swing.JPanel PanelderBorrarProducto3;
    private javax.swing.JPanel PanelderBorrarProveedor;
    private javax.swing.JPanel PanelderInsertarCliente;
    private javax.swing.JPanel PanelderInsertarPedido;
    private javax.swing.JPanel PanelderInsertarProducto;
    private javax.swing.JPanel PanelderInsertarProveedor;
    private javax.swing.JTabbedPane PanelesTienda;
    private javax.swing.JPanel PanelizqBorrarCliente;
    private javax.swing.JPanel PanelizqBorrarProducto;
    private javax.swing.JPanel PanelizqBorrarProducto3;
    private javax.swing.JPanel PanelizqBorrarProveedor;
    private javax.swing.JPanel PanelizqEditarCliente;
    private javax.swing.JPanel PanelizqEditarProducto;
    private javax.swing.JPanel PanelizqEditarProducto3;
    private javax.swing.JPanel PanelizqEditarProveedor;
    private javax.swing.JPanel PanelizqinsertarCliente;
    private javax.swing.JPanel PanelizqinsertarPedido;
    private javax.swing.JPanel PanelizqinsertarProducto;
    private javax.swing.JPanel PanelizqinsertarProveedor;
    private javax.swing.JLabel PrecioBorrarProducto;
    private javax.swing.JLabel PrecioBorrarProducto3;
    private javax.swing.JLabel PrecioEditarProducto;
    private javax.swing.JLabel PrecioEditarProducto3;
    private javax.swing.JLabel PrecioPedidoInsertar;
    private javax.swing.JLabel PrecioProductoInsertar;
    private javax.swing.JLabel ProveedorBorrarProducto;
    private javax.swing.JLabel ProveedorBorrarProducto3;
    private javax.swing.JLabel ProveedorEditarProducto;
    private javax.swing.JLabel ProveedorEditarProducto3;
    private javax.swing.JLabel ProveedorPedidoInsertar;
    private javax.swing.JLabel ProveedorProductoinsertar;
    private javax.swing.JLabel RepresentanteBorrarProveedor;
    private javax.swing.JLabel RepresentanteEditarProveedor;
    private javax.swing.JLabel RepresentanteProveedorInsertar;
    private javax.swing.JScrollPane ScrollTablaCliente;
    private javax.swing.JScrollPane ScrollTablaPedido;
    private javax.swing.JScrollPane ScrollTablaProducto;
    private javax.swing.JScrollPane ScrollTablaProveedor;
    private javax.swing.JLabel SubCategoriaBorrarProducto;
    private javax.swing.JLabel SubCategoriaBorrarProducto3;
    private javax.swing.JLabel SubCategoriaEditarProducto;
    private javax.swing.JLabel SubCategoriaEditarProducto3;
    private javax.swing.JLabel SubcategoriaPedidoInsertar;
    private javax.swing.JLabel SubcategoriaProductoinsertar;
    private javax.swing.JTable TabalaPedido;
    private javax.swing.JTable TabalaProducto;
    private javax.swing.JTable TabalaProveeodor;
    private javax.swing.JTabbedPane TablaCliente;
    private javax.swing.JTable TablaDatoCliente;
    private javax.swing.JTabbedPane TablaPedido;
    private javax.swing.JTabbedPane TablaProducto;
    private javax.swing.JTabbedPane TablaProveedor;
    private javax.swing.JLabel TelefonoBorrarCliente;
    private javax.swing.JLabel TelefonoBorrarProveedor;
    private javax.swing.JLabel TelefonoClienteInsertar;
    private javax.swing.JLabel TelefonoEditarCliente;
    private javax.swing.JLabel TelefonoEditarProveedor;
    private javax.swing.JLabel TelefonoEncargadoBorrarProveedor;
    private javax.swing.JLabel TelefonoEncargadoEditarProveedor;
    private javax.swing.JLabel TelefonoEncargadoProveedorInsertar;
    private javax.swing.JLabel TelefonoProveedorInsertar;
    private javax.swing.JLabel Tienda;
    private javax.swing.JLabel TiendaBorrarProducto;
    private javax.swing.JLabel TiendaBorrarProducto3;
    private javax.swing.JLabel TiendaClienteInsertar;
    private javax.swing.JLabel TiendaEditarProducto;
    private javax.swing.JLabel TiendaEditarProducto3;
    private javax.swing.JLabel TiendaPedidoInsertar;
    private javax.swing.JLabel TiendaProductoinsertar;
    private javax.swing.JButton botonEditarCliente;
    private javax.swing.JScrollPane scrollIMG1;
    private javax.swing.JScrollPane scrollIMG10;
    private javax.swing.JScrollPane scrollIMG11;
    private javax.swing.JScrollPane scrollIMG12;
    private javax.swing.JScrollPane scrollIMG13;
    private javax.swing.JScrollPane scrollIMG14;
    private javax.swing.JScrollPane scrollIMG15;
    private javax.swing.JScrollPane scrollIMG16;
    private javax.swing.JScrollPane scrollIMG17;
    private javax.swing.JScrollPane scrollIMG2;
    private javax.swing.JScrollPane scrollIMG3;
    private javax.swing.JScrollPane scrollIMG4;
    private javax.swing.JScrollPane scrollIMG55;
    private javax.swing.JScrollPane scrollIMG58;
    private javax.swing.JScrollPane scrollIMG65;
    private javax.swing.JScrollPane scrollIMG68;
    private javax.swing.JScrollPane scrollIMG71;
    private javax.swing.JScrollPane scrollIMG72;
    private javax.swing.JScrollPane scrollIMG73;
    private javax.swing.JScrollPane scrollIMG74;
    private javax.swing.JScrollPane scrollIMG75;
    private javax.swing.JScrollPane scrollIMG76;
    private javax.swing.JScrollPane scrollIMG77;
    private javax.swing.JScrollPane scrollIMG78;
    private javax.swing.JScrollPane scrollIMG79;
    private javax.swing.JScrollPane scrollIMG8;
    private javax.swing.JScrollPane scrollIMG80;
    private javax.swing.JScrollPane scrollIMG9;
    // End of variables declaration                   
}

