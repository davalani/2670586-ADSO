import javax.swing.*;
import java.awt.*;

public class Factura extends JFrame{
    
    JLabel datosCliente;
    JLabel cedula_cliente;
    JTextField campo_cedula_cliente;
    JButton btn_cliente;
    JLabel etq_nombres_cliente;
    JLabel nombres_cliente;
    JLabel etq_direccion_cliente;
    JLabel direccion_cliente;
    JLabel datosVendedor; 
    JLabel cedula_vendedor;
    JTextField campo_cedula_vendedor;
    JButton btn_vendedor;
    JLabel etq_nombres_vendedor;
    JLabel nombres_vendedor;
    JLabel lista_productos_facturados;
    JLabel id_producto;
    JLabel nombre_producto;
    JLabel cant_producto;
    JTextField campo_id_producto;
    JTextField campo_nom_producto;
    JTextField campo_cant_producto;
    JButton btn_producto;
    JLabel campo_lista_productos;
    JLabel total;


    public Factura (){
        initComponents();
    }

    public void initComponents (){
        setSize(550,690);
        setTitle("Factura");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel contenedor = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        contenedor.setLayout(layout);
        contenedor.setBackground( new Color(240,240,240));
        contenedor.setBorder(BorderFactory.createEmptyBorder(5,20,20,20));
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("img/factura.png")));

        GridBagConstraints restriccion = new GridBagConstraints();

        datosCliente = new JLabel();
        datosCliente.setText("DATOS CLIENTE: ");
        datosCliente.setFont(new Font("Arial", Font.BOLD, 20));
        datosCliente.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridwidth=4;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.insets = new Insets(1, 1, 1, 1);
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(datosCliente,restriccion);

        cedula_cliente = new JLabel();
        cedula_cliente.setText("CEDULA: ");
        cedula_cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        cedula_cliente.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy=1;
        restriccion.gridx=0;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(cedula_cliente,restriccion);

        campo_cedula_cliente = new JTextField();
        campo_cedula_cliente.setColumns(15);
        campo_cedula_cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        campo_cedula_cliente.setMargin(new Insets(5, 5, 5, 5));
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridwidth=2;
        restriccion.gridheight=1;
        restriccion.weighty=0;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(campo_cedula_cliente, restriccion);

        btn_cliente = new JButton();
        btn_cliente.setText("BUSCAR");
        btn_cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        btn_cliente.setBackground(new Color(30,155,250));
        btn_cliente.setMargin(new Insets(5, 5, 5, 0));
        restriccion.gridy=1;
        restriccion.gridx=3;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.insets = new Insets(0, 10, 0, 0);
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(btn_cliente,restriccion);  
        restriccion.insets = new Insets(0, 0, 0, 0);

        etq_nombres_cliente = new JLabel();
        etq_nombres_cliente.setText("NOMBRES: ");
        etq_nombres_cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        etq_nombres_cliente.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombres_cliente,restriccion);

        nombres_cliente = new JLabel();
        nombres_cliente.setText("----------");
        nombres_cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        nombres_cliente.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(nombres_cliente,restriccion);

        etq_direccion_cliente = new JLabel();
        etq_direccion_cliente.setText("DIRECCION: ");
        etq_direccion_cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        etq_direccion_cliente.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 3;
        restriccion.gridx = 0; 
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_direccion_cliente,restriccion);

        direccion_cliente = new JLabel();
        direccion_cliente.setText("----------");
        direccion_cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        direccion_cliente.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 3;
        restriccion.gridx = 1; 
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(direccion_cliente,restriccion);


        datosVendedor = new JLabel();
        datosVendedor.setText("DATOS VENDEDOR: ");
        datosVendedor.setFont(new Font("Arial", Font.BOLD, 20));
        datosVendedor.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridwidth=4;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(datosVendedor,restriccion);

        cedula_vendedor = new JLabel();
        cedula_vendedor.setText("CEDULA: ");
        cedula_vendedor.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy=5;
        restriccion.gridx=0;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(cedula_vendedor,restriccion);

        campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(15);
        campo_cedula_vendedor.setMargin(new Insets(5, 5, 5, 5));
        campo_cedula_vendedor.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        restriccion.gridy=5;
        restriccion.gridx=1;
        restriccion.gridwidth=2;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(campo_cedula_vendedor, restriccion);

        btn_vendedor = new JButton();
        btn_vendedor.setText("BUSCAR");
        btn_vendedor.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        btn_vendedor.setBackground(new Color(30,155,250));
        btn_vendedor.setMargin(new Insets(5, 5, 5, 0));
        restriccion.gridy=5;
        restriccion.gridx=3;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.insets = new Insets(0, 10, 0, 0);
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(btn_vendedor,restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);

        etq_nombres_vendedor = new JLabel();
        etq_nombres_vendedor.setText("NOMBRES: ");
        etq_nombres_vendedor.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        etq_nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombres_vendedor,restriccion);

        nombres_vendedor = new JLabel();
        nombres_vendedor.setText("-----------");
        nombres_vendedor.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 6;
        restriccion.gridx = 1;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(nombres_vendedor,restriccion);

        lista_productos_facturados = new JLabel();
        lista_productos_facturados.setText("LISTA PRODUCTOS FACTURADOS: ");
        lista_productos_facturados.setFont(new Font("Arial", Font.BOLD, 20));
        lista_productos_facturados.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy = 7;
        restriccion.gridx = 0;
        restriccion.gridwidth=4;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(lista_productos_facturados,restriccion);

        id_producto = new JLabel();
        id_producto.setText("ID");
        id_producto.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        id_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 8;
        restriccion.gridx = 0;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(id_producto,restriccion);

        nombre_producto = new JLabel();
        nombre_producto.setText("NOMBRE");
        nombre_producto.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));;
        nombre_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 8;
        restriccion.gridx = 1;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(nombre_producto,restriccion);

        cant_producto = new JLabel();
        cant_producto.setText("CANT.");
        cant_producto.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        cant_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 8;
        restriccion.gridx = 2;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(cant_producto,restriccion);

        campo_id_producto = new JTextField();
        campo_id_producto.setColumns(8);
        campo_id_producto.setMargin(new Insets(5, 5, 5, 5));
        campo_id_producto.setFont(new Font("Arial", Font.BOLD, 12));
        restriccion.gridy=9;
        restriccion.gridx=0;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(campo_id_producto, restriccion);

        campo_nom_producto = new JTextField();
        campo_nom_producto.setColumns(15);
        campo_nom_producto.setMargin(new Insets(5, 5, 5, 5));
        campo_nom_producto.setFont(new Font("Arial", Font.BOLD, 12));
        restriccion.gridy=9;
        restriccion.gridx=1;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(campo_nom_producto, restriccion);


        campo_cant_producto = new JTextField();
        campo_cant_producto.setColumns(15);
        campo_cant_producto.setMargin(new Insets(5, 5, 5, 5));
        campo_cant_producto.setFont(new Font("Arial", Font.BOLD, 12));
        restriccion.gridy=9;
        restriccion.gridx=2;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(campo_cant_producto, restriccion);

       
        btn_producto = new JButton();
        btn_producto.setText("ADD");
        btn_producto.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        btn_producto.setBackground(new Color(30,155,250));
        btn_producto.setMargin(new Insets(5, 5, 5, 5));
        restriccion.gridy=9;
        restriccion.gridx=3;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.insets = new Insets(0, 10, 0, 0);
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(btn_producto,restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);

        campo_lista_productos = new JLabel();
        campo_lista_productos.setText("-----------");
        campo_lista_productos.setFont(new Font("Arial", Font.BOLD, 20));
        campo_lista_productos.setOpaque(true);
        campo_lista_productos.setBackground(Color.white);
        campo_lista_productos.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 10;
        restriccion.gridx = 0;
        restriccion.gridwidth=4;
        restriccion.gridheight=3;
        restriccion.weighty=10;
        restriccion.weightx=80;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_lista_productos,restriccion);

        total = new JLabel();
        total.setText("Total: $0");
        total.setOpaque(true);
        total.setBackground(Color.white);
        total.setFont(new Font("Arial", Font.BOLD, 20));
        total.setHorizontalAlignment(JLabel.RIGHT);
        restriccion.gridy = 14;
        restriccion.gridx = 0;
        restriccion.gridwidth=4;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor.add(total,restriccion);

        
        this.add(contenedor);
        revalidate();
    }
}
